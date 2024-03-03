import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!js", name = "O", descriptor = "I")
	public static int anInt3225;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 3)
	public static String method3230(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Class230.aCharArray6[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local55.length() - 1;
					local73 = ' ';
					local55.setCharAt(local83, Character.toUpperCase(local55.charAt(local83)));
				}
				local55.append(local73);
			}
			local55.reverse();
			local55.setCharAt(0, Character.toUpperCase(local55.charAt(0)));
			return local55.toString();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!bu;[[B)V", line = 82)
	public static void method3232(@OriginalArg(1) Class29_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static99.aByteArrayArray6.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static268.anIntArray372[local18] >> 8) * 64 - Static154.anInt3136;
				@Pc(48) int local48 = (Static268.anIntArray372[local18] & 0xFF) * 64 - Static139.anInt2716;
				Static36.method1135();
				arg0.method1109(Class2_Sub3_Sub18.aClass46Array1, local48, local24, local37, Static177.aClass19_8);
			}
		}
	}
}
