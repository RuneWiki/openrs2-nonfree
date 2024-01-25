import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public static int anInt5281;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "Lclient!dp;")
	public static Class46 aClass46_8;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	public static int anInt5286;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[C")
	public static final char[] aCharArray14 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
	public static int anInt5290 = 0;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V")
	public static void method4758(@OriginalArg(0) int arg0) {
		Static101.anInt2300 = arg0;
		@Pc(7) Class119 local7 = Static119.aClass119_76;
		synchronized (Static119.aClass119_76) {
			Static119.aClass119_76.method3304();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
	public static void method4759(@OriginalArg(1) int arg0) {
		Static205.anInt3973 = arg0;
		@Pc(15) Class119 local15 = Static290.aClass119_174;
		synchronized (Static290.aClass119_174) {
			Static290.aClass119_174.method3304();
		}
		local15 = Static296.aClass119_182;
		synchronized (Static296.aClass119_182) {
			Static296.aClass119_182.method3304();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([Lclient!gj;Z)V")
	public static void method4761(@OriginalArg(0) Class31[] arg0) {
		Static326.anInt6623 = arg0.length;
		Static36.aClass31Array1 = new Class31[Static326.anInt6623 + 10];
		Static32.anIntArray40 = new int[Static326.anInt6623 + 10];
		Static359.method686(arg0, 0, Static36.aClass31Array1, 0, Static326.anInt6623);
		for (@Pc(26) int local26 = 0; local26 < Static326.anInt6623; local26++) {
			Static32.anIntArray40[local26] = Static36.aClass31Array1[local26].method4378();
		}
		for (@Pc(49) int local49 = Static326.anInt6623; local49 < Static36.aClass31Array1.length; local49++) {
			Static32.anIntArray40[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4762(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static74.aClass2_Sub10_Sub1_2.method2049(94);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0));
			Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4765(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
