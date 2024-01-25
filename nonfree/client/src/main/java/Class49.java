import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class49 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "[I")
	private final int[] anIntArray115;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
	public Class49(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray17 = arg0;
		this.anIntArray115 = new int[local6];
		this.anIntArray116 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local20[local30];
				this.anIntArray115[local24] = local45;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(75) int local75;
				@Pc(87) int local87;
				if ((local41 & local45) == 0) {
					for (local69 = local30 - 1; local69 >= 1; local69--) {
						local75 = local20[local69];
						if (local45 != local75) {
							break;
						}
						local87 = 0x1 << 32 - local69;
						if ((local75 & local87) != 0) {
							local20[local69] = local20[local69 - 1];
							break;
						}
						local20[local69] = local75 | local87;
					}
					local63 = local45 | local41;
				} else {
					local63 = local20[local30 - 1];
				}
				local20[local30] = local63;
				for (local69 = local30 + 1; local69 <= 32; local69++) {
					if (local20[local69] == local45) {
						local20[local69] = local63;
					}
				}
				local75 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local87;
					if ((local45 & local148) == 0) {
						local75++;
					} else {
						if (this.anIntArray116[local75] == 0) {
							this.anIntArray116[local75] = local22;
						}
						local75 = this.anIntArray116[local75];
					}
					if (local75 >= this.anIntArray116.length) {
						@Pc(189) int[] local189 = new int[this.anIntArray116.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray116.length; local191++) {
							local189[local191] = this.anIntArray116[local191];
						}
						this.anIntArray116 = local189;
					}
				}
				if (local22 <= local75) {
					local22 = local75 + 1;
				}
				this.anIntArray116[local75] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[B[BI)I")
	public int method1529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg4;
		@Pc(25) int local25 = arg0;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 < 0) {
				local19 = this.anIntArray116[local19];
			} else {
				local19++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local45;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local80;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local115;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local151;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local186;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local221;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local260;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray116[local19];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray116[local19]) < 0) {
				arg3[arg1++] = (byte) ~local299;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg0;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(III[B[BI)I")
	public int method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg0 << 3;
		@Pc(20) int local20 = arg1;
		while (local20 > arg4) {
			@Pc(28) int local28 = arg3[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray115[local28];
			@Pc(38) byte local38 = this.aByteArray17[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local16 >> 3;
			@Pc(62) int local62 = local16 & 0x7;
			local12 &= -local62 >> 31;
			@Pc(79) int local79 = local58 + (local62 + local38 - 1 >> 3);
			@Pc(80) int local80 = local62 + 24;
			arg2[local58] = (byte) (local12 |= local33 >>> local80);
			if (local58 < local79) {
				local58++;
				local62 = local80 - 8;
				arg2[local58] = (byte) (local12 = local33 >>> local62);
				if (local58 < local79) {
					local58++;
					local62 -= 8;
					arg2[local58] = (byte) (local12 = local33 >>> local62);
					if (local58 < local79) {
						local62 -= 8;
						local58++;
						arg2[local58] = (byte) (local12 = local33 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg2[local58] = (byte) (local12 = local33 << -local62);
						}
					}
				}
			}
			local16 += local38;
			arg4++;
		}
		return (local16 + 7 >> 3) - arg0;
	}
}
