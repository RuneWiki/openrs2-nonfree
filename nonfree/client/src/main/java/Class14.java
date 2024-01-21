import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class14 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	private final int[] anIntArray36;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class14(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray37 = new int[8];
		this.aByteArray3 = arg0;
		this.anIntArray36 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray36[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(89) int local89;
				if ((local43 & local39) == 0) {
					local61 = local43 | local39;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local43) {
							break;
						}
						local89 = 0x1 << 32 - local71;
						if ((local77 & local89) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local77 | local89;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local20[local71] == local43) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local89;
					if ((local43 & local151) == 0) {
						local77++;
					} else {
						if (this.anIntArray37[local77] == 0) {
							this.anIntArray37[local77] = local22;
						}
						local77 = this.anIntArray37[local77];
					}
					if (local77 >= this.anIntArray37.length) {
						@Pc(195) int[] local195 = new int[this.anIntArray37.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray37.length; local197++) {
							local195[local197] = this.anIntArray37[local197];
						}
						this.anIntArray37 = local195;
					}
				}
				this.anIntArray37[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B[BI[BII)I")
	public int method276(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(39) int local39;
			if ((local39 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local39;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(73) int local73;
			if ((local73 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local73;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(107) int local107;
			if ((local107 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local107;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(141) int local141;
			if ((local141 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local141;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local179;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local217;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local252;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray37[local14];
			}
			@Pc(289) int local289;
			if ((local289 = this.anIntArray37[local14]) < 0) {
				arg0[arg3++] = (byte) ~local289;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI[BI)I")
	public int method281(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 << 3;
		while (local9 > arg4) {
			@Pc(23) int local23 = arg3[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray36[local23];
			@Pc(33) byte local33 = this.aByteArray3[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			@Pc(65) int local65 = local50 + (local54 + local33 - 1 >> 3);
			local15 += local33;
			local11 &= -local54 >> 31;
			@Pc(77) int local77 = local54 + 24;
			arg1[local50] = (byte) (local11 |= local28 >>> local77);
			if (local65 > local50) {
				local50++;
				local54 = local77 - 8;
				arg1[local50] = (byte) (local11 = local28 >>> local54);
				if (local50 < local65) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local11 = local28 >>> local54);
					if (local65 > local50) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local11 = local28 >>> local54);
						if (local65 > local50) {
							local54 -= 8;
							local50++;
							arg1[local50] = (byte) (local11 = local28 << -local54);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}
