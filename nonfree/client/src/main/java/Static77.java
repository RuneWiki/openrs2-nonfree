import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public static int anInt1648;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!ch;")
	public static Class28 aClass28_6;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array5;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	public static int anInt1651;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
	public static int[] anIntArray116 = new int[500];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1383(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static183.aCharArray3[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					local75 = ' ';
					@Pc(88) int local88 = local53.length() - 1;
					local53.setCharAt(local88, Character.toUpperCase(local53.charAt(local88)));
				}
				local53.append(local75);
			}
			local53.reverse();
			local53.setCharAt(0, Character.toUpperCase(local53.charAt(0)));
			return local53.toString();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method1384() {
		if (!Static67.method4885() && Static8.anInt271 != Static208.anInt4335) {
			Static87.method1633(false, Static208.anInt4335, Static68.anInt1503, false, Static111.aClass36_Sub3_Sub2_1.anIntArray468[0], Static246.anInt5145, Static111.aClass36_Sub3_Sub2_1.anIntArray465[0]);
		} else if (Static208.anInt4335 != Static200.anInt4158 && Static91.method1715(Static208.anInt4335)) {
			Static200.anInt4158 = Static208.anInt4335;
			Static296.method4924();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public static void method1386(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static112.method2083();
		} else if (arg0 == 2) {
			Static25.method4645();
		} else if (arg0 == 3) {
			Static65.method1263();
		} else {
			throw new RuntimeException();
		}
	}
}
