import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class119 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
	private final int[] anIntArray231;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
	public Class119(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray40 = arg0;
		this.anIntArray231 = new int[local6];
		this.anIntArray232 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray231[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(91) int local91;
				if ((local39 & local43) == 0) {
					local61 = local39 | local43;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local43) {
							break;
						}
						local91 = 0x1 << 32 - local71;
						if ((local91 & local77) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local91 | local77;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local43 == local20[local71]) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local91;
					if ((local43 & local157) == 0) {
						local77++;
					} else {
						if (this.anIntArray232[local77] == 0) {
							this.anIntArray232[local77] = local22;
						}
						local77 = this.anIntArray232[local77];
					}
					if (this.anIntArray232.length <= local77) {
						@Pc(205) int[] local205 = new int[this.anIntArray232.length * 2];
						for (@Pc(207) int local207 = 0; local207 < this.anIntArray232.length; local207++) {
							local205[local207] = this.anIntArray232[local207];
						}
						this.anIntArray232 = local205;
					}
				}
				this.anIntArray232[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BI[BIII)I")
	public int method2933(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(30) byte local30 = arg0[local17];
			if (local30 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local49;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local88;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local123;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(162) int local162;
			if ((local162 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local162;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local197;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local236;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(278) int local278;
			if ((local278 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local278;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray232[local15];
			}
			@Pc(317) int local317;
			if ((local317 = this.anIntArray232[local15]) < 0) {
				arg2[arg1++] = (byte) ~local317;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BIBI[BI)I")
	public int method2935(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg4;
		@Pc(20) int local20 = arg1 << 3;
		while (arg2 < local16) {
			@Pc(28) int local28 = arg0[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray231[local28];
			@Pc(38) byte local38 = this.aByteArray40[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local12 &= -local62 >> 31;
			@Pc(79) int local79 = (local38 + local62 - 1 >> 3) + local58;
			@Pc(80) int local80 = local62 + 24;
			arg3[local58] = (byte) (local12 |= local33 >>> local80);
			if (local58 < local79) {
				local62 = local80 - 8;
				local58++;
				arg3[local58] = (byte) (local12 = local33 >>> local62);
				if (local79 > local58) {
					local58++;
					local62 -= 8;
					arg3[local58] = (byte) (local12 = local33 >>> local62);
					if (local58 < local79) {
						local62 -= 8;
						local58++;
						arg3[local58] = (byte) (local12 = local33 >>> local62);
						if (local79 > local58) {
							local62 -= 8;
							local58++;
							arg3[local58] = (byte) (local12 = local33 << -local62);
						}
					}
				}
			}
			local20 += local38;
			arg2++;
		}
		return (local20 + 7 >> 3) - arg1;
	}
}
