import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_42;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "Lclient!sd;")
	public static Class2_Sub1_Sub15 aClass2_Sub1_Sub15_1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!ld;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!wd;")
	private static Class80 aClass80_728 = Static2.method59("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_727 = aClass80_728;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_729 = Static2.method59("Mitglieder)2Welt");

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!wd;")
	private static Class80 aClass80_731 = Static2.method59("Cancel");

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_730 = aClass80_731;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_732 = Static2.method59("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!wd;")
	private static Class80 aClass80_735 = Static2.method59("Type");

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_733 = aClass80_735;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_734 = Static2.method59("(U4");

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!wd;")
	private static Class80 aClass80_736 = Static2.method59("On");

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!wd;")
	public static Class80 aClass80_737 = aClass80_736;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)I")
	public static int method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg2;
			arg2 = local8;
		}
		@Pc(20) int local20 = arg5 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return arg3;
		} else if (local20 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 1 + 7 - arg2 - arg3;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static void method1136() {
		while (true) {
			if (Static100.aClass2_Sub17_Sub1_1.method1807(Static65.anInt1843) >= 27) {
				@Pc(25) int local25 = Static100.aClass2_Sub17_Sub1_1.method1801(15);
				if (local25 != 32767) {
					@Pc(32) boolean local32 = false;
					if (Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25] == null) {
						Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25] = new Class2_Sub1_Sub1_Sub4_Sub1();
						local32 = true;
					}
					@Pc(48) Class2_Sub1_Sub1_Sub4_Sub1 local48 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
					Static85.anIntArray277[Static110.anInt2908++] = local25;
					local48.anInt2342 = Static10.anInt300;
					@Pc(64) int local64 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
					@Pc(69) int local69 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
					if (local69 == 1) {
						Static16.anIntArray68[Static93.anInt2410++] = local25;
					}
					@Pc(85) int local85 = Static100.aClass2_Sub17_Sub1_1.method1801(5);
					@Pc(90) int local90 = Static100.aClass2_Sub17_Sub1_1.method1801(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					local48.aClass2_Sub1_Sub13_1 = Static23.method462(Static100.aClass2_Sub17_Sub1_1.method1801(13));
					if (local90 > 15) {
						local90 -= 32;
					}
					@Pc(117) int local117 = Static8.anIntArray20[Static100.aClass2_Sub17_Sub1_1.method1801(3)];
					local48.anInt2352 = local48.aClass2_Sub1_Sub13_1.anInt2580;
					local48.anInt2318 = local48.aClass2_Sub1_Sub13_1.anInt2576;
					local48.anInt2333 = local48.aClass2_Sub1_Sub13_1.anInt2567;
					if (local32) {
						local48.anInt2347 = local117;
					}
					local48.anInt2345 = local48.aClass2_Sub1_Sub13_1.anInt2553;
					local48.anInt2364 = local48.aClass2_Sub1_Sub13_1.anInt2573;
					local48.anInt2330 = local48.aClass2_Sub1_Sub13_1.anInt2574;
					local48.anInt2329 = local48.aClass2_Sub1_Sub13_1.anInt2577;
					local48.anInt2326 = local48.aClass2_Sub1_Sub13_1.anInt2552;
					local48.anInt2335 = local48.aClass2_Sub1_Sub13_1.anInt2566;
					if (local48.anInt2335 == 0) {
						local48.anInt2347 = 0;
					}
					local48.method1434(local90 + Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0], Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0] + local85, local64 == 1);
					continue;
				}
			}
			Static100.aClass2_Sub17_Sub1_1.method1806();
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1137() {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas2.getGraphics();
			Static60.aClass22_12.method1065(local2, 357, 17);
		} catch (@Pc(10) Exception local10) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1138() {
		Static55.method718();
		Static1.method3();
		Static102.method1662();
		Static25.method517();
		Static50.method883();
		Static20.method486();
		Static125.method1755();
		Static19.method428();
		Static55.method711();
		Static4.method94();
		method1139();
		Static35.method623();
		((Class24) Static52.anInterface1_1).method672();
		Static85.aClass32_40.method878();
		Static108.aClass11_Sub1_20.method392();
		Static93.aClass11_Sub1_15.method392();
		Static105.aClass11_Sub1_14.method392();
		Static90.aClass11_Sub1_13.method392();
		Static8.aClass11_Sub1_2.method392();
		Static29.aClass11_Sub1_7.method392();
		Static33.aClass11_Sub1_8.method392();
		Static57.aClass11_Sub1_11.method392();
		Static118.aClass11_Sub1_21.method392();
		Static40.aClass11_Sub1_10.method392();
		Static37.aClass11_Sub1_9.method392();
		Static4.aClass11_Sub1_1.method392();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	private static void method1139() {
		Static40.aClass32_23.method878();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I[Lclient!me;II[BLclient!sa;)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) Class49[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class64 arg4) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg3);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method1787();
			if (local21 == 0) {
				return;
			}
			local15 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method1787();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method1780();
				@Pc(69) int local69 = local65 & 0x3;
				@Pc(73) int local73 = local57 + arg0;
				@Pc(77) int local77 = local65 >> 2;
				@Pc(81) int local81 = arg2 + local51;
				if (local73 > 0 && local81 > 0 && local73 < 103 && local81 < 103) {
					@Pc(95) int local95 = local61;
					@Pc(97) Class49 local97 = null;
					if ((Static108.aByteArrayArrayArray7[1][local73][local81] & 0x2) == 2) {
						local95 = local61 - 1;
					}
					if (local95 >= 0) {
						local97 = arg1[local95];
					}
					Static1.method6(local73, local61, local97, local77, arg4, local69, local81, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
	public static void method1141() {
		aClass80_735 = null;
		aClass45_1 = null;
		aClass2_Sub1_Sub9_Sub3_42 = null;
		aClass80_728 = null;
		aClass80_733 = null;
		aClass80_737 = null;
		aClass80_731 = null;
		anIntArray248 = null;
		aClass80_732 = null;
		aClass80_734 = null;
		aClass80_727 = null;
		aClass80_730 = null;
		aClass2_Sub1_Sub15_1 = null;
		aClass80_729 = null;
		aClass80_736 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BIII)I")
	public static int method1142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
