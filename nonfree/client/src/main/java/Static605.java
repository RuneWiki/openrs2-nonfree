import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!su", name = "u", descriptor = "I")
	public static int anInt9181;

	// $FF: synthetic field
	@OriginalMember(owner = "client!su", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass28;

	@OriginalMember(owner = "client!su", name = "F", descriptor = "J")
	public static long aLong302 = 0L;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "I")
	public static int anInt9179 = 0;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[4];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method7764(@OriginalArg(0) Class22 arg0) {
		if (Static477.aBoolean508) {
			Static349.method4926(arg0);
		} else {
			Static182.method2886(arg0);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!sla;I)V")
	public static void method7770(@OriginalArg(0) Class344 arg0) {
		@Pc(8) Class3_Sub2_Sub1 local8 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		@Pc(19) int local19;
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (arg0 == Static507.aClass344_11) {
			local8.method2048(255);
			local19 = local8.method2048(255);
			local28 = Static367.anInt5752 + (local19 >> 4 & 0x7);
			local35 = Static121.anInt2470 + (local19 & 0x7);
			local39 = local8.method2028(-14795);
			local43 = local8.method2048(255);
			local47 = local8.method2061();
			@Pc(51) String local51 = local8.method2014();
			Static625.method8223(local28, local43, local39, local47, Static479.anInt7523, local51, local35);
			return;
		}
		@Pc(105) int local105;
		@Pc(140) int local140;
		@Pc(146) int local146;
		@Pc(148) int local148;
		if (Static322.aClass344_6 == arg0) {
			local19 = local8.method2048(255);
			local28 = (local19 >> 4 & 0x7) + Static367.anInt5752;
			local35 = (local19 & 0x7) + Static121.anInt2470;
			local39 = local8.method2028(-14795);
			if (local39 == 65535) {
				local39 = -1;
			}
			local43 = local8.method2048(255);
			local47 = local8.method2028(-14795);
			local105 = local8.method2048(255);
			if (local28 >= 0 && local35 >= 0 && local28 < Static497.anInt7926 && local35 < Static646.anInt9979) {
				if (local39 != -1) {
					local140 = local28 * 512 + 256;
					local146 = local35 * 512 + 256;
					local148 = Static479.anInt7523;
					if (local148 < 3 && Static574.method7435(local28, local35)) {
						local148++;
					}
					@Pc(186) Class9_Sub1_Sub1_Sub3 local186 = new Class9_Sub1_Sub1_Sub3(local39, local47, Static479.anInt7523, local148, local140, Static77.method1633(local146, local140, Static479.anInt7523) - local43, local146, local28, local28, local35, local35, local105, false);
					Static53.aClass313_6.method7107((long) (local28 << 16 | local35), new Class3_Sub7_Sub9(local186));
					return;
				}
				@Pc(211) Class3_Sub7_Sub9 local211 = (Class3_Sub7_Sub9) Static53.aClass313_6.method7104((long) (local28 << 16 | local35));
				if (local211 != null) {
					local211.aClass9_Sub1_Sub1_Sub3_1.method1293();
					local211.method9596();
				}
			}
		} else if (arg0 == Static271.aClass344_5) {
			local19 = local8.method2048(255);
			local28 = Static367.anInt5752 + (local19 >> 4 & 0x7);
			local35 = Static121.anInt2470 + (local19 & 0x7);
			local39 = local8.method2053();
			local43 = local39 >> 2;
			local47 = local39 & 0x3;
			local105 = Static236.anIntArray281[local43];
			local140 = local8.method2028(-14795);
			if (Static645.method8477(Static49.anInt1325) || local28 >= 0 && local35 >= 0 && Static497.anInt7926 > local28 && local35 < Static646.anInt9979) {
				Static341.method4872(local43, local28, local47, Static479.anInt7523, local140, local35, local105);
			}
		} else if (arg0 == Static547.aClass344_12) {
			local19 = local8.method2048(255);
			local28 = Static367.anInt5752 + (local19 >> 4 & 0x7);
			local35 = Static121.anInt2470 + (local19 & 0x7);
			local39 = local8.method2048(255);
			local43 = local39 >> 2;
			local47 = local39 & 0x3;
			local105 = Static236.anIntArray281[local43];
			local140 = local8.method2044();
			if (local140 == 65535) {
				local140 = -1;
			}
			Static83.method9523(Static479.anInt7523, local43, local47, local28, local35, local105, local140);
		} else if (Static496.aClass344_10 == arg0) {
			local19 = local8.method2028(-14795);
			local28 = local8.method2053();
			local35 = Static121.anInt2470 + (local28 & 0x7);
			local39 = local35 + Static189.anInt3243;
			local43 = Static367.anInt5752 + (local28 >> 4 & 0x7);
			local47 = local43 + Static291.anInt4448;
			@Pc(419) Class3_Sub28 local419 = (Class3_Sub28) Static113.aClass313_9.method7104((long) (local39 << 14 | Static479.anInt7523 << 28 | local47));
			if (local419 != null) {
				for (@Pc(427) Class3_Sub30 local427 = (Class3_Sub30) local419.aClass342_37.method7644(); local427 != null; local427 = (Class3_Sub30) local419.aClass342_37.method7650()) {
					if ((local19 & 0x7FFF) == local427.anInt4371) {
						local427.method9596();
						break;
					}
				}
				if (local419.aClass342_37.method7652()) {
					local419.method9596();
				}
				if (local43 >= 0 && local35 >= 0 && Static497.anInt7926 > local43 && local35 < Static646.anInt9979) {
					Static332.method4778(local35, Static479.anInt7523, local43);
				}
			}
		} else if (Static383.aClass344_8 == arg0) {
			local19 = local8.method2028(-14795);
			local28 = local8.method2053();
			local35 = Static121.anInt2470 + (local28 & 0x7);
			local39 = local35 + Static189.anInt3243;
			local43 = Static367.anInt5752 + (local28 >> 4 & 0x7);
			local47 = local43 + Static291.anInt4448;
			local105 = local8.method2060();
			local140 = local8.method2044();
			if (Static574.anInt8718 != local19) {
				@Pc(586) boolean local586 = local43 >= 0 && local35 >= 0 && Static497.anInt7926 > local43 && local35 < Static646.anInt9979;
				if (local586 || Static645.method8477(Static49.anInt1325)) {
					Static406.method9098(local47, local39, new Class3_Sub30(local105, local140), Static479.anInt7523);
					if (local586) {
						Static332.method4778(local35, Static479.anInt7523, local43);
					}
				}
			}
		} else {
			@Pc(696) int local696;
			if (arg0 == Static141.aClass344_3) {
				local19 = local8.method2048(255);
				local28 = Static367.anInt5752 + (local19 >> 4 & 0x7);
				local35 = Static121.anInt2470 + (local19 & 0x7);
				local39 = local8.method2028(-14795);
				if (local39 == 65535) {
					local39 = -1;
				}
				local43 = local8.method2048(255);
				local47 = local43 >> 4 & 0xF;
				local105 = local43 & 0x7;
				local140 = local8.method2048(255);
				local146 = local8.method2048(255);
				local148 = local8.method2028(-14795);
				if (local28 >= 0 && local35 >= 0 && local28 < Static497.anInt7926 && Static646.anInt9979 > local35) {
					local696 = local47 + 1;
					if (local28 - local696 <= Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] <= local28 + local696 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] >= local35 - local696 && local696 + local35 >= Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0]) {
						Static383.method5138(local146, (local28 << 16) + (Static479.anInt7523 << 24) + (local35 << 8) + local47, local148, local39, local105, local140);
					}
				}
			} else {
				@Pc(850) int local850;
				@Pc(854) int local854;
				@Pc(858) int local858;
				if (arg0 == Static235.aClass344_4) {
					local19 = local8.method2048(255);
					@Pc(792) boolean local792 = (local19 & 0x80) != 0;
					local35 = (local19 >> 3 & 0x7) + Static367.anInt5752;
					local39 = (local19 & 0x7) + Static121.anInt2470;
					local43 = local35 + local8.method2022();
					local47 = local39 + local8.method2022();
					local105 = local8.method2017();
					local140 = local8.method2028(-14795);
					local146 = local8.method2048(255) * 4;
					local148 = local8.method2048(255) * 4;
					local696 = local8.method2028(-14795);
					local850 = local8.method2028(-14795);
					local854 = local8.method2048(255);
					local858 = local8.method2028(-14795);
					if (local854 == 255) {
						local854 = -1;
					}
					if (local35 >= 0 && local39 >= 0 && local35 < Static497.anInt7926 && local39 < Static646.anInt9979 && local43 >= 0 && local47 >= 0 && local43 < Static497.anInt7926 && Static646.anInt9979 > local47 && local140 != 65535) {
						local858 <<= 0x2;
						local43 = local43 * 512 + 256;
						local146 <<= 0x2;
						local47 = local47 * 512 + 256;
						local39 = local39 * 512 + 256;
						local148 <<= 0x2;
						local35 = local35 * 512 + 256;
						@Pc(968) Class9_Sub1_Sub1_Sub4 local968 = new Class9_Sub1_Sub1_Sub4(local140, Static479.anInt7523, Static479.anInt7523, local35, local39, local146, Static716.anInt11157 + local696, Static716.anInt11157 + local850, local854, local858, 0, local105, local148, local792, -1);
						local968.method4629(Static77.method1633(local47, local43, Static479.anInt7523) - local148, local43, local696 + Static716.anInt11157, local47);
						Static355.aClass342_94.method7654(new Class3_Sub7_Sub14(local968));
					}
				} else {
					@Pc(1158) int local1158;
					@Pc(1189) int local1189;
					if (Static111.aClass344_2 == arg0) {
						local19 = local8.method2048(255);
						local28 = Static367.anInt5752 + (local19 >> 4 & 0x7);
						local35 = (local19 & 0x7) + Static121.anInt2470;
						local39 = local8.method2060();
						@Pc(1025) Class247 local1025 = Static216.aClass53_3.method1523(local39);
						local47 = local8.method2053();
						local105 = local47 >> 2;
						local140 = Static236.anIntArray281[local105];
						if (local105 == 11) {
							local105 = 10;
						}
						local146 = local8.method2053();
						local148 = 0;
						if (local1025.aByteArray59 != null) {
							local696 = -1;
							for (local850 = 0; local850 < local1025.aByteArray59.length; local850++) {
								if (local1025.aByteArray59[local850] == local105) {
									local696 = local850;
									break;
								}
							}
							local148 = local1025.anIntArrayArray31[local696].length;
						}
						local696 = 0;
						if (local1025.aShortArray78 != null) {
							local696 = local1025.aShortArray78.length;
						}
						local850 = 0;
						if (local1025.aShortArray76 != null) {
							local850 = local1025.aShortArray76.length;
						}
						if ((local146 & 0x1) == 1) {
							Static721.method4956(local35, (Class165) null, Static479.anInt7523, local28, local140);
						} else {
							@Pc(1120) int[] local1120 = null;
							if ((local146 & 0x2) == 2) {
								local1120 = new int[local148];
								for (local858 = 0; local858 < local148; local858++) {
									local1120[local858] = local8.method2028(-14795);
								}
							}
							@Pc(1146) short[] local1146 = null;
							if ((local146 & 0x4) == 4) {
								local1146 = new short[local696];
								for (local1158 = 0; local1158 < local696; local1158++) {
									local1146[local1158] = (short) local8.method2028(-14795);
								}
							}
							@Pc(1179) short[] local1179 = null;
							if ((local146 & 0x8) == 8) {
								local1179 = new short[local850];
								for (local1189 = 0; local1189 < local850; local1189++) {
									local1179[local1189] = (short) local8.method2028(-14795);
								}
							}
							Static721.method4956(local35, new Class165((long) Static407.aLong214++, local1120, local1146, local1179), Static479.anInt7523, local28, local140);
						}
					} else if (arg0 == Static711.aClass344_16) {
						local19 = local8.method2028(-14795);
						local28 = local8.method2048(255);
						Static216.aClass53_3.method1523(local19).method5429(local28);
					} else if (Static64.aClass344_1 == arg0) {
						local19 = local8.method2048(255);
						local28 = (local19 >> 4 & 0x7) + Static367.anInt5752;
						local35 = Static121.anInt2470 + (local19 & 0x7);
						local39 = local8.method2028(-14795);
						if (local39 == 65535) {
							local39 = -1;
						}
						local43 = local8.method2048(255);
						local47 = local43 >> 4 & 0xF;
						local105 = local43 & 0x7;
						local140 = local8.method2048(255);
						local146 = local8.method2048(255);
						local148 = local8.method2028(-14795);
						if (local28 >= 0 && local35 >= 0 && local28 < Static497.anInt7926 && Static646.anInt9979 > local35) {
							local696 = local47 + 1;
							if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] >= local28 - local696 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] <= local28 + local696 && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] >= local35 - local696 && local696 + local35 >= Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0]) {
								Static98.method1974(local105, (local35 << 8) + (local28 << 16) + (Static479.anInt7523 << 24) + local47, local140, local146, local39, local148);
							}
						}
					} else if (Static425.aClass344_9 == arg0) {
						local19 = local8.method2048(255);
						local28 = Static367.anInt5752 * 2 + (local19 >> 4 & 0xF);
						local35 = (local19 & 0xF) + Static121.anInt2470 * 2;
						local39 = local8.method2048(255);
						@Pc(1461) boolean local1461 = (local39 & 0x1) != 0;
						@Pc(1470) boolean local1470 = (local39 & 0x2) != 0;
						local105 = local1470 ? local39 >> 2 : -1;
						local140 = local8.method2022() + local28;
						local146 = local35 + local8.method2022();
						local148 = local8.method2017();
						local696 = local8.method2017();
						local850 = local8.method2028(-14795);
						local854 = local8.method2048(255);
						if (local1470) {
							local854 = (byte) local854;
						} else {
							local854 *= 4;
						}
						local858 = local8.method2048(255) * 4;
						local1158 = local8.method2028(-14795);
						local1189 = local8.method2028(-14795);
						@Pc(1542) int local1542 = local8.method2048(255);
						if (local1542 == 255) {
							local1542 = -1;
						}
						@Pc(1551) int local1551 = local8.method2028(-14795);
						if (local28 >= 0 && local35 >= 0 && Static497.anInt7926 * 2 > local28 && local35 < Static497.anInt7926 * 2 && local140 >= 0 && local146 >= 0 && Static646.anInt9979 * 2 > local140 && local146 < Static646.anInt9979 * 2 && local850 != 65535) {
							local28 *= 256;
							local35 *= 256;
							local140 *= 256;
							local1551 <<= 0x2;
							local858 <<= 0x2;
							local854 <<= 0x2;
							local146 = local146 * 256;
							if (local148 != 0 && local105 != -1) {
								@Pc(1639) Class9_Sub1_Sub1_Sub2 local1639 = null;
								@Pc(1649) int local1649;
								if (local148 < 0) {
									local1649 = -local148 - 1;
									if (local1649 == Static574.anInt8718) {
										local1639 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2;
									} else {
										local1639 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local1649];
									}
								} else {
									local1649 = local148 - 1;
									@Pc(1675) Class3_Sub52 local1675 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local1649);
									if (local1675 != null) {
										local1639 = local1675.aClass9_Sub1_Sub1_Sub2_Sub2_2;
									}
								}
								if (local1639 != null) {
									@Pc(1686) Class226 local1686 = local1639.method7489();
									if (local1686.anIntArrayArray30 != null && local1686.anIntArrayArray30[local105] != null) {
										local854 -= local1686.anIntArrayArray30[local105][1];
									}
									if (local1686.anIntArrayArray29 != null && local1686.anIntArrayArray29[local105] != null) {
										local854 -= local1686.anIntArrayArray29[local105][1];
									}
								}
							}
							@Pc(1747) Class9_Sub1_Sub1_Sub4 local1747 = new Class9_Sub1_Sub1_Sub4(local850, Static479.anInt7523, Static479.anInt7523, local28, local35, local854, Static716.anInt11157 + local1158, Static716.anInt11157 + local1189, local1542, local1551, local148, local696, local858, local1461, local105);
							local1747.method4629(Static77.method1633(local146, local140, Static479.anInt7523) - local858, local140, Static716.anInt11157 + local1158, local146);
							Static355.aClass342_94.method7654(new Class3_Sub7_Sub14(local1747));
						}
					} else if (arg0 == Static623.aClass344_13) {
						local19 = local8.method2044();
						local28 = local8.method2053();
						local35 = Static121.anInt2470 + (local28 & 0x7);
						local39 = local35 + Static189.anInt3243;
						local43 = Static367.anInt5752 + (local28 >> 4 & 0x7);
						local47 = local43 + Static291.anInt4448;
						local105 = local8.method2028(-14795);
						@Pc(1835) boolean local1835 = local43 >= 0 && local35 >= 0 && local43 < Static497.anInt7926 && Static646.anInt9979 > local35;
						if (local1835 || Static645.method8477(Static49.anInt1325)) {
							Static406.method9098(local47, local39, new Class3_Sub30(local19, local105), Static479.anInt7523);
							if (local1835) {
								Static332.method4778(local35, Static479.anInt7523, local43);
							}
						}
					} else if (Static689.aClass344_14 == arg0) {
						local19 = local8.method2048(255);
						local28 = Static121.anInt2470 + (local19 & 0x7);
						local35 = Static189.anInt3243 + local28;
						local39 = Static367.anInt5752 + (local19 >> 4 & 0x7);
						local43 = Static291.anInt4448 + local39;
						local47 = local8.method2028(-14795);
						local105 = local8.method2028(-14795);
						local140 = local8.method2028(-14795);
						if (Static113.aClass313_9 != null) {
							@Pc(1925) Class3_Sub28 local1925 = (Class3_Sub28) Static113.aClass313_9.method7104((long) (local43 | local35 << 14 | Static479.anInt7523 << 28));
							if (local1925 != null) {
								for (@Pc(1933) Class3_Sub30 local1933 = (Class3_Sub30) local1925.aClass342_37.method7644(); local1933 != null; local1933 = (Class3_Sub30) local1925.aClass342_37.method7650()) {
									if ((local47 & 0x7FFF) == local1933.anInt4371 && local105 == local1933.anInt4369) {
										local1933.method9596();
										local1933.anInt4369 = local140;
										Static406.method9098(local43, local35, local1933, Static479.anInt7523);
										break;
									}
								}
								if (local39 >= 0 && local28 >= 0 && local39 < Static497.anInt7926 && Static646.anInt9979 > local28) {
									Static332.method4778(local28, Static479.anInt7523, local39);
								}
							}
						}
					} else if (arg0 == Static353.aClass344_7) {
						local19 = local8.method2039();
						local28 = local19 >> 2;
						local35 = local19 & 0x3;
						local39 = Static236.anIntArray281[local28];
						local43 = local8.method2048(255);
						local47 = (local43 >> 4 & 0x7) + Static367.anInt5752;
						local105 = (local43 & 0x7) + Static121.anInt2470;
						if (Static645.method8477(Static49.anInt1325) || local47 >= 0 && local105 >= 0 && Static497.anInt7926 > local47 && local105 < Static646.anInt9979) {
							Static341.method4872(local28, local47, local35, Static479.anInt7523, -1, local105, local39);
						}
					} else {
						Static275.method4893("T3 - " + arg0, (Throwable) null);
						Static164.method2681(false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method7776(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static497.anInt7926 - 104) / 2;
		@Pc(17) int local17 = (Static646.anInt9979 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(31) int local31;
		@Pc(44) int local44;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(27) int local27 = local17; local27 < local17 + 104; local27++) {
				for (local31 = arg1; local31 <= 3; local31++) {
					if (Static268.method3817(local27, local31, local21, arg1)) {
						local44 = local31;
						if (Static574.method7435(local21, local27)) {
							local44 = local31 - 1;
						}
						if (local44 >= 0) {
							local19 &= Static354.method4972(local21, local44, local27);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(96) int[] local96 = new int[262144];
		for (local31 = 0; local31 < local96.length; local31++) {
			local96[local31] = -16777216;
		}
		Static462.aClass178_13 = arg0.method9367(local96, 512, 512, 512);
		Static31.method1034();
		local44 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D)) + 238 - 10) | 0xFF000000;
		@Pc(182) int local182 = ((int) (Math.random() * 20.0D) + 228 | 0x79CAFF00) << 16;
		@Pc(201) int local201 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(213) boolean[][] local213 = new boolean[Static511.anInt8105 + 2 + 1][Static511.anInt8105 + 2 + 1];
		@Pc(223) int local223;
		@Pc(229) int local229;
		@Pc(231) int local231;
		@Pc(233) int local233;
		@Pc(244) int local244;
		@Pc(256) int local256;
		@Pc(266) int local266;
		@Pc(292) int local292;
		@Pc(298) int local298;
		@Pc(368) int local368;
		@Pc(374) int local374;
		@Pc(378) int local378;
		@Pc(397) int local397;
		for (@Pc(215) int local215 = local11; local215 < local11 + 104; local215 += Static511.anInt8105) {
			for (local223 = local17; local223 < local17 + 104; local223 += Static511.anInt8105) {
				local229 = 0;
				local231 = 0;
				local233 = local215;
				if (local215 > 0) {
					local229 += 4;
					local233 = local215 - 1;
				}
				local244 = local223;
				if (local223 > 0) {
					local244 = local223 - 1;
				}
				local256 = local215 + Static511.anInt8105;
				if (local256 < 104) {
					local256++;
				}
				local266 = Static511.anInt8105 + local223;
				if (local266 < 104) {
					local231 += 4;
					local266++;
				}
				arg0.KA(0, 0, Static511.anInt8105 * 4 + local229, local231 + Static511.anInt8105 * 4);
				arg0.GA(-16777216);
				@Pc(304) int local304;
				for (local292 = arg1; local292 <= 3; local292++) {
					for (local298 = 0; local298 <= Static511.anInt8105; local298++) {
						for (local304 = 0; local304 <= Static511.anInt8105; local304++) {
							local213[local298][local304] = Static268.method3817(local244 + local304, local292, local298 + local233, arg1);
						}
					}
					Static43.aClass259Array1[local292].method9293(local233, local244, local256, local266, local213);
					if (!Static709.aBoolean752) {
						for (local304 = -4; local304 < Static511.anInt8105; local304++) {
							for (local368 = -4; local368 < Static511.anInt8105; local368++) {
								local374 = local215 + local304;
								local378 = local368 + local223;
								if (local11 <= local374 && local378 >= local17 && Static268.method3817(local378, local292, local374, arg1)) {
									local397 = local292;
									if (Static574.method7435(local374, local378)) {
										local397 = local292 - 1;
									}
									if (local397 >= 0) {
										Static174.method2802(local397, local231 + (Static511.anInt8105 - local368) * 4 - 4, local374, local378, arg0, local182, local304 * 4 + local229, local44);
									}
								}
							}
						}
					}
				}
				if (Static709.aBoolean752) {
					@Pc(460) Class109 local460 = Static455.aClass109Array1[arg1];
					for (local304 = 0; local304 < Static511.anInt8105; local304++) {
						for (local368 = 0; local368 < Static511.anInt8105; local368++) {
							local374 = local304 + local215;
							local378 = local368 + local223;
							local397 = local460.anIntArrayArray9[local374 - local460.anInt2978][local378 - local460.anInt2989];
							if ((local397 & 0x40240000) != 0) {
								arg0.method9378((Static511.anInt8105 - local368) * 4 + local231 - 4, local229 - -(local304 * 4), -1713569622, 4, 4);
							} else if ((local397 & 0x800000) != 0) {
								arg0.method9402(4, (Static511.anInt8105 - local368) * 4 + local231 - 4, -1713569622, local304 * 4 + local229);
							} else if ((local397 & 0x2000000) != 0) {
								arg0.method9330(local304 * 4 + local229 + 3, 4, -1713569622, (Static511.anInt8105 - local368) * 4 + local231 - 4);
							} else if ((local397 & 0x8000000) != 0) {
								arg0.method9402(4, (Static511.anInt8105 - local368) * 4 + local231 - 1, -1713569622, local304 * 4 + local229);
							} else if ((local397 & 0x20000000) != 0) {
								arg0.method9330(local304 * 4 + local229, 4, -1713569622, local231 + (Static511.anInt8105 - local368) * 4 - 4);
							}
						}
					}
				}
				arg0.aa(local229, local231, Static511.anInt8105 * 4, Static511.anInt8105 * 4, local201, 2);
				Static462.aClass178_13.method7624((local215 - local11) * 4 + 48, -(Static511.anInt8105 * 4) + 464 + -((-local17 + local223) * 4), Static511.anInt8105 * 4, Static511.anInt8105 * 4, local229, local231);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static402.method5423();
		Static660.anInt10119 = 0;
		Static437.aClass342_53.method7655();
		if (!Static709.aBoolean752) {
			for (local223 = local11; local223 < local11 + 104; local223++) {
				for (local229 = local17; local229 < local17 + 104; local229++) {
					for (local231 = arg1; local231 <= arg1 + 1 && local231 <= 3; local231++) {
						if (Static268.method3817(local229, local231, local223, arg1)) {
							@Pc(789) Interface9 local789 = (Interface9) Static198.method3049(local231, local223, local229);
							if (local789 == null) {
								local789 = (Interface9) Static405.method5449(local231, local223, local229, aClass28 == null ? (aClass28 = Class349.a("et")) : aClass28);
							}
							if (local789 == null) {
								local789 = (Interface9) Static518.method6967(local231, local223, local229);
							}
							if (local789 == null) {
								local789 = (Interface9) Static233.method3389(local231, local223, local229);
							}
							if (local789 != null) {
								@Pc(835) Class247 local835 = Static216.aClass53_3.method1523(local789.method9107());
								if (!local835.aBoolean420 || Static5.aBoolean3) {
									local256 = local835.anInt6241;
									if (local835.anIntArray477 != null) {
										for (local266 = 0; local266 < local835.anIntArray477.length; local266++) {
											if (local835.anIntArray477[local266] != -1) {
												@Pc(869) Class247 local869 = Static216.aClass53_3.method1523(local835.anIntArray477[local266]);
												if (local869.anInt6241 >= 0) {
													local256 = local869.anInt6241;
												}
											}
										}
									}
									if (local256 >= 0) {
										@Pc(887) boolean local887 = false;
										if (local256 >= 0) {
											@Pc(899) Class198 local899 = Static47.aClass111_3.method2739(local256);
											if (local899 != null && local899.aBoolean337) {
												local887 = true;
											}
										}
										local292 = local223;
										local298 = local229;
										if (local887) {
											@Pc(919) int[][] local919 = Static455.aClass109Array1[local231].anIntArrayArray9;
											local368 = Static455.aClass109Array1[local231].anInt2978;
											local374 = Static455.aClass109Array1[local231].anInt2989;
											for (local378 = 0; local378 < 10; local378++) {
												local397 = (int) (Math.random() * 4.0D);
												if (local397 == 0 && local11 < local292 && local292 > local223 - 3 && (local919[local292 - local368 - 1][local298 - local374] & 0x2C0108) == 0) {
													local292--;
												}
												if (local397 == 1 && local292 < local11 + 104 - 1 && local223 + 3 > local292 && (local919[local292 + 1 - local368][local298 - local374] & 0x2C0180) == 0) {
													local292++;
												}
												if (local397 == 2 && local298 > local17 && local229 - 3 < local298 && (local919[local292 - local368][local298 - local374 - 1] & 0x2C0102) == 0) {
													local298--;
												}
												if (local397 == 3 && local17 + 103 > local298 && local298 < local229 + 3 && (local919[local292 - local368][local298 + 1 - local374] & 0x2C0120) == 0) {
													local298++;
												}
											}
										}
										Static485.anIntArray563[Static660.anInt10119] = local835.anInt6249;
										Static268.anIntArray330[Static660.anInt10119] = local292;
										Static347.anIntArray397[Static660.anInt10119] = local298;
										Static660.anInt10119++;
									}
								}
							}
						}
					}
				}
			}
			if (Static242.aClass377_3 != null) {
				Static546.aClass182_105.anInt4310 = 1;
				Static47.aClass111_3.method2744(1024, 64);
				for (local229 = 0; local229 < Static242.aClass377_3.anInt10084; local229++) {
					local231 = Static242.aClass377_3.anIntArray733[local229];
					if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 == local231 >> 28) {
						local233 = (local231 >> 14 & 0x3FFF) - Static291.anInt4448;
						local244 = (local231 & 0x3FFF) - Static189.anInt3243;
						if (local233 >= 0 && Static497.anInt7926 > local233 && local244 >= 0 && Static646.anInt9979 > local244) {
							Static437.aClass342_53.method7654(new Class3_Sub44(local229));
						} else {
							@Pc(1260) Class198 local1260 = Static47.aClass111_3.method2739(Static242.aClass377_3.anIntArray732[local229]);
							if (local1260.anIntArray376 != null && local233 + local1260.anInt5152 >= 0 && Static497.anInt7926 > local1260.anInt5125 + local233 && local244 + local1260.anInt5131 >= 0 && Static646.anInt9979 > local244 + local1260.anInt5146) {
								Static437.aClass342_53.method7654(new Class3_Sub44(local229));
							}
						}
					}
				}
				Static47.aClass111_3.method2744(128, 64);
				Static546.aClass182_105.anInt4310 = 2;
				Static546.aClass182_105.method3982();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Lclient!hg;")
	public static Class157 method7777() {
		try {
			return (Class157) Class.forName("kn").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class157_Sub2();
		}
	}
}
