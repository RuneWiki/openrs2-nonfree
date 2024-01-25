import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class332 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "[I")
	private final int[] anIntArray587;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "([B)V")
	public Class332(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray98 = arg0;
		this.anIntArray587 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray588 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray587[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local42 & local46) == 0) {
					local61 = local46 | local42;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local16[local71];
						if (local77 != local46) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local77 & local87) != 0) {
							local16[local71] = local16[local71 - 1];
							break;
						}
						local16[local71] = local77 | local87;
					}
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local46 == local16[local71]) {
						local16[local71] = local61;
					}
				}
				local77 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local87;
					if ((local46 & local148) == 0) {
						local77++;
					} else {
						if (this.anIntArray588[local77] == 0) {
							this.anIntArray588[local77] = local22;
						}
						local77 = this.anIntArray588[local77];
					}
					if (this.anIntArray588.length <= local77) {
						@Pc(189) int[] local189 = new int[this.anIntArray588.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray588.length; local191++) {
							local189[local191] = this.anIntArray588[local191];
						}
						this.anIntArray588 = local189;
					}
				}
				this.anIntArray588[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "([BIII[BI)I")
	public int method7672(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(13) int local13 = arg3;
		while (arg1 < local13) {
			@Pc(24) int local24 = arg4[arg1] & 0xFF;
			@Pc(29) int local29 = this.anIntArray587[local24];
			@Pc(34) byte local34 = this.aByteArray98[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local9 >> 3;
			@Pc(58) int local58 = local9 & 0x7;
			local5 &= -local58 >> 31;
			@Pc(75) int local75 = local54 + (local34 + local58 - 1 >> 3);
			local9 += local34;
			@Pc(80) int local80 = local58 + 24;
			arg0[local54] = (byte) (local5 |= local29 >>> local80);
			if (local75 > local54) {
				local58 = local80 - 8;
				local54++;
				arg0[local54] = (byte) (local5 = local29 >>> local58);
				if (local54 < local75) {
					local58 -= 8;
					local54++;
					arg0[local54] = (byte) (local5 = local29 >>> local58);
					if (local75 > local54) {
						local54++;
						local58 -= 8;
						arg0[local54] = (byte) (local5 = local29 >>> local58);
						if (local75 > local54) {
							local58 -= 8;
							local54++;
							arg0[local54] = (byte) (local5 = local29 << -local58);
						}
					}
				}
			}
			arg1++;
		}
		return (local9 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[BI[BIZ)I")
	public int method7673(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(30) int local30 = arg2;
		@Pc(32) int local32 = arg4;
		while (true) {
			@Pc(36) byte local36 = arg3[local32];
			if (local36 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(55) int local55;
			if ((local55 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local55;
				if (local30 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(94) int local94;
			if ((local94 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local94;
				if (arg0 >= local30) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(133) int local133;
			if ((local133 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local133;
				if (local30 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(168) int local168;
			if ((local168 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local168;
				if (arg0 >= local30) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local203;
				if (local30 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(241) int local241;
			if ((local241 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local241;
				if (local30 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local279;
				if (arg0 >= local30) {
					break;
				}
				local14 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray588[local14];
			}
			@Pc(317) int local317;
			if ((local317 = this.anIntArray588[local14]) < 0) {
				arg1[arg0++] = (byte) ~local317;
				if (arg0 >= local30) {
					break;
				}
				local14 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg4;
	}
}
