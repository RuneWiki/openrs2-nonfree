import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
	public static int anInt4616 = 0;

	@OriginalMember(owner = "client!mr", name = "T", descriptor = "Lclient!om;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLjava/lang/String;III)V")
	public static void method3661(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class107 local8 = Static220.method3163(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray14 != null) {
			@Pc(18) Class1_Sub11 local18 = new Class1_Sub11();
			local18.aClass107_2 = local8;
			local18.anObjectArray2 = local8.anObjectArray14;
			local18.aString12 = arg0;
			local18.anInt1176 = arg1;
			Static198.method2834(local18);
		}
		if (Static135.anInt2114 != 9 || !Static55.method767(local8).method3035(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static178.method2589(Static41.aClass242_10);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 2) {
			Static178.method2589(Static403.aClass242_108);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 3) {
			Static178.method2589(Static143.aClass242_41);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 4) {
			Static178.method2589(Static19.aClass242_2);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 5) {
			Static178.method2589(Static452.aClass242_120);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 6) {
			Static178.method2589(Static87.aClass242_25);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 7) {
			Static178.method2589(Static458.aClass242_122);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 8) {
			Static178.method2589(Static240.aClass242_72);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 9) {
			Static178.method2589(Static339.aClass242_89);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
		if (arg1 == 10) {
			Static178.method2589(Static330.aClass242_88);
			Static11.method199(arg2, arg3, local8.anInt2631);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLclient!nc;)Z")
	public static boolean method3664(@OriginalArg(1) Interface7 arg0) {
		@Pc(10) Class87 local10 = Static86.aClass248_7.method5246(arg0.method4895());
		if (local10.anInt1944 == -1) {
			return true;
		} else {
			@Pc(29) Class266 local29 = Static60.aClass223_1.method4705(local10.anInt1944);
			return local29.anInt6915 == -1 ? true : local29.method5500();
		}
	}
}
