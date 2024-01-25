import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class317 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "[B")
	private final byte[] aByteArray116;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	private final int[] anIntArray690;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
	private int[] anIntArray689;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([B)V")
	public Class317(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray116 = arg0;
		this.anIntArray690 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray689 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray690[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(91) int local91;
				if ((local42 & local46) == 0) {
					local61 = local42 | local46;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local16[local71];
						if (local77 != local46) {
							break;
						}
						local91 = 0x1 << 32 - local71;
						if ((local77 & local91) != 0) {
							local16[local71] = local16[local71 - 1];
							break;
						}
						local16[local71] = local77 | local91;
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
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local91;
					if ((local154 & local46) == 0) {
						local77++;
					} else {
						if (this.anIntArray689[local77] == 0) {
							this.anIntArray689[local77] = local22;
						}
						local77 = this.anIntArray689[local77];
					}
					if (this.anIntArray689.length <= local77) {
						@Pc(198) int[] local198 = new int[this.anIntArray689.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray689.length; local200++) {
							local198[local200] = this.anIntArray689[local200];
						}
						this.anIntArray689 = local198;
					}
				}
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
				this.anIntArray689[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIIII[B)I")
	public int method7927(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(26) int local26 = arg2;
		while (true) {
			@Pc(30) byte local30 = arg4[local26];
			if (local30 < 0) {
				local14 = this.anIntArray689[local14];
			} else {
				local14++;
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local49;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local81;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local116;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local158;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local193;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local229;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local271;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray689[local14];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray689[local14]) < 0) {
				arg0[arg1++] = (byte) ~local313;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg2;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIII[BI)I")
	public int method7928(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg2 << 3;
		@Pc(20) int local20 = arg1;
		while (local20 > arg3) {
			@Pc(28) int local28 = arg0[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray690[local28];
			@Pc(38) byte local38 = this.aByteArray116[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local16 >> 3;
			@Pc(62) int local62 = local16 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = (local38 + local62 - 1 >> 3) + local58;
			local16 += local38;
			@Pc(84) int local84 = local62 + 24;
			arg4[local58] = (byte) (local7 |= local33 >>> local84);
			if (local79 > local58) {
				local62 = local84 - 8;
				local58++;
				arg4[local58] = (byte) (local7 = local33 >>> local62);
				if (local79 > local58) {
					local58++;
					local62 -= 8;
					arg4[local58] = (byte) (local7 = local33 >>> local62);
					if (local58 < local79) {
						local62 -= 8;
						local58++;
						arg4[local58] = (byte) (local7 = local33 >>> local62);
						if (local79 > local58) {
							local58++;
							local62 -= 8;
							arg4[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local16 + 7 >> 3) - arg2;
	}
}
