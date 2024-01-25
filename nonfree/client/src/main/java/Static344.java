import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
	public static int anInt6480;

	@OriginalMember(owner = "client!mga", name = "l", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
	public static int anInt6482;

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "J")
	public static long aLong169 = -1L;

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_55 = new Class208(50, 8);

	@OriginalMember(owner = "client!mga", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!vd;BLclient!ge;)V")
	public static void method5575(@OriginalArg(0) Class353 arg0, @OriginalArg(2) Class112 arg1) {
		Static511.aClass353_103 = arg0;
		Static311.aString74 = "";
		Static194.aClass112_1 = arg1;
		if (Class138.aString50.startsWith("win")) {
			Static311.aString74 = Static311.aString74 + "windows/";
		} else if (Class138.aString50.startsWith("linux")) {
			Static311.aString74 = Static311.aString74 + "linux/";
		} else if (Class138.aString50.startsWith("mac")) {
			Static311.aString74 = Static311.aString74 + "macos/";
		}
		if (Static194.aClass112_1.aBoolean264) {
			Static311.aString74 = Static311.aString74 + "msjava/";
		} else if (Class138.aString51.startsWith("amd64") || Class138.aString51.startsWith("x86_64")) {
			Static311.aString74 = Static311.aString74 + "x86_64/";
		} else if (Class138.aString51.startsWith("i386") || Class138.aString51.startsWith("i486") || Class138.aString51.startsWith("i586") || Class138.aString51.startsWith("x86")) {
			Static311.aString74 = Static311.aString74 + "x86/";
		} else if (Class138.aString51.startsWith("ppc")) {
			Static311.aString74 = Static311.aString74 + "ppc/";
		} else {
			Static311.aString74 = Static311.aString74 + "universal/";
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5576(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local11 && Static60.method1078(arg0.charAt(local11))) {
			local11++;
		}
		while (local19 > local11 && Static60.method1078(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(69) StringBuffer local69 = new StringBuffer(local54);
		for (@Pc(71) int local71 = local11; local71 < local19; local71++) {
			@Pc(77) char local77 = arg0.charAt(local71);
			if (Static313.method5234(local77)) {
				@Pc(87) char local87 = Static236.method4100(local77);
				if (local87 != '\u0000') {
					local69.append(local87);
				}
			}
		}
		if (local69.length() == 0) {
			return null;
		} else {
			return local69.toString();
		}
	}
}
