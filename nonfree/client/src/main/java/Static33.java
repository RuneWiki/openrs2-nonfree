import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array5;

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "Lclient!dd;")
	private static Class13 aClass13_395 = Static161.method2971("To create a new account you need to");

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_390 = aClass13_395;

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "[I")
	public static int[] anIntArray120 = new int[128];

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "Lclient!dd;")
	private static Class13 aClass13_392 = Static161.method2971("Players");

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_391 = aClass13_392;

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_393 = Static161.method2971(":");

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_394 = Static161.method2971("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!dg", name = "Y", descriptor = "[I")
	public static int[] anIntArray121 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_396 = Static161.method2971("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
	public static int anInt1154 = 0;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_397 = Static161.method2971("::rect_debug");

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_398 = Static161.method2971(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V")
	public static void method953(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(16) Class1_Sub2_Sub12 local16 = (Class1_Sub2_Sub12) Static101.aClass45_10.method1988(local10);
		if (local16 != null) {
			Static70.aClass79_1.method2671(local16);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	public static void method954() {
		aClass13_397 = null;
		aClass1_Sub2_Sub1_Sub3Array5 = null;
		aClass13_393 = null;
		aClass13_392 = null;
		aClass13_390 = null;
		anIntArray120 = null;
		aClass13_394 = null;
		aClass13_395 = null;
		aClass13_396 = null;
		aClass13_391 = null;
		aClass13_398 = null;
		anIntArray121 = null;
	}
}
