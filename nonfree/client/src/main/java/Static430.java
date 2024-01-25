import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZI)V")
	public static void method5800(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static116.aClass1_Sub14_Sub2_1.method4566(Static282.anInt4732) >= 15) {
				@Pc(14) int local14 = Static116.aClass1_Sub14_Sub2_1.method4557(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static307.aClass47_Sub1_Sub5_Sub1Array1[local14] == null) {
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local14] = new Class47_Sub1_Sub5_Sub1();
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local14].anInt5358 = local14;
						local21 = true;
					}
					@Pc(42) Class47_Sub1_Sub5_Sub1 local42 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local14];
					Static151.anIntArray211[Static47.anInt760++] = local14;
					local42.anInt5343 = Static123.anInt2333;
					if (local42.aClass196_1 != null && local42.aClass196_1.method4406()) {
						Static315.method4338(local42);
					}
					@Pc(69) int local69 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
					local42.method3157(Static268.aClass26_1.method429(Static116.aClass1_Sub14_Sub2_1.method4557(14)));
					@Pc(86) int local86 = Static116.aClass1_Sub14_Sub2_1.method4557(1);
					if (local86 == 1) {
						Static295.anIntArray380[Static186.anInt3458++] = local14;
					}
					@Pc(108) int local108 = Static116.aClass1_Sub14_Sub2_1.method4557(3) + 4 << 11 & 0x3DF3;
					@Pc(115) int local115;
					if (arg0) {
						local115 = Static116.aClass1_Sub14_Sub2_1.method4557(8);
						if (local115 > 127) {
							local115 -= 256;
						}
					} else {
						local115 = Static116.aClass1_Sub14_Sub2_1.method4557(5);
						if (local115 > 15) {
							local115 -= 32;
						}
					}
					@Pc(141) int local141 = Static116.aClass1_Sub14_Sub2_1.method4557(2);
					@Pc(148) int local148;
					if (arg0) {
						local148 = Static116.aClass1_Sub14_Sub2_1.method4557(8);
						if (local148 > 127) {
							local148 -= 256;
						}
					} else {
						local148 = Static116.aClass1_Sub14_Sub2_1.method4557(5);
						if (local148 > 15) {
							local148 -= 32;
						}
					}
					local42.method4330(local42.aClass196_1.anInt5550);
					local42.anInt5404 = local42.aClass196_1.anInt5547 << 3;
					if (local42.anInt5404 == 0) {
						local42.method4320(0);
					} else if (local21) {
						local42.method4320(local108);
					}
					local42.method3158(local69 == 1, local42.method4317(), Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] + local148, Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] - -local115, local141);
					if (local42.aClass196_1.method4406()) {
						Static174.method2767(local42.aByte97, local42, local42.anIntArray407[0], null, 0, null, local42.anIntArray408[0]);
					}
					continue;
				}
			}
			Static116.aClass1_Sub14_Sub2_1.method4559();
			return;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IB)Z")
	public static boolean method5801(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 2 || arg0 == 51 || arg0 == 60 || arg0 == 57) {
			return true;
		} else {
			return arg0 == 17 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIII)I")
	public static int method5802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)Z")
	public static boolean method5803() {
		if (Static189.aBoolean273) {
			try {
				if ((Boolean) Static455.method622("showingVideoAd", Static403.aClass42_6.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
