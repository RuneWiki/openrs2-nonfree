import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eia", name = "N", descriptor = "Lclient!vt;")
	public static final Class381 aClass381_2 = new Class381();

	@OriginalMember(owner = "client!eia", name = "O", descriptor = "I")
	public static int anInt2586 = 0;

	@OriginalMember(owner = "client!eia", name = "P", descriptor = "Lclient!in;")
	public static final Class169 aClass169_71 = new Class169(0, 3);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)Z")
	public static boolean method2386() {
		if (Static280.aBoolean388) {
			try {
				if ((Boolean) Static675.method1325(Static637.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BD)V")
	public static void method2389(@OriginalArg(1) double arg0) {
		if (Static476.aDouble19 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static62.anIntArray63[local15] = local27 > 255 ? 255 : local27;
		}
		Static476.aDouble19 = arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public static void method2392() {
		Static473.method7526(Static267.aClass357_180);
		Static407.anInt7587++;
		if (Static634.aBoolean788 && Static95.aBoolean119) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (Static450.aBoolean606) {
				local24 = Static106.method1934();
				local26 = Static207.method3926();
			}
			@Pc(40) int local40 = Static7.aClass6_1.method7048() + local24;
			@Pc(46) int local46 = Static7.aClass6_1.method7049() + local26;
			local40 -= Static598.anInt10390;
			local46 -= Static605.anInt10578;
			if (local40 < Static535.anInt9366) {
				local40 = Static535.anInt9366;
			}
			if (Static541.anInt9462 > local46) {
				local46 = Static541.anInt9462;
			}
			if (Static535.anInt9366 + Static539.aClass357_140.anInt10395 < Static267.aClass357_180.anInt10395 + local40) {
				local40 = Static539.aClass357_140.anInt10395 + Static535.anInt9366 - Static267.aClass357_180.anInt10395;
			}
			if (Static541.anInt9462 + Static539.aClass357_140.anInt10465 < Static267.aClass357_180.anInt10465 + local46) {
				local46 = Static539.aClass357_140.anInt10465 + Static541.anInt9462 - Static267.aClass357_180.anInt10465;
			}
			@Pc(116) int local116 = Static539.aClass357_140.anInt10403 + local40 - Static535.anInt9366;
			@Pc(125) int local125 = local46 + Static539.aClass357_140.anInt10458 - Static541.anInt9462;
			@Pc(174) Class2_Sub45 local174;
			if (Static7.aClass6_1.method7054()) {
				if (Static267.aClass357_180.anInt10440 < Static407.anInt7587) {
					@Pc(213) int local213 = local40 - Static613.anInt10766;
					@Pc(218) int local218 = local46 - Static233.anInt4648;
					if (Static267.aClass357_180.anInt10402 < local213 || -Static267.aClass357_180.anInt10402 > local213 || local218 > Static267.aClass357_180.anInt10402 || local218 < -Static267.aClass357_180.anInt10402) {
						Static36.aBoolean34 = true;
					}
				}
				if (Static267.aClass357_180.anObjectArray6 != null && Static36.aBoolean34) {
					local174 = new Class2_Sub45();
					local174.anObjectArray2 = Static267.aClass357_180.anObjectArray6;
					local174.anInt9043 = local116;
					local174.aClass357_131 = Static267.aClass357_180;
					local174.anInt9038 = local125;
					Static518.method8031(local174);
				}
			} else {
				if (Static36.aBoolean34) {
					Static417.method6895();
					if (Static267.aClass357_180.anObjectArray7 != null) {
						local174 = new Class2_Sub45();
						local174.anInt9038 = local125;
						local174.anObjectArray2 = Static267.aClass357_180.anObjectArray7;
						local174.aClass357_132 = Static395.aClass357_105;
						local174.aClass357_131 = Static267.aClass357_180;
						local174.anInt9043 = local116;
						Static518.method8031(local174);
					}
					if (Static395.aClass357_105 != null && Static85.method1470(Static267.aClass357_180) != null) {
						Static28.method486(Static267.aClass357_180, Static395.aClass357_105);
					}
				} else if ((Static83.anInt1469 == 1 || Static307.method5029()) && Static276.anInt5124 > 2) {
					Static46.method954(Static233.anInt4648 + Static605.anInt10578, Static613.anInt10766 + Static598.anInt10390);
				} else if (Static203.method3892()) {
					Static46.method954(Static233.anInt4648 + Static605.anInt10578, Static613.anInt10766 + Static598.anInt10390);
				}
				Static267.aClass357_180 = null;
			}
		} else if (Static407.anInt7587 > 1) {
			Static267.aClass357_180 = null;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIB)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub1_Sub5 local14 = Static653.method9595(16, (long) arg1);
		local14.method2486();
		local14.anInt2680 = arg0;
	}
}
