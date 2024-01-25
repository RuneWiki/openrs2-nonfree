import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLjava/lang/String;III)V")
	public static void method1251(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class299 local8 = Static384.method5875(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(19) Class14_Sub10 local19 = new Class14_Sub10();
			local19.anInt1054 = arg1;
			local19.anObjectArray1 = local8.anObjectArray15;
			local19.aString20 = arg0;
			local19.aClass299_2 = local8;
			Static672.method9304(local19);
		}
		if (Static387.anInt9114 != 11 || !Static80.method1360(local8).method479(arg1 - 1)) {
			return;
		}
		@Pc(73) Class14_Sub54 local73;
		if (arg1 == 1) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static544.aClass251_231);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 2) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static423.aClass251_174);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 3) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static66.aClass251_33);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 4) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static15.aClass251_9);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 5) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static36.aClass251_23);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 6) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static101.aClass251_59);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 7) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static69.aClass251_36);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 8) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static12.aClass251_8);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 9) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static43.aClass251_25);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
		if (arg1 == 10) {
			local73 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static3.aClass251_1);
			Static682.method9411(arg3, local73, arg2, local8.anInt8621);
			Static277.aClass347_2.method8308(local73);
		}
	}
}
