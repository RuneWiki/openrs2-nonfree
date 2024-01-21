import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array2;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Lclient!ea;")
	public static Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!af", name = "U", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!af;")
	private static Class5 aClass5_109 = Static45.method1937("Loaded sprites");

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_110 = aClass5_109;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method190() {
		aClass5_110 = null;
		aClass5_109 = null;
		aClass1_Sub3_Sub1_Sub2Array2 = null;
		aClass17_1 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)I")
	public static int method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg3;
			arg3 = arg1;
			arg1 = local16;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 8 - arg3 - arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;Lclient!af;Lclient!kb;B)Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 method216(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class41 arg2) {
		@Pc(12) int local12 = arg2.method1724(arg0);
		@Pc(18) int local18 = arg2.method1698(arg1, local12);
		return Static62.method1715(arg2, local18, local12);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!of;)I")
	public static int method221(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(17) Class1_Sub21 local17 = (Class1_Sub21) Static48.aClass7_4.method287(((long) arg0.anInt2248 << 32) + (long) arg0.anInt2249);
		return local17 == null ? arg0.anInt2302 : local17.anInt2619;
	}
}
