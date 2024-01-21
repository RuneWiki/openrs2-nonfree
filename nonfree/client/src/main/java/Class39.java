import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class39 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "[I")
	private final int[] anIntArray187;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class39(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.aByteArray10 = arg0;
		this.anIntArray188 = new int[8];
		this.anIntArray187 = new int[local11];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local6[local30];
				this.anIntArray187[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(78) int local78;
				if ((local43 & local39) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local6[local63];
						if (local69 != local43) {
							break;
						}
						local78 = 0x1 << 32 - local63;
						if ((local78 & local69) != 0) {
							local6[local63] = local6[local63 - 1];
							break;
						}
						local6[local63] = local78 | local69;
					}
				} else {
					local59 = local6[local30 - 1];
				}
				local6[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local6[local63]) {
						local6[local63] = local59;
					}
				}
				local69 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local78;
					if ((local147 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray188[local69] == 0) {
							this.anIntArray188[local69] = local8;
						}
						local69 = this.anIntArray188[local69];
					}
					if (this.anIntArray188.length <= local69) {
						@Pc(188) int[] local188 = new int[this.anIntArray188.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray188.length; local190++) {
							local188[local190] = this.anIntArray188[local190];
						}
						this.anIntArray188 = local188;
					}
				}
				if (local69 >= local8) {
					local8 = local69 + 1;
				}
				this.anIntArray188[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI[BI)I")
	public int method977(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg4;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg0;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 < 0) {
				local20 = this.anIntArray188[local20];
			} else {
				local20++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local45;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local84;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local126;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local158;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local197;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local233;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local268;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray188[local20];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray188[local20]) < 0) {
				arg3[arg2++] = (byte) ~local303;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII[BI)I")
	public int method978(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg2 << 3;
		while (arg0 < local5) {
			@Pc(28) int local28 = arg3[arg0] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray10[local28];
			@Pc(38) int local38 = this.anIntArray187[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			local16 += local33;
			@Pc(80) int local80 = (local59 + local33 - 1 >> 3) + local55;
			@Pc(81) int local81 = local59 + 24;
			arg1[local55] = (byte) (local12 |= local38 >>> local81);
			if (local80 > local55) {
				local55++;
				local59 = local81 - 8;
				arg1[local55] = (byte) (local12 = local38 >>> local59);
				if (local55 < local80) {
					local55++;
					local59 -= 8;
					arg1[local55] = (byte) (local12 = local38 >>> local59);
					if (local80 > local55) {
						local59 -= 8;
						local55++;
						arg1[local55] = (byte) (local12 = local38 >>> local59);
						if (local55 < local80) {
							local55++;
							local59 -= 8;
							arg1[local55] = (byte) (local12 = local38 << -local59);
						}
					}
				}
			}
			arg0++;
		}
		return (local16 + 7 >> 3) - arg2;
	}
}
