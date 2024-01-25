import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[B")
	public static final byte[] aByteArray20 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	public static final int[] anIntArray74 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt1145 = 1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method1064(@OriginalArg(0) int arg0) {
		if (Static13.anInt334 == arg0) {
			return;
		}
		if (Static13.anInt334 == 0) {
			Static245.method4672();
		}
		if (arg0 == 40) {
			Static149.method2883();
		}
		if (arg0 != 40 && Static30.aClass76_1 != null) {
			Static30.aClass76_1.method2377();
			Static30.aClass76_1 = null;
		}
		if (Static13.anInt334 == 25 || Static13.anInt334 == 28) {
			Static195.aClass30_57.anInt1229 = 2;
			Static155.aClass30_46.anInt1229 = 2;
			Static83.aClass30_21.anInt1229 = 2;
			Static276.aClass30_82.anInt1229 = 2;
			Static270.aClass30_79.anInt1229 = 2;
			Static247.aClass30_75.anInt1229 = 2;
			Static218.aClass30_65.anInt1229 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static90.anInt2053 = 1;
			Static295.anInt5680 = 0;
			Static314.anInt6028 = 0;
			Static210.anInt4182 = 0;
			Static280.anInt5470 = 1;
			Static138.method2789(true);
			Static195.aClass30_57.anInt1229 = 1;
			Static155.aClass30_46.anInt1229 = 1;
			Static83.aClass30_21.anInt1229 = 1;
			Static276.aClass30_82.anInt1229 = 1;
			Static270.aClass30_79.anInt1229 = 1;
			Static247.aClass30_75.anInt1229 = 1;
			Static218.aClass30_65.anInt1229 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static211.method3897();
		}
		if (arg0 == 5) {
			Static242.method4517(Static280.aClass30_83, Static9.aClass63_1);
		} else {
			Static24.method613();
		}
		@Pc(141) boolean local141 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(154) boolean local154 = Static13.anInt334 == 5 || Static13.anInt334 == 10 || Static13.anInt334 == 28;
		if (local154 != local141) {
			if (local141) {
				Static185.anInt1932 = Static148.anInt3111;
				if (Static219.anInt4418 == 0) {
					Static238.method4404();
				} else {
					Static271.method597(Static148.anInt3111, 255, Static330.aClass30_93);
				}
				Static280.aClass191_2.method5187(false);
			} else {
				Static238.method4404();
				Static280.aClass191_2.method5187(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static9.aClass63_1.method4556();
		}
		Static13.anInt334 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1065() {
		Static155.anInt3188 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static277.anInt5394; local3++) {
			@Pc(10) Class11_Sub2_Sub6_Sub2 local10 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local3]];
			if (local10.aBoolean502 && local10.method5886() != -1) {
				@Pc(28) int local28 = (local10.method5894() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6729 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6726 - local28 >> 7;
				@Pc(49) Class11_Sub2_Sub6 local49 = Static50.method1206(local10.aByte79, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6792;
					if (local49 instanceof Class11_Sub2_Sub6_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6793 == 0 && local49.method5886() != -1) {
						Static209.anIntArray346[Static155.anInt3188] = local54;
						Static180.anIntArray281[Static155.anInt3188] = local54;
						Static155.anInt3188++;
						local49.anInt6793++;
					}
					Static209.anIntArray346[Static155.anInt3188] = local54;
					Static180.anIntArray281[Static155.anInt3188] = local10.anInt6792 + 2048;
					Static155.anInt3188++;
					local49.anInt6793++;
				}
			}
		}
		Static272.method4852(Static180.anIntArray281, 0, Static209.anIntArray346, Static155.anInt3188 - 1);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1069(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static99.anInt2276;
		@Pc(3) int[] local3 = Static238.anIntArray382;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static277.anInt5394; local5++) {
			@Pc(15) Class11_Sub2_Sub6 local15;
			if (local5 < local1) {
				local15 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local3[local5]];
			} else {
				local15 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local5 - local1]];
			}
			if (local15.aByte79 == arg0 && local15.anInt6770 >= 0) {
				@Pc(35) int local35 = local15.method5894();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6729 & 0x7F) != 0 || (local15.anInt6726 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6729 & 0x7F) != 64 || (local15.anInt6726 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6729 >> 7;
					local76 = local15.anInt6726 >> 7;
					if (local15.anInt6770 > Static344.anIntArrayArray50[local71][local76]) {
						Static344.anIntArrayArray50[local71][local76] = local15.anInt6770;
						Static281.anIntArrayArray60[local71][local76] = 1;
					} else if (local15.anInt6770 == Static344.anIntArrayArray50[local71][local76]) {
						local112 = Static281.anIntArrayArray60[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6729 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6726 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6729 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6726 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6770 > Static344.anIntArrayArray50[local154][local157]) {
								Static344.anIntArrayArray50[local154][local157] = local15.anInt6770;
								Static281.anIntArrayArray60[local154][local157] = 1;
							} else if (local15.anInt6770 == Static344.anIntArrayArray50[local154][local157]) {
								local112 = Static281.anIntArrayArray60[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1070(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static99.anInt2276;
		@Pc(3) int[] local3 = Static238.anIntArray382;
		@Pc(11) int local11 = Static122.aBoolean98 ? local1 : local1 + Static277.anInt5394;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub2_Sub6 local23;
			if (local13 < local1) {
				local23 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local3[local13]];
			} else {
				local23 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local13 - local1]];
			}
			if (local23.aByte79 == arg0) {
				local23.anInt6793 = 0;
				if (local23.anInt6770 < 0) {
					local23.aBoolean502 = false;
				} else {
					@Pc(50) int local50 = local23.method5894();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6729 & 0x7F) != 0 || (local23.anInt6726 & 0x7F) != 0) {
							local23.aBoolean502 = false;
							continue;
						}
					} else if ((local23.anInt6729 & 0x7F) != 64 || (local23.anInt6726 & 0x7F) != 64) {
						local23.aBoolean502 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6729 >> 7;
						local97 = local23.anInt6726 >> 7;
						if (local23.anInt6770 != Static344.anIntArrayArray50[local92][local97]) {
							local23.aBoolean502 = true;
							continue;
						}
						if (Static281.anIntArrayArray60[local92][local97] > 1) {
							local122 = Static281.anIntArrayArray60[local92][local97]--;
							local23.aBoolean502 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6729 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6726 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6729 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6726 + local92 >> 7;
						if (!Static24.method608(local23.anInt6770, local165, local97, local158, local151)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6770 == Static344.anIntArrayArray50[local176][local179]) {
										local122 = Static281.anIntArrayArray60[local176][local179]--;
									}
								}
							}
							local23.aBoolean502 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub2_Sub6_Sub1 && local23.aClass1_Sub41_3 != null && Static51.anInt1301 >= local23.aClass1_Sub41_3.anInt6226 && Static51.anInt1301 < local23.aClass1_Sub41_3.anInt6214) {
						((Class11_Sub2_Sub6_Sub1) local23).aBoolean496 = false;
					}
					local23.aBoolean502 = false;
					local23.anInt6727 = Static8.method288(local23.aByte79, local23.anInt6729, local23.anInt6726);
					Static152.method2920(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1071() {
		@Pc(1) int local1 = Static99.anInt2276;
		@Pc(3) int[] local3 = Static238.anIntArray382;
		@Pc(11) int local11 = Static122.aBoolean98 ? local1 : local1 + Static277.anInt5394;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub2_Sub6 local23;
			if (local13 < local1) {
				local23 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local3[local13]];
			} else {
				local23 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local13 - local1]];
			}
			if (local23.anInt6770 >= 0) {
				@Pc(39) int local39 = local23.method5894();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6729 & 0x7F) == 0 && (local23.anInt6726 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6729 & 0x7F) == 64 && (local23.anInt6726 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class11_Sub2_Sub6_Sub1 && local23.aClass1_Sub41_3 != null && Static51.anInt1301 >= local23.aClass1_Sub41_3.anInt6226 && Static51.anInt1301 < local23.aClass1_Sub41_3.anInt6214) {
					((Class11_Sub2_Sub6_Sub1) local23).aBoolean496 = false;
				}
				local23.anInt6727 = Static8.method288(local23.aByte79, local23.anInt6729, local23.anInt6726);
				Static152.method2920(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)Lclient!at;")
	public static Class1_Sub7 method1072() {
		@Pc(8) Class1_Sub7 local8 = new Class1_Sub7(38);
		local8.method2121(15);
		local8.method2121(Static140.anInt3021);
		local8.method2121(Static103.aBoolean159 ? 1 : 0);
		local8.method2121(Static43.aBoolean407 ? 1 : 0);
		local8.method2121(Static30.aBoolean49 ? 1 : 0);
		local8.method2121(Static80.aBoolean128 ? 1 : 0);
		local8.method2121(0);
		local8.method2121(Static318.aBoolean455 ? 1 : 0);
		local8.method2121(Static239.aBoolean363 ? 1 : 0);
		local8.method2121(Static61.aBoolean108 ? 1 : 0);
		local8.method2121(Static218.anInt4352);
		local8.method2121(Static69.aBoolean112 ? 1 : 0);
		local8.method2121(Static24.aBoolean34 ? 1 : 0);
		local8.method2121(Static291.aBoolean430 ? 1 : 0);
		local8.method2121(Static209.anInt4164);
		local8.method2121(Static299.aBoolean302 ? 1 : 0);
		local8.method2121(Static124.anInt2721);
		local8.method2121(Static219.anInt4418);
		local8.method2121(Static105.anInt2415);
		local8.method2144(Static42.anInt1013);
		local8.method2144(Static170.anInt3543);
		local8.method2121(Static79.method1692());
		local8.method2115(Static277.anInt5395);
		local8.method2121(Static164.anInt3449);
		local8.method2121(Static367.aBoolean512 ? 1 : 0);
		local8.method2121(Static41.aBoolean62 ? 1 : 0);
		local8.method2121(Static72.anInt1645);
		local8.method2121(Static271.aBoolean33 ? 1 : 0);
		local8.method2121(Static209.aBoolean308 ? 1 : 0);
		local8.method2121(Static257.anInt1060);
		local8.method2121(Static298.aBoolean483 ? 1 : 0);
		local8.method2121(Static359.anInt6875);
		local8.method2121(Static300.anInt5779);
		return local8;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1073() {
		for (@Pc(1) int local1 = 0; local1 < Static311.anInt5653; local1++) {
			@Pc(6) int[] local6 = Static344.anIntArrayArray50[local1];
			for (@Pc(8) int local8 = 0; local8 < Static189.anInt3820; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1075() {
		@Pc(1) int local1 = Static99.anInt2276;
		@Pc(3) int[] local3 = Static238.anIntArray382;
		@Pc(18) boolean local18 = Static257.anInt1060 == 1 && local1 > 200 || Static257.anInt1060 == 0 && local1 > 50;
		@Pc(73) int local73;
		for (@Pc(20) int local20 = 0; local20 < local1; local20++) {
			@Pc(27) Class11_Sub2_Sub6_Sub1 local27 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local3[local20]];
			if (local27.method5858()) {
				local27.method5879();
				if (local27.aShort94 >= 0 && local27.aShort93 >= 0 && local27.aShort92 < Static311.anInt5653 && local27.aShort91 < Static189.anInt3820) {
					local27.aBoolean496 = local27.aBoolean499 ? local18 : false;
					if (local27 == Static191.aClass11_Sub2_Sub6_Sub1_4) {
						local27.anInt6770 = Integer.MAX_VALUE;
					} else {
						local73 = 0;
						if (!local27.aBoolean502) {
							local73++;
						}
						if (local27.anInt6769 > Static51.anInt1301) {
							local73 += 2;
						}
						local73 += 5 - local27.method5894() << 2;
						if (Static363.anInt6977 == 0) {
							local73 += 32;
						} else {
							local73 += 128;
						}
						local73 += 256;
						local27.anInt6770 = local73 + 1;
					}
				} else {
					local27.anInt6770 = -1;
				}
			} else {
				local27.anInt6770 = -1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static277.anInt5394; local109++) {
			@Pc(116) Class11_Sub2_Sub6_Sub2 local116 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local109]];
			if (local116.method5901() && local116.aClass208_1.method5537()) {
				local116.method5879();
				if (local116.aShort94 >= 0 && local116.aShort93 >= 0 && local116.aShort92 < Static311.anInt5653 && local116.aShort91 < Static189.anInt3820) {
					@Pc(152) int local152 = 0;
					if (!local116.aBoolean502) {
						local152++;
					}
					if (local116.anInt6769 > Static51.anInt1301) {
						local152 += 2;
					}
					local152 += 5 - local116.method5894() << 2;
					if (Static363.anInt6977 == 0) {
						if (local116.aClass208_1.aBoolean463) {
							local152 += 64;
						} else {
							local152 += 128;
						}
					} else if (Static363.anInt6977 == 1) {
						if (local116.aClass208_1.aBoolean463) {
							local152 += 32;
						} else {
							local152 += 64;
						}
					}
					if (local116.aClass208_1.aBoolean464) {
						local152 += 1024;
					} else if (!local116.aClass208_1.aBoolean462) {
						local152 += 256;
					}
					local116.anInt6770 = local152 + 1;
				} else {
					local116.anInt6770 = -1;
				}
			} else {
				local116.anInt6770 = -1;
			}
		}
		for (local73 = 0; local73 < Static60.aClass101Array1.length; local73++) {
			@Pc(218) Class101 local218 = Static60.aClass101Array1[local73];
			if (local218 != null) {
				if (local218.anInt3096 == 1) {
					@Pc(229) Class11_Sub2_Sub6_Sub2 local229 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local218.anInt3103];
					if (local229 != null && local229.anInt6770 >= 0) {
						local229.anInt6770 += 2048;
					}
				} else if (local218.anInt3096 == 10) {
					@Pc(250) Class11_Sub2_Sub6_Sub1 local250 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local218.anInt3103];
					if (local250 != null && local250 != Static191.aClass11_Sub2_Sub6_Sub1_4 && local250.anInt6770 >= 0) {
						local250.anInt6770 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method1076(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kg;)Z")
	public static boolean method1077(@OriginalArg(0) Class112 arg0) {
		if (Static339.aBoolean444) {
			if (method1079(arg0).anInt6536 != 0) {
				return false;
			}
			if (arg0.anInt3373 == 0) {
				return false;
			}
		}
		return arg0.aBoolean232;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III[B)I")
	public static int method1078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = Class1_Sub1_Sub39.anIntArray514[(local7 ^ arg2[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kg;)Lclient!vm;")
	public static Class1_Sub42 method1079(@OriginalArg(0) Class112 arg0) {
		@Pc(13) Class1_Sub42 local13 = (Class1_Sub42) Static113.aClass38_10.method1475(((long) arg0.anInt3376 << 32) + (long) arg0.anInt3398);
		return local13 == null ? arg0.aClass1_Sub42_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!kg;IIIIIIIII)V")
	public static void method1080(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class112 local6 = arg0[local1];
			if (local6 != null && local6.anInt3428 == arg1) {
				@Pc(17) int local17 = local6.anInt3408 + arg6;
				@Pc(22) int local22 = local6.anInt3450 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3373 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3381;
					@Pc(45) int local45 = local22 + local6.anInt3444;
					if (local6.anInt3373 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt3373 == 0 || local6.aBoolean231 || method1079(local6).anInt6536 != 0 || local6 == Static110.aClass112_8 || local6.anInt3446 == Static299.anInt4034) {
					if (!method1077(local6)) {
						if (local6 == Static243.aClass112_15) {
							Static291.aBoolean429 = true;
							Static146.anInt6824 = local17;
							Static130.anInt2824 = local22;
						}
						if (local6.aBoolean226 || local28 < local32 && local30 < local34) {
							if (local6.anInt3373 == 0 && local6.aBoolean227 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class1_Sub35 local151 = (Class1_Sub35) Static215.aClass42_37.method1543(); local151 != null; local151 = (Class1_Sub35) Static215.aClass42_37.method1551()) {
									if (local151.aBoolean389) {
										local151.method6045();
										local151.aClass112_16.aBoolean240 = false;
									}
								}
								if (Static311.anInt5651 == 0) {
									Static243.aClass112_15 = null;
									Static110.aClass112_8 = null;
								}
								Static313.anInt6023 = 0;
								Static202.aBoolean303 = false;
								Static51.aBoolean89 = false;
								if (!Static217.aBoolean322) {
									Static284.method5722();
								}
							}
							@Pc(207) boolean local207;
							if (Static164.aClass142_1.method4911() >= local28 && Static164.aClass142_1.method4915() >= local30 && Static164.aClass142_1.method4911() < local32 && Static164.aClass142_1.method4915() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static217.aBoolean322 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static188.method3535(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(235) boolean local235 = false;
							if (Static164.aClass142_1.method4907() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static189.aClass1_Sub8_1 != null && Static189.aClass1_Sub8_1.method598() == 0 && Static189.aClass1_Sub8_1.method593() >= local28 && Static189.aClass1_Sub8_1.method596() >= local30 && Static189.aClass1_Sub8_1.method593() < local32 && Static189.aClass1_Sub8_1.method596() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray67 != null) {
								for (local278 = 0; local278 < local6.aByteArray67.length; local278++) {
									if (Static271.aClass60_2.method1863(local6.aByteArray67[local278])) {
										if (local6.anIntArray245 == null || Static51.anInt1301 >= local6.anIntArray245[local278]) {
											@Pc(310) byte local310 = local6.aByteArray68[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static271.aClass60_2.method1863(86) && !Static271.aClass60_2.method1863(82) && !Static271.aClass60_2.method1863(81)) && ((local310 & 0x2) == 0 || Static271.aClass60_2.method1863(86)) && ((local310 & 0x1) == 0 || Static271.aClass60_2.method1863(82)) && ((local310 & 0x4) == 0 || Static271.aClass60_2.method1863(81))) {
												Static144.method2858(local278 + 1, local6.anInt3376, -1, "");
												local374 = local6.anIntArray252[local278];
												if (local6.anIntArray245 == null) {
													local6.anIntArray245 = new int[local6.aByteArray67.length];
												}
												if (local374 == 0) {
													local6.anIntArray245[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray245[local278] = Static51.anInt1301 + local374;
												}
											}
										}
									} else if (local6.anIntArray245 != null) {
										local6.anIntArray245[local278] = 0;
									}
								}
							}
							if (local245) {
								Static201.method3746(Static189.aClass1_Sub8_1.method596() - local22, Static189.aClass1_Sub8_1.method593() - local17, local6);
							}
							if (Static243.aClass112_15 != null && Static243.aClass112_15 != local6 && local207 && method1079(local6).method5753()) {
								Static128.aClass112_21 = local6;
							}
							if (local6 == Static110.aClass112_8) {
								Static224.aBoolean333 = true;
								Static353.anInt6596 = local17;
								Static293.anInt4950 = local22;
							}
							if (local6.aBoolean231 || local6.anInt3446 != 0) {
								@Pc(459) Class1_Sub35 local459;
								if (local207 && Static140.anInt3024 != 0 && local6.anObjectArray31 != null) {
									local459 = new Class1_Sub35();
									local459.aBoolean389 = true;
									local459.aClass112_16 = local6;
									local459.anInt5223 = Static140.anInt3024;
									local459.anObjectArray34 = local6.anObjectArray31;
									Static215.aClass42_37.method1549(local459);
								}
								if (Static243.aClass112_15 != null || Static217.aBoolean322 || local6.anInt3446 != Static177.anInt3690 && Static313.anInt6023 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt3446 != 0) {
									if (local6.anInt3446 == Static145.anInt3088 || local6.anInt3446 == Static71.anInt1629) {
										Static150.aClass112_18 = local6;
										if (Static191.aClass90_3 != null) {
											Static191.aClass90_3.method2735(local6.anInt3444, Static9.aClass63_1);
										}
										if (local6.anInt3446 == Static145.anInt3088) {
											if (!Static217.aBoolean322 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static95.method1827(Static9.aClass63_1, arg8, arg9);
												for (@Pc(542) Class32_Sub6 local542 = (Class32_Sub6) Static16.aClass195_1.method5302(); local542 != null; local542 = (Class32_Sub6) Static16.aClass195_1.method5298()) {
													if (arg8 >= local542.anInt5677 && arg8 < local542.anInt5676 && arg9 >= local542.anInt5675 && arg9 < local542.anInt5679) {
														Static284.method5722();
														Static176.method5663(local542.aClass11_Sub2_Sub6_1);
													}
												}
											}
											Static143.method2851(local17, local22, local6);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt3446 == Static299.anInt4034) {
										if (local6.method3110(Static9.aClass63_1) == null || Static294.anInt5663 != 0 && Static294.anInt5663 != 3 || Static217.aBoolean322 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray249[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray244[local614]) {
											continue;
										}
										local278 -= local6.anInt3381 / 2;
										local614 -= local6.anInt3444 / 2;
										if (Static50.anInt1273 == 4) {
											local653 = (int) Static357.aFloat76 & 0x3FFF;
										} else {
											local653 = (int) Static357.aFloat76 + Static163.anInt3359 & 0x3FFF;
										}
										@Pc(665) int local665 = Class208.anIntArray479[local653];
										@Pc(669) int local669 = Class208.anIntArray478[local653];
										if (Static50.anInt1273 != 4) {
											local665 = local665 * (Static293.anInt4951 + 256) >> 8;
											local669 = local669 * (Static293.anInt4951 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static50.anInt1273 == 4) {
											local719 = (Static78.anInt1750 >> 7) + (local698 >> 2);
											local727 = (Static138.anInt2972 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() - 1) * 64;
											local719 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 - local736 >> 7) + (local698 >> 2);
											local727 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 - local736 >> 7) - (local708 >> 2);
										}
										if (Static77.aBoolean119 && (Static127.anInt2772 & 0x40) != 0) {
											@Pc(769) Class112 local769 = Static147.method2868(Static166.anInt3467, Static9.anInt239);
											if (local769 == null) {
												Static89.method1874();
											} else {
												Static295.method5151(Static62.anInt1506, local727, false, true, Static365.aString65, 1L, " ->", 45, local719);
											}
											continue;
										}
										if (Static285.aClass81_4 == Static215.aClass81_2) {
											Static295.method5151(-1, local727, false, true, Static101.aClass106_79.method2927(Static254.anInt5172), 1L, "", 49, local719);
										}
										Static295.method5151(-1, local727, false, true, Static325.aString48, 1L, "", 18, local719);
										continue;
									}
									if (local6.anInt3446 == Static177.anInt3690) {
										Static135.aClass112_10 = local6;
										if (local207) {
											Static202.aBoolean303 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static189.aClass1_Sub8_1.method593() - local17 - local6.anInt3381 / 2) * 2.0D / (double) Static269.aFloat26);
											local614 = (int) -((double) (Static189.aClass1_Sub8_1.method596() - local22 - local6.anInt3444 / 2) * 2.0D / (double) Static269.aFloat26);
											local374 = Static207.anInt4093 + local278 + Static269.anInt3320;
											local653 = Static299.anInt4033 + local614 + Static269.anInt3314;
											@Pc(879) Class1_Sub4_Sub15 local879 = Static49.method1172();
											if (local879 == null) {
												continue;
											}
											@Pc(884) int[] local884 = new int[3];
											local879.method2983(local653, local374, local884);
											if (local884 != null) {
												if (Static271.aClass60_2.method1863(82) && Static110.anInt2477 > 0) {
													Static344.method4474(local884[1], local884[0], local884[2]);
													continue;
												}
												Static51.aBoolean89 = true;
												Static31.anInt787 = local884[0];
												Static277.anInt5393 = local884[1];
												Static89.anInt1986 = local884[2];
											}
											Static313.anInt6023 = 1;
											Static207.aBoolean307 = false;
											Static8.anInt235 = Static164.aClass142_1.method4911();
											Static325.anInt5184 = Static164.aClass142_1.method4915();
											continue;
										}
										if (local235 && Static313.anInt6023 > 0) {
											if (Static313.anInt6023 == 1 && (Static8.anInt235 != Static164.aClass142_1.method4911() || Static325.anInt5184 != Static164.aClass142_1.method4915())) {
												Static164.anInt3433 = Static207.anInt4093;
												Static209.anInt4165 = Static299.anInt4033;
												Static313.anInt6023 = 2;
											}
											if (Static313.anInt6023 == 2) {
												Static207.aBoolean307 = true;
												Static283.method5050(Static164.anInt3433 + (int) ((double) (Static8.anInt235 - Static164.aClass142_1.method4911()) * 2.0D / (double) Static269.aFloat25));
												Static331.method5576(Static209.anInt4165 - (int) ((double) (Static325.anInt5184 - Static164.aClass142_1.method4915()) * 2.0D / (double) Static269.aFloat25));
											}
											continue;
										}
										if (Static313.anInt6023 > 0 && !Static207.aBoolean307) {
											if ((Static349.anInt6554 == 1 || Static186.method3504()) && Static224.anInt4512 > 2) {
												Static82.method1767(Static325.anInt5184, Static8.anInt235, 2);
											} else if (Static195.method3640()) {
												Static82.method1767(Static325.anInt5184, Static8.anInt235, 0);
											}
										}
										Static313.anInt6023 = 0;
										continue;
									}
									if (local6.anInt3446 == Static10.anInt276) {
										if (local235) {
											Static182.method3460(Static164.aClass142_1.method4911() - local17, local6.anInt3444, local6.anInt3381, Static164.aClass142_1.method4915() - local22);
										}
										continue;
									}
									if (local6.anInt3446 == Static18.anInt474) {
										Static113.method2409(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean230 && local245) {
									local6.aBoolean230 = true;
									if (local6.anObjectArray26 != null) {
										local459 = new Class1_Sub35();
										local459.aBoolean389 = true;
										local459.aClass112_16 = local6;
										local459.anInt5222 = Static189.aClass1_Sub8_1.method593() - local17;
										local459.anInt5223 = Static189.aClass1_Sub8_1.method596() - local22;
										local459.anObjectArray34 = local6.anObjectArray26;
										Static215.aClass42_37.method1549(local459);
									}
								}
								if (local6.aBoolean230 && local235 && local6.anObjectArray25 != null) {
									local459 = new Class1_Sub35();
									local459.aBoolean389 = true;
									local459.aClass112_16 = local6;
									local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
									local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
									local459.anObjectArray34 = local6.anObjectArray25;
									Static215.aClass42_37.method1549(local459);
								}
								if (local6.aBoolean230 && !local235) {
									local6.aBoolean230 = false;
									if (local6.anObjectArray22 != null) {
										local459 = new Class1_Sub35();
										local459.aBoolean389 = true;
										local459.aClass112_16 = local6;
										local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
										local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
										local459.anObjectArray34 = local6.anObjectArray22;
										Static154.aClass42_17.method1549(local459);
									}
								}
								if (local235 && local6.anObjectArray14 != null) {
									local459 = new Class1_Sub35();
									local459.aBoolean389 = true;
									local459.aClass112_16 = local6;
									local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
									local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
									local459.anObjectArray34 = local6.anObjectArray14;
									Static215.aClass42_37.method1549(local459);
								}
								if (!local6.aBoolean240 && local207) {
									local6.aBoolean240 = true;
									if (local6.anObjectArray9 != null) {
										local459 = new Class1_Sub35();
										local459.aBoolean389 = true;
										local459.aClass112_16 = local6;
										local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
										local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
										local459.anObjectArray34 = local6.anObjectArray9;
										Static215.aClass42_37.method1549(local459);
									}
								}
								if (local6.aBoolean240 && local207 && local6.anObjectArray13 != null) {
									local459 = new Class1_Sub35();
									local459.aBoolean389 = true;
									local459.aClass112_16 = local6;
									local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
									local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
									local459.anObjectArray34 = local6.anObjectArray13;
									Static215.aClass42_37.method1549(local459);
								}
								if (local6.aBoolean240 && !local207) {
									local6.aBoolean240 = false;
									if (local6.anObjectArray17 != null) {
										local459 = new Class1_Sub35();
										local459.aBoolean389 = true;
										local459.aClass112_16 = local6;
										local459.anInt5222 = Static164.aClass142_1.method4911() - local17;
										local459.anInt5223 = Static164.aClass142_1.method4915() - local22;
										local459.anObjectArray34 = local6.anObjectArray17;
										Static154.aClass42_17.method1549(local459);
									}
								}
								if (local6.anObjectArray16 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray16;
									Static180.aClass42_31.method1549(local459);
								}
								@Pc(1425) Class1_Sub35 local1425;
								if (local6.anObjectArray28 != null && Static294.anInt5666 > local6.anInt3396) {
									if (local6.anIntArray247 == null || Static294.anInt5666 - local6.anInt3396 > 32) {
										local459 = new Class1_Sub35();
										local459.aClass112_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray28;
										Static215.aClass42_37.method1549(local459);
									} else {
										label659: for (local278 = local6.anInt3396; local278 < Static294.anInt5666; local278++) {
											local614 = Static162.anIntArray243[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray247.length; local374++) {
												if (local6.anIntArray247[local374] == local614) {
													local1425 = new Class1_Sub35();
													local1425.aClass112_16 = local6;
													local1425.anObjectArray34 = local6.anObjectArray28;
													Static215.aClass42_37.method1549(local1425);
													break label659;
												}
											}
										}
									}
									local6.anInt3396 = Static294.anInt5666;
								}
								if (local6.anObjectArray29 != null && Static138.anInt2974 > local6.anInt3366) {
									if (local6.anIntArray250 == null || Static138.anInt2974 - local6.anInt3366 > 32) {
										local459 = new Class1_Sub35();
										local459.aClass112_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray29;
										Static215.aClass42_37.method1549(local459);
									} else {
										label635: for (local278 = local6.anInt3366; local278 < Static138.anInt2974; local278++) {
											local614 = Static165.anIntArray254[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray250.length; local374++) {
												if (local6.anIntArray250[local374] == local614) {
													local1425 = new Class1_Sub35();
													local1425.aClass112_16 = local6;
													local1425.anObjectArray34 = local6.anObjectArray29;
													Static215.aClass42_37.method1549(local1425);
													break label635;
												}
											}
										}
									}
									local6.anInt3366 = Static138.anInt2974;
								}
								if (local6.anObjectArray11 != null && Static120.anInt2628 > local6.anInt3400) {
									if (local6.anIntArray248 == null || Static120.anInt2628 - local6.anInt3400 > 32) {
										local459 = new Class1_Sub35();
										local459.aClass112_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray11;
										Static215.aClass42_37.method1549(local459);
									} else {
										label611: for (local278 = local6.anInt3400; local278 < Static120.anInt2628; local278++) {
											local614 = Static1.anIntArray1[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray248.length; local374++) {
												if (local6.anIntArray248[local374] == local614) {
													local1425 = new Class1_Sub35();
													local1425.aClass112_16 = local6;
													local1425.anObjectArray34 = local6.anObjectArray11;
													Static215.aClass42_37.method1549(local1425);
													break label611;
												}
											}
										}
									}
									local6.anInt3400 = Static120.anInt2628;
								}
								if (local6.anObjectArray24 != null && Static196.anInt3969 > local6.anInt3448) {
									if (local6.anIntArray253 == null || Static196.anInt3969 - local6.anInt3448 > 32) {
										local459 = new Class1_Sub35();
										local459.aClass112_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray24;
										Static215.aClass42_37.method1549(local459);
									} else {
										label587: for (local278 = local6.anInt3448; local278 < Static196.anInt3969; local278++) {
											local614 = Static314.anIntArray470[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray253.length; local374++) {
												if (local6.anIntArray253[local374] == local614) {
													local1425 = new Class1_Sub35();
													local1425.aClass112_16 = local6;
													local1425.anObjectArray34 = local6.anObjectArray24;
													Static215.aClass42_37.method1549(local1425);
													break label587;
												}
											}
										}
									}
									local6.anInt3448 = Static196.anInt3969;
								}
								if (local6.anObjectArray21 != null && Static139.anInt3015 > local6.anInt3412) {
									if (local6.anIntArray246 == null || Static139.anInt3015 - local6.anInt3412 > 32) {
										local459 = new Class1_Sub35();
										local459.aClass112_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray21;
										Static215.aClass42_37.method1549(local459);
									} else {
										label563: for (local278 = local6.anInt3412; local278 < Static139.anInt3015; local278++) {
											local614 = Static341.anIntArray490[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray246.length; local374++) {
												if (local6.anIntArray246[local374] == local614) {
													local1425 = new Class1_Sub35();
													local1425.aClass112_16 = local6;
													local1425.anObjectArray34 = local6.anObjectArray21;
													Static215.aClass42_37.method1549(local1425);
													break label563;
												}
											}
										}
									}
									local6.anInt3412 = Static139.anInt3015;
								}
								if (Static159.anInt3266 > local6.anInt3370 && local6.anObjectArray12 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray12;
									Static215.aClass42_37.method1549(local459);
								}
								if (Static27.anInt621 > local6.anInt3370 && local6.anObjectArray10 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray10;
									Static215.aClass42_37.method1549(local459);
								}
								if (Static55.anInt1396 > local6.anInt3370 && local6.anObjectArray5 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray5;
									Static215.aClass42_37.method1549(local459);
								}
								if (Static46.anInt1183 > local6.anInt3370 && local6.anObjectArray2 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray2;
									Static215.aClass42_37.method1549(local459);
								}
								if (Static264.anInt5206 > local6.anInt3370 && local6.anObjectArray27 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray27;
									Static215.aClass42_37.method1549(local459);
								}
								local6.anInt3370 = Static356.anInt6822;
								if (local6.anObjectArray7 != null) {
									for (local278 = 0; local278 < Static27.anInt619; local278++) {
										@Pc(1893) Class1_Sub35 local1893 = new Class1_Sub35();
										local1893.aClass112_16 = local6;
										local1893.anInt5220 = Static204.aClass159Array1[local278].method4339();
										local1893.anInt5225 = Static204.aClass159Array1[local278].method4340();
										local1893.anObjectArray34 = local6.anObjectArray7;
										Static215.aClass42_37.method1549(local1893);
									}
								}
								if (Static134.aBoolean208 && local6.anObjectArray30 != null) {
									local459 = new Class1_Sub35();
									local459.aClass112_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray30;
									Static215.aClass42_37.method1549(local459);
								}
							}
							if (local6.anInt3373 == 5 && local6.anInt3377 != -1) {
								local6.method3103().method2735(local6.anInt3444, Static9.aClass63_1);
							}
							Static315.method5400(local6);
							if (local6.anInt3373 == 0) {
								method1080(arg0, local6.anInt3376, local28, local30, local32, local34, local17 - local6.anInt3372, local22 - local6.anInt3419, arg8, arg9);
								if (local6.aClass112Array2 != null) {
									method1080(local6.aClass112Array2, local6.anInt3376, local28, local30, local32, local34, local17 - local6.anInt3372, local22 - local6.anInt3419, arg8, arg9);
								}
								@Pc(2013) Class1_Sub15 local2013 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local6.anInt3376);
								if (local2013 != null) {
									if (Static285.aClass81_4 == Static171.aClass81_1 && local2013.anInt1494 == 0 && !Static217.aBoolean322 && local207 && !Static339.aBoolean444) {
										Static284.method5722();
									}
									Static89.method1872(arg9, local22, arg8, local2013.anInt1496, local28, local17, local30, local32, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static315.method5400(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kg;)Lclient!kg;")
	public static Class112 method1081(@OriginalArg(0) Class112 arg0) {
		@Pc(4) int local4 = method1079(arg0).method5744();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static188.method3536(arg0.anInt3428);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!kg;ILclient!fp;ILclient!tm;)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class112 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(8) Class92 arg7) {
		@Pc(15) Class194 local15 = Static226.method4184(arg1);
		if (local15 == null || !local15.aBoolean436 || !local15.method5269()) {
			return;
		}
		@Pc(34) int local34;
		if (local15.anIntArray452 != null) {
			@Pc(32) int[] local32 = new int[local15.anIntArray452.length];
			@Pc(48) int local48;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static50.anInt1273 == 4) {
					local48 = (int) Static357.aFloat76 & 0x3FFF;
				} else {
					local48 = Static163.anInt3359 + (int) Static357.aFloat76 & 0x3FFF;
				}
				@Pc(59) int local59 = Class208.anIntArray479[local48];
				@Pc(63) int local63 = Class208.anIntArray478[local48];
				if (Static50.anInt1273 != 4) {
					local63 = local63 * 256 / (Static293.anInt4951 + 256);
					local59 = local59 * 256 / (Static293.anInt4951 + 256);
				}
				local32[local34 * 2] = ((local15.anIntArray452[local34 * 2] * 4 + arg0) * local63 + local59 * (arg3 + local15.anIntArray452[local34 * 2 + 1] * 4) >> 15) + arg5 + arg4.anInt3381 / 2;
				local32[local34 * 2 + 1] = arg4.anInt3444 / 2 + arg2 - (-(local59 * (arg0 - -(local15.anIntArray452[local34 * 2] * 4))) + (local15.anIntArray452[local34 * 2 - -1] * 4 + arg3) * local63 >> 15);
			}
			Static303.method5254(arg6, local32, local15.anInt5816, arg4.anIntArray249, arg4.anIntArray244);
			for (local48 = 0; local48 < local32.length / 2 - 1; local48++) {
				arg6.method4585(local32[local48 * 2], local32[local48 * 2 + 1], local32[local48 * 2 + 2], local32[local48 * 2 + 3], local15.anInt5841, arg7, arg5, arg2);
			}
			arg6.method4585(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local15.anInt5841, arg7, arg5, arg2);
		}
		@Pc(264) Class4 local264 = null;
		if (local15.anInt5823 != -1) {
			local264 = local15.method5262(false, arg6);
			if (local264 != null) {
				Static83.method1772(arg0, arg4, local264, arg3, arg7, arg5, arg2);
			}
		}
		if (local15.aString51 == null) {
			return;
		}
		local34 = 0;
		if (local264 != null) {
			local34 = local264.method5952();
		}
		@Pc(297) Class33 local297 = Static364.aClass33_4;
		@Pc(299) Class80 local299 = Static315.aClass80_15;
		if (local15.anInt5834 == 1) {
			local297 = Static24.aClass33_1;
			local299 = Static91.aClass80_20;
		}
		if (local15.anInt5834 == 2) {
			local299 = Static64.aClass80_17;
			local297 = Static340.aClass33_3;
		}
		Static328.method5545(arg4, arg7, local34, local15.anInt5843, arg5, arg3, local299, arg2, local15.aString51, arg0, local297);
		return;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)I")
	public static int method1083() {
		return 16;
	}
}
