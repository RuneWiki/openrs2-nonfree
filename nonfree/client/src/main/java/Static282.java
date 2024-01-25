import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!ha;")
	public static final Class89 aClass89_4 = new Class89("RC", 1);

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_75 = new Class11(66, 1);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!eo;I)V")
	public static void method4305(@OriginalArg(0) Class62 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(68) int local68;
		@Pc(74) int local74;
		if (arg0 == Static357.aClass62_12) {
			local12 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local20 = (local12 >> 4 & 0x7) + Static289.anInt5010;
			local26 = Static252.anInt4465 + (local12 & 0x7);
			local30 = Static218.aClass2_Sub16_Sub2_3.method5312();
			local34 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local38 = Static218.aClass2_Sub16_Sub2_3.method5312();
			if (local20 >= 0 && local26 >= 0 && local20 < Static246.anInt4374 && Static185.anInt3485 > local26) {
				local68 = local20 * 128 + 64;
				local74 = local26 * 128 + 64;
				@Pc(96) Class1_Sub5_Sub6 local96 = new Class1_Sub5_Sub6(local30, local38, Static253.anInt4469, Static284.anInt4919, local68, Static170.method3006(local68, local74, Static284.anInt4919) - local34, local74, local20, local20, local26, local26);
				Static261.aClass30_37.method685(new Class2_Sub10_Sub10(local96));
			}
		} else if (Static177.aClass62_6 == arg0) {
			Static218.aClass2_Sub16_Sub2_3.method5350();
			local12 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local20 = (local12 >> 4 & 0x7) + Static289.anInt5010;
			local26 = (local12 & 0x7) + Static252.anInt4465;
			local30 = Static218.aClass2_Sub16_Sub2_3.method5312();
			local34 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local38 = Static218.aClass2_Sub16_Sub2_3.method5356();
			@Pc(145) String local145 = Static218.aClass2_Sub16_Sub2_3.method5364();
			Static114.method2357(Static284.anInt4919, local26, local34, local145, local38, local30, local20);
		} else if (arg0 == Static350.aClass62_8) {
			local12 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local20 = (local12 >> 4 & 0x7) + Static289.anInt5010;
			local26 = (local12 & 0x7) + Static252.anInt4465;
			local30 = Static218.aClass2_Sub16_Sub2_3.method5338();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local68 = Static181.anIntArray1303[local34];
			if (local20 >= 0 && local26 >= 0 && Static246.anInt4374 > local20 && local26 < Static185.anInt3485) {
				Static113.method2348(local20, local34, local38, -1, local26, Static284.anInt4919, local68);
			}
		} else if (arg0 == Static32.aClass62_1) {
			local12 = Static218.aClass2_Sub16_Sub2_3.method5350();
			local20 = Static289.anInt5010 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static252.anInt4465;
			local30 = Static218.aClass2_Sub16_Sub2_3.method5312();
			if (local30 == 65535) {
				local30 = -1;
			}
			local34 = Static218.aClass2_Sub16_Sub2_3.method5338();
			local38 = local34 >> 2;
			local68 = local34 & 0x3;
			local74 = Static181.anIntArray1303[local38];
			Static345.method5668(local68, local20, local26, Static284.anInt4919, local38, local74, local30);
		} else {
			@Pc(333) int local333;
			@Pc(341) int local341;
			@Pc(345) int local345;
			@Pc(349) int local349;
			@Pc(337) int local337;
			if (arg0 == Static261.aClass62_10) {
				local12 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local20 = Static289.anInt5010 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static252.anInt4465;
				local30 = Static218.aClass2_Sub16_Sub2_3.method5330() + local20;
				local34 = Static218.aClass2_Sub16_Sub2_3.method5330() + local26;
				local38 = Static218.aClass2_Sub16_Sub2_3.method5341();
				local68 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local74 = Static218.aClass2_Sub16_Sub2_3.method5350() * 4;
				local333 = Static218.aClass2_Sub16_Sub2_3.method5350() * 4;
				local337 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local341 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local345 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local349 = Static218.aClass2_Sub16_Sub2_3.method5350();
				if (local345 == 255) {
					local345 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && local20 < Static246.anInt4374 && local26 < Static185.anInt3485 && local30 >= 0 && local34 >= 0 && Static246.anInt4374 > local30 && local34 < Static185.anInt3485 && local68 != 65535) {
					local20 = local20 * 128 + 64;
					local34 = local34 * 128 + 64;
					local30 = local30 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(441) Class1_Sub5_Sub2 local441 = new Class1_Sub5_Sub2(local68, Static284.anInt4919, local20, local26, Static170.method3006(local20, local26, Static284.anInt4919) - local74, local337 + Static253.anInt4469, Static253.anInt4469 + local341, local345, local349, local38, local333);
					local441.method2442(local34, local30, Static170.method3006(local30, local34, Static284.anInt4919) - local333, local337 + Static253.anInt4469);
					Static169.aClass30_19.method685(new Class2_Sub10_Sub1(local441));
				}
			} else if (arg0 == Static339.aClass62_17) {
				local12 = Static218.aClass2_Sub16_Sub2_3.method5323();
				local20 = Static218.aClass2_Sub16_Sub2_3.method5317();
				local26 = Static218.aClass2_Sub16_Sub2_3.method5315();
				local30 = Static289.anInt5010 + (local26 >> 4 & 0x7);
				local34 = (local26 & 0x7) + Static252.anInt4465;
				if (local30 >= 0 && local34 >= 0 && local30 < Static246.anInt4374 && Static185.anInt3485 > local34) {
					Static217.method3613(Static284.anInt4919, local30, new Class2_Sub40(local12, local20), local34);
					Static76.method1207(local30, Static284.anInt4919, local34);
				}
			} else if (arg0 == Static325.aClass62_16) {
				local12 = Static218.aClass2_Sub16_Sub2_3.method5359();
				local20 = (local12 >> 4 & 0x7) + Static289.anInt5010;
				local26 = (local12 & 0x7) + Static252.anInt4465;
				local30 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local34 = Static218.aClass2_Sub16_Sub2_3.method5349();
				local38 = Static218.aClass2_Sub16_Sub2_3.method5323();
				if (local20 >= 0 && local26 >= 0 && local20 < Static246.anInt4374 && local26 < Static185.anInt3485 && local34 != Static176.anInt3381) {
					Static217.method3613(Static284.anInt4919, local20, new Class2_Sub40(local38, local30), local26);
					Static76.method1207(local20, Static284.anInt4919, local26);
				}
			} else if (Static238.aClass62_9 == arg0) {
				local20 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local26 = Static289.anInt5010 + (local20 >> 4 & 0x7);
				local30 = (local20 & 0x7) + Static252.anInt4465;
				local34 = Static218.aClass2_Sub16_Sub2_3.method5312();
				if (local34 == 65535) {
					local34 = -1;
				}
				local38 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local68 = local38 >> 4 & 0xF;
				local74 = local38 & 0x7;
				local333 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local337 = Static218.aClass2_Sub16_Sub2_3.method5350();
				if (local26 >= 0 && local30 >= 0 && local26 < Static246.anInt4374 && Static185.anInt3485 > local30) {
					local341 = local68 + 1;
					if (Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] >= local26 - local341 && local26 + local341 >= Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] && local30 - local341 <= Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] && local341 + local30 >= Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] && Static330.anInt5659 != 0 && local74 > 0 && Static3.anInt135 < 50 && local34 != -1) {
						Static286.anIntArray982[Static3.anInt135] = local34;
						Static67.anIntArray273[Static3.anInt135] = local74;
						Static62.anIntArray267[Static3.anInt135] = local333;
						Static276.aClass130Array1[Static3.anInt135] = null;
						Static284.anIntArray971[Static3.anInt135] = local68 + (Static284.anInt4919 << 24) + (local26 << 16) + (local30 << 8);
						Static56.anIntArray228[Static3.anInt135] = local337;
						Static3.anInt135++;
					}
				}
			} else if (Static281.aClass62_13 == arg0) {
				local20 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local26 = (local20 >> 4 & 0x7) + Static289.anInt5010;
				local30 = (local20 & 0x7) + Static252.anInt4465;
				local34 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local38 = Static218.aClass2_Sub16_Sub2_3.method5312();
				local68 = Static218.aClass2_Sub16_Sub2_3.method5312();
				if (Static94.aClass246_6 != null && local26 >= 0 && local30 >= 0 && local26 < Static246.anInt4374 && local30 < Static185.anInt3485) {
					@Pc(831) Class2_Sub28 local831 = (Class2_Sub28) Static94.aClass246_6.method5613((long) (Static284.anInt4919 << 28 | local30 << 14 | local26));
					if (local831 != null) {
						for (@Pc(839) Class2_Sub40 local839 = (Class2_Sub40) local831.aClass30_31.method694(); local839 != null; local839 = (Class2_Sub40) local831.aClass30_31.method682()) {
							if (local839.anInt5732 == (local34 & 0x7FFF) && local839.anInt5736 == local38) {
								local839.method5617();
								local839.anInt5736 = local68;
								Static217.method3613(Static284.anInt4919, local26, local839, local30);
								break;
							}
						}
						Static76.method1207(local26, Static284.anInt4919, local30);
					}
				}
			} else {
				@Pc(957) int local957;
				if (arg0 == Static141.aClass62_4) {
					local20 = Static218.aClass2_Sub16_Sub2_3.method5350();
					local26 = Static289.anInt5010 * 2 + (local20 >> 4 & 0xF);
					local30 = (local20 & 0xF) + Static252.anInt4465 * 2;
					local34 = Static218.aClass2_Sub16_Sub2_3.method5330() + local26;
					local38 = local30 + Static218.aClass2_Sub16_Sub2_3.method5330();
					local68 = Static218.aClass2_Sub16_Sub2_3.method5341();
					local74 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local333 = Static218.aClass2_Sub16_Sub2_3.method5350() * 4;
					local337 = Static218.aClass2_Sub16_Sub2_3.method5350() * 4;
					local341 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local345 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local349 = Static218.aClass2_Sub16_Sub2_3.method5350();
					local957 = Static218.aClass2_Sub16_Sub2_3.method5350();
					if (local349 == 255) {
						local349 = -1;
					}
					if (local26 >= 0 && local30 >= 0 && local26 < Static246.anInt4374 * 2 && local30 < Static246.anInt4374 * 2 && local34 >= 0 && local38 >= 0 && Static185.anInt3485 * 2 > local34 && local38 < Static185.anInt3485 * 2 && local74 != 65535) {
						local34 *= 64;
						local26 *= 64;
						local38 = local38 * 64;
						local30 = local30 * 64;
						@Pc(1052) Class1_Sub5_Sub2 local1052 = new Class1_Sub5_Sub2(local74, Static284.anInt4919, local26, local30, Static170.method3006(local26, local30, Static284.anInt4919) - local333, local341 + Static253.anInt4469, local345 + Static253.anInt4469, local349, local957, local68, local337);
						local1052.method2442(local38, local34, Static170.method3006(local34, local38, Static284.anInt4919) - local337, Static253.anInt4469 + local341);
						Static169.aClass30_19.method685(new Class2_Sub10_Sub1(local1052));
					}
				} else if (arg0 == Static176.aClass62_5) {
					local20 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local26 = Static218.aClass2_Sub16_Sub2_3.method5350();
					Static221.aClass118_6.method2858(local20).method3790(local26);
				} else if (arg0 == Static285.aClass62_14) {
					local20 = Static218.aClass2_Sub16_Sub2_3.method5359();
					local26 = local20 >> 2;
					local30 = local20 & 0x3;
					local34 = Static181.anIntArray1303[local26];
					local38 = Static218.aClass2_Sub16_Sub2_3.method5312();
					local68 = Static218.aClass2_Sub16_Sub2_3.method5359();
					local74 = Static289.anInt5010 + (local68 >> 4 & 0x7);
					local333 = (local68 & 0x7) + Static252.anInt4465;
					if (local74 >= 0 && local333 >= 0 && Static246.anInt4374 > local74 && Static185.anInt3485 > local333) {
						Static113.method2348(local74, local26, local30, local38, local333, Static284.anInt4919, local34);
					}
				} else {
					@Pc(1257) int local1257;
					if (arg0 == Static85.aClass62_2) {
						local20 = Static218.aClass2_Sub16_Sub2_3.method5350();
						local26 = Static289.anInt5010 * 2 + (local20 >> 4 & 0xF);
						local30 = Static252.anInt4465 * 2 + (local20 & 0xF);
						local34 = local26 + Static218.aClass2_Sub16_Sub2_3.method5330();
						local38 = Static218.aClass2_Sub16_Sub2_3.method5330() + local30;
						local68 = Static218.aClass2_Sub16_Sub2_3.method5341();
						local74 = Static218.aClass2_Sub16_Sub2_3.method5341();
						local333 = Static218.aClass2_Sub16_Sub2_3.method5312();
						local337 = Static218.aClass2_Sub16_Sub2_3.method5330();
						local341 = Static218.aClass2_Sub16_Sub2_3.method5350() * 4;
						local345 = Static218.aClass2_Sub16_Sub2_3.method5312();
						local349 = Static218.aClass2_Sub16_Sub2_3.method5312();
						local957 = Static218.aClass2_Sub16_Sub2_3.method5350();
						if (local957 == 255) {
							local957 = -1;
						}
						local1257 = Static218.aClass2_Sub16_Sub2_3.method5350();
						if (local26 >= 0 && local30 >= 0 && local26 < Static246.anInt4374 * 2 && Static246.anInt4374 * 2 > local30 && local34 >= 0 && local38 >= 0 && local34 < Static185.anInt3485 * 2 && local38 < Static185.anInt3485 * 2 && local333 != 65535) {
							local38 = local38 * 64;
							local26 *= 64;
							local34 *= 64;
							local30 *= 64;
							if (local68 != 0) {
								@Pc(1335) int local1335;
								@Pc(1339) Class1_Sub5_Sub1 local1339;
								@Pc(1325) int local1325;
								@Pc(1329) int local1329;
								if (local68 >= 0) {
									local1325 = local68 - 1;
									local1329 = local1325 & 0x7FF;
									local1335 = local1325 >> 11 & 0xF;
									local1339 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local1329];
								} else {
									local1325 = -local68 - 1;
									local1335 = local1325 >> 11 & 0xF;
									local1329 = local1325 & 0x7FF;
									if (Static176.anInt3381 == local1329) {
										local1339 = Static206.aClass1_Sub5_Sub1_Sub1_1;
									} else {
										local1339 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local1329];
									}
								}
								if (local1339 != null) {
									@Pc(1373) Class103 local1373 = local1339.method5552();
									if (local1373.anIntArrayArray24 != null && local1373.anIntArrayArray24[local1335] != null) {
										local1329 = local1373.anIntArrayArray24[local1335][0];
										@Pc(1395) int local1395 = local1373.anIntArrayArray24[local1335][2];
										@Pc(1400) int local1400 = local1339.aClass247_7.method5629();
										@Pc(1404) int local1404 = Class177.anIntArray843[local1400];
										@Pc(1408) int local1408 = Class177.anIntArray844[local1400];
										@Pc(1418) int local1418 = local1395 * local1404 + local1329 * local1408 >> 15;
										@Pc(1429) int local1429 = local1408 * local1395 - local1404 * local1329 >> 15;
										local26 += local1418;
										local30 += local1429;
										local337 -= local1373.anIntArrayArray24[local1335][1];
									}
								}
							}
							@Pc(1475) Class1_Sub5_Sub2 local1475 = new Class1_Sub5_Sub2(local333, Static284.anInt4919, local26, local30, Static170.method3006(local26, local30, Static284.anInt4919) - local337, local345 - -Static253.anInt4469, local349 + Static253.anInt4469, local957, local1257, local74, local341);
							local1475.method2442(local38, local34, Static170.method3006(local34, local38, Static284.anInt4919) - local341, local345 - -Static253.anInt4469);
							Static169.aClass30_19.method685(new Class2_Sub10_Sub1(local1475));
						}
					} else if (Static299.aClass62_15 == arg0) {
						local20 = Static218.aClass2_Sub16_Sub2_3.method5338();
						local26 = Static289.anInt5010 + (local20 >> 4 & 0x7);
						local30 = (local20 & 0x7) + Static252.anInt4465;
						local34 = Static218.aClass2_Sub16_Sub2_3.method5323();
						if (local26 >= 0 && local30 >= 0 && Static246.anInt4374 > local26 && local30 < Static185.anInt3485) {
							@Pc(1556) Class2_Sub28 local1556 = (Class2_Sub28) Static94.aClass246_6.method5613((long) (local26 | local30 << 14 | Static284.anInt4919 << 28));
							if (local1556 != null) {
								for (@Pc(1564) Class2_Sub40 local1564 = (Class2_Sub40) local1556.aClass30_31.method694(); local1564 != null; local1564 = (Class2_Sub40) local1556.aClass30_31.method682()) {
									if (local1564.anInt5732 == (local34 & 0x7FFF)) {
										local1564.method5617();
										break;
									}
								}
								if (local1556.aClass30_31.method684()) {
									local1556.method5617();
								}
								Static76.method1207(local26, Static284.anInt4919, local30);
							}
						}
					} else if (arg0 == Static114.aClass62_3) {
						local20 = Static218.aClass2_Sub16_Sub2_3.method5349();
						@Pc(1610) byte local1610 = Static218.aClass2_Sub16_Sub2_3.method5371();
						@Pc(1614) byte local1614 = Static218.aClass2_Sub16_Sub2_3.method5330();
						local34 = Static218.aClass2_Sub16_Sub2_3.method5315();
						local38 = local34 >> 2;
						local68 = local34 & 0x3;
						@Pc(1630) byte local1630 = Static218.aClass2_Sub16_Sub2_3.method5371();
						local333 = Static218.aClass2_Sub16_Sub2_3.method5312();
						@Pc(1638) byte local1638 = Static218.aClass2_Sub16_Sub2_3.method5325();
						local341 = Static218.aClass2_Sub16_Sub2_3.method5323();
						local345 = Static218.aClass2_Sub16_Sub2_3.method5350();
						local349 = (local345 >> 4 & 0x7) + Static289.anInt5010;
						local957 = Static252.anInt4465 + (local345 & 0x7);
						local1257 = Static218.aClass2_Sub16_Sub2_3.method5337();
						if (!Static111.aClass63_3.method2032()) {
							Static102.method2139(local1638, local1614, local349, local1630, local957, local20, Static284.anInt4919, local68, local341, local1257, local333, local38, local1610);
						}
					} else {
						Static142.method2676(null, "T3 - " + arg0);
						Static32.method596();
					}
				}
			}
		}
	}
}
