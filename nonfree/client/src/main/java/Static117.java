import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "Lclient!ac;")
	public static Class3 aClass3_19;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static volatile int anInt1917 = 0;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "Lclient!kc;")
	private static Class36 aClass36_904 = Static14.method2017("Examine");

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!kc;")
	public static Class36 aClass36_903 = aClass36_904;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "[I")
	public static int[] anIntArray235 = new int[4000];

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
	public static int anInt1947 = -1;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_905 = Static14.method2017("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!kc;")
	public static Class36 aClass36_906 = Static14.method2017("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_907 = Static14.method2017("Continue");

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_908 = Static14.method2017("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_909 = aClass36_907;

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!kc;Lclient!kc;Lclient!ac;B)Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 method1370(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class3 arg2) {
		@Pc(4) int local4 = arg2.method932(arg1);
		@Pc(14) int local14 = arg2.method936(local4, arg0);
		return Static14.method2022(local14, arg2, local4);
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(I)V")
	public static void method1386() {
		if (Static57.aClass51_3 != null) {
			Static57.aClass51_3.method1483();
			Static57.aClass51_3 = null;
		}
		Static15.method273();
		Static85.aClass61_1.method1703();
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			Static11.aClass4Array1[local27].method129();
		}
		System.gc();
		Static113.method2044();
		Static22.anInt579 = -1;
		Static118.anInt3000 = 0;
		Static107.method1943();
		Static104.method1914(10);
	}

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "(I)V")
	public static void method1415() {
		aClass3_19 = null;
		aClass36_904 = null;
		aClass36_903 = null;
		aClass36_906 = null;
		aClass36_905 = null;
		aClass36_909 = null;
		aClass36_908 = null;
		anIntArray235 = null;
		aClass36_907 = null;
	}
}
