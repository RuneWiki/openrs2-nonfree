import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!hf;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public static int anInt5843;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[Lclient!ms;")
	public static Class9_Sub5[] aClass9_Sub5Array1;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
	public static final int[] anIntArray423 = new int[2048];

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method5102(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0, 9);
		local14.method9260();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!pka;B)Z")
	public static boolean method5104(@OriginalArg(0) Class292 arg0) throws IOException {
		@Pc(8) Class118 local8 = arg0.aClass118_2;
		@Pc(11) Class3_Sub2_Sub1 local11 = arg0.aClass3_Sub2_Sub1_2;
		if (local8 == null) {
			return false;
		}
		@Pc(100) int local100;
		if (arg0.aClass397_131 == null) {
			if (arg0.aBoolean536) {
				if (!local8.method7795(1)) {
					return false;
				}
				local8.method7796(1, arg0.aClass3_Sub2_Sub1_2.aByteArray20, 0);
				arg0.anInt8017++;
				arg0.anInt8011 = 0;
				arg0.aBoolean536 = false;
			}
			local11.anInt2178 = 0;
			if (local11.method224()) {
				if (!local8.method7795(1)) {
					return false;
				}
				local8.method7796(1, arg0.aClass3_Sub2_Sub1_2.aByteArray20, 1);
				arg0.anInt8011 = 0;
				arg0.anInt8017++;
			}
			arg0.aBoolean536 = true;
			@Pc(96) Class397[] local96 = Static368.method5069();
			local100 = local11.method218();
			if (local100 < 0 || local100 >= local96.length) {
				throw new IOException("invo:" + local100 + " ip:" + local11.anInt2178);
			}
			arg0.aClass397_131 = local96[local100];
			arg0.anInt8012 = arg0.aClass397_131.anInt10976;
		}
		if (arg0.anInt8012 == -1) {
			if (!local8.method7795(1)) {
				return false;
			}
			local8.method7796(1, local11.aByteArray20, 0);
			arg0.anInt8011 = 0;
			arg0.anInt8012 = local11.aByteArray20[0] & 0xFF;
			arg0.anInt8017++;
		}
		if (arg0.anInt8012 == -2) {
			if (!local8.method7795(2)) {
				return false;
			}
			local8.method7796(2, local11.aByteArray20, 0);
			local11.anInt2178 = 0;
			arg0.anInt8012 = local11.method2028(-14795);
			arg0.anInt8017 += 2;
			arg0.anInt8011 = 0;
		}
		if (arg0.anInt8012 > 0) {
			if (!local8.method7795(arg0.anInt8012)) {
				return false;
			}
			local11.anInt2178 = 0;
			local8.method7796(arg0.anInt8012, local11.aByteArray20, 0);
			arg0.anInt8017 += arg0.anInt8012;
			arg0.anInt8011 = 0;
		}
		arg0.aClass397_133 = arg0.aClass397_130;
		arg0.aClass397_130 = arg0.aClass397_132;
		arg0.aClass397_132 = arg0.aClass397_131;
		@Pc(293) String local293;
		@Pc(303) long local303;
		@Pc(308) long local308;
		@Pc(327) int local327;
		@Pc(287) boolean local287;
		@Pc(291) String local291;
		@Pc(317) int local317;
		@Pc(313) long local313;
		@Pc(323) long local323;
		@Pc(325) boolean local325;
		@Pc(410) String local410;
		if (Static234.aClass397_60 == arg0.aClass397_131) {
			local287 = local11.method2048(255) == 1;
			local291 = local11.method2014();
			local293 = local291;
			if (local287) {
				local293 = local11.method2014();
			}
			local303 = local11.method2063();
			local308 = (long) local11.method2028(-14795);
			local313 = (long) local11.method2061();
			local317 = local11.method2048(255);
			local323 = local313 + (local308 << 32);
			local325 = false;
			local327 = 0;
			while (true) {
				if (local327 >= 100) {
					if (local317 <= 1) {
						if (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293) {
							local325 = true;
						} else if (Static543.method7194(local293, (byte) -33)) {
							local325 = true;
						}
					}
					break;
				}
				if (local323 == Static161.aLongArray11[local327]) {
					local325 = true;
					break;
				}
				local327++;
			}
			if (!local325 && Static502.anInt8004 == 0) {
				Static161.aLongArray11[Static366.anInt5736] = local323;
				Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
				local410 = Static411.method5495(-4712, Static206.method3543(local11));
				if (local317 == 2 || local317 == 3) {
					Static169.method2734(local291, local410, Static329.method4760(local303), 9, "<img=1>" + local293, "<img=1>" + local291, -1, 0);
				} else if (local317 == 1) {
					Static169.method2734(local291, local410, Static329.method4760(local303), 9, "<img=0>" + local293, "<img=0>" + local291, -1, 0);
				} else {
					Static169.method2734(local291, local410, Static329.method4760(local303), 9, local293, local291, -1, 0);
				}
			}
			arg0.aClass397_131 = null;
			return true;
		} else if (Static444.aClass397_109 == arg0.aClass397_131) {
			Static605.method7770(Static64.aClass344_1);
			arg0.aClass397_131 = null;
			return true;
		} else {
			@Pc(531) int local531;
			@Pc(539) int local539;
			@Pc(549) Class3_Sub20 local549;
			if (Static481.aClass397_120 == arg0.aClass397_131) {
				local531 = local11.method2048(255);
				local100 = local11.method2029();
				local539 = local11.method2069();
				Static579.method7513();
				local549 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local539);
				if (local549 != null) {
					Static46.method1229(local549.anInt2493 != local100, false, local549);
				}
				Static217.method3247(local531, local539, false, local100);
				arg0.aClass397_131 = null;
				return true;
			}
			@Pc(616) int local616;
			if (arg0.aClass397_131 == Static535.aClass397_180) {
				local531 = local11.method2028(-14795);
				Static238.anInt3790 = local531;
				Static103.anInt2245 = 1;
				Static66.anInt1578 = -1;
				Static160.aClass182_41.method3964(Static238.anInt3790);
				local100 = local11.method2028(-14795);
				Static309.anIntArrayArray22 = new int[local100][4];
				for (local539 = 0; local539 < local100; local539++) {
					for (local616 = 0; local616 < 4; local616++) {
						Static309.anIntArrayArray22[local539][local616] = local11.method2036();
					}
				}
				local616 = local11.method2048(255);
				Static557.aClass3_Sub2_7 = new Class3_Sub2(local616);
				Static557.aClass3_Sub2_7.method2068(local11.anInt2178, local616, local11.aByteArray20);
				local11.anInt2178 += local616;
				arg0.aClass397_131 = null;
				return false;
			}
			@Pc(709) int local709;
			@Pc(787) boolean local787;
			@Pc(1145) boolean local1145;
			@Pc(721) boolean local721;
			@Pc(1091) String local1091;
			@Pc(723) String local723;
			@Pc(725) boolean local725;
			@Pc(745) int local745;
			@Pc(1055) String local1055;
			@Pc(966) boolean local966;
			if (arg0.aClass397_131 == Static303.aClass397_81) {
				while (local11.anInt2178 < arg0.anInt8012) {
					local287 = local11.method2048(255) == 1;
					local291 = local11.method2014();
					local293 = local11.method2014();
					local616 = local11.method2028(-14795);
					local709 = local11.method2048(255);
					local721 = local11.method2048(255) == 1;
					local723 = "";
					local725 = false;
					if (local616 > 0) {
						local723 = local11.method2014();
						local725 = local11.method2048(255) == 1;
					}
					for (local745 = 0; local745 < Static544.anInt9946; local745++) {
						if (local287) {
							if (local293.equals(Static636.aStringArray41[local745])) {
								Static636.aStringArray41[local745] = local291;
								local291 = null;
								Static61.aStringArray3[local745] = local293;
								break;
							}
						} else if (local291.equals(Static636.aStringArray41[local745])) {
							if (local616 != Static113.anIntArray135[local745]) {
								local787 = true;
								for (@Pc(792) Class9_Sub2_Sub2 local792 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7195(); local792 != null; local792 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7188()) {
									if (local792.aString42.equals(local291)) {
										if (local616 != 0 && local792.aShort41 == 0) {
											local787 = false;
											local792.method9182();
										} else if (local616 == 0 && local792.aShort41 != 0) {
											local792.method9182();
											local787 = false;
										}
									}
								}
								if (local787) {
									Static187.aClass319_3.method7196(new Class9_Sub2_Sub2(local291, local616));
								}
								Static113.anIntArray135[local745] = local616;
							}
							Static61.aStringArray3[local745] = local293;
							Static95.aStringArray7[local745] = local723;
							Static543.anIntArray608[local745] = local709;
							Static241.aBooleanArray8[local745] = local725;
							local291 = null;
							Static560.aBooleanArray34[local745] = local721;
							break;
						}
					}
					if (local291 != null && Static544.anInt9946 < 200) {
						Static636.aStringArray41[Static544.anInt9946] = local291;
						Static61.aStringArray3[Static544.anInt9946] = local293;
						Static113.anIntArray135[Static544.anInt9946] = local616;
						Static95.aStringArray7[Static544.anInt9946] = local723;
						Static543.anIntArray608[Static544.anInt9946] = local709;
						Static241.aBooleanArray8[Static544.anInt9946] = local725;
						Static560.aBooleanArray34[Static544.anInt9946] = local721;
						Static544.anInt9946++;
					}
				}
				Static134.anInt2600 = 2;
				Static507.anInt8071 = Static475.anInt7494;
				local100 = Static544.anInt9946;
				while (local100 > 0) {
					local287 = true;
					local100--;
					for (local539 = 0; local539 < local100; local539++) {
						local966 = false;
						if (Static226.aClass43_3.anInt1402 != Static113.anIntArray135[local539] && Static113.anIntArray135[local539 + 1] == Static226.aClass43_3.anInt1402) {
							local966 = true;
						}
						if (!local966 && Static113.anIntArray135[local539] == 0 && Static113.anIntArray135[local539 + 1] != 0) {
							local966 = true;
						}
						if (!local966 && !Static560.aBooleanArray34[local539] && Static560.aBooleanArray34[local539 + 1]) {
							local966 = true;
						}
						if (local966) {
							local709 = Static113.anIntArray135[local539];
							Static113.anIntArray135[local539] = Static113.anIntArray135[local539 + 1];
							Static113.anIntArray135[local539 + 1] = local709;
							local1055 = Static95.aStringArray7[local539];
							Static95.aStringArray7[local539] = Static95.aStringArray7[local539 + 1];
							Static95.aStringArray7[local539 + 1] = local1055;
							local723 = Static636.aStringArray41[local539];
							Static636.aStringArray41[local539] = Static636.aStringArray41[local539 + 1];
							Static636.aStringArray41[local539 + 1] = local723;
							local1091 = Static61.aStringArray3[local539];
							Static61.aStringArray3[local539] = Static61.aStringArray3[local539 + 1];
							Static61.aStringArray3[local539 + 1] = local1091;
							local745 = Static543.anIntArray608[local539];
							Static543.anIntArray608[local539] = Static543.anIntArray608[local539 + 1];
							Static543.anIntArray608[local539 + 1] = local745;
							local787 = Static241.aBooleanArray8[local539];
							Static241.aBooleanArray8[local539] = Static241.aBooleanArray8[local539 + 1];
							Static241.aBooleanArray8[local539 + 1] = local787;
							local1145 = Static560.aBooleanArray34[local539];
							Static560.aBooleanArray34[local539] = Static560.aBooleanArray34[local539 + 1];
							Static560.aBooleanArray34[local539 + 1] = local1145;
							local287 = false;
						}
					}
					if (local287) {
						break;
					}
				}
				arg0.aClass397_131 = null;
				return true;
			}
			@Pc(1205) String local1205;
			@Pc(1207) String local1207;
			if (Static2.aClass397_1 == arg0.aClass397_131) {
				local531 = local11.method2054();
				local100 = local11.method2036();
				local539 = local11.method2048(255);
				local1205 = "";
				local1207 = local1205;
				if ((local539 & 0x1) != 0) {
					local1205 = local11.method2014();
					if ((local539 & 0x2) == 0) {
						local1207 = local1205;
					} else {
						local1207 = local11.method2014();
					}
				}
				local1055 = local11.method2014();
				if (local531 == 99) {
					Static369.method5071(local1055);
				} else if (local531 == 98) {
					Static634.method8326(local1055);
				} else if (local1207.equals("") || !Static543.method7194(local1207, (byte) -118)) {
					Static97.method1971(local1055, local1205, local1207, local1205, local531, local100);
				} else {
					arg0.aClass397_131 = null;
					return true;
				}
				arg0.aClass397_131 = null;
				return true;
			} else if (arg0.aClass397_131 == Static98.aClass397_31) {
				Static121.anInt2470 = local11.method2023() << 3;
				Static479.anInt7523 = local11.method2075();
				Static367.anInt5752 = local11.method2062() << 3;
				arg0.aClass397_131 = null;
				return true;
			} else if (Static498.aClass397_127 == arg0.aClass397_131) {
				local531 = local11.method2028(-14795);
				@Pc(1328) long local1328 = local11.method2063();
				if (Static637.anObjectArray39 == null) {
					Static637.anObjectArray39 = new Object[Static118.aClass17_1.anInt722];
				}
				Static637.anObjectArray39[local531] = Long.valueOf(local1328);
				Static556.anIntArray620[Static35.anInt1185++ & 0x1F] = local531;
				arg0.aClass397_131 = null;
				return true;
			} else {
				@Pc(1589) int local1589;
				@Pc(1376) boolean local1376;
				if (arg0.aClass397_131 == Static537.aClass397_140) {
					@Pc(1366) String local1366 = local11.method2014();
					local1376 = local11.method2048(255) == 1;
					if (local1376) {
						local291 = local11.method2014();
					} else {
						local291 = local1366;
					}
					local616 = local11.method2028(-14795);
					@Pc(1394) byte local1394 = local11.method2022();
					local721 = false;
					if (local1394 == -128) {
						local721 = true;
					}
					if (local721) {
						if (Static651.anInt10057 == 0) {
							arg0.aClass397_131 = null;
							return true;
						}
						for (local1589 = 0; local1589 < Static651.anInt10057 && (!Static273.aClass61Array1[local1589].aString37.equals(local291) || local616 != Static273.aClass61Array1[local1589].anInt2035); local1589++) {
						}
						if (Static651.anInt10057 > local1589) {
							while (local1589 < Static651.anInt10057 - 1) {
								Static273.aClass61Array1[local1589] = Static273.aClass61Array1[local1589 + 1];
								local1589++;
							}
							Static651.anInt10057--;
							Static273.aClass61Array1[Static651.anInt10057] = null;
						}
					} else {
						local723 = local11.method2014();
						@Pc(1413) Class61 local1413 = new Class61();
						local1413.aString37 = local291;
						local1413.aString36 = local1366;
						local1413.aString38 = Static69.method1531(local1413.aString37);
						local1413.aByte48 = local1394;
						local1413.aString35 = local723;
						local1413.anInt2035 = local616;
						for (local745 = Static651.anInt10057 - 1; local745 >= 0; local745--) {
							local317 = Static273.aClass61Array1[local745].aString38.compareTo(local1413.aString38);
							if (local317 == 0) {
								Static273.aClass61Array1[local745].anInt2035 = local616;
								Static273.aClass61Array1[local745].aByte48 = local1394;
								Static273.aClass61Array1[local745].aString35 = local723;
								if (local291.equals(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
									Static317.aByte71 = local1394;
								}
								Static324.anInt5254 = Static475.anInt7494;
								arg0.aClass397_131 = null;
								return true;
							}
							if (local317 < 0) {
								break;
							}
						}
						if (Static651.anInt10057 >= Static273.aClass61Array1.length) {
							arg0.aClass397_131 = null;
							return true;
						}
						for (local317 = Static651.anInt10057 - 1; local317 > local745; local317--) {
							Static273.aClass61Array1[local317 + 1] = Static273.aClass61Array1[local317];
						}
						if (Static651.anInt10057 == 0) {
							Static273.aClass61Array1 = new Class61[100];
						}
						Static273.aClass61Array1[local745 + 1] = local1413;
						Static651.anInt10057++;
						if (local291.equals(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
							Static317.aByte71 = local1394;
						}
					}
					Static324.anInt5254 = Static475.anInt7494;
					arg0.aClass397_131 = null;
					return true;
				} else if (arg0.aClass397_131 == Static620.aClass397_169) {
					@Pc(1682) byte local1682 = local11.method2062();
					local100 = local11.method2044();
					Static380.aClass127_1.method2984(local1682, local100);
					arg0.aClass397_131 = null;
					return true;
				} else {
					@Pc(1732) int local1732;
					if (Static9.aClass397_5 == arg0.aClass397_131) {
						local531 = local11.method2028(-14795);
						local100 = local11.method2048(255);
						local1376 = (local100 & 0x1) == 1;
						while (local11.anInt2178 < arg0.anInt8012) {
							local616 = local11.method2054();
							local709 = local11.method2028(-14795);
							local1732 = 0;
							if (local709 != 0) {
								local1732 = local11.method2048(255);
								if (local1732 == 255) {
									local1732 = local11.method2036();
								}
							}
							Static361.method5027(local709 - 1, local1732, local616, local1376, local531);
						}
						Static247.anIntArray287[Static428.anInt6544++ & 0x1F] = local531;
						arg0.aClass397_131 = null;
						return true;
					} else if (Static516.aClass397_137 == arg0.aClass397_131) {
						if (Static702.aFrame3 != null) {
							Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
						}
						@Pc(1804) byte[] local1804 = new byte[arg0.anInt8012];
						local11.method223(local1804, arg0.anInt8012);
						local291 = Static579.method7511(0, arg0.anInt8012, local1804);
						Static280.method3947(true, local291, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 1, Static122.aClass47_1);
						arg0.aClass397_131 = null;
						return true;
					} else {
						@Pc(1858) boolean local1858;
						if (arg0.aClass397_131 == Static4.aClass397_3) {
							local531 = local11.method2048(255);
							local1858 = (local531 & 0x1) == 1;
							local293 = local11.method2014();
							local1205 = local11.method2014();
							if (local1205.equals("")) {
								local1205 = local293;
							}
							local1207 = local11.method2014();
							local1055 = local11.method2014();
							if (local1055.equals("")) {
								local1055 = local1207;
							}
							if (local1858) {
								for (local1589 = 0; local1589 < Static453.anInt6954; local1589++) {
									if (Static646.aStringArray43[local1589].equals(local1055)) {
										Static501.aStringArray34[local1589] = local293;
										Static646.aStringArray43[local1589] = local1205;
										Static166.aStringArray15[local1589] = local1207;
										Static557.aStringArray38[local1589] = local1055;
										break;
									}
								}
							} else {
								Static501.aStringArray34[Static453.anInt6954] = local293;
								Static646.aStringArray43[Static453.anInt6954] = local1205;
								Static166.aStringArray15[Static453.anInt6954] = local1207;
								Static557.aStringArray38[Static453.anInt6954] = local1055;
								Static113.aBooleanArray1[Static453.anInt6954] = (local531 & 0x2) == 2;
								Static453.anInt6954++;
							}
							arg0.aClass397_131 = null;
							Static507.anInt8071 = Static475.anInt7494;
							return true;
						} else if (arg0.aClass397_131 == Static542.aClass397_143) {
							local531 = local11.method2044();
							if (local531 == 65535) {
								local531 = -1;
							}
							local100 = local11.method2059();
							Static579.method7513();
							Static129.method2318(-1, local100, local531, 2);
							arg0.aClass397_131 = null;
							return true;
						} else if (Static149.aClass397_37 == arg0.aClass397_131) {
							local531 = local11.method2048(255);
							if (local11.method2048(255) == 0) {
								Static469.aClass240Array1[local531] = new Class240();
							} else {
								local11.anInt2178--;
								Static469.aClass240Array1[local531] = new Class240(local11);
							}
							Static704.anInt10983 = Static475.anInt7494;
							arg0.aClass397_131 = null;
							return true;
						} else if (Static608.aClass397_165 == arg0.aClass397_131) {
							for (local531 = 0; local531 < Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1.length; local531++) {
								if (Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local531] != null) {
									Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local531].anIntArray641 = null;
									Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local531].aClass45_10.method6576(-1);
								}
							}
							for (local100 = 0; local100 < Static568.anInt8629; local100++) {
								Static169.aClass3_Sub52Array1[local100].aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray641 = null;
								Static169.aClass3_Sub52Array1[local100].aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass45_10.method6576(-1);
							}
							arg0.aClass397_131 = null;
							return true;
						} else if (Static480.aClass397_119 == arg0.aClass397_131) {
							Static605.method7770(Static235.aClass344_4);
							arg0.aClass397_131 = null;
							return true;
						} else if (Static486.aClass397_121 == arg0.aClass397_131) {
							local531 = local11.method2060();
							Static579.method7513();
							Static56.method1314(local531);
							arg0.aClass397_131 = null;
							return true;
						} else if (arg0.aClass397_131 == Static54.aClass397_19) {
							local531 = local11.method2036();
							Static85.aClass338_3 = Static122.aClass47_1.method1398(local531);
							arg0.aClass397_131 = null;
							return true;
						} else if (arg0.aClass397_131 == Static259.aClass397_67) {
							local531 = local11.method2029();
							if (local531 == 65535) {
								local531 = -1;
							}
							local100 = local11.method2059();
							Static579.method7513();
							Static430.method5700(local100, local531);
							arg0.aClass397_131 = null;
							return true;
						} else {
							@Pc(2234) Class3_Sub20 local2234;
							if (Static380.aClass397_88 == arg0.aClass397_131) {
								local531 = local11.method2069();
								local100 = local11.method2069();
								Static579.method7513();
								local2234 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local100);
								local549 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local531);
								if (local549 != null) {
									Static46.method1229(local2234 == null || local2234.anInt2493 != local549.anInt2493, false, local549);
								}
								if (local2234 != null) {
									local2234.method9596();
									Static432.aClass313_34.method7107((long) local531, local2234);
								}
								@Pc(2279) Class270 local2279 = Static254.method3544(local100);
								if (local2279 != null) {
									Static539.method7146(local2279);
								}
								local2279 = Static254.method3544(local531);
								if (local2279 != null) {
									Static539.method7146(local2279);
									Static145.method2463(local2279, true);
								}
								if (Static589.anInt8959 != -1) {
									Static682.method9051(1, Static589.anInt8959);
								}
								arg0.aClass397_131 = null;
								return true;
							}
							@Pc(2375) int local2375;
							@Pc(2365) int local2365;
							@Pc(2373) boolean local2373;
							if (arg0.aClass397_131 == Static496.aClass397_126) {
								local287 = local11.method2048(255) == 1;
								local291 = local11.method2014();
								local293 = local291;
								if (local287) {
									local293 = local11.method2014();
								}
								local303 = local11.method2063();
								local308 = (long) local11.method2028(-14795);
								local313 = (long) local11.method2061();
								local317 = local11.method2048(255);
								local2365 = local11.method2028(-14795);
								@Pc(2371) long local2371 = local313 + (local308 << 32);
								local2373 = false;
								local2375 = 0;
								while (true) {
									if (local2375 >= 100) {
										if (local317 <= 1 && Static543.method7194(local293, (byte) -24)) {
											local2373 = true;
										}
										break;
									}
									if (local2371 == Static161.aLongArray11[local2375]) {
										local2373 = true;
										break;
									}
									local2375++;
								}
								if (!local2373 && Static502.anInt8004 == 0) {
									Static161.aLongArray11[Static366.anInt5736] = local2371;
									Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
									@Pc(2441) String local2441 = Static134.aClass246_1.method5420(local2365).method8503(local11);
									if (local317 == 2) {
										Static169.method2734(local291, local2441, Static329.method4760(local303), 20, "<img=1>" + local293, "<img=1>" + local291, local2365, 0);
									} else if (local317 == 1) {
										Static169.method2734(local291, local2441, Static329.method4760(local303), 20, "<img=0>" + local293, "<img=0>" + local291, local2365, 0);
									} else {
										Static169.method2734(local291, local2441, Static329.method4760(local303), 20, local293, local291, local2365, 0);
									}
								}
								arg0.aClass397_131 = null;
								return true;
							} else if (Static697.aClass397_184 == arg0.aClass397_131) {
								local100 = local11.method2028(-14795);
								local539 = local11.method2075();
								local966 = (local539 & 0x1) == 1;
								Static175.method2823(local100, local966);
								Static247.anIntArray287[Static428.anInt6544++ & 0x1F] = local100;
								arg0.aClass397_131 = null;
								return true;
							} else if (Static191.aClass397_55 == arg0.aClass397_131) {
								local100 = local11.method2036();
								local539 = local11.method2028(-14795);
								Static579.method7513();
								Static589.method7598(local539, local100);
								arg0.aClass397_131 = null;
								return true;
							} else if (Static474.aClass397_117 == arg0.aClass397_131) {
								Static539.aByte117 = local11.method2049();
								if (Static539.aByte117 == 0 || Static539.aByte117 == 1) {
									Static353.aBoolean363 = true;
								}
								arg0.aClass397_131 = null;
								return true;
							} else if (Static410.aClass397_45 == arg0.aClass397_131) {
								local100 = local11.method2044();
								local539 = local11.method2059();
								local616 = local11.method2060();
								local709 = local11.method2044();
								Static579.method7513();
								Static129.method2318(local709, local539, local616 << 16 | local100, 7);
								arg0.aClass397_131 = null;
								return true;
							} else if (Static202.aClass397_56 == arg0.aClass397_131) {
								Static496.anInt7902 = local11.method2017();
								Static365.anInt5729 = Static475.anInt7494;
								arg0.aClass397_131 = null;
								return true;
							} else {
								@Pc(2729) int local2729;
								if (arg0.aClass397_131 == Static723.aClass397_192) {
									local100 = local11.method2029();
									if (local100 == 65535) {
										local100 = -1;
									}
									local539 = local11.method2039();
									local616 = local539 >> 2;
									local709 = local539 & 0x3;
									local1732 = Static236.anIntArray281[local616];
									local1589 = local11.method2059();
									local2729 = local1589 >> 28 & 0x3;
									local745 = local1589 >> 14 & 0x3FFF;
									local745 -= Static291.anInt4448;
									local317 = local1589 & 0x3FFF;
									local317 -= Static189.anInt3243;
									Static83.method9523(local2729, local616, local709, local745, local317, local1732, local100);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static546.aClass397_147) {
									local291 = local11.method2014();
									local539 = local11.method2028(-14795);
									local1205 = Static134.aClass246_1.method5420(local539).method8503(local11);
									Static169.method2734(local291, local1205, (String) null, 19, local291, local291, local539, 0);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static592.aClass397_161) {
									local100 = local11.method2028(-14795);
									local293 = local11.method2014();
									if (Static637.anObjectArray39 == null) {
										Static637.anObjectArray39 = new Object[Static118.aClass17_1.anInt722];
									}
									Static637.anObjectArray39[local100] = local293;
									Static556.anIntArray620[Static35.anInt1185++ & 0x1F] = local100;
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static31.aClass397_15) {
									local100 = local11.method2044();
									Static579.method7513();
									Static694.method9185(local100);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static442.aClass397_106 == arg0.aClass397_131) {
									local100 = local11.method2036();
									local539 = local11.method2044();
									if (local539 == 65535) {
										local539 = -1;
									}
									Static579.method7513();
									Static129.method2318(-1, local100, local539, 1);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static119.aClass397_98) {
									local1858 = local11.method2048(255) == 1;
									@Pc(2909) byte[] local2909 = new byte[arg0.anInt8012 - 1];
									local11.method2064(arg0.anInt8012 - 1, 0, local2909);
									Static268.method3816(local2909, local1858);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static289.aClass397_78) {
									Static637.anObjectArray39 = null;
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static606.aClass397_163) {
									local100 = local11.method2044();
									local539 = local11.method2029();
									local616 = local11.method2048(255);
									local709 = local11.method2011();
									Static579.method7513();
									Static196.method3477(local709, local100, local539, local616);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static3.aClass397_2 == arg0.aClass397_131) {
									local1858 = local11.method2039() == 1;
									local539 = local11.method2059();
									Static579.method7513();
									Static276.method3878(local539, local1858);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static473.aClass397_116) {
									local100 = local11.method2028(-14795);
									local539 = local11.method2011();
									Static579.method7513();
									Static263.method3740(local539, local100);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static500.aClass397_129 == arg0.aClass397_131) {
									Static605.method7770(Static496.aClass344_10);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static183.aClass397_53 == arg0.aClass397_131) {
									local1858 = local11.method2039() == 1;
									Static579.method7513();
									arg0.aClass397_131 = null;
									Static662.aBoolean679 = local1858;
									return true;
								} else if (arg0.aClass397_131 == Static566.aClass397_152) {
									local100 = local11.method2036();
									Static579.method7513();
									Static129.method2318(0, local100, Static574.anInt8718, 5);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static507.aClass397_135 == arg0.aClass397_131) {
									local100 = local11.method2069();
									local539 = local11.method2044();
									Static579.method7513();
									Static280.method3948(local100, local539);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static449.aClass397_113 == arg0.aClass397_131) {
									local100 = local11.method2060();
									local539 = local11.method2036();
									local616 = local11.method2028(-14795);
									local709 = local11.method2060();
									Static579.method7513();
									Static544.method8469(local616, local709, local539, local100);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static449.aClass397_112) {
									Static503.anInt8018 = Static475.anInt7494;
									local1858 = local11.method2048(255) == 1;
									if (arg0.anInt8012 != 1) {
										if (local1858) {
											Static107.aClass3_Sub14_10 = new Class3_Sub14(local11);
										} else {
											Static12.aClass3_Sub14_15 = new Class3_Sub14(local11);
										}
										arg0.aClass397_131 = null;
										return true;
									}
									if (local1858) {
										Static107.aClass3_Sub14_10 = null;
									} else {
										Static12.aClass3_Sub14_15 = null;
									}
									arg0.aClass397_131 = null;
									return true;
								} else if (Static645.aClass397_174 == arg0.aClass397_131) {
									Static605.method7770(Static271.aClass344_5);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static284.aClass397_76 == arg0.aClass397_131) {
									local100 = local11.method2044();
									local539 = local11.method2048(255);
									Static579.method7513();
									if (local539 == 2) {
										Static172.method2787();
									}
									Static589.anInt8959 = local100;
									Static273.method3855(local100);
									Static614.method7866(false);
									Static540.method7159(Static589.anInt8959);
									for (local616 = 0; local616 < 100; local616++) {
										Static572.aBooleanArray23[local616] = true;
									}
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static81.aClass397_28) {
									local100 = local11.method2028(-14795);
									local539 = local11.method2048(255);
									local966 = (local539 & 0x1) == 1;
									Static386.method5212(local966, local100);
									local709 = local11.method2028(-14795);
									for (local1732 = 0; local1732 < local709; local1732++) {
										local1589 = local11.method2060();
										local2729 = local11.method2048(255);
										if (local2729 == 255) {
											local2729 = local11.method2059();
										}
										Static361.method5027(local1589 - 1, local2729, local1732, local966, local100);
									}
									Static247.anIntArray287[Static428.anInt6544++ & 0x1F] = local100;
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static251.aClass397_64) {
									Static306.anInt4920 = local11.method2048(255);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static546.aClass397_146) {
									local100 = local11.method2028(-14795);
									local293 = local11.method2014();
									local966 = local11.method2048(255) == 1;
									Static668.aClass43_5 = Static226.aClass43_3;
									Static472.aBoolean500 = local966;
									Static615.method7906(local100, local293);
									Static336.method4832(15);
									arg0.aClass397_131 = null;
									return false;
								} else if (Static268.aClass397_71 == arg0.aClass397_131) {
									local100 = local11.method2029();
									local293 = local11.method2014();
									Static579.method7513();
									Static177.method2860(local100, local293);
									arg0.aClass397_131 = null;
									return true;
								} else if (Static154.aClass397_42 == arg0.aClass397_131) {
									local100 = local11.method2029() << 2;
									local539 = local11.method2039();
									local616 = local11.method2048(255);
									local709 = local11.method2048(255);
									local1732 = local11.method2075();
									Static579.method7513();
									Static51.method1286(local100, local539, local709, local616, local1732);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static601.aClass397_162) {
									local100 = local11.method2075();
									local539 = local11.method2059();
									local616 = local11.method2039();
									Static400.anIntArray475[local616] = local539;
									Static410.anIntArray184[local616] = local100;
									Static212.anIntArray243[local616] = 1;
									local709 = Static637.anIntArray648[local616] - 1;
									for (local1732 = 0; local1732 < local709; local1732++) {
										if (Class319.anIntArray609[local1732] <= local539) {
											Static212.anIntArray243[local616] = local1732 + 2;
										}
									}
									Static472.anIntArray552[Static533.anInt8307++ & 0x1F] = local616;
									arg0.aClass397_131 = null;
									return true;
								} else if (Static142.aClass397_36 == arg0.aClass397_131) {
									Static605.method7770(Static322.aClass344_6);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static619.aClass397_168) {
									Static605.method7770(Static141.aClass344_3);
									arg0.aClass397_131 = null;
									return true;
								} else if (arg0.aClass397_131 == Static477.aClass397_118) {
									Static479.method6495();
									arg0.aClass397_131 = null;
									return true;
								} else {
									@Pc(3659) int local3659;
									@Pc(3640) long local3640;
									@Pc(3645) long local3645;
									@Pc(3655) long local3655;
									@Pc(3737) String local3737;
									@Pc(3657) boolean local3657;
									if (Static68.aClass397_22 == arg0.aClass397_131) {
										local1858 = local11.method2048(255) == 1;
										local293 = local11.method2014();
										local1205 = local293;
										if (local1858) {
											local1205 = local11.method2014();
										}
										local3640 = (long) local11.method2028(-14795);
										local3645 = (long) local11.method2061();
										local745 = local11.method2048(255);
										local3655 = (local3640 << 32) + local3645;
										local3657 = false;
										local3659 = 0;
										while (true) {
											if (local3659 >= 100) {
												if (local745 <= 1) {
													if (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293) {
														local3657 = true;
													} else if (Static543.method7194(local1205, (byte) -98)) {
														local3657 = true;
													}
												}
												break;
											}
											if (Static161.aLongArray11[local3659] == local3655) {
												local3657 = true;
												break;
											}
											local3659++;
										}
										if (!local3657 && Static502.anInt8004 == 0) {
											Static161.aLongArray11[Static366.anInt5736] = local3655;
											Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
											local3737 = Static411.method5495(-4712, Static206.method3543(local11));
											if (local745 == 2) {
												Static169.method2734(local293, local3737, (String) null, 7, "<img=1>" + local1205, "<img=1>" + local293, -1, 0);
											} else if (local745 == 1) {
												Static169.method2734(local293, local3737, (String) null, 7, "<img=0>" + local1205, "<img=0>" + local293, -1, 0);
											} else {
												Static169.method2734(local293, local3737, (String) null, 3, local1205, local293, -1, 0);
											}
										}
										arg0.aClass397_131 = null;
										return true;
									}
									@Pc(3878) boolean local3878;
									if (arg0.aClass397_131 == Static29.aClass397_14) {
										local100 = local11.method2028(-14795);
										@Pc(3839) Class9_Sub1_Sub1_Sub2_Sub1 local3839;
										if (Static574.anInt8718 == local100) {
											local3839 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2;
										} else {
											local3839 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local100];
										}
										if (local3839 == null) {
											arg0.aClass397_131 = null;
											return true;
										}
										local616 = local11.method2028(-14795);
										local709 = local11.method2048(255);
										local721 = (local616 & 0x8000) != 0;
										if (local3839.aString4 != null && local3839.aClass34_1 != null) {
											local3878 = false;
											if (local709 <= 1) {
												if (!local721 && (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293)) {
													local3878 = true;
												} else if (Static543.method7194(local3839.aString4, (byte) -102)) {
													local3878 = true;
												}
											}
											if (!local3878 && Static502.anInt8004 == 0) {
												local745 = -1;
												if (local721) {
													local616 &= 0x7FFF;
													@Pc(3939) Class210 local3939 = Static299.method4205(local11);
													local745 = local3939.anInt5499;
													local1091 = local3939.aClass3_Sub7_Sub20_1.method8503(local11);
												} else {
													local1091 = Static411.method5495(-4712, Static206.method3543(local11));
												}
												local3839.method478(local616 >> 8, local616 & 0xFF, local1091.trim());
												if (local709 == 1 || local709 == 2) {
													local317 = local721 ? 17 : 1;
												} else {
													local317 = local721 ? 17 : 2;
												}
												if (local709 == 2) {
													Static169.method2734(local3839.aString3, local1091, (String) null, local317, "<img=1>" + local3839.method472(), "<img=1>" + local3839.method475(), local745, 0);
												} else if (local709 == 1) {
													Static169.method2734(local3839.aString3, local1091, (String) null, local317, "<img=0>" + local3839.method472(), "<img=0>" + local3839.method475(), local745, 0);
												} else {
													Static169.method2734(local3839.aString3, local1091, (String) null, local317, local3839.method472(), local3839.method475(), local745, 0);
												}
											}
										}
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static404.aClass397_96) {
										local100 = local11.method2075();
										local539 = local11.method2029();
										if (local539 == 65535) {
											local539 = -1;
										}
										local616 = local11.method2075();
										Static232.method3382(local100, local539, local616);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static688.aClass397_182) {
										local100 = local11.method2060();
										if (local100 == 65535) {
											local100 = -1;
										}
										local539 = local11.method2039();
										local616 = local11.method2012();
										Static502.method6857(local100, local616, local539);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static35.aClass397_16) {
										Static99.aString39 = arg0.anInt8012 > 2 ? local11.method2014() : Static430.aClass257_25.method5699(Static456.anInt7118);
										Static229.anInt3718 = arg0.anInt8012 > 0 ? local11.method2028(-14795) : -1;
										if (Static229.anInt3718 == 65535) {
											Static229.anInt3718 = -1;
										}
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static705.aClass397_188) {
										local100 = local11.method2059();
										Static579.method7513();
										Static129.method2318(-1, local100, -1, 3);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static630.aClass397_170) {
										Static324.anInt5254 = Static475.anInt7494;
										if (arg0.anInt8012 == 0) {
											Static571.aString114 = null;
											Static273.aClass61Array1 = null;
											Static379.aString77 = null;
											arg0.aClass397_131 = null;
											Static651.anInt10057 = 0;
											return true;
										}
										Static571.aString114 = local11.method2014();
										local1858 = local11.method2048(255) == 1;
										if (local1858) {
											local11.method2014();
										}
										@Pc(4284) long local4284 = local11.method2063();
										Static379.aString77 = Static248.method3508(local4284, -104);
										Static547.aByte118 = local11.method2022();
										local709 = local11.method2048(255);
										if (local709 == 255) {
											arg0.aClass397_131 = null;
											return true;
										}
										Static651.anInt10057 = local709;
										@Pc(4310) Class61[] local4310 = new Class61[100];
										for (local1589 = 0; local1589 < Static651.anInt10057; local1589++) {
											local4310[local1589] = new Class61();
											local4310[local1589].aString36 = local11.method2014();
											local1858 = local11.method2048(255) == 1;
											if (local1858) {
												local4310[local1589].aString37 = local11.method2014();
											} else {
												local4310[local1589].aString37 = local4310[local1589].aString36;
											}
											local4310[local1589].aString38 = Static69.method1531(local4310[local1589].aString37);
											local4310[local1589].anInt2035 = local11.method2028(-14795);
											local4310[local1589].aByte48 = local11.method2022();
											local4310[local1589].aString35 = local11.method2014();
											if (local4310[local1589].aString37.equals(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
												Static317.aByte71 = local4310[local1589].aByte48;
											}
										}
										local317 = Static651.anInt10057;
										while (local317 > 0) {
											local317--;
											local725 = true;
											for (local2365 = 0; local2365 < local317; local2365++) {
												if (local4310[local2365].aString38.compareTo(local4310[local2365 + 1].aString38) > 0) {
													@Pc(4448) Class61 local4448 = local4310[local2365];
													local4310[local2365] = local4310[local2365 + 1];
													local4310[local2365 + 1] = local4448;
													local725 = false;
												}
											}
											if (local725) {
												break;
											}
										}
										arg0.aClass397_131 = null;
										Static273.aClass61Array1 = local4310;
										return true;
									} else if (arg0.aClass397_131 == Static8.aClass397_4) {
										local100 = local11.method2039();
										local539 = local11.method2059();
										Static579.method7513();
										Static300.method8947(local539, local100);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static570.aClass397_154) {
										local100 = local11.method2050();
										local539 = local11.method2036();
										Static579.method7513();
										Static686.method9057(local100, local539);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static51.aClass397_18) {
										local291 = local11.method2014();
										local539 = local11.method2059();
										Static579.method7513();
										Static101.method1988(local539, local291);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static682.aClass397_178) {
										arg0.aClass397_131 = null;
										Static134.anInt2600 = 1;
										Static507.anInt8071 = Static475.anInt7494;
										return true;
									} else if (arg0.aClass397_131 == Static471.aClass397_114) {
										@Pc(4590) byte local4590 = local11.method2023();
										local539 = local11.method2060();
										Static579.method7513();
										Static699.method9257(local539, local4590);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static373.aClass397_40) {
										Static121.anInt2470 = local11.method2049() << 3;
										Static479.anInt7523 = local11.method2039();
										Static367.anInt5752 = local11.method2022() << 3;
										while (arg0.anInt8012 > local11.anInt2178) {
											@Pc(4639) Class344 local4639 = Static207.method3120()[local11.method2048(255)];
											Static605.method7770(local4639);
										}
										arg0.aClass397_131 = null;
										return true;
									} else if (Static168.aClass397_49 == arg0.aClass397_131) {
										local100 = local11.method2053();
										local539 = local11.method2039();
										if (local100 == 255) {
											local539 = -1;
											local100 = -1;
										}
										Static342.method4885(local100, local539);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static373.aClass397_41) {
										local100 = local11.method2048(255);
										local539 = local100 >> 5;
										local616 = local100 & 0x1F;
										if (local616 == 0) {
											Static110.aClass197Array1[local539] = null;
											arg0.aClass397_131 = null;
											return true;
										}
										@Pc(4719) Class197 local4719 = new Class197();
										local4719.anInt5073 = local616;
										local4719.anInt5072 = local11.method2048(255);
										if (local4719.anInt5072 >= 0 && local4719.anInt5072 < Static708.aClass178Array18.length) {
											if (local4719.anInt5073 == 1 || local4719.anInt5073 == 10) {
												local4719.anInt5082 = local11.method2028(-14795);
												local4719.anInt5084 = local11.method2028(-14795);
												local11.anInt2178 += 4;
											} else if (local4719.anInt5073 >= 2 && local4719.anInt5073 <= 6) {
												if (local4719.anInt5073 == 2) {
													local4719.anInt5081 = 256;
													local4719.anInt5074 = 256;
												}
												if (local4719.anInt5073 == 3) {
													local4719.anInt5074 = 256;
													local4719.anInt5081 = 0;
												}
												if (local4719.anInt5073 == 4) {
													local4719.anInt5074 = 256;
													local4719.anInt5081 = 512;
												}
												if (local4719.anInt5073 == 5) {
													local4719.anInt5074 = 0;
													local4719.anInt5081 = 256;
												}
												if (local4719.anInt5073 == 6) {
													local4719.anInt5081 = 256;
													local4719.anInt5074 = 512;
												}
												local4719.anInt5073 = 2;
												local4719.anInt5078 = local11.method2048(255);
												local4719.anInt5081 += local11.method2028(-14795) - Static291.anInt4448 << 9;
												local4719.anInt5074 += local11.method2028(-14795) - Static189.anInt3243 << 9;
												local4719.anInt5083 = local11.method2048(255) << 2;
												local4719.anInt5079 = local11.method2028(-14795);
											}
											local4719.anInt5080 = local11.method2028(-14795);
											if (local4719.anInt5080 == 65535) {
												local4719.anInt5080 = -1;
											}
											Static110.aClass197Array1[local539] = local4719;
										}
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static82.aClass397_29) {
										local100 = local11.method2036();
										local539 = local11.method2036();
										@Pc(4938) Class3_Sub29 local4938 = Static507.method6901(Static27.aClass144_8, arg0.aClass88_2);
										local4938.aClass3_Sub2_Sub1_1.method2018(local100);
										local4938.aClass3_Sub2_Sub1_1.method2018(local539);
										arg0.method6855(local4938);
										arg0.aClass397_131 = null;
										return true;
									} else if (Static435.aClass397_103 == arg0.aClass397_131) {
										Static618.method9598(local11, arg0.anInt8012);
										arg0.aClass397_131 = null;
										return true;
									} else if (arg0.aClass397_131 == Static268.aClass397_72) {
										local100 = local11.method2028(-14795);
										local539 = local11.method2036();
										if (Static637.anObjectArray39 == null) {
											Static637.anObjectArray39 = new Object[Static118.aClass17_1.anInt722];
										}
										Static637.anObjectArray39[local100] = Integer.valueOf(local539);
										Static556.anIntArray620[Static35.anInt1185++ & 0x1F] = local100;
										arg0.aClass397_131 = null;
										return true;
									} else {
										@Pc(5071) Class3_Sub47 local5071;
										@Pc(5080) Class3_Sub47 local5080;
										if (arg0.aClass397_131 == Static290.aClass397_79) {
											local100 = local11.method2059();
											local539 = local11.method2060();
											if (local539 == 65535) {
												local539 = -1;
											}
											local616 = local11.method2069();
											local709 = local11.method2060();
											Static579.method7513();
											if (local709 == 65535) {
												local709 = -1;
											}
											for (local1732 = local709; local1732 <= local539; local1732++) {
												local3645 = (long) local1732 + ((long) local616 << 32);
												local5071 = (Class3_Sub47) Static407.aClass313_32.method7104(local3645);
												if (local5071 != null) {
													local5080 = new Class3_Sub47(local100, local5071.anInt7683);
													local5071.method9596();
												} else if (local1732 == -1) {
													local5080 = new Class3_Sub47(local100, Static254.method3544(local616).aClass3_Sub47_3.anInt7683);
												} else {
													local5080 = new Class3_Sub47(local100, -1);
												}
												Static407.aClass313_32.method7107(local3645, local5080);
											}
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static22.aClass397_13) {
											local100 = local11.method2036();
											local539 = local11.method2011();
											local616 = local11.method2044();
											Static579.method7513();
											Static129.method2318(local539, local100, local616, 5);
											arg0.aClass397_131 = null;
											return true;
										} else if (Static724.aClass397_193 == arg0.aClass397_131) {
											local100 = local11.method2028(-14795);
											local539 = local11.method2069();
											Static380.aClass127_1.method2989(local100, local539);
											arg0.aClass397_131 = null;
											return true;
										} else if (Static254.aClass397_65 == arg0.aClass397_131) {
											local100 = local11.method2036();
											local539 = local11.method2069();
											local616 = local11.method2029();
											Static579.method7513();
											if (local616 == 65535) {
												local616 = -1;
											}
											Static588.method7594(local539, local616, local100);
											@Pc(5214) Class275 local5214 = Static606.aClass62_2.method1887(local616);
											Static544.method8469(local5214.anInt7239, local5214.anInt7275, local539, local5214.anInt7244);
											Static310.method4585(local5214.anInt7241, local5214.anInt7245, local539, local5214.anInt7280);
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static408.aClass397_97) {
											local100 = local11.method2069();
											Static579.method7513();
											local2234 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local100);
											if (local2234 != null) {
												Static46.method1229(true, false, local2234);
											}
											if (Static710.aClass270_11 != null) {
												Static539.method7146(Static710.aClass270_11);
												Static710.aClass270_11 = null;
											}
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static448.aClass397_110) {
											Static605.method7770(Static353.aClass344_7);
											arg0.aClass397_131 = null;
											return true;
										} else if (Static537.aClass397_141 == arg0.aClass397_131) {
											local100 = local11.method2048(255);
											Static579.method7513();
											Static349.anInt5569 = local100;
											arg0.aClass397_131 = null;
											return true;
										} else if (Static236.aClass397_62 == arg0.aClass397_131) {
											local1858 = local11.method2048(255) == 1;
											local293 = local11.method2014();
											local303 = (long) local11.method2028(-14795);
											local308 = (long) local11.method2061();
											local2729 = local11.method2048(255);
											local745 = local11.method2028(-14795);
											local3655 = local308 + (local303 << 32);
											local3657 = false;
											@Pc(5364) Class3_Sub14 local5364 = local1858 ? Static107.aClass3_Sub14_10 : Static12.aClass3_Sub14_15;
											if (local5364 == null) {
												local3657 = true;
											} else {
												label2296: {
													for (local327 = 0; local327 < 100; local327++) {
														if (Static161.aLongArray11[local327] == local3655) {
															local3657 = true;
															break label2296;
														}
													}
													if (local2729 <= 1 && Static543.method7194(local293, (byte) -46)) {
														local3657 = true;
													}
												}
											}
											if (!local3657 && Static502.anInt8004 == 0) {
												Static161.aLongArray11[Static366.anInt5736] = local3655;
												Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
												local410 = Static134.aClass246_1.method5420(local745).method8503(local11);
												local2375 = local1858 ? 42 : 45;
												if (local2729 == 2 || local2729 == 3) {
													Static169.method2734(local293, local410, local5364.aString32, local2375, "<img=1>" + local293, "<img=1>" + local293, local745, 0);
												} else if (local2729 == 1) {
													Static169.method2734(local293, local410, local5364.aString32, local2375, "<img=0>" + local293, "<img=0>" + local293, local745, 0);
												} else {
													Static169.method2734(local293, local410, local5364.aString32, local2375, local293, local293, local745, 0);
												}
											}
											arg0.aClass397_131 = null;
											return true;
										} else if (Static251.aClass397_63 == arg0.aClass397_131) {
											Static579.method7513();
											Static456.method6104();
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static707.aClass397_189) {
											local291 = local11.method2014();
											@Pc(5574) Object[] local5574 = new Object[local291.length() + 1];
											for (local616 = local291.length() - 1; local616 >= 0; local616--) {
												if (local291.charAt(local616) == 's') {
													local5574[local616 + 1] = local11.method2014();
												} else {
													local5574[local616 + 1] = Integer.valueOf(local11.method2036());
												}
											}
											local5574[0] = Integer.valueOf(local11.method2036());
											Static579.method7513();
											@Pc(5632) Class3_Sub41 local5632 = new Class3_Sub41();
											local5632.anObjectArray4 = local5574;
											Static540.method7160(local5632);
											arg0.aClass397_131 = null;
											return true;
										} else if (Static215.aClass397_57 == arg0.aClass397_131) {
											local100 = local11.method2036();
											local539 = local11.method2060();
											Static380.aClass127_1.method2984(local100, local539);
											arg0.aClass397_131 = null;
											return true;
										} else if (Static658.aClass397_177 == arg0.aClass397_131) {
											local100 = local11.method2060();
											local539 = local11.method2036();
											Static579.method7513();
											Static271.method3838(local100, local539);
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static16.aClass397_11) {
											Static325.method4739();
											arg0.aClass397_131 = null;
											return true;
										} else if (arg0.aClass397_131 == Static700.aClass397_185) {
											Static579.method7513();
											Static492.method6653();
											arg0.aClass397_131 = null;
											return true;
										} else if (Static580.aClass397_107 == arg0.aClass397_131) {
											arg0.aClass397_131 = null;
											Static637.anObjectArray39 = new Object[Static118.aClass17_1.anInt722];
											return true;
										} else if (Static424.aClass397_99 == arg0.aClass397_131) {
											Static380.aClass127_1.method2983();
											arg0.aClass397_131 = null;
											Static120.anInt2463 += 32;
											return true;
										} else if (Static500.aClass397_128 == arg0.aClass397_131) {
											local11.anInt2178 += 28;
											if (local11.method2019()) {
												Static156.method2539(local11.anInt2178 - 28, local11);
											}
											arg0.aClass397_131 = null;
											return true;
										} else if (Static217.aClass397_59 == arg0.aClass397_131) {
											local100 = local11.method2029();
											local539 = local11.method2060();
											Static579.method7513();
											Static143.method2427(local100, local539);
											arg0.aClass397_131 = null;
											return true;
										} else {
											@Pc(5815) byte local5815;
											if (arg0.aClass397_131 == Static546.aClass397_145) {
												local100 = local11.method2028(-14795);
												local5815 = local11.method2022();
												if (Static637.anObjectArray39 == null) {
													Static637.anObjectArray39 = new Object[Static118.aClass17_1.anInt722];
												}
												Static637.anObjectArray39[local100] = Integer.valueOf(local5815);
												Static556.anIntArray620[Static35.anInt1185++ & 0x1F] = local100;
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static104.aClass397_32) {
												Static164.method2681(aBoolean376);
												arg0.aClass397_131 = null;
												return false;
											} else if (Static508.aClass397_136 == arg0.aClass397_131) {
												local100 = local11.method2028(-14795);
												if (local100 == 65535) {
													local100 = -1;
												}
												local539 = local11.method2048(255);
												local616 = local11.method2028(-14795);
												local709 = local11.method2048(255);
												local1732 = local11.method2028(-14795);
												Static355.method9493(local1732, local709, local539, local100, local616);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static426.aClass397_100 == arg0.aClass397_131) {
												Static426.anInt6539 = local11.method2047();
												Static24.aBoolean48 = local11.method2048(255) == 1;
												arg0.aClass397_131 = null;
												return true;
											} else if (Static505.aClass397_134 == arg0.aClass397_131) {
												if (Static589.anInt8959 != -1) {
													Static682.method9051(0, Static589.anInt8959);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static552.aClass397_148) {
												Static605.method7770(Static623.aClass344_13);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static286.aClass397_77 == arg0.aClass397_131) {
												Static605.method7770(Static547.aClass344_12);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static695.aClass397_125) {
												local100 = local11.method2059();
												local539 = local11.method2044();
												local616 = local11.method2029();
												Static579.method7513();
												Static513.method6950(local616 + (local539 << 16), local100);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static164.aClass397_46 == arg0.aClass397_131) {
												local100 = local11.method2048(255);
												local539 = local11.method2044() << 2;
												local616 = local11.method2048(255);
												local709 = local11.method2039();
												local1732 = local11.method2053();
												Static579.method7513();
												Static727.method9602(local709, local100, local539, local1732, true, local616);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static493.aClass397_123) {
												Static459.method6217(local11.method2014());
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static234.aClass397_61) {
												local291 = local11.method2014();
												local539 = local11.method2029();
												Static579.method7513();
												Static177.method2860(local539, local291);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static164.aClass397_47) {
												local100 = local11.method2044();
												local539 = local11.method2039();
												local616 = local11.method2048(255);
												local709 = local11.method2075();
												local1732 = local11.method2053();
												Static579.method7513();
												Static508.aBooleanArray21[local709] = true;
												Static607.anIntArray665[local709] = local539;
												Static502.anIntArray582[local709] = local1732;
												Static286.anIntArray337[local709] = local616;
												Static502.anIntArray580[local709] = local100;
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static644.aClass397_173) {
												local100 = local11.method2011();
												local539 = local11.method2029();
												if (local539 == 65535) {
													local539 = -1;
												}
												local616 = local11.method2044();
												if (local616 == 65535) {
													local616 = -1;
												}
												local709 = local11.method2028(-14795);
												Static579.method7513();
												for (local1732 = local616; local1732 <= local539; local1732++) {
													local3645 = ((long) local100 << 32) + ((long) local1732);
													local5071 = (Class3_Sub47) Static407.aClass313_32.method7104(local3645);
													if (local5071 != null) {
														local5080 = new Class3_Sub47(local5071.anInt7682, local709);
														local5071.method9596();
													} else if (local1732 == -1) {
														local5080 = new Class3_Sub47(Static254.method3544(local100).aClass3_Sub47_3.anInt7682, local709);
													} else {
														local5080 = new Class3_Sub47(0, local709);
													}
													Static407.aClass313_32.method7107(local3645, local5080);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static116.aClass397_35 == arg0.aClass397_131) {
												local100 = local11.method2028(-14795);
												local539 = local11.method2028(-14795);
												local616 = local11.method2028(-14795);
												Static579.method7513();
												if (Static172.aClass270ArrayArray2[local100] != null) {
													for (local709 = local539; local709 < local616; local709++) {
														local1732 = local11.method2061();
														if (local709 < Static172.aClass270ArrayArray2[local100].length && Static172.aClass270ArrayArray2[local100][local709] != null) {
															Static172.aClass270ArrayArray2[local100][local709].anInt7030 = local1732;
														}
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static84.aClass397_30 == arg0.aClass397_131) {
												local1858 = local11.method2048(255) == 1;
												local293 = local11.method2014();
												local1205 = local293;
												if (local1858) {
													local1205 = local11.method2014();
												}
												local709 = local11.method2048(255);
												local721 = false;
												if (local709 <= 1) {
													if (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293) {
														local721 = true;
													} else if (local709 <= 1 && Static543.method7194(local1205, (byte) -41)) {
														local721 = true;
													}
												}
												if (!local721 && Static502.anInt8004 == 0) {
													local723 = Static411.method5495(-4712, Static206.method3543(local11));
													if (local709 == 2) {
														Static169.method2734(local293, local723, (String) null, 24, "<img=1>" + local1205, "<img=1>" + local293, -1, 0);
													} else if (local709 == 1) {
														Static169.method2734(local293, local723, (String) null, 24, "<img=0>" + local1205, "<img=0>" + local293, -1, 0);
													} else {
														Static169.method2734(local293, local723, (String) null, 24, local1205, local293, -1, 0);
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static658.aClass397_176 == arg0.aClass397_131) {
												Static605.method7770(Static711.aClass344_16);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static580.aClass397_108 == arg0.aClass397_131) {
												local100 = local11.method2053();
												local539 = local11.method2029();
												Static579.method7513();
												Static41.method1163(local539, true, local100);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static578.aClass397_186 == arg0.aClass397_131) {
												Static121.anInt2470 = local11.method2022() << 3;
												Static479.anInt7523 = local11.method2075();
												Static367.anInt5752 = local11.method2023() << 3;
												for (@Pc(6548) Class3_Sub28 local6548 = (Class3_Sub28) Static113.aClass313_9.method7103(); local6548 != null; local6548 = (Class3_Sub28) Static113.aClass313_9.method7110()) {
													local539 = (int) (local6548.aLong345 >> 28 & 0x3L);
													local616 = (int) (local6548.aLong345 & 0x3FFFL);
													local709 = local616 - Static291.anInt4448;
													local1732 = (int) (local6548.aLong345 >> 14 & 0x3FFFL);
													local1589 = local1732 - Static189.anInt3243;
													if (Static479.anInt7523 == local539 && Static367.anInt5752 <= local709 && local709 < Static367.anInt5752 + 8 && Static121.anInt2470 <= local1589 && Static121.anInt2470 + 8 > local1589) {
														local6548.method9596();
														if (local709 >= 0 && local1589 >= 0 && local709 < Static497.anInt7926 && local1589 < Static646.anInt9979) {
															Static332.method4778(local1589, Static479.anInt7523, local709);
														}
													}
												}
												@Pc(6649) Class3_Sub57 local6649;
												for (local6649 = (Class3_Sub57) Static629.aClass342_76.method7644(); local6649 != null; local6649 = (Class3_Sub57) Static629.aClass342_76.method7650()) {
													if (local6649.anInt10797 >= Static367.anInt5752 && Static367.anInt5752 + 8 > local6649.anInt10797 && Static121.anInt2470 <= local6649.anInt10805 && local6649.anInt10805 < Static121.anInt2470 + 8 && local6649.anInt10802 == Static479.anInt7523) {
														local6649.aBoolean734 = true;
													}
												}
												for (local6649 = (Class3_Sub57) Static226.aClass342_35.method7644(); local6649 != null; local6649 = (Class3_Sub57) Static226.aClass342_35.method7650()) {
													if (Static367.anInt5752 <= local6649.anInt10797 && local6649.anInt10797 < Static367.anInt5752 + 8 && Static121.anInt2470 <= local6649.anInt10805 && Static121.anInt2470 + 8 > local6649.anInt10805 && Static479.anInt7523 == local6649.anInt10802) {
														local6649.aBoolean734 = true;
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static690.aClass397_183 == arg0.aClass397_131) {
												local100 = local11.method2053();
												local539 = local11.method2053();
												local616 = local11.method2029();
												if (local616 == 65535) {
													local616 = -1;
												}
												local1207 = local11.method2014();
												if (local539 >= 1 && local539 <= 8) {
													if (local1207.equalsIgnoreCase("null")) {
														local1207 = null;
													}
													Static410.aStringArray14[local539 - 1] = local1207;
													Static3.anIntArray4[local539 - 1] = local616;
													Static433.aBooleanArray15[local539 - 1] = local100 == 0;
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static448.aClass397_111) {
												local100 = local11.method2011();
												local539 = local11.method2029();
												Static579.method7513();
												Static699.method9257(local539, local100);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static570.aClass397_155) {
												Static276.anInt4230 = local11.method2039();
												Static485.anInt7642 = local11.method2039();
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static718.aClass397_191) {
												Static179.anInt3141 = local11.method2048(255);
												arg0.aClass397_131 = null;
												Static365.anInt5729 = Static475.anInt7494;
												return true;
											} else if (arg0.aClass397_131 == Static270.aClass397_73) {
												arg0.aClass397_131 = null;
												return false;
											} else if (Static69.aClass397_23 == arg0.aClass397_131) {
												if (Static702.aFrame3 != null) {
													Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
												}
												@Pc(6943) byte[] local6943 = new byte[arg0.anInt8012];
												local11.method223(local6943, arg0.anInt8012);
												local293 = Static579.method7511(0, arg0.anInt8012, local6943);
												local1205 = "opensn";
												if (!Static304.aBoolean320 || Static537.method7125(1, Static122.aClass47_1, local1205, local293).anInt8934 == 2) {
													Static521.method6990(local293, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 1, Static122.aClass47_1, true, local1205);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static542.aClass397_144) {
												Static605.method7770(Static689.aClass344_14);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static107.aClass397_149) {
												local100 = local11.method2069();
												Static579.method7513();
												arg0.aClass397_131 = null;
												if (local100 == -1) {
													Static494.anInt7853 = -1;
													Static358.anInt5640 = -1;
												} else {
													local539 = local100 >> 14 & 0x3FFF;
													local616 = local100 & 0x3FFF;
													local539 -= Static291.anInt4448;
													local616 -= Static189.anInt3243;
													if (local539 < 0) {
														local539 = 0;
													} else if (Static497.anInt7926 <= local539) {
														local539 = Static497.anInt7926;
													}
													if (local616 < 0) {
														local616 = 0;
													} else if (local616 >= Static646.anInt9979) {
														local616 = Static646.anInt9979;
													}
													Static494.anInt7853 = (local539 << 9) + 256;
													Static358.anInt5640 = (local616 << 9) + 256;
												}
												return true;
											} else if (Static17.aClass397_12 == arg0.aClass397_131) {
												local100 = local11.method2052();
												local539 = local11.method2069();
												local616 = local11.method2017();
												Static579.method7513();
												Static481.method6508(local100, local539, local616);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static702.aClass397_187 == arg0.aClass397_131) {
												if (Static14.method502(Static98.anInt2140)) {
													Static708.anInt11107 = (int) ((float) local11.method2028(-14795) * 2.5F);
												} else {
													Static708.anInt11107 = local11.method2028(-14795) * 30;
												}
												Static365.anInt5729 = Static475.anInt7494;
												arg0.aClass397_131 = null;
												return true;
											} else if (Static520.aClass397_138 == arg0.aClass397_131) {
												Static453.anInt6954 = local11.method2048(255);
												for (local100 = 0; local100 < Static453.anInt6954; local100++) {
													Static501.aStringArray34[local100] = local11.method2014();
													Static646.aStringArray43[local100] = local11.method2014();
													if (Static646.aStringArray43[local100].equals("")) {
														Static646.aStringArray43[local100] = Static501.aStringArray34[local100];
													}
													Static166.aStringArray15[local100] = local11.method2014();
													Static557.aStringArray38[local100] = local11.method2014();
													if (Static557.aStringArray38[local100].equals("")) {
														Static557.aStringArray38[local100] = Static166.aStringArray15[local100];
													}
													Static113.aBooleanArray1[local100] = false;
												}
												Static507.anInt8071 = Static475.anInt7494;
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static77.aClass397_24) {
												Static503.anInt8018 = Static475.anInt7494;
												local1858 = local11.method2048(255) == 1;
												@Pc(7285) Class243 local7285 = new Class243(local11);
												@Pc(7289) Class3_Sub14 local7289;
												if (local1858) {
													local7289 = Static107.aClass3_Sub14_10;
												} else {
													local7289 = Static12.aClass3_Sub14_15;
												}
												local7285.method5362(local7289);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static175.aClass397_51) {
												local100 = local11.method2011();
												local539 = local11.method2028(-14795);
												local616 = local11.method2039();
												local709 = local11.method2028(-14795);
												Static579.method7513();
												Static527.method7041(local616, local100, local709, local539);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static587.aClass397_160) {
												local291 = local11.method2014();
												local293 = Static411.method5495(-4712, Static206.method3543(local11));
												Static97.method1971(local293, local291, local291, local291, 6, 0);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static715.aClass397_190 == arg0.aClass397_131) {
												local1858 = local11.method2048(255) == 1;
												local293 = local11.method2014();
												local1205 = local293;
												if (local1858) {
													local1205 = local11.method2014();
												}
												local3640 = (long) local11.method2028(-14795);
												local3645 = (long) local11.method2061();
												local745 = local11.method2048(255);
												local317 = local11.method2028(-14795);
												local323 = (local3640 << 32) + local3645;
												local325 = false;
												local327 = 0;
												while (true) {
													if (local327 >= 100) {
														if (local745 <= 1 && Static543.method7194(local1205, (byte) -90)) {
															local325 = true;
														}
														break;
													}
													if (Static161.aLongArray11[local327] == local323) {
														local325 = true;
														break;
													}
													local327++;
												}
												if (!local325 && Static502.anInt8004 == 0) {
													Static161.aLongArray11[Static366.anInt5736] = local323;
													Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
													local410 = Static134.aClass246_1.method5420(local317).method8503(local11);
													if (local745 == 2) {
														Static169.method2734(local293, local410, (String) null, 18, "<img=1>" + local1205, "<img=1>" + local293, local317, 0);
													} else if (local745 == 1) {
														Static169.method2734(local293, local410, (String) null, 18, "<img=0>" + local1205, "<img=0>" + local293, local317, 0);
													} else {
														Static169.method2734(local293, local410, (String) null, 18, local1205, local293, local317, 0);
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static570.aClass397_153) {
												local100 = local11.method2075();
												local5815 = local11.method2062();
												Static579.method7513();
												Static544.method8470(local5815, local100);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static135.aClass397_181 == arg0.aClass397_131) {
												Static164.method2681(false);
												arg0.aClass397_131 = null;
												return false;
											} else if (arg0.aClass397_131 == Static78.aClass397_25) {
												local100 = local11.method2048(255);
												local539 = local11.method2060();
												Static380.aClass127_1.method2989(local539, local100);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static613.aClass397_166) {
												local100 = local11.method2028(-14795);
												if (local100 == 65535) {
													local100 = -1;
												}
												local539 = local11.method2048(255);
												local616 = local11.method2028(-14795);
												local709 = local11.method2048(255);
												local1732 = local11.method2028(-14795);
												Static606.method7781(false, local1732, local100, local709, local539, local616);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static111.aClass397_34 == arg0.aClass397_131) {
												local100 = local11.method2028(-14795);
												if (local100 == 65535) {
													local100 = -1;
												}
												local539 = local11.method2048(255);
												local616 = local11.method2028(-14795);
												local709 = local11.method2048(255);
												Static606.method7781(true, 256, local100, local709, local539, local616);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static185.aClass397_54) {
												local100 = local11.method2036();
												if (local100 != Static529.anInt8251) {
													Static529.anInt8251 = local100;
													Static540.method7162(Static227.aClass78_7, -1, -1);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static181.aClass397_52 == arg0.aClass397_131) {
												local1858 = local11.method2053() == 1;
												local539 = local11.method2036();
												if (local1858 != Static232.aBoolean233 || local539 != Static348.anInt5563) {
													Static232.aBoolean233 = local1858;
													Static348.anInt5563 = local539;
													Static540.method7162(Static373.aClass78_3, -1, -1);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (Static390.aClass397_95 == arg0.aClass397_131) {
												local100 = local11.method2044();
												local539 = local11.method2060();
												local616 = local11.method2044();
												if (local616 == 65535) {
													local616 = -1;
												}
												local709 = local11.method2075();
												local1732 = local11.method2069();
												local1589 = local11.method2048(255);
												local2729 = local1589 & 0x7;
												local745 = local1589 >> 3 & 0xF;
												if (local745 == 15) {
													local745 = -1;
												}
												local787 = (local1589 >> 7 & 0x1) == 1;
												@Pc(7959) int local7959;
												if (local1732 >> 30 == 0) {
													@Pc(8147) Class149 local8147;
													@Pc(8074) Class139 local8074;
													@Pc(8089) Class149 local8089;
													@Pc(8199) int local8199;
													if (local1732 >> 29 != 0) {
														local2365 = local1732 & 0xFFFF;
														@Pc(8031) Class3_Sub52 local8031 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local2365);
														if (local8031 != null) {
															@Pc(8036) Class9_Sub1_Sub1_Sub2_Sub2 local8036 = local8031.aClass9_Sub1_Sub1_Sub2_Sub2_2;
															@Pc(8041) Class407 local8041 = local8036.aClass407Array3[local709];
															if (local616 == 65535) {
																local616 = -1;
															}
															@Pc(8048) boolean local8048 = true;
															local7959 = local8041.anInt11162;
															if (local616 != -1 && local7959 != -1) {
																if (local7959 == local616) {
																	local8074 = Static381.aClass106_2.method2618(local616);
																	if (local8074.aBoolean218 && local8074.anInt3453 != -1) {
																		local8089 = Static592.aClass155_2.method3422(local8074.anInt3453);
																		@Pc(8092) int local8092 = local8089.anInt3736;
																		if (local8092 == 0 || local8092 == 2) {
																			local8048 = false;
																		} else if (local8092 == 1) {
																			local8048 = true;
																		}
																	}
																} else {
																	local8074 = Static381.aClass106_2.method2618(local616);
																	@Pc(8129) Class139 local8129 = Static381.aClass106_2.method2618(local7959);
																	if (local8074.anInt3453 != -1 && local8129.anInt3453 != -1) {
																		local8147 = Static592.aClass155_2.method3422(local8074.anInt3453);
																		@Pc(8153) Class149 local8153 = Static592.aClass155_2.method3422(local8129.anInt3453);
																		if (local8153.anInt3741 > local8147.anInt3741) {
																			local8048 = false;
																		}
																	}
																}
															}
															if (local8048) {
																local8041.anInt11163 = local745;
																local8041.anInt11162 = local616;
																local8041.anInt11161 = local100;
																if (local616 == -1) {
																	local8041.aClass45_11.method6576(-1);
																} else {
																	local8074 = Static381.aClass106_2.method2618(local616);
																	local8199 = local8074.aBoolean218 ? 0 : 2;
																	if (local787) {
																		local8199 = 1;
																	}
																	local8041.aClass45_11.method6586(local8199, local539, false, local8074.anInt3453);
																}
															}
														}
													} else if (local1732 >> 28 != 0) {
														local2365 = local1732 & 0xFFFF;
														@Pc(8229) Class9_Sub1_Sub1_Sub2_Sub1 local8229;
														if (Static574.anInt8718 == local2365) {
															local8229 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2;
														} else {
															local8229 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local2365];
														}
														if (local8229 != null) {
															if (local616 == 65535) {
																local616 = -1;
															}
															@Pc(8251) Class407 local8251 = local8229.aClass407Array3[local709];
															local2373 = true;
															local2375 = local8251.anInt11162;
															@Pc(8274) Class139 local8274;
															if (local616 != -1 && local2375 != -1) {
																if (local616 == local2375) {
																	local8274 = Static381.aClass106_2.method2618(local616);
																	if (local8274.aBoolean218 && local8274.anInt3453 != -1) {
																		@Pc(8334) Class149 local8334 = Static592.aClass155_2.method3422(local8274.anInt3453);
																		local8199 = local8334.anInt3736;
																		if (local8199 == 0 || local8199 == 2) {
																			local2373 = false;
																		} else if (local8199 == 1) {
																			local2373 = true;
																		}
																	}
																} else {
																	local8274 = Static381.aClass106_2.method2618(local616);
																	local8074 = Static381.aClass106_2.method2618(local2375);
																	if (local8274.anInt3453 != -1 && local8074.anInt3453 != -1) {
																		local8089 = Static592.aClass155_2.method3422(local8274.anInt3453);
																		local8147 = Static592.aClass155_2.method3422(local8074.anInt3453);
																		if (local8089.anInt3741 < local8147.anInt3741) {
																			local2373 = false;
																		}
																	}
																}
															}
															if (local2373) {
																local8251.anInt11163 = local745;
																local8251.anInt11162 = local616;
																local8251.anInt11161 = local100;
																local8251.anInt11160 = local2729;
																if (local616 == -1) {
																	local8251.aClass45_11.method6576(-1);
																} else {
																	local8274 = Static381.aClass106_2.method2618(local616);
																	@Pc(8395) int local8395 = local8274.aBoolean218 ? 0 : 2;
																	if (local787) {
																		local8395 = 1;
																	}
																	local8251.aClass45_11.method6586(local8395, local539, false, local8274.anInt3453);
																}
															}
														}
													}
												} else {
													local2365 = local1732 >> 28 & 0x3;
													@Pc(7886) int local7886 = (local1732 >> 14 & 0x3FFF) - Static291.anInt4448;
													local3659 = (local1732 & 0x3FFF) - Static189.anInt3243;
													if (local7886 >= 0 && local3659 >= 0 && Static497.anInt7926 > local7886 && local3659 < Static646.anInt9979) {
														if (local616 == -1) {
															@Pc(7932) Class3_Sub7_Sub9 local7932 = (Class3_Sub7_Sub9) Static53.aClass313_6.method7104((long) (local7886 << 16 | local3659));
															if (local7932 != null) {
																local7932.aClass9_Sub1_Sub1_Sub3_1.method1293();
																local7932.method9596();
															}
														} else {
															local327 = local7886 * 512 + 256;
															local2375 = local3659 * 512 + 256;
															local7959 = local2365;
															if (local2365 < 3 && Static574.method7435(local7886, local3659)) {
																local7959 = local2365 + 1;
															}
															@Pc(7996) Class9_Sub1_Sub1_Sub3 local7996 = new Class9_Sub1_Sub1_Sub3(local616, local539, local2365, local7959, local327, Static77.method1633(local2375, local327, local2365) - local100, local2375, local7886, local7886, local3659, local3659, local2729, local787);
															Static53.aClass313_6.method7107((long) (local3659 | local7886 << 16), new Class3_Sub7_Sub9(local7996));
														}
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static614.aClass397_167) {
												Static609.method7804();
												arg0.aClass397_131 = null;
												return false;
											} else if (Static648.aClass397_175 == arg0.aClass397_131) {
												local1858 = local11.method2048(255) == 1;
												local293 = local11.method2014();
												local1205 = local293;
												if (local1858) {
													local1205 = local11.method2014();
												}
												local709 = local11.method2048(255);
												local1732 = local11.method2028(-14795);
												local3878 = false;
												if (local709 <= 1 && Static543.method7194(local1205, (byte) -26)) {
													local3878 = true;
												}
												if (!local3878 && Static502.anInt8004 == 0) {
													local1091 = Static134.aClass246_1.method5420(local1732).method8503(local11);
													if (local709 == 2) {
														Static169.method2734(local293, local1091, (String) null, 25, "<img=1>" + local1205, "<img=1>" + local293, local1732, 0);
													} else if (local709 == 1) {
														Static169.method2734(local293, local1091, (String) null, 25, "<img=0>" + local1205, "<img=0>" + local293, local1732, 0);
													} else {
														Static169.method2734(local293, local1091, (String) null, 25, local1205, local293, local1732, 0);
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static171.aClass397_157) {
												Static605.method7770(Static383.aClass344_8);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static330.aClass397_172 == arg0.aClass397_131) {
												Static281.anInt4323 = Static475.anInt7494;
												local1858 = local11.method2048(255) == 1;
												@Pc(8627) Class323 local8627 = new Class323(local11);
												@Pc(8631) Class84 local8631;
												if (local1858) {
													local8631 = Static35.aClass84_1;
												} else {
													local8631 = Static215.aClass84_2;
												}
												local8627.method7222(local8631);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static217.aClass397_58 == arg0.aClass397_131) {
												Static281.anInt4323 = Static475.anInt7494;
												local1858 = local11.method2048(255) == 1;
												if (arg0.anInt8012 != 1) {
													if (local1858) {
														Static35.aClass84_1 = new Class84(local11);
													} else {
														Static215.aClass84_2 = new Class84(local11);
													}
													arg0.aClass397_131 = null;
													return true;
												}
												if (local1858) {
													Static35.aClass84_1 = null;
												} else {
													Static215.aClass84_2 = null;
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static271.aClass397_74) {
												Static605.method7770(Static425.aClass344_9);
												arg0.aClass397_131 = null;
												return true;
											} else if (Static541.aClass397_142 == arg0.aClass397_131) {
												local100 = local11.method2060();
												@Pc(8736) int[] local8736 = new int[4];
												for (local616 = 0; local616 < 4; local616++) {
													local8736[local616] = local11.method2044();
												}
												local709 = local11.method2039();
												@Pc(8763) Class3_Sub52 local8763 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local100);
												if (local8763 != null) {
													Static98.method1975(local8736, true, local8763.aClass9_Sub1_Sub1_Sub2_Sub2_2, local709);
												}
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static274.aClass397_75) {
												Static684.aClass74_4 = Static283.method3998(local11.method2048(255));
												arg0.aClass397_131 = null;
												return true;
											} else if (Static335.aClass397_87 == arg0.aClass397_131) {
												Static605.method7770(Static507.aClass344_11);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static571.aClass397_156) {
												Static363.method5381();
												arg0.aClass397_131 = null;
												return false;
											} else if (arg0.aClass397_131 == Static565.aClass397_151) {
												Static685.method5296(Static122.aClass47_1, local11, arg0.anInt8012);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static686.aClass397_179) {
												Static605.method7770(Static111.aClass344_2);
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static471.aClass397_115) {
												Static57.aBoolean103 = local11.method2075() == 1;
												arg0.aClass397_131 = null;
												return true;
											} else if (arg0.aClass397_131 == Static167.aClass397_48) {
												local1858 = local11.method2048(255) == 1;
												local293 = local11.method2014();
												local303 = (long) local11.method2028(-14795);
												local308 = (long) local11.method2061();
												local2729 = local11.method2048(255);
												@Pc(8917) long local8917 = (local303 << 32) + local308;
												local1145 = false;
												@Pc(8928) Class3_Sub14 local8928 = local1858 ? Static107.aClass3_Sub14_10 : Static12.aClass3_Sub14_15;
												if (local8928 == null) {
													local1145 = true;
												} else {
													label2330: {
														for (local3659 = 0; local3659 < 100; local3659++) {
															if (local8917 == Static161.aLongArray11[local3659]) {
																local1145 = true;
																break label2330;
															}
														}
														if (local2729 <= 1) {
															if (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293) {
																local1145 = true;
															} else if (Static543.method7194(local293, (byte) -104)) {
																local1145 = true;
															}
														}
													}
												}
												if (!local1145 && Static502.anInt8004 == 0) {
													Static161.aLongArray11[Static366.anInt5736] = local8917;
													Static366.anInt5736 = (Static366.anInt5736 + 1) % 100;
													local3737 = Static411.method5495(-4712, Static206.method3543(local11));
													local327 = local1858 ? 41 : 44;
													if (local2729 == 2 || local2729 == 3) {
														Static169.method2734(local293, local3737, local8928.aString32, local327, "<img=1>" + local293, "<img=1>" + local293, -1, 0);
													} else if (local2729 == 1) {
														Static169.method2734(local293, local3737, local8928.aString32, local327, "<img=0>" + local293, "<img=0>" + local293, -1, 0);
													} else {
														Static169.method2734(local293, local3737, local8928.aString32, local327, local293, local293, -1, 0);
													}
												}
												arg0.aClass397_131 = null;
												return true;
											} else {
												Static275.method4893("T1 - " + (arg0.aClass397_131 == null ? -1 : arg0.aClass397_131.method9308()) + "," + (arg0.aClass397_130 == null ? -1 : arg0.aClass397_130.method9308()) + "," + (arg0.aClass397_133 == null ? -1 : arg0.aClass397_133.method9308()) + " - " + arg0.anInt8012, (Throwable) null);
												Static164.method2681(false);
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

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg3 > arg2 && arg2 + arg4 > arg3) {
			return arg5 < arg6 + arg1 && arg7 + arg5 > arg6;
		} else {
			return false;
		}
	}
}
