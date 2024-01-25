import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	public static int anInt8610;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
	public static final int[] anIntArray671 = new int[1000];

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method6951(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			for (@Pc(38) long local38 = arg0; local38 != 0L; local38 /= 37L) {
				local36++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				@Pc(74) char local74 = Static147.aCharArray4[(int) (local60 - arg0 * 37L)];
				if (local74 == '_') {
					@Pc(82) int local82 = local56.length() - 1;
					local56.setCharAt(local82, Character.toUpperCase(local56.charAt(local82)));
					local74 = ' ';
				}
				local56.append(local74);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6952(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg1, 3);
		local8.method1327();
		local8.aString28 = arg0;
	}
}
