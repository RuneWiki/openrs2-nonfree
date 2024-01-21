import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_283 = Static41.method597("Hidden)2");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!ud;")
	public static Class75 aClass75_5 = new Class75(4096);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!od;")
	private static Class60 aClass60_287 = Static41.method597("glow2:");

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_284 = aClass60_287;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_285 = Static41.method597("(U2");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_286 = aClass60_287;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt855 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method450() {
		Static112.aByteArrayArrayArray6 = new byte[4][104][104];
		Static94.anIntArray283 = new int[104];
		Static113.anIntArrayArrayArray3 = new int[4][105][105];
		Static32.anIntArrayArray22 = new int[105][105];
		Static20.anIntArray78 = new int[104];
		Static55.anIntArray147 = new int[104];
		Static31.anInt909 = 99;
		Static9.aByteArrayArrayArray1 = new byte[4][104][104];
		Static39.anIntArray108 = new int[104];
		Static119.aByteArrayArrayArray7 = new byte[4][104][104];
		Static53.aByteArrayArrayArray3 = new byte[4][104][104];
		Static49.anIntArray121 = new int[104];
		Static66.aByteArrayArrayArray4 = new byte[4][105][105];
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static void method451() {
		aClass75_5 = null;
		aClass60_284 = null;
		aLongArray3 = null;
		aClass60_287 = null;
		aClass60_286 = null;
		aClass60_283 = null;
		aClass60_285 = null;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
	public static void method452() {
		for (@Pc(14) Class4_Sub23 local14 = (Class4_Sub23) Static14.aClass45_1.method982(); local14 != null; local14 = (Class4_Sub23) Static14.aClass45_1.method986()) {
			if (local14.anInt2927 > 0) {
				local14.anInt2927--;
			}
			if (local14.anInt2927 != 0) {
				if (local14.anInt2921 > 0) {
					local14.anInt2921--;
				}
				if (local14.anInt2921 == 0 && local14.anInt2916 >= 1 && local14.anInt2925 >= 1 && local14.anInt2916 <= 102 && local14.anInt2925 <= 102 && (local14.anInt2920 < 0 || Static42.method598(local14.anInt2920, local14.anInt2915))) {
					Static54.method874(local14.anInt2919, local14.anInt2925, local14.anInt2923, local14.anInt2915, local14.anInt2922, local14.anInt2920, local14.anInt2916);
					local14.anInt2921 = -1;
					if (local14.anInt2920 == local14.anInt2926 && local14.anInt2926 == -1) {
						local14.method1989();
					} else if (local14.anInt2920 == local14.anInt2926 && local14.anInt2923 == local14.anInt2917 && local14.anInt2915 == local14.anInt2924) {
						local14.method1989();
					}
				}
			} else if (local14.anInt2926 < 0 || Static42.method598(local14.anInt2926, local14.anInt2924)) {
				Static54.method874(local14.anInt2919, local14.anInt2925, local14.anInt2917, local14.anInt2924, local14.anInt2922, local14.anInt2926, local14.anInt2916);
				local14.method1989();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
	public static void method453() {
		Static75.aClass75_8 = new Class75(32);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!ia;)V")
	public static void method454(@OriginalArg(1) Class4_Sub3_Sub1_Sub2 arg0) {
		if (arg0.anInt1390 == 0) {
			return;
		}
		@Pc(35) int local35;
		@Pc(42) int local42;
		if (arg0.anInt1438 != -1 && arg0.anInt1438 < 32768) {
			@Pc(26) Class4_Sub3_Sub1_Sub2_Sub2 local26 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[arg0.anInt1438];
			if (local26 != null) {
				local35 = arg0.anInt1440 - local26.anInt1440;
				local42 = arg0.anInt1407 - local26.anInt1407;
				if (local35 != 0 || local42 != 0) {
					arg0.anInt1414 = (int) (Math.atan2((double) local35, (double) local42) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt1438 >= 32768) {
			local73 = arg0.anInt1438 - 32768;
			if (Static94.anInt2216 == local73) {
				local73 = 2047;
			}
			@Pc(82) Class4_Sub3_Sub1_Sub2_Sub1 local82 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local73];
			if (local82 != null) {
				local42 = arg0.anInt1440 - local82.anInt1440;
				@Pc(97) int local97 = arg0.anInt1407 - local82.anInt1407;
				if (local42 != 0 || local97 != 0) {
					arg0.anInt1414 = (int) (Math.atan2((double) local42, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1382 != 0 || arg0.anInt1413 != 0) && (arg0.anInt1433 == 0 || arg0.anInt1387 > 0)) {
			local73 = arg0.anInt1440 - (arg0.anInt1382 - Static49.anInt1207 - Static49.anInt1207) * 64;
			local35 = arg0.anInt1407 - (arg0.anInt1413 - Static60.anInt2956 - Static60.anInt2956) * 64;
			if (local73 != 0 || local35 != 0) {
				arg0.anInt1414 = (int) (Math.atan2((double) local73, (double) local35) * 325.949D) & 0x7FF;
			}
			arg0.anInt1413 = 0;
			arg0.anInt1382 = 0;
		}
		local73 = arg0.anInt1414 - arg0.anInt1415 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt1395 = 0;
			return;
		}
		arg0.anInt1395++;
		@Pc(228) boolean local228;
		if (local73 <= 1024) {
			arg0.anInt1415 += arg0.anInt1390;
			local228 = true;
			if (local73 < arg0.anInt1390 || 2048 - arg0.anInt1390 < local73) {
				local228 = false;
				arg0.anInt1415 = arg0.anInt1414;
			}
			if (arg0.anInt1389 == arg0.anInt1399 && (arg0.anInt1395 > 25 || local228)) {
				if (arg0.anInt1435 == -1) {
					arg0.anInt1389 = arg0.anInt1410;
				} else {
					arg0.anInt1389 = arg0.anInt1435;
				}
			}
		} else {
			arg0.anInt1415 -= arg0.anInt1390;
			local228 = true;
			if (local73 < arg0.anInt1390 || 2048 - arg0.anInt1390 < local73) {
				arg0.anInt1415 = arg0.anInt1414;
				local228 = false;
			}
			if (arg0.anInt1389 == arg0.anInt1399 && (arg0.anInt1395 > 25 || local228)) {
				if (arg0.anInt1401 == -1) {
					arg0.anInt1389 = arg0.anInt1410;
				} else {
					arg0.anInt1389 = arg0.anInt1401;
				}
			}
		}
		arg0.anInt1415 &= 0x7FF;
	}
}
