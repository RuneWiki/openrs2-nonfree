import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString20 = "yellow:";

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString21 = "wave2:";

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)I")
	public static int method501(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = arg1.length();
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local10 > local3 - local17 || local15 - local19 < local13) {
			if (local10 <= local3 - local17) {
				return -1;
			}
			if (local13 <= local15 - local19) {
				return 1;
			}
			@Pc(55) char local55;
			if (local17 == '\u0000') {
				local55 = arg1.charAt(local3++);
			} else {
				local55 = local17;
			}
			@Pc(68) char local68;
			if (local19 == '\u0000') {
				local68 = arg0.charAt(local15++);
			} else {
				local68 = local19;
			}
			local17 = Static242.method3849(local55);
			local19 = Static242.method3849(local68);
			local55 = Static288.method4342(local55, arg2);
			local68 = Static288.method4342(local68, arg2);
			if (local68 != local55 && Character.toUpperCase(local55) != Character.toUpperCase(local68)) {
				local55 = Character.toLowerCase(local55);
				local68 = Character.toLowerCase(local68);
				if (local55 != local68) {
					return Static21.method442(arg2, local55) - Static21.method442(arg2, local68);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local10, local13);
		@Pc(174) char local174;
		@Pc(140) int local140;
		for (local140 = 0; local140 < local138; local140++) {
			if (arg2 == 2) {
				local15 = local13 - local140 - 1;
				local3 = local10 - local140 - 1;
			} else {
				local15 = local140;
				local3 = local140;
			}
			@Pc(170) char local170 = arg1.charAt(local3);
			local174 = arg0.charAt(local15);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static21.method442(arg2, local170) - Static21.method442(arg2, local174);
				}
			}
		}
		local140 = local10 - local13;
		if (local140 != 0) {
			return local140;
		}
		for (@Pc(222) int local222 = 0; local222 < local138; local222++) {
			local174 = arg1.charAt(local222);
			@Pc(237) char local237 = arg0.charAt(local222);
			if (local237 != local174) {
				return Static21.method442(arg2, local174) - Static21.method442(arg2, local237);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
	public static int method502() {
		return 6;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * Static172.anInt3363 >> 8;
		if (arg0 == -1 && !Static197.aBoolean347) {
			Static179.method3039();
		} else if (arg0 != -1 && (Static226.anInt4236 != arg0 || !Static105.method1993()) && local5 != 0 && !Static197.aBoolean347) {
			Static115.method2105(Static197.aClass119_68, arg0, local5);
		}
		Static226.anInt4236 = arg0;
	}
}
