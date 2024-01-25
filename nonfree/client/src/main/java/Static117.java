import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "Lclient!ra;")
	public static Class170 aClass170_52;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	public static int anInt2497 = 0;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "[Lclient!dl;")
	public static final Class49[] aClass49Array1 = new Class49[4];

	@OriginalMember(owner = "client!hk", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Loaded update list";

	@OriginalMember(owner = "client!hk", name = "Z", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2311(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
	public static void method2312() {
		if (Static7.aClass93_1 != null) {
			@Pc(3) Class93 local3 = Static7.aClass93_1;
			synchronized (Static7.aClass93_1) {
				Static7.aClass93_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	public static void method2313(@OriginalArg(0) int arg0) {
		@Pc(9) Class66 local9 = Static207.aClass66_71;
		synchronized (Static207.aClass66_71) {
			Static207.aClass66_71.method1933();
			Static207.aClass66_71 = new Class66(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)[Lclient!d;")
	public static Class43[] method2314() {
		if (Static163.aClass43Array1 == null) {
			@Pc(18) Class43[] local18 = Static276.method4705(Static202.aClass10_3);
			@Pc(22) Class43[] local22 = new Class43[local18.length];
			@Pc(24) int local24 = 0;
			@Pc(80) int local80;
			@Pc(86) Class43 local86;
			label63: for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
				@Pc(32) Class43 local32 = local18[local26];
				if ((local32.anInt1213 <= 0 || local32.anInt1213 >= 24) && local32.anInt1217 >= 800 && local32.anInt1214 >= 600 && (Static46.anInt1196 >= 96 || Static134.anInt2746 != 0 || local32.anInt1217 <= 1024 && local32.anInt1214 <= 768)) {
					for (local80 = 0; local80 < local24; local80++) {
						local86 = local22[local80];
						if (local86.anInt1217 == local32.anInt1217 && local32.anInt1214 == local86.anInt1214) {
							if (local32.anInt1213 > local86.anInt1213) {
								local22[local80] = local32;
							}
							continue label63;
						}
					}
					local22[local24] = local32;
					local24++;
				}
			}
			Static163.aClass43Array1 = new Class43[local24];
			Static359.method755(local22, 0, Static163.aClass43Array1, 0, local24);
			@Pc(154) int[] local154 = new int[Static163.aClass43Array1.length];
			for (local80 = 0; local80 < Static163.aClass43Array1.length; local80++) {
				local86 = Static163.aClass43Array1[local80];
				local154[local80] = local86.anInt1214 * local86.anInt1217;
			}
			Static317.method5467(local154, Static163.aClass43Array1);
		}
		return Static163.aClass43Array1;
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V")
	public static void method2316() {
		for (@Pc(3) int local3 = 0; local3 < Static214.anInt4250; local3++) {
			@Pc(11) Class55 local11 = Static177.method2205(local3);
			if (local11 != null && local11.anInt1732 == 0) {
				Static2.anIntArray2[local3] = 0;
				Static69.anIntArray80[local3] = 0;
			}
		}
		Static352.aClass42_61 = new Class42(16);
	}
}
