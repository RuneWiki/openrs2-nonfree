import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 aClass4_Sub3_Sub6_Sub3_5;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_16;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!od;")
	private static Class60 aClass60_978 = Static41.method597(" is already on your ignore list");

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!od;")
	private static Class60 aClass60_979 = Static41.method597("Please try again)3");

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_980 = Static41.method597("mapedge");

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_981 = aClass60_978;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_982 = Static41.method597("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_983 = aClass60_982;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_984 = Static41.method597("Angreifen");

	@OriginalMember(owner = "client!se", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_985 = Static41.method597("Registrierter Benutzer");

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!od;")
	public static Class60 aClass60_986 = aClass60_979;

	@OriginalMember(owner = "client!se", name = "E", descriptor = "I")
	public static int anInt2495 = 0;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!od;")
	public static Class60 aClass60_987 = Static41.method597("leuchten2:");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method1739() {
		aClass60_983 = null;
		aClass60_979 = null;
		aClass60_982 = null;
		aClass10_Sub1_16 = null;
		aClass60_986 = null;
		aClass60_980 = null;
		aClass60_987 = null;
		aClass60_985 = null;
		aClass60_978 = null;
		aClass60_984 = null;
		aClass4_Sub3_Sub6_Sub3_5 = null;
		aClass60_981 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static63.anInt1593 != 0 && arg1 != -1) {
			Static6.method57(arg1, 0, Static79.aClass10_Sub1_14, Static63.anInt1593);
			Static130.aBoolean126 = true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)I")
	public static int method1741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(11) int local11 = arg0 / arg1;
		@Pc(17) int local17 = arg1 - 1 & arg2;
		@Pc(22) int local22 = Static48.method662(local3, local11);
		@Pc(28) int local28 = arg0 & arg1 - 1;
		@Pc(35) int local35 = Static48.method662(local3 + 1, local11);
		@Pc(42) int local42 = Static48.method662(local3, local11 + 1);
		@Pc(51) int local51 = Static48.method662(local3 + 1, local11 + 1);
		@Pc(58) int local58 = Static103.method1714(local22, local35, arg1, local17);
		@Pc(65) int local65 = Static103.method1714(local42, local51, arg1, local17);
		return Static103.method1714(local58, local65, arg1, local28);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)I")
	public static int method1742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub17 local12 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray321.length; local26++) {
				if (arg0 == local12.anIntArray322[local26]) {
					local24 += local12.anIntArray321[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!c;B)V")
	public static void method1743(@OriginalArg(0) Class10 arg0) {
		Static35.aClass10_13 = arg0;
	}
}
