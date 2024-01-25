import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Lclient!f;")
	public static Class49 aClass49_11;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "[Lclient!na;")
	public static Class163[] aClass163Array3;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_165 = new Class137(56, 0);

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "[I")
	public static final int[] anIntArray205 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILjava/awt/Component;Lclient!ji;II)Lclient!fe;")
	public static Class77 method3126(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(4) int arg3) {
		if (Static155.anInt2607 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class77 local33 = (Class77) Class.forName("Class77_Sub2").getDeclaredConstructor().newInstance();
			local33.anIntArray329 = new int[(Static25.aBoolean39 ? 2 : 1) * 256];
			local33.anInt5482 = arg3;
			local33.method4269(arg1);
			local33.anInt5478 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt5478 > 16384) {
				local33.anInt5478 = 16384;
			}
			local33.method4268(local33.anInt5478);
			if (Static220.anInt3558 > 0 && Static413.aClass218_1 == null) {
				Static413.aClass218_1 = new Class218();
				Static413.aClass218_1.aClass124_4 = arg2;
				arg2.method2529(Static413.aClass218_1, Static220.anInt3558);
			}
			if (Static413.aClass218_1 != null) {
				if (Static413.aClass218_1.aClass77Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static413.aClass218_1.aClass77Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(119) Class77_Sub1 local119 = new Class77_Sub1(arg2, arg0);
				local119.anInt5482 = arg3;
				local119.anIntArray329 = new int[(Static25.aBoolean39 ? 2 : 1) * 256];
				local119.method4269(arg1);
				local119.anInt5478 = 16384;
				local119.method4268(local119.anInt5478);
				if (Static220.anInt3558 > 0 && Static413.aClass218_1 == null) {
					Static413.aClass218_1 = new Class218();
					Static413.aClass218_1.aClass124_4 = arg2;
					arg2.method2529(Static413.aClass218_1, Static220.anInt3558);
				}
				if (Static413.aClass218_1 != null) {
					if (Static413.aClass218_1.aClass77Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static413.aClass218_1.aClass77Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(178) Throwable local178) {
				return new Class77();
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I")
	public static int method3128(@OriginalArg(0) int arg0) {
		if (Static48.aClass3_2 != null) {
			Static48.aClass3_2.method63();
			Static48.aClass3_2 = null;
		}
		Static72.anInt1356++;
		if (Static72.anInt1356 > 4) {
			Static72.anInt1356 = 0;
			Static374.anInt6278 = 0;
			return arg0;
		}
		if (Static25.anInt542 == Static195.anInt3133) {
			Static195.anInt3133 = Static288.anInt4735;
		} else {
			Static195.anInt3133 = Static25.anInt542;
		}
		Static374.anInt6278 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V")
	public static void method3129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static113.anInt2002 = arg0 - Static114.anInt6800;
		Static323.anInt5318 = arg1 - Static114.anInt6798;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZI)V")
	public static void method3130(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static114.aClass1_Sub3_Sub16_3 != null) {
			Static417.anInt1445 = Static114.aClass1_Sub3_Sub16_3.anInt6748;
		} else {
			Static417.anInt1445 = -1;
		}
		Static37.anInt732 = 0;
		Static110.aClass254_11 = null;
		Static114.aClass1_Sub3_Sub16_3 = null;
		Static289.aClass250_6 = null;
		Static114.method5218();
		Static114.aClass254_45.method5438();
		Static69.aClass244_7 = null;
		Static411.aClass244_9 = null;
		Static113.anInt2002 = -1;
		Static133.aClass244_3 = null;
		Static312.aClass49_18 = null;
		Static114.aClass22_3 = null;
		Static365.aClass244_8 = null;
		Static323.anInt5318 = -1;
		Static5.aClass244_1 = null;
		Static326.aClass244_6 = null;
		Static433.aClass244_10 = null;
		Static290.aClass244_5 = null;
		Static114.aClass101_4.method2108();
		Static114.aClass135_4.method2795(64, 64);
		Static114.aClass101_4.method2103(128, 64);
		Static114.aClass95_4.method1830(64);
		Static182.aClass205_1.method4216(64);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BZI)Lclient!ik;")
	public static Class1_Sub20 method3131(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(20) long local20 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub20) Static200.aClass257_15.method5503(local20);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)Z")
	public static boolean method3132(@OriginalArg(0) int arg0) {
		@Pc(7) Class114_Sub1 local7 = Static19.method334(arg0);
		if (local7 == null) {
			return false;
		} else if (Static191.anInt3047 == 3) {
			@Pc(37) String local37 = "";
			if (Static209.aClass166_6 != Static136.aClass166_3) {
				local37 = ":" + (local7.anInt2760 + 7000);
			}
			@Pc(53) String local53 = "";
			if (Static116.aString52 != null) {
				local53 = "/p=" + Static116.aString52;
			}
			@Pc(102) String local102 = "http://" + local7.aString25 + local37 + "/l=" + Static188.anInt3028 + "/a=" + Static28.anInt564 + local53 + "/j" + (Static290.aBoolean384 ? "1" : "0") + ",o" + (Static60.aBoolean90 ? "1" : "0") + ",a2";
			try {
				Static389.aClient4.getAppletContext().showDocument(new URL(local102), "_self");
				return true;
			} catch (@Pc(117) Exception local117) {
				return false;
			}
		} else {
			Static62.anInt1112 = local7.anInt2760;
			Static270.aString42 = local7.aString25;
			if (Static136.aClass166_3 != Static209.aClass166_6) {
				Static182.anInt2943 = Static62.anInt1112 + 40000;
				Static91.anInt1613 = Static62.anInt1112 + 50000;
				Static131.anInt2260 = Static182.anInt2943;
			}
			return true;
		}
	}
}
