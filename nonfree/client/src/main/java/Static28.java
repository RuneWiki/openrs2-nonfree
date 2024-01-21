import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lclient!pb;")
	public static Class31 aClass31_14;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!mc;")
	private static Class42 aClass42_426 = Static23.method501("New User");

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_427 = Static23.method501("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "Lclient!mc;")
	private static Class42 aClass42_432 = Static23.method501("Loading wordpack )2 ");

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_428 = aClass42_432;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
	public static int[] anIntArray94 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "Lclient!mc;")
	private static Class42 aClass42_431 = Static23.method501("Accept challenge");

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "Lclient!mc;")
	public static Class42 aClass42_429 = aClass42_431;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!mc;")
	public static Class42 aClass42_430 = Static23.method501("p12_full");

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_433 = Static23.method501("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "Lclient!mc;")
	public static Class42 aClass42_434 = Static23.method501("Welt");

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "Lclient!mc;")
	public static Class42 aClass42_435 = Static23.method501("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_436 = Static23.method501("leuchten1:");

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_437 = aClass42_426;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_438 = Static23.method501("@lre@");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ja;ILjava/awt/Component;Lclient!ja;)V")
	public static void method559(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class33 arg2) {
		if (Static69.aBoolean96) {
			return;
		}
		Static34.aClass31_17 = Static61.method1022(arg1, 265, 128);
		Static55.method1135();
		Static109.aClass31_38 = Static61.method1022(arg1, 265, 128);
		Static55.method1135();
		Static58.aClass31_23 = Static61.method1022(arg1, 171, 509);
		Static55.method1135();
		Static51.aClass31_21 = Static61.method1022(arg1, 132, 360);
		Static55.method1135();
		Static48.aClass31_20 = Static61.method1022(arg1, 200, 360);
		Static55.method1135();
		Static58.aClass31_22 = Static61.method1022(arg1, 238, 202);
		Static55.method1135();
		Static77.aClass31_28 = Static61.method1022(arg1, 238, 203);
		Static55.method1135();
		Static72.aClass31_29 = Static61.method1022(arg1, 94, 74);
		Static55.method1135();
		Static31.aClass31_32 = Static61.method1022(arg1, 94, 75);
		Static55.method1135();
		@Pc(75) byte[] local75 = arg0.method1311(Static39.aClass42_239, Static57.aClass42_1419);
		@Pc(81) Class1_Sub1_Sub1_Sub1 local81 = new Class1_Sub1_Sub1_Sub1(local75, arg1);
		Static34.aClass31_17.method996();
		local81.method78(0, 0);
		Static109.aClass31_38.method996();
		local81.method78(-637, 0);
		Static58.aClass31_23.method996();
		local81.method78(-128, 0);
		Static51.aClass31_21.method996();
		local81.method78(-202, -371);
		Static48.aClass31_20.method996();
		local81.method78(-202, -171);
		Static58.aClass31_22.method996();
		local81.method78(0, -265);
		Static77.aClass31_28.method996();
		local81.method78(-562, -265);
		Static72.aClass31_29.method996();
		local81.method78(-128, -171);
		Static31.aClass31_32.method996();
		local81.method78(-562, -171);
		@Pc(148) int[] local148 = new int[local81.anInt87];
		@Pc(153) int local153;
		@Pc(179) int local179;
		for (@Pc(150) int local150 = 0; local150 < local81.anInt85; local150++) {
			for (local153 = 0; local153 < local81.anInt87; local153++) {
				local148[local153] = local81.anIntArray12[local150 * local81.anInt87 + local81.anInt87 - local153 - 1];
			}
			for (local179 = 0; local179 < local81.anInt87; local179++) {
				local81.anIntArray12[local179 + local81.anInt87 * local150] = local148[local179];
			}
		}
		Static34.aClass31_17.method996();
		local81.method78(382, 0);
		Static109.aClass31_38.method996();
		local81.method78(-255, 0);
		Static58.aClass31_23.method996();
		local81.method78(254, 0);
		Static51.aClass31_21.method996();
		local81.method78(180, -371);
		Static48.aClass31_20.method996();
		local81.method78(180, -171);
		Static58.aClass31_22.method996();
		local81.method78(382, -265);
		Static77.aClass31_28.method996();
		local81.method78(-180, -265);
		Static72.aClass31_29.method996();
		local81.method78(254, -171);
		Static31.aClass31_32.method996();
		local81.method78(-180, -171);
		local81 = Static87.method1580(Static92.aClass42_1310, arg2, Static39.aClass42_239);
		Static58.aClass31_23.method996();
		local81.method82(382 - local81.anInt87 / 2 - 128, 18);
		Static65.aClass1_Sub1_Sub1_Sub4_16 = Static42.method1760(arg2, Static83.aClass42_1185, Static39.aClass42_239);
		Static36.aClass1_Sub1_Sub1_Sub4_10 = Static42.method1760(arg2, Static27.aClass42_417, Static39.aClass42_239);
		Static93.aClass1_Sub1_Sub1_Sub4Array7 = Static77.method1415(arg2, Static39.aClass42_239, Static53.aClass42_1435);
		Static58.aClass1_Sub1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub1(128, 265);
		Static84.aClass1_Sub1_Sub1_Sub1_10 = new Class1_Sub1_Sub1_Sub1(128, 265);
		for (local153 = 0; local153 < 33920; local153++) {
			Static58.aClass1_Sub1_Sub1_Sub1_4.anIntArray12[local153] = Static34.aClass31_17.anIntArray212[local153];
		}
		for (local179 = 0; local179 < 33920; local179++) {
			Static84.aClass1_Sub1_Sub1_Sub1_10.anIntArray12[local179] = Static109.aClass31_38.anIntArray212[local179];
		}
		Static99.anIntArray378 = new int[256];
		for (@Pc(365) int local365 = 0; local365 < 64; local365++) {
			Static99.anIntArray378[local365] = local365 * 262144;
		}
		for (@Pc(378) int local378 = 0; local378 < 64; local378++) {
			Static99.anIntArray378[local378 + 64] = local378 * 1024 + 16711680;
		}
		for (@Pc(397) int local397 = 0; local397 < 64; local397++) {
			Static99.anIntArray378[local397 + 128] = local397 * 4 + 16776960;
		}
		for (@Pc(415) int local415 = 0; local415 < 64; local415++) {
			Static99.anIntArray378[local415 + 192] = 16777215;
		}
		Static25.anIntArray71 = new int[256];
		for (@Pc(433) int local433 = 0; local433 < 64; local433++) {
			Static25.anIntArray71[local433] = local433 * 1024;
		}
		for (@Pc(446) int local446 = 0; local446 < 64; local446++) {
			Static25.anIntArray71[local446 + 64] = local446 * 4 + 65280;
		}
		for (@Pc(463) int local463 = 0; local463 < 64; local463++) {
			Static25.anIntArray71[local463 + 128] = local463 * 262144 + 65535;
		}
		for (@Pc(480) int local480 = 0; local480 < 64; local480++) {
			Static25.anIntArray71[local480 + 192] = 16777215;
		}
		Static16.anIntArray43 = new int[256];
		for (@Pc(498) int local498 = 0; local498 < 64; local498++) {
			Static16.anIntArray43[local498] = local498 * 4;
		}
		for (@Pc(511) int local511 = 0; local511 < 64; local511++) {
			Static16.anIntArray43[local511 + 64] = local511 * 262144 + 255;
		}
		for (@Pc(529) int local529 = 0; local529 < 64; local529++) {
			Static16.anIntArray43[local529 + 128] = local529 * 1024 + 16711935;
		}
		for (@Pc(546) int local546 = 0; local546 < 64; local546++) {
			Static16.anIntArray43[local546 + 192] = 16777215;
		}
		Static90.anIntArray369 = new int[32768];
		Static65.anIntArray226 = new int[32768];
		Static109.anIntArray406 = new int[256];
		Static98.method1714(null);
		Static39.aClass42_238 = Static39.aClass42_239;
		Static74.anInt1897 = 0;
		Static39.aClass42_233 = Static39.aClass42_239;
		Static34.anIntArray116 = new int[32768];
		Static83.anIntArray339 = new int[32768];
		if (Static20.anInt655 == 0 || Static75.aBoolean85) {
			Static97.method1700();
		} else {
			Static97.method1702(Static39.aClass42_239, Static89.aClass42_1282, Static20.anInt655, Static7.aClass33_Sub1_2);
		}
		Static108.method1850(false);
		Static91.aBoolean134 = true;
		Static69.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V")
	public static void method560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) ((arg0 << 16) + arg1);
		@Pc(20) Class1_Sub1_Sub13 local20 = (Class1_Sub1_Sub13) Static101.aClass41_6.method1020(local14);
		if (local20 != null) {
			Static13.aClass5_1.method105(local20);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!qc;)Z")
	public static boolean method561(@OriginalArg(1) Class1_Sub1_Sub12 arg0) {
		@Pc(6) int local6 = arg0.anInt2160;
		if (Static99.anInt2518 == 2) {
			if (local6 == 201) {
				Static3.anInt113 = 1;
				aBoolean41 = true;
				Static11.aClass42_192 = Static64.aClass42_825;
				Static106.anInt2737 = 0;
				Static82.aBoolean117 = true;
				Static11.aClass42_197 = Static11.aClass42_195;
			}
			if (local6 == 202) {
				Static11.aClass42_197 = Static11.aClass42_195;
				Static3.anInt113 = 2;
				Static11.aClass42_192 = Static1.aClass42_14;
				aBoolean41 = true;
				Static106.anInt2737 = 0;
				Static82.aBoolean117 = true;
			}
		}
		if (local6 == 205) {
			Static97.anInt2477 = 250;
			return true;
		}
		if (local6 == 501) {
			Static3.anInt113 = 4;
			Static11.aClass42_192 = Static42.aClass42_1385;
			Static106.anInt2737 = 0;
			aBoolean41 = true;
			Static11.aClass42_197 = Static11.aClass42_195;
			Static82.aBoolean117 = true;
		}
		if (local6 == 502) {
			Static82.aBoolean117 = true;
			Static11.aClass42_197 = Static11.aClass42_195;
			Static106.anInt2737 = 0;
			Static3.anInt113 = 5;
			Static11.aClass42_192 = Static33.aClass42_452;
			aBoolean41 = true;
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (local6 >= 300 && local6 <= 313) {
			local94 = (local6 - 300) / 2;
			local98 = local6 & 0x1;
			Static98.aClass29_1.method627(local94, local98 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local94 = (local6 - 314) / 2;
			local98 = local6 & 0x1;
			Static98.aClass29_1.method629(local98 == 1, local94);
		}
		if (local6 == 324) {
			Static98.aClass29_1.method623(false);
		}
		if (local6 == 325) {
			Static98.aClass29_1.method623(true);
		}
		if (local6 == 326) {
			Static98.aClass1_Sub8_Sub1_3.method1236(45);
			Static98.aClass29_1.method626(Static98.aClass1_Sub8_Sub1_3);
			return true;
		}
		if (local6 == 620) {
			Static48.aBoolean67 = !Static48.aBoolean67;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static39.method308();
			if (Static11.aClass42_190.method1027() > 0) {
				Static98.aClass1_Sub8_Sub1_3.method1236(130);
				Static98.aClass1_Sub8_Sub1_3.method1193(Static11.aClass42_190.method1049());
				Static98.aClass1_Sub8_Sub1_3.method1185(local6 - 601);
				Static98.aClass1_Sub8_Sub1_3.method1185(Static48.aBoolean67 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ja;B)V")
	public static void method562(@OriginalArg(0) Class33 arg0) {
		Static29.aClass33_10 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lclient!mc;")
	public static Class42 method563(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static38.method642(arg0) : Static54.aClass42_757;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method564() {
		aClass42_428 = null;
		aClass31_14 = null;
		aClass42_433 = null;
		aByteArrayArrayArray4 = null;
		aClass42_436 = null;
		aClass42_426 = null;
		aClass42_435 = null;
		anIntArray94 = null;
		aClass42_430 = null;
		aClass42_437 = null;
		aClass42_431 = null;
		aClass42_432 = null;
		aClass1_Sub1_Sub1_Sub1_1 = null;
		aClass42_429 = null;
		aClass42_434 = null;
		aClass42_427 = null;
		aClass42_438 = null;
	}
}
