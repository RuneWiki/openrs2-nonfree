import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	public static int anInt3430 = -1;

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
	public static int anInt3438 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method2716(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) int local17 = arg1.length();
		if (local17 > local14) {
			return false;
		}
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			@Pc(40) char local40 = arg0.charAt(local29);
			@Pc(44) char local44 = arg1.charAt(local29);
			if (local40 != local44 && Character.toLowerCase(local40) != Character.toLowerCase(local44) && Character.toUpperCase(local40) != Character.toUpperCase(local44)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)Z")
	public static boolean method2717() {
		if (Static76.aBoolean90) {
			try {
				Static311.method1064("showVideoAd", Static95.aClass184_3.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)I")
	public static int method2718(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
