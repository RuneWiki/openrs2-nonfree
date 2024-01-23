import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class158 {

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
	public Class158(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray442 = new int[8];
		@Pc(13) int[] local13 = new int[33];
		this.anIntArray440 = new int[local6];
		this.aByteArray65 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local31;
				@Pc(46) int local46 = local13[local31];
				this.anIntArray440[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(75) int local75;
				@Pc(89) int local89;
				if ((local42 & local46) == 0) {
					local62 = local42 | local46;
					for (local66 = local31 - 1; local66 >= 1; local66--) {
						local75 = local13[local66];
						if (local46 != local75) {
							break;
						}
						local89 = 0x1 << 32 - local66;
						if ((local89 & local75) != 0) {
							local13[local66] = local13[local66 - 1];
							break;
						}
						local13[local66] = local89 | local75;
					}
				} else {
					local62 = local13[local31 - 1];
				}
				local13[local31] = local62;
				for (local66 = local31 + 1; local66 <= 32; local66++) {
					if (local46 == local13[local66]) {
						local13[local66] = local62;
					}
				}
				local66 = 0;
				for (local75 = 0; local75 < local31; local75++) {
					local89 = Integer.MIN_VALUE >>> local75;
					if ((local46 & local89) == 0) {
						local66++;
					} else {
						if (this.anIntArray442[local66] == 0) {
							this.anIntArray442[local66] = local22;
						}
						local66 = this.anIntArray442[local66];
					}
					if (this.anIntArray442.length <= local66) {
						@Pc(201) int[] local201 = new int[this.anIntArray442.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray442.length; local203++) {
							local201[local203] = this.anIntArray442[local203];
						}
						this.anIntArray442 = local201;
					}
				}
				this.anIntArray442[local66] = ~local24;
				if (local22 <= local66) {
					local22 = local66 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BII[BII)I")
	public int method3913(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(15) int local15 = arg4;
		@Pc(17) int local17 = 0;
		@Pc(27) int local27 = arg2;
		while (true) {
			@Pc(31) byte local31 = arg0[local27];
			if (local31 < 0) {
				local17 = this.anIntArray442[local17];
			} else {
				local17++;
			}
			@Pc(50) int local50;
			if ((local50 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local50;
				if (arg1 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x40) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(89) int local89;
			if ((local89 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local89;
				if (arg1 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x20) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(132) int local132;
			if ((local132 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local132;
				if (arg1 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x10) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(175) int local175;
			if ((local175 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local175;
				if (local15 <= arg1) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x8) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local217;
				if (local15 <= arg1) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x4) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local252;
				if (local15 <= arg1) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x2) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(293) int local293;
			if ((local293 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local293;
				if (local15 <= arg1) {
					break;
				}
				local17 = 0;
			}
			if ((local31 & 0x1) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray442[local17];
			}
			@Pc(331) int local331;
			if ((local331 = this.anIntArray442[local17]) < 0) {
				arg3[arg1++] = (byte) ~local331;
				if (local15 <= arg1) {
					break;
				}
				local17 = 0;
			}
			local27++;
		}
		return local27 + 1 - arg2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI[BZII)I")
	public int method3916(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg4 << 3;
		while (local11 > arg3) {
			@Pc(28) int local28 = arg2[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray440[local28];
			@Pc(38) byte local38 = this.aByteArray65[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local15 += local38;
			local7 &= -local62 >> 31;
			@Pc(83) int local83 = local58 + (local62 + local38 - 1 >> 3);
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local7 |= local33 >>> local84);
			if (local83 > local58) {
				local58++;
				local62 = local84 - 8;
				arg0[local58] = (byte) (local7 = local33 >>> local62);
				if (local83 > local58) {
					local62 -= 8;
					local58++;
					arg0[local58] = (byte) (local7 = local33 >>> local62);
					if (local58 < local83) {
						local62 -= 8;
						local58++;
						arg0[local58] = (byte) (local7 = local33 >>> local62);
						if (local83 > local58) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}
