import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_172 = new Class217(30, 8);

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_177 = new Class18(35, -1);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public static void method4816() {
		Static48.aClass21_84.method851();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4817(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static301.method5240(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static301.method5240(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static257.method1021(local72)) {
				@Pc(80) char local80 = Static158.method2986(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
