import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
	public static int anInt4005 = 0;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1451 = Static65.method1172("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1452 = null;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
	public static int[] anIntArray446 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!md;")
	public static Class54 aClass54_13 = new Class54(4096);

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1453 = Static65.method1172("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1454 = aClass46_1451;

	@OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
	public static int anInt4017 = 0;

	@OriginalMember(owner = "client!wh", name = "lb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1455 = Static65.method1172(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!wh", name = "mb", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
	public static int anInt4022 = 0;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public static void method2918() {
		Static49.aClass3_Sub4_Sub1_2.method227();
		@Pc(14) int local14 = Static49.aClass3_Sub4_Sub1_2.method228(8);
		@Pc(27) int local27;
		if (local14 < Static174.anInt3804) {
			for (local27 = local14; local27 < Static174.anInt3804; local27++) {
				Static150.anIntArray393[Static143.anInt3279++] = Static42.anIntArray106[local27];
			}
		}
		if (Static174.anInt3804 < local14) {
			throw new RuntimeException("gnpov1");
		}
		Static174.anInt3804 = 0;
		for (local27 = 0; local27 < local14; local27++) {
			@Pc(69) int local69 = Static42.anIntArray106[local27];
			@Pc(73) Class3_Sub2_Sub1_Sub1_Sub2 local73 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local69];
			@Pc(78) int local78 = Static49.aClass3_Sub4_Sub1_2.method228(1);
			if (local78 == 0) {
				Static42.anIntArray106[Static174.anInt3804++] = local69;
				local73.anInt1734 = Static20.anInt512;
			} else {
				@Pc(101) int local101 = Static49.aClass3_Sub4_Sub1_2.method228(2);
				if (local101 == 0) {
					Static42.anIntArray106[Static174.anInt3804++] = local69;
					local73.anInt1734 = Static20.anInt512;
					Static14.anIntArray25[Static108.anInt2585++] = local69;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local101 == 1) {
						Static42.anIntArray106[Static174.anInt3804++] = local69;
						local73.anInt1734 = Static20.anInt512;
						local145 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local73.method1163(false, local145);
						local155 = Static49.aClass3_Sub4_Sub1_2.method228(1);
						if (local155 == 1) {
							Static14.anIntArray25[Static108.anInt2585++] = local69;
						}
					} else if (local101 == 2) {
						Static42.anIntArray106[Static174.anInt3804++] = local69;
						local73.anInt1734 = Static20.anInt512;
						local145 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local73.method1163(true, local145);
						local155 = Static49.aClass3_Sub4_Sub1_2.method228(3);
						local73.method1163(true, local155);
						@Pc(209) int local209 = Static49.aClass3_Sub4_Sub1_2.method228(1);
						if (local209 == 1) {
							Static14.anIntArray25[Static108.anInt2585++] = local69;
						}
					} else if (local101 == 3) {
						Static150.anIntArray393[Static143.anInt3279++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public static void method2919() {
		aClass46_1451 = null;
		aClass54_13 = null;
		aClass46_1452 = null;
		aClass46_1453 = null;
		anIntArray446 = null;
		aShortArrayArray8 = null;
		aClass46_1455 = null;
		aClass46_1454 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)Lclient!kb;")
	public static Class46 method2922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static136.aClass46_1100;
		} else if (local7 < -6) {
			return Static33.aClass46_248;
		} else if (local7 < -3) {
			return Static83.aClass46_697;
		} else if (local7 < 0) {
			return Static176.aClass46_1390;
		} else if (local7 > 9) {
			return Static48.aClass46_436;
		} else if (local7 > 6) {
			return Static150.aClass46_1185;
		} else if (local7 > 3) {
			return Static69.aClass46_609;
		} else if (local7 > 0) {
			return Static58.aClass46_524;
		} else {
			return Static153.aClass46_1204;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V")
	public static void method2923(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7 local8 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg0);
		if (local8 != null) {
			for (@Pc(21) int local21 = 0; local21 < local8.anIntArray70.length; local21++) {
				local8.anIntArray70[local21] = -1;
				local8.anIntArray69[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)[B")
	public static byte[] method2924(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static184.method1309(arg0, 0, local14, 0, local11);
		return local14;
	}
}
