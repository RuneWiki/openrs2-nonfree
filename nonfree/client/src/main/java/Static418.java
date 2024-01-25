import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!uu", name = "M", descriptor = "Lclient!ew;")
	public static Class72 aClass72_44 = new Class72(8);

	@OriginalMember(owner = "client!uu", name = "cb", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!uu", name = "eb", descriptor = "Z")
	public static boolean aBoolean496 = true;

	@OriginalMember(owner = "client!uu", name = "ib", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_154 = new Class211(67, -1);

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)Z")
	public static boolean method5299() throws IOException {
		if (Static375.aClass160_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static375.aClass160_3.method3211();
		if (local13 == 0) {
			return false;
		}
		@Pc(67) int local67;
		if (Static175.aClass211_73 == null) {
			if (Static286.aBoolean332) {
				local13--;
				Static375.aClass160_3.method3207(1, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
				Static286.aBoolean332 = false;
				Static401.anInt6548++;
			}
			Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
			if (Static26.aClass2_Sub13_Sub2_1.method3618()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static375.aClass160_3.method3207(1, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 1);
				Static401.anInt6548++;
			}
			Static286.aBoolean332 = true;
			@Pc(63) Class211[] local63 = Static260.method3497();
			local67 = Static26.aClass2_Sub13_Sub2_1.method3606();
			if (local67 < 0 || local63.length <= local67) {
				throw new IOException("invo:" + local67 + " ip:" + Static26.aClass2_Sub13_Sub2_1.anInt4347);
			}
			Static175.aClass211_73 = local63[local67];
			Static209.anInt3493 = Static175.aClass211_73.anInt5746;
		}
		if (Static209.anInt3493 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static375.aClass160_3.method3207(1, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
			Static401.anInt6548++;
			Static209.anInt3493 = Static26.aClass2_Sub13_Sub2_1.aByteArray52[0] & 0xFF;
			local13--;
		}
		if (Static209.anInt3493 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static375.aClass160_3.method3207(2, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
			Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
			local13 -= 2;
			Static209.anInt3493 = Static26.aClass2_Sub13_Sub2_1.method3555();
			Static401.anInt6548 += 2;
		}
		if (local13 < Static209.anInt3493) {
			return false;
		}
		Static26.aClass2_Sub13_Sub2_1.anInt4347 = 0;
		Static375.aClass160_3.method3207(Static209.anInt3493, Static26.aClass2_Sub13_Sub2_1.aByteArray52, 0);
		Static401.anInt6548 += Static209.anInt3493;
		Static375.anInt6250 = 0;
		Static246.aClass211_95 = Static248.aClass211_96;
		Static248.aClass211_96 = Static208.aClass211_83;
		Static208.aClass211_83 = Static175.aClass211_73;
		if (Static36.aClass211_22 == Static175.aClass211_73) {
			Static240.method3071(Static364.aClass225_16);
			Static175.aClass211_73 = null;
			return true;
		}
		@Pc(205) int local205;
		@Pc(213) int local213;
		if (Static303.aClass211_113 == Static175.aClass211_73) {
			local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
			local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local213 = Static26.aClass2_Sub13_Sub2_1.method3574();
			if (Static430.method5387(local67)) {
				Static242.method3083(local205, local213);
			}
			Static175.aClass211_73 = null;
			return true;
		}
		@Pc(244) int local244;
		if (Static124.aClass211_33 == Static175.aClass211_73) {
			local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local67 = Static26.aClass2_Sub13_Sub2_1.method3553();
			local213 = Static26.aClass2_Sub13_Sub2_1.method3559();
			local244 = Static26.aClass2_Sub13_Sub2_1.method3539();
			if (Static430.method5387(local205)) {
				Static75.method1120(local67, local244, local213);
			}
			Static175.aClass211_73 = null;
			return true;
		}
		@Pc(268) String local268;
		if (Static175.aClass211_73 == Static116.aClass211_54) {
			local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
			local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
			@Pc(274) Object[] local274 = new Object[local268.length() + 1];
			for (local244 = local268.length() - 1; local244 >= 0; local244--) {
				if (local268.charAt(local244) == 's') {
					local274[local244 + 1] = Static26.aClass2_Sub13_Sub2_1.method3582();
				} else {
					local274[local244 + 1] = Integer.valueOf(Static26.aClass2_Sub13_Sub2_1.method3574());
				}
			}
			local274[0] = Integer.valueOf(Static26.aClass2_Sub13_Sub2_1.method3574());
			if (Static430.method5387(local205)) {
				@Pc(330) Class2_Sub44 local330 = new Class2_Sub44();
				local330.anObjectArray36 = local274;
				Static191.method2562(local330);
			}
			Static175.aClass211_73 = null;
			return true;
		} else if (Static228.aClass211_88 == Static175.aClass211_73) {
			Static11.anInt160 = Static26.aClass2_Sub13_Sub2_1.method3556();
			Static150.anInt2650 = Static26.aClass2_Sub13_Sub2_1.method3580();
			Static175.aClass211_73 = null;
			return true;
		} else {
			@Pc(368) boolean local368;
			if (Static295.aClass211_108 == Static175.aClass211_73) {
				local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
				@Pc(373) byte[] local373 = new byte[Static209.anInt3493 - 1];
				Static26.aClass2_Sub13_Sub2_1.method3598(local373, Static209.anInt3493 - 1);
				Static57.method819(local373, local368);
				Static175.aClass211_73 = null;
				return true;
			}
			@Pc(412) int local412;
			@Pc(435) int local435;
			@Pc(439) int local439;
			@Pc(423) int local423;
			@Pc(429) int local429;
			if (Static221.aClass211_85 == Static175.aClass211_73) {
				local205 = Static26.aClass2_Sub13_Sub2_1.method3587();
				local67 = local205 >> 2;
				local213 = local205 & 0x3;
				local244 = Static235.anIntArray329[local67];
				local412 = Static26.aClass2_Sub13_Sub2_1.method3576();
				if (local412 == 65535) {
					local412 = -1;
				}
				local423 = Static26.aClass2_Sub13_Sub2_1.method3574();
				local429 = local423 >> 28 & 0x3;
				local435 = local423 >> 14 & 0x3FFF;
				local439 = local423 & 0x3FFF;
				local435 -= Static275.anInt4506;
				local439 -= Static209.anInt3497;
				Static77.method1144(local429, local213, local67, local244, local435, local412, local439);
				Static175.aClass211_73 = null;
				return true;
			} else if (Static175.aClass211_73 == Static229.aClass211_90) {
				local205 = Static26.aClass2_Sub13_Sub2_1.method3580();
				if (Static26.aClass2_Sub13_Sub2_1.method3580() == 0) {
					Static315.aClass204Array1[local205] = new Class204();
				} else {
					Static26.aClass2_Sub13_Sub2_1.anInt4347--;
					Static315.aClass204Array1[local205] = new Class204(Static26.aClass2_Sub13_Sub2_1);
				}
				Static291.anInt4794 = Static234.anInt3754;
				Static175.aClass211_73 = null;
				return true;
			} else if (Static175.aClass211_73 == Static30.aClass211_17) {
				local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
				local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
				local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
				local244 = Static26.aClass2_Sub13_Sub2_1.method3576();
				local412 = Static26.aClass2_Sub13_Sub2_1.method3559();
				if (Static430.method5387(local244)) {
					Static332.method4450(7, local412, local213 | local67 << 16, local205);
				}
				Static175.aClass211_73 = null;
				return true;
			} else if (Static446.aClass211_157 == Static175.aClass211_73) {
				Static82.anInt1525 = Static26.aClass2_Sub13_Sub2_1.method3580();
				Static345.anInt5891 = Static234.anInt3754;
				Static175.aClass211_73 = null;
				return true;
			} else if (Static257.aClass211_101 == Static175.aClass211_73) {
				local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
				local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
				if (local67 == 65535) {
					local67 = -1;
				}
				local213 = Static26.aClass2_Sub13_Sub2_1.method3557();
				if (Static430.method5387(local205)) {
					Static113.method1720(local213, local67);
				}
				Static175.aClass211_73 = null;
				return true;
			} else if (Static175.aClass211_73 == Static402.aClass211_143) {
				local205 = Static26.aClass2_Sub13_Sub2_1.method3548();
				local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
				local213 = Static26.aClass2_Sub13_Sub2_1.method3574();
				if (Static430.method5387(local205)) {
					Static26.method366(local213, local268);
				}
				Static175.aClass211_73 = null;
				return true;
			} else {
				@Pc(646) Class2_Sub21 local646;
				if (Static175.aClass211_73 == Static375.aClass211_132) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3547();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3547();
					if (Static430.method5387(local205)) {
						@Pc(639) Class2_Sub21 local639 = (Class2_Sub21) aClass72_44.method1659((long) local213);
						local646 = (Class2_Sub21) aClass72_44.method1659((long) local67);
						if (local646 != null) {
							Static74.method1091(local646, false, local639 == null || local639.anInt2585 != local646.anInt2585);
						}
						if (local639 != null) {
							local639.method5703();
							aClass72_44.method1653(local639, (long) local67);
						}
						@Pc(677) Class16 local677 = Static338.method4534(local213);
						if (local677 != null) {
							Static176.method70(local677);
						}
						local677 = Static338.method4534(local67);
						if (local677 != null) {
							Static176.method70(local677);
							Static399.method5068(true, local677);
						}
						if (Static142.anInt2523 != -1) {
							Static361.method4757(1, Static142.anInt2523);
						}
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static7.aClass211_5) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local67 = local205 >> 5;
					local213 = local205 & 0x1F;
					if (local213 == 0) {
						Static186.aClass185Array5[local67] = null;
						Static175.aClass211_73 = null;
						return true;
					}
					@Pc(739) Class185 local739 = new Class185();
					local739.anInt4814 = local213;
					local739.anInt4818 = Static26.aClass2_Sub13_Sub2_1.method3580();
					if (local739.anInt4818 >= 0 && Static84.aClass13Array4.length > local739.anInt4818) {
						if (local739.anInt4814 == 1 || local739.anInt4814 == 10) {
							local739.anInt4822 = Static26.aClass2_Sub13_Sub2_1.method3555();
							Static26.aClass2_Sub13_Sub2_1.anInt4347 += 6;
						} else if (local739.anInt4814 >= 2 && local739.anInt4814 <= 6) {
							if (local739.anInt4814 == 2) {
								local739.anInt4813 = 64;
								local739.anInt4816 = 64;
							}
							if (local739.anInt4814 == 3) {
								local739.anInt4816 = 64;
								local739.anInt4813 = 0;
							}
							if (local739.anInt4814 == 4) {
								local739.anInt4813 = 128;
								local739.anInt4816 = 64;
							}
							if (local739.anInt4814 == 5) {
								local739.anInt4813 = 64;
								local739.anInt4816 = 0;
							}
							if (local739.anInt4814 == 6) {
								local739.anInt4816 = 128;
								local739.anInt4813 = 64;
							}
							local739.anInt4814 = 2;
							local739.anInt4815 = Static26.aClass2_Sub13_Sub2_1.method3580();
							local739.anInt4813 += Static26.aClass2_Sub13_Sub2_1.method3555() - Static275.anInt4506 << 7;
							local739.anInt4816 += Static26.aClass2_Sub13_Sub2_1.method3555() - Static209.anInt3497 << 7;
							local739.anInt4819 = Static26.aClass2_Sub13_Sub2_1.method3580() << 0;
							local739.anInt4821 = Static26.aClass2_Sub13_Sub2_1.method3555();
						}
						local739.anInt4817 = Static26.aClass2_Sub13_Sub2_1.method3555();
						if (local739.anInt4817 == 65535) {
							local739.anInt4817 = -1;
						}
						Static186.aClass185Array5[local67] = local739;
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static170.aClass211_70) {
					Static26.aClass2_Sub13_Sub2_1.anInt4347 += 28;
					if (Static26.aClass2_Sub13_Sub2_1.method3552()) {
						Static30.method456(Static26.aClass2_Sub13_Sub2_1.anInt4347 - 28, Static26.aClass2_Sub13_Sub2_1);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static360.aClass211_124) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3593();
					local244 = Static26.aClass2_Sub13_Sub2_1.method3576();
					local412 = Static26.aClass2_Sub13_Sub2_1.method3574();
					if (Static430.method5387(local67)) {
						Static149.method2160(local412, local244, local205, local213);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static364.aClass211_129 == Static175.aClass211_73) {
					Static240.method3071(Static289.aClass225_13);
					Static175.aClass211_73 = null;
					return true;
				} else if (Static320.aClass211_116 == Static175.aClass211_73) {
					Static224.method2945();
					Static175.aClass211_73 = null;
					return false;
				} else if (Static175.aClass211_73 == Static343.aClass211_118) {
					Static240.method3071(Static7.aClass225_1);
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static235.aClass211_91) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3574();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
					if (Static430.method5387(local67)) {
						Static332.method4450(5, local205, Static201.anInt3383, 0);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static54.aClass211_27 == Static175.aClass211_73) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3556();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3576();
					local244 = Static26.aClass2_Sub13_Sub2_1.method3559();
					if (Static430.method5387(local205)) {
						local646 = (Class2_Sub21) aClass72_44.method1659((long) local244);
						if (local646 != null) {
							Static74.method1091(local646, false, local646.anInt2585 != local213);
						}
						Static458.method5733(local213, local67, local244, false);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static92.aClass211_45) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3574();
					if (Static430.method5387(local205)) {
						@Pc(1110) Class2_Sub21 local1110 = (Class2_Sub21) aClass72_44.method1659((long) local67);
						if (local1110 != null) {
							Static74.method1091(local1110, false, true);
						}
						if (Static324.aClass16_16 != null) {
							Static176.method70(Static324.aClass16_16);
							Static324.aClass16_16 = null;
						}
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static185.aClass211_76 == Static175.aClass211_73) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local244 = Static26.aClass2_Sub13_Sub2_1.method3555() << 0;
					local412 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local423 = Static26.aClass2_Sub13_Sub2_1.method3580();
					if (Static430.method5387(local205)) {
						Static158.method2009(local423, local67, local412, local244, local213);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static24.aClass211_11 == Static175.aClass211_73) {
					Static240.method3071(Static323.aClass225_7);
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static199.aClass211_81) {
					if (Static4.method76(Static290.anInt4777)) {
						Static375.anInt6248 = (int) ((float) Static26.aClass2_Sub13_Sub2_1.method3555() * 2.5F);
					} else {
						Static375.anInt6248 = Static26.aClass2_Sub13_Sub2_1.method3555() * 30;
					}
					Static345.anInt5891 = Static234.anInt3754;
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static70.aClass211_40) {
					Static330.anInt5585 = Static26.aClass2_Sub13_Sub2_1.method3573() << 3;
					Static182.anInt3110 = Static26.aClass2_Sub13_Sub2_1.method3556();
					Static298.anInt167 = Static26.aClass2_Sub13_Sub2_1.method3545() << 3;
					for (@Pc(1235) Class2_Sub12 local1235 = (Class2_Sub12) Static201.aClass72_21.method1655(); local1235 != null; local1235 = (Class2_Sub12) Static201.aClass72_21.method1649()) {
						local67 = (int) (local1235.aLong225 >> 28 & 0x3L);
						local213 = (int) (local1235.aLong225 & 0x3FFFL);
						local244 = local213 - Static275.anInt4506;
						local412 = (int) (local1235.aLong225 >> 14 & 0x3FFFL);
						local423 = local412 - Static209.anInt3497;
						if (local67 == Static182.anInt3110 && local244 >= Static298.anInt167 && Static298.anInt167 + 8 > local244 && Static330.anInt5585 <= local423 && Static330.anInt5585 + 8 > local423) {
							local1235.method5703();
							if (local244 >= 0 && local423 >= 0 && Static166.anInt2852 > local244 && Static426.anInt6923 > local423) {
								Static104.method1551(local423, local244, Static182.anInt3110);
							}
						}
					}
					for (@Pc(1329) Class2_Sub8 local1329 = (Class2_Sub8) Static225.aClass156_28.method3155(); local1329 != null; local1329 = (Class2_Sub8) Static225.aClass156_28.method3150()) {
						if (Static298.anInt167 <= local1329.anInt827 && local1329.anInt827 < Static298.anInt167 + 8 && local1329.anInt826 >= Static330.anInt5585 && local1329.anInt826 < Static330.anInt5585 + 8 && Static182.anInt3110 == local1329.anInt831) {
							local1329.anInt834 = 0;
						}
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static257.aClass211_100) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3574();
					local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
					if (Static430.method5387(local213)) {
						Static72.method1079(local205, local67);
					}
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static346.aClass211_120) {
					Static312.method4252(false);
					Static175.aClass211_73 = null;
					return false;
				} else if (Static39.aClass211_24 == Static175.aClass211_73) {
					local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
					if (local205 == 65535) {
						local205 = -1;
					}
					local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
					local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
					local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
					Static97.method1503(local244, local213, local205, local67);
					Static175.aClass211_73 = null;
					return true;
				} else if (Static175.aClass211_73 == Static431.aClass211_156) {
					Static240.method3071(Static115.aClass225_8);
					Static175.aClass211_73 = null;
					return true;
				} else {
					@Pc(1471) String local1471;
					if (Static317.aClass211_151 == Static175.aClass211_73) {
						local205 = Static26.aClass2_Sub13_Sub2_1.method3548();
						local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
						local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
						if (Static430.method5387(local205)) {
							Static254.method3217(local67, local1471);
						}
						Static175.aClass211_73 = null;
						return true;
					} else if (Static404.aClass211_149 == Static175.aClass211_73) {
						local205 = Static26.aClass2_Sub13_Sub2_1.method3554();
						local67 = Static26.aClass2_Sub13_Sub2_1.method3547();
						local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
						if (Static430.method5387(local213)) {
							Static353.method4703(local67, local205);
						}
						Static175.aClass211_73 = null;
						return true;
					} else if (Static20.aClass211_7 == Static175.aClass211_73) {
						local205 = Static26.aClass2_Sub13_Sub2_1.method3556();
						local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
						local213 = Static26.aClass2_Sub13_Sub2_1.method3574();
						if (Static430.method5387(local67)) {
							Static304.method4185(local205, local213);
						}
						Static175.aClass211_73 = null;
						return true;
					} else {
						@Pc(1739) Class237 local1739;
						@Pc(1716) boolean local1716;
						@Pc(1718) int local1718;
						if (Static175.aClass211_73 == Static334.aClass211_117) {
							Static393.anInt6470 = Static234.anInt3754;
							if (Static209.anInt3493 == 0) {
								Static173.anInt6618 = 0;
								Static46.aClass237Array1 = null;
								Static441.aString195 = null;
								Static365.aString172 = null;
								Static175.aClass211_73 = null;
								return true;
							}
							Static365.aString172 = Static26.aClass2_Sub13_Sub2_1.method3582();
							local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
							if (local368) {
								Static26.aClass2_Sub13_Sub2_1.method3582();
							}
							@Pc(1584) long local1584 = Static26.aClass2_Sub13_Sub2_1.method3597();
							Static441.aString195 = Static134.method1995(local1584);
							Static61.aByte7 = Static26.aClass2_Sub13_Sub2_1.method3605();
							local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
							if (local244 == 255) {
								Static175.aClass211_73 = null;
								return true;
							}
							Static173.anInt6618 = local244;
							@Pc(1610) Class237[] local1610 = new Class237[100];
							for (local423 = 0; local423 < Static173.anInt6618; local423++) {
								local1610[local423] = new Class237();
								local1610[local423].aString180 = Static26.aClass2_Sub13_Sub2_1.method3582();
								local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
								if (local368) {
									local1610[local423].aString181 = Static26.aClass2_Sub13_Sub2_1.method3582();
								} else {
									local1610[local423].aString181 = local1610[local423].aString180;
								}
								local1610[local423].aString179 = Static284.method3771(local1610[local423].aString181);
								local1610[local423].anInt6481 = Static26.aClass2_Sub13_Sub2_1.method3555();
								local1610[local423].aByte79 = Static26.aClass2_Sub13_Sub2_1.method3605();
								local1610[local423].aString182 = Static26.aClass2_Sub13_Sub2_1.method3582();
								if (local1610[local423].aString181.equals(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148)) {
									Static101.aByte22 = local1610[local423].aByte79;
								}
							}
							local439 = Static173.anInt6618;
							while (local439 > 0) {
								local439--;
								local1716 = true;
								for (local1718 = 0; local1718 < local439; local1718++) {
									if (local1610[local1718].aString179.compareTo(local1610[local1718 + 1].aString179) > 0) {
										local1739 = local1610[local1718];
										local1610[local1718] = local1610[local1718 + 1];
										local1610[local1718 + 1] = local1739;
										local1716 = false;
									}
								}
								if (local1716) {
									break;
								}
							}
							Static175.aClass211_73 = null;
							Static46.aClass237Array1 = local1610;
							return true;
						}
						@Pc(2227) int local2227;
						@Pc(1880) int local1880;
						@Pc(1808) boolean local1808;
						@Pc(2145) boolean local2145;
						@Pc(1849) int local1849;
						@Pc(2003) int local2003;
						if (Static223.aClass211_153 == Static175.aClass211_73) {
							local205 = Static26.aClass2_Sub13_Sub2_1.method3587();
							local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
							local213 = Static26.aClass2_Sub13_Sub2_1.method3593();
							local244 = Static26.aClass2_Sub13_Sub2_1.method3548();
							local412 = Static26.aClass2_Sub13_Sub2_1.method3547();
							local1808 = (local205 & 0x80) != 0;
							if (local412 >> 30 == 0) {
								@Pc(1864) Class229 local1864;
								@Pc(1877) Class128 local1877;
								@Pc(1927) Class128 local1927;
								if (local412 >> 29 != 0) {
									local429 = local412 & 0xFFFF;
									@Pc(1827) Class2_Sub28 local1827 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local429);
									if (local1827 != null) {
										@Pc(1832) Class3_Sub4_Sub1_Sub1 local1832 = local1827.aClass3_Sub4_Sub1_Sub1_1;
										if (local213 == 65535) {
											local213 = -1;
										}
										@Pc(1841) boolean local1841 = true;
										local1849 = local1808 ? local1832.anInt4912 : local1832.anInt4964;
										if (local213 != -1 && local1849 != -1) {
											if (local213 == local1849) {
												local1864 = Static431.aClass36_2.method696(local213);
												if (local1864.aBoolean449 && local1864.anInt6240 != -1) {
													local1877 = Static334.aClass62_2.method1418(local1864.anInt6240);
													local1880 = local1877.anInt3329;
													if (local1880 == 0 || local1880 == 2) {
														local1841 = false;
													} else if (local1880 == 1) {
														local1841 = true;
													}
												}
											} else {
												local1864 = Static431.aClass36_2.method696(local213);
												@Pc(1911) Class229 local1911 = Static431.aClass36_2.method696(local1849);
												if (local1864.anInt6240 != -1 && local1911.anInt6240 != -1) {
													local1927 = Static334.aClass62_2.method1418(local1864.anInt6240);
													@Pc(1933) Class128 local1933 = Static334.aClass62_2.method1418(local1911.anInt6240);
													if (local1927.anInt3326 < local1933.anInt3326) {
														local1841 = false;
													}
												}
											}
										}
										if (local1841) {
											if (local1808) {
												local1832.anInt4969 = 0;
												local1832.anInt4937 = 1;
												local1832.anInt4908 = local67 + Static266.anInt4392;
												local1832.anInt4912 = local213;
												local1832.anInt4911 = local244;
												local1832.anInt4923 = 0;
												local1832.anInt4913 = local205 & 0x7;
												if (local1832.anInt4908 > Static266.anInt4392) {
													local1832.anInt4969 = -1;
												}
												if (local1832.anInt4912 != -1 && local1832.anInt4908 == Static266.anInt4392) {
													local2003 = Static431.aClass36_2.method696(local1832.anInt4912).anInt6240;
													if (local2003 != -1) {
														local1877 = Static334.aClass62_2.method1418(local2003);
														if (local1877 != null && local1877.anIntArray278 != null) {
															Static128.method1905(local1877, local1832.anInt6835, false, local1832.aByte91, local1832.anInt6833, 0);
														}
													}
												}
											} else {
												local1832.anInt4955 = 1;
												local1832.anInt4944 = Static266.anInt4392 + local67;
												local1832.anInt4897 = local244;
												local1832.anInt4924 = local205 & 0x7;
												local1832.anInt4938 = 0;
												local1832.anInt4950 = 0;
												local1832.anInt4964 = local213;
												if (local1832.anInt4944 > Static266.anInt4392) {
													local1832.anInt4950 = -1;
												}
												if (local1832.anInt4964 != -1 && Static266.anInt4392 == local1832.anInt4944) {
													local2003 = Static431.aClass36_2.method696(local1832.anInt4964).anInt6240;
													if (local2003 != -1) {
														local1877 = Static334.aClass62_2.method1418(local2003);
														if (local1877 != null && local1877.anIntArray278 != null) {
															Static128.method1905(local1877, local1832.anInt6835, false, local1832.aByte91, local1832.anInt6833, 0);
														}
													}
												}
											}
										}
									}
								} else if (local412 >> 28 != 0) {
									local429 = local412 & 0xFFFF;
									@Pc(2130) Class3_Sub4_Sub1_Sub2 local2130;
									if (Static201.anInt3383 == local429) {
										local2130 = Static60.aClass3_Sub4_Sub1_Sub2_1;
									} else {
										local2130 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local429];
									}
									if (local2130 != null) {
										if (local213 == 65535) {
											local213 = -1;
										}
										local2145 = true;
										local1718 = local1808 ? local2130.anInt4912 : local2130.anInt4964;
										@Pc(2224) Class128 local2224;
										if (local213 != -1 && local1718 != -1) {
											@Pc(2171) Class229 local2171;
											if (local213 == local1718) {
												local2171 = Static431.aClass36_2.method696(local213);
												if (local2171.aBoolean449 && local2171.anInt6240 != -1) {
													local2224 = Static334.aClass62_2.method1418(local2171.anInt6240);
													local2227 = local2224.anInt3329;
													if (local2227 == 0 || local2227 == 2) {
														local2145 = false;
													} else if (local2227 == 1) {
														local2145 = true;
													}
												}
											} else {
												local2171 = Static431.aClass36_2.method696(local213);
												local1864 = Static431.aClass36_2.method696(local1718);
												if (local2171.anInt6240 != -1 && local1864.anInt6240 != -1) {
													local1877 = Static334.aClass62_2.method1418(local2171.anInt6240);
													local1927 = Static334.aClass62_2.method1418(local1864.anInt6240);
													if (local1877.anInt3326 < local1927.anInt3326) {
														local2145 = false;
													}
												}
											}
										}
										if (local2145) {
											if (local1808) {
												local2130.anInt4908 = Static266.anInt4392 + local67;
												local2130.anInt4969 = 0;
												local2130.anInt4911 = local244;
												local2130.anInt4937 = 1;
												local2130.anInt4923 = 0;
												local2130.anInt4913 = local205 & 0x7;
												local2130.anInt4912 = local213;
												if (local2130.anInt4908 > Static266.anInt4392) {
													local2130.anInt4969 = -1;
												}
												if (local2130.anInt4912 == 65535) {
													local2130.anInt4912 = -1;
												}
												if (local2130.anInt4912 != -1 && Static266.anInt4392 == local2130.anInt4908) {
													local1849 = Static431.aClass36_2.method696(local2130.anInt4912).anInt6240;
													if (local1849 != -1) {
														local2224 = Static334.aClass62_2.method1418(local1849);
														if (local2224 != null && local2224.anIntArray278 != null) {
															Static128.method1905(local2224, local2130.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == local2130, local2130.aByte91, local2130.anInt6833, 0);
														}
													}
												}
											} else {
												local2130.anInt4955 = 1;
												local2130.anInt4950 = 0;
												local2130.anInt4964 = local213;
												local2130.anInt4944 = local67 + Static266.anInt4392;
												local2130.anInt4938 = 0;
												local2130.anInt4924 = local205 & 0x7;
												local2130.anInt4897 = local244;
												if (local2130.anInt4964 == 65535) {
													local2130.anInt4964 = -1;
												}
												if (local2130.anInt4944 > Static266.anInt4392) {
													local2130.anInt4950 = -1;
												}
												if (local2130.anInt4964 != -1 && local2130.anInt4944 == Static266.anInt4392) {
													local1849 = Static431.aClass36_2.method696(local2130.anInt4964).anInt6240;
													if (local1849 != -1) {
														local2224 = Static334.aClass62_2.method1418(local1849);
														if (local2224 != null && local2224.anIntArray278 != null) {
															Static128.method1905(local2224, local2130.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1 == local2130, local2130.aByte91, local2130.anInt6833, 0);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local429 = local412 >> 28 & 0x3;
								local435 = (local412 >> 14 & 0x3FFF) - Static275.anInt4506;
								local439 = (local412 & 0x3FFF) - Static209.anInt3497;
								if (local435 >= 0 && local439 >= 0 && local435 < Static166.anInt2852 && Static426.anInt6923 > local439) {
									local1718 = local435 * 128 + 64;
									local1849 = local439 * 128 + 64;
									local2003 = local429;
									if (local429 < 3 && Static372.method4855(local435, local439)) {
										local2003 = local429 + 1;
									}
									@Pc(2518) Class3_Sub4_Sub3 local2518 = new Class3_Sub4_Sub3(local213, 0, Static266.anInt4392, local429, local2003, local1718, Static302.method3973(local1849, local1718, local429) - local244, local1849, local435, local435, local439, local439, local205);
									Static186.aClass156_56.method3157(new Class2_Sub5_Sub8(local2518));
								}
							}
							Static175.aClass211_73 = null;
							return true;
						} else if (Static146.aClass211_63 == Static175.aClass211_73) {
							Static240.method3071(Static251.aClass225_12);
							Static175.aClass211_73 = null;
							return true;
						} else if (Static387.aClass211_138 == Static175.aClass211_73) {
							Static240.method3071(Static21.aClass225_3);
							Static175.aClass211_73 = null;
							return true;
						} else if (Static224.aClass211_86 == Static175.aClass211_73) {
							local205 = Static26.aClass2_Sub13_Sub2_1.method3559();
							local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
							Static138.aClass268_1.method5651(local205, local67);
							Static175.aClass211_73 = null;
							return true;
						} else {
							@Pc(2576) byte local2576;
							if (Static375.aClass211_131 == Static175.aClass211_73) {
								local2576 = Static26.aClass2_Sub13_Sub2_1.method3545();
								local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
								Static138.aClass268_1.method5656(local2576, local67);
								Static175.aClass211_73 = null;
								return true;
							} else if (Static161.aClass211_128 == Static175.aClass211_73) {
								local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
								local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
								local213 = Static26.aClass2_Sub13_Sub2_1.method3559();
								if (Static430.method5387(local67)) {
									Static6.method112(local205, local213);
								}
								Static175.aClass211_73 = null;
								return true;
							} else if (Static175.aClass211_72 == Static175.aClass211_73) {
								local205 = Static26.aClass2_Sub13_Sub2_1.method3559();
								local67 = Static26.aClass2_Sub13_Sub2_1.method3576();
								Static138.aClass268_1.method5656(local205, local67);
								Static175.aClass211_73 = null;
								return true;
							} else {
								@Pc(2658) boolean local2658;
								if (Static175.aClass211_73 == Static361.aClass211_125) {
									local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
									local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
									local2658 = (local67 & 0x1) == 1;
									Static447.method5639(local205, local2658);
									local244 = Static26.aClass2_Sub13_Sub2_1.method3555();
									for (local412 = 0; local412 < local244; local412++) {
										local423 = Static26.aClass2_Sub13_Sub2_1.method3556();
										if (local423 == 255) {
											local423 = Static26.aClass2_Sub13_Sub2_1.method3547();
										}
										local429 = Static26.aClass2_Sub13_Sub2_1.method3576();
										Static170.method2385(local412, local205, local423, local429 - 1, local2658);
									}
									Static360.anIntArray525[Static246.anInt3975++ & 0x1F] = local205;
									Static175.aClass211_73 = null;
									return true;
								} else if (Static243.aClass211_20 == Static175.aClass211_73) {
									local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
									local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
									local213 = Static26.aClass2_Sub13_Sub2_1.method3580();
									local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
									local412 = Static26.aClass2_Sub13_Sub2_1.method3580();
									local423 = Static26.aClass2_Sub13_Sub2_1.method3555();
									if (Static430.method5387(local205)) {
										Static138.aBooleanArray11[local67] = true;
										Static267.anIntArray373[local67] = local213;
										Static296.anIntArray416[local67] = local244;
										Static260.anIntArray363[local67] = local412;
										Static244.anIntArray338[local67] = local423;
									}
									Static175.aClass211_73 = null;
									return true;
								} else if (Static175.aClass211_73 == Static116.aClass211_52) {
									local205 = Static26.aClass2_Sub13_Sub2_1.method3556();
									local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
									local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
									@Pc(2789) Class2_Sub28 local2789 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local67);
									if (local2789 != null) {
										Static200.method2690(local2789.aClass3_Sub4_Sub1_Sub1_1, local205, local213);
									}
									Static175.aClass211_73 = null;
									return true;
								} else {
									@Pc(2854) long local2854;
									@Pc(2876) Class2_Sub15 local2876;
									@Pc(2860) Class2_Sub15 local2860;
									if (Static112.aClass211_93 == Static175.aClass211_73) {
										local205 = Static26.aClass2_Sub13_Sub2_1.method3548();
										if (local205 == 65535) {
											local205 = -1;
										}
										local67 = Static26.aClass2_Sub13_Sub2_1.method3559();
										local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
										if (local213 == 65535) {
											local213 = -1;
										}
										local244 = Static26.aClass2_Sub13_Sub2_1.method3557();
										local412 = Static26.aClass2_Sub13_Sub2_1.method3576();
										if (Static430.method5387(local412)) {
											for (local423 = local213; local423 <= local205; local423++) {
												local2854 = (long) local423 + ((long) local244 << 32);
												local2860 = (Class2_Sub15) Static127.aClass72_14.method1659(local2854);
												if (local2860 != null) {
													local2876 = new Class2_Sub15(local67, local2860.anInt1899);
													local2860.method5703();
												} else if (local423 == -1) {
													local2876 = new Class2_Sub15(local67, Static338.method4534(local244).aClass2_Sub15_1.anInt1899);
												} else {
													local2876 = new Class2_Sub15(local67, -1);
												}
												Static127.aClass72_14.method1653(local2876, local2854);
											}
										}
										Static175.aClass211_73 = null;
										return true;
									} else if (Static175.aClass211_73 == Static4.aClass211_4) {
										Static291.anInt4793 = Static26.aClass2_Sub13_Sub2_1.method3580();
										for (local205 = 0; local205 < Static291.anInt4793; local205++) {
											Static200.aStringArray18[local205] = Static26.aClass2_Sub13_Sub2_1.method3582();
											Static26.aStringArray4[local205] = Static26.aClass2_Sub13_Sub2_1.method3582();
											if (Static26.aStringArray4[local205].equals("")) {
												Static26.aStringArray4[local205] = Static200.aStringArray18[local205];
											}
											Static417.aStringArray39[local205] = Static26.aClass2_Sub13_Sub2_1.method3582();
											Static247.aStringArray23[local205] = Static26.aClass2_Sub13_Sub2_1.method3582();
											if (Static247.aStringArray23[local205].equals("")) {
												Static247.aStringArray23[local205] = Static417.aStringArray39[local205];
											}
											Static2.aBooleanArray1[local205] = false;
										}
										Static336.anInt5710 = Static234.anInt3754;
										Static175.aClass211_73 = null;
										return true;
									} else {
										@Pc(3022) String local3022;
										@Pc(3012) String local3012;
										@Pc(3026) String local3026;
										if (Static175.aClass211_73 == Static239.aClass211_92) {
											local205 = Static26.aClass2_Sub13_Sub2_1.method3580();
											@Pc(3004) boolean local3004 = (local205 & 0x1) == 1;
											local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
											local3012 = Static26.aClass2_Sub13_Sub2_1.method3582();
											if (local3012.equals("")) {
												local3012 = local1471;
											}
											local3022 = Static26.aClass2_Sub13_Sub2_1.method3582();
											local3026 = Static26.aClass2_Sub13_Sub2_1.method3582();
											if (local3026.equals("")) {
												local3026 = local3022;
											}
											if (local3004) {
												for (local429 = 0; local429 < Static291.anInt4793; local429++) {
													if (Static26.aStringArray4[local429].equals(local3026)) {
														Static200.aStringArray18[local429] = local1471;
														Static26.aStringArray4[local429] = local3012;
														Static417.aStringArray39[local429] = local3022;
														Static247.aStringArray23[local429] = local3026;
														break;
													}
												}
											} else {
												Static200.aStringArray18[Static291.anInt4793] = local1471;
												Static26.aStringArray4[Static291.anInt4793] = local3012;
												Static417.aStringArray39[Static291.anInt4793] = local3022;
												Static247.aStringArray23[Static291.anInt4793] = local3026;
												Static2.aBooleanArray1[Static291.anInt4793] = (local205 & 0x2) == 2;
												Static291.anInt4793++;
											}
											Static336.anInt5710 = Static234.anInt3754;
											Static175.aClass211_73 = null;
											return true;
										}
										@Pc(3112) String local3112;
										if (Static175.aClass211_73 == Static208.aClass211_82) {
											local3112 = Static26.aClass2_Sub13_Sub2_1.method3582();
											local268 = Static249.method3171(Static114.method1736(Static26.aClass2_Sub13_Sub2_1));
											Static166.method2340(local3112, 0, 6, local268, local3112);
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static29.aClass211_16) {
											Static240.method3071(Static194.aClass225_10);
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static53.aClass211_25) {
											local205 = Static26.aClass2_Sub13_Sub2_1.method3588();
											local67 = Static26.aClass2_Sub13_Sub2_1.method3574();
											local213 = Static26.aClass2_Sub13_Sub2_1.method3580();
											local3012 = "";
											local3022 = local3012;
											if ((local213 & 0x1) != 0) {
												local3012 = Static26.aClass2_Sub13_Sub2_1.method3582();
												if ((local213 & 0x2) == 0) {
													local3022 = local3012;
												} else {
													local3022 = Static26.aClass2_Sub13_Sub2_1.method3582();
												}
											}
											local3026 = Static26.aClass2_Sub13_Sub2_1.method3582();
											if (local205 == 99) {
												Static433.method5450(local3026);
											} else if (local3022.equals("") || !Static214.method2831(local3022)) {
												Static166.method2340(local3012, local67, local205, local3026, local3022);
											} else {
												Static175.aClass211_73 = null;
												return true;
											}
											Static175.aClass211_73 = null;
											return true;
										} else if (Static296.aClass211_109 == Static175.aClass211_73) {
											Static288.anInt4731 = Static26.aClass2_Sub13_Sub2_1.method3580();
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static352.aClass211_121) {
											Static240.method3071(Static351.aClass225_15);
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static252.aClass211_98) {
											local205 = Static26.aClass2_Sub13_Sub2_1.method3574();
											Static129.aClass91_1 = Static79.aClass183_2.method3914(local205);
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static148.aClass211_64) {
											local2576 = Static26.aClass2_Sub13_Sub2_1.method3573();
											local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
											local213 = Static26.aClass2_Sub13_Sub2_1.method3576();
											if (Static430.method5387(local213)) {
												Static242.method3083(local67, local2576);
											}
											Static175.aClass211_73 = null;
											return true;
										} else if (Static59.aClass211_74 == Static175.aClass211_73) {
											local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
											local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
											local1471 = local268;
											if (local368) {
												local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
											}
											local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
											@Pc(3310) boolean local3310 = false;
											if (local244 <= 1) {
												if (Static409.aBoolean471 && !Static399.aBoolean464 || Static298.aBoolean16) {
													local3310 = true;
												} else if (local244 <= 1 && Static214.method2831(local1471)) {
													local3310 = true;
												}
											}
											if (!local3310 && Static330.anInt5583 == 0) {
												local3026 = Static249.method3171(Static114.method1736(Static26.aClass2_Sub13_Sub2_1));
												if (local244 == 2) {
													Static234.method3027(0, local3026, null, 24, -1, "<img=1>" + local268, "<img=1>" + local1471);
												} else if (local244 == 1) {
													Static234.method3027(0, local3026, null, 24, -1, "<img=0>" + local268, "<img=0>" + local1471);
												} else {
													Static234.method3027(0, local3026, null, 24, -1, local268, local1471);
												}
											}
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static289.aClass211_107) {
											Static171.method2405();
											Static175.aClass211_73 = null;
											return true;
										} else if (Static175.aClass211_73 == Static117.aClass211_55) {
											local205 = Static26.aClass2_Sub13_Sub2_1.method3559();
											local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
											local213 = Static26.aClass2_Sub13_Sub2_1.method3576();
											if (Static430.method5387(local213)) {
												Static164.method3946(local205, local67);
											}
											Static175.aClass211_73 = null;
											return true;
										} else {
											@Pc(3765) String local3765;
											if (Static259.aClass211_102 == Static175.aClass211_73) {
												while (Static209.anInt3493 > Static26.aClass2_Sub13_Sub2_1.anInt4347) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local412 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local3026 = "";
													local1716 = false;
													if (local244 > 0) {
														local3026 = Static26.aClass2_Sub13_Sub2_1.method3582();
														local1716 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													}
													for (local435 = 0; local435 < Static209.anInt3494; local435++) {
														if (local368) {
															if (local1471.equals(Static290.aStringArray29[local435])) {
																Static290.aStringArray29[local435] = local268;
																local268 = null;
																Static312.aStringArray31[local435] = local1471;
																break;
															}
														} else if (local268.equals(Static290.aStringArray29[local435])) {
															if (local244 != Static158.anIntArray186[local435]) {
																local2145 = true;
																for (@Pc(3520) Class21_Sub1_Sub2 local3520 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2080(); local3520 != null; local3520 = (Class21_Sub1_Sub2) Static457.aClass93_8.method2081()) {
																	if (local3520.aString76.equals(local268)) {
																		if (local244 != 0 && local3520.aShort23 == 0) {
																			local3520.method5593();
																			local2145 = false;
																		} else if (local244 == 0 && local3520.aShort23 != 0) {
																			local3520.method5593();
																			local2145 = false;
																		}
																	}
																}
																if (local2145) {
																	Static457.aClass93_8.method2079(new Class21_Sub1_Sub2(local268, local244));
																}
																Static158.anIntArray186[local435] = local244;
															}
															Static312.aStringArray31[local435] = local1471;
															Static14.aStringArray1[local435] = local3026;
															Static259.anIntArray361[local435] = local412;
															Static240.aBooleanArray16[local435] = local1716;
															local268 = null;
															break;
														}
													}
													if (local268 != null && Static209.anInt3494 < 200) {
														Static290.aStringArray29[Static209.anInt3494] = local268;
														Static312.aStringArray31[Static209.anInt3494] = local1471;
														Static158.anIntArray186[Static209.anInt3494] = local244;
														Static14.aStringArray1[Static209.anInt3494] = local3026;
														Static259.anIntArray361[Static209.anInt3494] = local412;
														Static240.aBooleanArray16[Static209.anInt3494] = local1716;
														Static209.anInt3494++;
													}
												}
												Static252.anInt4055 = 2;
												Static336.anInt5710 = Static234.anInt3754;
												local67 = Static209.anInt3494;
												while (local67 > 0) {
													local368 = true;
													local67--;
													for (local213 = 0; local213 < local67; local213++) {
														if (Static14.aClass265_1.anInt7137 != Static158.anIntArray186[local213] && Static14.aClass265_1.anInt7137 == Static158.anIntArray186[local213 + 1] || Static158.anIntArray186[local213] == 0 && Static158.anIntArray186[local213 + 1] != 0) {
															local244 = Static158.anIntArray186[local213];
															Static158.anIntArray186[local213] = Static158.anIntArray186[local213 + 1];
															Static158.anIntArray186[local213 + 1] = local244;
															local3022 = Static14.aStringArray1[local213];
															Static14.aStringArray1[local213] = Static14.aStringArray1[local213 + 1];
															Static14.aStringArray1[local213 + 1] = local3022;
															local3026 = Static290.aStringArray29[local213];
															Static290.aStringArray29[local213] = Static290.aStringArray29[local213 + 1];
															Static290.aStringArray29[local213 + 1] = local3026;
															local3765 = Static312.aStringArray31[local213];
															Static312.aStringArray31[local213] = Static312.aStringArray31[local213 + 1];
															Static312.aStringArray31[local213 + 1] = local3765;
															local435 = Static259.anIntArray361[local213];
															Static259.anIntArray361[local213] = Static259.anIntArray361[local213 + 1];
															Static259.anIntArray361[local213 + 1] = local435;
															local2145 = Static240.aBooleanArray16[local213];
															Static240.aBooleanArray16[local213] = Static240.aBooleanArray16[local213 + 1];
															Static240.aBooleanArray16[local213 + 1] = local2145;
															local368 = false;
														}
													}
													if (local368) {
														break;
													}
												}
												Static175.aClass211_73 = null;
												return true;
											} else if (Static59.aClass211_75 == Static175.aClass211_73) {
												Static204.method2719(Static26.aClass2_Sub13_Sub2_1, Static209.anInt3493);
												Static175.aClass211_73 = null;
												return true;
											} else {
												@Pc(3875) long local3875;
												@Pc(3880) long local3880;
												@Pc(3885) long local3885;
												if (Static175.aClass211_73 == aClass211_154) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = local268;
													if (local368) {
														local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													}
													local3875 = Static26.aClass2_Sub13_Sub2_1.method3597();
													local3880 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local3885 = Static26.aClass2_Sub13_Sub2_1.method3563();
													local1718 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local1849 = Static26.aClass2_Sub13_Sub2_1.method3555();
													@Pc(3899) long local3899 = (local3880 << 32) + local3885;
													@Pc(3901) boolean local3901 = false;
													@Pc(3903) int local3903 = 0;
													while (true) {
														if (local3903 >= 100) {
															if (local1718 <= 1 && Static214.method2831(local1471)) {
																local3901 = true;
															}
															break;
														}
														if (local3899 == Static284.aLongArray8[local3903]) {
															local3901 = true;
															break;
														}
														local3903++;
													}
													if (!local3901 && Static330.anInt5583 == 0) {
														Static284.aLongArray8[Static355.anInt6511] = local3899;
														Static355.anInt6511 = (Static355.anInt6511 + 1) % 100;
														@Pc(3956) String local3956 = Static216.aClass219_1.method4730(local1849).method5275(Static26.aClass2_Sub13_Sub2_1);
														if (local1718 == 2) {
															Static234.method3027(0, local3956, Static339.method4554(local3875), 20, local1849, "<img=1>" + local268, "<img=1>" + local1471);
														} else if (local1718 == 1) {
															Static234.method3027(0, local3956, Static339.method4554(local3875), 20, local1849, "<img=0>" + local268, "<img=0>" + local1471);
														} else {
															Static234.method3027(0, local3956, Static339.method4554(local3875), 20, local1849, local268, local1471);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static226.aClass211_87) {
													Static347.anInt5912 = Static26.aClass2_Sub13_Sub2_1.method3558();
													Static345.anInt5891 = Static234.anInt3754;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static428.aClass211_155 == Static175.aClass211_73) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = local268;
													if (local368) {
														local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													}
													local3875 = Static26.aClass2_Sub13_Sub2_1.method3597();
													local3880 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local3885 = Static26.aClass2_Sub13_Sub2_1.method3563();
													local1718 = Static26.aClass2_Sub13_Sub2_1.method3580();
													@Pc(4088) long local4088 = local3885 + (local3880 << 32);
													@Pc(4090) boolean local4090 = false;
													local1880 = 0;
													while (true) {
														if (local1880 >= 100) {
															if (local1718 <= 1) {
																if (Static409.aBoolean471 && !Static399.aBoolean464 || Static298.aBoolean16) {
																	local4090 = true;
																} else if (Static214.method2831(local1471)) {
																	local4090 = true;
																}
															}
															break;
														}
														if (Static284.aLongArray8[local1880] == local4088) {
															local4090 = true;
															break;
														}
														local1880++;
													}
													if (!local4090 && Static330.anInt5583 == 0) {
														Static284.aLongArray8[Static355.anInt6511] = local4088;
														Static355.anInt6511 = (Static355.anInt6511 + 1) % 100;
														@Pc(4152) String local4152 = Static249.method3171(Static114.method1736(Static26.aClass2_Sub13_Sub2_1));
														if (local1718 == 2 || local1718 == 3) {
															Static234.method3027(0, local4152, Static339.method4554(local3875), 9, -1, "<img=1>" + local268, "<img=1>" + local1471);
														} else if (local1718 == 1) {
															Static234.method3027(0, local4152, Static339.method4554(local3875), 9, -1, "<img=0>" + local268, "<img=0>" + local1471);
														} else {
															Static234.method3027(0, local4152, Static339.method4554(local3875), 9, -1, local268, local1471);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static385.aClass211_136 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3556();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3587();
													if (local67 == 255) {
														local67 = -1;
														local205 = -1;
													}
													Static97.method1505(local67, local205);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static424.aClass211_148 == Static175.aClass211_73) {
													Static207.method2674();
													Static175.aClass211_73 = null;
													return false;
												} else if (Static253.aClass211_99 == Static175.aClass211_73) {
													Static240.method3071(Static83.aClass225_4);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static192.aClass211_78) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3547();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
													if (local67 == 65535) {
														local67 = -1;
													}
													local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (Static430.method5387(local213)) {
														Static332.method4450(2, local205, local67, -1);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static385.aClass211_135) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3556();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3574();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3556();
													Static11.anIntArray13[local213] = local67;
													Static261.anIntArray178[local213] = local205;
													Static99.anIntArray146[local213] = 1;
													local244 = Static454.anIntArray643[local213] - 1;
													for (local412 = 0; local412 < local244; local412++) {
														if (Class176.anIntArray392[local412] <= local67) {
															Static99.anIntArray146[local213] = local412 + 2;
														}
													}
													Static83.anIntArray129[Static94.anInt7037++ & 0x1F] = local213;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static283.aClass211_105) {
													Static240.method3071(Static99.aClass225_5);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static116.aClass211_53) {
													for (local205 = 0; local205 < Static152.aClass3_Sub4_Sub1_Sub2Array1.length; local205++) {
														if (Static152.aClass3_Sub4_Sub1_Sub2Array1[local205] != null) {
															Static152.aClass3_Sub4_Sub1_Sub2Array1[local205].anInt4903 = -1;
														}
													}
													for (local67 = 0; local67 < Static384.anInt6329; local67++) {
														Static332.aClass2_Sub28Array1[local67].aClass3_Sub4_Sub1_Sub1_1.anInt4903 = -1;
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static372.aClass211_130) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3600();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
													if (Static430.method5387(local205)) {
														if (local67 == 2) {
															Static352.method4675();
														}
														Static142.anInt2523 = local213;
														Static457.method5717(local213);
														Static129.method1930(false);
														Static191.method2566(Static142.anInt2523);
														for (local244 = 0; local244 < 100; local244++) {
															Static101.aBooleanArray9[local244] = true;
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static392.aClass211_140) {
													Static240.method3071(Static200.aClass225_11);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static403.aClass211_144) {
													Static327.aClass133_3 = Static289.method3850(Static26.aClass2_Sub13_Sub2_1.method3580());
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static95.aClass211_59) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3593();
													if (Static430.method5387(local213)) {
														Static196.method2641(local67, local205);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static400.aClass211_142 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3559();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3576();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3593();
													if (Static430.method5387(local67)) {
														Static349.method4646((local213 << 16) + local244, local205);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static424.aClass211_147) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
													if (local67 == 65535) {
														local67 = -1;
													}
													local213 = Static26.aClass2_Sub13_Sub2_1.method3576();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3548();
													if (local244 == 65535) {
														local244 = -1;
													}
													local412 = Static26.aClass2_Sub13_Sub2_1.method3574();
													if (Static430.method5387(local205)) {
														for (local423 = local67; local423 <= local244; local423++) {
															local2854 = ((long) local412 << 32) + (long) local423;
															local2860 = (Class2_Sub15) Static127.aClass72_14.method1659(local2854);
															if (local2860 != null) {
																local2876 = new Class2_Sub15(local2860.anInt1904, local213);
																local2860.method5703();
															} else if (local423 == -1) {
																local2876 = new Class2_Sub15(Static338.method4534(local412).aClass2_Sub15_1.anInt1904, local213);
															} else {
																local2876 = new Class2_Sub15(0, local213);
															}
															Static127.aClass72_14.method1653(local2876, local2854);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static384.aClass211_134 == Static175.aClass211_73) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = local268;
													if (local368) {
														local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													}
													local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local412 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local1808 = false;
													if (local244 <= 1 && Static214.method2831(local1471)) {
														local1808 = true;
													}
													if (!local1808 && Static330.anInt5583 == 0) {
														local3765 = Static216.aClass219_1.method4730(local412).method5275(Static26.aClass2_Sub13_Sub2_1);
														if (local244 == 2) {
															Static234.method3027(0, local3765, null, 25, local412, "<img=1>" + local268, "<img=1>" + local1471);
														} else if (local244 == 1) {
															Static234.method3027(0, local3765, null, 25, local412, "<img=0>" + local268, "<img=0>" + local1471);
														} else {
															Static234.method3027(0, local3765, null, 25, local412, local268, local1471);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static17.aClass211_6) {
													local3112 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local2658 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													if (local2658) {
														local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													} else {
														local268 = local3112;
													}
													local244 = Static26.aClass2_Sub13_Sub2_1.method3555();
													@Pc(4842) byte local4842 = Static26.aClass2_Sub13_Sub2_1.method3605();
													local1808 = false;
													if (local4842 == -128) {
														local1808 = true;
													}
													if (local1808) {
														if (Static173.anInt6618 == 0) {
															Static175.aClass211_73 = null;
															return true;
														}
														for (local429 = 0; Static173.anInt6618 > local429 && (!Static46.aClass237Array1[local429].aString181.equals(local268) || Static46.aClass237Array1[local429].anInt6481 != local244); local429++) {
														}
														if (Static173.anInt6618 > local429) {
															while (Static173.anInt6618 - 1 > local429) {
																Static46.aClass237Array1[local429] = Static46.aClass237Array1[local429 + 1];
																local429++;
															}
															Static173.anInt6618--;
															Static46.aClass237Array1[Static173.anInt6618] = null;
														}
													} else {
														local3765 = Static26.aClass2_Sub13_Sub2_1.method3582();
														local1739 = new Class237();
														local1739.aString180 = local3112;
														local1739.aString181 = local268;
														local1739.aString179 = Static284.method3771(local1739.aString181);
														local1739.aString182 = local3765;
														local1739.aByte79 = local4842;
														local1739.anInt6481 = local244;
														for (local439 = Static173.anInt6618 - 1; local439 >= 0; local439--) {
															local1718 = Static46.aClass237Array1[local439].aString179.compareTo(local1739.aString179);
															if (local1718 == 0) {
																Static46.aClass237Array1[local439].anInt6481 = local244;
																Static46.aClass237Array1[local439].aByte79 = local4842;
																Static46.aClass237Array1[local439].aString182 = local3765;
																if (local268.equals(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148)) {
																	Static101.aByte22 = local4842;
																}
																Static393.anInt6470 = Static234.anInt3754;
																Static175.aClass211_73 = null;
																return true;
															}
															if (local1718 < 0) {
																break;
															}
														}
														if (Static173.anInt6618 >= Static46.aClass237Array1.length) {
															Static175.aClass211_73 = null;
															return true;
														}
														for (local1718 = Static173.anInt6618 - 1; local1718 > local439; local1718--) {
															Static46.aClass237Array1[local1718 + 1] = Static46.aClass237Array1[local1718];
														}
														if (Static173.anInt6618 == 0) {
															Static46.aClass237Array1 = new Class237[100];
														}
														Static46.aClass237Array1[local439 + 1] = local1739;
														Static173.anInt6618++;
														if (local268.equals(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148)) {
															Static101.aByte22 = local4842;
														}
													}
													Static175.aClass211_73 = null;
													Static393.anInt6470 = Static234.anInt3754;
													return true;
												} else if (Static101.aClass211_49 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3557();
													if (Static430.method5387(local205)) {
														Static332.method4450(3, local67, -1, -1);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static113.aClass211_51) {
													if (Static300.aFrame4 != null) {
														Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
													}
													@Pc(5119) byte[] local5119 = new byte[Static209.anInt3493];
													Static26.aClass2_Sub13_Sub2_1.method3610(Static209.anInt3493, local5119);
													local268 = Static230.method3015(Static209.anInt3493, 0, local5119);
													Static25.method363(local268, true, Static288.anInt4743 == 1, Static79.aClass183_2);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static189.aClass211_77) {
													Static207.method2673(false);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static361.aClass211_126) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3548();
													if (local67 == 65535) {
														local67 = -1;
													}
													local213 = Static26.aClass2_Sub13_Sub2_1.method3557();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3557();
													if (Static430.method5387(local205)) {
														Static174.method2460(local213, local67, local244);
														@Pc(5194) Class208 local5194 = Static384.aClass164_2.method3458(local67);
														Static149.method2160(local244, local5194.anInt5684, local5194.anInt5669, local5194.anInt5706);
														Static433.method5453(local5194.anInt5682, local244, local5194.anInt5690, local5194.anInt5670);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static26.aClass211_13) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local2658 = (local67 & 0x1) == 1;
													while (Static209.anInt3493 > Static26.aClass2_Sub13_Sub2_1.anInt4347) {
														local244 = Static26.aClass2_Sub13_Sub2_1.method3588();
														local412 = Static26.aClass2_Sub13_Sub2_1.method3555();
														local423 = 0;
														if (local412 != 0) {
															local423 = Static26.aClass2_Sub13_Sub2_1.method3580();
															if (local423 == 255) {
																local423 = Static26.aClass2_Sub13_Sub2_1.method3574();
															}
														}
														Static170.method2385(local244, local205, local423, local412 - 1, local2658);
													}
													Static360.anIntArray525[Static246.anInt3975++ & 0x1F] = local205;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static128.aClass211_56) {
													Static182.anInt3110 = Static26.aClass2_Sub13_Sub2_1.method3580();
													Static298.anInt167 = Static26.aClass2_Sub13_Sub2_1.method3545() << 3;
													Static330.anInt5585 = Static26.aClass2_Sub13_Sub2_1.method3545() << 3;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static85.aClass211_42 == Static175.aClass211_73) {
													Static312.method4252(Static137.aBoolean469);
													Static175.aClass211_73 = null;
													return false;
												} else if (Static150.aClass211_65 == Static175.aClass211_73) {
													Static330.anInt5585 = Static26.aClass2_Sub13_Sub2_1.method3573() << 3;
													Static182.anInt3110 = Static26.aClass2_Sub13_Sub2_1.method3587();
													Static298.anInt167 = Static26.aClass2_Sub13_Sub2_1.method3545() << 3;
													while (Static26.aClass2_Sub13_Sub2_1.anInt4347 < Static209.anInt3493) {
														@Pc(5356) Class225 local5356 = Static279.method4995()[Static26.aClass2_Sub13_Sub2_1.method3580()];
														Static240.method3071(local5356);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static386.aClass211_137 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3559();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3547();
													if (Static430.method5387(local213)) {
														Static332.method4450(5, local67, local205, local244);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static68.aClass211_112) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (Static430.method5387(local205)) {
														Static253.method3209();
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static61.aClass211_34) {
													if (Static142.anInt2523 != -1) {
														Static361.method4757(0, Static142.anInt2523);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static450.aClass211_159 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3587();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3548();
													if (local213 == 65535) {
														local213 = -1;
													}
													Static89.method1411(local67, local205, local213);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static162.aClass211_68 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3587();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
													if (local67 == 65535) {
														local67 = -1;
													}
													local213 = Static26.aClass2_Sub13_Sub2_1.method3567();
													Static442.method5595(local67, local213, local205);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static25.aClass211_12) {
													local3112 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (Static430.method5387(local67)) {
														Static254.method3217(local213, local3112);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static289.aClass211_106) {
													Static252.anInt4055 = 1;
													Static175.aClass211_73 = null;
													Static336.anInt5710 = Static234.anInt3754;
													return true;
												} else if (Static175.aClass211_73 == Static96.aClass211_48) {
													local3112 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (local67 == 65535) {
														local67 = -1;
													}
													local213 = Static26.aClass2_Sub13_Sub2_1.method3600();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3587();
													if (local213 >= 1 && local213 <= 8) {
														if (local3112.equalsIgnoreCase("null")) {
															local3112 = null;
														}
														Static43.aStringArray5[local213 - 1] = local3112;
														Static99.anIntArray147[local213 - 1] = local67;
														Static232.aBooleanArray15[local213 - 1] = local244 == 0;
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static447.aClass211_158) {
													Static2.anInt4 = Static26.aClass2_Sub13_Sub2_1.method3541();
													Static409.aBoolean471 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static312.aClass211_114 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (Static430.method5387(local205)) {
														Static279.method4996();
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static243.aClass211_21 == Static175.aClass211_73) {
													Static240.method3071(Static378.aClass225_17);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static90.aClass211_43) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3593();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3556();
													Static138.aClass268_1.method5651(local67, local205);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static228.aClass211_89 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3576();
													if (local205 == 65535) {
														local205 = -1;
													}
													local67 = Static26.aClass2_Sub13_Sub2_1.method3593();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3559();
													if (Static430.method5387(local67)) {
														Static332.method4450(1, local213, local205, -1);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static354.aClass211_123) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (Static430.method5387(local205) && Static151.aClass16ArrayArray1[local67] != null) {
														for (local412 = local213; local412 < local244; local412++) {
															local423 = Static26.aClass2_Sub13_Sub2_1.method3563();
															if (local412 < Static151.aClass16ArrayArray1[local67].length && Static151.aClass16ArrayArray1[local67][local412] != null) {
																Static151.aClass16ArrayArray1[local67][local412].anInt253 = local423;
															}
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static20.aClass211_8 == Static175.aClass211_73) {
													Static240.method3071(Static128.aClass225_9);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static245.aClass211_94) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3600();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3576();
													if (Static430.method5387(local67)) {
														Static10.anInt152 = local205;
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static140.aClass211_61) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3556();
													local2658 = (local67 & 0x1) == 1;
													Static288.method3840(local2658, local205);
													Static360.anIntArray525[Static246.anInt3975++ & 0x1F] = local205;
													Static175.aClass211_73 = null;
													return true;
												} else if (Static64.aClass211_35 == Static175.aClass211_73) {
													Static2.aString2 = Static209.anInt3493 <= 2 ? Static57.aClass134_20.method2720(Static331.anInt5597) : Static26.aClass2_Sub13_Sub2_1.method3582();
													Static46.anInt817 = Static209.anInt3493 > 0 ? Static26.aClass2_Sub13_Sub2_1.method3555() : -1;
													if (Static46.anInt817 == 65535) {
														Static46.anInt817 = -1;
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static378.aClass211_133) {
													local3112 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local1471 = Static216.aClass219_1.method4730(local67).method5275(Static26.aClass2_Sub13_Sub2_1);
													Static234.method3027(0, local1471, null, 19, local67, local3112, local3112);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static363.aClass211_127 == Static175.aClass211_73) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = local268;
													if (local368) {
														local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													}
													local3875 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local3880 = Static26.aClass2_Sub13_Sub2_1.method3563();
													local435 = Static26.aClass2_Sub13_Sub2_1.method3580();
													@Pc(5956) long local5956 = (local3875 << 32) + local3880;
													@Pc(5958) boolean local5958 = false;
													local2003 = 0;
													while (true) {
														if (local2003 >= 100) {
															if (local435 <= 1) {
																if (Static409.aBoolean471 && !Static399.aBoolean464 || Static298.aBoolean16) {
																	local5958 = true;
																} else if (Static214.method2831(local1471)) {
																	local5958 = true;
																}
															}
															break;
														}
														if (local5956 == Static284.aLongArray8[local2003]) {
															local5958 = true;
															break;
														}
														local2003++;
													}
													if (!local5958 && Static330.anInt5583 == 0) {
														Static284.aLongArray8[Static355.anInt6511] = local5956;
														Static355.anInt6511 = (Static355.anInt6511 + 1) % 100;
														@Pc(6022) String local6022 = Static249.method3171(Static114.method1736(Static26.aClass2_Sub13_Sub2_1));
														if (local435 == 2) {
															Static234.method3027(0, local6022, null, 7, -1, "<img=1>" + local268, "<img=1>" + local1471);
														} else if (local435 == 1) {
															Static234.method3027(0, local6022, null, 7, -1, "<img=0>" + local268, "<img=0>" + local1471);
														} else {
															Static234.method3027(0, local6022, null, 3, -1, local268, local1471);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static312.aClass211_115) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3555() << 0;
													local412 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local423 = Static26.aClass2_Sub13_Sub2_1.method3580();
													if (Static430.method5387(local205)) {
														Static16.method199(local213, local423, local67, local244, true, local412);
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static251.aClass211_97) {
													Static6.method110(Static26.aClass2_Sub13_Sub2_1, Static79.aClass183_2, Static209.anInt3493);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static155.aClass211_66 == Static175.aClass211_73) {
													Static273.method3660(Static26.aClass2_Sub13_Sub2_1.method3582());
													Static175.aClass211_73 = null;
													return true;
												} else if (Static93.aClass211_46 == Static175.aClass211_73) {
													Static138.aClass268_1.method5654();
													Static175.aClass211_73 = null;
													Static259.anInt4264 += 32;
													return true;
												} else if (Static67.aClass211_36 == Static175.aClass211_73) {
													local368 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
													local268 = Static26.aClass2_Sub13_Sub2_1.method3582();
													local1471 = local268;
													if (local368) {
														local1471 = Static26.aClass2_Sub13_Sub2_1.method3582();
													}
													local3875 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local3880 = Static26.aClass2_Sub13_Sub2_1.method3563();
													local435 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local439 = Static26.aClass2_Sub13_Sub2_1.method3555();
													@Pc(6223) long local6223 = (local3875 << 32) + local3880;
													@Pc(6225) boolean local6225 = false;
													local2227 = 0;
													while (true) {
														if (local2227 >= 100) {
															if (local435 <= 1 && Static214.method2831(local1471)) {
																local6225 = true;
															}
															break;
														}
														if (Static284.aLongArray8[local2227] == local6223) {
															local6225 = true;
															break;
														}
														local2227++;
													}
													if (!local6225 && Static330.anInt5583 == 0) {
														Static284.aLongArray8[Static355.anInt6511] = local6223;
														Static355.anInt6511 = (Static355.anInt6511 + 1) % 100;
														@Pc(6276) String local6276 = Static216.aClass219_1.method4730(local439).method5275(Static26.aClass2_Sub13_Sub2_1);
														if (local435 == 2) {
															Static234.method3027(0, local6276, null, 18, local439, "<img=1>" + local268, "<img=1>" + local1471);
														} else if (local435 == 1) {
															Static234.method3027(0, local6276, null, 18, local439, "<img=0>" + local268, "<img=0>" + local1471);
														} else {
															Static234.method3027(0, local6276, null, 18, local439, local268, local1471);
														}
													}
													Static175.aClass211_73 = null;
													return true;
												} else if (Static79.aClass211_41 == Static175.aClass211_73) {
													local205 = Static26.aClass2_Sub13_Sub2_1.method3555();
													if (local205 == 65535) {
														local205 = -1;
													}
													local67 = Static26.aClass2_Sub13_Sub2_1.method3580();
													local213 = Static26.aClass2_Sub13_Sub2_1.method3555();
													local244 = Static26.aClass2_Sub13_Sub2_1.method3580();
													Static380.method360(local213, local205, local244, local67);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static141.aClass211_62 == Static175.aClass211_73) {
													Static240.method3071(Static350.aClass225_14);
													Static175.aClass211_73 = null;
													return true;
												} else if (Static175.aClass211_73 == Static273.aClass211_103) {
													Static207.method2673(true);
													Static175.aClass211_73 = null;
													return true;
												} else {
													Static434.method5460(null, "T1 - " + (Static175.aClass211_73 == null ? -1 : Static175.aClass211_73.method4520()) + "," + (Static248.aClass211_96 == null ? -1 : Static248.aClass211_96.method4520()) + "," + (Static246.aClass211_95 == null ? -1 : Static246.aClass211_95.method4520()) + " - " + Static209.anInt3493);
													Static312.method4252(false);
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
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)I")
	public static int method5304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(16) int local16 = 255 - local7;
		@Pc(34) int local34 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return ((local16 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local16 & 0xFF00FF00) >>> 8) + local34;
	}
}
