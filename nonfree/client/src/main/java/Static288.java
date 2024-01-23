import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array14;

	@OriginalMember(owner = "client!um", name = "S", descriptor = "I")
	public static int anInt5232;

	@OriginalMember(owner = "client!um", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!um", name = "X", descriptor = "[I")
	public static int[] anIntArray572 = new int[1024];

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBIIII)V")
	public static void method4340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static252.aClass57Array4[0].method3330(arg0, arg4);
		Static252.aClass57Array4[1].method3330(arg0, arg4 + arg2 - 16);
		@Pc(32) int local32 = (arg2 - 32) * arg2 / arg3;
		if (local32 < 8) {
			local32 = 8;
		}
		@Pc(50) int local50 = arg1 * (arg2 - local32 - 32) / (arg3 - arg2);
		if (!Static71.aBoolean165) {
			Static77.method1596(arg0, arg4 + 16, 16, arg2 - 32, Static46.anInt1045);
			Static77.method1596(arg0, local50 + arg4 + 16, 16, local32, Static34.anInt656);
			Static77.method1607(arg0, local50 + arg4 + 16, local32, Static49.anInt1086);
			Static77.method1607(arg0 + 1, local50 + arg4 + 16, local32, Static49.anInt1086);
			Static77.method1606(arg0, local50 + arg4 + 16, 16, Static49.anInt1086);
			Static77.method1606(arg0, arg4 + local50 + 17, 16, Static49.anInt1086);
			Static77.method1607(arg0 + 15, local50 + 16 + arg4, local32, Static252.anInt4639);
			Static77.method1607(arg0 + 14, local50 + 17 + arg4, local32 - 1, Static252.anInt4639);
			Static77.method1606(arg0, local50 + arg4 + local32 + 15, 16, Static252.anInt4639);
			Static77.method1606(arg0 + 1, local50 + 14 + arg4 + local32, 15, Static252.anInt4639);
			return;
		}
		Static93.method1777(arg0, arg4 + 16, 16, arg2 - 32, Static46.anInt1045);
		Static93.method1777(arg0, arg4 + local50 + 16, 16, local32, Static34.anInt656);
		Static93.method1774(arg0, arg4 + local50 + 16, local32, Static49.anInt1086);
		Static93.method1774(arg0 + 1, arg4 - (-local50 + -16), local32, Static49.anInt1086);
		Static93.method1760(arg0, arg4 + local50 + 16, 16, Static49.anInt1086);
		Static93.method1760(arg0, arg4 + local50 + 17, 16, Static49.anInt1086);
		Static93.method1774(arg0 + 15, local50 + 16 + arg4, local32, Static252.anInt4639);
		Static93.method1774(arg0 + 14, local50 + 17 + arg4, local32 - 1, Static252.anInt4639);
		Static93.method1760(arg0, local32 + local50 + arg4 + 15, 16, Static252.anInt4639);
		Static93.method1760(arg0 + 1, local32 + 14 + arg4 + local50, 15, Static252.anInt4639);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method4341(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(16) int local16 = Static238.aClass1_Sub5_Sub9_5.method2867(arg1, 250);
		@Pc(35) int local35 = Static238.aClass1_Sub5_Sub9_5.method2851(arg1, 250) * 13;
		if (Static71.aBoolean165) {
			Static93.method1777(6, 6, local16 + 4 + 4, local35 + 4 - -4, 0);
			Static93.method1773(6, 6, local16 + 4 + 4, local35 + 8, 16777215);
		} else {
			Static77.method1596(6, 6, local16 + 8, local35 - -4 + 4, 0);
			Static77.method1580(6, 6, local16 + 8, local35 + 4 - -4, 16777215);
		}
		Static238.aClass1_Sub5_Sub9_5.method2852(arg1, 10, 10, local16, local35, 16777215, -1, 1, 1, 0);
		Static111.method2031(6, local35 + 4 + 4, 6, local16 + 8);
		if (!arg0) {
			Static255.method4002(local16, local35, 10, 10);
		} else if (Static71.aBoolean165) {
			Static71.method1375();
		} else {
			try {
				@Pc(171) Graphics local171 = Static229.aCanvas2.getGraphics();
				Static82.aClass130_1.method4486(local171);
			} catch (@Pc(179) Exception local179) {
				Static229.aCanvas2.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BCI)C")
	public static char method4342(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
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
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
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
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
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

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
	public static void method4343(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(10, arg0);
		local8.method4064();
	}
}
