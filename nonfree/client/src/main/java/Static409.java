import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!or", name = "D", descriptor = "I")
	public static int anInt3104;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "Lclient!it;")
	public static Class28 aClass28_7;

	@OriginalMember(owner = "client!or", name = "B", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_9 = new Class273(8);

	@OriginalMember(owner = "client!or", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[6][];

	@OriginalMember(owner = "client!or", name = "F", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method2683(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(3, arg0);
		local8.method8958();
		local8.aString106 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZIB)Lclient!ii;")
	public static Class5_Sub27 method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class5_Sub27 local7 = new Class5_Sub27();
		local7.anInt4270 = arg0;
		local7.anInt4272 = arg1;
		Static269.aClass273_11.method6585((long) arg3, local7);
		Static418.method6379(arg0);
		@Pc(26) Class295 local26 = Static107.method9049(arg3);
		if (local26 != null) {
			Static465.method6901(local26);
		}
		if (Static69.aClass295_5 != null) {
			Static465.method6901(Static69.aClass295_5);
			Static69.aClass295_5 = null;
		}
		Static10.method206();
		if (local26 != null) {
			Static22.method259(!arg2, local26);
		}
		if (!arg2) {
			Static370.method5466(arg0);
		}
		if (!arg2 && Static337.anInt5727 != -1) {
			Static441.method6684(1, Static337.anInt5727);
		}
		return local7;
	}
}
