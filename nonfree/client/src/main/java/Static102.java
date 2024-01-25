import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dja", name = "A", descriptor = "Lclient!st;")
	public static final Class314 aClass314_38 = new Class314(77, -1);

	@OriginalMember(owner = "client!dja", name = "B", descriptor = "[I")
	public static final int[] anIntArray134 = new int[13];

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IB)Z")
	public static boolean method1711(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZILclient!cea;)V")
	public static void method1713(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class9_Sub2_Sub1_Sub2_Sub1 arg1) {
		if (Static285.anInt7798 >= 400) {
			return;
		}
		if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 != arg1) {
			@Pc(156) String local156;
			if (arg1.anInt1316 == 0) {
				@Pc(66) boolean local66 = true;
				if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1297 != -1 && arg1.anInt1297 != -1) {
					@Pc(87) int local87 = arg1.anInt1297 <= Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1297 ? arg1.anInt1297 : Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1297;
					@Pc(94) int local94 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306 - arg1.anInt1306;
					if (local94 < 0) {
						local94 = -local94;
					}
					if (local87 < local94) {
						local66 = false;
					}
				}
				@Pc(117) String local117 = Static300.aClass133_17 == Static431.aClass133_11 ? Static369.aClass235_33.method5893(Static455.anInt7738) : Static369.aClass235_31.method5893(Static455.anInt7738);
				if (arg1.anInt1306 >= arg1.anInt1284) {
					local156 = arg1.method1160() + (local66 ? Static540.method7788(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306, arg1.anInt1306) : "<col=ffffff>") + " (" + local117 + arg1.anInt1306 + ")";
				} else {
					local156 = arg1.method1160() + (local66 ? Static540.method7788(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306, arg1.anInt1306) : "<col=ffffff>") + " (" + local117 + arg1.anInt1306 + "+" + (arg1.anInt1284 - arg1.anInt1306) + ")";
				}
			} else if (arg1.anInt1316 == -1) {
				local156 = arg1.method1160();
			} else {
				local156 = arg1.method1160() + " (" + Static369.aClass235_32.method5893(Static455.anInt7738) + arg1.anInt1316 + ")";
			}
			if (Static425.aBoolean536 && !arg0 && (Static95.anInt1910 & 0x8) != 0) {
				Static139.method2380(true, Static551.anInt9151, false, -1, Static372.aString48 + " -> <col=ffffff>" + local156, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, 15, Static323.aString46);
			}
			if (arg0) {
				Static139.method2380(false, -1, true, 0, "", (long) arg1.anInt10204, false, 0, 0L, 0, -1, "<col=cccccc>" + local156);
			} else {
				for (@Pc(299) int local299 = 7; local299 >= 0; local299--) {
					if (Static414.aStringArray57[local299] != null) {
						@Pc(307) short local307 = 0;
						if (Static483.aClass133_14 == Static431.aClass133_11 && Static414.aStringArray57[local299].equalsIgnoreCase(Static369.aClass235_26.method5893(Static455.anInt7738))) {
							if (arg1.anInt1306 > Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306) {
								local307 = 2000;
							}
							if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1287 != 0 && arg1.anInt1287 != 0) {
								if (arg1.anInt1287 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1287) {
									local307 = 2000;
								} else {
									local307 = 0;
								}
							}
						} else if (Static73.aBooleanArray1[local299]) {
							local307 = 2000;
						}
						@Pc(365) short local365 = (short) (local307 + Static473.aShortArray121[local299]);
						@Pc(377) int local377 = Static239.anIntArray260[local299] == -1 ? Static299.anInt5924 : Static239.anIntArray260[local299];
						Static139.method2380(true, local377, false, -1, "<col=ffffff>" + local156, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, local365, Static414.aStringArray57[local299]);
					}
				}
			}
			if (!arg0) {
				for (@Pc(417) Class3_Sub7_Sub19 local417 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local417 != null; local417 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
					if (local417.anInt8564 == 8) {
						local417.aString84 = "<col=ffffff>" + local156;
						return;
					}
				}
			}
		} else if (Static425.aBoolean536 && (Static95.anInt1910 & 0x10) != 0) {
			Static139.method2380(true, Static551.anInt9151, false, -1, Static372.aString48 + " -> <col=ffffff>" + Static369.aClass235_40.method5893(Static455.anInt7738), (long) arg1.anInt10204, false, 0, 0L, 0, 60, Static323.aString46);
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1714(@OriginalArg(1) Class82 arg0) {
		if (Static53.aBoolean52) {
			Static369.method5892(arg0);
		} else {
			Static225.method3899(arg0);
		}
	}
}
