import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gh", name = "Pb", descriptor = "I")
	public static int anInt4410;

	@OriginalMember(owner = "client!gh", name = "Lb", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_37 = new Class94(84, -1);

	@OriginalMember(owner = "client!gh", name = "Ob", descriptor = "Z")
	public static boolean aBoolean325 = true;

	@OriginalMember(owner = "client!gh", name = "Qb", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_11 = new Class234(7, 0, 1, 1);

	@OriginalMember(owner = "client!gh", name = "Rb", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_38 = new Class94(45, 7);

	@OriginalMember(owner = "client!gh", name = "Sb", descriptor = "I")
	public static int anInt4411 = 0;

	@OriginalMember(owner = "client!gh", name = "Tb", descriptor = "I")
	public static int anInt4412 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method3860(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static644.anInt11085 = 0;
		Static328.anInt6627 = 0;
		Static523.anInt9521++;
		@Pc(21) Class3_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static124.aClass3_Sub1Array151[local5]; local21 != null; local21 = local21.aClass3_Sub1_23) {
				if (!Static206.method4082(local21, arg0, arg1, arg2, arg3)) {
					Static119.method2927(local21);
					if (local21.anInt10311 != -1) {
						Static613.aClass3_Sub1Array143[Static644.anInt11085++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static548.aClass3_Sub1Array129[local5]; local21 != null; local21 = local21.aClass3_Sub1_23) {
				if (!Static206.method4082(local21, arg0, arg1, arg2, arg3)) {
					Static119.method2927(local21);
					if (local21.anInt10311 != -1) {
						Static615.aClass3_Sub1Array145[Static328.anInt6627++] = local21;
					}
				}
			}
			for (@Pc(87) Class3_Sub1 local87 = Static359.aClass3_Sub1Array94[local5]; local87 != null; local87 = local87.aClass3_Sub1_23) {
				if (!Static206.method4082(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8601()) {
						Static119.method2927(local87);
						if (local87.anInt10311 != -1) {
							Static615.aClass3_Sub1Array145[Static328.anInt6627++] = local87;
						}
					} else {
						Static119.method2927(local87);
						if (local87.anInt10311 != -1) {
							Static613.aClass3_Sub1Array143[Static644.anInt11085++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static319.anInt6492; local137++) {
					if (!Static206.method4082(Static20.aClass3_Sub1_Sub3Array1[local137], arg0, arg1, arg2, arg3)) {
						Static119.method2927(Static20.aClass3_Sub1_Sub3Array1[local137]);
						if (Static20.aClass3_Sub1_Sub3Array1[local137].anInt10311 != -1) {
							if (Static20.aClass3_Sub1_Sub3Array1[local137].method8601()) {
								Static615.aClass3_Sub1Array145[Static328.anInt6627++] = Static20.aClass3_Sub1_Sub3Array1[local137];
							} else {
								Static613.aClass3_Sub1Array143[Static644.anInt11085++] = Static20.aClass3_Sub1_Sub3Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static644.anInt11085 > 0) {
			Static425.method6832(Static613.aClass3_Sub1Array143, 0, Static644.anInt11085 - 1);
			for (local198 = 0; local198 < Static644.anInt11085; local198++) {
				Static18.method370(Static613.aClass3_Sub1Array143[local198], arg6);
			}
		}
		if (Static286.aBoolean451) {
			Static194.aClass20_5.method7245(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static599.anInt10549; local198 < Static462.anInt8470; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static342.aBooleanArrayArray6.length;
					if (Static235.anInt5129 + Static342.aBooleanArrayArray6.length > Static477.anInt8929) {
						local230 -= Static235.anInt5129 + Static342.aBooleanArrayArray6.length - Static477.anInt8929;
					}
					local137 = Static342.aBooleanArrayArray6[0].length;
					if (Static36.anInt791 + Static342.aBooleanArrayArray6[0].length > Static562.anInt10128) {
						local137 -= Static36.anInt791 + Static342.aBooleanArrayArray6[0].length - Static562.anInt10128;
					}
					local271 = Static186.aBooleanArrayArray5;
					if (Static430.aBoolean179) {
						if (Static218.aBoolean365) {
							local271 = Static359.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static256.anInt5483; local281 < local230; local281++) {
							local288 = local281 + Static235.anInt5129 - Static256.anInt5483;
							for (local290 = Static529.anInt9630; local290 < local137; local290++) {
								if (Static342.aBooleanArrayArray6[local281][local290] && !Static331.method5702(local198, local288, local290 + Static36.anInt791 - Static529.anInt9630)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static218.aBoolean365) {
						if (arg4 >= 0) {
							Static9.aClass65Array1[local198].method7997(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static9.aClass65Array1[local198].method7996(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static149.anInt3867; local281++) {
							Static78.aClass59Array1[local281].method2127(new Class3_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static9.aClass65Array1[local198].method7997(Static120.anInt3199, Static360.anInt7144, Static177.anInt4273, Static186.aBooleanArrayArray5, true, arg4, arg5);
					} else {
						Static9.aClass65Array1[local198].method7996(Static120.anInt3199, Static360.anInt7144, Static177.anInt4273, Static186.aBooleanArrayArray5, true, arg5);
					}
				} else {
					local230 = Static342.aBooleanArrayArray6.length;
					if (Static235.anInt5129 + Static342.aBooleanArrayArray6.length > Static477.anInt8929) {
						local230 -= Static235.anInt5129 + Static342.aBooleanArrayArray6.length - Static477.anInt8929;
					}
					local137 = Static342.aBooleanArrayArray6[0].length;
					if (Static36.anInt791 + Static342.aBooleanArrayArray6[0].length > Static562.anInt10128) {
						local137 -= Static36.anInt791 + Static342.aBooleanArrayArray6[0].length - Static562.anInt10128;
					}
					local271 = Static186.aBooleanArrayArray5;
					if (Static430.aBoolean179) {
						if (Static218.aBoolean365) {
							local271 = Static359.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static256.anInt5483; local281 < local230; local281++) {
							local288 = local281 + Static235.anInt5129 - Static256.anInt5483;
							for (local290 = Static529.anInt9630; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static342.aBooleanArrayArray6[local281][local290]) {
									@Pc(309) int local309 = local290 + Static36.anInt791 - Static529.anInt9630;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static395.aClass100ArrayArrayArray3[local311][local288][local309] != null && Static395.aClass100ArrayArrayArray3[local311][local288][local309].aByte41 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static331.method5702(local198, local288, local309)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static218.aBoolean365) {
						if (arg4 >= 0) {
							Static9.aClass65Array1[local198].method7997(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static9.aClass65Array1[local198].method7996(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static149.anInt3867; local281++) {
							Static78.aClass59Array1[local281].method2127(new Class3_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static9.aClass65Array1[local198].method7997(Static120.anInt3199, Static360.anInt7144, Static177.anInt4273, Static186.aBooleanArrayArray5, false, arg4, arg5);
					} else {
						Static9.aClass65Array1[local198].method7996(Static120.anInt3199, Static360.anInt7144, Static177.anInt4273, Static186.aBooleanArrayArray5, false, arg5);
					}
				}
			}
		}
		if (Static328.anInt6627 > 0) {
			Static285.method5169(Static615.aClass3_Sub1Array145, 0, Static328.anInt6627 - 1);
			for (local198 = 0; local198 < Static328.anInt6627; local198++) {
				Static18.method370(Static615.aClass3_Sub1Array145[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)I")
	public static int method3863(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "(B)V")
	public static void method3864() {
		if (Static623.aString112.toLowerCase().indexOf("microsoft") != -1) {
			Static360.anIntArray451[222] = 59;
			Static360.anIntArray451[187] = 27;
			Static360.anIntArray451[186] = 57;
			Static360.anIntArray451[221] = 43;
			Static360.anIntArray451[219] = 42;
			Static360.anIntArray451[191] = 73;
			Static360.anIntArray451[190] = 72;
			Static360.anIntArray451[220] = 74;
			Static360.anIntArray451[188] = 71;
			Static360.anIntArray451[189] = 26;
			Static360.anIntArray451[192] = 58;
			Static360.anIntArray451[223] = 28;
			return;
		}
		Static360.anIntArray451[46] = 72;
		Static360.anIntArray451[92] = 74;
		Static360.anIntArray451[44] = 71;
		Static360.anIntArray451[61] = 27;
		Static360.anIntArray451[91] = 42;
		if (Static623.aMethod1 == null) {
			Static360.anIntArray451[192] = 58;
			Static360.anIntArray451[222] = 59;
		} else {
			Static360.anIntArray451[520] = 59;
			Static360.anIntArray451[192] = 28;
			Static360.anIntArray451[222] = 58;
		}
		Static360.anIntArray451[45] = 26;
		Static360.anIntArray451[47] = 73;
		Static360.anIntArray451[59] = 57;
		Static360.anIntArray451[93] = 43;
	}
}
