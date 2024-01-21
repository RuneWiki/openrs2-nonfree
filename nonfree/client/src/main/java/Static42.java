import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array10 = new Class63[1000];

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_718 = Static80.method1463("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "Lclient!rd;")
	public static Class63 aClass63_719 = Static80.method1463("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lclient!rd;")
	private static Class63 aClass63_721 = Static80.method1463("glow3:");

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_720 = aClass63_721;

	@OriginalMember(owner = "client!gd", name = "wb", descriptor = "J")
	public static long aLong36 = 0L;

	@OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
	public static int anInt1320 = 0;

	@OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
	public static int anInt1321 = -1;

	@OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
	public static volatile int anInt1322 = 0;

	@OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Lclient!rd;")
	public static Class63 aClass63_722 = Static80.method1463("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!gd", name = "Nb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_723 = aClass63_721;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lclient!rd;BI)Lclient!rd;")
	public static Class63 method920(@OriginalArg(0) int arg0, @OriginalArg(1) Class63[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			if (arg1[arg2 + local7] == null) {
				arg1[local7 + arg2] = Static102.aClass63_1534;
			}
			local5 += arg1[arg2 + local7].anInt2746;
		}
		@Pc(42) byte[] local42 = new byte[local5];
		@Pc(44) int local44 = 0;
		@Pc(59) Class63 local59;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			local59 = arg1[arg2 + local51];
			Static129.method1440(local59.aByteArray33, 0, local42, local44, local59.anInt2746);
			local44 += local59.anInt2746;
		}
		local59 = new Class63();
		local59.anInt2746 = local5;
		local59.aByteArray33 = local42;
		return local59;
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public static void method922() {
		if (Static100.aClass47_4 != null) {
			Static100.aClass47_4.method1378();
			Static100.aClass47_4 = null;
		}
		Static94.method1707();
		Static76.aClass19_1.method683();
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			Static15.aClass30Array1[local14].method995();
		}
		System.gc();
		Static36.method869();
		Static64.aBoolean100 = false;
		Static56.anInt1714 = -1;
		Static30.method724();
		Static73.method1392(10);
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method925() {
		try {
			@Pc(6) Graphics local6 = Static38.aCanvas1.getGraphics();
			Static15.aClass29_5.method1428(4, 4, local6);
		} catch (@Pc(22) Exception local22) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
	public static void method926() {
		aClass63_721 = null;
		aClass63_719 = null;
		aClass63_722 = null;
		aClass63_718 = null;
		aClass63_723 = null;
		aClass63Array10 = null;
		aClass63_720 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!be;I)V")
	public static void method927(@OriginalArg(0) Class11 arg0) {
		Static54.aClass11_1 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
	public static void method929(@OriginalArg(0) boolean arg0) {
		if (Static36.anInt1217 == Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7 && Static52.anInt1599 == Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7) {
			Static36.anInt1217 = 0;
		}
		@Pc(29) int local29 = Static81.anInt2219;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(43) Class6_Sub3_Sub1_Sub2_Sub2 local43;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local43 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1;
			} else {
				local43 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[Static114.anIntArray356[local35]];
				local41 = Static114.anIntArray356[local35] << 14;
			}
			if (local43 != null && local43.method1545()) {
				local43.aBoolean120 = false;
				if ((Static61.aBoolean98 && Static81.anInt2219 > 50 || Static81.anInt2219 > 200) && !arg0 && local43.anInt2328 == local43.anInt2308) {
					local43.aBoolean120 = true;
				}
				@Pc(93) int local93 = local43.anInt2319 >> 7;
				@Pc(98) int local98 = local43.anInt2347 >> 7;
				if (local93 >= 0 && local93 < 104 && local98 >= 0 && local98 < 104) {
					if (local43.aClass6_Sub3_Sub1_Sub3_3 == null || Static73.anInt2064 < local43.anInt2368 || Static73.anInt2064 >= local43.anInt2371) {
						if ((local43.anInt2319 & 0x7F) == 64 && (local43.anInt2347 & 0x7F) == 64) {
							if (Static106.anInt2958 == Static64.anIntArrayArray27[local93][local98]) {
								continue;
							}
							Static64.anIntArrayArray27[local93][local98] = Static106.anInt2958;
						}
						local43.anInt2367 = Static110.method2038(Static101.anInt2810, local43.anInt2347, local43.anInt2319);
						Static76.aClass19_1.method657(Static101.anInt2810, local43.anInt2319, local43.anInt2347, local43.anInt2367, 60, local43, local43.anInt2301, local41, local43.aBoolean119);
					} else {
						local43.aBoolean120 = false;
						local43.anInt2367 = Static110.method2038(Static101.anInt2810, local43.anInt2347, local43.anInt2319);
						Static76.aClass19_1.method698(Static101.anInt2810, local43.anInt2319, local43.anInt2347, local43.anInt2367, local43, local43.anInt2301, local41, local43.anInt2374, local43.anInt2362, local43.anInt2370, local43.anInt2355);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I")
	public static int method932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub7 local15 = (Class6_Sub7) Static72.aClass2_8.method20((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray146.length) {
			return local15.anIntArray146[arg1];
		} else {
			return 0;
		}
	}
}
