import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ew", name = "Q", descriptor = "Lclient!ff;")
	public static Class81 aClass81_49;

	@OriginalMember(owner = "client!ew", name = "O", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_5 = new Class180(2, 16);

	@OriginalMember(owner = "client!ew", name = "S", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_3 = new Class269("WTWIP", 3);

	@OriginalMember(owner = "client!ew", name = "T", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1650(@OriginalArg(1) long arg0) {
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
				@Pc(68) char local68 = Static166.aCharArray4[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local50.length() - 1;
					local50.setCharAt(local76, Character.toUpperCase(local50.charAt(local76)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(FBFF)I")
	public static int method1651(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
