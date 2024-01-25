import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class190 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "[I")
	private final int[] anIntArray637;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
	private int[] anIntArray635;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class190(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray637 = new int[local6];
		this.aByteArray89 = arg0;
		this.anIntArray635 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray637[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(93) int local93;
				if ((local46 & local42) == 0) {
					local61 = local46 | local42;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local46 != local77) {
							break;
						}
						local93 = 0x1 << 32 - local71;
						if ((local77 & local93) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local93 | local77;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local20[local71] == local46) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local93 = 0; local93 < local30; local93++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local93;
					if ((local156 & local46) == 0) {
						local77++;
					} else {
						if (this.anIntArray635[local77] == 0) {
							this.anIntArray635[local77] = local22;
						}
						local77 = this.anIntArray635[local77];
					}
					if (this.anIntArray635.length <= local77) {
						@Pc(200) int[] local200 = new int[this.anIntArray635.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray635.length; local202++) {
							local200[local202] = this.anIntArray635[local202];
						}
						this.anIntArray635 = local200;
					}
				}
				this.anIntArray635[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ[B[BI)I")
	public int method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(26) byte local26 = arg2[local17];
			if (local26 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local42;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local78;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local113;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local151;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local193;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local231;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local270;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray635[local15];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray635[local15]) < 0) {
				arg3[arg1++] = (byte) ~local305;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([BIIII[B)I")
	public int method5112(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg3 << 3;
		while (local11 > arg2) {
			@Pc(23) int local23 = arg0[arg2] & 0xFF;
			@Pc(28) int local28 = this.anIntArray637[local23];
			@Pc(33) byte local33 = this.aByteArray89[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = (local54 + local33 - 1 >> 3) + local50;
			local15 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg4[local50] = (byte) (local7 |= local28 >>> local77);
			if (local72 > local50) {
				local50++;
				local54 = local77 - 8;
				arg4[local50] = (byte) (local7 = local28 >>> local54);
				if (local50 < local72) {
					local54 -= 8;
					local50++;
					arg4[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local72) {
						local50++;
						local54 -= 8;
						arg4[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local72) {
							local54 -= 8;
							local50++;
							arg4[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg2++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}
