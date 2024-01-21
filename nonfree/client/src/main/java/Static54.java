import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_6;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!fd;")
	public static Class24 aClass24_14;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!je;")
	private static Class40 aClass40_715 = Static69.method1231("Sorry invited players only)3");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_716 = aClass40_715;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!je;")
	private static Class40 aClass40_718 = Static69.method1231("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_717 = aClass40_718;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!ob;")
	public static Class55 aClass55_42 = new Class55(260);

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
	public static int[] anIntArray143 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_719 = Static69.method1231("mapdots");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!r;")
	public static RuntimeException_Sub1 method945(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString5 = local12.aString5 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIB)Lclient!id;")
	public static Class2_Sub11 method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class2_Sub11 local3 = new Class2_Sub11();
		local3.anInt1312 = arg1;
		local3.anInt1313 = arg2;
		Static61.aClass77_6.method2030((long) arg0, local3);
		Static134.method1097(arg2);
		Static15.method237(arg2);
		@Pc(29) Class2_Sub13 local29 = Static55.method972(arg0);
		if (local29 != null) {
			Static17.method316(local29);
		}
		if (Static56.aClass2_Sub13_7 != null) {
			Static17.method316(Static56.aClass2_Sub13_7);
			Static56.aClass2_Sub13_7 = null;
		}
		Static8.aBoolean21 = false;
		Static57.anInt1500 = 0;
		Static94.method1736(Static2.anInt89, Static47.anInt1288, Static47.anInt1277, Static102.anInt2481);
		if (Static92.anInt2332 != -1) {
			Static74.method627(1, Static92.anInt2332);
		}
		return local3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	public static boolean method947(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static83.anIntArray236[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1004;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!kc;IIIIIII)V")
	public static void method948(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static46.aBoolean88) {
			Static80.anInt2082 = 32;
		} else {
			Static80.anInt2082 = 0;
		}
		Static46.aBoolean88 = false;
		@Pc(134) int local134;
		if (Static107.anInt2544 != 0) {
			if (arg2 >= arg4 && arg2 < arg4 + 16 && arg1 >= arg3 && arg1 < arg3 + 16) {
				arg0.anInt1598 -= 4;
				Static17.method316(arg0);
			} else if (arg4 <= arg2 && arg4 + 16 > arg2 && arg1 >= arg6 + arg3 - 16 && arg1 < arg3 + arg6) {
				arg0.anInt1598 += 4;
				Static17.method316(arg0);
			} else if (arg4 - Static80.anInt2082 <= arg2 && Static80.anInt2082 + arg4 + 16 > arg2 && arg3 + 16 <= arg1 && arg6 + arg3 - 16 > arg1) {
				local134 = arg6 * (arg6 - 32) / arg5;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(151) int local151 = arg1 - local134 / 2 - arg3 - 16;
				@Pc(158) int local158 = arg6 - local134 - 32;
				arg0.anInt1598 = local151 * (arg5 - arg6) / local158;
				Static17.method316(arg0);
				Static46.aBoolean88 = true;
			}
		}
		if (Static74.anInt923 == 0) {
			return;
		}
		local134 = arg0.anInt1599;
		if (arg2 >= arg4 - local134 && arg1 >= arg3 && arg2 < arg4 + 16 && arg1 <= arg3 + arg6) {
			arg0.anInt1598 += Static74.anInt923 * 45;
			Static17.method316(arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method949() {
		aClass40_715 = null;
		aClass40_717 = null;
		aClass40_716 = null;
		aClass24_14 = null;
		aClass2_Sub13_6 = null;
		anIntArray143 = null;
		aClass40_718 = null;
		aClass55_42 = null;
		aClass2_Sub1_Sub2_Sub1_10 = null;
		aClass40_719 = null;
	}
}
