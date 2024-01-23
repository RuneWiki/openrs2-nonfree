import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!rn;")
	public static Class155 aClass155_34;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString54 = "wave2:";

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	public static int anInt1255 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBI)V")
	public static void method1050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static283.aBoolean393) {
			Static234.method3975(arg0, arg2, arg1 + arg0, arg3 + arg2);
			Static234.method3973(arg0, arg2, arg1, arg3, 0);
		} else {
			Static143.method2449(arg0, arg2, arg0 + arg1, arg2 - -arg3);
			Static143.method2462(arg0, arg2, arg1, arg3, 0);
		}
		if (Static155.anInt2919 < 100) {
			return;
		}
		@Pc(51) float local51 = (float) Static228.anInt1432 / (float) Static228.anInt1434;
		@Pc(53) int local53 = arg1;
		@Pc(55) int local55 = arg3;
		if (local51 < 1.0F) {
			local55 = (int) ((float) arg1 * local51);
		} else {
			local53 = (int) ((float) arg3 / local51);
		}
		@Pc(82) int local82 = arg2 + (arg3 - local55) / 2;
		if (Static232.aClass3_Sub4_Sub12_3 == null || Static232.aClass3_Sub4_Sub12_3.anInt5728 != arg1 || arg3 != Static232.aClass3_Sub4_Sub12_3.anInt5729) {
			@Pc(107) Class3_Sub4_Sub12_Sub2 local107 = new Class3_Sub4_Sub12_Sub2(arg1, arg3);
			Static143.method2446(local107.anIntArray596, arg1, arg3);
			if (Static228.aClass3_Sub4_Sub14_2.anInt2663 != -1) {
				Static143.method2462(0, 0, arg1, arg3, Static228.aClass3_Sub4_Sub14_2.anInt2663);
			}
			Static228.method1187(0, 0, Static228.anInt1434, Static228.anInt1432, 0, 0, local53, local55);
			Static228.method1195();
			if (Static283.aBoolean393) {
				Static232.aClass3_Sub4_Sub12_3 = new Class3_Sub4_Sub12_Sub1(local107);
			} else {
				Static232.aClass3_Sub4_Sub12_3 = local107;
			}
			if (Static283.aBoolean393) {
				Static143.anIntArray316 = null;
			} else {
				Static94.aClass128_1.method4293();
			}
		}
		@Pc(163) int local163 = arg0 + (arg1 - local53) / 2;
		Static232.aClass3_Sub4_Sub12_3.method4704(local163, local82);
		@Pc(176) int local176 = local163 + Static293.anInt5846 * local53 / Static228.anInt1434;
		@Pc(182) int local182 = Static171.anInt3225 * local53 / Static228.anInt1434;
		@Pc(191) int local191 = local82 + Static9.anInt189 * local55 / Static228.anInt1432;
		@Pc(197) int local197 = Static203.anInt3978 * local55 / Static228.anInt1432;
		@Pc(199) int local199 = 16711680;
		if (Static47.anInt5990 == 1) {
			local199 = 16777215;
		}
		if (Static283.aBoolean393) {
			Static234.method3974(local176, local191, local182, local197, local199, 128);
			Static234.method3979(local176, local191, local182, local197, local199);
		} else {
			Static143.method2452(local176, local191, local182, local197, local199, 128);
			Static143.method2455(local176, local191, local182, local197, local199);
		}
		if (Static135.anInt2616 <= 0) {
			return;
		}
		@Pc(256) int local256;
		if (Static157.anInt2942 > 50) {
			local256 = 500 - Static157.anInt2942 * 5;
		} else {
			local256 = Static157.anInt2942 * 5;
		}
		for (@Pc(267) Class3_Sub4_Sub23 local267 = (Class3_Sub4_Sub23) Static228.aClass115_4.method2879(); local267 != null; local267 = (Class3_Sub4_Sub23) Static228.aClass115_4.method2885()) {
			@Pc(275) Class40 local275 = Static96.method1438(local267.anInt5971);
			if (Static153.method2576(local275)) {
				@Pc(297) int local297;
				@Pc(307) int local307;
				if (Static300.anInt5934 == local267.anInt5971) {
					local297 = local163 + local53 * local267.anInt5964 / Static228.anInt1434;
					local307 = local82 + local267.anInt5970 * local55 / Static228.anInt1432;
					if (Static283.aBoolean393) {
						Static234.method3974(local297 - 2, local307 + -2, 4, 4, 16776960, local256);
					} else {
						Static143.method2452(local297 - 2, local307 + -2, 4, 4, 16776960, local256);
					}
				} else if (Static257.anInt5294 != -1 && local275.anInt1166 == Static257.anInt5294) {
					local297 = local53 * local267.anInt5964 / Static228.anInt1434 + local163;
					local307 = local82 + local267.anInt5970 * local55 / Static228.anInt1432;
					if (Static283.aBoolean393) {
						Static234.method3974(local297 - 2, local307 + -2, 4, 4, 16776960, local256);
					} else {
						Static143.method2452(local297 - 2, local307 + -2, 4, 4, 16776960, local256);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)I")
	public static int method1051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub16 local19 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg1);
		if (local19 == null) {
			return 0;
		} else if (arg0 >= 0 && local19.anIntArray293.length > arg0) {
			return local19.anIntArray293[arg0];
		} else {
			return 0;
		}
	}
}
