import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public static int anInt4642;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!iq;")
	public static Class104 aClass104_119;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!go;")
	public static Class82 aClass82_7;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_28 = new Class107(4);

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_135 = new Class157(63, 8);

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "J")
	public static long aLong139 = -1L;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!dr;Lclient!la;III)V")
	public static void method3996(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class51 local12;
		if (arg3 < Static344.anInt6692) {
			local12 = Static196.aClass51ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method5759()) {
				arg1.method5762(true, local12.aClass1_Sub4_1, Static6.anInt96, 0, 0, arg0);
			}
		}
		if (arg4 < Static344.anInt6692) {
			local12 = Static196.aClass51ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method5759()) {
				arg1.method5762(true, local12.aClass1_Sub4_1, 0, 0, Static6.anInt96, arg0);
			}
		}
		if (arg3 < Static344.anInt6692 && arg4 < Static63.anInt1129) {
			local12 = Static196.aClass51ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method5759()) {
				arg1.method5762(true, local12.aClass1_Sub4_1, Static6.anInt96, 0, Static6.anInt96, arg0);
			}
		}
		if (arg3 < Static344.anInt6692 && arg4 > 0) {
			local12 = Static196.aClass51ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass1_Sub4_1 != null && local12.aClass1_Sub4_1.method5759()) {
				arg1.method5762(true, local12.aClass1_Sub4_1, Static6.anInt96, 0, -Static6.anInt96, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method3997() {
		if (Static51.aClass37_1 == null) {
			return;
		}
		Static45.aClass193_4.method5218();
		Static79.method1604();
		Static81.method1661();
		Static215.method4077();
		Static186.method3505();
		Static355.method5681();
		if (Static11.aClass162_1 != null) {
			Static11.aClass162_1.method4653();
		}
		Static54.method1200();
		Static51.method1022();
		Static328.method5598();
		Static251.method4441(false);
		Static204.method3872();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class1_Sub2_Sub3_Sub1 local47 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local41];
			if (local47 != null) {
				local47.aClass2_Sub25_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass49Array3.length; local54++) {
					local47.aClass49Array3[local54] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static95.aClass1_Sub2_Sub3_Sub2Array1.length; local75++) {
			@Pc(81) Class1_Sub2_Sub3_Sub2 local81 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass49Array3.length; local85++) {
					local81.aClass49Array3[local85] = null;
				}
			}
		}
		Static51.aClass37_1.method3699();
		Static51.aClass37_1 = null;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method3998() {
		@Pc(13) Class107 local13 = Static135.aClass107_12;
		synchronized (Static135.aClass107_12) {
			Static135.aClass107_12.method3015();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method4000(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static145.method2834(arg0.length - 1, arg0, arg1, 0);
	}
}
