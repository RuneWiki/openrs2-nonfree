import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class57 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[B")
	private final byte[] aByteArray48;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "[I")
	private final int[] anIntArray271;

	@OriginalMember(owner = "client!p", name = "T", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
	public Class57(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray48 = arg0;
		@Pc(12) int[] local12 = new int[33];
		this.anIntArray271 = new int[local6];
		this.anIntArray272 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(36) int local36 = local12[local30];
				this.anIntArray271[local24] = local36;
				@Pc(48) int local48 = 0x1 << 32 - local30;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local48 & local36) == 0) {
					local61 = local48 | local36;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local12[local71];
						if (local77 != local36) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local87 & local77) != 0) {
							local12[local71] = local12[local71 - 1];
							break;
						}
						local12[local71] = local77 | local87;
					}
				} else {
					local61 = local12[local30 - 1];
				}
				local12[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local12[local71] == local36) {
						local12[local71] = local61;
					}
				}
				local77 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local87;
					if ((local153 & local36) == 0) {
						local77++;
					} else {
						if (this.anIntArray272[local77] == 0) {
							this.anIntArray272[local77] = local22;
						}
						local77 = this.anIntArray272[local77];
					}
					if (this.anIntArray272.length <= local77) {
						@Pc(190) int[] local190 = new int[this.anIntArray272.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray272.length; local192++) {
							local190[local192] = this.anIntArray272[local192];
						}
						this.anIntArray272 = local190;
					}
				}
				if (local77 >= local22) {
					local22 = local77 + 1;
				}
				this.anIntArray272[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIB[B[B)I")
	public int method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0;
		while (local15 > arg2) {
			@Pc(28) int local28 = arg4[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray271[local28];
			@Pc(38) byte local38 = this.aByteArray48[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local11 >> 3;
			@Pc(62) int local62 = local11 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = local58 + (local38 + local62 - 1 >> 3);
			@Pc(80) int local80 = local62 + 24;
			arg3[local58] = (byte) (local7 |= local33 >>> local80);
			if (local58 < local79) {
				local58++;
				local62 = local80 - 8;
				arg3[local58] = (byte) (local7 = local33 >>> local62);
				if (local58 < local79) {
					local62 -= 8;
					local58++;
					arg3[local58] = (byte) (local7 = local33 >>> local62);
					if (local58 < local79) {
						local58++;
						local62 -= 8;
						arg3[local58] = (byte) (local7 = local33 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg3[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			local11 += local38;
			arg2++;
		}
		return (local11 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BI[BII)I")
	public int method1438(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg0;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local45;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local84;
				if (arg2 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local123;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(162) int local162;
			if ((local162 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local162;
				if (arg2 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(201) int local201;
			if ((local201 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local201;
				if (arg2 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local236;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(275) int local275;
			if ((local275 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local275;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray272[local20];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray272[local20]) < 0) {
				arg3[arg2++] = (byte) ~local314;
				if (local18 <= arg2) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg0;
	}
}
