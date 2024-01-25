import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dw", name = "L", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_58 = new Class88("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!pe;I)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1) {
		if (Static51.aBoolean637) {
			arg0 = 0;
			Static51.aBoolean637 = false;
		}
		if (Static528.aClass240_10 != null && Static528.aClass240_10.method5762(arg1)) {
			return;
		}
		Static528.aClass240_10 = arg1;
		Static119.aLong77 = Static76.method1679();
		Static355.anInt6648 = arg0;
		Static81.anInt1954 = arg0;
		if (Static81.anInt1954 == 0) {
			Static73.method1669();
			return;
		}
		Static414.aFloat177 = Static345.aFloat131;
		Static290.anInt5633 = Static372.anInt6881;
		Static65.anInt1499 = Static9.anInt137;
		Static454.aFloat182 = Static520.aFloat189;
		Static338.aFloat76 = Static141.aFloat78;
		Static235.aFloat185 = Static425.aFloat178;
		Static162.anInt3762 = Static173.anInt3935;
		Static540.aClass124_4 = Static98.aClass124_1;
		Static384.aFloat173 = Static84.aFloat55;
		Static346.aFloat132 = Static436.aFloat179;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)Lclient!mc;")
	public static Class198 method2137(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static71.aClass198ArrayArray1[local7] == null || Static71.aClass198ArrayArray1[local7][local17] == null) {
			@Pc(31) boolean local31 = Static291.method4732(local7);
			if (!local31) {
				return null;
			}
		}
		return Static71.aClass198ArrayArray1[local7][local17];
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2138(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static230.aCharArray3[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}
}
