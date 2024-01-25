import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!fq;")
	public static Class83 aClass83_5;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5809(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static185.method2669(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static185.method2669(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(45) int local45 = local14 - local11;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(60) StringBuffer local60 = new StringBuffer(local45);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static443.method4038(local75)) {
				@Pc(83) char local83 = Static175.method2470(local75);
				if (local83 != '\u0000') {
					local60.append(local83);
				}
			}
		}
		if (local60.length() == 0) {
			return null;
		} else {
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method5810(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static105.aClass119_52.method2673(Static394.anInt6582) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static25.aClass119_12.method2673(Static394.anInt6582) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
