import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class247 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	private final int[] anIntArray380;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class247(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray51 = arg0;
		this.anIntArray380 = new int[local6];
		this.anIntArray378 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray380[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(82) int local82;
				if ((local42 & local46) == 0) {
					local62 = local42 | local46;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local72 != local46) {
							break;
						}
						local82 = 0x1 << 32 - local66;
						if ((local82 & local72) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local82 | local72;
					}
				} else {
					local62 = local20[local30 - 1];
				}
				local20[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local20[local66] == local46) {
						local20[local66] = local62;
					}
				}
				local72 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(177) int local177 = Integer.MIN_VALUE >>> local82;
					if ((local46 & local177) == 0) {
						local72++;
					} else {
						if (this.anIntArray378[local72] == 0) {
							this.anIntArray378[local72] = local22;
						}
						local72 = this.anIntArray378[local72];
					}
					if (this.anIntArray378.length <= local72) {
						@Pc(220) int[] local220 = new int[this.anIntArray378.length * 2];
						for (@Pc(222) int local222 = 0; local222 < this.anIntArray378.length; local222++) {
							local220[local222] = this.anIntArray378[local222];
						}
						this.anIntArray378 = local220;
					}
				}
				if (local72 >= local22) {
					local22 = local72 + 1;
				}
				this.anIntArray378[local72] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[B[BII)I")
	public int method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg1 << 3;
		while (arg4 < local11) {
			@Pc(25) int local25 = arg3[arg4] & 0xFF;
			@Pc(30) int local30 = this.anIntArray380[local25];
			@Pc(35) byte local35 = this.aByteArray51[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(55) int local55 = local15 >> 3;
			@Pc(59) int local59 = local15 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = (local59 + local35 - 1 >> 3) + local55;
			@Pc(78) int local78 = local59 + 24;
			arg2[local55] = (byte) (local7 |= local30 >>> local78);
			if (local55 < local77) {
				local59 = local78 - 8;
				local55++;
				arg2[local55] = (byte) (local7 = local30 >>> local59);
				if (local77 > local55) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local7 = local30 >>> local59);
					if (local55 < local77) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local7 = local30 >>> local59);
						if (local55 < local77) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local7 = local30 << -local59);
						}
					}
				}
			}
			local15 += local35;
			arg4++;
		}
		if (-277513377 != -277513377) {
			Static389.method5665();
		}
		return (local15 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI[BBII)I")
	public int method5664(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg3;
		@Pc(26) int local26 = arg4;
		while (true) {
			@Pc(30) byte local30 = arg0[local26];
			if (local30 < 0) {
				local12 = this.anIntArray378[local12];
			} else {
				local12++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local52;
				if (local16 <= arg1) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local88;
				if (local16 <= arg1) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(134) int local134;
			if ((local134 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local134;
				if (arg1 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(176) int local176;
			if ((local176 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local176;
				if (arg1 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(219) int local219;
			if ((local219 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local219;
				if (local16 <= arg1) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(265) int local265;
			if ((local265 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local265;
				if (local16 <= arg1) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(308) int local308;
			if ((local308 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local308;
				if (local16 <= arg1) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray378[local12];
			}
			@Pc(344) int local344;
			if ((local344 = this.anIntArray378[local12]) < 0) {
				arg2[arg1++] = (byte) ~local344;
				if (arg1 >= local16) {
					break;
				}
				local12 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg4;
	}
}
