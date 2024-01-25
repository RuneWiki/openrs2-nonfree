import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "Lclient!nba;")
	public static Class5_Sub2_Sub13 aClass5_Sub2_Sub13_5;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
	public static int anInt8750 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method7386(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static26.anInt350 = 0;
		Static676.anInt9313 = 0;
		Static513.anInt8675++;
		@Pc(21) Class41_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static271.aClass41_Sub1Array4[local5]; local21 != null; local21 = local21.aClass41_Sub1_23) {
				if (!Static165.method2439(local21, arg0, arg1, arg2, arg3)) {
					Static180.method2639(local21);
					if (local21.anInt10369 != -1) {
						Static284.aClass41_Sub1Array5[Static26.anInt350++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static227.aClass41_Sub1Array3[local5]; local21 != null; local21 = local21.aClass41_Sub1_23) {
				if (!Static165.method2439(local21, arg0, arg1, arg2, arg3)) {
					Static180.method2639(local21);
					if (local21.anInt10369 != -1) {
						Static5.aClass41_Sub1Array1[Static676.anInt9313++] = local21;
					}
				}
			}
			for (@Pc(87) Class41_Sub1 local87 = Static126.aClass41_Sub1Array2[local5]; local87 != null; local87 = local87.aClass41_Sub1_23) {
				if (!Static165.method2439(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8647()) {
						Static180.method2639(local87);
						if (local87.anInt10369 != -1) {
							Static5.aClass41_Sub1Array1[Static676.anInt9313++] = local87;
						}
					} else {
						Static180.method2639(local87);
						if (local87.anInt10369 != -1) {
							Static284.aClass41_Sub1Array5[Static26.anInt350++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static89.anInt1482; local137++) {
					if (!Static165.method2439(Static545.aClass41_Sub1_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static180.method2639(Static545.aClass41_Sub1_Sub1Array1[local137]);
						if (Static545.aClass41_Sub1_Sub1Array1[local137].anInt10369 != -1) {
							if (Static545.aClass41_Sub1_Sub1Array1[local137].method8647()) {
								Static5.aClass41_Sub1Array1[Static676.anInt9313++] = Static545.aClass41_Sub1_Sub1Array1[local137];
							} else {
								Static284.aClass41_Sub1Array5[Static26.anInt350++] = Static545.aClass41_Sub1_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static26.anInt350 > 0) {
			Static475.method7017(Static284.aClass41_Sub1Array5, 0, Static26.anInt350 - 1);
			for (local198 = 0; local198 < Static26.anInt350; local198++) {
				Static486.method7099(Static284.aClass41_Sub1Array5[local198], arg6);
			}
		}
		if (Static246.aBoolean276) {
			Static267.aClass143_6.method6210(0, (Class5_Sub3[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static436.anInt7713; local198 < Static202.anInt3256; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static10.aBooleanArrayArray1.length;
					if (Static15.anInt230 + Static10.aBooleanArrayArray1.length > Static665.anInt7330) {
						local230 -= Static15.anInt230 + Static10.aBooleanArrayArray1.length - Static665.anInt7330;
					}
					local137 = Static10.aBooleanArrayArray1[0].length;
					if (Static582.anInt9578 + Static10.aBooleanArrayArray1[0].length > Static92.anInt1526) {
						local137 -= Static582.anInt9578 + Static10.aBooleanArrayArray1[0].length - Static92.anInt1526;
					}
					local271 = Static115.aBooleanArrayArray3;
					if (Static281.aBoolean294) {
						if (Static362.aBoolean459) {
							local271 = Static630.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static453.anInt7906; local281 < local230; local281++) {
							local288 = local281 + Static15.anInt230 - Static453.anInt7906;
							for (local290 = Static512.anInt8631; local290 < local137; local290++) {
								if (Static10.aBooleanArrayArray1[local281][local290] && !Static103.method1741(local198, local290 + Static582.anInt9578 - Static512.anInt8631, local288)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static362.aBoolean459) {
						if (arg4 >= 0) {
							Static298.aClass88Array3[local198].method8751(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static298.aClass88Array3[local198].method8744(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static298.anInt4621; local281++) {
							Static472.aClass345Array1[local281].method7949(new Class41_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static298.aClass88Array3[local198].method8751(Static281.anInt4404, Static411.anInt7045, Static537.anInt10357, Static115.aBooleanArrayArray3, true, arg4, arg5);
					} else {
						Static298.aClass88Array3[local198].method8744(Static281.anInt4404, Static411.anInt7045, Static537.anInt10357, Static115.aBooleanArrayArray3, true, arg5);
					}
				} else {
					local230 = Static10.aBooleanArrayArray1.length;
					if (Static15.anInt230 + Static10.aBooleanArrayArray1.length > Static665.anInt7330) {
						local230 -= Static15.anInt230 + Static10.aBooleanArrayArray1.length - Static665.anInt7330;
					}
					local137 = Static10.aBooleanArrayArray1[0].length;
					if (Static582.anInt9578 + Static10.aBooleanArrayArray1[0].length > Static92.anInt1526) {
						local137 -= Static582.anInt9578 + Static10.aBooleanArrayArray1[0].length - Static92.anInt1526;
					}
					local271 = Static115.aBooleanArrayArray3;
					if (Static281.aBoolean294) {
						if (Static362.aBoolean459) {
							local271 = Static630.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static453.anInt7906; local281 < local230; local281++) {
							local288 = local281 + Static15.anInt230 - Static453.anInt7906;
							for (local290 = Static512.anInt8631; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static10.aBooleanArrayArray1[local281][local290]) {
									@Pc(309) int local309 = local290 + Static582.anInt9578 - Static512.anInt8631;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static129.aClass313ArrayArrayArray7[local311][local288][local309] != null && Static129.aClass313ArrayArrayArray7[local311][local288][local309].aByte112 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static103.method1741(local198, local309, local288)) {
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
					if (Static362.aBoolean459) {
						if (arg4 >= 0) {
							Static298.aClass88Array3[local198].method8751(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static298.aClass88Array3[local198].method8744(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static298.anInt4621; local281++) {
							Static472.aClass345Array1[local281].method7949(new Class41_Sub10(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static298.aClass88Array3[local198].method8751(Static281.anInt4404, Static411.anInt7045, Static537.anInt10357, Static115.aBooleanArrayArray3, false, arg4, arg5);
					} else {
						Static298.aClass88Array3[local198].method8744(Static281.anInt4404, Static411.anInt7045, Static537.anInt10357, Static115.aBooleanArrayArray3, false, arg5);
					}
				}
			}
		}
		if (Static676.anInt9313 > 0) {
			Static500.method7242(Static5.aClass41_Sub1Array1, 0, Static676.anInt9313 - 1);
			for (local198 = 0; local198 < Static676.anInt9313; local198++) {
				Static486.method7099(Static5.aClass41_Sub1Array1[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZIIIIIII)V")
	public static void method7396(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static345.method5208(arg4, 0, arg2, arg5, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)V")
	public static void method7397() {
		Static560.aClass265_60.method6568();
	}
}
