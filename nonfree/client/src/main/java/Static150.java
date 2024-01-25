import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[Lclient!mja;")
	public static Class240[] aClass240Array1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_27 = new Class286(47, 3);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZI)Lclient!ss;")
	public static Class3_Sub48 method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub48 local5 = null;
		if (arg1 == 0) {
			local5 = Static89.method1200(Static257.aClass286_45, Static532.aClass400_3.aClass399_2);
		}
		if (arg1 == 1) {
			local5 = Static89.method1200(Static33.aClass286_10, Static532.aClass400_3.aClass399_2);
		}
		local5.aClass3_Sub28_Sub2_1.method5332(Static419.aClass133_1.method3450(82) ? 1 : 0);
		local5.aClass3_Sub28_Sub2_1.method5270(Static339.anInt5859 + arg0);
		local5.aClass3_Sub28_Sub2_1.method5292(arg2 + Static714.anInt11156);
		Static493.anInt8491 = arg0;
		Static482.anInt8391 = arg2;
		Static352.aBoolean479 = false;
		Static639.method8670();
		return local5;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	public static int method2441() {
		return 15;
	}
}
