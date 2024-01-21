import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
	private final int[] anIntArray2;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
	public Class5(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray1 = arg0;
		this.anIntArray2 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray3 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray2[local24] = local43;
				@Pc(101) int local101;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(73) int local73;
				if ((local43 & local39) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local16[local56];
						if (local62 != local43) {
							break;
						}
						local73 = 0x1 << 32 - local56;
						if ((local62 & local73) != 0) {
							local16[local56] = local16[local56 - 1];
							break;
						}
						local16[local56] = local73 | local62;
					}
					local101 = local39 | local43;
				} else {
					local101 = local16[local30 - 1];
				}
				local16[local30] = local101;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local16[local56] == local43) {
						local16[local56] = local101;
					}
				}
				local62 = 0;
				for (local73 = 0; local73 < local30; local73++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local73;
					if ((local148 & local43) == 0) {
						local62++;
					} else {
						if (this.anIntArray3[local62] == 0) {
							this.anIntArray3[local62] = local22;
						}
						local62 = this.anIntArray3[local62];
					}
					if (this.anIntArray3.length <= local62) {
						@Pc(188) int[] local188 = new int[this.anIntArray3.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray3.length; local190++) {
							local188[local190] = this.anIntArray3[local190];
						}
						this.anIntArray3 = local188;
					}
				}
				this.anIntArray3[local62] = ~local24;
				if (local62 >= local22) {
					local22 = local62 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BI[BII)I")
	public int method42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 << 3;
		while (local5 > arg0) {
			@Pc(23) int local23 = arg1[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray2[local23];
			@Pc(33) byte local33 = this.aByteArray1[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 & 0x7;
			local11 &= -local53 >> 31;
			@Pc(64) int local64 = local15 >> 3;
			@Pc(75) int local75 = local64 + (local33 + local53 - 1 >> 3);
			local15 += local33;
			@Pc(80) int local80 = local53 + 24;
			arg2[local64] = (byte) (local11 |= local28 >>> local80);
			if (local75 > local64) {
				local64++;
				local53 = local80 - 8;
				arg2[local64] = (byte) (local11 = local28 >>> local53);
				if (local75 > local64) {
					local53 -= 8;
					local64++;
					arg2[local64] = (byte) (local11 = local28 >>> local53);
					if (local64 < local75) {
						local53 -= 8;
						local64++;
						arg2[local64] = (byte) (local11 = local28 >>> local53);
						if (local75 > local64) {
							local53 -= 8;
							local64++;
							arg2[local64] = (byte) (local11 = local28 << -local53);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BII[BI)I")
	public int method48(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local42;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(74) int local74;
			if ((local74 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local74;
				if (arg2 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local113;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local148;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local184;
				if (arg2 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local223;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(262) int local262;
			if ((local262 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local262;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray3[local20];
			}
			@Pc(298) int local298;
			if ((local298 = this.anIntArray3[local20]) < 0) {
				arg3[arg2++] = (byte) ~local298;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg4;
	}
}
