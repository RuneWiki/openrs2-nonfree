import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_17;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_18;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt1856;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_19;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_535 = Static13.method257("Add friend @whi@");

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public static int anInt1857 = 0;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_536 = Static13.method257("Login");

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public static volatile int anInt1860 = 0;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!o;")
	public static Class40 aClass40_537 = Static13.method257("Connection timed out");

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!o;")
	public static Class40 aClass40_538 = Static13.method257("white:");

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "Lclient!o;")
	public static Class40 aClass40_539 = Static13.method257("button near the top of that page)3");

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Lclient!o;")
	public static Class40 aClass40_540 = Static13.method257("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "Lclient!o;")
	public static Class40 aClass40_541 = Static13.method257("Loading sprites )2 ");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BJ)V")
	public static void method1254(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static99.anInt121 >= 100) {
			Static58.method989(0, Static61.aClass40_445, Static60.aClass40_432);
			return;
		}
		@Pc(27) Class40 local27 = Static48.method819(arg0).method1167();
		for (@Pc(29) int local29 = 0; local29 < Static99.anInt121; local29++) {
			if (arg0 == Static84.aLongArray4[local29]) {
				Static58.method989(0, Static61.aClass40_445, Static80.method1334(new Class40[] { local27, Static72.aClass40_506 }));
				return;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static22.anInt2594; local60++) {
			if (arg0 == Static21.aLongArray2[local60]) {
				Static58.method989(0, Static61.aClass40_445, Static80.method1334(new Class40[] { Static51.aClass40_357, local27, Static58.aClass40_426 }));
				return;
			}
		}
		if (!local27.method1184(Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395)) {
			Static84.aLongArray4[Static99.anInt121++] = arg0;
			Static33.aBoolean59 = true;
			Static80.aClass2_Sub3_Sub1_4.method1736(186);
			Static80.aClass2_Sub3_Sub1_4.method1680(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method1255() {
		for (@Pc(15) int local15 = 0; local15 < Static53.anInt1190; local15++) {
			@Pc(21) int local21 = Static98.anIntArray504[local15];
			@Pc(25) Class2_Sub2_Sub12_Sub1_Sub1 local25 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local21];
			@Pc(31) int local31 = Static56.aClass2_Sub3_Sub1_5.method1708();
			if ((local31 & 0x4) != 0) {
				local31 += Static56.aClass2_Sub3_Sub1_5.method1708() << 8;
			}
			Static51.method846(local21, local25, local31);
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)I")
	public static int method1258(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static52.anIntArray257[arg0];
		@Pc(11) int local11 = (local3 * Static93.anInt2179 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Lclient!o;")
	public static Class40 method1260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < -9) {
			return Static38.aClass40_293;
		} else if (local12 < -6) {
			return Static20.aClass40_133;
		} else if (local12 < -3) {
			return Static75.aClass40_528;
		} else if (local12 < 0) {
			return Static20.aClass40_134;
		} else if (local12 > 9) {
			return Static100.aClass40_689;
		} else if (local12 > 6) {
			return Static101.aClass40_692;
		} else if (local12 > 3) {
			return Static21.aClass40_138;
		} else if (local12 > 0) {
			return Static55.aClass40_407;
		} else {
			return Static31.aClass40_730;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(13) int local13 = arg1;
			arg1 = arg4;
			arg4 = local13;
		}
		@Pc(25) int local25 = arg3 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return 7 + 1 - arg0 - arg1;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ud;Ljava/awt/Component;Lclient!ud;B)V")
	public static void method1263(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class5 arg2) {
		if (Static74.aBoolean145) {
			return;
		}
		Static61.aClass45_24 = Static83.method1351(128, arg1, 265);
		Static26.method1610();
		Static98.aClass45_30 = Static83.method1351(128, arg1, 265);
		Static26.method1610();
		Static61.aClass45_22 = Static83.method1351(509, arg1, 171);
		Static26.method1610();
		Static35.aClass45_16 = Static83.method1351(360, arg1, 132);
		Static26.method1610();
		Static107.aClass45_31 = Static83.method1351(360, arg1, 200);
		Static26.method1610();
		Static21.aClass45_11 = Static83.method1351(202, arg1, 238);
		Static26.method1610();
		Static80.aClass45_27 = Static83.method1351(203, arg1, 238);
		Static26.method1610();
		Static67.aClass45_26 = Static83.method1351(74, arg1, 94);
		Static26.method1610();
		Static2.aClass45_3 = Static83.method1351(75, arg1, 94);
		Static26.method1610();
		@Pc(77) byte[] local77 = arg2.method69(Static63.aClass40_463, Static86.aClass40_593);
		@Pc(83) Class2_Sub2_Sub2_Sub4 local83 = new Class2_Sub2_Sub2_Sub4(local77, arg1);
		Static61.aClass45_24.method1476();
		local83.method1619(0, 0);
		Static98.aClass45_30.method1476();
		local83.method1619(-637, 0);
		Static61.aClass45_22.method1476();
		local83.method1619(-128, 0);
		Static35.aClass45_16.method1476();
		local83.method1619(-202, -371);
		Static107.aClass45_31.method1476();
		local83.method1619(-202, -171);
		Static21.aClass45_11.method1476();
		local83.method1619(0, -265);
		Static80.aClass45_27.method1476();
		local83.method1619(-562, -265);
		Static67.aClass45_26.method1476();
		local83.method1619(-128, -171);
		Static2.aClass45_3.method1476();
		local83.method1619(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt2446];
		@Pc(156) int local156;
		@Pc(187) int local187;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt2442; local152++) {
			for (local156 = 0; local156 < local83.anInt2446; local156++) {
				local150[local156] = local83.anIntArray534[local152 * local83.anInt2446 + local83.anInt2446 - local156 - 1];
			}
			for (local187 = 0; local187 < local83.anInt2446; local187++) {
				local83.anIntArray534[local152 * local83.anInt2446 + local187] = local150[local187];
			}
		}
		Static61.aClass45_24.method1476();
		local83.method1619(382, 0);
		Static98.aClass45_30.method1476();
		local83.method1619(-255, 0);
		Static61.aClass45_22.method1476();
		local83.method1619(254, 0);
		Static35.aClass45_16.method1476();
		local83.method1619(180, -371);
		Static107.aClass45_31.method1476();
		local83.method1619(180, -171);
		Static21.aClass45_11.method1476();
		local83.method1619(382, -265);
		Static80.aClass45_27.method1476();
		local83.method1619(-180, -265);
		Static67.aClass45_26.method1476();
		local83.method1619(254, -171);
		Static2.aClass45_3.method1476();
		local83.method1619(-180, -171);
		local83 = Static103.method1644(Static73.aClass40_521, Static86.aClass40_593, arg0);
		Static61.aClass45_22.method1476();
		local83.method1624(382 - local83.anInt2446 / 2 - 128, 18);
		Static97.aClass2_Sub2_Sub2_Sub3_21 = Static99.method77(arg0, Static86.aClass40_593, Static3.aClass40_16);
		Static32.aClass2_Sub2_Sub2_Sub3_8 = Static99.method77(arg0, Static86.aClass40_593, Static96.aClass40_661);
		Static49.aClass2_Sub2_Sub2_Sub3Array14 = Static4.method85(arg0, Static82.aClass40_563, Static86.aClass40_593);
		Static11.aClass2_Sub2_Sub2_Sub4_1 = new Class2_Sub2_Sub2_Sub4(128, 265);
		Static96.aClass2_Sub2_Sub2_Sub4_9 = new Class2_Sub2_Sub2_Sub4(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static11.aClass2_Sub2_Sub2_Sub4_1.anIntArray534[local156] = Static61.aClass45_24.anIntArray471[local156];
		}
		for (local187 = 0; local187 < 33920; local187++) {
			Static96.aClass2_Sub2_Sub2_Sub4_9.anIntArray534[local187] = Static98.aClass45_30.anIntArray471[local187];
		}
		Static37.anIntArray182 = new int[256];
		for (@Pc(366) int local366 = 0; local366 < 64; local366++) {
			Static37.anIntArray182[local366] = local366 * 262144;
		}
		for (@Pc(382) int local382 = 0; local382 < 64; local382++) {
			Static37.anIntArray182[local382 + 64] = local382 * 1024 + 16711680;
		}
		for (@Pc(403) int local403 = 0; local403 < 64; local403++) {
			Static37.anIntArray182[local403 + 128] = local403 * 4 + 16776960;
		}
		for (@Pc(421) int local421 = 0; local421 < 64; local421++) {
			Static37.anIntArray182[local421 + 192] = 16777215;
		}
		Static70.anIntArray355 = new int[256];
		for (@Pc(438) int local438 = 0; local438 < 64; local438++) {
			Static70.anIntArray355[local438] = local438 * 1024;
		}
		for (@Pc(452) int local452 = 0; local452 < 64; local452++) {
			Static70.anIntArray355[local452 + 64] = local452 * 4 + 65280;
		}
		for (@Pc(472) int local472 = 0; local472 < 64; local472++) {
			Static70.anIntArray355[local472 + 128] = local472 * 262144 + 65535;
		}
		for (@Pc(492) int local492 = 0; local492 < 64; local492++) {
			Static70.anIntArray355[local492 + 192] = 16777215;
		}
		Static72.anIntArray406 = new int[256];
		for (@Pc(513) int local513 = 0; local513 < 64; local513++) {
			Static72.anIntArray406[local513] = local513 * 4;
		}
		for (@Pc(529) int local529 = 0; local529 < 64; local529++) {
			Static72.anIntArray406[local529 + 64] = local529 * 262144 + 255;
		}
		for (@Pc(550) int local550 = 0; local550 < 64; local550++) {
			Static72.anIntArray406[local550 + 128] = local550 * 1024 + 16711935;
		}
		for (@Pc(570) int local570 = 0; local570 < 64; local570++) {
			Static72.anIntArray406[local570 + 192] = 16777215;
		}
		anIntArray414 = new int[32768];
		Static92.anIntArray472 = new int[256];
		Static4.anIntArray17 = new int[32768];
		Static24.method502(null);
		Static86.aClass40_591 = Static86.aClass40_593;
		Static86.aClass40_587 = Static86.aClass40_593;
		Static91.anInt2143 = 0;
		Static1.anIntArray1 = new int[32768];
		Static103.anIntArray547 = new int[32768];
		if (Static7.anInt239 == 0 || Static1.aBoolean2) {
			Static94.method1490();
		} else {
			Static94.method1496(Static12.aClass40_80, Static86.aClass40_593, Static85.aClass5_Sub1_17, Static7.anInt239);
		}
		Static44.method787(false);
		Static74.aBoolean145 = true;
		Static1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
	public static void method1264() {
		aClass40_536 = null;
		aByteArrayArrayArray10 = null;
		aClass2_Sub2_Sub2_Sub3_17 = null;
		aClass40_540 = null;
		aClass2_Sub2_Sub2_Sub3_18 = null;
		aClass40_541 = null;
		aClass40_538 = null;
		aClass40_537 = null;
		anIntArray414 = null;
		aClass40_539 = null;
		aClass2_Sub2_Sub2_Sub3_19 = null;
		aClass40_535 = null;
	}
}
