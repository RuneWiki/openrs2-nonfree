import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt4934 = 0;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[S")
	public static short[] aShortArray85 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
	public static int anInt4937 = -1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z")
	public static boolean method3761() {
		if (Static49.aBoolean90) {
			try {
				Static301.method946("showVideoAd", Static13.aClass84_3.anApplet1);
				return true;
			} catch (@Pc(15) Throwable local15) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public static void method3762() {
		if (Static284.aClass127_16 != null || Static108.aClass127_7 != null) {
			return;
		}
		@Pc(20) int local20 = Static143.anInt2663;
		@Pc(100) int local100;
		@Pc(94) int local94;
		if (!Static192.aBoolean414) {
			if (local20 == 1 && Static29.anInt626 > 0) {
				@Pc(37) short local37 = Static276.aShortArray92[Static29.anInt626 - 1];
				if (local37 == 8 || local37 == 10 || local37 == 3 || local37 == 57 || local37 == 17 || local37 == 15 || local37 == 2 || local37 == 22 || local37 == 26 || local37 == 45 || local37 == 31 || local37 == 1006) {
					local94 = Static221.anIntArray522[Static29.anInt626 - 1];
					local100 = Static55.anIntArray140[Static29.anInt626 - 1];
					@Pc(104) Class127 local104 = Static75.method1287(local94);
					@Pc(107) Class1_Sub31 local107 = Static43.method794(local104);
					if (local107.method4344() || local107.method4340()) {
						Static30.aBoolean62 = false;
						Static236.anInt4923 = 0;
						if (Static284.aClass127_16 != null) {
							Static155.method2392(Static284.aClass127_16);
						}
						Static284.aClass127_16 = Static75.method1287(local94);
						Static187.anInt3509 = local100;
						Static276.anInt5532 = Static72.anInt1427;
						Static173.anInt3177 = Static207.anInt4122;
						Static155.method2392(Static284.aClass127_16);
						return;
					}
				}
			}
			if (local20 == 1 && (Static276.anInt5540 == 1 && Static29.anInt626 > 2 || Static150.method2339(Static29.anInt626 - 1))) {
				local20 = 2;
			}
			if (local20 == 2 && Static29.anInt626 > 0 || Static270.anInt5407 == 1) {
				Static167.method2549();
			}
			if (local20 == 1 && Static29.anInt626 > 0 || Static270.anInt5407 == 2) {
				Static72.method1184();
			}
			return;
		}
		@Pc(199) int local199;
		if (local20 != 1) {
			local199 = Static224.anInt4700;
			local100 = Static293.anInt5833;
			if (local199 < Static275.anInt5486 - 10 || Static275.anInt5486 + Static210.anInt4223 + 10 < local199 || local100 < Static112.anInt2084 - 10 || Static229.anInt4793 + Static112.anInt2084 + 10 < local100) {
				Static192.aBoolean414 = false;
				Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
			}
		}
		if (local20 != 1) {
			return;
		}
		local100 = Static112.anInt2084;
		local199 = Static275.anInt5486;
		local94 = Static210.anInt4223;
		@Pc(254) int local254 = -1;
		@Pc(256) int local256 = Static72.anInt1427;
		@Pc(258) int local258 = Static207.anInt4122;
		for (@Pc(260) int local260 = 0; local260 < Static29.anInt626; local260++) {
			@Pc(278) int local278;
			if (Static91.aBoolean128) {
				local278 = (Static29.anInt626 - local260 - 1) * 15 + local100 + 33;
				if (local199 < local258 && local199 + local94 > local258 && local256 > local278 - 13 && local256 < local278 + 3) {
					local254 = local260;
				}
			} else {
				local278 = (Static29.anInt626 - local260 - 1) * 15 + local100 + 31;
				if (local199 < local258 && local258 < local94 + local199 && local256 > local278 - 13 && local278 + 3 > local256) {
					local254 = local260;
				}
			}
		}
		if (local254 != -1) {
			Static1.method2(local254);
		}
		Static192.aBoolean414 = false;
		Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)I")
	public static int method3763() {
		return Static68.anInt4744 == 0 ? 0 : Static267.anInterface1Array1[Static68.anInt4744].method4330();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lclient!rl;")
	public static Class1_Sub2_Sub16 method3764(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub16 local6 = (Class1_Sub2_Sub16) Static163.aClass64_19.method1471((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = Static3.aClass7_12.method253(arg0, 0);
		} else {
			local32 = Static273.aClass7_219.method253(arg0 & 0x7FFF, 0);
		}
		local6 = new Class1_Sub2_Sub16();
		if (local32 != null) {
			local6.method3722(new Class1_Sub18(local32));
		}
		if (arg0 >= 32768) {
			local6.method3725();
		}
		Static163.aClass64_19.method1466(local6, (long) arg0);
		return local6;
	}
}
