import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!ke;")
	public static Class185 aClass185_7;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_133 = new Class218(7, 3);

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
	public static int anInt9197 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!aj;II)Lclient!wr;")
	public static Class3_Sub11_Sub21 method8039(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub25 local16 = new Class3_Sub25(arg0.method517(arg1, arg2));
		@Pc(51) Class3_Sub11_Sub21 local51 = new Class3_Sub11_Sub21(arg1, local16.method8613(), local16.method8613(), local16.method8618(), local16.method8618(), local16.method8632() == 1, local16.method8632(), local16.method8632());
		@Pc(57) int local57 = local16.method8632();
		for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
			local51.aClass338_237.method8171(new Class3_Sub39(local16.method8632(), local16.method8593(), local16.method8593(), local16.method8593(), local16.method8593(), local16.method8593(), local16.method8593(), local16.method8593(), local16.method8593()));
		}
		local51.method9354();
		return local51;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method8041(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static116.anInt2393 = 0;
		Static367.anInt5935 = 0;
		Static100.anInt1840++;
		@Pc(21) Class28_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static539.aClass28_Sub1Array26[local5]; local21 != null; local21 = local21.aClass28_Sub1_23) {
				if (!Static532.method7681(local21, arg0, arg1, arg2, arg3)) {
					Static476.method6891(local21);
					if (local21.anInt10726 != -1) {
						Static389.aClass28_Sub1Array15[Static116.anInt2393++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static38.aClass28_Sub1Array5[local5]; local21 != null; local21 = local21.aClass28_Sub1_23) {
				if (!Static532.method7681(local21, arg0, arg1, arg2, arg3)) {
					Static476.method6891(local21);
					if (local21.anInt10726 != -1) {
						Static523.aClass28_Sub1Array24[Static367.anInt5935++] = local21;
					}
				}
			}
			for (@Pc(87) Class28_Sub1 local87 = Static198.aClass28_Sub1Array37[local5]; local87 != null; local87 = local87.aClass28_Sub1_23) {
				if (!Static532.method7681(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method9287()) {
						Static476.method6891(local87);
						if (local87.anInt10726 != -1) {
							Static523.aClass28_Sub1Array24[Static367.anInt5935++] = local87;
						}
					} else {
						Static476.method6891(local87);
						if (local87.anInt10726 != -1) {
							Static389.aClass28_Sub1Array15[Static116.anInt2393++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static77.anInt1423; local137++) {
					if (!Static532.method7681(Static443.aClass28_Sub1_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static476.method6891(Static443.aClass28_Sub1_Sub1Array1[local137]);
						if (Static443.aClass28_Sub1_Sub1Array1[local137].anInt10726 != -1) {
							if (Static443.aClass28_Sub1_Sub1Array1[local137].method9287()) {
								Static523.aClass28_Sub1Array24[Static367.anInt5935++] = Static443.aClass28_Sub1_Sub1Array1[local137];
							} else {
								Static389.aClass28_Sub1Array15[Static116.anInt2393++] = Static443.aClass28_Sub1_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static116.anInt2393 > 0) {
			Static581.method7248(Static389.aClass28_Sub1Array15, 0, Static116.anInt2393 - 1);
			for (local198 = 0; local198 < Static116.anInt2393; local198++) {
				Static161.method2928(Static389.aClass28_Sub1Array15[local198], arg6);
			}
		}
		if (Static236.aBoolean325) {
			Static671.aClass13_21.method8472(0, (Class3_Sub15[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static617.anInt9893; local198 < Static183.anInt3720; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static430.aBooleanArrayArray7.length;
					if (Static431.anInt6884 + Static430.aBooleanArrayArray7.length > Static146.anInt2951) {
						local230 -= Static431.anInt6884 + Static430.aBooleanArrayArray7.length - Static146.anInt2951;
					}
					local137 = Static430.aBooleanArrayArray7[0].length;
					if (Static445.anInt7311 + Static430.aBooleanArrayArray7[0].length > Static602.anInt9668) {
						local137 -= Static445.anInt7311 + Static430.aBooleanArrayArray7[0].length - Static602.anInt9668;
					}
					local271 = Static600.aBooleanArrayArray8;
					if (Static163.aBoolean249) {
						if (Static140.aBoolean220) {
							local271 = Static614.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static250.anInt4513; local281 < local230; local281++) {
							local288 = local281 + Static431.anInt6884 - Static250.anInt4513;
							for (local290 = Static473.anInt7804; local290 < local137; local290++) {
								if (Static430.aBooleanArrayArray7[local281][local290] && !Static304.method4669(local288, local290 + Static445.anInt7311 - Static473.anInt7804, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static140.aBoolean220) {
						if (arg4 >= 0) {
							Static121.aClass21Array2[local198].method7978(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static121.aClass21Array2[local198].method7972(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static593.anInt9541; local281++) {
							Static324.aClass148Array1[local281].method4030(new Class28_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static121.aClass21Array2[local198].method7978(Static220.anInt4183, Static547.anInt8968, Static7.anInt94, Static600.aBooleanArrayArray8, true, arg4, arg5);
					} else {
						Static121.aClass21Array2[local198].method7972(Static220.anInt4183, Static547.anInt8968, Static7.anInt94, Static600.aBooleanArrayArray8, true, arg5);
					}
				} else {
					local230 = Static430.aBooleanArrayArray7.length;
					if (Static431.anInt6884 + Static430.aBooleanArrayArray7.length > Static146.anInt2951) {
						local230 -= Static431.anInt6884 + Static430.aBooleanArrayArray7.length - Static146.anInt2951;
					}
					local137 = Static430.aBooleanArrayArray7[0].length;
					if (Static445.anInt7311 + Static430.aBooleanArrayArray7[0].length > Static602.anInt9668) {
						local137 -= Static445.anInt7311 + Static430.aBooleanArrayArray7[0].length - Static602.anInt9668;
					}
					local271 = Static600.aBooleanArrayArray8;
					if (Static163.aBoolean249) {
						if (Static140.aBoolean220) {
							local271 = Static614.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static250.anInt4513; local281 < local230; local281++) {
							local288 = local281 + Static431.anInt6884 - Static250.anInt4513;
							for (local290 = Static473.anInt7804; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static430.aBooleanArrayArray7[local281][local290]) {
									@Pc(309) int local309 = local290 + Static445.anInt7311 - Static473.anInt7804;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static15.aClass164ArrayArrayArray5[local311][local288][local309] != null && Static15.aClass164ArrayArrayArray5[local311][local288][local309].aByte68 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static304.method4669(local288, local309, local198)) {
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
					if (Static140.aBoolean220) {
						if (arg4 >= 0) {
							Static121.aClass21Array2[local198].method7978(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static121.aClass21Array2[local198].method7972(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static593.anInt9541; local281++) {
							Static324.aClass148Array1[local281].method4030(new Class28_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static121.aClass21Array2[local198].method7978(Static220.anInt4183, Static547.anInt8968, Static7.anInt94, Static600.aBooleanArrayArray8, false, arg4, arg5);
					} else {
						Static121.aClass21Array2[local198].method7972(Static220.anInt4183, Static547.anInt8968, Static7.anInt94, Static600.aBooleanArrayArray8, false, arg5);
					}
				}
			}
		}
		if (Static367.anInt5935 > 0) {
			Static673.method9355(Static523.aClass28_Sub1Array24, 0, Static367.anInt5935 - 1);
			for (local198 = 0; local198 < Static367.anInt5935; local198++) {
				Static161.method2928(Static523.aClass28_Sub1Array24[local198], arg6);
			}
		}
	}
}
