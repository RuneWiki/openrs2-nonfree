import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "J")
	public static long aLong34;

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "I")
	public static int anInt1191;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lclient!he;")
	public static Class26 aClass26_605 = Static6.method100("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "Lclient!he;")
	public static Class26 aClass26_606 = Static6.method100("");

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "Lclient!he;")
	public static Class26 aClass26_607 = Static6.method100("title_mute");

	@OriginalMember(owner = "client!ga", name = "zb", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!ga", name = "Ib", descriptor = "Lclient!he;")
	private static Class26 aClass26_609 = Static6.method100(" has logged in)3");

	@OriginalMember(owner = "client!ga", name = "Ab", descriptor = "Lclient!he;")
	public static Class26 aClass26_608 = aClass26_609;

	@OriginalMember(owner = "client!ga", name = "Lb", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!ga", name = "Mb", descriptor = "Lclient!he;")
	public static Class26 aClass26_610 = Static6.method100("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method729() {
		aClass26_607 = null;
		aClass26_610 = null;
		aClass26_608 = null;
		aClass26_609 = null;
		aBooleanArray12 = null;
		aClass26_606 = null;
		aClass26_605 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZLclient!qa;)V")
	public static void method730(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		@Pc(6) int local6 = arg1.anInt2552;
		@Pc(10) int local10 = (int) arg1.aLong100;
		arg1.method2201();
		if (arg0) {
			Static87.method1626(local6);
		}
		Static22.method488(local6);
		@Pc(25) Class3_Sub14 local25 = Static100.method2212(local10);
		if (local25 != null) {
			Static110.method2004(local25);
		}
		Static56.anInt1695 = 0;
		Static109.aBoolean162 = false;
		Static118.method2126(Static7.anInt188, Static103.anInt2776, Static118.anInt3105, Static69.anInt2516);
		if (Static32.anInt1048 != -1) {
			Static96.method1776(1, Static32.anInt1048);
		}
	}
}
