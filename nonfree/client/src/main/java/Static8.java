import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_63 = Static38.method685("::gc");

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_64 = Static38.method685("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!ai;")
	private static Class6 aClass6_65 = Static38.method685("Bad session id)3");

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_66 = aClass6_65;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!ai;")
	private static Class6 aClass6_68 = Static38.method685("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_67 = aClass6_68;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "Lclient!ai;")
	public static Class6 aClass6_69 = Static38.method685("rot:");

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	public static int anInt161 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)I")
	public static int method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class2_Sub3_Sub2_Sub2.anIntArray207[arg1 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local15) >> 16) + (arg2 * local15 >> 16);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIB)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static46.anInt1322 < 2 && Static122.anInt2841 == 0 && !Static26.aBoolean28) {
			return;
		}
		@Pc(49) Class6 local49;
		if (Static122.anInt2841 == 1 && Static46.anInt1322 < 2) {
			local49 = Static58.method956(new Class6[] { Static28.aClass6_201, Static52.aClass6_404, Static128.aClass6_856, Static163.aClass6_1141 });
		} else if (Static26.aBoolean28 && Static46.anInt1322 < 2) {
			local49 = Static58.method956(new Class6[] { Static3.aClass6_29, Static52.aClass6_404, Static27.aClass6_194, Static163.aClass6_1141 });
		} else {
			local49 = Static29.method517(Static46.anInt1322 - 1);
		}
		if (Static46.anInt1322 > 2) {
			local49 = Static58.method956(new Class6[] { local49, Static82.aClass6_614, Static106.method2806(Static46.anInt1322 - 2), Static69.aClass6_516 });
		}
		@Pc(138) int local138 = Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2502(local49, arg1 + 4, arg0 + 15, Static34.aRandom1, Static180.anInt4190);
		Static133.method2089(arg1 + 4, Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2516(local49) + local138, 15, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public static void method100() {
		aClass6_64 = null;
		aClass6_63 = null;
		aClass6_69 = null;
		aClass6_66 = null;
		aClass6_68 = null;
		aClass6_67 = null;
		aClass6_65 = null;
	}
}
