import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt3807 = -1;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString240 = "Walk here";

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "[Lclient!gk;")
	public static Class64[] aClass64Array1 = new Class64[8];

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
	public static boolean aBoolean243 = true;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public static int anInt3813 = -1;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public static int anInt3814 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLclient!th;Lclient!th;)V")
	public static void method2758(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static292.aClass168_199 = arg1;
		Static40.aClass168_31 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method2760() {
		if (Static5.aClass104_5 != null) {
			Static5.aClass104_5.method2571();
			Static5.aClass104_5 = null;
		}
		Static136.method2297();
		Static290.method4444();
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			Static82.aClass75Array1[local17].method1817();
		}
		Static83.method1427(false);
		System.gc();
		Static98.method3944();
		Static82.aBoolean132 = false;
		Static107.anInt1667 = -1;
		Static167.method2736(true);
		Static199.aBoolean418 = false;
		Static159.anInt3527 = 0;
		Static279.anInt5604 = 0;
		Static217.anInt4673 = 0;
		Static288.anInt5790 = 0;
		for (local17 = 0; local17 < aClass64Array1.length; local17++) {
			aClass64Array1[local17] = null;
		}
		Static147.anInt3287 = 0;
		Static16.anInt461 = 0;
		for (local17 = 0; local17 < 2048; local17++) {
			Static155.aClass2_Sub4_Sub2Array1[local17] = null;
			Static62.aClass1_Sub14Array1[local17] = null;
		}
		for (local17 = 0; local17 < 32768; local17++) {
			Static105.aClass2_Sub4_Sub1Array1[local17] = null;
		}
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(112) int local112 = 0; local112 < 104; local112++) {
				for (@Pc(117) int local117 = 0; local117 < 104; local117++) {
					Static20.aClass26ArrayArrayArray1[local17][local112][local117] = null;
				}
			}
		}
		Static226.method3586();
		Static241.anInt5007 = 0;
		Static280.method4267();
		Static43.method872(true);
		try {
			Static317.method295(Static142.aClass112_2.anApplet1, "loggedout");
		} catch (@Pc(154) Throwable local154) {
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public static void method2761() {
		aBoolean243 = true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	public static String method2762(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static134.anInterface2_1 != null) {
			@Pc(21) String local21 = Static134.anInterface2_1.method3374(arg0, arg1, arg2);
			if (local21 != null) {
				return local21;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIIILclient!ug;II)V")
	public static void method2763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static21.method455(arg3.anInt2794, arg1, arg3.anInt2846, 0, arg0, arg5, arg2, arg4);
	}
}
