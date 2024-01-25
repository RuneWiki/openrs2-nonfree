import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public static int anInt4021;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static int anInt4016 = 0;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_70 = new Class117("K", "T", "K", "K");

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public static final int anInt4020 = 12;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	public static int anInt4028 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3569(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static215.aCharArray3[(int) (local54 - arg0 * 37L)];
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

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!kh;I)Ljava/lang/String;")
	public static String method3582(@OriginalArg(0) Class11_Sub25 arg0) {
		return Static180.method4111(arg0);
	}
}
