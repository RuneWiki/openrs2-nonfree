import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_19;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_1052 = Static41.method597(" )2> ");

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!od;")
	private static Class60 aClass60_1053 = Static41.method597("The server is being updated)3");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
	public static int anInt2704 = 0;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_1055 = aClass60_1053;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	public static int anInt2713 = 0;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public static int anInt2717 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZZ)I")
	public static int method1878() {
		return Static91.anInt2146 + Static70.anInt1739;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!c;BZLclient!c;Lclient!me;)V")
	public static void method1879(@OriginalArg(0) Class10 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class4_Sub3_Sub6_Sub1_Sub1 arg3) {
		Static29.aClass10_11 = arg2;
		Static22.aClass10_8 = arg0;
		Static128.aBoolean124 = arg1;
		Static22.aClass10_8.method1772(10);
		Static75.aClass4_Sub3_Sub6_Sub1_Sub1_4 = arg3;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public static void method1880() {
		if (Static48.anInt1175 > 0) {
			Static124.method1932();
		} else {
			Static32.method496(40);
			Static4.aClass37_1 = Static72.aClass37_6;
			Static72.aClass37_6 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class4_Sub3_Sub12 method1881(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub12 local10 = (Class4_Sub3_Sub12) Static91.aClass12_20.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static80.aClass10_21.method1774(5, arg0);
		local10 = new Class4_Sub3_Sub12();
		if (local28 != null) {
			local10.method1397(new Class4_Sub9(local28));
		}
		Static91.aClass12_20.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method1882() {
		Static14.aClass4_Sub9_Sub1_1.method826(131);
		Static14.aClass4_Sub9_Sub1_1.method805(0L);
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public static void method1883() {
		Static80.aClass3_1.method632();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static107.aLongArray6[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static21.aLongArray2[local18] = 0L;
		}
		Static50.anInt1428 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	public static void method1884() {
		aClass60_1055 = null;
		aClass60_1053 = null;
		aClass60_1052 = null;
		aClass10_Sub1_19 = null;
	}
}
