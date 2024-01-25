import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!cb;")
	public static Class50 aClass50_160;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7630(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local12 > local9 && Static444.method6616(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static444.method6616(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(44) int local44 = local12 - local9;
		if (local44 < 1 || local44 > 12) {
			return null;
		}
		@Pc(59) StringBuffer local59 = new StringBuffer(local44);
		for (@Pc(61) int local61 = local9; local61 < local12; local61++) {
			@Pc(71) char local71 = arg0.charAt(local61);
			if (Static371.method5454(local71)) {
				@Pc(79) char local79 = Static669.method8718(local71);
				if (local79 != '\u0000') {
					local59.append(local79);
				}
			}
		}
		if (local59.length() == 0) {
			return null;
		} else {
			return local59.toString();
		}
	}
}
