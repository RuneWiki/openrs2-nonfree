import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_148 = new Class83("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Z")
	public static boolean aBoolean676 = true;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	public static void method5547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static3.aClass4_Sub12_Sub1_5.method2531(arg0);
		Static3.aClass4_Sub12_Sub1_5.method2494(arg1);
		Static3.aClass4_Sub12_Sub1_5.method2494(arg2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static332.method4519(Static168.anInt3256, arg0, Static376.anInt6287);
		@Pc(17) int local17 = Static332.method4519(Static168.anInt3256, arg5, Static376.anInt6287);
		@Pc(23) int local23 = Static332.method4519(Static208.anInt2656, arg2, Static354.anInt6186);
		@Pc(29) int local29 = Static332.method4519(Static208.anInt2656, arg3, Static354.anInt6186);
		@Pc(38) int local38 = Static332.method4519(Static168.anInt3256, arg0 + arg4, Static376.anInt6287);
		@Pc(47) int local47 = Static332.method4519(Static168.anInt3256, arg5 - arg4, Static376.anInt6287);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static251.method3640(local23, arg1, local29, Static96.anIntArrayArray21[local49]);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static251.method3640(local23, arg1, local29, Static96.anIntArrayArray21[local69]);
		}
		@Pc(92) int local92 = Static332.method4519(Static208.anInt2656, arg2 + arg4, Static354.anInt6186);
		@Pc(101) int local101 = Static332.method4519(Static208.anInt2656, arg3 - arg4, Static354.anInt6186);
		for (@Pc(111) int local111 = local38; local111 <= local47; local111++) {
			@Pc(117) int[] local117 = Static96.anIntArrayArray21[local111];
			Static251.method3640(local23, arg1, local92, local117);
			Static251.method3640(local101, arg1, local29, local117);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5549(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static123.method4868(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static413.anInt6823; local25++) {
			@Pc(31) String local31 = Static326.aStringArray27[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static123.method4868(local31);
			if (local31 != null && local31.equals(local20)) {
				Static413.anInt6823--;
				for (@Pc(55) int local55 = local25; local55 < Static413.anInt6823; local55++) {
					Static326.aStringArray27[local55] = Static326.aStringArray27[local55 + 1];
					Static102.aStringArray7[local55] = Static102.aStringArray7[local55 + 1];
					Static315.aStringArray26[local55] = Static315.aStringArray26[local55 + 1];
					Static141.aStringArray11[local55] = Static141.aStringArray11[local55 + 1];
					Static414.aBooleanArray20[local55] = Static414.aBooleanArray20[local55 + 1];
				}
				Static244.anInt3027 = Static325.anInt5640;
				Static429.method5476(Static85.aClass215_19);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg0));
				Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5553(@OriginalArg(1) String arg0) {
		Static34.aString13 = arg0;
		if (Static206.aClass66_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static206.aClass66_4.anApplet1.getParameter("cookieprefix");
			@Pc(23) String local23 = Static206.aClass66_4.anApplet1.getParameter("cookiehost");
			@Pc(38) String local38 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local23;
			if (arg0.length() == 0) {
				local38 = local38 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local38 = local38 + "; Expires=" + Static171.method2805(Static282.method3962() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static458.method2592("document.cookie=\"" + local38 + "\"", Static206.aClass66_4.anApplet1);
		} catch (@Pc(87) Throwable local87) {
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!fs;Lclient!dv;Lclient!fs;Lclient!fs;B)Z")
	public static boolean method5554(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class4_Sub15_Sub1 arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		Static195.aClass76_43 = arg3;
		Static345.aClass76_75 = arg2;
		Static371.aClass76_85 = arg0;
		Static56.aClass4_Sub15_Sub1_1 = arg1;
		return true;
	}
}
