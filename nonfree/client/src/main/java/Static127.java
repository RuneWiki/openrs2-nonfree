import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!wb", name = "hc", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wb", name = "jc", descriptor = "Lclient!g;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!wb", name = "qc", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1540 = Static108.method1915(" seconds)3");

	@OriginalMember(owner = "client!wb", name = "Yb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1535 = aClass39_1540;

	@OriginalMember(owner = "client!wb", name = "bc", descriptor = "[I")
	public static int[] anIntArray481 = new int[50];

	@OriginalMember(owner = "client!wb", name = "dc", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!wb", name = "ic", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1536 = Static108.method1915("blaugr-Un:");

	@OriginalMember(owner = "client!wb", name = "kc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1537 = Static108.method1915("Side panel redrawn");

	@OriginalMember(owner = "client!wb", name = "lc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1538 = Static108.method1915(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!wb", name = "pc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1539 = Static108.method1915("null");

	@OriginalMember(owner = "client!wb", name = "uc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1541 = Static108.method1915("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(IB)Lclient!ff;")
	public static Class1_Sub1_Sub9 method2190(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub1_Sub9 local18 = (Class1_Sub1_Sub9) Static57.aClass33_20.method1038((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static100.aClass62_29.method2008(arg0, 8);
		local18 = new Class1_Sub1_Sub9();
		if (local28 != null) {
			local18.method686(new Class1_Sub18(local28));
		}
		Static57.aClass33_20.method1042(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mf;Z)V")
	public static void method2192(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.anInt2495 = arg0.anInt2503;
		if (arg0.anInt2527 == 0) {
			arg0.anInt2489 = 0;
			return;
		}
		if (arg0.anInt2526 != -1 && arg0.anInt2492 == 0) {
			@Pc(32) Class1_Sub1_Sub7 local32 = Static82.method1398(arg0.anInt2526);
			if (arg0.anInt2482 > 0 && local32.anInt1034 == 0) {
				arg0.anInt2489++;
				return;
			}
			if (arg0.anInt2482 <= 0 && local32.anInt1050 == 0) {
				arg0.anInt2489++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt2521;
		@Pc(85) int local85 = arg0.anIntArray389[arg0.anInt2527 - 1] * 128 + arg0.anInt2486 * 64;
		@Pc(88) int local88 = arg0.anInt2508;
		@Pc(104) int local104 = arg0.anIntArray387[arg0.anInt2527 - 1] * 128 + arg0.anInt2486 * 64;
		if (local85 - local70 > 256 || local85 - local70 < -256 || local104 - local88 > 256 || local104 - local88 < -256) {
			arg0.anInt2508 = local104;
			arg0.anInt2521 = local85;
			return;
		}
		@Pc(141) int local141 = arg0.anInt2504;
		if (local85 > local70) {
			if (local104 > local88) {
				arg0.anInt2533 = 1280;
			} else if (local104 < local88) {
				arg0.anInt2533 = 1792;
			} else {
				arg0.anInt2533 = 1536;
			}
		} else if (local70 <= local85) {
			if (local104 > local88) {
				arg0.anInt2533 = 1024;
			} else if (local104 < local88) {
				arg0.anInt2533 = 0;
			}
		} else if (local104 > local88) {
			arg0.anInt2533 = 768;
		} else if (local88 > local104) {
			arg0.anInt2533 = 256;
		} else {
			arg0.anInt2533 = 512;
		}
		@Pc(220) int local220 = arg0.anInt2533 - arg0.anInt2509 & 0x7FF;
		@Pc(222) boolean local222 = true;
		if (local220 > 1024) {
			local220 -= 2048;
		}
		@Pc(228) int local228 = 4;
		if (local220 >= -256 && local220 <= 256) {
			local141 = arg0.anInt2520;
		} else if (local220 >= 256 && local220 < 768) {
			local141 = arg0.anInt2505;
		} else if (local220 >= -768 && local220 <= -256) {
			local141 = arg0.anInt2496;
		}
		if (local141 == -1) {
			local141 = arg0.anInt2520;
		}
		arg0.anInt2495 = local141;
		if (arg0 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
			local222 = ((Class1_Sub1_Sub2_Sub1_Sub1) arg0).aClass1_Sub1_Sub5_1.aBoolean77;
		}
		if (local222) {
			if (arg0.anInt2533 != arg0.anInt2509 && arg0.anInt2510 == -1 && arg0.anInt2478 != 0) {
				local228 = 2;
			}
			if (arg0.anInt2527 > 2) {
				local228 = 6;
			}
			if (arg0.anInt2527 > 3) {
				local228 = 8;
			}
			if (arg0.anInt2489 > 0 && arg0.anInt2527 > 1) {
				arg0.anInt2489--;
				local228 = 8;
			}
		} else {
			if (arg0.anInt2527 > 1) {
				local228 = 6;
			}
			if (arg0.anInt2527 > 2) {
				local228 = 8;
			}
			if (arg0.anInt2489 > 0 && arg0.anInt2527 > 1) {
				arg0.anInt2489--;
				local228 = 8;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt2527 - 1]) {
			local228 <<= 0x1;
		}
		if (local88 < local104) {
			arg0.anInt2508 += local228;
			if (arg0.anInt2508 > local104) {
				arg0.anInt2508 = local104;
			}
		} else if (local88 > local104) {
			arg0.anInt2508 -= local228;
			if (arg0.anInt2508 < local104) {
				arg0.anInt2508 = local104;
			}
		}
		if (local85 > local70) {
			arg0.anInt2521 += local228;
			if (local85 < arg0.anInt2521) {
				arg0.anInt2521 = local85;
			}
		} else if (local70 > local85) {
			arg0.anInt2521 -= local228;
			if (arg0.anInt2521 < local85) {
				arg0.anInt2521 = local85;
			}
		}
		if (local85 == arg0.anInt2521 && local104 == arg0.anInt2508) {
			if (arg0.anInt2482 > 0) {
				arg0.anInt2482--;
			}
			arg0.anInt2527--;
		}
		if (local228 >= 8 && arg0.anInt2495 == arg0.anInt2520 && arg0.anInt2517 != -1) {
			arg0.anInt2495 = arg0.anInt2517;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!q;B)V")
	public static void method2195(@OriginalArg(0) Class62 arg0) {
		Static129.aClass62_36 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "(B)V")
	public static void method2196() {
		Static29.aClass14_1.method1810();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static43.aLongArray1[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static121.aLongArray6[local26] = 0L;
		}
		Static29.anInt973 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "(I)V")
	public static void method2197() {
		Static7.aBoolean29 = true;
		Static68.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;ILclient!q;Lclient!q;)V")
	public static void method2200(@OriginalArg(0) Component arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class62 arg2) {
		if (Static99.aBoolean197) {
			return;
		}
		Static79.aClass6_18 = Static64.method1143(arg0, 765, 503);
		Static79.aClass6_18.method2069();
		Static15.method1510();
		@Pc(26) byte[] local26 = arg1.method2013(Static38.aClass39_540, Static75.aClass39_929);
		Static68.aClass1_Sub1_Sub4_Sub4_5 = new Class1_Sub1_Sub4_Sub4(local26, arg0);
		Static95.aClass1_Sub1_Sub4_Sub4_7 = Static68.aClass1_Sub1_Sub4_Sub4_5.method1528();
		Static73.aClass1_Sub1_Sub4_Sub1_36 = Static101.method1816(Static38.aClass39_540, arg2, Static98.aClass39_1190);
		Static32.aClass1_Sub1_Sub4_Sub1_13 = Static101.method1816(Static38.aClass39_540, arg2, Static11.aClass39_222);
		Static57.aClass1_Sub1_Sub4_Sub1_31 = Static101.method1816(Static38.aClass39_540, arg2, Static74.aClass39_921);
		Static52.aClass1_Sub1_Sub4_Sub1Array5 = Static3.method72(arg2, Static56.aClass39_745, Static38.aClass39_540);
		Static31.aClass1_Sub1_Sub4_Sub1Array3 = Static3.method72(arg2, Static1.aClass39_31, Static38.aClass39_540);
		Static41.anIntArray472 = new int[256];
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static41.anIntArray472[local70] = local70 * 262144;
		}
		for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
			Static41.anIntArray472[local86 + 64] = local86 * 1024 + 16711680;
		}
		for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
			Static41.anIntArray472[local105 + 128] = local105 * 4 + 16776960;
		}
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			Static41.anIntArray472[local125 + 192] = 16777215;
		}
		Static49.anIntArray186 = new int[256];
		for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
			Static49.anIntArray186[local142] = local142 * 1024;
		}
		for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
			Static49.anIntArray186[local158 + 64] = local158 * 4 + 65280;
		}
		for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
			Static49.anIntArray186[local176 + 128] = local176 * 262144 + 65535;
		}
		for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
			Static49.anIntArray186[local194 + 192] = 16777215;
		}
		Static48.anIntArray181 = new int[256];
		for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
			Static48.anIntArray181[local213] = local213 * 4;
		}
		for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
			Static48.anIntArray181[local229 + 64] = local229 * 262144 + 255;
		}
		for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
			Static48.anIntArray181[local250 + 128] = local250 * 1024 + 16711935;
		}
		for (@Pc(270) int local270 = 0; local270 < 64; local270++) {
			Static48.anIntArray181[local270 + 192] = 16777215;
		}
		Static101.anIntArray394 = new int[256];
		Static62.anIntArray461 = new int[32768];
		Static101.anIntArray392 = new int[32768];
		Static33.method633(null);
		Static32.aBoolean60 = false;
		Static63.anInt1661 = 0;
		Static38.aClass39_546 = Static38.aClass39_540;
		if (Static90.anInt2125 == 0) {
			Static19.aBoolean57 = true;
		} else {
			Static19.aBoolean57 = false;
		}
		Static38.aClass39_535 = Static38.aClass39_540;
		Static101.anIntArray395 = new int[32768];
		Static51.anIntArray195 = new int[32768];
		if (Static19.aBoolean57) {
			Static98.method1720();
		} else {
			Static59.method1064(Static97.aClass39_1530, Static77.aClass62_Sub1_53, Static38.aClass39_540);
		}
		Static95.method2002(false);
		Static119.aBoolean234 = true;
		Static99.aBoolean197 = true;
		Static68.aClass1_Sub1_Sub4_Sub4_5.method1520(0, 0);
		Static95.aClass1_Sub1_Sub4_Sub4_7.method1520(382, 0);
		Static73.aClass1_Sub1_Sub4_Sub1_36.method492(382 - Static73.aClass1_Sub1_Sub4_Sub1_36.anInt869 / 2, 18);
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "(B)V")
	public static void method2202() {
		aClass21_1 = null;
		aClass1_Sub1_Sub1_5 = null;
		aClass39_1541 = null;
		aClass39_1538 = null;
		aClass39_1537 = null;
		aClass39_1535 = null;
		aClass39_1540 = null;
		aClass39_1536 = null;
		aClass39_1539 = null;
		anIntArray481 = null;
	}
}
