import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt4708;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!sg;")
	public static Class1_Sub26 aClass1_Sub26_2;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!th;")
	public static Class168 aClass168_161;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt4704 = 1;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	public static int anInt4707 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Z")
	public static boolean method3475(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method3476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static147.anInt3288 < 100) {
			Static59.method1080();
		}
		if (Static294.aBoolean367) {
			Static156.method2546(arg3, arg1, arg3 + arg0, arg2 + arg1);
		} else {
			Static231.method3634(arg3, arg1, arg3 + arg0, arg2 + arg1);
		}
		@Pc(50) int local50;
		@Pc(61) int local61;
		if (Static147.anInt3288 < 100) {
			local50 = arg3 + arg0 / 2;
			local61 = arg1 + arg2 / 2 - 20 - 18;
			if (Static294.aBoolean367) {
				Static156.method2537(arg3, arg1, arg0, arg2, 0);
				Static156.method2540(local50 - 152, local61, 304, 34, 9179409);
				Static156.method2537(local50 - 150, local61 + 2, Static147.anInt3288 * 3, 30, 9179409);
			} else {
				Static231.method3630(arg3, arg1, arg0, arg2, 0);
				Static231.method3626(local50 - 152, local61, 304, 34, 9179409);
				Static231.method3630(local50 - 150, local61 + 2, Static147.anInt3288 * 3, 30, 9179409);
			}
			Static176.aClass1_Sub3_Sub5_2.method3499(Static178.aString254, local50, local61 + 20, 16777215, -1);
			return;
		}
		Static119.anInt2580 = Static299.anInt5944 - (int) ((float) arg2 / Static268.aFloat34);
		Static5.anInt3330 = (int) ((float) (arg0 * 2) / Static268.aFloat34);
		Static155.anInt3473 = (int) ((float) (arg2 * 2) / Static268.aFloat34);
		local50 = Static299.anInt5944 - (int) ((float) arg2 / Static268.aFloat34);
		Static17.anInt474 = Static109.anInt2414 - (int) ((float) arg0 / Static268.aFloat34);
		@Pc(178) int local178 = Static109.anInt2414 - (int) ((float) arg0 / Static268.aFloat34);
		local61 = Static109.anInt2414 + (int) ((float) arg0 / Static268.aFloat34);
		@Pc(195) int local195 = (int) ((float) arg2 / Static268.aFloat34) + Static299.anInt5944;
		@Pc(215) Class26 local215;
		if (Static294.aBoolean367) {
			if (Static84.aClass1_Sub3_Sub13_Sub2_2 == null || Static84.aClass1_Sub3_Sub13_Sub2_2.anInt5571 != arg0 || arg2 != Static84.aClass1_Sub3_Sub13_Sub2_2.anInt5573) {
				Static84.aClass1_Sub3_Sub13_Sub2_2 = null;
				Static84.aClass1_Sub3_Sub13_Sub2_2 = new Class1_Sub3_Sub13_Sub2(arg0, arg2);
			}
			Static231.method3639(Static84.aClass1_Sub3_Sub13_Sub2_2.anIntArray504, arg0, arg2);
			Static268.method2000(local178, local50, local61, local195, 0, 0, arg0, arg2 + 1);
			Static268.method2008();
			local215 = Static268.method2001();
			Static260.method3992(local215, arg1, arg3);
			Static84.aClass1_Sub3_Sub13_Sub2_2.method4231();
			Static156.method2529(Static84.aClass1_Sub3_Sub13_Sub2_2.anIntArray504, arg3, arg1, arg0, arg2);
			Static231.anIntArray448 = null;
		} else {
			Static268.method2000(local178, local50, local61, local195, arg3, arg1, arg0 + arg3, arg2 + arg1 - -1);
			Static268.method2008();
			local215 = Static268.method2001();
			Static260.method3992(local215, 0, 0);
		}
		if (Static11.anInt308 > 0) {
			Static48.anInt1149--;
			if (Static48.anInt1149 == 0) {
				Static11.anInt308--;
				Static48.anInt1149 = 20;
			}
		}
		if (!Static24.aBoolean36) {
			return;
		}
		@Pc(311) int local311 = arg3 + arg0 - 5;
		@Pc(317) int local317 = arg2 + arg1 - 8;
		Static195.aClass1_Sub3_Sub5_3.method3494("Fps:" + Static25.anInt692, local311, local317, 16776960, -1);
		@Pc(333) Runtime local333 = Runtime.getRuntime();
		@Pc(334) int local334 = local317 - 15;
		@Pc(343) int local343 = (int) ((local333.totalMemory() - local333.freeMemory()) / 1024L);
		@Pc(345) int local345 = 16776960;
		if (local343 > 65536) {
			local345 = 16711680;
		}
		Static195.aClass1_Sub3_Sub5_3.method3494("Mem:" + local343 + "k", local311, local334, local345, -1);
		local317 = local334 - 15;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method3477() {
		Static230.aClass89_16.method2273(5);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method3478() {
		Static253.anInt5118 = 1;
		Static139.aBoolean195 = false;
		Static171.anInt3850 = 0;
		Static271.anInt5421 = -3;
		Static161.anInt3536 = -1;
		Static297.anInt5910 = 0;
		Static193.anInt4251 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public static void method3480() {
		Static46.anInt1108 = -1;
		Static146.aClass1_Sub3_Sub13_14 = null;
	}
}
