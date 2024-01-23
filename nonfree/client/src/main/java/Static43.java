import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
	public static int[] anIntArray130 = new int[2];

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString58 = "purple:";

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
	public static int anInt1063 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
	public static void method872(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static36.anInt902 != -1) {
				Static283.method4313(Static36.anInt902);
			}
			for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static48.aClass186_5.method4567(); local18 != null; local18 = (Class1_Sub12) Static48.aClass186_5.method4579()) {
				Static236.method1277(true, local18);
			}
			Static36.anInt902 = -1;
			Static48.aClass186_5 = new Class186(8);
			Static263.method4011();
			Static36.anInt902 = Static40.anInt987;
			Static210.method3373(false);
			Static210.method3372();
			Static23.method502(Static36.anInt902);
		}
		Static263.anInt5294 = -1;
		Static281.method2101(Static189.anInt4171);
		Static56.aClass2_Sub4_Sub2_1 = new Class2_Sub4_Sub2();
		Static56.aClass2_Sub4_Sub2_1.anInt2846 = 3000;
		Static56.aClass2_Sub4_Sub2_1.anInt2794 = 3000;
		if (!Static294.aBoolean367 && Static208.anInt4489 == 0) {
			Static79.method1347(Static277.aClass168_188);
			Static112.method1823(10);
			return;
		}
		if (Static106.anInt2378 == 2) {
			Static94.anInt2161 = Static206.anInt4454 << 7;
			Static58.anInt1269 = Static82.anInt1930 << 7;
		} else {
			Static82.method1412();
		}
		if (Static294.aBoolean367) {
			Static170.method2761();
		}
		Static202.method3232();
		Static112.method1823(28);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method873() {
		Static64.anInt1379 = -1;
		Static124.anInt2710 = -1;
		Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
		Static148.anInt3326 = -1;
		Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
		Static281.anInt2783 = -1;
		Static128.aBoolean171 = false;
		Static181.anInt3973 = 0;
		Static169.anInt3805 = 0;
		Static264.anInt5302 = 0;
		Static188.anInt4164 = 0;
		Static64.method1130();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static155.aClass2_Sub4_Sub2Array1.length; local33++) {
			if (Static155.aClass2_Sub4_Sub2Array1[local33] != null) {
				Static155.aClass2_Sub4_Sub2Array1[local33].anInt2838 = -1;
			}
		}
		for (local33 = 0; local33 < Static105.aClass2_Sub4_Sub1Array1.length; local33++) {
			if (Static105.aClass2_Sub4_Sub1Array1[local33] != null) {
				Static105.aClass2_Sub4_Sub1Array1[local33].anInt2838 = -1;
			}
		}
		Static263.method4013();
		Static106.anInt2378 = 1;
		Static112.method1823(30);
		for (local33 = 0; local33 < 100; local33++) {
			Static29.aBooleanArray6[local33] = true;
		}
		Static304.method4620();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public static void method874() {
		Static35.method752();
		Static35.method747();
		Static35.method754();
		Static35.method758();
		Static35.method746();
		Static35.method760();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIZ)I")
	public static int method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}
}
