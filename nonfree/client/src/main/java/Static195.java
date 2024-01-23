import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	public static int anInt3761;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!ak;")
	public static Class7 aClass7_162;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Lclient!hi;")
	public static Class1_Sub15 aClass1_Sub15_1 = new Class1_Sub15(0, 0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method2960(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static92.method1524(arg2, 9, arg1, arg0, -1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIB)V")
	public static void method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg2);
		if (local12 == null) {
			local12 = new Class1_Sub10();
			Static39.aClass22_2.method643((long) arg2, local12);
		}
		if (arg1 >= local12.anIntArray235.length) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			@Pc(46) int local46;
			for (local46 = 0; local46 < local12.anIntArray235.length; local46++) {
				local39[local46] = local12.anIntArray235[local46];
				local44[local46] = local12.anIntArray234[local46];
			}
			for (local46 = local12.anIntArray235.length; local46 < arg1; local46++) {
				local39[local46] = -1;
				local44[local46] = 0;
			}
			local12.anIntArray235 = local39;
			local12.anIntArray234 = local44;
		}
		local12.anIntArray235[arg1] = arg3;
		local12.anIntArray234[arg1] = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)I")
	public static int method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ICI)C")
	public static char method2963(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2964(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = Static84.aClass1_Sub2_Sub12_2.method4393(arg1, 250);
		@Pc(24) int local24 = Static84.aClass1_Sub2_Sub12_2.method4375(arg1, 250) * 13;
		if (Static240.aBoolean369) {
			Static50.method866(6, 6, local12 + 8, 4 + 4 + local24, 0);
			Static50.method868(6, 6, local12 + 4 + 4, local24 + 8, 16777215);
		} else {
			Static213.method3362(6, 6, local12 + 8, local24 + 4 + 4, 0);
			Static213.method3370(6, 6, local12 + 4 + 4, local24 + 4 - -4, 16777215);
		}
		Static84.aClass1_Sub2_Sub12_2.method4388(arg1, 10, 10, local12, local24, 16777215, -1, 1, 1, 0);
		Static198.method3031(local12 + 4 + 4, 6, local24 + 8, 6);
		if (!arg0) {
			Static216.method3455(10, local24, 10, local12);
		} else if (Static240.aBoolean369) {
			Static240.method3802();
		} else {
			try {
				@Pc(155) Graphics local155 = Static189.aCanvas1.getGraphics();
				Static282.aClass23_33.method1016(local155);
			} catch (@Pc(165) Exception local165) {
				Static189.aCanvas1.repaint();
			}
		}
	}
}
