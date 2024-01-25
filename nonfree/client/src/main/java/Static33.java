import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!ug;")
	public static Class1_Sub28 aClass1_Sub28_1;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_19 = new Class103(80, 7);

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt530 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!fo;Lclient!fo;Lclient!fo;Lclient!fo;)V")
	public static void method427(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) Class82 arg3) {
		Static110.aClass82_30 = arg3;
		Static329.aClass82_75 = arg1;
		Static135.aClass82_36 = arg2;
		Static359.aClass82_84 = arg0;
		Static87.aClass124ArrayArray7 = new Class124[Static359.aClass82_84.method1825()][];
		Static288.aBooleanArray16 = new boolean[Static359.aClass82_84.method1825()];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZI)Lclient!dn;")
	public static Class1_Sub14 method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub14 local7 = new Class1_Sub14();
		local7.anInt1425 = arg0;
		local7.anInt1427 = arg1;
		Static94.aClass199_54.method4383((long) arg3, local7);
		Static106.method1699(arg0);
		@Pc(28) Class124 local28 = Static412.method5315(arg3);
		if (local28 != null) {
			Static160.method2323(local28);
		}
		if (Static395.aClass124_11 != null) {
			Static160.method2323(Static395.aClass124_11);
			Static395.aClass124_11 = null;
		}
		Static166.method2383();
		if (local28 != null) {
			Static177.method2498(local28, !arg2);
		}
		if (!arg2) {
			Static298.method4073(arg0);
		}
		if (!arg2 && Static207.anInt6026 != -1) {
			Static363.method4852(1, Static207.anInt6026);
		}
		return local7;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZ)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class1_Sub43 local16 = Static346.method4702(arg0, arg1);
		if (local16 != null) {
			local16.method5915();
		}
	}
}
