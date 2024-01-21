import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!na;")
	public static Class56 aClass56_10;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!pe;")
	private static Class65 aClass65_142 = Static119.method1462("Hidden");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_140 = aClass65_142;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!bc;")
	public static Class8 aClass8_10 = new Class8(64);

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_141 = Static119.method1462("(U3");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_143 = null;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt401 = -1;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_144 = Static119.method1462("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public static int anInt402 = -1;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_145 = Static119.method1462("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method277() {
		aClass65_145 = null;
		aClass65_144 = null;
		aClass65_142 = null;
		aClass65_140 = null;
		aClass65_141 = null;
		aClass65_143 = null;
		aClass8_10 = null;
		aClass56_10 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!pe;)I")
	public static int method278(@OriginalArg(1) Class65 arg0) {
		if (Static73.anInt1662 == 1) {
			return 7;
		} else if (arg0.method1490(Static47.aClass65_518)) {
			return 1;
		} else if (arg0.method1490(Static78.aClass65_750)) {
			return 1;
		} else if (arg0.method1490(Static9.aClass65_104)) {
			return 2;
		} else if (arg0.method1490(Static120.aClass65_1126)) {
			return 2;
		} else if (arg0.method1490(Static46.aClass65_508)) {
			return 3;
		} else if (arg0.method1490(Static99.aClass65_946)) {
			return 4;
		} else if (arg0.method1490(Static40.aClass65_409)) {
			return 4;
		} else if (arg0.method1490(Static52.aClass65_553)) {
			return 5;
		} else if (arg0.method1490(Static14.aClass65_129)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!wa;B)Z")
	public static boolean method279(@OriginalArg(0) Class2_Sub22 arg0) {
		if (arg0.anIntArray373 == null) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anIntArray373.length; local22++) {
			@Pc(29) int local29 = Static53.method890(local22, arg0);
			@Pc(34) int local34 = arg0.anIntArray365[local22];
			if (arg0.anIntArray373[local22] == 2) {
				if (local34 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray373[local22] == 3) {
				if (local34 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray373[local22] == 4) {
				if (local34 == local29) {
					return false;
				}
			} else if (local29 != local34) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!na;ZIILclient!pe;Lclient!pe;)V")
	public static void method280(@OriginalArg(0) Class56 arg0, @OriginalArg(4) Class65 arg1, @OriginalArg(5) Class65 arg2) {
		@Pc(4) int local4 = arg0.method1690(arg2);
		@Pc(14) int local14 = arg0.method1667(arg1, local4);
		Static107.method1736(local14, local4, arg0, 255);
	}
}
