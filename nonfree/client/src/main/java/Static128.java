import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_21;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array19;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array12;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
	public static boolean aBoolean124;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_16;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_1113 = Static41.method597("<col=ffffff>");

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!cb;")
	public static Class12 aClass12_28 = new Class12(64);

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!ud;")
	public static Class75 aClass75_14 = new Class75(512);

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!cb;")
	public static Class12 aClass12_29 = new Class12(30);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_1114 = Static41.method597("Sprites geladen)3");

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public static int anInt2845 = 0;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array20 = new Class60[500];

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!od;")
	private static Class60 aClass60_1116 = Static41.method597("Loaded textures");

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_1115 = aClass60_1116;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1945() {
		aClass12_28 = null;
		aClass60_1113 = null;
		aClass60Array20 = null;
		aClass75_14 = null;
		aClass60_1116 = null;
		aClass4_Sub14_16 = null;
		aClass60Array19 = null;
		aClass10_Sub1_21 = null;
		aClass60_1115 = null;
		aClass12_29 = null;
		aClass4_Sub3_Sub6_Sub3Array12 = null;
		aClass60_1114 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Lclient!da;")
	public static Class4_Sub3_Sub2 method1946(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub2 local10 = (Class4_Sub3_Sub2) Static86.aClass12_18.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static35.aClass10_13.method1774(8, arg0);
		local10 = new Class4_Sub3_Sub2();
		if (local20 != null) {
			local10.method385(new Class4_Sub9(local20));
		}
		Static86.aClass12_18.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Lclient!od;")
	public static Class60 method1947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return Static47.aClass60_430;
		} else if (local7 < -6) {
			return Static48.aClass60_446;
		} else if (local7 < -3) {
			return Static118.aClass60_1066;
		} else if (local7 < 0) {
			return Static81.aClass60_801;
		} else if (local7 > 9) {
			return Static71.aClass60_748;
		} else if (local7 > 6) {
			return Static101.aClass60_1143;
		} else if (local7 > 3) {
			return Static83.aClass60_817;
		} else if (local7 > 0) {
			return Static31.aClass60_309;
		} else {
			return Static37.aClass60_383;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!tf;Lclient!od;)I")
	public static int method1948(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(14) int local14 = arg0.anInt1312;
		arg0.method822(arg1.anInt1991);
		arg0.anInt1312 += Static5.aClass31_1.method644(0, arg1.aByteArray21, arg0.anInt1312, arg0.aByteArray6, arg1.anInt1991);
		return arg0.anInt1312 - local14;
	}
}
