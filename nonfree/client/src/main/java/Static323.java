import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt6581 = 0;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)[Lclient!sh;")
	public static Class313[] method5593() {
		return new Class313[] { Static463.aClass313_4, Static343.aClass313_3, Static191.aClass313_2 };
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	public static void method5594() {
		Static388.aClass24Array2 = null;
		if (Static487.aBoolean676 && Static89.method2478() != 1) {
			Static507.method7812(Static529.anInt9623 == 3 || Static529.anInt9623 == 7, Static13.method247(), 0, Static617.method9007(), 0);
		}
		@Pc(34) int local34 = 0;
		@Pc(42) int local42 = 0;
		if (Static487.aBoolean676) {
			local34 = Static465.method7210();
			local42 = Static207.method4090();
		}
		Static412.method6654(local42, Static475.anInt10143, local42, -1, local34, local34 + Static81.anInt2497, local42 - -Static423.anInt7984, local34);
		if (Static388.aClass24Array2 != null) {
			Static264.method4888(local34, Static384.anInt7428, true, Static2.anInt4537, local42, Static102.aClass24_7.anInt472, local34 + Static81.anInt2497, Static388.aClass24Array2, -1412584499, local42 + Static423.anInt7984);
			Static388.aClass24Array2 = null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method5595() {
		if (Static513.anInt9420 == 0 || Static513.anInt9420 == 5) {
			return;
		}
		try {
			@Pc(17) short local17;
			if (Static579.anInt10320 == 0) {
				local17 = 250;
			} else {
				local17 = 2000;
			}
			if (local17 < ++Static201.anInt4637) {
				if (Static272.aClass116_1 != null) {
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
				}
				if (Static579.anInt10320 >= 3) {
					Static513.anInt9420 = 0;
					Static557.method8312(-5);
					return;
				}
				if (Static26.anInt543 == 2) {
					Static185.aClass255_2.method6754();
				} else {
					Static561.aClass255_5.method6754();
				}
				Static579.anInt10320++;
				Static513.anInt9420 = 1;
				Static201.anInt4637 = 0;
			}
			if (Static513.anInt9420 == 1) {
				if (Static26.anInt543 == 2) {
					Static21.aClass240_3 = Static185.aClass255_2.method6757(Static268.aClass370_3);
				} else {
					Static21.aClass240_3 = Static561.aClass255_5.method6757(Static268.aClass370_3);
				}
				Static513.anInt9420 = 2;
			}
			@Pc(117) Class2_Sub52 local117;
			if (Static513.anInt9420 == 2) {
				if (Static21.aClass240_3.anInt7566 == 2) {
					throw new IOException();
				}
				if (Static21.aClass240_3.anInt7566 != 1) {
					return;
				}
				Static272.aClass116_1 = Static431.method6883((Socket) Static21.aClass240_3.anObject13);
				Static21.aClass240_3 = null;
				Static138.method3104();
				local117 = Static483.method7528();
				local117.aClass2_Sub11_Sub2_7.method8374(Static444.aClass141_1.anInt4991);
				Static96.method2563(local117);
				Static547.method8179();
				Static513.anInt9420 = 3;
			}
			@Pc(156) int local156;
			if (Static513.anInt9420 == 3) {
				if (!Static272.aClass116_1.method3745(1)) {
					return;
				}
				Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				local156 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
				if (local156 != 0) {
					Static513.anInt9420 = 0;
					Static557.method8312(local156);
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
					Static403.method6565();
					return;
				}
				Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
				@Pc(179) Class2_Sub11 local179 = new Class2_Sub11(518);
				@Pc(182) int[] local182 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local179.method8374(10);
				local179.method8387(local182[0]);
				local179.method8387(local182[1]);
				local179.method8387(local182[2]);
				local179.method8387(local182[3]);
				local179.method8388(0L);
				local179.method8329(Static456.aString69);
				local179.method8388(Static476.aLong219);
				local179.method8388(Static546.aLong245);
				local179.method8386(Static428.aBigInteger10, Static455.aBigInteger9);
				Static138.method3104();
				@Pc(264) Class2_Sub52 local264 = Static483.method7528();
				@Pc(267) Class2_Sub11_Sub2 local267 = local264.aClass2_Sub11_Sub2_7;
				@Pc(284) int local284;
				@Pc(299) int local299;
				if (Static26.anInt543 == 2) {
					if (Static529.anInt9623 == 13) {
						local267.method8374(Static444.aClass141_5.anInt4991);
					} else {
						local267.method8374(Static444.aClass141_3.anInt4991);
					}
					local267.method8333(0);
					local284 = local267.anInt10066;
					local267.method8387(634);
					local267.method8376(local179.anInt10066, 0, local179.aByteArray128);
					local299 = local267.anInt10066;
					local267.method8329(Static415.aString88);
					local267.method8374(Static291.anInt6172);
					local267.method8374(Static89.method2478());
					local267.method8333(Static81.anInt2497);
					local267.method8333(Static423.anInt7984);
					local267.method8374(Static74.aClass2_Sub13_5.aClass14_Sub27_2.method8731());
					Static119.method2928(local267);
					local267.method8329(Static26.aString7);
					local267.method8387(Static482.anInt8988);
					@Pc(423) Class2_Sub11 local423 = Static74.aClass2_Sub13_5.method2605();
					local267.method8374(local423.anInt10066);
					local267.method8376(local423.anInt10066, 0, local423.aByteArray128);
					Static475.aBoolean694 = true;
					@Pc(445) Class2_Sub11 local445 = new Class2_Sub11(Static494.aClass2_Sub16_1.method3134());
					Static494.aClass2_Sub16_1.method3135(local445);
					local267.method8376(local445.aByteArray128.length, 0, local445.aByteArray128);
					local267.method8333(Static274.anInt5853);
					local267.method8388(Static535.aLong241);
					local267.method8374(Static49.aString11 == null ? 0 : 1);
					if (Static49.aString11 != null) {
						local267.method8329(Static49.aString11);
					}
					local267.method8374(Static607.method8908("jagtheora") ? 1 : 0);
					Static45.method1648(local267);
					local267.method8346(local299, local182, local267.anInt10066);
					local267.method8379(local267.anInt10066 - local284);
				} else {
					local267.method8374(Static444.aClass141_6.anInt4991);
					local267.method8333(0);
					local284 = local267.anInt10066;
					local267.method8387(634);
					local267.method8376(local179.anInt10066, 0, local179.aByteArray128);
					local299 = local267.anInt10066;
					local267.method8329(Static415.aString88);
					local267.method8374(Static423.aClass316_4.anInt9447);
					local267.method8374(Static476.anInt8915);
					Static119.method2928(local267);
					local267.method8329(Static26.aString7);
					local267.method8387(Static482.anInt8988);
					Static45.method1648(local267);
					local267.method8346(local299, local182, local267.anInt10066);
					local267.method8379(local267.anInt10066 - local284);
				}
				Static96.method2563(local264);
				Static547.method8179();
				Static361.aClass183_1 = new Class183(local182);
				for (local284 = 0; local284 < 4; local284++) {
					local182[local284] += 50;
				}
				Static627.aClass2_Sub11_Sub2_6.method8396(local182);
				Static513.anInt9420 = 4;
			}
			if (Static513.anInt9420 == 4) {
				if (!Static272.aClass116_1.method3745(1)) {
					return;
				}
				Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				local156 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
				if (local156 == 21) {
					Static513.anInt9420 = 7;
				} else if (local156 == 29) {
					Static513.anInt9420 = 13;
				} else if (local156 == 1) {
					Static513.anInt9420 = 5;
					Static557.method8312(local156);
					return;
				} else if (local156 == 2) {
					Static513.anInt9420 = 8;
				} else if (local156 == 15) {
					Static513.anInt9420 = 14;
					Static541.anInt9723 = -2;
				} else if (local156 == 23 && Static579.anInt10320 < 3) {
					Static513.anInt9420 = 1;
					Static579.anInt10320++;
					Static201.anInt4637 = 0;
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
					return;
				} else {
					Static513.anInt9420 = 0;
					Static557.method8312(local156);
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
					Static403.method6565();
					return;
				}
			}
			if (Static513.anInt9420 == 6) {
				Static138.method3104();
				local117 = Static483.method7528();
				@Pc(656) Class2_Sub11_Sub2 local656 = local117.aClass2_Sub11_Sub2_7;
				local656.method8406(Static361.aClass183_1);
				local656.method8398(Static444.aClass141_12.anInt4991);
				Static96.method2563(local117);
				Static547.method8179();
				Static513.anInt9420 = 4;
			} else if (Static513.anInt9420 == 7) {
				if (Static272.aClass116_1.method3745(1)) {
					Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
					local156 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
					Static513.anInt9420 = 0;
					Static278.anInt5908 = (local156 + 3) * 60;
					Static557.method8312(21);
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
					Static403.method6565();
				}
			} else if (Static513.anInt9420 == 13) {
				if (Static272.aClass116_1.method3745(1)) {
					Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
					Static513.anInt9420 = 0;
					Static441.anInt8171 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
					Static557.method8312(29);
					Static272.aClass116_1.method3740();
					Static272.aClass116_1 = null;
					Static403.method6565();
				}
			} else if (Static513.anInt9420 != 8) {
				@Pc(789) Class2_Sub11_Sub2 local789;
				if (Static513.anInt9420 == 9) {
					local789 = Static627.aClass2_Sub11_Sub2_6;
					if (Static26.anInt543 == 2) {
						if (!Static272.aClass116_1.method3745(Static305.anInt6353)) {
							return;
						}
						Static272.aClass116_1.method3741(Static305.anInt6353, 0, local789.aByteArray128);
						local789.anInt10066 = 0;
						Static468.anInt8823 = local789.method8383();
						Static372.anInt7351 = local789.method8383();
						Static209.aBoolean352 = local789.method8383() == 1;
						Static381.aBoolean540 = local789.method8383() == 1;
						Static255.aBoolean413 = local789.method8383() == 1;
						Static180.aBoolean322 = local789.method8383() == 1;
						Static569.anInt10211 = local789.method8326();
						Static486.aBoolean654 = local789.method8383() == 1;
						Static20.anInt389 = local789.method8365();
						Static378.aBoolean238 = local789.method8383() == 1;
						Static27.aClass342_3.method8533(Static378.aBoolean238);
						Static635.aClass336_2.method8418(Static378.aBoolean238);
						Static462.aClass355_2.method8737(Static378.aBoolean238);
					} else if (Static272.aClass116_1.method3745(Static305.anInt6353)) {
						Static272.aClass116_1.method3741(Static305.anInt6353, 0, local789.aByteArray128);
						local789.anInt10066 = 0;
						Static468.anInt8823 = local789.method8383();
						Static372.anInt7351 = local789.method8383();
						Static209.aBoolean352 = local789.method8383() == 1;
						Static381.aBoolean540 = local789.method8383() == 1;
						Static255.aBoolean413 = local789.method8383() == 1;
						Static362.anInt7191 = local789.method8368();
						Static486.aBoolean654 = Static362.anInt7191 > 0;
						Static274.anInt5851 = local789.method8326();
						Static8.anInt153 = local789.method8326();
						Static486.anInt9004 = local789.method8326();
						Static429.anInt8032 = local789.method8381();
						Static374.aClass240_10 = Static268.aClass370_3.method9067(Static429.anInt8032);
						Static499.anInt9242 = local789.method8383();
						Static21.anInt396 = local789.method8326();
						Static173.anInt4165 = local789.method8326();
						Static63.aBoolean168 = local789.method8383() == 1;
						Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString63 = Static119.aString24 = local789.method8367();
						Static300.anInt2386 = local789.method8383();
						Static2.anInt4533 = local789.method8381();
						Static331.aClass255_4 = new Class255();
						Static331.aClass255_4.anInt7912 = local789.method8326();
						if (Static331.aClass255_4.anInt7912 == 65535) {
							Static331.aClass255_4.anInt7912 = -1;
						}
						Static331.aClass255_4.aString89 = local789.method8367();
						if (Static448.aClass107_7 != Static193.aClass107_2) {
							Static331.aClass255_4.anInt7908 = Static331.aClass255_4.anInt7912 + 50000;
							Static331.aClass255_4.anInt7914 = Static331.aClass255_4.anInt7912 + 40000;
						}
						if (Static193.aClass107_2 != Static305.aClass107_5 && (Static185.aClass255_2.method6759(Static280.aClass255_3) || Static185.aClass255_2.method6759(Static92.aClass255_1))) {
							Static270.method4968();
						}
					} else {
						return;
					}
					if (Static209.aBoolean352 && !Static255.aBoolean413 || Static486.aBoolean654) {
						try {
							Static646.method1788(Static334.anApplet2, "zap");
						} catch (@Pc(1101) Throwable local1101) {
							if (Static578.aBoolean579) {
								try {
									Static334.anApplet2.getAppletContext().showDocument(new URL(Static334.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1115) Exception local1115) {
								}
							}
						}
					} else {
						try {
							Static646.method1788(Static334.anApplet2, "unzap");
						} catch (@Pc(1092) Throwable local1092) {
						}
					}
					if (Static193.aClass107_2 == Static448.aClass107_7) {
						try {
							Static646.method1788(Static334.anApplet2, "loggedin");
						} catch (@Pc(1126) Throwable local1126) {
						}
					}
					if (Static26.anInt543 != 2) {
						Static513.anInt9420 = 0;
						Static557.method8312(2);
						Static555.method8282();
						Static66.method8375(7);
						Static138.aClass215_57 = null;
						return;
					}
					Static513.anInt9420 = 11;
				}
				if (Static513.anInt9420 == 11) {
					if (!Static272.aClass116_1.method3745(3)) {
						return;
					}
					Static272.aClass116_1.method3741(3, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
					Static513.anInt9420 = 12;
				}
				if (Static513.anInt9420 == 12) {
					local789 = Static627.aClass2_Sub11_Sub2_6;
					local789.anInt10066 = 0;
					if (local789.method8394()) {
						if (!Static272.aClass116_1.method3745(1)) {
							return;
						}
						Static272.aClass116_1.method3741(1, 3, local789.aByteArray128);
					}
					Static138.aClass215_57 = Static447.method7045()[local789.method8397()];
					Static541.anInt9723 = local789.method8326();
					Static513.anInt9420 = 10;
				}
				if (Static513.anInt9420 == 10) {
					if (Static272.aClass116_1.method3745(Static541.anInt9723)) {
						Static272.aClass116_1.method3741(Static541.anInt9723, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
						Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
						Static513.anInt9420 = 0;
						local156 = Static541.anInt9723;
						Static557.method8312(2);
						Static21.method597();
						Static290.method5251(Static627.aClass2_Sub11_Sub2_6);
						Static199.anInt8568 = -1;
						if (Static138.aClass215_57 == Static212.aClass215_96) {
							Static32.method771();
						} else {
							Static567.method8486();
						}
						if (Static627.aClass2_Sub11_Sub2_6.anInt10066 != local156) {
							throw new RuntimeException("lswp pos:" + Static627.aClass2_Sub11_Sub2_6.anInt10066 + " psize:" + local156);
						}
						Static138.aClass215_57 = null;
					}
				} else if (Static513.anInt9420 == 14) {
					if (Static541.anInt9723 == -2) {
						if (!Static272.aClass116_1.method3745(2)) {
							return;
						}
						Static272.aClass116_1.method3741(2, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
						Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
						Static541.anInt9723 = Static627.aClass2_Sub11_Sub2_6.method8326();
					}
					if (Static272.aClass116_1.method3745(Static541.anInt9723)) {
						Static272.aClass116_1.method3741(Static541.anInt9723, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
						Static627.aClass2_Sub11_Sub2_6.anInt10066 = 0;
						@Pc(1334) int local1334 = Static541.anInt9723;
						Static513.anInt9420 = 0;
						Static557.method8312(15);
						Static69.method2111();
						Static290.method5251(Static627.aClass2_Sub11_Sub2_6);
						if (Static627.aClass2_Sub11_Sub2_6.anInt10066 != local1334) {
							throw new RuntimeException("lswpr pos:" + Static627.aClass2_Sub11_Sub2_6.anInt10066 + " psize:" + local1334);
						}
						Static138.aClass215_57 = null;
					}
				}
			} else if (Static272.aClass116_1.method3745(1)) {
				Static272.aClass116_1.method3741(1, 0, Static627.aClass2_Sub11_Sub2_6.aByteArray128);
				Static305.anInt6353 = Static627.aClass2_Sub11_Sub2_6.aByteArray128[0] & 0xFF;
				Static513.anInt9420 = 9;
			}
		} catch (@Pc(1372) IOException local1372) {
			if (Static272.aClass116_1 != null) {
				Static272.aClass116_1.method3740();
				Static272.aClass116_1 = null;
			}
			if (Static579.anInt10320 >= 3) {
				Static513.anInt9420 = 0;
				Static557.method8312(-4);
				Static403.method6565();
			} else {
				if (Static26.anInt543 == 2) {
					Static185.aClass255_2.method6754();
				} else {
					Static561.aClass255_5.method6754();
				}
				Static579.anInt10320++;
				Static201.anInt4637 = 0;
				Static513.anInt9420 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5599(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static117.method2904("\n", "%0a", arg0));
	}
}
