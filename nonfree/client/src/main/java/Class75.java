import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class75 {

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
	private final int[] anIntArray397;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V")
	public Class75(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray397 = new int[local6];
		this.aByteArray46 = arg0;
		this.anIntArray396 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray397[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(90) int local90;
				if ((local46 & local42) == 0) {
					local61 = local42 | local46;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local46) {
							break;
						}
						local90 = 0x1 << 32 - local71;
						if ((local77 & local90) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local77 | local90;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local46 == local20[local71]) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local90;
					if ((local46 & local153) == 0) {
						local77++;
					} else {
						if (this.anIntArray396[local77] == 0) {
							this.anIntArray396[local77] = local22;
						}
						local77 = this.anIntArray396[local77];
					}
					if (local77 >= this.anIntArray396.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray396.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray396.length; local199++) {
							local197[local199] = this.anIntArray396[local199];
						}
						this.anIntArray396 = local197;
					}
				}
				this.anIntArray396[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[B[BII)I")
	public int method2515(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg3 << 3;
		while (arg4 < local10) {
			@Pc(28) int local28 = arg2[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray397[local28];
			@Pc(38) byte local38 = this.aByteArray46[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 & 0x7;
			@Pc(62) int local62 = local20 >> 3;
			local20 += local38;
			local16 &= -local58 >> 31;
			@Pc(84) int local84 = (local58 + local38 - 1 >> 3) + local62;
			@Pc(85) int local85 = local58 + 24;
			arg1[local62] = (byte) (local16 |= local33 >>> local85);
			if (local84 > local62) {
				local58 = local85 - 8;
				local62++;
				arg1[local62] = (byte) (local16 = local33 >>> local58);
				if (local62 < local84) {
					local62++;
					local58 -= 8;
					arg1[local62] = (byte) (local16 = local33 >>> local58);
					if (local84 > local62) {
						local58 -= 8;
						local62++;
						arg1[local62] = (byte) (local16 = local33 >>> local58);
						if (local84 > local62) {
							local58 -= 8;
							local62++;
							arg1[local62] = (byte) (local16 = local33 << -local58);
						}
					}
				}
			}
			arg4++;
		}
		return (local20 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[B[B)I")
	public int method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local18 = this.anIntArray396[local18];
			} else {
				local18++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local48;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local87;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local129;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local164;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local203;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(241) int local241;
			if ((local241 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local241;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(280) int local280;
			if ((local280 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local280;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray396[local18];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray396[local18]) < 0) {
				arg3[arg1++] = (byte) ~local315;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}
}
