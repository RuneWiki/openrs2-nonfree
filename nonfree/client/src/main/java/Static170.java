import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
	public static int anInt1101;

	@OriginalMember(owner = "client!s", name = "eb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_13;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_14;

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_547 = Static193.method3027("hint_headicons");

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_548 = Static193.method3027("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_549 = Static193.method3027("<br>(X");

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "I")
	public static int anInt1107 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
	public static int method829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local10 << 13 ^ local10;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ke;ILclient!ke;Lclient!ke;)V")
	public static void method830(@OriginalArg(0) Class52 arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) Class52 arg2) {
		Static89.anInt671 = arg2.method1560(Static118.aClass70_1139);
		Static154.anInt3183 = arg0.method1560(Static95.aClass70_971);
		Static123.anInt2475 = arg0.method1560(Static182.aClass70_1785);
		Static96.anInt2001 = arg0.method1560(Static185.aClass70_1812);
		Static37.anInt3229 = arg0.method1560(Static2.aClass70_3);
		Static92.anInt1958 = arg0.method1560(Static67.aClass70_1537);
		Static190.anInt3870 = arg0.method1560(Static63.aClass70_611);
		Static200.anInt4076 = arg0.method1560(Static79.aClass70_791);
		Static181.anInt3672 = arg0.method1560(Static118.aClass70_1140);
		Static167.anInt3400 = arg0.method1560(Static53.aClass70_556);
		Static98.anInt2024 = arg0.method1560(Static4.aClass70_61);
		Static167.anInt3405 = arg1.method1560(Static183.aClass70_1373);
	}
}
