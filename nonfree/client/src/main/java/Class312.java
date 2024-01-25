import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class312 {

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "[I")
	private final int[] anIntArray577;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "[B")
	private final byte[] aByteArray93;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "([B)V")
	public Class312(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray577 = new int[local6];
		this.aByteArray93 = arg0;
		this.anIntArray578 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray577[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(85) int local85;
				if ((local46 & local42) == 0) {
					local59 = local46 | local42;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local69 != local46) {
							break;
						}
						local85 = 0x1 << 32 - local63;
						if ((local69 & local85) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local85;
					}
				} else {
					local59 = local20[local30 - 1];
				}
				local20[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local20[local63] == local46) {
						local20[local63] = local59;
					}
				}
				local69 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local85;
					if ((local46 & local156) == 0) {
						local69++;
					} else {
						if (this.anIntArray578[local69] == 0) {
							this.anIntArray578[local69] = local22;
						}
						local69 = this.anIntArray578[local69];
					}
					if (local69 >= this.anIntArray578.length) {
						@Pc(201) int[] local201 = new int[this.anIntArray578.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray578.length; local203++) {
							local201[local203] = this.anIntArray578[local203];
						}
						this.anIntArray578 = local201;
					}
				}
				this.anIntArray578[local69] = ~local24;
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B[BI[BII)I")
	public int method7368(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 < 0) {
				local14 = this.anIntArray578[local14];
			} else {
				local14++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local45;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local77;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local115;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local157;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local196;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local238;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local270;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray578[local14];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray578[local14]) < 0) {
				arg0[arg1++] = (byte) ~local309;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([BII[BII)I")
	public int method7370(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg1 << 3;
		@Pc(23) int local23 = arg4;
		while (arg2 < local23) {
			@Pc(31) int local31 = arg0[arg2] & 0xFF;
			@Pc(36) int local36 = this.anIntArray577[local31];
			@Pc(41) byte local41 = this.aByteArray93[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local19 >> 3;
			@Pc(65) int local65 = local19 & 0x7;
			local15 &= -local65 >> 31;
			@Pc(83) int local83 = local61 + (local65 + local41 - 1 >> 3);
			local19 += local41;
			@Pc(88) int local88 = local65 + 24;
			arg3[local61] = (byte) (local15 |= local36 >>> local88);
			if (local83 > local61) {
				local65 = local88 - 8;
				local61++;
				arg3[local61] = (byte) (local15 = local36 >>> local65);
				if (local61 < local83) {
					local65 -= 8;
					local61++;
					arg3[local61] = (byte) (local15 = local36 >>> local65);
					if (local83 > local61) {
						local61++;
						local65 -= 8;
						arg3[local61] = (byte) (local15 = local36 >>> local65);
						if (local83 > local61) {
							local61++;
							local65 -= 8;
							arg3[local61] = (byte) (local15 = local36 << -local65);
						}
					}
				}
			}
			arg2++;
		}
		return (local19 + 7 >> 3) - arg1;
	}
}
