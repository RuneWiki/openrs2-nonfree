import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!dd;")
	public static Class15 aClass15_8;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray92 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!sa;")
	public static Class72 aClass72_24 = new Class72(64);

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1403 = Static51.method932("Loading sprites )2 ");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1404 = aClass10_1403;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
	public static void method2255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static76.method1263(arg0)) {
			Static37.method769(Static90.aClass23ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)I")
	public static int method2256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg0);
		return Static139.aClass2_Sub1_Sub11_1 != null && Static139.aClass2_Sub1_Sub11_1.aLong139 == local16 ? Static10.aClass2_Sub11_1.anInt2077 * 99 / (Static10.aClass2_Sub11_1.aByteArray24.length - Static139.aClass2_Sub1_Sub11_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!cd;ILclient!cd;I)V")
	public static void method2257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		if (Static119.aBoolean119 || Static46.anInt1135 >= 500) {
			return;
		}
		Static80.aClass10Array14[Static46.anInt1135] = arg3;
		Static75.aClass10Array12[Static46.anInt1135] = arg4;
		Static93.anIntArray229[Static46.anInt1135] = arg2;
		Static27.anIntArray60[Static46.anInt1135] = arg0;
		Static177.anIntArray421[Static46.anInt1135] = arg5;
		Static157.anIntArray359[Static46.anInt1135] = arg1;
		Static46.anInt1135++;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method2263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method2264() {
		Static94.aBoolean95 = true;
		Static14.aClass87_1.anInt3791 = 0;
		Static36.anInt917 = 0;
		Static62.aBoolean66 = true;
		Static34.aLong30 = 0L;
		Static145.method1877();
		Static79.anInt1819 = 0;
		Static46.anInt1135 = 0;
		Static74.anInt2929 = 0;
		Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
		Static55.anInt1420 = -1;
		Static75.anInt1785 = -1;
		Static102.anInt3607 = 0;
		Static119.aBoolean119 = false;
		Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
		Static175.anInt3786 = 0;
		Static160.anInt3398 = -1;
		Static96.anInt3689 = -1;
		Static33.method674(0);
		for (@Pc(2256) int local2256 = 0; local2256 < 100; local2256++) {
			Static135.aClass10Array22[local2256] = null;
		}
		Static111.anInt2519 = 0;
		Static54.anInt1354 = 0;
		Static48.anInt1160 = 0;
		Static45.anInt1123 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static96.anInt3690 = (int) (Math.random() * 30.0D) - 20;
		Static40.anInt979 = 0;
		Static160.anInt3400 = (int) (Math.random() * 110.0D) - 55;
		Static64.anInt1578 = 0;
		Static64.anInt1576 = (int) (Math.random() * 120.0D) - 60;
		Static66.anInt1599 = (int) (Math.random() * 80.0D) - 40;
		Static95.anInt2254 = 0;
		Static44.anInt1023 = 0;
		Static109.anInt2502 = 0;
		Static69.aBoolean74 = false;
		Static25.anInt670 = (int) (Math.random() * 100.0D) - 50;
		Static107.anInt2445 = -1;
		for (@Pc(2340) int local2340 = 0; local2340 < 2048; local2340++) {
			Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local2340] = null;
			Static133.aClass2_Sub11Array1[local2340] = null;
		}
		for (@Pc(2356) int local2356 = 0; local2356 < 32768; local2356++) {
			Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local2356] = null;
		}
		Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[2047] = new Class2_Sub1_Sub3_Sub2_Sub1();
		Static81.aClass12_6.method386();
		Static177.aClass12_16.method386();
		@Pc(2388) int local2388;
		@Pc(2392) int local2392;
		for (@Pc(2384) int local2384 = 0; local2384 < 4; local2384++) {
			for (local2388 = 0; local2388 < 104; local2388++) {
				for (local2392 = 0; local2392 < 104; local2392++) {
					Static132.aClass12ArrayArrayArray1[local2384][local2388][local2392] = null;
				}
			}
		}
		Static158.aClass12_13 = new Class12();
		Static76.anInt1789 = 0;
		Static69.anInt1635 = 0;
		for (local2388 = 0; local2388 < Static40.anInt980; local2388++) {
			@Pc(2434) Class2_Sub1_Sub17 local2434 = Static110.method1756(local2388);
			if (local2434 != null && local2434.anInt3156 == 0) {
				Static146.anIntArray338[local2388] = 0;
				Static51.anIntArray143[local2388] = 0;
			}
		}
		for (local2392 = 0; local2392 < Static150.anIntArray380.length; local2392++) {
			Static150.anIntArray380[local2392] = -1;
		}
		if (Static107.anInt2446 != -1) {
			Static8.method157(Static107.anInt2446);
		}
		for (@Pc(2483) Class2_Sub15 local2483 = (Class2_Sub15) Static30.aClass18_2.method687(); local2483 != null; local2483 = (Class2_Sub15) Static30.aClass18_2.method682()) {
			Static48.method890(local2483, true);
		}
		Static107.anInt2446 = -1;
		Static30.aClass18_2 = new Class18(8);
		Static46.anInt1135 = 0;
		Static119.aBoolean119 = false;
		Static68.aClass23_6 = null;
		Static12.aClass74_1.method2277(-1, false, null, new int[5]);
		for (@Pc(2519) int local2519 = 0; local2519 < 8; local2519++) {
			Static98.aClass10Array17[local2519] = null;
			Static89.aBooleanArray8[local2519] = false;
		}
		Static69.method1163();
		Static79.aBoolean79 = true;
		for (@Pc(2539) int local2539 = 0; local2539 < 100; local2539++) {
			Static152.aBooleanArray14[local2539] = true;
		}
		Static146.anInt3197 = 0;
		Static60.aClass10_659 = null;
		Static141.aClass2_Sub17Array1 = null;
		for (@Pc(2557) int local2557 = 0; local2557 < 6; local2557++) {
			Static174.aClass19Array1[local2557] = new Class19();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method2265() {
		aClass72_24 = null;
		aShortArrayArray92 = null;
		aClass10_1404 = null;
		aClass15_8 = null;
		aClass10_1403 = null;
	}
}
