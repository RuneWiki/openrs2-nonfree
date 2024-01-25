import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "Lclient!fs;")
	public static Class76 aClass76_9;

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "[I")
	public static final int[] anIntArray41 = new int[1];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!ya;Lclient!fs;ILclient!fs;)V")
	public static void method696(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) Class76 arg2) {
		Static387.aClass89_10 = Static239.method3546(Static177.anInt2985, arg2);
		Static43.aClass46_12 = arg0.method4275(Static387.aClass89_10, Static456.method327(arg1, Static177.anInt2985));
		Static34.aClass89_1 = Static239.method3546(Static62.anInt1122, arg2);
		Static207.aClass46_9 = arg0.method4275(Static34.aClass89_1, Static456.method327(arg1, Static62.anInt1122));
		Static118.aClass89_5 = Static239.method3546(Static145.anInt2907, arg2);
		Static331.aClass46_10 = arg0.method4275(Static118.aClass89_5, Static456.method327(arg1, Static145.anInt2907));
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!uu;II)V")
	public static void method697(@OriginalArg(1) Class247 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static327.anInt5675 = arg2;
		Static283.aClass247_13 = arg0;
		Static413.anInt6861 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method698(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(58) char local58;
			if (local17 == '\u0000') {
				local58 = arg1.charAt(local13++);
			} else {
				local58 = local17;
			}
			@Pc(74) char local74;
			if (local19 == '\u0000') {
				local74 = arg0.charAt(local15++);
			} else {
				local74 = local19;
			}
			local17 = Static373.method4980(local58);
			local19 = Static373.method4980(local74);
			local58 = Static318.method3753(local58, arg2);
			local74 = Static318.method3753(local74, arg2);
			if (local58 != local74 && Character.toUpperCase(local58) != Character.toUpperCase(local74)) {
				local58 = Character.toLowerCase(local58);
				local74 = Character.toLowerCase(local74);
				if (local58 != local74) {
					return Static142.method2428(arg2, local58) - Static142.method2428(arg2, local74);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local8, local11);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg2 == 2) {
				local15 = local11 - local139 - 1;
				local13 = local8 - local139 - 1;
			} else {
				local15 = local139;
				local13 = local139;
			}
			@Pc(170) char local170 = arg1.charAt(local13);
			@Pc(174) char local174 = arg0.charAt(local15);
			if (local174 != local170 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static142.method2428(arg2, local170) - Static142.method2428(arg2, local174);
				}
			}
		}
		@Pc(215) int local215 = local8 - local11;
		if (local215 != 0) {
			return local215;
		}
		for (@Pc(229) int local229 = 0; local229 < local137; local229++) {
			@Pc(235) char local235 = arg1.charAt(local229);
			@Pc(239) char local239 = arg0.charAt(local229);
			if (local239 != local235) {
				return Static142.method2428(arg2, local235) - Static142.method2428(arg2, local239);
			}
		}
		return 0;
	}
}
