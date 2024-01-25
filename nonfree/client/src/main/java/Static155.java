import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "Lclient!gn;")
	public static final Class97 aClass97_3 = new Class97();

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_39 = new Class208(61, 3);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public static void method2317() {
		Static38.aClipboard1 = null;
		Static162.aBoolean186 = false;
		Static323.method4576();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2318(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static265.method3558(arg0.charAt(local9))) {
			local9++;
		}
		while (local12 > local9 && Static265.method3558(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(49) int local49 = local12 - local9;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local49);
		for (@Pc(68) int local68 = local9; local68 < local12; local68++) {
			@Pc(73) char local73 = arg0.charAt(local68);
			if (Static371.method5166(local73)) {
				@Pc(83) char local83 = Static451.method5754(local73);
				if (local83 != '\u0000') {
					local66.append(local83);
				}
			}
		}
		if (local66.length() == 0) {
			return null;
		} else {
			return local66.toString();
		}
	}
}
