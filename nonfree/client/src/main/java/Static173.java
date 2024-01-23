import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	public static int anInt3758 = 0;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
	public static int[] anIntArray331 = new int[50];

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1021 = Static231.method3737("M");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!o;I)I")
	public static int method2748(@OriginalArg(1) Class86 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray32 == null || arg1 >= arg0.anIntArrayArray32.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray32[arg1];
			@Pc(34) int local34 = 0;
			@Pc(36) byte local36 = 0;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(40) int local40 = 0;
				@Pc(45) int local45 = local24[local38++];
				@Pc(47) byte local47 = 0;
				if (local45 == 0) {
					return local34;
				}
				if (local45 == 1) {
					local40 = Static85.anIntArray191[local24[local38++]];
				}
				if (local45 == 2) {
					local40 = Static59.anIntArray126[local24[local38++]];
				}
				if (local45 == 15) {
					local47 = 1;
				}
				if (local45 == 3) {
					local40 = Static83.anIntArray180[local24[local38++]];
				}
				if (local45 == 16) {
					local47 = 2;
				}
				@Pc(105) int local105;
				@Pc(116) Class86 local116;
				@Pc(121) int local121;
				@Pc(134) int local134;
				if (local45 == 4) {
					local105 = local24[local38++] << 16;
					@Pc(112) int local112 = local105 + local24[local38++];
					local116 = Static13.method333(local112);
					local121 = local24[local38++];
					if (local121 != -1 && (!Static128.method2147(local121).aBoolean229 || Static209.aBoolean396)) {
						for (local134 = 0; local134 < local116.anIntArray285.length; local134++) {
							if (local121 + 1 == local116.anIntArray285[local134]) {
								local40 += local116.anIntArray275[local134];
							}
						}
					}
				}
				if (local45 == 17) {
					local47 = 3;
				}
				if (local45 == 5) {
					local40 = Static141.anIntArray267[local24[local38++]];
				}
				if (local45 == 6) {
					local40 = Canvas_Sub1.anIntArray224[Static59.anIntArray126[local24[local38++]] - 1];
				}
				if (local45 == 7) {
					local40 = Static141.anIntArray267[local24[local38++]] * 100 / 46875;
				}
				if (local45 == 8) {
					local40 = Static204.aClass5_Sub5_Sub1_2.anInt1286;
				}
				if (local45 == 9) {
					for (local105 = 0; local105 < 25; local105++) {
						if (Static49.aBooleanArray12[local105]) {
							local40 += Static59.anIntArray126[local105];
						}
					}
				}
				if (local45 == 10) {
					local105 = local24[local38++] << 16;
					local105 += local24[local38++];
					local116 = Static13.method333(local105);
					local121 = local24[local38++];
					if (local121 != -1 && (!Static128.method2147(local121).aBoolean229 || Static209.aBoolean396)) {
						for (local134 = 0; local134 < local116.anIntArray285.length; local134++) {
							if (local116.anIntArray285[local134] == local121 + 1) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local45 == 11) {
					local40 = Static90.anInt1960;
				}
				if (local45 == 12) {
					local40 = Static171.anInt3711;
				}
				if (local45 == 13) {
					local105 = Static141.anIntArray267[local24[local38++]];
					@Pc(334) int local334 = local24[local38++];
					local40 = (local105 & 0x1 << local334) == 0 ? 0 : 1;
				}
				if (local45 == 14) {
					local105 = local24[local38++];
					local40 = Static227.method3695(local105);
				}
				if (local45 == 18) {
					local40 = Static36.anInt764 + (Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7);
				}
				if (local45 == 19) {
					local40 = (Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7) + Static152.anInt3377;
				}
				if (local45 == 20) {
					local40 = local24[local38++];
				}
				if (local47 == 0) {
					if (local36 == 0) {
						local34 += local40;
					}
					if (local36 == 1) {
						local34 -= local40;
					}
					if (local36 == 2 && local40 != 0) {
						local34 /= local40;
					}
					if (local36 == 3) {
						local34 *= local40;
					}
					local36 = 0;
				} else {
					local36 = local47;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)I")
	public static int method2749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub20 local10 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray264.length > arg0) {
			return local10.anIntArray264[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public static void method2750() {
		if (Static146.aClass102_1 != null) {
			@Pc(3) Class102 local3 = Static146.aClass102_1;
			synchronized (Static146.aClass102_1) {
				Static146.aClass102_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method2751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}
}
