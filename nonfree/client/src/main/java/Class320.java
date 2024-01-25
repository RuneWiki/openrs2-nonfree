import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class320 {

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "[I")
	private final int[] anIntArray539;

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V")
	public Class320(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray87 = arg0;
		this.anIntArray539 = new int[local6];
		this.anIntArray541 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray539[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(80) int local80;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local20[local64];
						if (local70 != local43) {
							break;
						}
						local80 = 0x1 << 32 - local64;
						if ((local70 & local80) != 0) {
							local20[local64] = local20[local64 - 1];
							break;
						}
						local20[local64] = local70 | local80;
					}
					local58 = local43 | local39;
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local20[local64] == local43) {
						local20[local64] = local58;
					}
				}
				local70 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local80;
					if ((local151 & local43) == 0) {
						local70++;
					} else {
						if (this.anIntArray541[local70] == 0) {
							this.anIntArray541[local70] = local22;
						}
						local70 = this.anIntArray541[local70];
					}
					if (local70 >= this.anIntArray541.length) {
						@Pc(188) int[] local188 = new int[this.anIntArray541.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray541.length; local190++) {
							local188[local190] = this.anIntArray541[local190];
						}
						this.anIntArray541 = local188;
					}
				}
				if (local22 <= local70) {
					local22 = local70 + 1;
				}
				this.anIntArray541[local70] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIII[B[B)I")
	public int method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg1) {
			@Pc(29) int local29 = arg4[arg1] & 0xFF;
			@Pc(34) int local34 = this.anIntArray539[local29];
			@Pc(39) byte local39 = this.aByteArray87[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local15 >> 3;
			@Pc(60) int local60 = local15 & 0x7;
			local7 &= -local60 >> 31;
			@Pc(78) int local78 = (local60 + local39 - 1 >> 3) + local56;
			@Pc(79) int local79 = local60 + 24;
			arg3[local56] = (byte) (local7 |= local34 >>> local79);
			if (local78 > local56) {
				local60 = local79 - 8;
				local56++;
				arg3[local56] = (byte) (local7 = local34 >>> local60);
				if (local56 < local78) {
					local60 -= 8;
					local56++;
					arg3[local56] = (byte) (local7 = local34 >>> local60);
					if (local78 > local56) {
						local60 -= 8;
						local56++;
						arg3[local56] = (byte) (local7 = local34 >>> local60);
						if (local56 < local78) {
							local56++;
							local60 -= 8;
							arg3[local56] = (byte) (local7 = local34 << -local60);
						}
					}
				}
			}
			local15 += local39;
			arg1++;
		}
		return (local15 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([BI[BIIB)I")
	public int method6529(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local48;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local87;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local129;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local161;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local193;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local228;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local263;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray541[local23];
			}
			@Pc(298) int local298;
			if ((local298 = this.anIntArray541[local23]) < 0) {
				arg2[arg3++] = (byte) ~local298;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}
}
