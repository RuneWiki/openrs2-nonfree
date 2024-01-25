import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!qu", name = "F", descriptor = "Lclient!da;")
	public static Class69 aClass69_11;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public static void method7167() {
		if (Static24.aClass3_Sub22_4.aClass6_Sub25_2.method8119() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static58.anInt1217 - 4 & 0xFF);
		@Pc(25) int local25 = Static58.anInt1217 % Static158.anInt927;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static515.anInt8292; local31++) {
				Static302.aByteArrayArrayArray18[local27][local25][local31] = local21;
			}
		}
		if (Static309.anInt5138 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static401.anIntArray557[local31] = -1000000;
			Static287.anIntArray442[local31] = 1000000;
			Static580.anIntArray805[local31] = 0;
			Static158.anIntArray77[local31] = 1000000;
			Static94.anIntArray148[local31] = 0;
		}
		@Pc(88) int local88 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729;
		@Pc(91) int local91 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731;
		@Pc(108) int local108;
		if (Static428.anInt6834 != 1 && Static410.anInt6542 == -1) {
			local108 = Static168.method3058(Static309.anInt5138, Static509.anInt8222, Static652.anInt10382);
			if (local108 - Static146.anInt2945 < 3200 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][Static509.anInt8222 >> 9][Static652.anInt10382 >> 9] & 0x4) != 0) {
				Static57.method1242(1, false, Static652.anInt10382 >> 9, Static15.aClass164ArrayArrayArray5, Static509.anInt8222 >> 9);
				return;
			}
			return;
		}
		if (Static428.anInt6834 != 1) {
			local88 = Static410.anInt6542;
			local91 = Static153.anInt3036;
		}
		if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local88 >> 9][local91 >> 9] & 0x4) != 0) {
			Static57.method1242(0, false, local91 >> 9, Static15.aClass164ArrayArrayArray5, local88 >> 9);
		}
		if (Static520.anInt8367 >= 2560) {
			return;
		}
		local108 = Static509.anInt8222 >> 9;
		@Pc(185) int local185 = Static652.anInt10382 >> 9;
		@Pc(189) int local189 = local88 >> 9;
		@Pc(193) int local193 = local91 >> 9;
		@Pc(201) int local201;
		if (local189 <= local108) {
			local201 = local108 - local189;
		} else {
			local201 = local189 - local108;
		}
		@Pc(215) int local215;
		if (local185 < local193) {
			local215 = local193 - local185;
		} else {
			local215 = local185 - local193;
		}
		if (local201 == 0 && local215 == 0 || local201 <= -Static158.anInt927 || local201 >= Static158.anInt927 || -Static515.anInt8292 >= local215 || Static515.anInt8292 <= local215) {
			Static503.method7153("RC: " + local108 + "," + local185 + " " + local189 + "," + local193 + " " + Static287.anInt4910 + "," + Static72.anInt1361, (Throwable) null);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local215 >= local201) {
			local295 = local201 * 65536 / local215;
			local297 = 32768;
			while (local193 != local185) {
				if (local185 < local193) {
					local185++;
				} else if (local185 > local193) {
					local185--;
				}
				if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local108][local185] & 0x4) != 0) {
					Static57.method1242(1, false, local185, Static15.aClass164ArrayArrayArray5, local108);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					local297 -= 65536;
					if (local189 > local108) {
						local108++;
					} else if (local189 < local108) {
						local108--;
					}
					if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local108][local185] & 0x4) != 0) {
						Static57.method1242(1, false, local185, Static15.aClass164ArrayArrayArray5, local108);
						return;
					}
				}
			}
			return;
		}
		local295 = local215 * 65536 / local201;
		local297 = 32768;
		while (local189 != local108) {
			if (local108 < local189) {
				local108++;
			} else if (local189 < local108) {
				local108--;
			}
			if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local108][local185] & 0x4) != 0) {
				Static57.method1242(1, false, local185, Static15.aClass164ArrayArrayArray5, local108);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				if (local193 > local185) {
					local185++;
				} else if (local193 < local185) {
					local185--;
				}
				local297 -= 65536;
				if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local108][local185] & 0x4) != 0) {
					Static57.method1242(1, false, local185, Static15.aClass164ArrayArrayArray5, local108);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	public static void method7168() {
		if (Static260.anInt4398 == 0 || Static260.anInt4398 == 10) {
			return;
		}
		try {
			@Pc(20) short local20;
			if (Static289.anInt4927 == 0) {
				local20 = 250;
			} else {
				local20 = 2000;
			}
			if (Static111.aBoolean188 && Static260.anInt4398 >= 6) {
				local20 = 6000;
			}
			if (++Static91.anInt1765 > local20) {
				if (Static559.aClass269_1 != null) {
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
				}
				if (Static289.anInt4927 >= 3) {
					Static260.anInt4398 = 0;
					Static425.method6144(-5);
					return;
				}
				if (Static46.anInt1071 == 2) {
					Static541.aClass342_3.method8309();
				} else {
					Static35.aClass342_1.method8309();
				}
				Static91.anInt1765 = 0;
				Static289.anInt4927++;
				Static260.anInt4398 = 1;
			}
			if (Static260.anInt4398 == 1) {
				if (Static46.anInt1071 == 2) {
					Static175.aClass81_2 = Static541.aClass342_3.method8306(Static247.aClass291_1);
				} else {
					Static175.aClass81_2 = Static35.aClass342_1.method8306(Static247.aClass291_1);
				}
				Static260.anInt4398 = 2;
			}
			@Pc(141) Class3_Sub34 local141;
			@Pc(166) int local166;
			@Pc(212) int local212;
			if (Static260.anInt4398 == 2) {
				if (Static175.aClass81_2.anInt2532 == 2) {
					throw new IOException();
				}
				if (Static175.aClass81_2.anInt2532 != 1) {
					return;
				}
				Static559.aClass269_1 = Static669.method9265((Socket) Static175.aClass81_2.anObject4);
				Static175.aClass81_2 = null;
				Static278.method3037();
				local141 = Static202.method3100();
				if (Static111.aBoolean188) {
					local141.aClass3_Sub25_Sub1_2.method8614(Static515.aClass224_12.anInt6057);
					local141.aClass3_Sub25_Sub1_2.method8649(0);
					local166 = local141.aClass3_Sub25_Sub1_2.anInt9765;
					local141.aClass3_Sub25_Sub1_2.method8588(649);
					if (Static46.anInt1071 == 2) {
						local141.aClass3_Sub25_Sub1_2.method8614(Static406.anInt6454 == 13 ? 1 : 0);
					}
					@Pc(187) Class3_Sub25 local187 = Static204.method3649();
					local187.method8614(Static252.anInt4525);
					local187.method8649((int) (Math.random() * 9.9999999E7D));
					local187.method8614(Static609.anInt9834);
					local187.method8588(Static362.anInt5843);
					for (local212 = 0; local212 < 6; local212++) {
						local187.method8588((int) (Math.random() * 9.9999999E7D));
					}
					local187.method8603(Static604.aLong289);
					local187.method8614(Static55.aClass118_2.anInt3893);
					local187.method8614((int) (Math.random() * 9.9999999E7D));
					local187.method8601(Static644.aBigInteger6, Static607.aBigInteger5);
					local141.aClass3_Sub25_Sub1_2.method8637(local187.aByteArray106, local187.anInt9765, 0);
					local141.aClass3_Sub25_Sub1_2.method8629(local141.aClass3_Sub25_Sub1_2.anInt9765 - local166);
				} else {
					local141.aClass3_Sub25_Sub1_2.method8614(Static515.aClass224_1.anInt6057);
				}
				Static441.method6275(local141);
				Static93.method9381();
				Static260.anInt4398 = 3;
			}
			@Pc(306) int local306;
			if (Static260.anInt4398 == 3) {
				if (!Static559.aClass269_1.method6699(1)) {
					return;
				}
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				local306 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
				if (local306 != 0) {
					Static260.anInt4398 = 0;
					Static425.method6144(local306);
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					Static640.method8896();
					return;
				}
				if (Static111.aBoolean188) {
					Static260.anInt4398 = 4;
				} else {
					Static260.anInt4398 = 8;
				}
			}
			if (Static260.anInt4398 == 4) {
				if (!Static559.aClass269_1.method6699(2)) {
					return;
				}
				Static559.aClass269_1.method6702(2, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = Static210.aClass3_Sub25_Sub1_3.method8593();
				Static260.anInt4398 = 5;
			}
			if (Static260.anInt4398 == 5) {
				if (!Static559.aClass269_1.method6699(Static210.aClass3_Sub25_Sub1_3.anInt9765)) {
					return;
				}
				Static559.aClass269_1.method6702(Static210.aClass3_Sub25_Sub1_3.anInt9765, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				Static210.aClass3_Sub25_Sub1_3.method8620(Static54.anIntArray98);
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
				@Pc(393) String local393 = Static210.aClass3_Sub25_Sub1_3.method8584();
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
				@Pc(398) String local398 = "opensn";
				if (!Static663.aBoolean803 || Static496.method7117(local393, Static247.aClass291_1, local398, 1).anInt2532 == 2) {
					Static449.method6563(true, Static247.aClass291_1, local398, local393, Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 1);
				}
				Static260.anInt4398 = 6;
			}
			if (Static260.anInt4398 == 6) {
				if (!Static559.aClass269_1.method6699(1)) {
					return;
				}
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				if ((Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF) == 1) {
					Static260.anInt4398 = 7;
				}
			}
			if (Static260.anInt4398 == 7) {
				if (!Static559.aClass269_1.method6699(16)) {
					return;
				}
				Static559.aClass269_1.method6702(16, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 16;
				Static210.aClass3_Sub25_Sub1_3.method8620(Static54.anIntArray98);
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
				Static506.aString86 = Static342.aString58 = Static28.method669(Static210.aClass3_Sub25_Sub1_3.method8600());
				Static276.aLong146 = Static210.aClass3_Sub25_Sub1_3.method8600();
				Static260.anInt4398 = 8;
			}
			@Pc(527) Class3_Sub25_Sub1 local527;
			if (Static260.anInt4398 == 8) {
				Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
				Static278.method3037();
				local141 = Static202.method3100();
				local527 = local141.aClass3_Sub25_Sub1_2;
				@Pc(555) int local555;
				@Pc(564) Class3_Sub25 local564;
				@Pc(536) Class224 local536;
				if (Static46.anInt1071 == 2) {
					if (Static111.aBoolean188) {
						local536 = Static515.aClass224_13;
					} else {
						local536 = Static515.aClass224_3;
					}
					local527.method8614(local536.anInt6057);
					local527.method8649(0);
					local212 = local527.anInt9765;
					local555 = local527.anInt9765;
					if (!Static111.aBoolean188) {
						local527.method8588(649);
						local527.method8614(Static406.anInt6454 == 13 ? 1 : 0);
						local555 = local527.anInt9765;
						local564 = Static253.method7877();
						local527.method8637(local564.aByteArray106, local564.anInt9765, 0);
						local555 = local527.anInt9765;
						local527.method8583(Static506.aString86);
					}
					local527.method8614(Static41.anInt961);
					local527.method8614(Static673.method9353());
					local527.method8649(Static312.anInt5191);
					local527.method8649(Static222.anInt4196);
					local527.method8614(Static24.aClass3_Sub22_4.aClass6_Sub17_1.method5285());
					Static674.method9361(local527);
					local527.method8583(Static303.aString49);
					local527.method8588(Static362.anInt5843);
					local564 = Static24.aClass3_Sub22_4.method2839();
					local527.method8614(local564.anInt9765);
					local527.method8637(local564.aByteArray106, local564.anInt9765, 0);
					Static275.aBoolean358 = true;
					@Pc(747) Class3_Sub25 local747 = new Class3_Sub25(Static241.aClass3_Sub10_1.method1120());
					Static241.aClass3_Sub10_1.method1119(local747);
					local527.method8637(local747.aByteArray106, local747.aByteArray106.length, 0);
					local527.method8649(Static611.anInt9850);
					local527.method8603(Static306.aLong161);
					local527.method8614(Static455.aString82 == null ? 0 : 1);
					if (Static455.aString82 != null) {
						local527.method8583(Static455.aString82);
					}
					local527.method8614(Static530.method7674("jagtheora") ? 1 : 0);
					local527.method8614(Static663.aBoolean803 ? 1 : 0);
					Static266.method4372(local527);
					local527.method8587(local527.anInt9765, local555, Static54.anIntArray98);
					local527.method8629(local527.anInt9765 - local212);
				} else {
					if (Static111.aBoolean188) {
						local536 = Static515.aClass224_13;
					} else {
						local536 = Static515.aClass224_5;
					}
					local527.method8614(local536.anInt6057);
					local527.method8649(0);
					local212 = local527.anInt9765;
					local555 = local527.anInt9765;
					if (!Static111.aBoolean188) {
						local527.method8588(649);
						local564 = Static253.method7877();
						local527.method8637(local564.aByteArray106, local564.anInt9765, 0);
						local555 = local527.anInt9765;
						local527.method8583(Static506.aString86);
					}
					local527.method8614(Static55.aClass118_2.anInt3893);
					local527.method8614(Static609.anInt9834);
					Static674.method9361(local527);
					local527.method8583(Static303.aString49);
					local527.method8588(Static362.anInt5843);
					Static266.method4372(local527);
					local527.method8587(local527.anInt9765, local555, Static54.anIntArray98);
					local527.method8629(local527.anInt9765 - local212);
				}
				Static441.method6275(local141);
				Static93.method9381();
				Static163.aClass375_1 = new Class375(Static54.anIntArray98);
				for (@Pc(838) int local838 = 0; local838 < 4; local838++) {
					Static54.anIntArray98[local838] += 50;
				}
				Static210.aClass3_Sub25_Sub1_3.method3391(Static54.anIntArray98);
				Static54.anIntArray98 = null;
				Static260.anInt4398 = 9;
			}
			if (Static260.anInt4398 == 9) {
				if (!Static559.aClass269_1.method6699(1)) {
					return;
				}
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				local306 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
				if (local306 == 21) {
					Static260.anInt4398 = 12;
				} else if (local306 == 29) {
					Static260.anInt4398 = 18;
				} else if (local306 == 1) {
					Static260.anInt4398 = 10;
					Static425.method6144(local306);
					return;
				} else if (local306 == 2) {
					Static260.anInt4398 = 13;
				} else if (local306 == 15) {
					Static467.anInt7682 = -2;
					Static260.anInt4398 = 19;
				} else if (local306 == 23 && Static289.anInt4927 < 3) {
					Static260.anInt4398 = 1;
					Static289.anInt4927++;
					Static91.anInt1765 = 0;
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					return;
				} else if (!Static344.aBoolean410 || Static111.aBoolean188 || Static252.anInt4525 == -1 || local306 != 35) {
					Static260.anInt4398 = 0;
					Static425.method6144(local306);
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					Static640.method8896();
					return;
				} else {
					Static111.aBoolean188 = true;
					Static260.anInt4398 = 1;
					Static91.anInt1765 = 0;
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					return;
				}
			}
			if (Static260.anInt4398 == 11) {
				Static278.method3037();
				local141 = Static202.method3100();
				local527 = local141.aClass3_Sub25_Sub1_2;
				local527.method3397(Static163.aClass375_1);
				local527.method3392(Static515.aClass224_9.anInt6057);
				Static441.method6275(local141);
				Static93.method9381();
				Static260.anInt4398 = 9;
			} else if (Static260.anInt4398 == 12) {
				if (Static559.aClass269_1.method6699(1)) {
					Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
					local306 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
					Static260.anInt4398 = 0;
					Static215.anInt4111 = local306 * 50;
					Static425.method6144(21);
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					Static640.method8896();
				}
			} else if (Static260.anInt4398 == 18) {
				if (Static559.aClass269_1.method6699(1)) {
					Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
					Static425.anInt6802 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
					Static260.anInt4398 = 0;
					Static425.method6144(29);
					Static559.aClass269_1.method6697();
					Static559.aClass269_1 = null;
					Static640.method8896();
				}
			} else if (Static260.anInt4398 != 13) {
				@Pc(1144) Class3_Sub25_Sub1 local1144;
				if (Static260.anInt4398 == 14) {
					local1144 = Static210.aClass3_Sub25_Sub1_3;
					if (Static46.anInt1071 == 2) {
						if (!Static559.aClass269_1.method6699(Static139.anInt2797)) {
							return;
						}
						Static559.aClass269_1.method6702(Static139.anInt2797, local1144.aByteArray106, 0);
						local1144.anInt9765 = 0;
						Static24.anInt545 = local1144.method8632();
						Static236.anInt4344 = local1144.method8632();
						Static371.aBoolean430 = local1144.method8632() == 1;
						Static345.aBoolean411 = local1144.method8632() == 1;
						Static300.aBoolean366 = local1144.method8632() == 1;
						Static236.aBoolean326 = local1144.method8632() == 1;
						Static106.anInt2205 = local1144.method8593();
						Static140.aBoolean219 = local1144.method8632() == 1;
						Static513.anInt8245 = local1144.method8611();
						Static128.aBoolean206 = local1144.method8632() == 1;
						Static652.aClass267_4.method6687(Static128.aBoolean206);
						Static170.aClass370_1.method8899(Static128.aBoolean206);
						Static580.aClass36_2.method1065(Static128.aBoolean206);
					} else if (Static559.aClass269_1.method6699(Static139.anInt2797)) {
						Static559.aClass269_1.method6702(Static139.anInt2797, local1144.aByteArray106, 0);
						local1144.anInt9765 = 0;
						Static24.anInt545 = local1144.method8632();
						Static236.anInt4344 = local1144.method8632();
						Static371.aBoolean430 = local1144.method8632() == 1;
						Static345.aBoolean411 = local1144.method8632() == 1;
						Static300.aBoolean366 = local1144.method8632() == 1;
						Static256.aLong122 = local1144.method8600();
						Static267.aLong145 = Static256.aLong122 - Static524.method7320() - local1144.method8622();
						local166 = local1144.method8632();
						Static140.aBoolean219 = (local166 & 0x1) != 0;
						Static662.aBoolean802 = (local166 & 0x2) != 0;
						Static369.anInt5957 = local1144.method8618();
						Static668.anInt10670 = local1144.method8593();
						Static327.anInt5438 = local1144.method8593();
						Static162.anInt3191 = local1144.method8593();
						Static230.anInt4282 = local1144.method8618();
						Static179.aClass81_3 = Static247.aClass291_1.method7128(Static230.anInt4282);
						Static654.anInt10519 = local1144.method8632();
						Static479.anInt7955 = local1144.method8593();
						Static589.anInt9469 = local1144.method8593();
						Static7.aBoolean7 = local1144.method8632() == 1;
						Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString124 = Static636.aString120 = local1144.method8584();
						Static389.anInt6128 = local1144.method8632();
						Static445.anInt7302 = local1144.method8618();
						Static474.aBoolean594 = local1144.method8632() == 1;
						Static600.aClass342_5 = new Class342();
						Static600.aClass342_5.anInt9498 = local1144.method8593();
						if (Static600.aClass342_5.anInt9498 == 65535) {
							Static600.aClass342_5.anInt9498 = -1;
						}
						Static600.aClass342_5.aString113 = local1144.method8584();
						if (Static202.aClass147_5 != Static487.aClass147_8) {
							Static600.aClass342_5.anInt9494 = Static600.aClass342_5.anInt9498 + 50000;
							Static600.aClass342_5.anInt9493 = Static600.aClass342_5.anInt9498 + 40000;
						}
						if (Static56.aClass147_1 != Static202.aClass147_5 && (Static440.aClass147_7 != Static202.aClass147_5 || Static24.anInt545 < 2) && (Static541.aClass342_3.method8308(Static589.aClass342_4) || Static541.aClass342_3.method8308(Static413.aClass342_2))) {
							Static200.method3619();
						}
					} else {
						return;
					}
					if (Static371.aBoolean430 && !Static300.aBoolean366 || Static140.aBoolean219) {
						try {
							Static686.method8109(Static124.anApplet1, "zap");
						} catch (@Pc(1514) Throwable local1514) {
							if (Static638.aBoolean742) {
								try {
									Static124.anApplet1.getAppletContext().showDocument(new URL(Static124.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1528) Exception local1528) {
								}
							}
						}
					} else {
						try {
							Static686.method8109(Static124.anApplet1, "unzap");
						} catch (@Pc(1537) Throwable local1537) {
						}
					}
					if (Static487.aClass147_8 == Static202.aClass147_5) {
						try {
							Static686.method8109(Static124.anApplet1, "loggedin");
						} catch (@Pc(1548) Throwable local1548) {
						}
					}
					if (Static46.anInt1071 != 2) {
						Static260.anInt4398 = 0;
						Static425.method6144(2);
						Static529.method7640();
						Static553.method7892(7);
						Static175.aClass180_68 = null;
						return;
					}
					Static260.anInt4398 = 16;
				}
				if (Static260.anInt4398 == 16) {
					if (!Static559.aClass269_1.method6699(3)) {
						return;
					}
					Static559.aClass269_1.method6702(3, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
					Static260.anInt4398 = 17;
				}
				if (Static260.anInt4398 == 17) {
					local1144 = Static210.aClass3_Sub25_Sub1_3;
					local1144.anInt9765 = 0;
					if (local1144.method3394()) {
						if (!Static559.aClass269_1.method6699(1)) {
							return;
						}
						Static559.aClass269_1.method6702(1, local1144.aByteArray106, 3);
					}
					Static175.aClass180_68 = Static482.method7011()[local1144.method3396()];
					Static467.anInt7682 = local1144.method8593();
					Static260.anInt4398 = 15;
				}
				if (Static260.anInt4398 == 15) {
					if (Static559.aClass269_1.method6699(Static467.anInt7682)) {
						Static559.aClass269_1.method6702(Static467.anInt7682, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
						Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
						local306 = Static467.anInt7682;
						Static260.anInt4398 = 0;
						Static425.method6144(2);
						Static666.method9181();
						Static528.method7627(Static210.aClass3_Sub25_Sub1_3);
						Static601.anInt9665 = -1;
						if (Static175.aClass180_68 == Static532.aClass180_177) {
							Static674.method9363();
						} else {
							Static300.method4619();
						}
						if (local306 != Static210.aClass3_Sub25_Sub1_3.anInt9765) {
							throw new RuntimeException("lswp pos:" + Static210.aClass3_Sub25_Sub1_3.anInt9765 + " psize:" + local306);
						}
						Static175.aClass180_68 = null;
					}
				} else if (Static260.anInt4398 == 19) {
					if (Static467.anInt7682 == -2) {
						if (!Static559.aClass269_1.method6699(2)) {
							return;
						}
						Static559.aClass269_1.method6702(2, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
						Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
						Static467.anInt7682 = Static210.aClass3_Sub25_Sub1_3.method8593();
					}
					if (Static559.aClass269_1.method6699(Static467.anInt7682)) {
						Static559.aClass269_1.method6702(Static467.anInt7682, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
						Static210.aClass3_Sub25_Sub1_3.anInt9765 = 0;
						local306 = Static467.anInt7682;
						Static260.anInt4398 = 0;
						Static425.method6144(15);
						Static658.method9293();
						Static528.method7627(Static210.aClass3_Sub25_Sub1_3);
						if (Static210.aClass3_Sub25_Sub1_3.anInt9765 != local306) {
							throw new RuntimeException("lswpr pos:" + Static210.aClass3_Sub25_Sub1_3.anInt9765 + " psize:" + local306);
						}
						Static175.aClass180_68 = null;
					}
				}
			} else if (Static559.aClass269_1.method6699(1)) {
				Static559.aClass269_1.method6702(1, Static210.aClass3_Sub25_Sub1_3.aByteArray106, 0);
				Static139.anInt2797 = Static210.aClass3_Sub25_Sub1_3.aByteArray106[0] & 0xFF;
				Static260.anInt4398 = 14;
			}
		} catch (@Pc(1791) IOException local1791) {
			if (Static559.aClass269_1 != null) {
				Static559.aClass269_1.method6697();
				Static559.aClass269_1 = null;
			}
			if (Static289.anInt4927 >= 3) {
				Static260.anInt4398 = 0;
				Static425.method6144(-4);
				Static640.method8896();
			} else {
				if (Static46.anInt1071 == 2) {
					Static541.aClass342_3.method8309();
				} else {
					Static35.aClass342_1.method8309();
				}
				Static289.anInt4927++;
				Static91.anInt1765 = 0;
				Static260.anInt4398 = 1;
			}
		}
	}
}
