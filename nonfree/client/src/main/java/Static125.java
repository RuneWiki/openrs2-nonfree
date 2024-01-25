import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
	public static int anInt10760;

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "Lclient!uda;")
	public static Class85 aClass85_147;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "[[B")
	public static final byte[][] aByteArrayArray174 = new byte[50][];

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIZLclient!fe;II)V")
	public static void method9038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class94 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1 || arg0 < 1 || Static442.anInt7975 - 2 < arg1 || Static284.anInt7916 - 2 < arg0) {
			return;
		}
		if (Static272.aClass97ArrayArrayArray3 == null) {
			return;
		}
		@Pc(46) Interface12 local46 = Static3.aClass96_Sub1_1.method4583(arg3, arg0, arg1, arg4);
		if (local46 == null) {
			return;
		}
		if (local46 instanceof Class20_Sub2_Sub2_Sub5) {
			((Class20_Sub2_Sub2_Sub5) local46).method9034(arg2);
		} else if (local46 instanceof Class20_Sub2_Sub5_Sub1) {
			((Class20_Sub2_Sub5_Sub1) local46).method6981(arg2);
		} else if (local46 instanceof Class20_Sub2_Sub1_Sub1) {
			((Class20_Sub2_Sub1_Sub1) local46).method701(arg2);
		} else if (local46 instanceof Class20_Sub2_Sub3_Sub1) {
			((Class20_Sub2_Sub3_Sub1) local46).method1714(arg2);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZZI)V")
	public static void method9040(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static96.anInt1893++;
			Static427.method6699();
		}
		if (arg1) {
			Static441.anInt7960++;
			Static180.method3296();
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZBLclient!bs;)V")
	public static void method9041(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20_Sub2_Sub2_Sub1_Sub1 arg1) {
		if (Static462.anInt8179 >= 400) {
			return;
		}
		if (arg1 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1) {
			@Pc(81) String local81;
			if (arg1.anInt1200 == 0) {
				@Pc(92) boolean local92 = true;
				if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1220 != -1 && arg1.anInt1220 != -1) {
					@Pc(115) int local115 = arg1.anInt1220 > Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1220 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1220 : arg1.anInt1220;
					@Pc(122) int local122 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210 - arg1.anInt1210;
					if (local122 < 0) {
						local122 = -local122;
					}
					if (local122 > local115) {
						local92 = false;
					}
				}
				@Pc(145) String local145 = Static630.aClass271_17 == Static646.aClass271_15 ? Static317.aClass192_30.method5299(Static307.anInt5931) : Static317.aClass192_28.method5299(Static307.anInt5931);
				if (arg1.anInt1194 > arg1.anInt1210) {
					local81 = arg1.method1026() + (local92 ? Static625.method8701(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210, arg1.anInt1210) : "<col=ffffff>") + " (" + local145 + arg1.anInt1210 + "+" + (arg1.anInt1194 - arg1.anInt1210) + ")";
				} else {
					local81 = arg1.method1026() + (local92 ? Static625.method8701(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210, arg1.anInt1210) : "<col=ffffff>") + " (" + local145 + arg1.anInt1210 + ")";
				}
			} else if (arg1.anInt1200 == -1) {
				local81 = arg1.method1026();
			} else {
				local81 = arg1.method1026() + " (" + Static317.aClass192_29.method5299(Static307.anInt5931) + arg1.anInt1200 + ")";
			}
			if (Static280.aBoolean380 && !arg0 && (Static543.anInt9347 & 0x8) != 0) {
				Static542.method7932(Static173.aString38, 0, false, (long) arg1.anInt5567, Static1.anInt8260, false, -1, 11, 0, true, (long) arg1.anInt5567, Static391.aString87 + " -> <col=ffffff>" + local81);
			}
			if (arg0) {
				Static542.method7932("<col=cccccc>" + local81, 0, true, 0L, -1, false, 0, -1, 0, false, (long) arg1.anInt5567, "");
			} else {
				for (@Pc(266) int local266 = 7; local266 >= 0; local266--) {
					if (Static637.aStringArray75[local266] != null) {
						@Pc(274) short local274 = 0;
						if (Static630.aClass271_17 == Static237.aClass271_11 && Static637.aStringArray75[local266].equalsIgnoreCase(Static317.aClass192_23.method5299(Static307.anInt5931))) {
							if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210 < arg1.anInt1210) {
								local274 = 2000;
							}
							if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1218 != 0 && arg1.anInt1218 != 0) {
								if (arg1.anInt1218 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1218) {
									local274 = 2000;
								} else {
									local274 = 0;
								}
							}
						} else if (Static493.aBooleanArray45[local266]) {
							local274 = 2000;
						}
						@Pc(335) short local335 = (short) (local274 + Static198.aShortArray59[local266]);
						@Pc(347) int local347 = Static496.anIntArray531[local266] == -1 ? Static8.anInt150 : Static496.anIntArray531[local266];
						Static542.method7932(Static637.aStringArray75[local266], 0, false, (long) arg1.anInt5567, local347, false, -1, local335, 0, true, (long) arg1.anInt5567, "<col=ffffff>" + local81);
					}
				}
			}
			if (!arg0) {
				for (@Pc(414) Class6_Sub2_Sub4 local414 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local414 != null; local414 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
					if (local414.anInt1738 == 58) {
						local414.aString18 = "<col=ffffff>" + local81;
						break;
					}
				}
			}
		} else if (Static280.aBoolean380 && (Static543.anInt9347 & 0x10) != 0) {
			Static542.method7932(Static173.aString38, 0, false, 0L, Static1.anInt8260, false, -1, 46, 0, true, (long) arg1.anInt5567, Static391.aString87 + " -> <col=ffffff>" + Static317.aClass192_37.method5299(Static307.anInt5931));
		}
	}
}
