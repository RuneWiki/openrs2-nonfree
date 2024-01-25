import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt5851;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!lb;")
	public static Class118 aClass118_4;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!qm;")
	public static Class174 aClass174_11;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt5852 = -1;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!eq;")
	public static final Class50 aClass50_4 = new Class50();

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5273(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
	public static boolean method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static368.method6084(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static153.anInt3177;
			@Pc(14) int local14 = arg2 << Static153.anInt3177;
			return Static158.method2988(local10 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg2) + arg3, local14 + 1) && Static158.method2988(local10 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg2) + arg3, local14 + 1) && Static158.method2988(local10 + Static66.anInt1552 - 1, Static258.aClass36Array2[arg0].method4431(arg1 + 1, arg2 + 1) + arg3, local14 + Static66.anInt1552 - 1) && Static158.method2988(local10 + 1, Static258.aClass36Array2[arg0].method4431(arg1, arg2 + 1) + arg3, local14 + Static66.anInt1552 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!wc;BLclient!we;IILclient!gn;I)V")
	public static void method5275(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub2_Sub6_Sub1 arg1, @OriginalArg(3) Class11_Sub2_Sub6_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class71 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class1_Sub40 local9 = new Class1_Sub40();
		local9.anInt6098 = arg3 * 128;
		local9.anInt6096 = arg6 * 128;
		local9.anInt6094 = arg4;
		if (arg5 != null) {
			local9.aClass71_1 = arg5;
			@Pc(30) int local30 = arg5.anInt2411;
			@Pc(33) int local33 = arg5.anInt2376;
			if (arg0 == 1 || arg0 == 3) {
				local33 = arg5.anInt2411;
				local30 = arg5.anInt2376;
			}
			local9.anInt6086 = arg5.anInt2401 * 128;
			local9.anIntArray472 = arg5.anIntArray180;
			local9.anInt6093 = arg5.anInt2389;
			local9.anInt6089 = (local33 + arg3) * 128;
			local9.anInt6092 = (local30 + arg6) * 128;
			local9.anInt6088 = arg5.anInt2372;
			local9.anInt6087 = arg5.anInt2392;
			local9.anInt6099 = arg5.anInt2400;
			if (arg5.anIntArray178 != null) {
				local9.aBoolean454 = true;
				local9.method5482();
			}
			if (local9.anIntArray472 != null) {
				local9.anInt6090 = (int) ((double) (local9.anInt6087 - local9.anInt6093) * Math.random()) + local9.anInt6093;
			}
			Static99.aClass42_13.method1549(local9);
		} else if (arg2 != null) {
			local9.aClass11_Sub2_Sub6_Sub2_1 = arg2;
			@Pc(126) Class208 local126 = arg2.aClass208_1;
			if (local126.anIntArray480 != null) {
				local9.aBoolean454 = true;
				local126 = local126.method5539();
			}
			if (local126 != null) {
				local9.anInt6092 = (arg6 + local126.anInt6162) * 128;
				local9.anInt6089 = (arg3 + local126.anInt6162) * 128;
				local9.anInt6099 = Static53.method1331(arg2);
				local9.anInt6088 = local126.anInt6177;
				local9.anInt6086 = local126.anInt6179 * 128;
			}
			Static136.aClass42_40.method1549(local9);
		} else if (arg1 != null) {
			local9.aClass11_Sub2_Sub6_Sub1_3 = arg1;
			local9.anInt6092 = (arg6 + arg1.method5894()) * 128;
			local9.anInt6089 = (arg1.method5894() + arg3) * 128;
			local9.anInt6099 = Static143.method2853(arg1);
			local9.anInt6086 = arg1.anInt6689 * 128;
			local9.anInt6088 = arg1.anInt6696;
			Static367.aClass38_33.method1472(local9, (long) arg1.anInt6792);
		}
	}
}
