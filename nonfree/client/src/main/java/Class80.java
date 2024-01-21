import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class80 {

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
	private final int[] anIntArray454;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
	public Class80(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray453 = new int[8];
		this.aByteArray47 = arg0;
		this.anIntArray454 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray454[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local43 & local39) == 0) {
					local61 = local39 | local43;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local43 != local77) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local77 & local87) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local87 | local77;
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
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local87;
					if ((local43 & local146) == 0) {
						local77++;
					} else {
						if (this.anIntArray453[local77] == 0) {
							this.anIntArray453[local77] = local22;
						}
						local77 = this.anIntArray453[local77];
					}
					if (this.anIntArray453.length <= local77) {
						@Pc(183) int[] local183 = new int[this.anIntArray453.length * 2];
						for (@Pc(185) int local185 = 0; local185 < this.anIntArray453.length; local185++) {
							local183[local185] = this.anIntArray453[local185];
						}
						this.anIntArray453 = local183;
					}
				}
				this.anIntArray453[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[B[BI)I")
	public int method3116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg1;
		@Pc(18) int local18 = arg4 << 3;
		@Pc(20) int local20 = 0;
		while (arg0 < local14) {
			@Pc(28) int local28 = arg2[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray454[local28];
			@Pc(38) byte local38 = this.aByteArray47[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local18 >> 3;
			@Pc(59) int local59 = local18 & 0x7;
			local18 += local38;
			local20 &= -local59 >> 31;
			@Pc(81) int local81 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(82) int local82 = local59 + 24;
			arg3[local55] = (byte) (local20 |= local33 >>> local82);
			if (local81 > local55) {
				local59 = local82 - 8;
				local55++;
				arg3[local55] = (byte) (local20 = local33 >>> local59);
				if (local55 < local81) {
					local59 -= 8;
					local55++;
					arg3[local55] = (byte) (local20 = local33 >>> local59);
					if (local81 > local55) {
						local59 -= 8;
						local55++;
						arg3[local55] = (byte) (local20 = local33 >>> local59);
						if (local81 > local55) {
							local55++;
							local59 -= 8;
							arg3[local55] = (byte) (local20 = local33 << -local59);
						}
					}
				}
			}
			arg0++;
		}
		return (local18 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI[BI)I")
	public int method3118(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg4;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg2;
		while (true) {
			@Pc(24) byte local24 = arg3[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local43;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(82) int local82;
			if ((local82 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local82;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local124;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(159) int local159;
			if ((local159 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local159;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(198) int local198;
			if ((local198 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local198;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local233;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(272) int local272;
			if ((local272 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local272;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray453[local18];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray453[local18]) < 0) {
				arg1[arg0++] = (byte) ~local314;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg2;
	}
}
