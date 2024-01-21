import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Lclient!kd;")
	private static Class39 aClass39_216 = Static108.method1915("glow1:");

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "Lclient!kd;")
	public static Class39 aClass39_217 = aClass39_216;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_219 = Static108.method1915("Loaded wordpack");

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_218 = aClass39_219;

	@OriginalMember(owner = "client!bd", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_220 = aClass39_216;

	@OriginalMember(owner = "client!bd", name = "pb", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
	public static void method262() {
		aClass39_217 = null;
		aClass39_220 = null;
		aClass39_218 = null;
		aClass39_216 = null;
		aClass39_219 = null;
		aByteArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method263() {
		if (Static89.anInt2107 == 0 && !Static46.aBoolean222) {
			Static71.method1242(Static8.aClass39_147, 48, Static118.aClass39_1408, Static29.anInt971, Static3.anInt150, 0);
		}
		@Pc(23) int local23 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static80.anInt1983; local33++) {
			@Pc(39) int local39 = Static80.anIntArray307[local33];
			@Pc(45) int local45 = local39 >> 29 & 0x3;
			@Pc(49) int local49 = local39 & 0x7F;
			@Pc(55) int local55 = local39 >> 7 & 0x7F;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local23 != local39) {
				local23 = local39;
				@Pc(145) int local145;
				if (local45 == 2 && Static32.aClass5_2.method122(Static9.anInt2983, local49, local55, local39) >= 0) {
					@Pc(84) Class1_Sub1_Sub18 local84 = Static104.method1862(local61);
					if (local84.anIntArray477 != null) {
						local84 = local84.method2126();
					}
					if (local84 == null) {
						continue;
					}
					if (Static89.anInt2107 == 1) {
						Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_66, Static70.aClass39_874, local84.aClass39_1515 }), 6, Static77.aClass39_953, local49, local55, local39);
					} else if (!Static46.aBoolean222) {
						@Pc(135) Class39[] local135 = local84.aClass39Array30;
						if (Static31.aBoolean91) {
							local135 = Static122.method2059(local135);
						}
						if (local135 != null) {
							for (local145 = 4; local145 >= 0; local145--) {
								if (local135[local145] != null) {
									@Pc(157) short local157 = 0;
									if (local145 == 0) {
										local157 = 47;
									}
									if (local145 == 1) {
										local157 = 39;
									}
									if (local145 == 2) {
										local157 = 14;
									}
									if (local145 == 3) {
										local157 = 32;
									}
									if (local145 == 4) {
										local157 = 1006;
									}
									Static71.method1242(Static30.method601(new Class39[] { Static122.aClass39_1431, local84.aClass39_1515 }), local157, local135[local145], local49, local55, local39);
								}
							}
						}
						Static71.method1242(Static30.method601(new Class39[] { Static122.aClass39_1431, local84.aClass39_1515 }), 1001, Static76.aClass39_940, local49, local55, local84.anInt3027 << 14);
					} else if ((Static82.anInt1996 & 0x4) == 4) {
						Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static70.aClass39_874, local84.aClass39_1515 }), 12, Static52.aClass39_695, local49, local55, local39);
					}
				}
				@Pc(302) int local302;
				@Pc(310) Class1_Sub1_Sub2_Sub1_Sub1 local310;
				@Pc(361) Class1_Sub1_Sub2_Sub1_Sub2 local361;
				if (local45 == 1) {
					@Pc(279) Class1_Sub1_Sub2_Sub1_Sub1 local279 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local61];
					if (local279.aClass1_Sub1_Sub5_1.anInt910 == 1 && (local279.anInt2521 & 0x7F) == 64 && (local279.anInt2508 & 0x7F) == 64) {
						for (local302 = 0; local302 < Static20.anInt731; local302++) {
							local310 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local302]];
							if (local310 != null && local310 != local279 && local310.aClass1_Sub1_Sub5_1.anInt910 == 1 && local310.anInt2521 == local279.anInt2521 && local310.anInt2508 == local279.anInt2508) {
								Static28.method1813(Static51.anIntArray192[local302], local49, local310.aClass1_Sub1_Sub5_1, local55);
							}
						}
						for (local145 = 0; local145 < Static57.anInt1547; local145++) {
							local361 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local145]];
							if (local361 != null && local361.anInt2521 == local279.anInt2521 && local279.anInt2508 == local361.anInt2508) {
								Static119.method2052(local361, local55, Static12.anIntArray91[local145], local49);
							}
						}
					}
					Static28.method1813(local61, local49, local279.aClass1_Sub1_Sub5_1, local55);
				}
				if (local45 == 0) {
					@Pc(410) Class1_Sub1_Sub2_Sub1_Sub2 local410 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local61];
					if ((local410.anInt2521 & 0x7F) == 64 && (local410.anInt2508 & 0x7F) == 64) {
						for (local302 = 0; local302 < Static20.anInt731; local302++) {
							local310 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static51.anIntArray192[local302]];
							if (local310 != null && local310.aClass1_Sub1_Sub5_1.anInt910 == 1 && local310.anInt2521 == local410.anInt2521 && local410.anInt2508 == local310.anInt2508) {
								Static28.method1813(Static51.anIntArray192[local302], local49, local310.aClass1_Sub1_Sub5_1, local55);
							}
						}
						for (local145 = 0; local145 < Static57.anInt1547; local145++) {
							local361 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local145]];
							if (local361 != null && local361 != local410 && local410.anInt2521 == local361.anInt2521 && local410.anInt2508 == local361.anInt2508) {
								Static119.method2052(local361, local55, Static12.anIntArray91[local145], local49);
							}
						}
					}
					Static119.method2052(local410, local55, local61, local49);
				}
				if (local45 == 3) {
					@Pc(534) Class31 local534 = Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local49][local55];
					if (local534 != null) {
						for (@Pc(541) Class1_Sub1_Sub2_Sub3 local541 = (Class1_Sub1_Sub2_Sub3) local534.method1004(); local541 != null; local541 = (Class1_Sub1_Sub2_Sub3) local534.method1002()) {
							@Pc(548) Class1_Sub1_Sub17 local548 = Static8.method224(local541.anInt806);
							if (Static89.anInt2107 == 1) {
								Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_66, Static66.aClass39_846, local548.aClass39_1321 }), 17, Static77.aClass39_953, local49, local55, local541.anInt806);
							} else if (!Static46.aBoolean222) {
								@Pc(591) Class39[] local591 = local548.aClass39Array28;
								if (Static31.aBoolean91) {
									local591 = Static122.method2059(local591);
								}
								for (@Pc(599) int local599 = 4; local599 >= 0; local599--) {
									if (local591 != null && local591[local599] != null) {
										@Pc(613) byte local613 = 0;
										if (local599 == 0) {
											local613 = 11;
										}
										if (local599 == 1) {
											local613 = 20;
										}
										if (local599 == 2) {
											local613 = 16;
										}
										if (local599 == 3) {
											local613 = 10;
										}
										if (local599 == 4) {
											local613 = 58;
										}
										Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local548.aClass39_1321 }), local613, local591[local599], local49, local55, local541.anInt806);
									} else if (local599 == 2) {
										Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local548.aClass39_1321 }), 16, Static4.aClass39_65, local49, local55, local541.anInt806);
									}
								}
								Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local548.aClass39_1321 }), 1003, Static76.aClass39_940, local49, local55, local541.anInt806);
							} else if ((Static82.anInt1996 & 0x1) == 1) {
								Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static66.aClass39_846, local548.aClass39_1321 }), 43, Static52.aClass39_695, local49, local55, local541.anInt806);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
	public static int method265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)I")
	public static int method266() {
		return 19;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public static void method268() {
		for (@Pc(11) Class1_Sub6 local11 = (Class1_Sub6) Static120.aClass31_69.method1000(); local11 != null; local11 = (Class1_Sub6) Static120.aClass31_69.method1003()) {
			if (local11.aClass1_Sub1_Sub18_1 != null) {
				local11.method424();
			}
		}
	}
}
