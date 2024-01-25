import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public static int anInt6124;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4968(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static273.aCharArray4[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(74) int local74 = local48.length() - 1;
					local48.setCharAt(local74, Character.toUpperCase(local48.charAt(local74)));
					local66 = ' ';
				}
				local48.append(local66);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	public static void method4969() {
		Static536.aClass32_1.method7212();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static9.aLongArray2[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static137.aLongArray12[local29] = 0L;
		}
		Static1.anInt30 = 0;
	}
}
