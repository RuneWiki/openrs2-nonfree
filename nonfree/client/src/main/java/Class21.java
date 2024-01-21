import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class21 {

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	private final int[] anIntArray92;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
	public Class21(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray92 = new int[local6];
		@Pc(13) int[] local13 = new int[33];
		this.aByteArray13 = arg0;
		@Pc(18) int local18 = 0;
		this.anIntArray91 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local13[local30];
				this.anIntArray92[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(85) int local85;
				if ((local42 & local46) == 0) {
					local59 = local46 | local42;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local13[local63];
						if (local46 != local69) {
							break;
						}
						local85 = 0x1 << 32 - local63;
						if ((local69 & local85) != 0) {
							local13[local63] = local13[local63 - 1];
							break;
						}
						local13[local63] = local69 | local85;
					}
				} else {
					local59 = local13[local30 - 1];
				}
				local13[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local46 == local13[local63]) {
						local13[local63] = local59;
					}
				}
				local69 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local85;
					if ((local46 & local158) == 0) {
						local69++;
					} else {
						if (this.anIntArray91[local69] == 0) {
							this.anIntArray91[local69] = local18;
						}
						local69 = this.anIntArray91[local69];
					}
					if (this.anIntArray91.length <= local69) {
						@Pc(199) int[] local199 = new int[this.anIntArray91.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray91.length; local201++) {
							local199[local201] = this.anIntArray91[local201];
						}
						this.anIntArray91 = local199;
					}
				}
				this.anIntArray91[local69] = ~local24;
				if (local18 <= local69) {
					local18 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[BII)I")
	public int method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg1 << 3;
		while (arg4 < local5) {
			@Pc(23) int local23 = arg3[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray92[local23];
			@Pc(33) byte local33 = this.aByteArray13[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 & 0x7;
			local7 &= -local50 >> 31;
			@Pc(61) int local61 = local15 >> 3;
			@Pc(72) int local72 = (local50 + local33 - 1 >> 3) + local61;
			local15 += local33;
			@Pc(77) int local77 = local50 + 24;
			arg2[local61] = (byte) (local7 |= local28 >>> local77);
			if (local72 > local61) {
				local50 = local77 - 8;
				local61++;
				arg2[local61] = (byte) (local7 = local28 >>> local50);
				if (local61 < local72) {
					local50 -= 8;
					local61++;
					arg2[local61] = (byte) (local7 = local28 >>> local50);
					if (local61 < local72) {
						local50 -= 8;
						local61++;
						arg2[local61] = (byte) (local7 = local28 >>> local50);
						if (local72 > local61) {
							local61++;
							local50 -= 8;
							arg2[local61] = (byte) (local7 = local28 << -local50);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BII[B)I")
	public int method568(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local18 = this.anIntArray91[local18];
			} else {
				local18++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local84;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local116;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local152;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local187;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local225;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(261) int local261;
			if ((local261 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local261;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray91[local18];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray91[local18]) < 0) {
				arg1[arg0++] = (byte) ~local299;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}
}
