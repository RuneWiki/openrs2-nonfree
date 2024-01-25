import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "Lclient!dp;")
	public static Class53 aClass53_112;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "Lclient!dp;")
	public static Class53 aClass53_113;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray160;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	public static int anInt4564 = 127;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIC)C")
	public static char method4270(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIII)V")
	public static void method4272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static131.aClass6_Sub10_Sub1_2.method2886(133);
		}
		if (arg1 == 1) {
			Static131.aClass6_Sub10_Sub1_2.method2886(55);
		}
		Static131.aClass6_Sub10_Sub1_2.method4020(Static300.anInt5672 + arg0);
		Static131.aClass6_Sub10_Sub1_2.method4020(Static44.anInt881 + arg2);
		Static131.aClass6_Sub10_Sub1_2.method4019(Static354.aBooleanArray30[82] ? 1 : 0);
		Static125.aBoolean198 = false;
		Static299.anInt5652 = arg2;
		Static24.anInt385 = arg0;
		Static98.method2027();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
	public static void method4273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14 local9 = Static139.aClass14ArrayArray1[arg1][arg0];
		Static137.method2627(5000, local9 == null ? Static54.aClass14_1 : local9);
	}
}
