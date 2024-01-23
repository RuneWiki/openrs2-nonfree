import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
	public static int[] anIntArray439 = new int[50];

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	public static int anInt4959 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIC)C")
	public static char method3870(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3871(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local52.append(Static23.aCharArray1[(int) (local58 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!pg;")
	public static Class128 method3872(@OriginalArg(0) int arg0) {
		@Pc(17) Class128 local17 = (Class128) Static246.aClass135_31.method3316((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(28) byte[] local28 = Static116.aClass91_205.method2495(1, arg0);
		local17 = new Class128();
		if (local28 != null) {
			local17.method3246(new Class1_Sub11(local28), arg0);
		}
		Static246.aClass135_31.method3321((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public static void method3874() {
		Static216.aClass135_24.method3320(5);
	}
}
