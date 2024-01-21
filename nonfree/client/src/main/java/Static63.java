import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_13;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 aClass5_Sub2_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!r;")
	private static Class61 aClass61_483 = Static129.method2060(" has logged in)3");

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_482 = aClass61_483;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public static int anInt1553 = 0;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!r;")
	public static Class61 aClass61_484 = Static129.method2060("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "Lclient!r;")
	public static Class61 aClass61_485 = Static129.method2060("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1082() {
		Static85.aFontMetrics1 = null;
		Static105.aFont32 = null;
		Static31.anImage1 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([Lclient!ke;II)V")
	public static void method1084(@OriginalArg(0) Class5_Sub11[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class5_Sub11 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt1669 == 0) {
					if (local9.aClass5_Sub11Array1 != null) {
						method1084(local9.aClass5_Sub11Array1, arg1);
					}
					@Pc(30) Class5_Sub13 local30 = (Class5_Sub13) Static28.aClass20_3.method656((long) local9.anInt1614);
					if (local30 != null) {
						Static98.method1662(arg1, local30.anInt2013);
					}
				}
				@Pc(49) Class5_Sub22 local49;
				if (arg1 == 0 && local9.anObjectArray8 != null) {
					local49 = new Class5_Sub22();
					local49.aClass5_Sub11_12 = local9;
					local49.anObjectArray28 = local9.anObjectArray8;
					Static76.method1228(local49);
				}
				if (arg1 == 1 && local9.anObjectArray3 != null) {
					if (local9.anInt1645 >= 0) {
						@Pc(75) Class5_Sub11 local75 = Static88.method2191(local9.anInt1614);
						if (local75 == null || local75.aClass5_Sub11Array1 == null || local75.aClass5_Sub11Array1.length <= local9.anInt1645 || local75.aClass5_Sub11Array1[local9.anInt1645] != local9) {
							continue;
						}
					}
					local49 = new Class5_Sub22();
					local49.aClass5_Sub11_12 = local9;
					local49.anObjectArray28 = local9.anObjectArray3;
					Static76.method1228(local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public static void method1085() {
		aClass61_483 = null;
		aClass61_482 = null;
		aClass26_Sub1_13 = null;
		aClass61_484 = null;
		aClass5_Sub2_Sub1_Sub1_Sub1_3 = null;
		aClass61_485 = null;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1086() {
		if (Static127.aClass44_1 != null) {
			@Pc(3) Class44 local3 = Static127.aClass44_1;
			synchronized (Static127.aClass44_1) {
				Static127.aClass44_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method1087() {
		Static120.aClass29_26.method765();
	}
}
