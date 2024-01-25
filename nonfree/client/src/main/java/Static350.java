import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!kda;")
	public static Class160 aClass160_73;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!kda;")
	public static Class160 aClass160_74;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "[I")
	public static final int[] anIntArray480 = new int[32];

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_109 = new Class6(37, 4);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!kda;I)V")
	public static void method5564(@OriginalArg(0) Class160 arg0) {
		Static152.anInt3449 = arg0.method4199("p11_full");
		Static517.anInt8717 = arg0.method4199("p12_full");
		Static26.anInt1130 = arg0.method4199("b12_full");
		Static173.anInt3750 = arg0.method4199("hitmarks");
		Static424.anInt7376 = arg0.method4199("hitbar_default");
		Static288.anInt5628 = arg0.method4199("timerbar_default");
		Static476.anInt7310 = arg0.method4199("headicons_pk");
		Static252.anInt4932 = arg0.method4199("headicons_prayer");
		Static163.anInt3578 = arg0.method4199("hint_headicons");
		Static167.anInt3663 = arg0.method4199("hint_mapmarkers");
		Static294.anInt5701 = arg0.method4199("mapflag");
		Static266.anInt5160 = arg0.method4199("cross");
		Static137.anInt3221 = arg0.method4199("mapdots");
		Static227.anInt8839 = arg0.method4199("scrollbar");
		Static246.anInt4757 = arg0.method4199("name_icons");
		Static82.anInt2170 = arg0.method4199("floorshadows");
		Static271.anInt1860 = arg0.method4199("compass");
		Static260.anInt5086 = arg0.method4199("otherlevel");
		Static534.anInt9244 = arg0.method4199("hint_mapedge");
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
	public static boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static201.method3745(arg1, arg0) & (Static327.method5345(arg0, arg1) | (arg0 & 0x2000) != 0 | Static209.method3801(arg1, arg0));
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ks;BZ)V")
	public static void method5566(@OriginalArg(0) Class47_Sub2_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static267.anInt5167 >= 400) {
			return;
		}
		if (Static16.aClass47_Sub2_Sub3_Sub2_1 != arg0) {
			@Pc(79) String local79;
			@Pc(133) int local133;
			if (arg0.anInt5110 == 0) {
				@Pc(82) boolean local82 = true;
				if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5102 != -1 && arg0.anInt5102 != -1) {
					@Pc(107) int local107 = arg0.anInt5120 < Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120 ? Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120 : arg0.anInt5120;
					@Pc(122) int local122 = arg0.anInt5102 <= Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5102 ? arg0.anInt5102 : Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5102;
					local133 = local122 + local107 * 10 / 100 + 5;
					@Pc(140) int local140 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120 - arg0.anInt5120;
					if (local140 < 0) {
						local140 = -local140;
					}
					if (local140 > local133) {
						local82 = false;
					}
				}
				@Pc(165) String local165 = Static538.aClass37_4 == Static452.aClass37_3 ? Static79.aClass114_45.method3330(Static315.anInt5993) : Static229.aClass114_95.method3330(Static315.anInt5993);
				if (arg0.anInt5120 < arg0.anInt5119) {
					local79 = arg0.method4375() + (local82 ? Static224.method3954(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120, arg0.anInt5120) : "<col=ffffff>") + " (" + local165 + arg0.anInt5120 + "+" + (arg0.anInt5119 - arg0.anInt5120) + ")";
				} else {
					local79 = arg0.method4375() + (local82 ? Static224.method3954(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120, arg0.anInt5120) : "<col=ffffff>") + " (" + local165 + arg0.anInt5120 + ")";
				}
			} else {
				local79 = arg0.method4375() + " (" + Static336.aClass114_121.method3330(Static315.anInt5993) + arg0.anInt5110 + ")";
			}
			if (Static382.aBoolean440) {
				if (!arg1 && (Static276.anInt5433 & 0x8) != 0) {
					Static179.method3455(0, Static444.anInt7508, (long) arg0.anInt5045, true, 19, Static433.aString72, false, -1, 0, Static469.aString69 + " -> <col=ffffff>" + local79);
				}
			} else if (arg1) {
				Static179.method3455(0, -1, 0L, false, -1, "<col=cccccc>" + local79, true, 0, 0, "");
			} else {
				for (@Pc(304) int local304 = 7; local304 >= 0; local304--) {
					if (Static231.aStringArray43[local304] != null) {
						@Pc(311) short local311 = 0;
						if (Static152.aClass37_1 == Static538.aClass37_4 && Static231.aStringArray43[local304].equalsIgnoreCase(Static52.aClass114_25.method3330(Static315.anInt5993))) {
							if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120 < arg0.anInt5120) {
								local311 = 2000;
							}
							if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5088 != 0 && arg0.anInt5088 != 0) {
								if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5088 == arg0.anInt5088) {
									local311 = 2000;
								} else {
									local311 = 0;
								}
							}
						} else if (Static156.aBooleanArray15[local304]) {
							local311 = 2000;
						}
						@Pc(368) short local368 = (short) (local311 + Static199.aShortArray68[local304]);
						local133 = Static510.anIntArray736[local304] == -1 ? Static272.anInt5298 : Static510.anIntArray736[local304];
						Static179.method3455(0, local133, (long) arg0.anInt5045, true, local368, Static231.aStringArray43[local304], false, -1, 0, "<col=ffffff>" + local79);
					}
				}
			}
			if (!arg1) {
				for (@Pc(419) Class1_Sub50 local419 = (Class1_Sub50) Static475.aClass38_69.method1419(); local419 != null; local419 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
					if (local419.anInt8983 == 18) {
						local419.aString83 = "<col=ffffff>" + local79;
						return;
					}
				}
			}
		} else if (Static382.aBoolean440 && (Static276.anInt5433 & 0x10) != 0) {
			Static179.method3455(0, Static444.anInt7508, 0L, true, 58, Static433.aString72, false, -1, 0, Static469.aString69 + " -> <col=ffffff>" + Static320.aClass114_113.method3330(Static315.anInt5993));
		}
	}
}
