import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt4177;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "[B")
	public static byte[] aByteArray43;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static int anInt4179 = 0;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLclient!ek;)V")
	public static void method3391(@OriginalArg(1) Class42 arg0) {
		Static11.aClass42_3 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZI)V")
	public static void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static65.method1194(false);
		Static13.anInt256 = arg1;
		Static262.anInt5152 = arg2;
		Static51.aBoolean307 = arg3;
		Static250.method2527(arg0);
		Static64.aClass101_2 = new Class101(8);
		Static311.aClass101_27 = new Class101(8);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B)Lclient!dj;")
	public static Class2_Sub8_Sub5_Sub1 method3393(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class2_Sub8_Sub5_Sub1 local26 = new Class2_Sub8_Sub5_Sub1(arg0, Static311.anIntArray591, Static275.anIntArray522, Static299.anIntArray561, Static187.anIntArray397, Static165.aByteArrayArray9);
			Static293.method4502();
			return local26;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public static void method3394() {
		try {
			if (Static73.anInt1821 == 1) {
				@Pc(18) int local18 = Static185.aClass2_Sub3_Sub1_7.method226();
				if (local18 > 0 && Static185.aClass2_Sub3_Sub1_7.method212()) {
					local18 -= Static130.anInt2976;
					if (local18 < 0) {
						local18 = 0;
					}
					Static185.aClass2_Sub3_Sub1_7.method201(local18);
					return;
				}
				Static185.aClass2_Sub3_Sub1_7.method193();
				Static185.aClass2_Sub3_Sub1_7.method190();
				Static169.aClass2_Sub27_2 = null;
				if (Static95.aClass42_23 == null) {
					Static73.anInt1821 = 0;
				} else {
					Static73.anInt1821 = 2;
				}
				Static213.aClass118_1 = null;
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static185.aClass2_Sub3_Sub1_7.method193();
			Static95.aClass42_23 = null;
			Static73.anInt1821 = 0;
			Static213.aClass118_1 = null;
			Static169.aClass2_Sub27_2 = null;
		}
	}
}
