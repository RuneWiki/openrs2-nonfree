import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString349 = "flash1:";

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public static int anInt5007 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[8];

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[S")
	public static short[] aShortArray88 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
	public static boolean method3782() {
		return Static294.aBoolean367 ? true : Static316.aBoolean419;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!th;)V")
	public static void method3784(@OriginalArg(1) Class168 arg0) {
		Static270.aClass168_183 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method3785() {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 104; local16++) {
			for (@Pc(21) int local21 = 0; local21 < 104; local21++) {
				if (Static21.method453(true, Static7.aClass1_Sub2ArrayArrayArray1, local14, local21, local16)) {
					local14++;
				}
				if (local14 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg4) {
			Static230.method2214(arg2, arg3, arg6, arg1, arg5, arg0);
		} else if (arg0 - arg2 >= Static170.anInt3814 && arg2 + arg0 <= Static310.anInt6206 && arg3 - arg4 >= Static206.anInt4449 && arg3 + arg4 <= Static90.anInt2088) {
			Static144.method2373(arg0, arg3, arg2, arg1, arg4, arg6, arg5);
		} else {
			Static261.method3995(arg3, arg2, arg6, arg1, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public static void method3787() {
		Static290.method4444();
		Static222.method3480();
		Static136.method2297();
		Static306.aClass162_13.method4006();
		Static242.aClass128_1 = new Class128();
		((Class63_Sub1) Static237.anInterface1_1).method4606();
		Static224.method3543();
		Static191.anInt4217 = 0;
		Static191.aClass59Array1 = new Class59[255];
		Static4.method146();
		Static177.method2839();
		Static149.method2421();
		Static83.method1427(false);
		Static176.method2829();
		Static77.method1320();
		for (@Pc(44) int local44 = 0; local44 < 2048; local44++) {
			@Pc(51) Class2_Sub4_Sub2 local51 = Static155.aClass2_Sub4_Sub2Array1[local44];
			if (local51 != null) {
				local51.anObject5 = null;
			}
		}
		if (Static294.aBoolean367) {
			Static177.method2851();
			Static41.method825(Static198.aBoolean269);
			Static42.method851();
		}
		Static120.method4730(Static277.aClass168_188, Static41.aClass168_34);
		Static35.method748(Static277.aClass168_188);
		Static187.aClass1_Sub3_Sub13_12 = null;
		Static146.aClass1_Sub3_Sub13_13 = null;
		Static184.aClass1_Sub3_Sub13_11 = null;
		Static139.aClass1_Sub3_Sub13_8 = null;
		Static313.aClass1_Sub3_Sub13_15 = null;
		if (Static96.anInt2212 == 5) {
			Static119.method1935(Static277.aClass168_188);
		}
		if (Static96.anInt2212 == 10) {
			Static43.method872(false);
		}
		if (Static96.anInt2212 == 30) {
			Static112.method1823(25);
		}
	}
}
