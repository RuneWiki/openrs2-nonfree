import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
	public static int anInt6324;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray148 = new int[6][];

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_69 = new Class70(39, 15);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method5091(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static344.aCharArray4[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local68 = ' ';
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}
}
