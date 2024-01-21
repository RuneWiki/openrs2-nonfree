import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
	public static boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!lc;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1 = new Class1();

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!he;")
	private static Class26 aClass26_63 = Static6.method100("Could not complete login)3");

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!he;")
	public static Class26 aClass26_64 = aClass26_63;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_65 = Static6.method100("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public static int anInt133 = -1;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public static volatile int anInt134 = -1;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "Lclient!sf;")
	public static Class66 aClass66_1 = new Class66(50);

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public static int anInt137 = 10;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	public static int anInt138 = -1;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!he;")
	public static Class26 aClass26_66 = Static6.method100("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method62(@OriginalArg(0) int arg0) {
		if (Static89.anInt2466 == arg0) {
			return;
		}
		if (Static89.anInt2466 == 0) {
			Static39.method776();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static58.anInt1799 = 0;
			Static98.anInt2631 = 0;
			Static5.anInt3221 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static9.aClass76_2 != null) {
			Static9.aClass76_2.method2183();
			Static9.aClass76_2 = null;
		}
		if (Static89.anInt2466 == 25) {
			Static125.anInt3207 = 0;
			Static117.anInt3072 = 0;
			Static100.anInt3231 = 0;
			Static48.anInt1575 = 1;
			Static76.anInt2092 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static19.method350(Static20.aClass16_Sub1_3, Static125.aClass16_Sub1_19, Static58.aCanvas1);
		} else {
			Static114.method2077();
		}
		Static89.anInt2466 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method63() {
		Static81.aClass11_1.method2158();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static53.aLongArray4[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static67.aLongArray7[local22] = 0L;
		}
		Static60.anInt1825 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static73.method1341(arg7)) {
			Static38.aClass3_Sub14Array1 = null;
			Static14.method240(Static49.aClass3_Sub14ArrayArray1[arg7], arg0, arg4, arg2, arg1, arg3, arg6, -1, arg5);
			if (Static38.aClass3_Sub14Array1 != null) {
				Static14.method240(Static38.aClass3_Sub14Array1, arg0, Static60.anInt1828, arg2, Static1.anInt2, arg3, arg6, -1412584499, arg5);
				Static38.aClass3_Sub14Array1 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static72.aBooleanArray19[local15] = true;
			}
		} else {
			Static72.aBooleanArray19[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIILclient!nc;)V")
	public static void method66(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub14 arg2) {
		if (Static109.aClass3_Sub14_15 != null || Static109.aBoolean162 || (arg2 == null || Static115.method2084(arg2) == null)) {
			return;
		}
		Static109.aClass3_Sub14_15 = arg2;
		Static96.aClass3_Sub14_14 = Static115.method2084(arg2);
		Static122.anInt3177 = arg1;
		Static43.anInt2688 = 0;
		Static32.aBoolean59 = false;
		Static116.anInt3059 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)Lclient!ab;")
	public static Class3_Sub1_Sub1 method68(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub1 local10 = (Class3_Sub1_Sub1) Static93.aClass66_21.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static32.aClass16_45.method566(6, arg0);
		local10 = new Class3_Sub1_Sub1();
		local10.anInt69 = arg0;
		if (local20 != null) {
			local10.method56(new Class3_Sub11(local20));
		}
		local10.method55();
		if (local10.aBoolean11) {
			local10.aBoolean6 = false;
			local10.anInt93 = 0;
		}
		Static93.aClass66_21.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ce;)V")
	public static void method70(@OriginalArg(1) Class3_Sub1_Sub4_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static106.anIntArray340.length; local3++) {
			Static106.anIntArray340[local3] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) (Math.random() * 128.0D * (double) 256);
			Static106.anIntArray340[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(69) int local69;
		for (local40 = 0; local40 < 20; local40++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local69 = (local57 << 7) + local61;
					Static87.anIntArray292[local69] = (Static106.anIntArray340[local69 + 128] + Static106.anIntArray340[local69 - 1] + Static106.anIntArray340[local69 + 1] + Static106.anIntArray340[local69 - 128]) / 4;
				}
			}
			@Pc(111) int[] local111 = Static106.anIntArray340;
			Static106.anIntArray340 = Static87.anIntArray292;
			Static87.anIntArray292 = local111;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt511; local61++) {
			for (local69 = 0; local69 < arg0.anInt509; local69++) {
				if (arg0.aByteArray2[local57++] != 0) {
					@Pc(150) int local150 = local69 + arg0.anInt507 + 16;
					@Pc(157) int local157 = arg0.anInt510 + local61 + 16;
					@Pc(163) int local163 = local150 + (local157 << 7);
					Static106.anIntArray340[local163] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public static void method77(@OriginalArg(0) int arg0) {
		Static43.method1870();
		Static81.method1421();
		@Pc(21) int local21 = Static60.method1198(arg0).anInt2835;
		if (local21 == 0) {
			return;
		}
		@Pc(31) int local31 = Static52.anIntArray159[arg0];
		if (local21 == 1) {
			if (local31 == 1) {
				Static127.method2248(0.9D);
				((Class34) Static127.anInterface2_1).method1102(0.9D);
			}
			if (local31 == 2) {
				Static127.method2248(0.8D);
				((Class34) Static127.anInterface2_1).method1102(0.8D);
			}
			if (local31 == 3) {
				Static127.method2248(0.7D);
				((Class34) Static127.anInterface2_1).method1102(0.7D);
			}
			if (local31 == 4) {
				Static127.method2248(0.6D);
				((Class34) Static127.anInterface2_1).method1102(0.6D);
			}
			Static51.method1080();
		}
		if (local21 == 3) {
			@Pc(91) short local91 = 0;
			if (local31 == 0) {
				local91 = 255;
			}
			if (local31 == 1) {
				local91 = 192;
			}
			if (local31 == 2) {
				local91 = 128;
			}
			if (local31 == 3) {
				local91 = 64;
			}
			if (local31 == 4) {
				local91 = 0;
			}
			if (local91 != Static56.anInt1720) {
				if (Static56.anInt1720 == 0 && anInt138 != -1) {
					Static113.method2067(local91, Static89.aClass16_Sub1_12, 0, anInt138);
					Static42.aBoolean70 = false;
				} else if (local91 == 0) {
					Static109.method1996();
					Static42.aBoolean70 = false;
				} else {
					Static57.method1152(local91);
				}
				Static56.anInt1720 = local91;
			}
		}
		if (local21 == 4) {
			if (local31 == 0) {
				Static29.anInt1009 = 127;
			}
			if (local31 == 1) {
				Static29.anInt1009 = 96;
			}
			if (local31 == 2) {
				Static29.anInt1009 = 64;
			}
			if (local31 == 3) {
				Static29.anInt1009 = 32;
			}
			if (local31 == 4) {
				Static29.anInt1009 = 0;
			}
		}
		if (local21 == 6) {
			Static25.anInt3165 = local31;
		}
		if (local21 == 10) {
			if (local31 == 0) {
				Static115.anInt3051 = 127;
			}
			if (local31 == 1) {
				Static115.anInt3051 = 96;
			}
			if (local31 == 2) {
				Static115.anInt3051 = 64;
			}
			if (local31 == 3) {
				Static115.anInt3051 = 32;
			}
			if (local31 == 4) {
				Static115.anInt3051 = 0;
			}
		}
		if (local21 == 5) {
			Static131.anInt3266 = local31;
		}
		if (local21 == 9) {
			Static27.anInt972 = local31;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method78() {
		aClass26_65 = null;
		aClass3_Sub1_Sub4_Sub1_1 = null;
		aClass26_64 = null;
		aClass42_1 = null;
		aClass1_1 = null;
		aClass26_63 = null;
		aClass66_1 = null;
		aClass26_66 = null;
	}
}
