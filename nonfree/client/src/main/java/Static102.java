import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public static int anInt2389;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1195 = Static38.method736("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1190 = aClass71_1195;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1191 = Static38.method736("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1192 = aClass71_1191;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1193 = Static38.method736("Loaded input handler");

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1194 = aClass71_1193;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1196 = Static38.method736(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!qa;")
	public static Class54 aClass54_35 = new Class54(30);

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1197 = Static38.method736("Handel akzeptieren");

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1198 = Static38.method736("b12_full");

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1199 = Static38.method736("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1200 = Static38.method736("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!q;")
	public static RuntimeException_Sub1 method1645(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString4 = local8.aString4 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method1646() {
		Static91.anInt2117++;
		Static68.method1145(true);
		Static27.method569(true);
		Static68.method1145(false);
		Static27.method569(false);
		Static54.method977();
		Static26.method988();
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (!Static26.aBoolean59) {
			local29 = Static41.anInt1067;
			local35 = Static59.anInt1539 + Static88.anInt2060 & 0x7FF;
			if (Static66.anInt1646 / 256 > local29) {
				local29 = Static66.anInt1646 / 256;
			}
			if (Static50.aBooleanArray10[4] && Static61.anIntArray176[4] + 128 > local29) {
				local29 = Static61.anIntArray176[4] + 128;
			}
			Static103.method1651(local35, local29, Static20.anInt676, local29 * 3 + 600, Static89.anInt2077, Static26.method989(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474, Static23.anInt728, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452) - 50);
		}
		if (Static26.aBoolean59) {
			local29 = Static53.method970();
		} else {
			local29 = Static117.method1923();
		}
		local35 = Static37.anInt572;
		@Pc(99) int local99 = Static5.anInt202;
		@Pc(101) int local101 = Static31.anInt815;
		@Pc(103) int local103 = Static1.anInt1;
		@Pc(105) int local105 = Static4.anInt171;
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			if (Static50.aBooleanArray10[local107]) {
				@Pc(148) int local148 = (int) (Math.random() * (double) (Static17.anIntArray76[local107] * 2 + 1) - (double) Static17.anIntArray76[local107] + Math.sin((double) Static61.anIntArray177[local107] * ((double) Static20.anIntArray80[local107] / 100.0D)) * (double) Static61.anIntArray176[local107]);
				if (local107 == 4) {
					Static31.anInt815 += local148;
					if (Static31.anInt815 < 128) {
						Static31.anInt815 = 128;
					}
					if (Static31.anInt815 > 383) {
						Static31.anInt815 = 383;
					}
				}
				if (local107 == 3) {
					Static4.anInt171 = Static4.anInt171 + local148 & 0x7FF;
				}
				if (local107 == 0) {
					Static37.anInt572 += local148;
				}
				if (local107 == 1) {
					Static5.anInt202 += local148;
				}
				if (local107 == 2) {
					Static1.anInt1 += local148;
				}
			}
		}
		Static16.method424();
		Static11.anInt353 = 0;
		Static11.aBoolean9 = true;
		Static11.anInt357 = Static107.anInt2563 - 4;
		Static11.anInt356 = Static26.anInt1440 - 4;
		Static52.method2021();
		Static7.aClass43_1.method1101(Static37.anInt572, Static5.anInt202, Static1.anInt1, Static31.anInt815, Static4.anInt171, local29);
		Static7.aClass43_1.method1061();
		Static38.method733();
		Static33.method686();
		((Class1) Static80.anInterface3_1).method11(Static58.anInt1515);
		Static35.method713();
		if (Static97.aBoolean102 && Static47.method856() == 0) {
			Static97.aBoolean102 = false;
		}
		if (Static97.aBoolean102) {
			Static16.method424();
			Static52.method2021();
			Static5.method143(Static97.aClass71_1149, null, false);
		}
		Static115.method1802();
		Static4.anInt171 = local105;
		Static5.anInt202 = local99;
		Static37.anInt572 = local35;
		Static1.anInt1 = local103;
		Static31.anInt815 = local101;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public static void method1647() {
		aClass71_1193 = null;
		aClass71_1195 = null;
		aClass71_1194 = null;
		aClass71_1191 = null;
		aClass71_1192 = null;
		aClass71_1197 = null;
		aClass71_1198 = null;
		aClass71_1199 = null;
		aClass71_1196 = null;
		aClass71_1190 = null;
		aClass54_35 = null;
		aClass71_1200 = null;
	}
}
