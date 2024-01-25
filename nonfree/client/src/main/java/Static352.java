import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray61;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8968(@OriginalArg(0) String arg0) {
		@Pc(15) StringBuffer local15 = new StringBuffer();
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(25) char local25 = arg0.charAt(local20);
			if (local25 == '%' && local18 > local20 + 2) {
				local25 = arg0.charAt(local20 + 1);
				@Pc(72) int local72;
				if (local25 >= '0' && local25 <= '9') {
					local72 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local15.append('%');
						continue;
					}
					local72 = local25 + 10 - 65;
				}
				local72 *= 16;
				local25 = arg0.charAt(local20 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local72 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local72 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local15.append('%');
						continue;
					}
					local72 += local25 - 55;
				}
				if (local72 != 0 && Static137.method2413((byte) local72)) {
					local15.append(Static144.method2600((byte) local72));
				}
				local20 += 2;
			} else if (local25 == '+') {
				local15.append(' ');
			} else {
				local15.append(local25);
			}
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)V")
	public static void method8971() {
		if (Static108.aClass65_3 != null) {
			Static108.aClass65_3.method6923();
			Static108.aClass65_3 = null;
			Static48.aClass73_14 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;B)Lclient!ha;")
	public static Class65 method8975(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Canvas arg2) {
		return new Class65_Sub1(arg2, arg1, arg0);
	}
}
