import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
	public static int anInt1700;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array9 = new Class62[5];

	@OriginalMember(owner = "client!ma", name = "Ab", descriptor = "Lclient!v;")
	private static Class62 aClass62_750 = Static45.method753("This computers address has been blocked");

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_740 = aClass62_750;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	public static volatile int anInt1701 = 0;

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "Lclient!v;")
	private static Class62 aClass62_741 = Static45.method753("Connecting to update server");

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "Lclient!v;")
	private static Class62 aClass62_749 = Static45.method753("Loading game screen )2 ");

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_742 = aClass62_749;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "Lclient!v;")
	public static Class62 aClass62_743 = Static45.method753("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "Lclient!v;")
	private static Class62 aClass62_744 = Static45.method753("glow1:");

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "[I")
	public static int[] anIntArray174 = new int[2000];

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "Lclient!v;")
	private static Class62 aClass62_745 = Static45.method753("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_746 = aClass62_741;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_747 = aClass62_744;

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
	public static int anInt1706 = 0;

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lclient!v;")
	public static Class62 aClass62_748 = aClass62_745;

	@OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!ma", name = "Bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_751 = Static45.method753("::hiddenbuttontest");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z")
	public static boolean method1043(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public static void method1044() {
		if (Static92.aBoolean151 && Static27.anInt818 != Static51.anInt2321) {
			Static28.method578(Static27.anInt818, Static41.anInt1203, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], Static76.anInt2059, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0]);
		} else if (Static27.anInt818 != Static41.anInt1202) {
			Static41.anInt1202 = Static27.anInt818;
			Static100.method1587(Static27.anInt818);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!mb;Ljava/awt/Component;BLclient!mb;)V")
	public static void method1045(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class42 arg2) {
		if (Static17.aBoolean172) {
			return;
		}
		Static46.aClass9_26 = Static63.method1509(arg1, 265, 128);
		Static97.method1734();
		Static2.aClass9_1 = Static63.method1509(arg1, 265, 128);
		Static97.method1734();
		Static21.aClass9_12 = Static63.method1509(arg1, 171, 509);
		Static97.method1734();
		Static96.aClass9_50 = Static63.method1509(arg1, 132, 360);
		Static97.method1734();
		Static85.aClass9_44 = Static63.method1509(arg1, 200, 360);
		Static97.method1734();
		Static38.aClass9_21 = Static63.method1509(arg1, 238, 202);
		Static97.method1734();
		Static106.aClass9_54 = Static63.method1509(arg1, 238, 203);
		Static97.method1734();
		Static16.aClass9_10 = Static63.method1509(arg1, 94, 74);
		Static97.method1734();
		Static55.aClass9_29 = Static63.method1509(arg1, 94, 75);
		Static97.method1734();
		@Pc(77) byte[] local77 = arg2.method1506(Static74.aClass62_874, Static40.aClass62_503);
		@Pc(83) Class3_Sub1_Sub1_Sub4 local83 = new Class3_Sub1_Sub1_Sub4(local77, arg1);
		Static46.aClass9_26.method682();
		local83.method1752(0, 0);
		Static2.aClass9_1.method682();
		local83.method1752(-637, 0);
		Static21.aClass9_12.method682();
		local83.method1752(-128, 0);
		Static96.aClass9_50.method682();
		local83.method1752(-202, -371);
		Static85.aClass9_44.method682();
		local83.method1752(-202, -171);
		Static38.aClass9_21.method682();
		local83.method1752(0, -265);
		Static106.aClass9_54.method682();
		local83.method1752(-562, -265);
		Static16.aClass9_10.method682();
		local83.method1752(-128, -171);
		Static55.aClass9_29.method682();
		local83.method1752(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt2686];
		@Pc(156) int local156;
		@Pc(184) int local184;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt2685; local152++) {
			for (local156 = 0; local156 < local83.anInt2686; local156++) {
				local150[local156] = local83.anIntArray306[local83.anInt2686 + local83.anInt2686 * local152 - local156 - 1];
			}
			for (local184 = 0; local184 < local83.anInt2686; local184++) {
				local83.anIntArray306[local83.anInt2686 * local152 + local184] = local150[local184];
			}
		}
		Static46.aClass9_26.method682();
		local83.method1752(382, 0);
		Static2.aClass9_1.method682();
		local83.method1752(-255, 0);
		Static21.aClass9_12.method682();
		local83.method1752(254, 0);
		Static96.aClass9_50.method682();
		local83.method1752(180, -371);
		Static85.aClass9_44.method682();
		local83.method1752(180, -171);
		Static38.aClass9_21.method682();
		local83.method1752(382, -265);
		Static106.aClass9_54.method682();
		local83.method1752(-180, -265);
		Static16.aClass9_10.method682();
		local83.method1752(254, -171);
		Static55.aClass9_29.method682();
		local83.method1752(-180, -171);
		local83 = Static54.method1800(Static74.aClass62_874, arg0, Static52.aClass62_494);
		Static21.aClass9_12.method682();
		local83.method1751(382 - local83.anInt2686 / 2 - 128, 18);
		Static2.aClass3_Sub1_Sub1_Sub1_2 = Static98.method1652(Static96.aClass62_1170, arg0, Static74.aClass62_874);
		Static64.aClass3_Sub1_Sub1_Sub1_17 = Static98.method1652(Static14.aClass62_215, arg0, Static74.aClass62_874);
		Static21.aClass3_Sub1_Sub1_Sub1Array1 = Static61.method1031(Static95.aClass62_1154, Static74.aClass62_874, arg0);
		Static80.aClass3_Sub1_Sub1_Sub4_4 = new Class3_Sub1_Sub1_Sub4(128, 265);
		Static78.aClass3_Sub1_Sub1_Sub4_3 = new Class3_Sub1_Sub1_Sub4(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static80.aClass3_Sub1_Sub1_Sub4_4.anIntArray306[local156] = Static46.aClass9_26.anIntArray81[local156];
		}
		for (local184 = 0; local184 < 33920; local184++) {
			Static78.aClass3_Sub1_Sub1_Sub4_3.anIntArray306[local184] = Static2.aClass9_1.anIntArray81[local184];
		}
		Static72.anIntArray206 = new int[256];
		for (@Pc(364) int local364 = 0; local364 < 64; local364++) {
			Static72.anIntArray206[local364] = local364 * 262144;
		}
		for (@Pc(380) int local380 = 0; local380 < 64; local380++) {
			Static72.anIntArray206[local380 + 64] = local380 * 1024 + 16711680;
		}
		for (@Pc(401) int local401 = 0; local401 < 64; local401++) {
			Static72.anIntArray206[local401 + 128] = local401 * 4 + 16776960;
		}
		for (@Pc(426) int local426 = 0; local426 < 64; local426++) {
			Static72.anIntArray206[local426 + 192] = 16777215;
		}
		Static93.anIntArray274 = new int[256];
		for (@Pc(445) int local445 = 0; local445 < 64; local445++) {
			Static93.anIntArray274[local445] = local445 * 1024;
		}
		for (@Pc(461) int local461 = 0; local461 < 64; local461++) {
			Static93.anIntArray274[local461 + 64] = local461 * 4 + 65280;
		}
		for (@Pc(482) int local482 = 0; local482 < 64; local482++) {
			Static93.anIntArray274[local482 + 128] = local482 * 262144 + 65535;
		}
		for (@Pc(501) int local501 = 0; local501 < 64; local501++) {
			Static93.anIntArray274[local501 + 192] = 16777215;
		}
		Static65.anIntArray184 = new int[256];
		for (@Pc(518) int local518 = 0; local518 < 64; local518++) {
			Static65.anIntArray184[local518] = local518 * 4;
		}
		for (@Pc(534) int local534 = 0; local534 < 64; local534++) {
			Static65.anIntArray184[local534 + 64] = local534 * 262144 + 255;
		}
		for (@Pc(553) int local553 = 0; local553 < 64; local553++) {
			Static65.anIntArray184[local553 + 128] = local553 * 1024 + 16711935;
		}
		for (@Pc(571) int local571 = 0; local571 < 64; local571++) {
			Static65.anIntArray184[local571 + 192] = 16777215;
		}
		Static99.anIntArray284 = new int[256];
		Static75.anIntArray229 = new int[32768];
		Static102.anIntArray292 = new int[32768];
		Static95.method1611(null);
		Static72.anIntArray204 = new int[32768];
		Static19.anInt2835 = 0;
		Static74.aClass62_867 = Static74.aClass62_874;
		Static15.anIntArray46 = new int[32768];
		Static74.aClass62_875 = Static74.aClass62_874;
		if (Static44.anInt1234 == 0 || Static92.aBoolean151) {
			Static92.method1555();
		} else {
			Static92.method1545(Static14.aClass62_218, Static74.aClass62_874, Static44.anInt1234, Static79.aClass42_Sub1_46);
		}
		Static45.method752(false);
		Static17.aBoolean172 = true;
		Static69.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public static void method1046() {
		Static68.anInt1891 = 0;
		Static105.anInt2771 = -1;
		Static14.anInt560 = -1;
		Static13.anInt465 = 0;
		Static27.anInt813 = 0;
		Static41.anInt1209 = 0;
		Static40.aBoolean66 = false;
		Static63.anInt2386 = 0;
		Static109.anInt2854 = -1;
		Static89.anInt2413 = 0;
		Static63.aClass3_Sub8_Sub1_6.anInt2704 = 0;
		Static10.aClass3_Sub8_Sub1_5.anInt2704 = 0;
		Static31.anInt988 = -1;
		Static65.method1089(30);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1047() {
		aClass62_743 = null;
		aClass62_741 = null;
		aClass62_749 = null;
		anIntArray174 = null;
		aClass62_750 = null;
		aClass62_742 = null;
		aClass62_746 = null;
		aClass62_744 = null;
		aClass62Array9 = null;
		aClass62_751 = null;
		aClass62_745 = null;
		aClass62_740 = null;
		aClass62_748 = null;
		aClass3_Sub1_Sub1_Sub1Array2 = null;
		aClass62_747 = null;
	}
}
