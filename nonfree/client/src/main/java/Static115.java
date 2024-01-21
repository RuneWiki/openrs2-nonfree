import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt2953;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1730 = Static15.method178("overlay_multiway");

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1731 = Static15.method178("::noclip");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public static int anInt2955 = 0;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1732 = Static15.method178("hitmarks");

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1733 = Static15.method178("backtop1");

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1734 = Static15.method178("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1735 = Static15.method178("Titelbild geladen)3");

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1736 = Static15.method178("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!we", name = "C", descriptor = "I")
	public static int anInt2966 = -1;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1737 = Static15.method178("Connection timed out)3");

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1738 = aClass23_1737;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!rb;Ljava/awt/Component;ILclient!rb;)V")
	public static void method1936(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class55 arg2) {
		if (Static80.aBoolean106) {
			return;
		}
		Static98.aClass34_71 = Static114.method1928(128, arg1, 265);
		Static24.method1576();
		Static2.aClass34_63 = Static114.method1928(128, arg1, 265);
		Static24.method1576();
		Static18.aClass34_14 = Static114.method1928(509, arg1, 171);
		Static24.method1576();
		Static99.aClass34_72 = Static114.method1928(360, arg1, 132);
		Static24.method1576();
		Static17.aClass34_12 = Static114.method1928(360, arg1, 200);
		Static24.method1576();
		Static45.aClass34_40 = Static114.method1928(202, arg1, 238);
		Static24.method1576();
		Static109.aClass34_82 = Static114.method1928(203, arg1, 238);
		Static24.method1576();
		Static76.aClass34_57 = Static114.method1928(74, arg1, 94);
		Static24.method1576();
		Static95.aClass34_69 = Static114.method1928(75, arg1, 94);
		Static24.method1576();
		@Pc(81) byte[] local81 = arg0.method1879(Static76.aClass23_1213, Static109.aClass23_1683);
		@Pc(87) Class1_Sub1_Sub6_Sub1 local87 = new Class1_Sub1_Sub6_Sub1(local81, arg1);
		Static98.aClass34_71.method1138();
		local87.method793(0, 0);
		Static2.aClass34_63.method1138();
		local87.method793(-637, 0);
		Static18.aClass34_14.method1138();
		local87.method793(-128, 0);
		Static99.aClass34_72.method1138();
		local87.method793(-202, -371);
		Static17.aClass34_12.method1138();
		local87.method793(-202, -171);
		Static45.aClass34_40.method1138();
		local87.method793(0, -265);
		Static109.aClass34_82.method1138();
		local87.method793(-562, -265);
		Static76.aClass34_57.method1138();
		local87.method793(-128, -171);
		Static95.aClass34_69.method1138();
		local87.method793(-562, -171);
		@Pc(154) int[] local154 = new int[local87.anInt1334];
		@Pc(159) int local159;
		@Pc(190) int local190;
		for (@Pc(156) int local156 = 0; local156 < local87.anInt1330; local156++) {
			for (local159 = 0; local159 < local87.anInt1334; local159++) {
				local154[local159] = local87.anIntArray155[local87.anInt1334 + local156 * local87.anInt1334 - local159 - 1];
			}
			for (local190 = 0; local190 < local87.anInt1334; local190++) {
				local87.anIntArray155[local156 * local87.anInt1334 + local190] = local154[local190];
			}
		}
		Static98.aClass34_71.method1138();
		local87.method793(382, 0);
		Static2.aClass34_63.method1138();
		local87.method793(-255, 0);
		Static18.aClass34_14.method1138();
		local87.method793(254, 0);
		Static99.aClass34_72.method1138();
		local87.method793(180, -371);
		Static17.aClass34_12.method1138();
		local87.method793(180, -171);
		Static45.aClass34_40.method1138();
		local87.method793(382, -265);
		Static109.aClass34_82.method1138();
		local87.method793(-180, -265);
		Static76.aClass34_57.method1138();
		local87.method793(254, -171);
		Static95.aClass34_69.method1138();
		local87.method793(-180, -171);
		local87 = Static107.method1815(Static76.aClass23_1213, Static63.aClass23_1091, arg2);
		Static18.aClass34_14.method1138();
		local87.method798(382 - local87.anInt1334 / 2 - 128, 18);
		Static110.aClass1_Sub1_Sub6_Sub3_24 = Static70.method1143(arg2, Static76.aClass23_1213, Static25.aClass23_435);
		Static18.aClass1_Sub1_Sub6_Sub3_5 = Static70.method1143(arg2, Static76.aClass23_1213, Static27.aClass23_473);
		Static12.aClass1_Sub1_Sub6_Sub3Array9 = Static49.method896(Static76.aClass23_1213, arg2, Static31.aClass23_525);
		Static50.aClass1_Sub1_Sub6_Sub1_5 = new Class1_Sub1_Sub6_Sub1(128, 265);
		Static9.aClass1_Sub1_Sub6_Sub1_1 = new Class1_Sub1_Sub6_Sub1(128, 265);
		for (local159 = 0; local159 < 33920; local159++) {
			Static50.aClass1_Sub1_Sub6_Sub1_5.anIntArray155[local159] = Static98.aClass34_71.anIntArray210[local159];
		}
		for (local190 = 0; local190 < 33920; local190++) {
			Static9.aClass1_Sub1_Sub6_Sub1_1.anIntArray155[local190] = Static2.aClass34_63.anIntArray210[local190];
		}
		Static46.anIntArray183 = new int[256];
		for (@Pc(364) int local364 = 0; local364 < 64; local364++) {
			Static46.anIntArray183[local364] = local364 * 262144;
		}
		for (@Pc(379) int local379 = 0; local379 < 64; local379++) {
			Static46.anIntArray183[local379 + 64] = local379 * 1024 + 16711680;
		}
		for (@Pc(396) int local396 = 0; local396 < 64; local396++) {
			Static46.anIntArray183[local396 + 128] = local396 * 4 + 16776960;
		}
		for (@Pc(415) int local415 = 0; local415 < 64; local415++) {
			Static46.anIntArray183[local415 + 192] = 16777215;
		}
		Static9.anIntArray40 = new int[256];
		for (@Pc(433) int local433 = 0; local433 < 64; local433++) {
			Static9.anIntArray40[local433] = local433 * 1024;
		}
		for (@Pc(448) int local448 = 0; local448 < 64; local448++) {
			Static9.anIntArray40[local448 + 64] = local448 * 4 + 65280;
		}
		for (@Pc(465) int local465 = 0; local465 < 64; local465++) {
			Static9.anIntArray40[local465 + 128] = local465 * 262144 + 65535;
		}
		for (@Pc(482) int local482 = 0; local482 < 64; local482++) {
			Static9.anIntArray40[local482 + 192] = 16777215;
		}
		Static97.anIntArray344 = new int[256];
		for (@Pc(500) int local500 = 0; local500 < 64; local500++) {
			Static97.anIntArray344[local500] = local500 * 4;
		}
		for (@Pc(515) int local515 = 0; local515 < 64; local515++) {
			Static97.anIntArray344[local515 + 64] = local515 * 262144 + 255;
		}
		for (@Pc(532) int local532 = 0; local532 < 64; local532++) {
			Static97.anIntArray344[local532 + 128] = local532 * 1024 + 16711935;
		}
		for (@Pc(552) int local552 = 0; local552 < 64; local552++) {
			Static97.anIntArray344[local552 + 192] = 16777215;
		}
		Static50.anIntArray186 = new int[256];
		Static28.anIntArray261 = new int[32768];
		Static1.anIntArray9 = new int[32768];
		Static25.method412(null);
		Static76.aClass23_1212 = Static76.aClass23_1213;
		Static44.anIntArray176 = new int[32768];
		Static76.aClass23_1218 = Static76.aClass23_1213;
		Static64.anInt1940 = 0;
		Static64.anIntArray227 = new int[32768];
		if (Static13.anInt232 == 0 || Static9.aBoolean7) {
			Static77.method1342();
		} else {
			Static77.method1349(Static13.anInt232, Static76.aClass23_1213, Static42.aClass55_Sub1_7, Static104.aClass23_1526);
		}
		Static94.method1611(false);
		Static54.aBoolean86 = true;
		Static80.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!vd;")
	public static Class1_Sub1_Sub17 method1938(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static31.aClass5_25.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static43.aClass55_21.method1867(arg0, 3);
		local10 = new Class1_Sub1_Sub17();
		if (local20 != null) {
			local10.method1836(new Class1_Sub5(local20));
		}
		Static31.aClass5_25.method97(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method1939() {
		aClass23_1736 = null;
		aClass23_1737 = null;
		aClass23_1730 = null;
		aClass23_1733 = null;
		aClass23_1738 = null;
		aClass23_1732 = null;
		aClass23_1735 = null;
		aClass23_1734 = null;
		aClass23_1731 = null;
	}
}
