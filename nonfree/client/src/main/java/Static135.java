import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZZ)V")
	public static void method2550(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static267.anInt5241--;
			if (Static267.anInt5241 == 0) {
				Static403.anIntArray560 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static532.anInt8970--;
		if (Static532.anInt8970 == 0) {
			Static444.anIntArray587 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!ae;Lclient!gp;)V")
	public static void method2551(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class117 arg1) {
		Static386.aClass117_96 = arg1;
		Static390.aClass9_21 = arg0;
		Static314.aString43 = "";
		if (Static9.aString8.startsWith("win")) {
			Static314.aString43 = Static314.aString43 + "windows/";
		} else if (Static9.aString8.startsWith("linux")) {
			Static314.aString43 = Static314.aString43 + "linux/";
		} else if (Static9.aString8.startsWith("mac")) {
			Static314.aString43 = Static314.aString43 + "macos/";
		}
		if (Static9.anInt148 == 2) {
			Static314.aString43 = Static314.aString43 + "msjava/";
		} else if (Static9.aString6.startsWith("amd64") || Static9.aString6.startsWith("x86_64")) {
			Static314.aString43 = Static314.aString43 + "x86_64/";
		} else if (Static9.aString6.startsWith("i386") || Static9.aString6.startsWith("i486") || Static9.aString6.startsWith("i586") || Static9.aString6.startsWith("x86")) {
			Static314.aString43 = Static314.aString43 + "x86/";
		} else if (Static9.aString6.startsWith("ppc")) {
			Static314.aString43 = Static314.aString43 + "ppc/";
		} else {
			Static314.aString43 = Static314.aString43 + "universal/";
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2552(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static521.aClass40_147.method1063(Static194.anInt3737) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static353.aClass40_100.method1063(Static194.anInt3737) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!um;Lclient!um;B)V")
	public static void method2553(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		if (arg1.aClass5_283 != null) {
			arg1.method7425();
		}
		arg1.aClass5_284 = arg0;
		arg1.aClass5_283 = arg0.aClass5_283;
		arg1.aClass5_283.aClass5_284 = arg1;
		arg1.aClass5_284.aClass5_283 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method2554() {
		@Pc(7) String local7 = "www";
		if (Static134.aClass199_4 == Static242.aClass199_6) {
			local7 = "www-wtrc";
		} else if (Static134.aClass199_4 == Static75.aClass199_2) {
			local7 = "www-wtqa";
		} else if (Static134.aClass199_4 == Static14.aClass199_1) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static466.aString72 != null) {
			local33 = "/p=" + Static466.aString72;
		}
		return "http://" + local7 + "." + Static525.aClass155_4.aString44 + ".com/l=" + Static194.anInt3737 + "/a=" + Static433.anInt7630 + local33 + "/";
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!gp;I)V")
	public static void method2555(@OriginalArg(0) Class117 arg0) {
		Static522.aClass117_221 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method2556(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static248.aClass131Array4 == Static511.aClass131Array6) {
			return;
		}
		@Pc(9) int local9 = Static493.aClass131Array5[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class131 local22 = Static493.aClass131Array5[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
