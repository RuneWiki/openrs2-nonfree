import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt3887;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt3890;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!oe;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
	public static int[] anIntArray310 = new int[14];

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
	public static boolean aBoolean332 = true;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[C")
	public static char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
	public static short[] aShortArray41 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method3139() {
		for (@Pc(3) int local3 = -1; local3 < Static68.anInt1507; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static33.anIntArray50[local3];
			}
			@Pc(21) Class36_Sub3_Sub2 local21 = Static212.aClass36_Sub3_Sub2Array1[local11];
			if (local21 != null) {
				Static134.method2328(local21.method4097(), local21);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!jd;I[Lclient!af;)V")
	public static void method3140(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Class2_Sub3_Sub1_Sub1[] arg1) {
		Static297.aClass2_Sub3_Sub1_Sub1Array2 = arg1;
		Static214.aClass84_96 = arg0;
		Static96.aBooleanArray10 = new boolean[Static297.aClass2_Sub3_Sub1_Sub1Array2.length];
		Static186.aClass79_16.method1999();
		@Pc(17) int local17 = Static214.aClass84_96.method2121("details");
		@Pc(22) int[] local22 = Static214.aClass84_96.method2119(local17);
		for (@Pc(28) int local28 = 0; local28 < local22.length; local28++) {
			Static186.aClass79_16.method1994((long) local22[local28], Static242.method3954(local22[local28], new Class2_Sub26(Static214.aClass84_96.method2127(local22[local28], local17))));
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
	public static void method3142() {
		Static269.aClass46_38.method1068(5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB)V")
	public static void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static95.aClass2_Sub26_Sub1_1.method4287(204);
		Static95.aClass2_Sub26_Sub1_1.method4260(arg0);
		Static95.aClass2_Sub26_Sub1_1.method4231(arg1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZIILclient!jd;)V")
	public static void method3144(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class84 arg2) {
		Static70.anInt1532 = 0;
		Static273.anInt5686 = arg0;
		Static25.aBoolean467 = false;
		Static154.anInt3284 = 2;
		Static131.anInt2692 = 1;
		Static51.anInt1198 = arg1;
		Static101.aClass84_127 = arg2;
	}
}
