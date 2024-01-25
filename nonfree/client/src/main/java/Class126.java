import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class126 {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
	private final int[] anIntArray348;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
	public Class126(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray348 = new int[local6];
		this.aByteArray49 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray346 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray348[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(92) int local92;
				if ((local42 & local46) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local16[local70];
						if (local46 != local76) {
							break;
						}
						local92 = 0x1 << 32 - local70;
						if ((local76 & local92) != 0) {
							local16[local70] = local16[local70 - 1];
							break;
						}
						local16[local70] = local92 | local76;
					}
					local64 = local42 | local46;
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local16[local70] == local46) {
						local16[local70] = local64;
					}
				}
				local76 = 0;
				for (local92 = 0; local92 < local30; local92++) {
					@Pc(166) int local166 = Integer.MIN_VALUE >>> local92;
					if ((local46 & local166) == 0) {
						local76++;
					} else {
						if (this.anIntArray346[local76] == 0) {
							this.anIntArray346[local76] = local22;
						}
						local76 = this.anIntArray346[local76];
					}
					if (this.anIntArray346.length <= local76) {
						@Pc(207) int[] local207 = new int[this.anIntArray346.length * 2];
						for (@Pc(209) int local209 = 0; local209 < this.anIntArray346.length; local209++) {
							local207[local209] = this.anIntArray346[local209];
						}
						this.anIntArray346 = local207;
					}
				}
				this.anIntArray346[local76] = ~local24;
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIII[B)I")
	public int method3430(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(20) int local20 = arg1;
		while (true) {
			@Pc(36) byte local36 = arg0[local20];
			if (local36 < 0) {
				local14 = this.anIntArray346[local14];
			} else {
				local14++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local52;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local84;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local119;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local154;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local192;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local231;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local270;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray346[local14];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray346[local14]) < 0) {
				arg4[arg2++] = (byte) ~local302;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ[B[BI)I")
	public int method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg4 << 3;
		@Pc(13) int local13 = arg0;
		while (local13 > arg1) {
			@Pc(24) int local24 = arg3[arg1] & 0xFF;
			@Pc(29) int local29 = this.anIntArray348[local24];
			@Pc(34) byte local34 = this.aByteArray49[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local9 >> 3;
			@Pc(58) int local58 = local9 & 0x7;
			local5 &= -local58 >> 31;
			@Pc(76) int local76 = local54 + (local58 + local34 - 1 >> 3);
			local9 += local34;
			@Pc(81) int local81 = local58 + 24;
			arg2[local54] = (byte) (local5 |= local29 >>> local81);
			if (local54 < local76) {
				local58 = local81 - 8;
				local54++;
				arg2[local54] = (byte) (local5 = local29 >>> local58);
				if (local76 > local54) {
					local54++;
					local58 -= 8;
					arg2[local54] = (byte) (local5 = local29 >>> local58);
					if (local54 < local76) {
						local54++;
						local58 -= 8;
						arg2[local54] = (byte) (local5 = local29 >>> local58);
						if (local76 > local54) {
							local54++;
							local58 -= 8;
							arg2[local54] = (byte) (local5 = local29 << -local58);
						}
					}
				}
			}
			arg1++;
		}
		return (local9 + 7 >> 3) - arg4;
	}
}
