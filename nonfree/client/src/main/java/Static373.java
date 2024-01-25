import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "S")
	public static short aShort86 = 256;

	@OriginalMember(owner = "client!vn", name = "ab", descriptor = "Lclient!o;")
	public static final Class169 aClass169_329 = new Class169("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5217() {
		Static212.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5218(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static290.aCharArray3[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local55.length() - 1;
					local55.setCharAt(local83, Character.toUpperCase(local55.charAt(local83)));
					local73 = ' ';
				}
				local55.append(local73);
			}
			local55.reverse();
			local55.setCharAt(0, Character.toUpperCase(local55.charAt(0)));
			return local55.toString();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5226(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
