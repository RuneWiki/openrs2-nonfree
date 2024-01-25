import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
	public static int anInt7075;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "[[Lclient!rb;")
	public static Class41_Sub2[][] aClass41_Sub2ArrayArray1;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_13 = new Class262(2, 4);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	public static int anInt7072 = -1;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)Z")
	public static boolean method5937(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method5938(@OriginalArg(0) Class45 arg0) {
		@Pc(7) int local7 = Static211.anInt3825;
		@Pc(9) int local9 = Static538.anInt8629;
		@Pc(11) int local11 = Static520.anInt9775;
		@Pc(15) int local15 = Static122.anInt2800 - 3;
		if (Static591.aClass14_34 == null || Static377.aClass14_19 == null) {
			if (Static552.aClass322_150.method6797(Static180.anInt3476) && Static552.aClass322_150.method6797(Static41.anInt764)) {
				Static591.aClass14_34 = arg0.method7398(Static604.method6161(Static552.aClass322_150, Static180.anInt3476, 0), true);
				@Pc(61) Class279 local61 = Static604.method6161(Static552.aClass322_150, Static41.anInt764, 0);
				Static377.aClass14_19 = arg0.method7398(local61, true);
				local61.method6154();
				Static70.aClass14_5 = arg0.method7398(local61, true);
			} else {
				arg0.J(local7, local9, local11, 20, 255 - Static64.anInt1499 << 24 | Static342.anInt6008, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static591.aClass14_34 != null && Static377.aClass14_19 != null) {
			local88 = (local11 - Static377.aClass14_19.E() * 2) / Static591.aClass14_34.E();
			for (local90 = 0; local90 < local88; local90++) {
				Static591.aClass14_34.method7680(Static377.aClass14_19.E() + local7 + local90 * Static591.aClass14_34.E(), local9);
			}
			Static377.aClass14_19.method7680(local7, local9);
			Static70.aClass14_5.method7680(local7 + local11 - Static70.aClass14_5.E(), local9);
		}
		Static460.aClass54_10.method7796(Static544.aClass343_28.method7222(Static256.anInt4535), -1, local7 + 3, Static393.anInt6879 | 0xFF000000, local9 + 14);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static342.anInt6008 | -Static64.anInt1499 + 255 << 24, 1);
		local88 = Static465.aClass86_1.method7267();
		local90 = Static465.aClass86_1.method7265();
		@Pc(173) int local173 = 0;
		@Pc(194) int local194;
		for (@Pc(178) Class3_Sub43 local178 = (Class3_Sub43) Static133.aClass112_20.method3088(); local178 != null; local178 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			local194 = (Static571.anInt9281 - local173 - 1) * 16 + local9 + 13 + 20;
			local173++;
			if (local7 < local88 && local88 < local11 + local7 && local90 > local194 - 13 && local90 < local194 + 4 && local178.aBoolean608) {
				arg0.J(local7, local194 - 12, local11, 16, 255 - Static303.anInt5117 << 24 | Static179.anInt3467, 1);
			}
		}
		if ((Static117.aClass14_8 == null || Static138.aClass14_9 == null || Static317.aClass14_17 == null) && Static552.aClass322_150.method6797(Static91.anInt1907) && Static552.aClass322_150.method6797(Static372.anInt6394) && Static552.aClass322_150.method6797(Static35.anInt640)) {
			@Pc(282) Class279 local282 = Static604.method6161(Static552.aClass322_150, Static372.anInt6394, 0);
			Static138.aClass14_9 = arg0.method7398(local282, true);
			local282.method6154();
			Static60.aClass14_4 = arg0.method7398(local282, true);
			Static117.aClass14_8 = arg0.method7398(Static604.method6161(Static552.aClass322_150, Static91.anInt1907, 0), true);
			@Pc(307) Class279 local307 = Static604.method6161(Static552.aClass322_150, Static35.anInt640, 0);
			Static317.aClass14_17 = arg0.method7398(local307, true);
			local307.method6154();
			Static83.aClass14_6 = arg0.method7398(local307, true);
		}
		@Pc(378) int local378;
		@Pc(338) int local338;
		if (Static117.aClass14_8 != null && Static138.aClass14_9 != null && Static317.aClass14_17 != null) {
			local194 = (local11 - Static317.aClass14_17.E() * 2) / Static117.aClass14_8.E();
			for (local338 = 0; local338 < local194; local338++) {
				Static117.aClass14_8.method7680(Static317.aClass14_17.E() + local7 + Static117.aClass14_8.E() * local338, -Static117.aClass14_8.u() + local9 - -local15);
			}
			local378 = (local15 - Static317.aClass14_17.u() - 20) / Static138.aClass14_9.u();
			for (@Pc(380) int local380 = 0; local380 < local378; local380++) {
				Static138.aClass14_9.method7680(local7, local9 + Static138.aClass14_9.u() * local380 + 20);
				Static60.aClass14_4.method7680(local7 + local11 - Static60.aClass14_4.E(), local9 - (-20 - Static138.aClass14_9.u() * local380));
			}
			Static317.aClass14_17.method7680(local7, local9 + local15 - Static317.aClass14_17.u());
			Static83.aClass14_6.method7680(local7 + local11 - Static317.aClass14_17.E(), local9 - -local15 - Static317.aClass14_17.u());
		}
		local173 = 0;
		for (@Pc(454) Class3_Sub43 local454 = (Class3_Sub43) Static133.aClass112_20.method3088(); local454 != null; local454 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			local338 = (Static571.anInt9281 - local173 - 1) * 16 + local9 + 33;
			local378 = Static393.anInt6879 | 0xFF000000;
			if (local7 < local88 && local11 + local7 > local88 && local90 > local338 - 13 && local90 < local338 + 4 && local454.aBoolean608) {
				local378 = Static509.anInt8273 | 0xFF000000;
			}
			@Pc(510) int[] local510 = null;
			if (Static354.method5255(local454.anInt7753)) {
				local510 = Static6.aClass92_1.method2673((int) local454.aLong221).anIntArray291;
			} else if (local454.anInt7751 != -1) {
				local510 = Static6.aClass92_1.method2673(local454.anInt7751).anIntArray291;
			} else if (Static246.method3794(local454.anInt7753)) {
				@Pc(543) Class3_Sub34 local543 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local454.aLong221);
				if (local543 != null) {
					@Pc(548) Class41_Sub2_Sub1_Sub4_Sub1 local548 = local543.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					@Pc(551) Class264 local551 = local548.aClass264_1;
					if (local551.anIntArray443 != null) {
						local551 = local551.method5994(Static491.aClass318_1);
					}
					if (local551 != null) {
						local510 = local551.anIntArray444;
					}
				}
			} else if (Static440.method6182(local454.anInt7753)) {
				@Pc(589) Class280 local589;
				if (local454.anInt7753 == 1011) {
					local589 = Static478.aClass212_3.method4793((int) local454.aLong221);
				} else {
					local589 = Static478.aClass212_3.method4793((int) (local454.aLong221 >>> 32 & 0x7FFFFFFFL));
				}
				if (local589.anIntArray457 != null) {
					local589 = local589.method6181(Static491.aClass318_1);
				}
				if (local589 != null) {
					local510 = local589.anIntArray459;
				}
			}
			@Pc(623) String local623 = Static143.method2767(local454);
			if (local510 != null) {
				local623 = local623 + Static94.method1753(local510);
			}
			Static460.aClass54_10.method7788(Static348.aClass14Array12, Static129.anIntArray133, local623, local378, local338, local7 + 3);
			local173++;
			if (local454.aBoolean607) {
				Static362.aClass14_18.method7680(Static75.aClass134_7.method3348(local623) + local7 + 5, local338 - 12);
			}
		}
		Static129.method2607(Static211.anInt3825, Static538.anInt8629, Static122.anInt2800, Static520.anInt9775);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!r;I)V")
	public static void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static62.anInt1476 == 0 || Static342.anInt6002 == 0) {
			return;
		}
		arg2.la(Static157.anInt3283, Static585.anInt9430, Static62.anInt1476, Static342.anInt6002);
		arg2.da(Static38.anInt726, Static491.anInt8009, Static62.anInt1476, Static342.anInt6002);
		@Pc(36) Class11 local36 = arg2.method7422();
		local36.na(Static310.anInt5292, Static121.anInt2793, Static480.anInt7907, Static162.anInt985, Static187.anInt3554, Static303.anInt5127);
		arg2.method7367(local36);
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(126) int[] local126;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(171) int local171;
		if (Static108.aClass34Array6 != null) {
			@Pc(51) int local51 = -1;
			@Pc(53) int local53 = -1;
			local56 = arg2.BA();
			local64 = (arg0 - Static157.anInt3283) * local56 / Static62.anInt1476;
			local73 = local56 * (arg1 - Static585.anInt9430) / Static342.anInt6002;
			local76 = arg2.U();
			local84 = (arg0 - Static157.anInt3283) * local76 / Static62.anInt1476;
			local93 = local76 * (arg1 - Static585.anInt9430) / Static342.anInt6002;
			@Pc(108) int[] local108 = new int[] { local64, local73, local56 };
			local36.YA(local108);
			local126 = new int[] { local84, local93, local76 };
			local36.YA(local126);
			@Pc(131) float local131 = 0.0F;
			local140 = local126[0] - local108[0];
			local149 = local126[1] - local108[1];
			local158 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				local171 = (int) ((float) local140 * local131 + (float) local108[0]);
				@Pc(175) int local175 = local171 >> 9;
				@Pc(186) int local186 = (int) ((float) local108[2] + local131 * (float) local158);
				@Pc(190) int local190 = local186 >> 9;
				if (local175 > 0 && local190 > 0 && local175 < Static54.anInt1038 && Static140.anInt3026 > local190) {
					@Pc(207) int local207 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117;
					if (local207 < 3 && (Static503.aByteArrayArrayArray11[1][local175][local190] & 0x2) != 0) {
						local207++;
					}
					if ((float) Static108.aClass34Array6[local207].method6530(local171, local186) < (float) local108[1] + (float) local149 * local131) {
						local51 = (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() - 1 << 8) + local171 >> 9;
						local53 = local186 + (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() - 1 << 8) >> 9;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local51 != -1 && local53 != -1) {
				if (Static369.aBoolean463 && (Static215.anInt3875 & 0x40) != 0) {
					@Pc(303) Class361 local303 = Static556.method7352(Static377.anInt6474, Static196.anInt9125);
					if (local303 == null) {
						Static296.method4392();
					} else {
						Static137.method2680(-1, local53, " ->", 0L, true, 11, Static16.aString4, false, Static288.anInt4931, local51);
					}
				} else {
					if (Static473.aClass274_4 == Static121.aClass274_1) {
						Static137.method2680(-1, local53, "", 0L, true, 15, Static544.aClass343_31.method7222(Static256.anInt4535), false, -1, local51);
					}
					Static137.method2680(-1, local53, "", 0L, true, 19, Static355.aString44, false, Static299.anInt5096, local51);
				}
			}
		}
		@Pc(359) Class178 local359 = Static212.aClass178_7;
		for (@Pc(364) Class41_Sub10 local364 = (Class41_Sub10) local359.method4168(); local364 != null; local364 = (Class41_Sub10) local359.method4165()) {
			if ((Static392.aBoolean512 || Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 == local364.aClass41_Sub2_1.aByte117) && local364.method7818(arg1, arg2, arg0)) {
				if (local364.aClass41_Sub2_1 instanceof Class41_Sub2_Sub1) {
					local56 = ((Class41_Sub2_Sub1) local364.aClass41_Sub2_1).aShort147;
					local64 = ((Class41_Sub2_Sub1) local364.aClass41_Sub2_1).aShort144;
				} else {
					local56 = local364.aClass41_Sub2_1.anInt9444 >> 9;
					local64 = local364.aClass41_Sub2_1.anInt9442 >> 9;
				}
				@Pc(489) int local489;
				@Pc(607) int local607;
				if (local364.aClass41_Sub2_1 instanceof Class41_Sub2_Sub1_Sub4_Sub2) {
					@Pc(421) Class41_Sub2_Sub1_Sub4_Sub2 local421 = (Class41_Sub2_Sub1_Sub4_Sub2) local364.aClass41_Sub2_1;
					local76 = local421.method7858();
					if ((local76 & 0x1) == 0 && (local421.anInt9444 & 0x1FF) == 0 && (local421.anInt9442 & 0x1FF) == 0 || (local76 & 0x1) == 1 && (local421.anInt9444 & 0x1FF) == 256 && (local421.anInt9442 & 0x1FF) == 256) {
						local84 = local421.anInt9444 - (local421.method7858() - 1 << 8);
						local93 = local421.anInt9442 - (local421.method7858() - 1 << 8);
						for (local489 = 0; local489 < Static88.anInt1884; local489++) {
							@Pc(502) Class3_Sub34 local502 = (Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local489]);
							if (local502 != null) {
								@Pc(507) Class41_Sub2_Sub1_Sub4_Sub1 local507 = local502.aClass41_Sub2_Sub1_Sub4_Sub1_2;
								if (local507.anInt9502 != Static506.anInt8251 && local507.aBoolean740) {
									local140 = local507.anInt9444 - (local507.aClass264_1.anInt7163 - 1 << 8);
									local149 = local507.anInt9442 - (local507.aClass264_1.anInt7163 - 1 << 8);
									if (local84 <= local140 && local507.aClass264_1.anInt7163 <= local421.method7858() - (local140 - local84 >> 9) && local93 <= local149 && local507.aClass264_1.anInt7163 <= local421.method7858() - (local149 - local93 >> 9)) {
										Static189.method3219(local364.aClass41_Sub2_1.aByte117 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, local507);
										local507.anInt9502 = Static506.anInt8251;
									}
								}
							}
						}
						local607 = Static403.anInt6982;
						@Pc(609) int[] local609 = Static430.anIntArray447;
						for (local140 = 0; local140 < local607; local140++) {
							@Pc(619) Class41_Sub2_Sub1_Sub4_Sub2 local619 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local609[local140]];
							if (local619 != null && local619.anInt9502 != Static506.anInt8251 && local421 != local619 && local619.aBoolean740) {
								local158 = local619.anInt9444 - (local619.method7858() - 1 << 8);
								local171 = local619.anInt9442 - (local619.method7858() - 1 << 8);
								if (local84 <= local158 && local619.method7858() <= local421.method7858() - (local158 - local84 >> 9) && local93 <= local171 && local619.method7858() <= local421.method7858() - (local171 - local93 >> 9)) {
									Static382.method5658(local619, local364.aClass41_Sub2_1.aByte117 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117);
									local619.anInt9502 = Static506.anInt8251;
								}
							}
						}
					}
					if (local421.anInt9502 == Static506.anInt8251) {
						continue;
					}
					Static382.method5658(local421, local364.aClass41_Sub2_1.aByte117 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117);
					local421.anInt9502 = Static506.anInt8251;
				}
				@Pc(873) int local873;
				if (local364.aClass41_Sub2_1 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
					@Pc(759) Class41_Sub2_Sub1_Sub4_Sub1 local759 = (Class41_Sub2_Sub1_Sub4_Sub1) local364.aClass41_Sub2_1;
					if (local759.aClass264_1 != null) {
						if ((local759.aClass264_1.anInt7163 & 0x1) == 0 && (local759.anInt9444 & 0x1FF) == 0 && (local759.anInt9442 & 0x1FF) == 0 || (local759.aClass264_1.anInt7163 & 0x1) == 1 && (local759.anInt9444 & 0x1FF) == 256 && (local759.anInt9442 & 0x1FF) == 256) {
							local76 = local759.anInt9444 - (local759.aClass264_1.anInt7163 - 1 << 8);
							local84 = local759.anInt9442 - (local759.aClass264_1.anInt7163 - 1 << 8);
							for (local93 = 0; local93 < Static88.anInt1884; local93++) {
								@Pc(840) Class3_Sub34 local840 = (Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local93]);
								if (local840 != null) {
									@Pc(845) Class41_Sub2_Sub1_Sub4_Sub1 local845 = local840.aClass41_Sub2_Sub1_Sub4_Sub1_2;
									if (local845.anInt9502 != Static506.anInt8251 && local759 != local845 && local845.aBoolean740) {
										local873 = local845.anInt9444 - (local845.aClass264_1.anInt7163 - 1 << 8);
										local140 = local845.anInt9442 - (local845.aClass264_1.anInt7163 - 1 << 8);
										if (local76 <= local873 && local845.aClass264_1.anInt7163 <= local759.aClass264_1.anInt7163 - (local873 - local76 >> 9) && local84 <= local140 && local759.aClass264_1.anInt7163 - (local140 - local84 >> 9) >= local845.aClass264_1.anInt7163) {
											Static189.method3219(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != local364.aClass41_Sub2_1.aByte117, local845);
											local845.anInt9502 = Static506.anInt8251;
										}
									}
								}
							}
							local489 = Static403.anInt6982;
							local126 = Static430.anIntArray447;
							for (local873 = 0; local873 < local489; local873++) {
								@Pc(965) Class41_Sub2_Sub1_Sub4_Sub2 local965 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local126[local873]];
								if (local965 != null && local965.anInt9502 != Static506.anInt8251 && local965.aBoolean740) {
									local149 = local965.anInt9444 - (local965.method7858() - 1 << 8);
									local158 = local965.anInt9442 - (local965.method7858() - 1 << 8);
									if (local76 <= local149 && local965.method7858() <= local759.aClass264_1.anInt7163 - (local149 - local76 >> 9) && local84 <= local158 && local965.method7858() <= local759.aClass264_1.anInt7163 - (local158 - local84 >> 9)) {
										Static382.method5658(local965, local364.aClass41_Sub2_1.aByte117 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117);
										local965.anInt9502 = Static506.anInt8251;
									}
								}
							}
						}
						if (local759.anInt9502 == Static506.anInt8251) {
							continue;
						}
						Static189.method3219(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != local364.aClass41_Sub2_1.aByte117, local759);
						local759.anInt9502 = Static506.anInt8251;
					}
				}
				if (local364.aClass41_Sub2_1 instanceof Class41_Sub2_Sub4_Sub1) {
					local73 = local56 + Static335.anInt5608;
					local76 = local64 + Static246.anInt4344;
					@Pc(1123) Class3_Sub31 local1123 = (Class3_Sub31) Static211.aClass354_17.method7689((long) (local73 | local76 << 14 | local364.aClass41_Sub2_1.aByte117 << 28));
					if (local1123 != null) {
						for (@Pc(1131) Class3_Sub25 local1131 = (Class3_Sub25) local1123.aClass112_28.method3086(); local1131 != null; local1131 = (Class3_Sub25) local1123.aClass112_28.method3080()) {
							@Pc(1139) Class197 local1139 = Static6.aClass92_1.method2673(local1131.anInt3630);
							if (Static369.aBoolean463 && local364.aClass41_Sub2_1.aByte117 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
								@Pc(1162) Class10 local1162 = Static176.anInt3442 == -1 ? null : Static137.aClass124_1.method3255(Static176.anInt3442);
								if ((Static215.anInt3875 & 0x1) != 0 && (local1162 == null || local1139.method4527(local1162.anInt193, Static176.anInt3442) != local1162.anInt193)) {
									Static137.method2680(-1, local64, Static585.aString93 + " -> <col=ff9040>" + local1139.aString38, (long) local1131.anInt3630, true, 50, Static16.aString4, false, Static288.anInt4931, local56);
								}
							}
							if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 == local364.aClass41_Sub2_1.aByte117) {
								@Pc(1218) String[] local1218 = local1139.aStringArray21;
								for (local873 = 4; local873 >= 0; local873--) {
									if (local1218 != null && local1218[local873] != null) {
										@Pc(1230) byte local1230 = 0;
										local149 = Static559.anInt9109;
										if (local873 == 0) {
											local1230 = 47;
										}
										if (local873 == 1) {
											local1230 = 45;
										}
										if (local873 == 2) {
											local1230 = 46;
										}
										if (local873 == 3) {
											local1230 = 60;
										}
										if (local873 == 4) {
											local1230 = 9;
										}
										if (local1139.anInt5208 == local873) {
											local149 = local1139.anInt5228;
										}
										if (local1139.anInt5194 == local873) {
											local149 = local1139.anInt5249;
										}
										Static137.method2680(-1, local64, "<col=ff9040>" + local1139.aString38, (long) local1131.anInt3630, true, local1230, local1218[local873], false, local149, local56);
									}
								}
							}
							Static137.method2680(-1, local64, "<col=ff9040>" + local1139.aString38, (long) local1131.anInt3630, true, 1003, Static544.aClass343_26.method7222(Static256.anInt4535), Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != local364.aClass41_Sub2_1.aByte117, anInt7072, local56);
						}
					}
				}
				if (local364.aClass41_Sub2_1 instanceof Interface4) {
					@Pc(1362) Interface4 local1362 = (Interface4) local364.aClass41_Sub2_1;
					@Pc(1371) Class280 local1371 = Static478.aClass212_3.method4793(local1362.method7561());
					if (local1371.anIntArray457 != null) {
						local1371 = local1371.method6181(Static491.aClass318_1);
					}
					if (local1371 != null) {
						if (Static369.aBoolean463 && local364.aClass41_Sub2_1.aByte117 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
							@Pc(1399) Class10 local1399 = Static176.anInt3442 == -1 ? null : Static137.aClass124_1.method3255(Static176.anInt3442);
							if ((Static215.anInt3875 & 0x4) != 0 && (local1399 == null || local1371.method6170(local1399.anInt193, Static176.anInt3442) != local1399.anInt193)) {
								Static137.method2680(-1, local64, Static585.aString93 + " -> <col=00ffff>" + local1371.aString71, Static85.method1681(local1362, local64, local56), true, 22, Static16.aString4, false, Static288.anInt4931, local56);
							}
						}
						if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 == local364.aClass41_Sub2_1.aByte117) {
							@Pc(1460) String[] local1460 = local1371.aStringArray30;
							if (local1460 != null) {
								for (local93 = 4; local93 >= 0; local93--) {
									if (local1460[local93] != null) {
										@Pc(1472) short local1472 = 0;
										if (local93 == 0) {
											local1472 = 12;
										}
										local607 = Static559.anInt9109;
										if (local93 == 1) {
											local1472 = 17;
										}
										if (local93 == 2) {
											local1472 = 2;
										}
										if (local93 == 3) {
											local1472 = 57;
										}
										if (local93 == local1371.anInt7366) {
											local607 = local1371.anInt7379;
										}
										if (local93 == 4) {
											local1472 = 1004;
										}
										if (local93 == local1371.anInt7381) {
											local607 = local1371.anInt7387;
										}
										Static137.method2680(-1, local64, "<col=00ffff>" + local1371.aString71, Static85.method1681(local1362, local64, local56), true, local1472, local1460[local93], false, local607, local56);
									}
								}
							}
						}
						Static137.method2680(-1, local64, "<col=00ffff>" + local1371.aString71, (long) local1371.anInt7369, true, 1011, Static544.aClass343_26.method7222(Static256.anInt4535), local364.aClass41_Sub2_1.aByte117 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, anInt7072, local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5941(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static410.method5910(Static554.method7335(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
