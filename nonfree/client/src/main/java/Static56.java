import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[6][];

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static508.method7110(arg1, arg0) || Static48.method6683(arg0, arg1);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!ac;I)Lclient!dv;")
	public static Class70 method959(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt1778 = arg0.method7945();
		local7.aClass1_Sub8_Sub17_1 = Static109.aClass211_1.method4599(local7.anInt1778);
		return local7;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method961(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				local49.append(Static436.aCharArray10[(int) (local53 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Lclient!ln;")
	public static Class210 method962() {
		try {
			return (Class210) Class.forName("Class210_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class210_Sub2();
		}
	}
}
