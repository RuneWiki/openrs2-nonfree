import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 aClass2_Sub3_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "Lclient!ai;")
	private static Class6 aClass6_110 = Static38.method685("Loaded interfaces");

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "Lclient!ai;")
	public static Class6 aClass6_111 = aClass6_110;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	public static void method205() {
		aClass2_Sub3_Sub2_Sub4_Sub1_1 = null;
		aClass6_110 = null;
		aClass6_111 = null;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(BI)Lclient!kb;")
	public static Class2_Sub3_Sub9 method206(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub9 local10 = (Class2_Sub3_Sub9) Static140.aClass17_22.method505((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static164.aClass10_133.method1605(arg0, 8);
		local10 = new Class2_Sub3_Sub9();
		if (local20 != null) {
			local10.method1305(new Class2_Sub13(local20));
		}
		Static140.aClass17_22.method508((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)V")
	public static void method207(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static36.method641(arg0)) {
			return;
		}
		@Pc(26) Class87[] local26 = Static180.aClass87ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class87 local34 = local26[local28];
			if (local34.anObjectArray22 != null) {
				@Pc(41) Class2_Sub2 local41 = new Class2_Sub2();
				local41.aClass87_1 = local34;
				local41.anObjectArray1 = local34.anObjectArray22;
				Static145.method2248(2000000, local41);
			}
		}
	}
}
