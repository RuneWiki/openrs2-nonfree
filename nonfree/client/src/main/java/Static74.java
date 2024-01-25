import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!d;")
	public static final Class44 aClass44_9 = new Class44(32);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg4) {
			Static175.method1916(arg3, arg4, arg5, arg0, arg2, arg6);
		} else if (arg5 - arg4 >= Static3.anInt45 && Static112.anInt1900 >= arg4 + arg5 && arg2 - arg1 >= Static356.anInt5817 && arg2 + arg1 <= Static3.anInt46) {
			Static62.method988(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			Static97.method1367(arg6, arg1, arg0, arg4, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method1085(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static144.anInt2596 != 3) {
			Static239.aClass165_7 = new Class165();
			Static239.aClass165_7.aString50 = arg0;
			Static239.aClass165_7.anInt4240 = arg1;
			if (Static350.aClass170_10 != Static289.aClass170_8) {
				Static239.aClass165_7.anInt4241 = Static239.aClass165_7.anInt4240 + 50000;
				Static239.aClass165_7.anInt4244 = Static239.aClass165_7.anInt4240 + 40000;
			}
			return true;
		}
		@Pc(35) String local35 = "";
		if (Static350.aClass170_10 != Static289.aClass170_8) {
			local35 = ":" + (arg1 + 7000);
		}
		@Pc(55) String local55 = "";
		if (Static452.aString74 != null) {
			local55 = "/p=" + Static452.aString74;
		}
		@Pc(103) String local103 = "http://" + arg0 + local35 + "/l=" + Static38.anInt4834 + "/a=" + Static250.anInt4070 + local55 + "/j" + (Static348.aBoolean387 ? "1" : "0") + ",o" + (Static192.aBoolean206 ? "1" : "0") + ",a2";
		try {
			Static440.aClient1.getAppletContext().showDocument(new URL(local103), "_self");
			return true;
		} catch (@Pc(113) Exception local113) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1086() {
		Static435.aClass49Array13 = null;
		Static138.aClass23_2 = null;
		Static219.aClass49Array8 = null;
		Static394.aClass49Array12 = null;
		Static429.aClass49_24 = null;
		Static428.aClass23_4 = null;
		Static56.aClass23_1 = null;
		Static107.aClass49Array5 = null;
		Static102.aClass49Array4 = null;
		Static44.aClass49Array2 = null;
		Static269.aClass49Array9 = null;
		Static454.aClass49Array14 = null;
		Static217.aClass49Array7 = null;
		Static278.aClass49Array10 = null;
		Static18.aClass49_1 = null;
		Static112.aClass49Array6 = null;
		Static5.aClass49Array1 = null;
		Static49.aClass49Array3 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public static void method1088(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub2_Sub1 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class125 local8 = Static110.aClass125Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static459.anInt4775; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static439.anInt7318; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static419.anInt6980;
							@Pc(32) int local32 = local12 << Static419.anInt6980;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class125 local41 = Static110.aClass125Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1089(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static202.aClass198_55.method4012(Static38.anInt4834) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static321.aClass198_92.method4012(Static38.anInt4834) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
