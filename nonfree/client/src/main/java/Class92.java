import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class92 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
	public Class92(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray447 = new int[8];
		this.anIntArray448 = new int[local6];
		this.aByteArray62 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray448[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(84) int local84;
				if ((local43 & local39) == 0) {
					local58 = local43 | local39;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local20[local68];
						if (local43 != local74) {
							break;
						}
						local84 = 0x1 << 32 - local68;
						if ((local74 & local84) != 0) {
							local20[local68] = local20[local68 - 1];
							break;
						}
						local20[local68] = local84 | local74;
					}
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local20[local68] == local43) {
						local20[local68] = local58;
					}
				}
				local74 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local84;
					if ((local146 & local43) == 0) {
						local74++;
					} else {
						if (this.anIntArray447[local74] == 0) {
							this.anIntArray447[local74] = local22;
						}
						local74 = this.anIntArray447[local74];
					}
					if (this.anIntArray447.length <= local74) {
						@Pc(190) int[] local190 = new int[this.anIntArray447.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray447.length; local192++) {
							local190[local192] = this.anIntArray447[local192];
						}
						this.anIntArray447 = local190;
					}
				}
				if (local22 <= local74) {
					local22 = local74 + 1;
				}
				this.anIntArray447[local74] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII[BZ)I")
	public int method3009(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg1 << 3;
		while (arg3 < local17) {
			@Pc(29) int local29 = arg0[arg3] & 0xFF;
			@Pc(34) byte local34 = this.aByteArray62[local29];
			@Pc(39) int local39 = this.anIntArray448[local29];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local21 >> 3;
			@Pc(60) int local60 = local21 & 0x7;
			local21 += local34;
			@Pc(76) int local76 = local56 + (local60 + local34 - 1 >> 3);
			local13 &= -local60 >> 31;
			@Pc(84) int local84 = local60 + 24;
			arg4[local56] = (byte) (local13 |= local39 >>> local84);
			if (local76 > local56) {
				local56++;
				local60 = local84 - 8;
				arg4[local56] = (byte) (local13 = local39 >>> local60);
				if (local76 > local56) {
					local60 -= 8;
					local56++;
					arg4[local56] = (byte) (local13 = local39 >>> local60);
					if (local76 > local56) {
						local56++;
						local60 -= 8;
						arg4[local56] = (byte) (local13 = local39 >>> local60);
						if (local56 < local76) {
							local60 -= 8;
							local56++;
							arg4[local56] = (byte) (local13 = local39 << -local60);
						}
					}
				}
			}
			arg3++;
		}
		return (local21 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[B[BII)I")
	public int method3010(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local48;
				if (local23 <= arg0) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local83;
				if (local23 <= arg0) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local118;
				if (local23 <= arg0) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local153;
				if (arg0 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local188;
				if (arg0 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(220) int local220;
			if ((local220 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local220;
				if (arg0 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local256;
				if (arg0 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray447[local19];
			}
			@Pc(298) int local298;
			if ((local298 = this.anIntArray447[local19]) < 0) {
				arg1[arg0++] = (byte) ~local298;
				if (local23 <= arg0) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}
}
