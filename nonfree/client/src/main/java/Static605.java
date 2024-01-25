import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!vm;")
	public static final Class365 aClass365_2 = new Class365();

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!vm;")
	public static final Class365 aClass365_5 = new Class365();

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!vm;")
	public static final Class365 aClass365_3 = new Class365();

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!vm;")
	public static final Class365 aClass365_4 = new Class365();

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
	public static boolean aBoolean718 = false;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt9754 = 0;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Lclient!wj;")
	public static final Class375 aClass375_7 = new Class375("runescape", 0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method8155(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static498.aCharArray6[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local72 = ' ';
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}
}
