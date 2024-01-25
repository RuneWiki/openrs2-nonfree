import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt3677;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass24;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Ljava/lang/Class;")
	private static Class aClass25;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!c;")
	public static final Class51 aClass51_16 = new Class51(2, 2);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static final int anInt3682 = 1407;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	public static int method3207() {
		@Pc(5) int local5 = 0;
		@Pc(18) Field[] local18 = (aClass24 == null ? (aClass24 = Class145.a("lha")) : aClass24).getDeclaredFields();
		for (@Pc(29) int local29 = 0; local29 < local18.length; local29++) {
			@Pc(34) Field local34 = local18[local29];
			if ((aClass25 == null ? (aClass25 = Class145.a("mfa")) : aClass25).isAssignableFrom(local34.getType())) {
				local5++;
			}
		}
		return local5 + 1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method3208(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static383.anInt6725 = 0;
		Static521.anInt8910 = 0;
		Static559.anInt9354++;
		@Pc(22) Class4_Sub3 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static664.aClass4_Sub3Array5[local6]; local22 != null; local22 = local22.aClass4_Sub3_25) {
				if (!Static437.method6518(local22, arg0, arg1, arg2, arg3)) {
					Static128.method1985(local22);
					if (local22.anInt11177 != -1) {
						Static91.aClass4_Sub3Array1[Static383.anInt6725++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static111.aClass4_Sub3Array2[local6]; local22 != null; local22 = local22.aClass4_Sub3_25) {
				if (!Static437.method6518(local22, arg0, arg1, arg2, arg3)) {
					Static128.method1985(local22);
					if (local22.anInt11177 != -1) {
						Static482.aClass4_Sub3Array4[Static521.anInt8910++] = local22;
					}
				}
			}
			for (@Pc(98) Class4_Sub3 local98 = Static170.aClass4_Sub3Array3[local6]; local98 != null; local98 = local98.aClass4_Sub3_25) {
				if (!Static437.method6518(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method9476()) {
						Static128.method1985(local98);
						if (local98.anInt11177 != -1) {
							Static482.aClass4_Sub3Array4[Static521.anInt8910++] = local98;
						}
					} else {
						Static128.method1985(local98);
						if (local98.anInt11177 != -1) {
							Static91.aClass4_Sub3Array1[Static383.anInt6725++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static380.anInt6702; local157++) {
					if (!Static437.method6518(Static95.aClass4_Sub3_Sub3Array1[local157], arg0, arg1, arg2, arg3)) {
						Static128.method1985(Static95.aClass4_Sub3_Sub3Array1[local157]);
						if (Static95.aClass4_Sub3_Sub3Array1[local157].anInt11177 != -1) {
							if (Static95.aClass4_Sub3_Sub3Array1[local157].method9476()) {
								Static482.aClass4_Sub3Array4[Static521.anInt8910++] = Static95.aClass4_Sub3_Sub3Array1[local157];
							} else {
								Static91.aClass4_Sub3Array1[Static383.anInt6725++] = Static95.aClass4_Sub3_Sub3Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static383.anInt6725 > 0) {
			Static464.method6839(Static91.aClass4_Sub3Array1, 0, Static383.anInt6725 - 1);
			for (local225 = 0; local225 < Static383.anInt6725; local225++) {
				Static564.method8088(Static91.aClass4_Sub3Array1[local225], arg6);
			}
		}
		if (Static157.aBoolean165) {
			Static554.aClass144_12.method6970(0, (Class14_Sub18[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static60.anInt991; local225 < Static59.anInt987; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static18.aBooleanArrayArray1.length;
					if (Static318.anInt5565 + Static18.aBooleanArrayArray1.length > Static654.anInt10715) {
						local263 -= Static318.anInt5565 + Static18.aBooleanArrayArray1.length - Static654.anInt10715;
					}
					local157 = Static18.aBooleanArrayArray1[0].length;
					if (Static81.anInt1405 + Static18.aBooleanArrayArray1[0].length > Static180.anInt2928) {
						local157 -= Static81.anInt1405 + Static18.aBooleanArrayArray1[0].length - Static180.anInt2928;
					}
					local304 = Static208.aBooleanArrayArray12;
					if (Static39.aBoolean48) {
						if (Static326.aBoolean408) {
							local304 = Static684.aBooleanArrayArrayArray2[local225];
						}
						for (local316 = Static408.anInt7042; local316 < local263; local316++) {
							local323 = local316 + Static318.anInt5565 - Static408.anInt7042;
							for (local325 = Static438.anInt7391; local325 < local157; local325++) {
								if (Static18.aBooleanArrayArray1[local316][local325] && !Static164.method2366(local325 + Static81.anInt1405 - Static438.anInt7391, local323, local225)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static326.aBoolean408) {
						if (arg4 >= 0) {
							Static258.aClass159Array1[local225].method8203(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static258.aClass159Array1[local225].method8206(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static419.anInt10673; local316++) {
							Static100.aClass399Array1[local316].method9466(new Class4_Sub10(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static258.aClass159Array1[local225].method8203(Static307.anInt5453, Static325.anInt5630, Static459.anInt10513, Static208.aBooleanArrayArray12, true, arg4, arg5);
					} else {
						Static258.aClass159Array1[local225].method8206(Static307.anInt5453, Static325.anInt5630, Static459.anInt10513, Static208.aBooleanArrayArray12, true, arg5);
					}
				} else {
					local263 = Static18.aBooleanArrayArray1.length;
					if (Static318.anInt5565 + Static18.aBooleanArrayArray1.length > Static654.anInt10715) {
						local263 -= Static318.anInt5565 + Static18.aBooleanArrayArray1.length - Static654.anInt10715;
					}
					local157 = Static18.aBooleanArrayArray1[0].length;
					if (Static81.anInt1405 + Static18.aBooleanArrayArray1[0].length > Static180.anInt2928) {
						local157 -= Static81.anInt1405 + Static18.aBooleanArrayArray1[0].length - Static180.anInt2928;
					}
					local304 = Static208.aBooleanArrayArray12;
					if (Static39.aBoolean48) {
						if (Static326.aBoolean408) {
							local304 = Static684.aBooleanArrayArrayArray2[local225];
						}
						for (local316 = Static408.anInt7042; local316 < local263; local316++) {
							local323 = local316 + Static318.anInt5565 - Static408.anInt7042;
							for (local325 = Static438.anInt7391; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static18.aBooleanArrayArray1[local316][local325]) {
									@Pc(344) int local344 = local325 + Static81.anInt1405 - Static438.anInt7391;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static63.aClass89ArrayArrayArray1[local346][local323][local344] != null && Static63.aClass89ArrayArrayArray1[local346][local323][local344].aByte27 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static164.method2366(local344, local323, local225)) {
												local304[local316][local325] = true;
												break;
											}
											local304[local316][local325] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static326.aBoolean408) {
						if (arg4 >= 0) {
							Static258.aClass159Array1[local225].method8203(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static258.aClass159Array1[local225].method8206(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static419.anInt10673; local316++) {
							Static100.aClass399Array1[local316].method9466(new Class4_Sub10(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static258.aClass159Array1[local225].method8203(Static307.anInt5453, Static325.anInt5630, Static459.anInt10513, Static208.aBooleanArrayArray12, false, arg4, arg5);
					} else {
						Static258.aClass159Array1[local225].method8206(Static307.anInt5453, Static325.anInt5630, Static459.anInt10513, Static208.aBooleanArrayArray12, false, arg5);
					}
				}
			}
		}
		if (Static521.anInt8910 > 0) {
			Static624.method8759(Static482.aClass4_Sub3Array4, 0, Static521.anInt8910 - 1);
			for (local225 = 0; local225 < Static521.anInt8910; local225++) {
				Static564.method8088(Static482.aClass4_Sub3Array4[local225], arg6);
			}
		}
	}
}
