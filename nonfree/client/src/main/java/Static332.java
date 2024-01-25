import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!laa", name = "S", descriptor = "I")
	public static int anInt5721;

	@OriginalMember(owner = "client!laa", name = "Y", descriptor = "Z")
	public static boolean aBoolean410;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(CBI)C")
	public static char method5144(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IBIII)V")
	public static void method5146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		if (arg2 <= arg1) {
			for (local13 = arg2; local13 < arg1; local13++) {
				Static144.anIntArrayArray30[local13][arg3] = arg0;
			}
		} else {
			for (local13 = arg1; local13 < arg2; local13++) {
				Static144.anIntArrayArray30[local13][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method5147(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static344.aClass173_5.aBoolean358) {
			Static564.aClass357_4 = new Class357();
			Static564.aClass357_4.aString110 = arg1;
			Static564.aClass357_4.anInt9936 = arg0;
			if (Static115.aClass59_4 != Static548.aClass59_10) {
				Static564.aClass357_4.anInt9929 = Static564.aClass357_4.anInt9936 + 40000;
				Static564.aClass357_4.anInt9932 = Static564.aClass357_4.anInt9936 + 50000;
			}
			for (@Pc(37) int local37 = 0; local37 < Static545.aClass169_Sub1Array2.length; local37++) {
				if (Static545.aClass169_Sub1Array2[local37].anInt4675 == arg0) {
					Static528.anInt9083 = Static545.aClass169_Sub1Array2[local37].anInt4662;
				}
			}
			return true;
		}
		@Pc(65) String local65 = "";
		if (Static115.aClass59_4 != Static548.aClass59_10) {
			local65 = ":" + (arg0 + 7000);
		}
		@Pc(80) String local80 = "";
		if (Static130.aString30 != null) {
			local80 = "/p=" + Static130.aString30;
		}
		@Pc(154) String local154 = "http://" + arg1 + local65 + "/l=" + Static26.anInt352 + "/a=" + Static449.anInt7513 + local80 + "/j" + (Static571.aBoolean654 ? "1" : "0") + ",o" + (Static482.aBoolean588 ? "1" : "0") + ",a2";
		try {
			Static105.aClient4.getAppletContext().showDocument(new URL(local154), "_self");
			return true;
		} catch (@Pc(166) Exception local166) {
			return false;
		}
	}
}
