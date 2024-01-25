import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "Lclient!au;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBI)Z")
	public static boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!dt;I)Lclient!qi;")
	public static Class294 method5113(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method7895();
		return new Class294(local7);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)V")
	public static void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998() * arg1 >> 8;
		if (arg2 == -1 && !Static501.aBoolean551) {
			Static412.method5624();
		} else if (arg2 != -1 && (arg2 != Static189.anInt3426 || !Static594.method7826()) && local17 != 0 && !Static501.aBoolean551) {
			Static276.method4049(local17, arg0, Static214.aClass362_141, arg2);
			Static115.method1733();
		}
		if (Static189.anInt3426 != arg2) {
			Static552.aClass3_Sub12_Sub3_2 = null;
		}
		Static189.anInt3426 = arg2;
	}
}
