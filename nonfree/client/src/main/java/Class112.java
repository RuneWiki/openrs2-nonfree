import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class112 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "[I")
	private final int[] anIntArray261;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "([B)V")
	public Class112(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray46 = arg0;
		this.anIntArray261 = new int[local6];
		this.anIntArray262 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray261[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(83) int local83;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local20[local64];
						if (local43 != local70) {
							break;
						}
						local83 = 0x1 << 32 - local64;
						if ((local70 & local83) != 0) {
							local20[local64] = local20[local64 - 1];
							break;
						}
						local20[local64] = local83 | local70;
					}
					local58 = local39 | local43;
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local43 == local20[local64]) {
						local20[local64] = local58;
					}
				}
				local70 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local83;
					if ((local152 & local43) == 0) {
						local70++;
					} else {
						if (this.anIntArray262[local70] == 0) {
							this.anIntArray262[local70] = local22;
						}
						local70 = this.anIntArray262[local70];
					}
					if (this.anIntArray262.length <= local70) {
						@Pc(190) int[] local190 = new int[this.anIntArray262.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray262.length; local192++) {
							local190[local192] = this.anIntArray262[local192];
						}
						this.anIntArray262 = local190;
					}
				}
				this.anIntArray262[local70] = ~local24;
				if (local22 <= local70) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([B[BIIII)I")
	public int method2390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 < 0) {
				local15 = this.anIntArray262[local15];
			} else {
				local15++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local37;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local76;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(112) int local112;
			if ((local112 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local112;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local151;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(183) int local183;
			if ((local183 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local183;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(222) int local222;
			if ((local222 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local222;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local257;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray262[local15];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray262[local15]) < 0) {
				arg1[arg3++] = (byte) ~local292;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB[B[BI)I")
	public int method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg4 << 3;
		while (arg0 < local11) {
			@Pc(31) int local31 = arg3[arg0] & 0xFF;
			@Pc(36) int local36 = this.anIntArray261[local31];
			@Pc(41) byte local41 = this.aByteArray46[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local15 >> 3;
			@Pc(65) int local65 = local15 & 0x7;
			local7 &= -local65 >> 31;
			@Pc(82) int local82 = (local41 + local65 - 1 >> 3) + local61;
			@Pc(83) int local83 = local65 + 24;
			arg2[local61] = (byte) (local7 |= local36 >>> local83);
			if (local82 > local61) {
				local61++;
				local65 = local83 - 8;
				arg2[local61] = (byte) (local7 = local36 >>> local65);
				if (local61 < local82) {
					local65 -= 8;
					local61++;
					arg2[local61] = (byte) (local7 = local36 >>> local65);
					if (local82 > local61) {
						local61++;
						local65 -= 8;
						arg2[local61] = (byte) (local7 = local36 >>> local65);
						if (local82 > local61) {
							local61++;
							local65 -= 8;
							arg2[local61] = (byte) (local7 = local36 << -local65);
						}
					}
				}
			}
			local15 += local41;
			arg0++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}
