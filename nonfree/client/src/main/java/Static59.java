import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_4 = new Class137("", 16);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)Z")
	public static boolean method1218() throws IOException {
		if (Static324.aClass165_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static355.aClass56_123 == null) {
			if (Static527.aBoolean650) {
				if (!Static324.aClass165_2.method3982(1)) {
					return false;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
				Static527.aBoolean650 = false;
				Static566.anInt9223 = 0;
				Static469.anInt4273++;
			}
			Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
			if (Static532.aClass3_Sub11_Sub1_2.method1391()) {
				if (!Static324.aClass165_2.method3982(1)) {
					return false;
				}
				Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 1);
				Static566.anInt9223 = 0;
				Static469.anInt4273++;
			}
			Static527.aBoolean650 = true;
			@Pc(69) Class56[] local69 = Static587.method7875();
			local73 = Static532.aClass3_Sub11_Sub1_2.method1389();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static532.aClass3_Sub11_Sub1_2.anInt6128);
			}
			Static355.aClass56_123 = local69[local73];
			Static292.anInt4974 = Static355.aClass56_123.anInt1697;
		}
		if (Static292.anInt4974 == -1) {
			if (!Static324.aClass165_2.method3982(1)) {
				return false;
			}
			Static324.aClass165_2.method3976(1, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
			Static566.anInt9223 = 0;
			Static469.anInt4273++;
			Static292.anInt4974 = Static532.aClass3_Sub11_Sub1_2.aByteArray62[0] & 0xFF;
		}
		if (Static292.anInt4974 == -2) {
			if (!Static324.aClass165_2.method3982(2)) {
				return false;
			}
			Static324.aClass165_2.method3976(2, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
			Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
			Static292.anInt4974 = Static532.aClass3_Sub11_Sub1_2.method5198();
			Static469.anInt4273 += 2;
			Static566.anInt9223 = 0;
		}
		if (Static292.anInt4974 > 0) {
			if (!Static324.aClass165_2.method3982(Static292.anInt4974)) {
				return false;
			}
			Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
			Static324.aClass165_2.method3976(Static292.anInt4974, Static532.aClass3_Sub11_Sub1_2.aByteArray62, 0);
			Static469.anInt4273 += Static292.anInt4974;
			Static566.anInt9223 = 0;
		}
		Static466.aClass56_155 = Static399.aClass56_133;
		Static399.aClass56_133 = Static308.aClass56_102;
		Static308.aClass56_102 = Static355.aClass56_123;
		@Pc(219) int local219;
		@Pc(210) int local210;
		if (Static269.aClass56_94 == Static355.aClass56_123) {
			local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
			local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
			@Pc(217) int[] local217 = new int[4];
			for (local219 = 0; local219 < 4; local219++) {
				local217[local219] = Static532.aClass3_Sub11_Sub1_2.method5178();
			}
			@Pc(240) Class3_Sub34 local240 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local210);
			if (local240 != null) {
				Static229.method3564(local240.aClass41_Sub2_Sub1_Sub4_Sub1_2, local217, local73);
			}
			Static355.aClass56_123 = null;
			return true;
		}
		@Pc(292) int local292;
		@Pc(305) int local305;
		@Pc(309) int local309;
		if (Static537.aClass56_168 == Static355.aClass56_123) {
			Static253.anInt4491 = Static532.aClass3_Sub11_Sub1_2.method5175();
			Static470.anInt7808 = Static532.aClass3_Sub11_Sub1_2.method5173() << 3;
			Static418.anInt7087 = Static532.aClass3_Sub11_Sub1_2.method5173() << 3;
			for (@Pc(276) Class3_Sub31 local276 = (Class3_Sub31) Static211.aClass354_17.method7694(); local276 != null; local276 = (Class3_Sub31) Static211.aClass354_17.method7692()) {
				local73 = (int) (local276.aLong273 >> 28 & 0x3L);
				local292 = (int) (local276.aLong273 & 0x3FFFL);
				local219 = local292 - Static335.anInt5608;
				local305 = (int) (local276.aLong273 >> 14 & 0x3FFFL);
				local309 = local305 - Static246.anInt4344;
				if (Static253.anInt4491 == local73 && local219 >= Static470.anInt7808 && Static470.anInt7808 + 8 > local219 && Static418.anInt7087 <= local309 && Static418.anInt7087 + 8 > local309) {
					local276.method7825();
					if (local219 >= 0 && local309 >= 0 && Static54.anInt1038 > local219 && Static140.anInt3026 > local309) {
						Static297.method4420(local309, local219, Static253.anInt4491);
					}
				}
			}
			for (@Pc(388) Class3_Sub26 local388 = (Class3_Sub26) Static469.aClass112_27.method3088(); local388 != null; local388 = (Class3_Sub26) Static469.aClass112_27.method3084()) {
				if (Static470.anInt7808 <= local388.anInt3738 && local388.anInt3738 < Static470.anInt7808 + 8 && Static418.anInt7087 <= local388.anInt3735 && Static418.anInt7087 + 8 > local388.anInt3735 && Static253.anInt4491 == local388.anInt3740) {
					local388.anInt3734 = 0;
				}
			}
			Static355.aClass56_123 = null;
			return true;
		} else if (Static71.aClass56_42 == Static355.aClass56_123) {
			Static470.anInt7808 = Static532.aClass3_Sub11_Sub1_2.method5212() << 3;
			Static418.anInt7087 = Static532.aClass3_Sub11_Sub1_2.method5173() << 3;
			Static253.anInt4491 = Static532.aClass3_Sub11_Sub1_2.method5175();
			while (Static532.aClass3_Sub11_Sub1_2.anInt6128 < Static292.anInt4974) {
				@Pc(464) Class262 local464 = Static399.method5813()[Static532.aClass3_Sub11_Sub1_2.method5175()];
				Static49.method759(local464);
			}
			Static355.aClass56_123 = null;
			return true;
		} else if (Static355.aClass56_123 == Static500.aClass56_161) {
			local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
			local73 = Static532.aClass3_Sub11_Sub1_2.method5205();
			local292 = Static532.aClass3_Sub11_Sub1_2.method5186();
			local219 = Static532.aClass3_Sub11_Sub1_2.method5229();
			if (Static536.method7152(local210)) {
				Static545.method4206(local292, 5, local73, local219);
			}
			Static355.aClass56_123 = null;
			return true;
		} else if (Static3.aClass56_129 == Static355.aClass56_123) {
			Static78.method7774(Static532.aClass3_Sub11_Sub1_2.method5181());
			Static355.aClass56_123 = null;
			return true;
		} else {
			@Pc(556) boolean local556;
			@Pc(577) String local577;
			@Pc(538) String local538;
			@Pc(534) boolean local534;
			@Pc(540) String local540;
			if (Static111.aClass56_172 == Static355.aClass56_123) {
				local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
				local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
				local540 = local538;
				if (local534) {
					local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
				}
				local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local305 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local556 = false;
				if (local219 <= 1 && Static503.method6787(local540)) {
					local556 = true;
				}
				if (!local556 && Static14.anInt285 == 0) {
					local577 = Static111.aClass149_11.method3568(local305).method2881(Static532.aClass3_Sub11_Sub1_2);
					if (local219 == 2) {
						Static224.method3527(local538, "<img=1>" + local540, null, local305, "<img=1>" + local538, 25, 0, local577);
					} else if (local219 == 1) {
						Static224.method3527(local538, "<img=0>" + local540, null, local305, "<img=0>" + local538, 25, 0, local577);
					} else {
						Static224.method3527(local538, local540, null, local305, local538, 25, 0, local577);
					}
				}
				Static355.aClass56_123 = null;
				return true;
			} else if (Static355.aClass56_123 == Static155.aClass56_72) {
				Static49.method759(Static188.aClass262_15);
				Static355.aClass56_123 = null;
				return true;
			} else {
				@Pc(679) String local679;
				if (Static355.aClass56_123 == Static128.aClass56_63) {
					local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
					if (local210 == 65535) {
						local210 = -1;
					}
					local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
					local292 = Static532.aClass3_Sub11_Sub1_2.method5204();
					local679 = Static532.aClass3_Sub11_Sub1_2.method5181();
					if (local73 >= 1 && local73 <= 8) {
						if (local679.equalsIgnoreCase("null")) {
							local679 = null;
						}
						Static478.aStringArray32[local73 - 1] = local679;
						Static413.anIntArray439[local73 - 1] = local210;
						Static32.aBooleanArray1[local73 - 1] = local292 == 0;
					}
					Static355.aClass56_123 = null;
					return true;
				} else if (Static590.aClass56_180 == Static355.aClass56_123) {
					Static296.method4399(Static532.aClass3_Sub11_Sub1_2, Static292.anInt4974);
					Static355.aClass56_123 = null;
					return true;
				} else if (Static355.aClass56_123 == Static43.aClass56_26) {
					Static532.aClass3_Sub11_Sub1_2.anInt6128 += 28;
					if (Static532.aClass3_Sub11_Sub1_2.method5190()) {
						Static387.method5736(Static532.aClass3_Sub11_Sub1_2.anInt6128 - 28, Static532.aClass3_Sub11_Sub1_2);
					}
					Static355.aClass56_123 = null;
					return true;
				} else if (Static355.aClass56_123 == Static492.aClass56_159) {
					Static49.method759(Static97.aClass262_2);
					Static355.aClass56_123 = null;
					return true;
				} else if (Static309.aClass56_105 == Static355.aClass56_123) {
					local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
					if (local210 == 65535) {
						local210 = -1;
					}
					local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
					local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
					local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
					Static39.method648(local219, local292, local210, local73, false);
					Static355.aClass56_123 = null;
					return true;
				} else if (Static596.aClass56_181 == Static355.aClass56_123) {
					local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
					local73 = Static532.aClass3_Sub11_Sub1_2.method5228();
					local292 = Static532.aClass3_Sub11_Sub1_2.method5175();
					if (Static536.method7152(local210)) {
						Static221.method3503(local292, local73);
					}
					Static355.aClass56_123 = null;
					return true;
				} else if (Static355.aClass56_123 == Static538.aClass56_169) {
					Static285.method4233(Static237.aClass258_3, Static532.aClass3_Sub11_Sub1_2, Static292.anInt4974);
					Static355.aClass56_123 = null;
					return true;
				} else if (Static355.aClass56_123 == Static454.aClass56_153) {
					Static355.aString44 = Static292.anInt4974 > 2 ? Static532.aClass3_Sub11_Sub1_2.method5181() : Static544.aClass343_30.method7222(Static256.anInt4535);
					Static299.anInt5096 = Static292.anInt4974 <= 0 ? -1 : Static532.aClass3_Sub11_Sub1_2.method5198();
					Static355.aClass56_123 = null;
					if (Static299.anInt5096 == 65535) {
						Static299.anInt5096 = -1;
					}
					return true;
				} else if (Static136.aClass56_64 == Static355.aClass56_123) {
					local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
					local73 = Static532.aClass3_Sub11_Sub1_2.method5186();
					local292 = Static532.aClass3_Sub11_Sub1_2.method5219();
					local219 = Static532.aClass3_Sub11_Sub1_2.method5174();
					if (local219 == 65535) {
						local219 = -1;
					}
					if (Static536.method7152(local210)) {
						Static395.method5773(local219, local292, local73);
						@Pc(915) Class197 local915 = Static6.aClass92_1.method2673(local219);
						Static463.method6428(local915.anInt5210, local292, local915.anInt5240, local915.anInt5243);
						Static246.method3793(local915.anInt5220, local915.anInt5191, local915.anInt5224, local292);
					}
					Static355.aClass56_123 = null;
					return true;
				} else if (Static355.aClass56_123 == Static536.aClass56_167) {
					local210 = Static532.aClass3_Sub11_Sub1_2.method5175();
					if (Static532.aClass3_Sub11_Sub1_2.method5175() == 0) {
						Static450.aClass211Array20[local210] = new Class211();
					} else {
						Static532.aClass3_Sub11_Sub1_2.anInt6128--;
						Static450.aClass211Array20[local210] = new Class211(Static532.aClass3_Sub11_Sub1_2);
					}
					Static355.aClass56_123 = null;
					Static510.anInt8281 = Static109.anInt2171;
					return true;
				} else {
					@Pc(1009) String local1009;
					@Pc(1056) int local1056;
					@Pc(1013) String local1013;
					if (Static277.aClass56_97 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5175();
						@Pc(991) boolean local991 = (local210 & 0x1) == 1;
						local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
						local679 = Static532.aClass3_Sub11_Sub1_2.method5181();
						if (local679.equals("")) {
							local679 = local540;
						}
						local1009 = Static532.aClass3_Sub11_Sub1_2.method5181();
						local1013 = Static532.aClass3_Sub11_Sub1_2.method5181();
						if (local1013.equals("")) {
							local1013 = local1009;
						}
						if (local991) {
							for (local1056 = 0; local1056 < Static579.anInt9370; local1056++) {
								if (Static189.aStringArray16[local1056].equals(local1013)) {
									Static483.aStringArray33[local1056] = local540;
									Static189.aStringArray16[local1056] = local679;
									Static527.aStringArray36[local1056] = local1009;
									Static119.aStringArray8[local1056] = local1013;
									break;
								}
							}
						} else {
							Static483.aStringArray33[Static579.anInt9370] = local540;
							Static189.aStringArray16[Static579.anInt9370] = local679;
							Static527.aStringArray36[Static579.anInt9370] = local1009;
							Static119.aStringArray8[Static579.anInt9370] = local1013;
							Static160.aBooleanArray10[Static579.anInt9370] = (local210 & 0x2) == 2;
							Static579.anInt9370++;
						}
						Static49.anInt890 = Static109.anInt2171;
						Static355.aClass56_123 = null;
						return true;
					}
					@Pc(1125) Class3_Sub49 local1125;
					if (Static15.aClass56_15 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5219();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5205();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5229();
						if (Static536.method7152(local73)) {
							@Pc(1118) Class3_Sub49 local1118 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local210);
							local1125 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local292);
							if (local1125 != null) {
								Static250.method3868(local1125, false, local1118 == null || local1118.anInt8836 != local1125.anInt8836);
							}
							if (local1118 != null) {
								local1118.method7825();
								Static216.aClass354_18.method7691(local1118, (long) local292);
							}
							@Pc(1160) Class361 local1160 = Static265.method4040(local210);
							if (local1160 != null) {
								Static186.method3170(local1160);
							}
							local1160 = Static265.method4040(local292);
							if (local1160 != null) {
								Static186.method3170(local1160);
								Static70.method1495(true, local1160);
							}
							if (Static353.anInt6188 != -1) {
								Static556.method7355(Static353.anInt6188, 1);
							}
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static429.aClass56_143) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5178();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5228();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
						if (local292 == 65535) {
							local292 = -1;
						}
						if (Static536.method7152(local210)) {
							Static545.method4206(local73, 2, local292, -1);
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static292.aClass56_98) {
						Static49.method759(Static417.aClass262_13);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static438.aClass56_144 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5186();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5205();
						if (Static536.method7152(local73)) {
							Static500.method6745(local292, local210);
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static30.aClass56_18 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
						if (local210 == 65535) {
							local210 = -1;
						}
						local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
						local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
						Static32.method540(local219, local210, local292, local73);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static530.aClass56_166) {
						if (Static234.method3634(Static32.anInt602)) {
							Static35.anInt636 = (int) ((float) Static532.aClass3_Sub11_Sub1_2.method5198() * 2.5F);
						} else {
							Static35.anInt636 = Static532.aClass3_Sub11_Sub1_2.method5198() * 30;
						}
						Static330.anInt5543 = Static109.anInt2171;
						Static355.aClass56_123 = null;
						return true;
					} else if (Static339.aClass56_114 == Static355.aClass56_123) {
						Static326.method4711(false);
						Static355.aClass56_123 = null;
						return false;
					} else if (Static267.aClass56_93 == Static355.aClass56_123) {
						Static423.anInt7194 = Static532.aClass3_Sub11_Sub1_2.method5192();
						Static297.aBoolean376 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
						Static355.aClass56_123 = null;
						return true;
					} else if (Static205.aClass56_79 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local219 = Static532.aClass3_Sub11_Sub1_2.method5198() << 2;
						local305 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local309 = Static532.aClass3_Sub11_Sub1_2.method5175();
						if (Static536.method7152(local210)) {
							Static587.method7874(local292, local309, true, local305, local219, local73);
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static130.aClass56_140 == Static355.aClass56_123) {
						Static510.method6880();
						Static355.aClass56_123 = null;
						return false;
					} else if (Static355.aClass56_123 == Static35.aClass56_22) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local219 = Static532.aClass3_Sub11_Sub1_2.method5198() << 2;
						local305 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local309 = Static532.aClass3_Sub11_Sub1_2.method5175();
						if (Static536.method7152(local210)) {
							Static112.method1929(local305, local219, local309, local292, local73);
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static140.aClass56_68) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5178();
						local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5174();
						if (Static536.method7152(local210)) {
							Static592.method7916(local292, local538);
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static247.aClass56_87) {
						Static253.anInt4491 = Static532.aClass3_Sub11_Sub1_2.method5185();
						Static470.anInt7808 = Static532.aClass3_Sub11_Sub1_2.method5187() << 3;
						Static418.anInt7087 = Static532.aClass3_Sub11_Sub1_2.method5187() << 3;
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static137.aClass56_65) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5205();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5229();
						Static491.aClass318_1.method6737(local210, local73);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static109.aClass56_53) {
						Static49.method759(Static103.aClass262_3);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static294.aClass56_150 == Static355.aClass56_123) {
						Static49.method759(Static211.aClass262_9);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static38.aClass56_23) {
						Static49.method759(Static358.aClass262_10);
						Static355.aClass56_123 = null;
						return true;
					} else if (Static74.aClass56_46 == Static355.aClass56_123) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
						local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local305 = Static532.aClass3_Sub11_Sub1_2.method5175();
						local309 = Static532.aClass3_Sub11_Sub1_2.method5198();
						if (Static536.method7152(local210)) {
							Static350.aBooleanArray20[local73] = true;
							Static483.anIntArray502[local73] = local292;
							Static99.anIntArray93[local73] = local219;
							Static124.anIntArray571[local73] = local305;
							Static504.anIntArray523[local73] = local309;
						}
						Static355.aClass56_123 = null;
						return true;
					} else if (Static355.aClass56_123 == Static120.aClass56_62) {
						Static334.anInt5598 = Static532.aClass3_Sub11_Sub1_2.method5231();
						Static355.aClass56_123 = null;
						Static330.anInt5543 = Static109.anInt2171;
						return true;
					} else if (Static355.aClass56_123 == Static185.aClass56_77) {
						local210 = Static532.aClass3_Sub11_Sub1_2.method5205();
						local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
						local292 = Static532.aClass3_Sub11_Sub1_2.method5174();
						if (Static536.method7152(local292)) {
							Static592.method7916(local210, local538);
						}
						Static355.aClass56_123 = null;
						return true;
					} else {
						@Pc(1679) long local1679;
						@Pc(1684) long local1684;
						@Pc(1689) long local1689;
						@Pc(1693) int local1693;
						@Pc(1697) int local1697;
						if (Static355.aClass56_123 == Static297.aClass56_99) {
							local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
							local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
							local540 = local538;
							if (local534) {
								local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
							}
							local1679 = Static532.aClass3_Sub11_Sub1_2.method5226();
							local1684 = Static532.aClass3_Sub11_Sub1_2.method5198();
							local1689 = Static532.aClass3_Sub11_Sub1_2.method5230();
							local1693 = Static532.aClass3_Sub11_Sub1_2.method5175();
							local1697 = Static532.aClass3_Sub11_Sub1_2.method5198();
							@Pc(1703) long local1703 = local1689 + (local1684 << 32);
							@Pc(1705) boolean local1705 = false;
							@Pc(1707) int local1707 = 0;
							while (true) {
								if (local1707 >= 100) {
									if (local1693 <= 1 && Static503.method6787(local540)) {
										local1705 = true;
									}
									break;
								}
								if (local1703 == Static340.aLongArray10[local1707]) {
									local1705 = true;
									break;
								}
								local1707++;
							}
							if (!local1705 && Static14.anInt285 == 0) {
								Static340.aLongArray10[Static391.anInt6858] = local1703;
								Static391.anInt6858 = (Static391.anInt6858 + 1) % 100;
								@Pc(1756) String local1756 = Static111.aClass149_11.method3568(local1697).method2881(Static532.aClass3_Sub11_Sub1_2);
								if (local1693 == 2) {
									Static224.method3527(local538, "<img=1>" + local540, Static410.method5910(local1679), local1697, "<img=1>" + local538, 20, 0, local1756);
								} else if (local1693 == 1) {
									Static224.method3527(local538, "<img=0>" + local540, Static410.method5910(local1679), local1697, "<img=0>" + local538, 20, 0, local1756);
								} else {
									Static224.method3527(local538, local540, Static410.method5910(local1679), local1697, local538, 20, 0, local1756);
								}
							}
							Static355.aClass56_123 = null;
							return true;
						} else if (Static355.aClass56_123 == Static490.aClass56_158) {
							local210 = Static532.aClass3_Sub11_Sub1_2.method5228();
							local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
							if (local73 == 65535) {
								local73 = -1;
							}
							local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
							if (Static536.method7152(local292)) {
								Static66.method1442(local73, local210);
							}
							Static355.aClass56_123 = null;
							return true;
						} else if (Static355.aClass56_123 == Static219.aClass56_81) {
							Static491.aClass318_1.method6744();
							Static321.anInt5440 += 32;
							Static355.aClass56_123 = null;
							return true;
						} else {
							@Pc(2545) int local2545;
							@Pc(2316) int local2316;
							@Pc(2552) int local2552;
							@Pc(2428) int local2428;
							@Pc(2000) int local2000;
							@Pc(1960) boolean local1960;
							if (Static355.aClass56_123 == Static526.aClass56_165) {
								local210 = Static532.aClass3_Sub11_Sub1_2.method5205();
								local73 = Static532.aClass3_Sub11_Sub1_2.method5186();
								local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
								local219 = Static532.aClass3_Sub11_Sub1_2.method5206();
								local305 = Static532.aClass3_Sub11_Sub1_2.method5205();
								local556 = (local219 & 0x80) != 0;
								if (local73 >> 30 == 0) {
									@Pc(2028) Class284 local2028;
									@Pc(2050) Class185 local2050;
									@Pc(2044) Class185 local2044;
									if (local73 >> 29 != 0) {
										local1056 = local73 & 0xFFFF;
										@Pc(2263) Class3_Sub34 local2263 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local1056);
										if (local2263 != null) {
											@Pc(2268) Class41_Sub2_Sub1_Sub4_Sub1 local2268 = local2263.aClass41_Sub2_Sub1_Sub4_Sub1_2;
											if (local292 == 65535) {
												local292 = -1;
											}
											@Pc(2277) boolean local2277 = true;
											local1697 = local556 ? local2268.anInt9482 : local2268.anInt9528;
											if (local292 != -1 && local1697 != -1) {
												if (local1697 == local292) {
													local2028 = Static368.aClass278_1.method6127(local292);
													if (local2028.aBoolean565 && local2028.anInt7490 != -1) {
														local2044 = Static545.aClass240_2.method5680(local2028.anInt7490);
														local2316 = local2044.anInt4978;
														if (local2316 == 0 || local2316 == 2) {
															local2277 = false;
														} else if (local2316 == 1) {
															local2277 = true;
														}
													}
												} else {
													local2028 = Static368.aClass278_1.method6127(local292);
													@Pc(2344) Class284 local2344 = Static368.aClass278_1.method6127(local1697);
													if (local2028.anInt7490 != -1 && local2344.anInt7490 != -1) {
														local2050 = Static545.aClass240_2.method5680(local2028.anInt7490);
														@Pc(2365) Class185 local2365 = Static545.aClass240_2.method5680(local2344.anInt7490);
														if (local2050.anInt4981 < local2365.anInt4981) {
															local2277 = false;
														}
													}
												}
											}
											if (local2277) {
												if (local556) {
													local2268.anInt9455 = 0;
													local2268.anInt9497 = local305;
													local2268.anInt9467 = local219 & 0x7;
													local2268.anInt9482 = local292;
													local2268.anInt9477 = 1;
													local2268.anInt9523 = 0;
													local2268.anInt9468 = local210 + Static506.anInt8251;
													if (Static506.anInt8251 < local2268.anInt9468) {
														local2268.anInt9455 = -1;
													}
													if (local2268.anInt9482 != -1 && local2268.anInt9468 == Static506.anInt8251) {
														local2428 = Static368.aClass278_1.method6127(local2268.anInt9482).anInt7490;
														if (local2428 != -1) {
															local2044 = Static545.aClass240_2.method5680(local2428);
															if (local2044 != null && local2044.anIntArray280 != null) {
																Static462.method6421(false, local2268.anInt9444, local2044, local2268.aByte117, local2268.anInt9442, 0);
															}
														}
													}
												} else {
													local2268.anInt9525 = 0;
													local2268.anInt9470 = 0;
													local2268.anInt9528 = local292;
													local2268.anInt9454 = local305;
													local2268.anInt9515 = local219 & 0x7;
													local2268.anInt9498 = 1;
													local2268.anInt9459 = Static506.anInt8251 + local210;
													if (local2268.anInt9459 > Static506.anInt8251) {
														local2268.anInt9525 = -1;
													}
													if (local2268.anInt9528 != -1 && Static506.anInt8251 == local2268.anInt9459) {
														local2428 = Static368.aClass278_1.method6127(local2268.anInt9528).anInt7490;
														if (local2428 != -1) {
															local2044 = Static545.aClass240_2.method5680(local2428);
															if (local2044 != null && local2044.anIntArray280 != null) {
																Static462.method6421(false, local2268.anInt9444, local2044, local2268.aByte117, local2268.anInt9442, 0);
															}
														}
													}
												}
											}
										}
									} else if (local73 >> 28 != 0) {
										local1056 = local73 & 0xFFFF;
										@Pc(1943) Class41_Sub2_Sub1_Sub4_Sub2 local1943;
										if (local1056 == Static166.anInt3327) {
											local1943 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2;
										} else {
											local1943 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local1056];
										}
										if (local1943 != null) {
											if (local292 == 65535) {
												local292 = -1;
											}
											local1960 = true;
											local1693 = local556 ? local1943.anInt9482 : local1943.anInt9528;
											@Pc(1997) Class185 local1997;
											if (local292 != -1 && local1693 != -1) {
												@Pc(1983) Class284 local1983;
												if (local1693 == local292) {
													local1983 = Static368.aClass278_1.method6127(local292);
													if (local1983.aBoolean565 && local1983.anInt7490 != -1) {
														local1997 = Static545.aClass240_2.method5680(local1983.anInt7490);
														local2000 = local1997.anInt4978;
														if (local2000 == 0 || local2000 == 2) {
															local1960 = false;
														} else if (local2000 == 1) {
															local1960 = true;
														}
													}
												} else {
													local1983 = Static368.aClass278_1.method6127(local292);
													local2028 = Static368.aClass278_1.method6127(local1693);
													if (local1983.anInt7490 != -1 && local2028.anInt7490 != -1) {
														local2044 = Static545.aClass240_2.method5680(local1983.anInt7490);
														local2050 = Static545.aClass240_2.method5680(local2028.anInt7490);
														if (local2050.anInt4981 > local2044.anInt4981) {
															local1960 = false;
														}
													}
												}
											}
											if (local1960) {
												if (local556) {
													local1943.anInt9477 = 1;
													local1943.anInt9482 = local292;
													local1943.anInt9455 = 0;
													local1943.anInt9468 = Static506.anInt8251 + local210;
													local1943.anInt9523 = 0;
													local1943.anInt9497 = local305;
													local1943.anInt9467 = local219 & 0x7;
													if (local1943.anInt9468 > Static506.anInt8251) {
														local1943.anInt9455 = -1;
													}
													if (local1943.anInt9482 == 65535) {
														local1943.anInt9482 = -1;
													}
													if (local1943.anInt9482 != -1 && Static506.anInt8251 == local1943.anInt9468) {
														local1697 = Static368.aClass278_1.method6127(local1943.anInt9482).anInt7490;
														if (local1697 != -1) {
															local1997 = Static545.aClass240_2.method5680(local1697);
															if (local1997 != null && local1997.anIntArray280 != null) {
																Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == local1943, local1943.anInt9444, local1997, local1943.aByte117, local1943.anInt9442, 0);
															}
														}
													}
												} else {
													local1943.anInt9515 = local219 & 0x7;
													local1943.anInt9470 = 0;
													local1943.anInt9528 = local292;
													local1943.anInt9454 = local305;
													local1943.anInt9525 = 0;
													local1943.anInt9459 = local210 + Static506.anInt8251;
													local1943.anInt9498 = 1;
													if (Static506.anInt8251 < local1943.anInt9459) {
														local1943.anInt9525 = -1;
													}
													if (local1943.anInt9528 == 65535) {
														local1943.anInt9528 = -1;
													}
													if (local1943.anInt9528 != -1 && Static506.anInt8251 == local1943.anInt9459) {
														local1697 = Static368.aClass278_1.method6127(local1943.anInt9528).anInt7490;
														if (local1697 != -1) {
															local1997 = Static545.aClass240_2.method5680(local1697);
															if (local1997 != null && local1997.anIntArray280 != null) {
																Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == local1943, local1943.anInt9444, local1997, local1943.aByte117, local1943.anInt9442, 0);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local1056 = local73 >> 28 & 0x3;
									local2545 = (local73 >> 14 & 0x3FFF) - Static335.anInt5608;
									local2552 = (local73 & 0x3FFF) - Static246.anInt4344;
									if (local2545 >= 0 && local2552 >= 0 && Static54.anInt1038 > local2545 && local2552 < Static140.anInt3026) {
										local1693 = local2545 * 512 + 256;
										local1697 = local2552 * 512 + 256;
										local2428 = local1056;
										if (local1056 < 3 && Static511.method6886(local2552, local2545)) {
											local2428 = local1056 + 1;
										}
										@Pc(2619) Class41_Sub2_Sub1_Sub5 local2619 = new Class41_Sub2_Sub1_Sub5(local292, 0, Static506.anInt8251, local1056, local2428, local1693, Static475.method6537(local1697, local1056, local1693) - local305, local1697, local2545, local2545, local2552, local2552, local219 & 0x7);
										Static432.aClass112_51.method3079(new Class3_Sub7_Sub16(local2619));
									}
								}
								Static355.aClass56_123 = null;
								return true;
							} else if (Static367.aClass56_124 == Static355.aClass56_123) {
								local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
								if (Static536.method7152(local210)) {
									Static555.method7345();
								}
								Static355.aClass56_123 = null;
								return true;
							} else if (Static355.aClass56_123 == Static20.aClass56_16) {
								Static495.anInt8058 = 1;
								Static49.anInt890 = Static109.anInt2171;
								Static355.aClass56_123 = null;
								return true;
							} else if (Static355.aClass56_123 == Static127.aClass56_135) {
								local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
								local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
								local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
								local219 = Static532.aClass3_Sub11_Sub1_2.method5198();
								if (Static536.method7152(local210) && Static380.aClass361ArrayArray2[local73] != null) {
									for (local305 = local292; local305 < local219; local305++) {
										local309 = Static532.aClass3_Sub11_Sub1_2.method5230();
										if (Static380.aClass361ArrayArray2[local73].length > local305 && Static380.aClass361ArrayArray2[local73][local305] != null) {
											Static380.aClass361ArrayArray2[local73][local305].anInt9654 = local309;
										}
									}
								}
								Static355.aClass56_123 = null;
								return true;
							} else {
								@Pc(2742) boolean local2742;
								@Pc(2731) String local2731;
								@Pc(2854) Class103 local2854;
								if (Static539.aClass56_171 == Static355.aClass56_123) {
									local2731 = Static532.aClass3_Sub11_Sub1_2.method5181();
									local2742 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
									if (local2742) {
										local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
									} else {
										local538 = local2731;
									}
									local219 = Static532.aClass3_Sub11_Sub1_2.method5198();
									@Pc(2760) byte local2760 = Static532.aClass3_Sub11_Sub1_2.method5212();
									local556 = false;
									if (local2760 == -128) {
										local556 = true;
									}
									if (local556) {
										if (Static507.anInt8256 == 0) {
											Static355.aClass56_123 = null;
											return true;
										}
										for (local1056 = 0; Static507.anInt8256 > local1056 && (!Static187.aClass103Array1[local1056].aString16.equals(local538) || local219 != Static187.aClass103Array1[local1056].anInt3256); local1056++) {
										}
										if (local1056 < Static507.anInt8256) {
											while (Static507.anInt8256 - 1 > local1056) {
												Static187.aClass103Array1[local1056] = Static187.aClass103Array1[local1056 + 1];
												local1056++;
											}
											Static507.anInt8256--;
											Static187.aClass103Array1[Static507.anInt8256] = null;
										}
									} else {
										local577 = Static532.aClass3_Sub11_Sub1_2.method5181();
										local2854 = new Class103();
										local2854.aString16 = local538;
										local2854.aString17 = local2731;
										local2854.aString15 = Static131.method2611(local2854.aString16);
										local2854.anInt3256 = local219;
										local2854.aString14 = local577;
										local2854.aByte34 = local2760;
										for (local2552 = Static507.anInt8256 - 1; local2552 >= 0; local2552--) {
											local1693 = Static187.aClass103Array1[local2552].aString15.compareTo(local2854.aString15);
											if (local1693 == 0) {
												Static187.aClass103Array1[local2552].anInt3256 = local219;
												Static187.aClass103Array1[local2552].aByte34 = local2760;
												Static187.aClass103Array1[local2552].aString14 = local577;
												if (local538.equals(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95)) {
													Static492.aByte108 = local2760;
												}
												Static467.anInt7775 = Static109.anInt2171;
												Static355.aClass56_123 = null;
												return true;
											}
											if (local1693 < 0) {
												break;
											}
										}
										if (Static187.aClass103Array1.length <= Static507.anInt8256) {
											Static355.aClass56_123 = null;
											return true;
										}
										for (local1693 = Static507.anInt8256 - 1; local1693 > local2552; local1693--) {
											Static187.aClass103Array1[local1693 + 1] = Static187.aClass103Array1[local1693];
										}
										if (Static507.anInt8256 == 0) {
											Static187.aClass103Array1 = new Class103[100];
										}
										Static187.aClass103Array1[local2552 + 1] = local2854;
										Static507.anInt8256++;
										if (local538.equals(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95)) {
											Static492.aByte108 = local2760;
										}
									}
									Static355.aClass56_123 = null;
									Static467.anInt7775 = Static109.anInt2171;
									return true;
								}
								@Pc(3025) boolean local3025;
								if (Static41.aClass56_25 == Static355.aClass56_123) {
									local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
									local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
									local540 = local538;
									if (local534) {
										local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
									}
									local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
									local3025 = false;
									if (local219 <= 1) {
										if (Static297.aBoolean376 && !Static559.aBoolean709 || Static450.aBoolean734) {
											local3025 = true;
										} else if (local219 <= 1 && Static503.method6787(local540)) {
											local3025 = true;
										}
									}
									if (!local3025 && Static14.anInt285 == 0) {
										local1013 = Static261.method3998(Static338.method4802(Static532.aClass3_Sub11_Sub1_2));
										if (local219 == 2) {
											Static224.method3527(local538, "<img=1>" + local540, null, -1, "<img=1>" + local538, 24, 0, local1013);
										} else if (local219 == 1) {
											Static224.method3527(local538, "<img=0>" + local540, null, -1, "<img=0>" + local538, 24, 0, local1013);
										} else {
											Static224.method3527(local538, local540, null, -1, local538, 24, 0, local1013);
										}
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static538.aClass56_170) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5186();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
									local292 = Static532.aClass3_Sub11_Sub1_2.method5174();
									if (Static536.method7152(local73)) {
										Static293.method3978(local210, local292);
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static310.aClass56_106 == Static355.aClass56_123) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5175();
									local73 = local210 >> 5;
									local292 = local210 & 0x1F;
									if (local292 == 0) {
										Static283.aClass205Array1[local73] = null;
										Static355.aClass56_123 = null;
										return true;
									}
									@Pc(3192) Class205 local3192 = new Class205();
									local3192.anInt5477 = local292;
									local3192.anInt5471 = Static532.aClass3_Sub11_Sub1_2.method5175();
									if (local3192.anInt5471 >= 0 && local3192.anInt5471 < Static506.aClass14Array15.length) {
										if (local3192.anInt5477 == 1 || local3192.anInt5477 == 10) {
											local3192.anInt5482 = Static532.aClass3_Sub11_Sub1_2.method5198();
											Static532.aClass3_Sub11_Sub1_2.anInt6128 += 6;
										} else if (local3192.anInt5477 >= 2 && local3192.anInt5477 <= 6) {
											if (local3192.anInt5477 == 2) {
												local3192.anInt5481 = 256;
												local3192.anInt5474 = 256;
											}
											if (local3192.anInt5477 == 3) {
												local3192.anInt5481 = 0;
												local3192.anInt5474 = 256;
											}
											if (local3192.anInt5477 == 4) {
												local3192.anInt5474 = 256;
												local3192.anInt5481 = 512;
											}
											if (local3192.anInt5477 == 5) {
												local3192.anInt5481 = 256;
												local3192.anInt5474 = 0;
											}
											if (local3192.anInt5477 == 6) {
												local3192.anInt5474 = 512;
												local3192.anInt5481 = 256;
											}
											local3192.anInt5477 = 2;
											local3192.anInt5476 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local3192.anInt5481 += Static532.aClass3_Sub11_Sub1_2.method5198() - Static335.anInt5608 << 9;
											local3192.anInt5474 += Static532.aClass3_Sub11_Sub1_2.method5198() - Static246.anInt4344 << 9;
											local3192.anInt5480 = Static532.aClass3_Sub11_Sub1_2.method5175() << 2;
											local3192.anInt5473 = Static532.aClass3_Sub11_Sub1_2.method5198();
										}
										local3192.anInt5478 = Static532.aClass3_Sub11_Sub1_2.method5198();
										if (local3192.anInt5478 == 65535) {
											local3192.anInt5478 = -1;
										}
										Static283.aClass205Array1[local73] = local3192;
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static443.aClass56_141) {
									for (local210 = 0; local210 < Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1.length; local210++) {
										if (Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local210] != null) {
											Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local210].anIntArray627 = null;
											Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local210].anInt9489 = -1;
										}
									}
									for (local73 = 0; local73 < Static137.anInt2977; local73++) {
										Static441.aClass3_Sub34Array1[local73].aClass41_Sub2_Sub1_Sub4_Sub1_2.anIntArray627 = null;
										Static441.aClass3_Sub34Array1[local73].aClass41_Sub2_Sub1_Sub4_Sub1_2.anInt9489 = -1;
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static384.aClass56_128) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5228();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
									if (Static536.method7152(local73)) {
										Static545.method4206(local210, 3, -1, -1);
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static357.aClass56_119) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
									local292 = Static532.aClass3_Sub11_Sub1_2.method5205();
									local219 = Static532.aClass3_Sub11_Sub1_2.method5174();
									local305 = Static532.aClass3_Sub11_Sub1_2.method5228();
									if (Static536.method7152(local210)) {
										Static545.method4206(local305, 7, local292 | local73 << 16, local219);
									}
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static139.aClass56_66) {
									Static49.method759(Static174.aClass262_6);
									Static355.aClass56_123 = null;
									return true;
								} else if (Static164.aClass56_74 == Static355.aClass56_123) {
									local2731 = Static532.aClass3_Sub11_Sub1_2.method5181();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
									local540 = Static111.aClass149_11.method3568(local73).method2881(Static532.aClass3_Sub11_Sub1_2);
									Static224.method3527(local2731, local2731, null, local73, local2731, 19, 0, local540);
									Static355.aClass56_123 = null;
									return true;
								} else if (Static466.aClass56_154 == Static355.aClass56_123) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
									local2742 = (local73 & 0x1) == 1;
									Static204.method3344(local210, local2742);
									local219 = Static532.aClass3_Sub11_Sub1_2.method5198();
									for (local305 = 0; local305 < local219; local305++) {
										local309 = Static532.aClass3_Sub11_Sub1_2.method5206();
										if (local309 == 255) {
											local309 = Static532.aClass3_Sub11_Sub1_2.method5228();
										}
										local1056 = Static532.aClass3_Sub11_Sub1_2.method5205();
										Static484.method6598(local309, local2742, local1056 - 1, local305, local210);
									}
									Static115.anIntArray419[Static487.anInt9193++ & 0x1F] = local210;
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static421.aClass56_138) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5186();
									local73 = local210 >> 28 & 0x3;
									local292 = local210 >> 14 & 0x3FFF;
									local219 = local210 & 0x3FFF;
									local305 = Static532.aClass3_Sub11_Sub1_2.method5178();
									if (local305 == 65535) {
										local305 = -1;
									}
									local309 = Static532.aClass3_Sub11_Sub1_2.method5206();
									local1056 = local309 >> 2;
									local2545 = local309 & 0x3;
									local219 -= Static246.anInt4344;
									local292 -= Static335.anInt5608;
									local2552 = Static333.anIntArray312[local1056];
									Static348.method5133(local1056, local2552, local2545, local305, local219, local73, local292);
									Static355.aClass56_123 = null;
									return true;
								} else if (Static355.aClass56_123 == Static486.aClass56_157) {
									local210 = Static532.aClass3_Sub11_Sub1_2.method5205();
									local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
									local292 = Static532.aClass3_Sub11_Sub1_2.method5178();
									if (Static536.method7152(local210)) {
										Static228.method3542(local292, local73);
									}
									Static355.aClass56_123 = null;
									return true;
								} else {
									@Pc(3740) boolean local3740;
									if (Static319.aClass56_110 == Static355.aClass56_123) {
										while (Static292.anInt4974 > Static532.aClass3_Sub11_Sub1_2.anInt6128) {
											local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
											local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local305 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local1013 = "";
											local3740 = false;
											if (local219 > 0) {
												local1013 = Static532.aClass3_Sub11_Sub1_2.method5181();
												local3740 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
											}
											for (local2545 = 0; local2545 < Static591.anInt9675; local2545++) {
												if (local534) {
													if (local540.equals(Static22.aStringArray1[local2545])) {
														Static22.aStringArray1[local2545] = local538;
														local538 = null;
														Static91.aStringArray6[local2545] = local540;
														break;
													}
												} else if (local538.equals(Static22.aStringArray1[local2545])) {
													if (local219 != Static438.anIntArray451[local2545]) {
														local1960 = true;
														for (@Pc(3781) Class41_Sub3_Sub2 local3781 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4168(); local3781 != null; local3781 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4165()) {
															if (local3781.aString54.equals(local538)) {
																if (local219 != 0 && local3781.aShort113 == 0) {
																	local3781.method7833();
																	local1960 = false;
																} else if (local219 == 0 && local3781.aShort113 != 0) {
																	local1960 = false;
																	local3781.method7833();
																}
															}
														}
														if (local1960) {
															Static549.aClass178_22.method4166(new Class41_Sub3_Sub2(local538, local219));
														}
														Static438.anIntArray451[local2545] = local219;
													}
													Static91.aStringArray6[local2545] = local540;
													Static167.aStringArray15[local2545] = local1013;
													Static273.anIntArray260[local2545] = local305;
													local538 = null;
													Static166.aBooleanArray11[local2545] = local3740;
													break;
												}
											}
											if (local538 != null && Static591.anInt9675 < 200) {
												Static22.aStringArray1[Static591.anInt9675] = local538;
												Static91.aStringArray6[Static591.anInt9675] = local540;
												Static438.anIntArray451[Static591.anInt9675] = local219;
												Static167.aStringArray15[Static591.anInt9675] = local1013;
												Static273.anIntArray260[Static591.anInt9675] = local305;
												Static166.aBooleanArray11[Static591.anInt9675] = local3740;
												Static591.anInt9675++;
											}
										}
										Static495.anInt8058 = 2;
										Static49.anInt890 = Static109.anInt2171;
										local73 = Static591.anInt9675;
										while (local73 > 0) {
											local73--;
											local534 = true;
											for (local292 = 0; local292 < local73; local292++) {
												if (Static438.anIntArray451[local292] != Static221.aClass51_1.anInt1589 && Static221.aClass51_1.anInt1589 == Static438.anIntArray451[local292 + 1] || Static438.anIntArray451[local292] == 0 && Static438.anIntArray451[local292 + 1] != 0) {
													local219 = Static438.anIntArray451[local292];
													Static438.anIntArray451[local292] = Static438.anIntArray451[local292 + 1];
													Static438.anIntArray451[local292 + 1] = local219;
													local1009 = Static167.aStringArray15[local292];
													Static167.aStringArray15[local292] = Static167.aStringArray15[local292 + 1];
													Static167.aStringArray15[local292 + 1] = local1009;
													local1013 = Static22.aStringArray1[local292];
													Static22.aStringArray1[local292] = Static22.aStringArray1[local292 + 1];
													Static22.aStringArray1[local292 + 1] = local1013;
													local577 = Static91.aStringArray6[local292];
													Static91.aStringArray6[local292] = Static91.aStringArray6[local292 + 1];
													Static91.aStringArray6[local292 + 1] = local577;
													local2545 = Static273.anIntArray260[local292];
													Static273.anIntArray260[local292] = Static273.anIntArray260[local292 + 1];
													Static273.anIntArray260[local292 + 1] = local2545;
													local1960 = Static166.aBooleanArray11[local292];
													Static166.aBooleanArray11[local292] = Static166.aBooleanArray11[local292 + 1];
													Static166.aBooleanArray11[local292 + 1] = local1960;
													local534 = false;
												}
											}
											if (local534) {
												break;
											}
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static130.aClass56_139) {
										local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
										@Pc(4119) byte[] local4119 = new byte[Static292.anInt4974 - 1];
										Static532.aClass3_Sub11_Sub1_2.method5183(Static292.anInt4974 - 1, local4119);
										Static513.method3759(local4119, local534);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static498.aClass56_160 == Static355.aClass56_123) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
										local73 = Static532.aClass3_Sub11_Sub1_2.method5178();
										local292 = Static532.aClass3_Sub11_Sub1_2.method5174();
										local219 = Static532.aClass3_Sub11_Sub1_2.method5229();
										if (Static536.method7152(local292)) {
											Static58.method1200(local219, (local73 << 16) + local210);
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static12.aClass56_152) {
										if (Static353.anInt6188 != -1) {
											Static556.method7355(Static353.anInt6188, 0);
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static584.aClass56_178) {
										Static49.method759(Static168.aClass262_5);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static184.aClass56_76 == Static355.aClass56_123) {
										Static467.anInt7775 = Static109.anInt2171;
										if (Static292.anInt4974 == 0) {
											Static507.anInt8256 = 0;
											Static138.aString13 = null;
											Static107.aString10 = null;
											Static355.aClass56_123 = null;
											Static187.aClass103Array1 = null;
											return true;
										}
										Static107.aString10 = Static532.aClass3_Sub11_Sub1_2.method5181();
										local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
										if (local534) {
											Static532.aClass3_Sub11_Sub1_2.method5181();
										}
										@Pc(4238) long local4238 = Static532.aClass3_Sub11_Sub1_2.method5226();
										Static138.aString13 = Static596.method7952(local4238);
										Static7.aByte35 = Static532.aClass3_Sub11_Sub1_2.method5212();
										local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
										if (local219 == 255) {
											Static355.aClass56_123 = null;
											return true;
										}
										Static507.anInt8256 = local219;
										@Pc(4262) Class103[] local4262 = new Class103[100];
										for (local309 = 0; local309 < Static507.anInt8256; local309++) {
											local4262[local309] = new Class103();
											local4262[local309].aString17 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
											if (local534) {
												local4262[local309].aString16 = Static532.aClass3_Sub11_Sub1_2.method5181();
											} else {
												local4262[local309].aString16 = local4262[local309].aString17;
											}
											local4262[local309].aString15 = Static131.method2611(local4262[local309].aString16);
											local4262[local309].anInt3256 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local4262[local309].aByte34 = Static532.aClass3_Sub11_Sub1_2.method5212();
											local4262[local309].aString14 = Static532.aClass3_Sub11_Sub1_2.method5181();
											if (local4262[local309].aString16.equals(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95)) {
												Static492.aByte108 = local4262[local309].aByte34;
											}
										}
										local2552 = Static507.anInt8256;
										while (local2552 > 0) {
											local3740 = true;
											local2552--;
											for (local1693 = 0; local1693 < local2552; local1693++) {
												if (local4262[local1693].aString15.compareTo(local4262[local1693 + 1].aString15) > 0) {
													local2854 = local4262[local1693];
													local4262[local1693] = local4262[local1693 + 1];
													local3740 = false;
													local4262[local1693 + 1] = local2854;
												}
											}
											if (local3740) {
												break;
											}
										}
										Static355.aClass56_123 = null;
										Static187.aClass103Array1 = local4262;
										return true;
									} else if (Static355.aClass56_123 == Static554.aClass56_174) {
										Static355.aClass56_123 = null;
										return false;
									} else if (Static87.aClass56_111 == Static355.aClass56_123) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5217();
										local73 = Static532.aClass3_Sub11_Sub1_2.method5186();
										local292 = Static532.aClass3_Sub11_Sub1_2.method5175();
										local679 = "";
										local1009 = local679;
										if ((local292 & 0x1) != 0) {
											local679 = Static532.aClass3_Sub11_Sub1_2.method5181();
											if ((local292 & 0x2) == 0) {
												local1009 = local679;
											} else {
												local1009 = Static532.aClass3_Sub11_Sub1_2.method5181();
											}
										}
										local1013 = Static532.aClass3_Sub11_Sub1_2.method5181();
										if (local210 == 99) {
											Static359.method5539(local1013);
										} else if (local1009.equals("") || !Static503.method6787(local1009)) {
											Static180.method3112(local1013, local679, local1009, local73, local210, local679);
										} else {
											Static355.aClass56_123 = null;
											return true;
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static5.aClass56_11) {
										Static49.method759(Static134.aClass262_4);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static309.aClass56_104 == Static355.aClass56_123) {
										Static49.method759(Static39.aClass262_1);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static47.aClass56_176) {
										local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
										local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
										local540 = local538;
										if (local534) {
											local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
										}
										local1679 = Static532.aClass3_Sub11_Sub1_2.method5198();
										local1684 = Static532.aClass3_Sub11_Sub1_2.method5230();
										local2545 = Static532.aClass3_Sub11_Sub1_2.method5175();
										@Pc(4575) long local4575 = (local1679 << 32) + local1684;
										@Pc(4577) boolean local4577 = false;
										local2428 = 0;
										while (true) {
											if (local2428 >= 100) {
												if (local2545 <= 1) {
													if (Static297.aBoolean376 && !Static559.aBoolean709 || Static450.aBoolean734) {
														local4577 = true;
													} else if (Static503.method6787(local540)) {
														local4577 = true;
													}
												}
												break;
											}
											if (Static340.aLongArray10[local2428] == local4575) {
												local4577 = true;
												break;
											}
											local2428++;
										}
										if (!local4577 && Static14.anInt285 == 0) {
											Static340.aLongArray10[Static391.anInt6858] = local4575;
											Static391.anInt6858 = (Static391.anInt6858 + 1) % 100;
											@Pc(4645) String local4645 = Static261.method3998(Static338.method4802(Static532.aClass3_Sub11_Sub1_2));
											if (local2545 == 2) {
												Static224.method3527(local538, "<img=1>" + local540, null, -1, "<img=1>" + local538, 7, 0, local4645);
											} else if (local2545 == 1) {
												Static224.method3527(local538, "<img=0>" + local540, null, -1, "<img=0>" + local538, 7, 0, local4645);
											} else {
												Static224.method3527(local538, local540, null, -1, local538, 3, 0, local4645);
											}
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static90.aClass56_49) {
										Static572.anInt9292 = Static532.aClass3_Sub11_Sub1_2.method5204();
										Static475.anInt7863 = Static532.aClass3_Sub11_Sub1_2.method5185();
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static40.aClass56_24) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
										if (local210 == 65535) {
											local210 = -1;
										}
										local73 = Static532.aClass3_Sub11_Sub1_2.method5228();
										local292 = Static532.aClass3_Sub11_Sub1_2.method5174();
										if (Static536.method7152(local292)) {
											Static545.method4206(local73, 1, local210, -1);
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static390.aClass56_130 == Static355.aClass56_123) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
										local73 = Static532.aClass3_Sub11_Sub1_2.method5205();
										@Pc(4779) byte local4779 = Static532.aClass3_Sub11_Sub1_2.method5212();
										if (Static536.method7152(local210)) {
											Static293.method3978(local4779, local73);
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static68.aClass56_41 == Static355.aClass56_123) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5186();
										Static446.aClass39_5 = Static237.aClass258_3.method5893(local210);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static236.aClass56_86) {
										Static49.method759(Static478.aClass262_16);
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static118.aClass56_59) {
										local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
										local73 = Static532.aClass3_Sub11_Sub1_2.method5228();
										local292 = Static532.aClass3_Sub11_Sub1_2.method5205();
										if (Static536.method7152(local292)) {
											Static509.method6877(local73, local210);
										}
										Static355.aClass56_123 = null;
										return true;
									} else if (Static355.aClass56_123 == Static73.aClass56_45) {
										Static117.method2415();
										Static355.aClass56_123 = null;
										return true;
									} else {
										@Pc(4913) Class3_Sub36 local4913;
										@Pc(4907) long local4907;
										@Pc(4922) Class3_Sub36 local4922;
										if (Static355.aClass56_123 == Static93.aClass56_50) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
											if (local210 == 65535) {
												local210 = -1;
											}
											local73 = Static532.aClass3_Sub11_Sub1_2.method5219();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5178();
											if (local292 == 65535) {
												local292 = -1;
											}
											local219 = Static532.aClass3_Sub11_Sub1_2.method5178();
											local305 = Static532.aClass3_Sub11_Sub1_2.method5174();
											if (Static536.method7152(local305)) {
												for (local309 = local292; local309 <= local210; local309++) {
													local4907 = ((long) local73 << 32) + ((long) local309);
													local4913 = (Class3_Sub36) Static134.aClass354_11.method7689(local4907);
													if (local4913 != null) {
														local4922 = new Class3_Sub36(local4913.anInt6063, local219);
														local4913.method7825();
													} else if (local309 == -1) {
														local4922 = new Class3_Sub36(Static265.method4040(local73).aClass3_Sub36_2.anInt6063, local219);
													} else {
														local4922 = new Class3_Sub36(0, local219);
													}
													Static134.aClass354_11.method7691(local4922, local4907);
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static309.aClass56_103 == Static355.aClass56_123) {
											Static579.anInt9370 = Static532.aClass3_Sub11_Sub1_2.method5175();
											for (local210 = 0; local210 < Static579.anInt9370; local210++) {
												Static483.aStringArray33[local210] = Static532.aClass3_Sub11_Sub1_2.method5181();
												Static189.aStringArray16[local210] = Static532.aClass3_Sub11_Sub1_2.method5181();
												if (Static189.aStringArray16[local210].equals("")) {
													Static189.aStringArray16[local210] = Static483.aStringArray33[local210];
												}
												Static527.aStringArray36[local210] = Static532.aClass3_Sub11_Sub1_2.method5181();
												Static119.aStringArray8[local210] = Static532.aClass3_Sub11_Sub1_2.method5181();
												if (Static119.aStringArray8[local210].equals("")) {
													Static119.aStringArray8[local210] = Static527.aStringArray36[local210];
												}
												Static160.aBooleanArray10[local210] = false;
											}
											Static49.anInt890 = Static109.anInt2171;
											Static355.aClass56_123 = null;
											return true;
										} else if (Static427.aClass56_142 == Static355.aClass56_123) {
											Static49.method759(Static439.aClass262_14);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static273.aClass56_96) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5204();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5178();
											if (Static536.method7152(local73)) {
												Static501.anInt8125 = local210;
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static300.aClass56_100) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5228();
											if (Static536.method7152(local210)) {
												Static225.method3532(local73, local292);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static451.aClass56_151 == Static355.aClass56_123) {
											local2731 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5219();
											if (Static536.method7152(local73)) {
												Static301.method4556(local2731, local292);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static380.aClass56_126) {
											Static49.method759(Static564.aClass262_18);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static311.aClass56_107) {
											local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
											local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local540 = local538;
											if (local534) {
												local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
											}
											local1679 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local1684 = Static532.aClass3_Sub11_Sub1_2.method5230();
											local2545 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local2552 = Static532.aClass3_Sub11_Sub1_2.method5198();
											@Pc(5181) long local5181 = local1684 + (local1679 << 32);
											@Pc(5183) boolean local5183 = false;
											local2000 = 0;
											while (true) {
												if (local2000 >= 100) {
													if (local2545 <= 1 && Static503.method6787(local540)) {
														local5183 = true;
													}
													break;
												}
												if (local5181 == Static340.aLongArray10[local2000]) {
													local5183 = true;
													break;
												}
												local2000++;
											}
											if (!local5183 && Static14.anInt285 == 0) {
												Static340.aLongArray10[Static391.anInt6858] = local5181;
												Static391.anInt6858 = (Static391.anInt6858 + 1) % 100;
												@Pc(5240) String local5240 = Static111.aClass149_11.method3568(local2552).method2881(Static532.aClass3_Sub11_Sub1_2);
												if (local2545 == 2) {
													Static224.method3527(local538, "<img=1>" + local540, null, local2552, "<img=1>" + local538, 18, 0, local5240);
												} else if (local2545 == 1) {
													Static224.method3527(local538, "<img=0>" + local540, null, local2552, "<img=0>" + local538, 18, 0, local5240);
												} else {
													Static224.method3527(local538, local540, null, local2552, local538, 18, 0, local5240);
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static368.aClass56_125 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5206();
											if (local210 == 255) {
												local73 = -1;
												local210 = -1;
											}
											Static164.method2982(local210, local73);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static152.aClass56_71) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5229();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
											Static491.aClass318_1.method6748(local73, local210);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static150.aClass56_70 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (Static536.method7152(local210)) {
												Static154.method2914();
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static287.aClass56_132 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5204();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5206();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5228();
											Static143.anIntArray141[local210] = local292;
											Static135.anIntArray134[local210] = local73;
											Static320.anIntArray308[local210] = 1;
											local219 = Static403.anIntArray429[local210] - 1;
											for (local305 = 0; local305 < local219; local305++) {
												if (Class167.anIntArray251[local305] <= local292) {
													Static320.anIntArray308[local210] = local305 + 2;
												}
											}
											Static572.anIntArray596[Static319.anInt5433++ & 0x1F] = local210;
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static574.aClass56_175) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5228();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (Static536.method7152(local73)) {
												Static545.method4206(local210, 5, Static166.anInt3327, 0);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static517.aClass56_163 == Static355.aClass56_123) {
											local2731 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local538 = Static261.method3998(Static338.method4802(Static532.aClass3_Sub11_Sub1_2));
											Static180.method3112(local538, local2731, local2731, 0, 6, local2731);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static113.aClass56_56) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5205();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5229();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5205();
											if (Static536.method7152(local73)) {
												local1125 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local292);
												if (local1125 != null) {
													Static250.method3868(local1125, false, local219 != local1125.anInt8836);
												}
												Static406.method5861(local219, false, local210, local292);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static391.aClass56_131) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local2742 = (local73 & 0x1) == 1;
											while (Static292.anInt4974 > Static532.aClass3_Sub11_Sub1_2.anInt6128) {
												local219 = Static532.aClass3_Sub11_Sub1_2.method5217();
												local305 = Static532.aClass3_Sub11_Sub1_2.method5198();
												local309 = 0;
												if (local305 != 0) {
													local309 = Static532.aClass3_Sub11_Sub1_2.method5175();
													if (local309 == 255) {
														local309 = Static532.aClass3_Sub11_Sub1_2.method5186();
													}
												}
												Static484.method6598(local309, local2742, local305 - 1, local219, local210);
											}
											Static115.anIntArray419[Static487.anInt9193++ & 0x1F] = local210;
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static228.aClass56_83) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5178();
											@Pc(5647) byte local5647 = Static532.aClass3_Sub11_Sub1_2.method5173();
											Static491.aClass318_1.method6748(local210, local5647);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static294.aClass56_148) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5219();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5205();
											local305 = Static532.aClass3_Sub11_Sub1_2.method5205();
											if (Static536.method7152(local219)) {
												Static463.method6428(local210, local292, local305, local73);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static56.aClass56_37 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5206();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (local73 == 65535) {
												local73 = -1;
											}
											local292 = Static532.aClass3_Sub11_Sub1_2.method5204();
											Static179.method3105(local292, local210, local73);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static337.aClass56_113 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
											if (local210 == 65535) {
												local210 = -1;
											}
											local73 = Static532.aClass3_Sub11_Sub1_2.method5195();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5206();
											Static581.method6767(local73, local210, local292);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static11.aClass56_13 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5204();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5205();
											Static491.aClass318_1.method6737(local73, local210);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static85.aClass56_47) {
											Static49.method759(Static400.aClass262_12);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static587.aClass56_179 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5228();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5174();
											if (Static536.method7152(local73)) {
												if (local210 == -1) {
													Static18.anInt314 = -1;
													Static391.anInt6856 = -1;
												} else {
													local292 = local210 >> 14 & 0x3FFF;
													local219 = local210 & 0x3FFF;
													local292 -= Static335.anInt5608;
													local219 -= Static246.anInt4344;
													if (local292 < 0) {
														local292 = 0;
													} else if (local292 >= Static54.anInt1038) {
														local292 = Static54.anInt1038;
													}
													Static18.anInt314 = (local292 << 9) + 256;
													if (local219 < 0) {
														local219 = 0;
													} else if (local219 >= Static140.anInt3026) {
														local219 = Static140.anInt3026;
													}
													Static391.anInt6856 = (local219 << 9) + 256;
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static290.aClass56_177) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5205();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5205();
											if (Static536.method7152(local292)) {
												if (local73 == 2) {
													Static139.method2700();
												}
												Static353.anInt6188 = local210;
												Static397.method5786(local210);
												Static101.method1867(false);
												Static312.method4561(Static353.anInt6188);
												for (local219 = 0; local219 < 100; local219++) {
													Static319.aBooleanArray17[local219] = true;
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static326.aClass56_112 == Static355.aClass56_123) {
											Static70.anInt1593 = Static532.aClass3_Sub11_Sub1_2.method5175();
											Static330.anInt5543 = Static109.anInt2171;
											Static355.aClass56_123 = null;
											return true;
										} else if (Static317.aClass56_109 == Static355.aClass56_123) {
											Static183.aClass122_3 = Static359.method5542(Static532.aClass3_Sub11_Sub1_2.method5175());
											Static355.aClass56_123 = null;
											return true;
										} else if (Static271.aClass56_95 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (local210 == 65535) {
												local210 = -1;
											}
											local73 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
											Static39.method648(local219, local292, local210, local73, true);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static418.aClass56_137) {
											Static49.method759(Static506.aClass262_17);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static253.aClass56_88 == Static355.aClass56_123) {
											Static253.method3899();
											Static355.aClass56_123 = null;
											return false;
										} else if (Static355.aClass56_123 == Static6.aClass56_12) {
											local534 = Static532.aClass3_Sub11_Sub1_2.method5175() == 1;
											local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
											local540 = local538;
											if (local534) {
												local540 = Static532.aClass3_Sub11_Sub1_2.method5181();
											}
											local1679 = Static532.aClass3_Sub11_Sub1_2.method5226();
											local1684 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local1689 = Static532.aClass3_Sub11_Sub1_2.method5230();
											local1693 = Static532.aClass3_Sub11_Sub1_2.method5175();
											@Pc(6048) long local6048 = local1689 + (local1684 << 32);
											@Pc(6050) boolean local6050 = false;
											local2316 = 0;
											while (true) {
												if (local2316 >= 100) {
													if (local1693 <= 1) {
														if (Static297.aBoolean376 && !Static559.aBoolean709 || Static450.aBoolean734) {
															local6050 = true;
														} else if (Static503.method6787(local540)) {
															local6050 = true;
														}
													}
													break;
												}
												if (Static340.aLongArray10[local2316] == local6048) {
													local6050 = true;
													break;
												}
												local2316++;
											}
											if (!local6050 && Static14.anInt285 == 0) {
												Static340.aLongArray10[Static391.anInt6858] = local6048;
												Static391.anInt6858 = (Static391.anInt6858 + 1) % 100;
												@Pc(6116) String local6116 = Static261.method3998(Static338.method4802(Static532.aClass3_Sub11_Sub1_2));
												if (local1693 == 2 || local1693 == 3) {
													Static224.method3527(local538, "<img=1>" + local540, Static410.method5910(local1679), -1, "<img=1>" + local538, 9, 0, local6116);
												} else if (local1693 == 1) {
													Static224.method3527(local538, "<img=0>" + local540, Static410.method5910(local1679), -1, "<img=0>" + local538, 9, 0, local6116);
												} else {
													Static224.method3527(local538, local540, Static410.method5910(local1679), -1, local538, 9, 0, local6116);
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static34.aClass56_21) {
											if (Static376.aFrame4 != null) {
												Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
											}
											@Pc(6210) byte[] local6210 = new byte[Static292.anInt4974];
											Static532.aClass3_Sub11_Sub1_2.method1386(local6210, Static292.anInt4974);
											local538 = Static296.method4398(0, Static292.anInt4974, local6210);
											Static515.method2749(true, Static237.aClass258_3, local538, Static60.anInt1312 == 1);
											Static355.aClass56_123 = null;
											return true;
										} else if (Static45.aClass56_27 == Static355.aClass56_123) {
											Static326.method4711(Static241.aBoolean317);
											Static355.aClass56_123 = null;
											return false;
										} else if (Static355.aClass56_123 == Static28.aClass56_17) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5186();
											if (Static536.method7152(local210)) {
												@Pc(6269) Class3_Sub49 local6269 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local73);
												if (local6269 != null) {
													Static250.method3868(local6269, false, true);
												}
												if (Static19.aClass361_1 != null) {
													Static186.method3170(Static19.aClass361_1);
													Static19.aClass361_1 = null;
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static225.aClass56_82) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5182();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5220();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5228();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (Static536.method7152(local219)) {
												Static176.method3087(local292, local210, local73);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static54.aClass56_33 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5174();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5185();
											local2742 = (local73 & 0x1) == 1;
											Static532.method7103(local2742, local210);
											Static115.anIntArray419[Static487.anInt9193++ & 0x1F] = local210;
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static551.aClass56_173) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5182();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local292 = Static532.aClass3_Sub11_Sub1_2.method5186();
											if (Static536.method7152(local73)) {
												Static568.method7643(local292, local210);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static355.aClass56_123 == Static139.aClass56_67) {
											Static503.anInt8177 = Static532.aClass3_Sub11_Sub1_2.method5175();
											Static355.aClass56_123 = null;
											return true;
										} else if (Static526.aClass56_164 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5228();
											local73 = Static532.aClass3_Sub11_Sub1_2.method5198();
											if (local73 == 65535) {
												local73 = -1;
											}
											local292 = Static532.aClass3_Sub11_Sub1_2.method5228();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5178();
											if (local219 == 65535) {
												local219 = -1;
											}
											local305 = Static532.aClass3_Sub11_Sub1_2.method5178();
											if (Static536.method7152(local305)) {
												for (local309 = local73; local309 <= local219; local309++) {
													local4907 = ((long) local292 << 32) + ((long) local309);
													local4913 = (Class3_Sub36) Static134.aClass354_11.method7689(local4907);
													if (local4913 != null) {
														local4922 = new Class3_Sub36(local210, local4913.anInt6062);
														local4913.method7825();
													} else if (local309 == -1) {
														local4922 = new Class3_Sub36(local210, Static265.method4040(local292).aClass3_Sub36_2.anInt6062);
													} else {
														local4922 = new Class3_Sub36(local210, -1);
													}
													Static134.aClass354_11.method7691(local4922, local4907);
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static294.aClass56_149 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local538 = Static532.aClass3_Sub11_Sub1_2.method5181();
											@Pc(6529) Object[] local6529 = new Object[local538.length() + 1];
											for (local219 = local538.length() - 1; local219 >= 0; local219--) {
												if (local538.charAt(local219) == 's') {
													local6529[local219 + 1] = Static532.aClass3_Sub11_Sub1_2.method5181();
												} else {
													local6529[local219 + 1] = Integer.valueOf(Static532.aClass3_Sub11_Sub1_2.method5186());
												}
											}
											local6529[0] = Integer.valueOf(Static532.aClass3_Sub11_Sub1_2.method5186());
											if (Static536.method7152(local210)) {
												@Pc(6584) Class3_Sub32 local6584 = new Class3_Sub32();
												local6584.anObjectArray1 = local6529;
												Static312.method4566(local6584);
											}
											Static355.aClass56_123 = null;
											return true;
										} else if (Static314.aClass56_108 == Static355.aClass56_123) {
											Static280.method4135();
											Static355.aClass56_123 = null;
											return true;
										} else if (Static302.aClass56_101 == Static355.aClass56_123) {
											local210 = Static532.aClass3_Sub11_Sub1_2.method5198();
											@Pc(6614) Class41_Sub2_Sub1_Sub4_Sub2 local6614;
											if (Static166.anInt3327 == local210) {
												local6614 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2;
											} else {
												local6614 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local210];
											}
											if (local6614 == null) {
												Static355.aClass56_123 = null;
												return true;
											}
											local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
											local219 = Static532.aClass3_Sub11_Sub1_2.method5175();
											local3025 = (local292 & 0x8000) != 0;
											if (local6614.aString95 != null && local6614.aClass78_1 != null) {
												local556 = false;
												if (local219 <= 1) {
													if (!local3025 && (Static297.aBoolean376 && !Static559.aBoolean709 || Static450.aBoolean734)) {
														local556 = true;
													} else if (Static503.method6787(local6614.aString95)) {
														local556 = true;
													}
												}
												if (!local556 && Static14.anInt285 == 0) {
													local2545 = -1;
													if (local3025) {
														local292 &= 0x7FFF;
														@Pc(6690) Class282 local6690 = Static195.method3273(Static532.aClass3_Sub11_Sub1_2);
														local2545 = local6690.anInt7422;
														local577 = local6690.aClass3_Sub7_Sub10_1.method2881(Static532.aClass3_Sub11_Sub1_2);
													} else {
														local577 = Static261.method3998(Static338.method4802(Static532.aClass3_Sub11_Sub1_2));
													}
													local6614.aString94 = local577.trim();
													local6614.anInt9495 = local292 >> 8;
													local6614.anInt9475 = local292 & 0xFF;
													local6614.anInt9494 = 150;
													if (local219 == 1 || local219 == 2) {
														local2552 = local3025 ? 17 : 1;
													} else {
														local2552 = local3025 ? 17 : 2;
													}
													if (local219 == 2) {
														Static224.method3527(local6614.aString96, "<img=1>" + local6614.method7879(), null, local2545, "<img=1>" + local6614.method7884(), local2552, 0, local577);
													} else if (local219 == 1) {
														Static224.method3527(local6614.aString96, "<img=0>" + local6614.method7879(), null, local2545, "<img=0>" + local6614.method7884(), local2552, 0, local577);
													} else {
														Static224.method3527(local6614.aString96, local6614.method7879(), null, local2545, local6614.method7884(), local2552, 0, local577);
													}
												}
											}
											Static355.aClass56_123 = null;
											return true;
										} else {
											Static172.method7826(null, "T1 - " + (Static355.aClass56_123 == null ? -1 : Static355.aClass56_123.method1571()) + "," + (Static399.aClass56_133 == null ? -1 : Static399.aClass56_133.method1571()) + "," + (Static466.aClass56_155 == null ? -1 : Static466.aClass56_155.method1571()) + " - " + Static292.anInt4974);
											Static326.method4711(false);
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
