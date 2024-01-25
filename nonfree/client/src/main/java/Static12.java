import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public static void method4706() {
		if (Static20.anInt7224 <= 0) {
			Static132.aString19 = "";
			return;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static65.aStringArray8.length; local11++) {
			if (Static65.aStringArray8[local11].startsWith("--> ")) {
				@Pc(22) int local22 = ~Static20.anInt7224;
				local9++;
				if (local22 == ~local9) {
					Static132.aString19 = Static65.aStringArray8[local11].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IJZIZZILjava/lang/String;Ljava/lang/String;II)V")
	public static void method4708(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static87.aBoolean142 && Static352.anInt6233 < 500) {
			@Pc(21) int local21 = arg5 == -1 ? Static457.anInt7815 : arg5;
			@Pc(35) Class4_Sub14 local35 = new Class4_Sub14(arg7, arg6, local21, arg0, arg8, arg1, arg2, arg9, arg4, arg3);
			Static289.aClass91_31.method2587(local35);
			Static352.anInt6233++;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIZ)Ljava/lang/String;")
	public static String method4709(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		@Pc(40) int local40 = arg0 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(57) char[] local57 = new char[local36];
		local57[0] = '+';
		for (@Pc(65) int local65 = local36 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 >= 10) {
				local57[local65] = (char) (local80 + 87);
			} else {
				local57[local65] = (char) (local80 + 48);
			}
		}
		return new String(local57);
	}
}
