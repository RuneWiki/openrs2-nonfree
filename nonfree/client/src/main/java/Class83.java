import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class83 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
	private final int[] anIntArray301;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B)V")
	public Class83(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.anIntArray301 = new int[local9];
		@Pc(15) int local15 = 0;
		this.anIntArray300 = new int[8];
		this.aByteArray36 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local6[local30];
				this.anIntArray301[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local42 & local46) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local6[local67];
						if (local73 != local46) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local73 & local85) != 0) {
							local6[local67] = local6[local67 - 1];
							break;
						}
						local6[local67] = local73 | local85;
					}
					local61 = local46 | local42;
				} else {
					local61 = local6[local30 - 1];
				}
				local6[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local6[local67] == local46) {
						local6[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local85;
					if ((local148 & local46) == 0) {
						local73++;
					} else {
						if (this.anIntArray300[local73] == 0) {
							this.anIntArray300[local73] = local15;
						}
						local73 = this.anIntArray300[local73];
					}
					if (local73 >= this.anIntArray300.length) {
						@Pc(189) int[] local189 = new int[this.anIntArray300.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray300.length; local191++) {
							local189[local191] = this.anIntArray300[local191];
						}
						this.anIntArray300 = local189;
					}
				}
				if (local15 <= local73) {
					local15 = local73 + 1;
				}
				this.anIntArray300[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[BII[B)I")
	public int method2390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 << 3;
		@Pc(23) int local23 = arg0;
		while (arg1 < local23) {
			@Pc(31) int local31 = arg2[arg1] & 0xFF;
			@Pc(36) int local36 = this.anIntArray301[local31];
			@Pc(41) byte local41 = this.aByteArray36[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local11 >> 3;
			@Pc(62) int local62 = local11 & 0x7;
			@Pc(72) int local72 = local58 + (local41 + local62 - 1 >> 3);
			local7 &= -local62 >> 31;
			@Pc(80) int local80 = local62 + 24;
			arg4[local58] = (byte) (local7 |= local36 >>> local80);
			if (local72 > local58) {
				local58++;
				local62 = local80 - 8;
				arg4[local58] = (byte) (local7 = local36 >>> local62);
				if (local72 > local58) {
					local58++;
					local62 -= 8;
					arg4[local58] = (byte) (local7 = local36 >>> local62);
					if (local72 > local58) {
						local62 -= 8;
						local58++;
						arg4[local58] = (byte) (local7 = local36 >>> local62);
						if (local58 < local72) {
							local62 -= 8;
							local58++;
							arg4[local58] = (byte) (local7 = local36 << -local62);
						}
					}
				}
			}
			local11 += local41;
			arg1++;
		}
		return (local11 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI[BI[BI)I")
	public int method2394(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(28) int local28 = arg0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = arg2;
		while (true) {
			@Pc(36) byte local36 = arg1[local32];
			if (local36 < 0) {
				local30 = this.anIntArray300[local30];
			} else {
				local30++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local52;
				if (arg4 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local87;
				if (arg4 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local129;
				if (arg4 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local164;
				if (local28 <= arg4) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local203;
				if (local28 <= arg4) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local242;
				if (local28 <= arg4) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local277;
				if (local28 <= arg4) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray300[local30];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray300[local30]) < 0) {
				arg3[arg4++] = (byte) ~local309;
				if (arg4 >= local28) {
					break;
				}
				local30 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg2;
	}
}
