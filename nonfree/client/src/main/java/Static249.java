import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "[Lclient!nh;")
	public static Class244[] aClass244Array1;

	@OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
	public static int anInt4553;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4127(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local27++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local53.append(Static266.aCharArray2[(int) (local57 - arg0 * 37L)]);
			}
			return local53.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
	public static int method4128(@OriginalArg(0) int arg0) {
		@Pc(24) byte local24;
		if (arg0 > 12000) {
			local24 = 4;
			Static111.method1715();
		} else if (arg0 > 5000) {
			Static459.method6830();
			local24 = 3;
		} else if (arg0 <= 2000) {
			Static178.method2715();
			local24 = 1;
		} else {
			local24 = 2;
			Static339.method5106();
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 2) {
			Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
			Static638.method9004(2, false);
		}
		Static273.method4418();
		return local24;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z")
	public static boolean method4130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
