import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_114 = new Class123(5, 0);

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_38 = new Class92(79, 2);

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_30 = new Class267("K", "T", "K", "K");

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt2233 = 0;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
	public static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString15 = "";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1835() {
		Static106.method1876(Static291.aClass28_Sub1_1.aBoolean73);
		Static220.aClass6_Sub4_Sub2_1 = new Class6_Sub4_Sub2();
		Static220.aClass6_Sub4_Sub2_1.method729();
		Static352.aClass2_2 = Static84.method1577(0, 22050, Static280.aCanvas3, Static45.aClass209_127);
		Static352.aClass2_2.method362(Static220.aClass6_Sub4_Sub2_1);
		Static253.method4333(Static101.aClass100_13, Static298.aClass100_55, Static220.aClass6_Sub4_Sub2_1, Static212.aClass100_40);
		Static116.aClass2_1 = Static84.method1577(1, 2048, Static280.aCanvas3, Static45.aClass209_127);
		Static360.aClass6_Sub4_Sub4_2 = new Class6_Sub4_Sub4();
		Static116.aClass2_1.method362(Static360.aClass6_Sub4_Sub4_2);
		Static9.aClass14_1 = new Class14(22050, Static275.anInt4927);
		Static188.anInt3654 = Static263.aClass100_51.method2494("scape main");
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!he;Lclient!he;)I")
	public static int method1837(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2492(Static146.anInt2984)) {
			local5++;
		}
		if (arg0.method2492(Static72.anInt1877)) {
			local5++;
		}
		if (arg0.method2492(Static57.anInt1548)) {
			local5++;
		}
		if (arg1.method2492(Static146.anInt2984)) {
			local5++;
		}
		if (arg1.method2492(Static72.anInt1877)) {
			local5++;
		}
		if (arg1.method2492(Static57.anInt1548)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFIF)F")
	public static float method1838(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return (arg0 - arg2) * arg1 + arg2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I")
	public static int method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static194.method3060(local17, local7);
		@Pc(35) int local35 = Static194.method3060(local17, local7 + 1);
		@Pc(42) int local42 = Static194.method3060(local17 + 1, local7);
		@Pc(51) int local51 = Static194.method3060(local17 + 1, local7 - -1);
		@Pc(63) int local63 = Static88.method4155(arg2, local28, local35, local13);
		@Pc(70) int local70 = Static88.method4155(arg2, local42, local51, local13);
		return Static88.method4155(arg2, local63, local70, local23);
	}
}
