import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "w", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt523 = 0;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_254 = Static119.method1462("(Y");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt526 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_255 = Static119.method1462("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!db", name = "K", descriptor = "Lclient!pe;")
	public static Class65 aClass65_256 = Static119.method1462("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_257 = Static119.method1462("::rect_debug");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!wa;)Z")
	public static boolean method347(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(2) int local2 = arg0.anInt2801;
		if (local2 == 205) {
			Static117.anInt2578 = 250;
			return true;
		}
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (local2 >= 300 && local2 <= 313) {
			local27 = (local2 - 300) / 2;
			local31 = local2 & 0x1;
			Static14.aClass9_1.method246(local31 == 1, local27);
		}
		if (local2 >= 314 && local2 <= 323) {
			local27 = (local2 - 314) / 2;
			local31 = local2 & 0x1;
			Static14.aClass9_1.method245(local27, local31 == 1);
		}
		if (local2 == 324) {
			Static14.aClass9_1.method241(false);
		}
		if (local2 == 325) {
			Static14.aClass9_1.method241(true);
		}
		if (local2 == 326) {
			Static49.aClass2_Sub4_Sub1_1.method962(152);
			Static14.aClass9_1.method242(Static49.aClass2_Sub4_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method348() {
		Static70.aClass8_37.method171();
		Static42.aClass8_28.method171();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	public static boolean method349() {
		try {
			if (Static44.anInt1080 == 2) {
				if (Static3.aClass2_Sub17_1 == null) {
					Static3.aClass2_Sub17_1 = Static141.method1803(Static78.aClass56_26, Static108.anInt2425, Static133.anInt2917);
					if (Static3.aClass2_Sub17_1 == null) {
						return false;
					}
				}
				if (Static4.aClass47_3 == null) {
					Static4.aClass47_3 = new Class47(Static16.aClass56_31, Static121.aClass56_38);
				}
				if (Static132.aClass2_Sub2_Sub2_2.method792(Static101.aClass56_33, Static4.aClass47_3, Static3.aClass2_Sub17_1)) {
					Static132.aClass2_Sub2_Sub2_2.method821();
					Static132.aClass2_Sub2_Sub2_2.method802(Static39.anInt839);
					Static132.aClass2_Sub2_Sub2_2.method827(Static3.aClass2_Sub17_1, Static121.aBoolean105);
					Static78.aClass56_26 = null;
					Static3.aClass2_Sub17_1 = null;
					Static4.aClass47_3 = null;
					Static44.anInt1080 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static132.aClass2_Sub2_Sub2_2.method793();
			Static4.aClass47_3 = null;
			Static44.anInt1080 = 0;
			Static3.aClass2_Sub17_1 = null;
			Static78.aClass56_26 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BIIIIII)V")
	public static void method350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg0 & 0x7FF;
		@Pc(25) int local25 = arg5;
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (local10 != 0) {
			local33 = Class2_Sub1_Sub4_Sub4.anIntArray251[local10];
			local37 = Class2_Sub1_Sub4_Sub4.anIntArray248[local10];
			local48 = local37 * 0 - local33 * arg5 >> 16;
			local25 = local37 * arg5 + local33 * 0 >> 16;
			local27 = local48;
		}
		if (local19 != 0) {
			local33 = Class2_Sub1_Sub4_Sub4.anIntArray251[local19];
			local37 = Class2_Sub1_Sub4_Sub4.anIntArray248[local19];
			local48 = local33 * local25 + local37 * 0 >> 16;
			local25 = local25 * local37 - local33 * 0 >> 16;
			local12 = local48;
		}
		Static130.anInt2838 = arg2 - local25;
		Static45.anInt1096 = arg0;
		Static84.anInt1818 = arg3 - local27;
		Static97.anInt2216 = arg1;
		Static69.anInt1610 = arg4 - local12;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!oc;")
	public static Class61 method351() {
		try {
			return (Class61) Class.forName("Class61_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method352() {
		anIntArray44 = null;
		aClass65_254 = null;
		aClass65_257 = null;
		aClass65_255 = null;
		aClass65_256 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public static void method353(@OriginalArg(0) Class2_Sub1_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt1972 && arg1 != -1) {
			@Pc(18) int local18 = Static23.method1313(arg1).anInt168;
			if (local18 == 1) {
				arg0.anInt1970 = 0;
				arg0.anInt1936 = arg2;
				arg0.anInt1922 = 0;
				arg0.anInt1938 = 0;
			}
			if (local18 == 2) {
				arg0.anInt1922 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt1972 == -1 || Static23.method1313(arg1).anInt179 >= Static23.method1313(arg0.anInt1972).anInt179) {
			arg0.anInt1961 = arg0.anInt1935;
			arg0.anInt1936 = arg2;
			arg0.anInt1922 = 0;
			arg0.anInt1972 = arg1;
			arg0.anInt1970 = 0;
			arg0.anInt1938 = 0;
		}
	}
}
