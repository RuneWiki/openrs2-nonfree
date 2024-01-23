import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Lclient!oe;")
	public static Class72 aClass72_249;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!jh;")
	public static Class53 aClass53_16 = new Class53(50);

	@OriginalMember(owner = "client!s", name = "W", descriptor = "I")
	public static int anInt4232 = 0;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
	public static int anInt4234 = 0;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
	public static int anInt4235 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
	public static void method3334() {
		@Pc(12) int local12;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(20) int local20;
		if (Static181.anInt4200 == 118) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2142();
			local20 = (local12 >> 4 & 0x7) + Static100.anInt2191;
			local27 = Static49.anInt896 + (local12 & 0x7);
			local31 = Static139.aClass2_Sub23_Sub1_4.method2130();
			local35 = Static139.aClass2_Sub23_Sub1_4.method2136();
			local39 = Static139.aClass2_Sub23_Sub1_4.method2130();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && Static195.anInt4463 != local31) {
				@Pc(59) Class5_Sub6 local59 = new Class5_Sub6();
				local59.anInt3992 = local39;
				local59.anInt3997 = local35;
				if (Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27] == null) {
					Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27] = new Class44();
				}
				Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27].method1355(new Class2_Sub3_Sub14(local59));
				Static209.method3070(local27, local20);
			}
			return;
		}
		@Pc(140) int local140;
		if (Static181.anInt4200 == 44) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local27 = Static49.anInt896 + (local12 & 0x7);
			local20 = Static100.anInt2191 + (local12 >> 4 & 0x7);
			local31 = Static139.aClass2_Sub23_Sub1_4.method2142();
			local39 = local31 & 0x3;
			local35 = local31 >> 2;
			local140 = Static166.anIntArray200[local35];
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				Static38.method508(local27, -1, Static137.anInt3136, local35, 0, -1, local20, local140, local39);
			}
			return;
		}
		@Pc(235) int local235;
		@Pc(206) int local206;
		if (Static181.anInt4200 == 43) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local27 = Static49.anInt896 + (local12 & 0x7);
			local20 = Static100.anInt2191 + (local12 >> 4 & 0x7);
			local31 = Static139.aClass2_Sub23_Sub1_4.method2095();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local206 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local140 = local35 & 0x7;
			local39 = local35 >> 4 & 0xF;
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				local235 = local39 + 1;
				if (Static31.aClass5_Sub2_Sub2_1.anIntArray333[0] >= local20 - local235 && local20 + local235 >= Static31.aClass5_Sub2_Sub2_1.anIntArray333[0] && Static31.aClass5_Sub2_Sub2_1.anIntArray334[0] >= local27 - local235 && Static31.aClass5_Sub2_Sub2_1.anIntArray334[0] <= local235 + local27 && Static110.anInt2433 != 0 && local140 > 0 && Static143.anInt3258 < 50 && local31 != -1) {
					Static126.anIntArray474[Static143.anInt3258] = local31;
					Static201.anIntArray726[Static143.anInt3258] = local140;
					Static116.anIntArray449[Static143.anInt3258] = local206;
					Static215.aClass66Array1[Static143.anInt3258] = null;
					Static25.anIntArray75[Static143.anInt3258] = local39 + (local20 << 16) + (local27 << 8);
					Static143.anInt3258++;
				}
			}
			return;
		}
		@Pc(391) int local391;
		@Pc(395) int local395;
		@Pc(399) int local399;
		@Pc(403) int local403;
		@Pc(477) Class5_Sub4 local477;
		if (Static181.anInt4200 == 42) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local20 = (local12 >> 4 & 0xF) + Static100.anInt2191 * 2;
			local27 = (local12 & 0xF) + Static49.anInt896 * 2;
			local31 = Static139.aClass2_Sub23_Sub1_4.method2114() + local20;
			local35 = local27 + Static139.aClass2_Sub23_Sub1_4.method2114();
			local39 = Static139.aClass2_Sub23_Sub1_4.method2104();
			local140 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local206 = Static139.aClass2_Sub23_Sub1_4.method2122() * 4;
			local235 = Static139.aClass2_Sub23_Sub1_4.method2122() * 4;
			local391 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local395 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local399 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local403 = Static139.aClass2_Sub23_Sub1_4.method2122();
			if (local20 >= 0 && local27 >= 0 && local20 < 208 && local27 < 208 && local31 >= 0 && local35 >= 0 && local31 < 208 && local35 < 208 && local140 != 65535) {
				local20 = local20 * 64;
				local27 = local27 * 64;
				local35 *= 64;
				local477 = new Class5_Sub4(local140, Static137.anInt3136, local20, local27, Static208.method3667(local20, Static137.anInt3136, local27) - local206, local391 + Static123.anInt2808, Static123.anInt2808 + local395, local399, local403, local39, local235);
				local31 = local31 * 64;
				local477.method1930(local391 + Static123.anInt2808, -local235 + Static208.method3667(local31, Static137.anInt3136, local35), local35, local31);
				Static225.aClass44_62.method1355(new Class2_Sub3_Sub2(local477));
			}
		} else if (Static181.anInt4200 == 193) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2142();
			local20 = (local12 >> 4 & 0x7) + Static100.anInt2191;
			local27 = Static49.anInt896 + (local12 & 0x7);
			local31 = Static139.aClass2_Sub23_Sub1_4.method2092();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				@Pc(557) Class44 local557 = Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27];
				if (local557 != null) {
					for (@Pc(564) Class2_Sub3_Sub14 local564 = (Class2_Sub3_Sub14) local557.method1359(); local564 != null; local564 = (Class2_Sub3_Sub14) local557.method1356()) {
						if ((local31 & 0x7FFF) == local564.aClass5_Sub6_1.anInt3992) {
							local564.method3986();
							break;
						}
					}
					if (local557.method1359() == null) {
						Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27] = null;
					}
					Static209.method3070(local27, local20);
				}
			}
		} else if (Static181.anInt4200 == 21) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
			local27 = Static49.anInt896 + (local12 & 0x7);
			local20 = (local12 >> 4 & 0x7) + Static100.anInt2191;
			local31 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local35 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local39 = Static139.aClass2_Sub23_Sub1_4.method2095();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				@Pc(666) Class44 local666 = Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local20][local27];
				if (local666 != null) {
					for (@Pc(673) Class2_Sub3_Sub14 local673 = (Class2_Sub3_Sub14) local666.method1359(); local673 != null; local673 = (Class2_Sub3_Sub14) local666.method1356()) {
						@Pc(678) Class5_Sub6 local678 = local673.aClass5_Sub6_1;
						if ((local31 & 0x7FFF) == local678.anInt3992 && local35 == local678.anInt3997) {
							local678.anInt3997 = local39;
							break;
						}
					}
					Static209.method3070(local27, local20);
				}
			}
		} else if (Static181.anInt4200 == 153) {
			local12 = Static139.aClass2_Sub23_Sub1_4.method2095();
			local20 = Static139.aClass2_Sub23_Sub1_4.method2107();
			local27 = (local20 >> 4 & 0x7) + Static100.anInt2191;
			local31 = (local20 & 0x7) + Static49.anInt896;
			local35 = Static139.aClass2_Sub23_Sub1_4.method2107();
			local39 = local35 >> 2;
			local206 = Static166.anIntArray200[local39];
			local140 = local35 & 0x3;
			if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
				Static38.method508(local31, -1, Static137.anInt3136, local39, 0, local12, local27, local206, local140);
			}
		} else {
			if (Static181.anInt4200 == 62) {
				local12 = Static139.aClass2_Sub23_Sub1_4.method2092();
				@Pc(788) byte local788 = Static139.aClass2_Sub23_Sub1_4.method2114();
				local27 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local31 = Static100.anInt2191 + (local27 >> 4 & 0x7);
				local35 = Static49.anInt896 + (local27 & 0x7);
				local39 = Static139.aClass2_Sub23_Sub1_4.method2092();
				local140 = Static139.aClass2_Sub23_Sub1_4.method2095();
				@Pc(818) byte local818 = Static139.aClass2_Sub23_Sub1_4.method2108();
				local235 = Static139.aClass2_Sub23_Sub1_4.method2092();
				local391 = Static139.aClass2_Sub23_Sub1_4.method2126();
				local399 = local391 & 0x3;
				local395 = local391 >> 2;
				local403 = Static166.anIntArray200[local395];
				@Pc(842) byte local842 = Static139.aClass2_Sub23_Sub1_4.method2114();
				@Pc(848) byte local848 = Static139.aClass2_Sub23_Sub1_4.method2114();
				@Pc(859) Class5_Sub2_Sub2 local859;
				if (local39 == Static195.anInt4463) {
					local859 = Static31.aClass5_Sub2_Sub2_1;
				} else {
					local859 = Static213.aClass5_Sub2_Sub2Array3[local39];
				}
				if (local859 != null) {
					@Pc(871) Class2_Sub3_Sub17 local871 = Static121.method3984(local12);
					@Pc(875) int[][] local875 = Static144.anIntArrayArrayArray7[Static137.anInt3136];
					@Pc(888) int local888;
					@Pc(891) int local891;
					if (local399 == 1 || local399 == 3) {
						local888 = local871.anInt2387;
						local891 = local871.anInt2394;
					} else {
						local888 = local871.anInt2394;
						local891 = local871.anInt2387;
					}
					@Pc(905) int local905 = (local891 >> 1) + local35;
					@Pc(914) int local914 = local35 + (local891 + 1 >> 1);
					@Pc(921) int local921 = local31 + (local888 >> 1);
					@Pc(929) int local929 = (local888 + 1 >> 1) + local31;
					@Pc(957) int local957 = local875[local929][local905] + local875[local921][local905] + local875[local921][local914] + local875[local929][local914] >> 2;
					@Pc(959) int[][] local959 = null;
					@Pc(968) int local968 = (local31 << 7) + (local888 << 6);
					if (Static137.anInt3136 < 3) {
						local959 = Static144.anIntArrayArrayArray7[Static137.anInt3136 + 1];
					}
					@Pc(985) int local985 = (local891 << 6) + (local35 << 7);
					@Pc(1000) Class2_Sub3_Sub20 local1000 = local871.method1874(local871.aBoolean100, false, local395, null, local957, local959, local985, local875, local968, local399);
					if (local1000 != null) {
						@Pc(1007) byte local1007;
						if (local848 < local788) {
							local1007 = local788;
							local788 = local848;
							local848 = local1007;
						}
						Static38.method508(local35, local140 + 1, Static137.anInt3136, 0, local235 + 1, -1, local31, local403, 0);
						local859.anInt1903 = local31 + local788;
						local859.anInt1896 = Static123.anInt2808 + local140;
						local859.anInt1910 = local957;
						local859.anInt1889 = local888 * 64 + local31 * 128;
						local859.anInt1891 = local848 + local31;
						local859.anInt1900 = local35 * 128 + local891 * 64;
						local859.aClass5_Sub3_1 = (Class5_Sub3) local1000.aClass5_4;
						if (local818 < local842) {
							local1007 = local842;
							local842 = local818;
							local818 = local1007;
						}
						local859.anInt1890 = Static123.anInt2808 + local235;
						local859.anInt1902 = local35 + local842;
						local859.anInt1897 = local35 + local818;
					}
				}
			}
			if (Static181.anInt4200 == 0) {
				local12 = Static139.aClass2_Sub23_Sub1_4.method2136();
				local20 = Static139.aClass2_Sub23_Sub1_4.method2142();
				local27 = Static100.anInt2191 + (local20 >> 4 & 0x7);
				local31 = Static49.anInt896 + (local20 & 0x7);
				local35 = Static139.aClass2_Sub23_Sub1_4.method2092();
				if (local27 >= 0 && local31 >= 0 && local27 < 104 && local31 < 104) {
					@Pc(1141) Class5_Sub6 local1141 = new Class5_Sub6();
					local1141.anInt3997 = local35;
					local1141.anInt3992 = local12;
					if (Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local27][local31] == null) {
						Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local27][local31] = new Class44();
					}
					Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local27][local31].method1355(new Class2_Sub3_Sub14(local1141));
					Static209.method3070(local31, local27);
				}
			} else if (Static181.anInt4200 == 154) {
				local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local20 = Static100.anInt2191 + (local12 >> 4 & 0x7);
				local27 = Static49.anInt896 + (local12 & 0x7);
				local31 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local35 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local39 = Static139.aClass2_Sub23_Sub1_4.method2095();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					local20 = local20 * 128 + 64;
					local27 = local27 * 128 + 64;
					@Pc(1263) Class5_Sub5 local1263 = new Class5_Sub5(local31, Static137.anInt3136, local20, local27, Static208.method3667(local20, Static137.anInt3136, local27) - local35, local39, Static123.anInt2808);
					Static95.aClass44_21.method1355(new Class2_Sub3_Sub5(local1263));
				}
			} else if (Static181.anInt4200 == 187) {
				local12 = Static139.aClass2_Sub23_Sub1_4.method2107();
				local20 = local12 >> 2;
				local27 = local12 & 0x3;
				local31 = Static166.anIntArray200[local20];
				local35 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local39 = Static139.aClass2_Sub23_Sub1_4.method2122();
				if (local35 == 65535) {
					local35 = -1;
				}
				local140 = Static100.anInt2191 + (local39 >> 4 & 0x7);
				local206 = Static49.anInt896 + (local39 & 0x7);
				Static168.method3780(local35, local31, local27, local206, Static137.anInt3136, local140, local20);
			} else if (Static181.anInt4200 == 160) {
				local12 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local27 = (local12 & 0x7) + Static49.anInt896;
				local20 = (local12 >> 4 & 0x7) + Static100.anInt2191;
				local31 = local20 + Static139.aClass2_Sub23_Sub1_4.method2114();
				local35 = Static139.aClass2_Sub23_Sub1_4.method2114() + local27;
				local39 = Static139.aClass2_Sub23_Sub1_4.method2104();
				local140 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local206 = Static139.aClass2_Sub23_Sub1_4.method2122() * 4;
				local235 = Static139.aClass2_Sub23_Sub1_4.method2122() * 4;
				local391 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local395 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local399 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local403 = Static139.aClass2_Sub23_Sub1_4.method2122();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local140 != 65535) {
					local27 = local27 * 128 + 64;
					local31 = local31 * 128 + 64;
					local35 = local35 * 128 + 64;
					local20 = local20 * 128 + 64;
					local477 = new Class5_Sub4(local140, Static137.anInt3136, local20, local27, Static208.method3667(local20, Static137.anInt3136, local27) - local206, Static123.anInt2808 + local391, local395 + Static123.anInt2808, local399, local403, local39, local235);
					local477.method1930(Static123.anInt2808 + local391, -local235 + Static208.method3667(local31, Static137.anInt3136, local35), local35, local31);
					Static225.aClass44_62.method1355(new Class2_Sub3_Sub2(local477));
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(I)Lclient!uf;")
	public static Class23 method3336() {
		try {
			return (Class23) Class.forName("Class23_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(I)V")
	public static void method3337() {
		for (@Pc(12) Class2_Sub3_Sub5 local12 = (Class2_Sub3_Sub5) Static95.aClass44_21.method1359(); local12 != null; local12 = (Class2_Sub3_Sub5) Static95.aClass44_21.method1356()) {
			@Pc(20) Class5_Sub5 local20 = local12.aClass5_Sub5_1;
			if (local20.anInt3308 != Static137.anInt3136 || local20.aBoolean145) {
				local12.method3986();
			} else if (local20.anInt3305 <= Static123.anInt2808) {
				local20.method2586(Static44.anInt797);
				if (local20.aBoolean145) {
					local12.method3986();
				} else {
					Static183.method3367(local20.anInt3308, local20.anInt3316, local20.anInt3314, local20.anInt3304, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}
