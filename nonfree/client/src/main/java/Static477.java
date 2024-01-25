import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public static final boolean aBoolean614 = true;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[8];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method6824(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) long local30 = arg0; local30 != 0L; local30 /= 37L) {
				local28++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static154.aCharArray2[(int) (local52 - arg0 * 37L)];
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
}
