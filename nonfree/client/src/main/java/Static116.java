import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!dn;")
	public static Class56 aClass56_76;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
	public static int[] anIntArray477 = new int[2];

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "J")
	public static long aLong198 = -1L;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public static int anInt6677 = 0;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public static int anInt6680 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
	public static boolean method5249(@OriginalArg(0) int arg0) {
		if (arg0 == 44 || arg0 == 58 || arg0 == 4 || arg0 == 49 || arg0 == 50) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZII)V")
	public static void method5251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(11, arg0);
		local8.method1570();
		local8.anInt1933 = arg1;
		local8.anInt1930 = arg2;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!qa;Lclient!rn;IIIII)V")
	public static void method5252(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static281.anInt5169) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static177.anInt3621) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static57.anInt1411 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class217 local62 = Static151.aClass217ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static120.aClass64Array1[local17].I(local23, local32) + Static120.aClass64Array1[local17].I(local23 + 1, local32) + Static120.aClass64Array1[local17].I(local23, local32 + 1) + Static120.aClass64Array1[local17].I(local23 + 1, local32 + 1)) / 4 - (Static120.aClass64Array1[arg2].I(arg3, arg4) + Static120.aClass64Array1[arg2].I(arg3 + 1, arg4) + Static120.aClass64Array1[arg2].I(arg3, arg4 + 1) + Static120.aClass64Array1[arg2].I(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub5 local143 = local62.aClass1_Sub5_2;
									@Pc(146) Class1_Sub5 local146 = local62.aClass1_Sub5_3;
									if (local143 != null && local143.method5839()) {
										arg1.method5836(local143, local1, (local32 - arg4) * Static122.anInt2633 + (1 - arg6) * Static340.anInt6290, local140, arg0, (local23 - arg3) * Static122.anInt2633 + (1 - arg5) * Static340.anInt6290);
									}
									if (local146 != null && local146.method5839()) {
										arg1.method5836(local146, local1, (local32 - arg4) * Static122.anInt2633 + (1 - arg6) * Static340.anInt6290, local140, arg0, (local23 - arg3) * Static122.anInt2633 + (1 - arg5) * Static340.anInt6290);
									}
									for (@Pc(219) Class182 local219 = local62.aClass182_3; local219 != null; local219 = local219.aClass182_2) {
										@Pc(223) Class1_Sub3 local223 = local219.aClass1_Sub3_2;
										if (local223 != null && local223.method5839() && (local23 == local223.aShort181 || local23 == local3) && (local32 == local223.aShort179 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort180 + 1 - local223.aShort181;
											@Pc(260) int local260 = local223.aShort178 + 1 - local223.aShort179;
											arg1.method5836(local223, local1, (local223.aShort179 - arg4) * Static122.anInt2633 + (local260 - arg6) * Static340.anInt6290, local140, arg0, (local223.aShort181 - arg3) * Static122.anInt2633 + (local252 - arg5) * Static340.anInt6290);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!qt;ZI)V")
	public static void method5253(@OriginalArg(0) Class1_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static169.anInt3551 >= 400) {
			return;
		}
		@Pc(16) Class47 local16 = arg0.aClass47_1;
		if (local16.anIntArray134 != null) {
			local16 = local16.method1296(Static369.aClass11_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean122) {
			return;
		}
		@Pc(34) String local34 = local16.aString14;
		if (local16.anInt1591 != 0) {
			@Pc(50) String local50 = Static69.aClass89_1 == Static114.aClass89_2 ? Static240.aClass175_155.method4201(Static216.anInt4257) : Static86.aClass175_61.method4201(Static216.anInt4257);
			local34 = local34 + Static336.method4876(local16.anInt1591, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882) + " (" + local50 + local16.anInt1591 + ")";
		}
		if (!Static59.aBoolean111) {
			if (!arg1) {
				@Pc(137) String[] local137 = local16.aStringArray36;
				if (Static76.aBoolean135) {
					local137 = Static350.method4983(local137);
				}
				@Pc(147) int local147;
				if (local137 != null) {
					for (local147 = 4; local147 >= 0; local147--) {
						if (local137[local147] != null && (Static114.aClass89_2 != Static436.aClass89_3 || !local137[local147].equalsIgnoreCase(Static148.aClass175_100.method4201(Static216.anInt4257)))) {
							@Pc(166) byte local166 = 0;
							if (local147 == 0) {
								local166 = 44;
							}
							@Pc(175) int local175 = Static130.anInt6132;
							if (local147 == 1) {
								local166 = 58;
							}
							if (local147 == 2) {
								local166 = 4;
							}
							if (local147 == 3) {
								local166 = 49;
							}
							if (local147 == 4) {
								local166 = 50;
							}
							if (local16.anInt1577 == local147) {
								local175 = local16.anInt1573;
							}
							if (local147 == local16.anInt1575) {
								local175 = local16.anInt1581;
							}
							Static112.method4934(0, local166, (long) arg0.anInt6066, -1, 0, false, "<col=ffff00>" + local34, true, local137[local147], local175);
						}
					}
				}
				if (Static436.aClass89_3 == Static114.aClass89_2 && local137 != null) {
					for (local147 = 4; local147 >= 0; local147--) {
						if (local137[local147] != null && local137[local147].equalsIgnoreCase(Static148.aClass175_100.method4201(Static216.anInt4257))) {
							@Pc(269) short local269 = 0;
							if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882 < local16.anInt1591) {
								local269 = 2000;
							}
							@Pc(282) short local282 = 0;
							if (local147 == 0) {
								local282 = 44;
							}
							if (local147 == 1) {
								local282 = 58;
							}
							if (local147 == 2) {
								local282 = 4;
							}
							if (local147 == 3) {
								local282 = 49;
							}
							if (local147 == 4) {
								local282 = 50;
							}
							if (local282 != 0) {
								local282 += local269;
							}
							Static112.method4934(0, local282, (long) arg0.anInt6066, -1, 0, false, "<col=ffff00>" + local34, true, local137[local147], local16.anInt1600);
						}
					}
				}
			}
			Static112.method4934(0, 1001, (long) arg0.anInt6066, -1, 0, arg1, "<col=ffff00>" + local34, true, Static171.aClass175_117.method4201(Static216.anInt4257), Static80.anInt1720);
		} else if (!arg1) {
			@Pc(87) Class235 local87 = Static418.anInt7212 == -1 ? null : Static294.aClass69_2.method1740(Static418.anInt7212);
			if ((Static421.anInt4507 & 0x2) != 0) {
				if (local87 == null || local16.method1299(local87.anInt7023, Static418.anInt7212) != local87.anInt7023) {
					Static112.method4934(0, 19, (long) arg0.anInt6066, -1, 0, false, Static128.aString25 + " -> <col=ffff00>" + local34, true, Static276.aString52, Static108.anInt3456);
				}
				return;
			}
		}
	}
}
