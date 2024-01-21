import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!ta;")
	public static Class14 aClass14_36;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	public static int anInt2857;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!ac;")
	public static Class3 aClass3_26;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_13;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_25;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1402 = Static14.method2017("wave2:");

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1403 = Static14.method2017(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1404 = Static14.method2017("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1405 = Static14.method2017("backvmid3");

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1406 = aClass36_1402;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1407 = Static14.method2017("Schlie-8en");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method1992() {
		Static92.aClass2_Sub12_Sub1_3.method1427();
		@Pc(15) int local15 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = Static92.aClass2_Sub12_Sub1_3.method1418(2);
		if (local23 == 0) {
			Static115.anIntArray225[Static55.anInt2714++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (local23 == 1) {
			local42 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
			Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1552(local42, false);
			local52 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
			if (local52 == 1) {
				Static115.anIntArray225[Static55.anInt2714++] = 2047;
			}
			return;
		}
		@Pc(96) int local96;
		if (local23 == 2) {
			local42 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
			Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1552(local42, true);
			local52 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
			Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1552(local52, true);
			local96 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
			if (local96 == 1) {
				Static115.anIntArray225[Static55.anInt2714++] = 2047;
			}
		} else if (local23 == 3) {
			local42 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
			local52 = Static92.aClass2_Sub12_Sub1_3.method1418(7);
			local96 = Static92.aClass2_Sub12_Sub1_3.method1418(7);
			@Pc(131) int local131 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
			if (local131 == 1) {
				Static115.anIntArray225[Static55.anInt2714++] = 2047;
			}
			Static92.anInt2412 = Static92.aClass2_Sub12_Sub1_3.method1418(2);
			Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1549(local96, local52, local42 == 1);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method1993() {
		aClass36_1405 = null;
		aClass36_1404 = null;
		anIntArray342 = null;
		aClass3_Sub1_13 = null;
		aClass36_1403 = null;
		aClass3_26 = null;
		aClass2_Sub1_Sub1_Sub1_25 = null;
		aClass14_36 = null;
		aClass36_1406 = null;
		aClass36_1402 = null;
		aClass36_1407 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!c;ILjava/awt/Component;I)V")
	public static void method1994(@OriginalArg(1) Class11 arg0, @OriginalArg(3) Component arg1) {
		Static35.aBoolean50 = false;
		Static3.anInt1282 = 22050;
		Static59.aLong47 = Static66.method1158();
		try {
			@Pc(15) Class19_Sub1 local15 = (Class19_Sub1) Class.forName("Class19_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local15.method1271(arg1);
			local15.method1264(arg0, 2048);
			Static64.aClass19_1 = local15;
		} catch (@Pc(28) Throwable local28) {
			try {
				@Pc(33) Class19_Sub1_Sub2 local33 = new Class19_Sub1_Sub2(arg0);
				local33.method1271(arg1);
				local33.method1264(arg0, 16384);
				Static64.aClass19_1 = local33;
			} catch (@Pc(52) Throwable local52) {
				if (Static12.aString4.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static64.aClass19_1 = new Class19_Sub2();
						Static35.aBoolean50 = false;
						Static3.anInt1282 = 8000;
						return;
					} catch (@Pc(70) Throwable local70) {
					}
				}
				Static64.aClass19_1 = new Class19();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method1995(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		@Pc(4) int local4 = arg0.anInt680 >> -584946352;
		if (Static49.anInt1312 == local4 || Static39.anInt980 == local4) {
			Static115.aBoolean77 = true;
		}
		if (Static94.anInt2471 == local4 || Static101.anIntArray323[Static109.anInt2825] == local4) {
			Static100.aBoolean118 = true;
		}
	}
}
