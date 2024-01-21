import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_209 = Static181.method2795(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_210 = Static181.method2795("(Z");

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_211 = Static181.method2795("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
	public static int anInt727 = -1;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_212 = Static181.method2795("<br>");

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)Lclient!ja;")
	public static Class2_Sub13 method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub13 local7 = new Class2_Sub13();
		local7.anInt1869 = arg0;
		local7.anInt1867 = arg1;
		Static33.aClass63_3.method2115((long) arg2, local7);
		Static143.method2296(arg0);
		@Pc(31) Class5 local31 = Static74.method1401(arg2);
		if (local31 != null) {
			Static121.method2085(local31);
		}
		if (Static104.aClass5_11 != null) {
			Static121.method2085(Static104.aClass5_11);
			Static104.aClass5_11 = null;
		}
		Static98.anInt2124 = 0;
		Static159.aBoolean152 = false;
		Static124.method1906(Static162.anInt3931, Static160.anInt3230, Static43.anInt1134, Static177.anInt3624);
		if (local31 != null) {
			Static48.method960(local31);
		}
		Static211.method3200(arg0);
		if (Static138.anInt2942 != -1) {
			Static169.method2640(Static138.anInt2942, 1);
		}
		return local7;
	}
}
