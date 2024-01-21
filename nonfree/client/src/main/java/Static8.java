import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
	public static int anInt186 = 255;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
	public static int anInt189 = 0;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Z")
	public static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
	public static int anInt191 = -1;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "[Lclient!n;")
	public static final Class26_Sub2_Sub2[] aClass26_Sub2_Sub2Array1 = new Class26_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
	public static boolean method214() {
		@Pc(8) long local8 = Static210.method3307();
		@Pc(14) int local14 = (int) (local8 - Static83.aLong52);
		Static83.aLong52 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static29.anInt601 += local14;
		if (Static203.anInt4149 == 0 && Static143.anInt2941 == 0 && Static45.anInt952 == 0 && Static64.anInt1359 == 0) {
			return true;
		} else if (Static167.aClass33_3 == null) {
			return false;
		} else {
			try {
				if (Static29.anInt601 > 30000) {
					throw new IOException();
				}
				@Pc(69) Class3_Sub3_Sub3 local69;
				@Pc(74) Class3_Sub4 local74;
				while (Static143.anInt2941 < 20 && Static64.anInt1359 > 0) {
					local69 = (Class3_Sub3_Sub3) Static151.aClass40_12.method1026();
					local74 = new Class3_Sub4(4);
					local74.method1239(1);
					local74.method1276((int) local69.aLong147);
					Static167.aClass33_3.method924(4, local74.aByteArray12);
					Static150.aClass40_11.method1027(local69, local69.aLong147);
					Static64.anInt1359--;
					Static143.anInt2941++;
				}
				while (Static203.anInt4149 < 20 && Static45.anInt952 > 0) {
					local69 = (Class3_Sub3_Sub3) Static11.aClass23_1.method675();
					local74 = new Class3_Sub4(4);
					local74.method1239(0);
					local74.method1276((int) local69.aLong147);
					Static167.aClass33_3.method924(4, local74.aByteArray12);
					local69.method3214();
					Static119.aClass40_6.method1027(local69, local69.aLong147);
					Static203.anInt4149++;
					Static45.anInt952--;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static167.aClass33_3.method922();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static29.anInt601 = 0;
					@Pc(186) byte local186 = 0;
					if (Static33.aClass3_Sub3_Sub3_1 == null) {
						local186 = 8;
					} else if (Static129.anInt2541 == 0) {
						local186 = 1;
					}
					@Pc(209) int local209;
					@Pc(213) int local213;
					@Pc(251) int local251;
					@Pc(330) int local330;
					if (local186 <= 0) {
						local209 = Static80.aClass3_Sub4_2.aByteArray12.length - Static33.aClass3_Sub3_Sub3_1.aByte1;
						local213 = 512 - Static129.anInt2541;
						if (local213 > local209 - Static80.aClass3_Sub4_2.anInt1758) {
							local213 = local209 - Static80.aClass3_Sub4_2.anInt1758;
						}
						if (local213 > local174) {
							local213 = local174;
						}
						Static167.aClass33_3.method917(Static80.aClass3_Sub4_2.aByteArray12, local213, Static80.aClass3_Sub4_2.anInt1758);
						if (Static56.aByte8 != 0) {
							for (local251 = 0; local251 < local213; local251++) {
								Static80.aClass3_Sub4_2.aByteArray12[Static80.aClass3_Sub4_2.anInt1758 + local251] = (byte) (Static80.aClass3_Sub4_2.aByteArray12[Static80.aClass3_Sub4_2.anInt1758 + local251] ^ Static56.aByte8);
							}
						}
						Static129.anInt2541 += local213;
						Static80.aClass3_Sub4_2.anInt1758 += local213;
						if (Static80.aClass3_Sub4_2.anInt1758 == local209) {
							if (Static33.aClass3_Sub3_Sub3_1.aLong147 == 16711935L) {
								Static193.aClass3_Sub4_7 = Static80.aClass3_Sub4_2;
								for (local251 = 0; local251 < 256; local251++) {
									@Pc(317) Class52_Sub1 local317 = Static51.aClass52_Sub1Array1[local251];
									if (local317 != null) {
										Static193.aClass3_Sub4_7.anInt1758 = local251 * 8 + 5;
										local330 = Static193.aClass3_Sub4_7.method1245();
										@Pc(334) int local334 = Static193.aClass3_Sub4_7.method1245();
										local317.method1589(local334, local330);
									}
								}
							} else {
								Static209.aCRC32_3.reset();
								Static209.aCRC32_3.update(Static80.aClass3_Sub4_2.aByteArray12, 0, local209);
								local251 = (int) Static209.aCRC32_3.getValue();
								if (Static33.aClass3_Sub3_Sub3_1.anInt185 != local251) {
									try {
										Static167.aClass33_3.method925();
									} catch (@Pc(372) Exception local372) {
									}
									Static56.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
									Static167.aClass33_3 = null;
									Static113.anInt2285++;
									return false;
								}
								Static113.anInt2285 = 0;
								Static54.anInt1163 = 0;
								Static33.aClass3_Sub3_Sub3_1.aClass52_Sub1_1.method1583(Static80.aClass3_Sub4_2.aByteArray12, (int) (Static33.aClass3_Sub3_Sub3_1.aLong147 & 0xFFFFL), Static181.aBoolean166, (Static33.aClass3_Sub3_Sub3_1.aLong147 & 0xFF0000L) == 16711680L);
							}
							Static33.aClass3_Sub3_Sub3_1.method3320();
							Static129.anInt2541 = 0;
							if (Static181.aBoolean166) {
								Static143.anInt2941--;
							} else {
								Static203.anInt4149--;
							}
							Static80.aClass3_Sub4_2 = null;
							Static33.aClass3_Sub3_Sub3_1 = null;
						} else {
							if (Static129.anInt2541 != 512) {
								break;
							}
							Static129.anInt2541 = 0;
						}
					} else {
						local209 = local186 - Static116.aClass3_Sub4_6.anInt1758;
						if (local209 > local174) {
							local209 = local174;
						}
						Static167.aClass33_3.method917(Static116.aClass3_Sub4_6.aByteArray12, local209, Static116.aClass3_Sub4_6.anInt1758);
						if (Static56.aByte8 != 0) {
							for (local213 = 0; local213 < local209; local213++) {
								Static116.aClass3_Sub4_6.aByteArray12[local213 + Static116.aClass3_Sub4_6.anInt1758] ^= Static56.aByte8;
							}
						}
						Static116.aClass3_Sub4_6.anInt1758 += local209;
						if (Static116.aClass3_Sub4_6.anInt1758 < local186) {
							break;
						}
						if (Static33.aClass3_Sub3_Sub3_1 == null) {
							Static116.aClass3_Sub4_6.anInt1758 = 0;
							local213 = Static116.aClass3_Sub4_6.method1278();
							local251 = Static116.aClass3_Sub4_6.method1270();
							@Pc(517) int local517 = Static116.aClass3_Sub4_6.method1278();
							local330 = Static116.aClass3_Sub4_6.method1245();
							@Pc(528) long local528 = (long) (local251 + (local213 << 16));
							@Pc(534) Class3_Sub3_Sub3 local534 = (Class3_Sub3_Sub3) Static150.aClass40_11.method1029(local528);
							Static181.aBoolean166 = true;
							if (local534 == null) {
								local534 = (Class3_Sub3_Sub3) Static119.aClass40_6.method1029(local528);
								Static181.aBoolean166 = false;
							}
							if (local534 == null) {
								throw new IOException();
							}
							@Pc(561) int local561 = local517 == 0 ? 5 : 9;
							Static33.aClass3_Sub3_Sub3_1 = local534;
							Static80.aClass3_Sub4_2 = new Class3_Sub4(local330 + local561 + Static33.aClass3_Sub3_Sub3_1.aByte1);
							Static80.aClass3_Sub4_2.method1239(local517);
							Static80.aClass3_Sub4_2.method1285(local330);
							Static129.anInt2541 = 8;
							Static116.aClass3_Sub4_6.anInt1758 = 0;
						} else if (Static129.anInt2541 == 0) {
							if (Static116.aClass3_Sub4_6.aByteArray12[0] == -1) {
								Static129.anInt2541 = 1;
								Static116.aClass3_Sub4_6.anInt1758 = 0;
							} else {
								Static33.aClass3_Sub3_Sub3_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(618) IOException local618) {
				try {
					Static167.aClass33_3.method925();
				} catch (@Pc(623) Exception local623) {
				}
				Static167.aClass33_3 = null;
				Static54.anInt1163++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
	public static void method216() {
		Static95.aClass85_21.method2557();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Lclient!re;")
	public static Class83 method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass83_1;
	}
}
