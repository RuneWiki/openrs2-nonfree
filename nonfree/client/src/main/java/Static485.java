import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
	public static final int[] anIntArray750 = new int[1000];

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	public static void method6636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1010) {
			Static180.method2674(Static523.aClass64_11, arg0, arg2);
		} else if (arg1 == 1001) {
			Static180.method2674(Static20.aClass64_3, arg0, arg2);
		} else if (arg1 == 1003) {
			Static180.method2674(Static513.aClass64_9, arg0, arg2);
		} else if (arg1 == 1008) {
			Static180.method2674(Static433.aClass64_6, arg0, arg2);
		} else if (arg1 == 1002) {
			Static180.method2674(Static467.aClass64_7, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	public static void method6637(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static170.anInt3050 != -1) {
				Static210.method3584(Static170.anInt3050);
			}
			for (@Pc(14) Class1_Sub35 local14 = (Class1_Sub35) Static468.aClass17_36.method735(); local14 != null; local14 = (Class1_Sub35) Static468.aClass17_36.method740()) {
				if (!local14.method7527()) {
					local14 = (Class1_Sub35) Static468.aClass17_36.method735();
					if (local14 == null) {
						break;
					}
				}
				Static217.method7162(false, local14, true);
			}
			Static170.anInt3050 = -1;
			Static468.aClass17_36 = new Class17(8);
			Static141.method2294();
			Static170.anInt3050 = Static321.anInt5892;
			Static465.method6533(false);
			Static299.method4748();
			Static180.method2684(Static170.anInt3050);
		}
		Static111.aBoolean140 = false;
		Static308.aString52 = "";
		Static328.aString55 = "";
		Static221.method3829();
		Static108.anInt2198 = -1;
		Static210.method3586(Static457.anInt7785);
		Static63.aClass49_Sub2_Sub2_Sub1_1 = new Class49_Sub2_Sub2_Sub1();
		Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 = Static482.anInt7990 * 512 / 2;
		Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] = Static459.anInt7799 / 2;
		Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 = Static459.anInt7799 * 512 / 2;
		Static516.anInt8682 = 0;
		Static522.anInt8770 = 0;
		Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] = Static482.anInt7990 / 2;
		if (Static448.anInt7701 == 2) {
			Static516.anInt8682 = Static521.anInt8752 << 9;
			Static522.anInt8770 = Static263.anInt5055 << 9;
		} else {
			Static408.method6071();
		}
		Static283.method4575();
	}
}
