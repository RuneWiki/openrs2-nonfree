import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_49 = new Class6(0, -1);

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[128][128];

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
	public static int anInt3316 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method2984(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) String local6 = arg0.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = (arg1 ? Static111.aClass109_1.anInt3657 : Static111.aClass109_1.anInt3652) + local17;
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(35) Class1_Sub1_Sub17 local35 = Static111.aClass109_1.method3268(local29);
			if (local35.aBoolean443 && local35.method5805().toLowerCase().indexOf(local6) != -1) {
				if (local11 >= 50) {
					Static357.anInt6481 = -1;
					Static210.aShortArray70 = null;
					return;
				}
				if (local11 >= local9.length) {
					@Pc(69) short[] local69 = new short[local9.length * 2];
					for (@Pc(71) int local71 = 0; local71 < local11; local71++) {
						local69[local71] = local9[local71];
					}
					local9 = local69;
				}
				local9[local11++] = (short) local29;
			}
		}
		Static357.anInt6481 = local11;
		Static249.anInt4839 = 0;
		Static210.aShortArray70 = local9;
		@Pc(111) String[] local111 = new String[Static357.anInt6481];
		for (@Pc(113) int local113 = 0; local113 < Static357.anInt6481; local113++) {
			local111[local113] = Static111.aClass109_1.method3268(local9[local113]).method5805();
		}
		Static473.method6886(local111, Static210.aShortArray70);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!kda;Lclient!lp;I)V")
	public static void method2985(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class182 arg1) {
		Static265.aClass160_60 = arg0;
		Static239.aClass182_6 = arg1;
		Static136.aString21 = "";
		if (Static283.aString53.startsWith("win")) {
			Static136.aString21 = Static136.aString21 + "windows/";
		} else if (Static283.aString53.startsWith("linux")) {
			Static136.aString21 = Static136.aString21 + "linux/";
		} else if (Static283.aString53.startsWith("mac")) {
			Static136.aString21 = Static136.aString21 + "macos/";
		}
		if (Static283.anInt5580 == 2) {
			Static136.aString21 = Static136.aString21 + "msjava/";
		} else if (Static283.aString51.startsWith("amd64") || Static283.aString51.startsWith("x86_64")) {
			Static136.aString21 = Static136.aString21 + "x86_64/";
		} else if (Static283.aString51.startsWith("i386") || Static283.aString51.startsWith("i486") || Static283.aString51.startsWith("i586") || Static283.aString51.startsWith("x86")) {
			Static136.aString21 = Static136.aString21 + "x86/";
		} else if (Static283.aString51.startsWith("ppc")) {
			Static136.aString21 = Static136.aString21 + "ppc/";
		} else {
			Static136.aString21 = Static136.aString21 + "universal/";
		}
	}
}
