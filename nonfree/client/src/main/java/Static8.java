import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ak", name = "V", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_4 = new Class11(10, 7);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)Z")
	public static boolean method185(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
	public static void method186(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static218.aClass2_Sub16_Sub2_3.method5384(Static276.anInt4757) >= 15) {
				@Pc(17) int local17 = Static218.aClass2_Sub16_Sub2_3.method5380(15);
				if (local17 != 32767) {
					@Pc(24) boolean local24 = false;
					if (Static299.aClass1_Sub5_Sub1_Sub2Array1[local17] == null) {
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local17] = new Class1_Sub5_Sub1_Sub2();
						local24 = true;
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local17].anInt6413 = local17;
					}
					@Pc(45) Class1_Sub5_Sub1_Sub2 local45 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local17];
					Static143.anIntArray583[Static171.anInt3311++] = local17;
					local45.anInt6422 = Static253.anInt4469;
					if (local45.aClass133_1 != null && local45.aClass133_1.method3085()) {
						Static215.method3587(local45);
					}
					@Pc(78) int local78 = (Static218.aClass2_Sub16_Sub2_3.method5380(3) + 4 & 0x1EC00007) << 11;
					local45.method5566(Static356.aClass48_2.method951(Static218.aClass2_Sub16_Sub2_3.method5380(14)));
					@Pc(93) int local93 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
					@Pc(98) int local98 = Static218.aClass2_Sub16_Sub2_3.method5380(2);
					@Pc(105) int local105;
					if (arg0) {
						local105 = Static218.aClass2_Sub16_Sub2_3.method5380(8);
						if (local105 > 127) {
							local105 -= 256;
						}
					} else {
						local105 = Static218.aClass2_Sub16_Sub2_3.method5380(5);
						if (local105 > 15) {
							local105 -= 32;
						}
					}
					@Pc(129) int local129;
					if (arg0) {
						local129 = Static218.aClass2_Sub16_Sub2_3.method5380(8);
						if (local129 > 127) {
							local129 -= 256;
						}
					} else {
						local129 = Static218.aClass2_Sub16_Sub2_3.method5380(5);
						if (local129 > 15) {
							local129 -= 32;
						}
					}
					@Pc(153) int local153 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
					if (local153 == 1) {
						Static4.anIntArray45[Static158.anInt3041++] = local17;
					}
					local45.method5544(local45.aClass133_1.anInt3332);
					local45.anInt6435 = local45.aClass133_1.anInt3347 << 3;
					if (local45.anInt6435 == 0) {
						local45.method5542(0);
					} else if (local24) {
						local45.method5542(local78);
					}
					local45.method5559(local45.method5547(), Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] + local129, Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] - -local105, local98, local93 == 1);
					if (local45.aClass133_1.method3085()) {
						Static185.method3197(local45, local45.anIntArray1324[0], 0, local45.anIntArray1323[0], local45.aByte69, null, null);
					}
					continue;
				}
			}
			Static218.aClass2_Sub16_Sub2_3.method5383();
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!vc;I)V")
	public static void method187(@OriginalArg(0) Class63 arg0) {
		@Pc(7) int local7 = Static236.anInt2045;
		@Pc(9) int local9 = Static255.anInt4503;
		@Pc(11) int local11 = Static108.anInt5290;
		@Pc(15) int local15 = Static320.anInt5473 - 3;
		if (Static250.aClass18_18 == null || Static96.aClass18_7 == null) {
			if (Static263.aClass171_64.method3739(Static6.anInt208) && Static263.aClass171_64.method3739(Static88.anInt1684)) {
				Static250.aClass18_18 = arg0.method2000(Static397.method2330(Static263.aClass171_64, Static6.anInt208, 0));
				@Pc(61) Class86 local61 = Static397.method2330(Static263.aClass171_64, Static88.anInt1684, 0);
				Static96.aClass18_7 = arg0.method2000(local61);
				local61.method2341();
				Static46.aClass18_4 = arg0.method2000(local61);
			} else {
				arg0.method1982(local7, local9, local11, 20, Static381.anInt6500 | 255 - Static144.anInt2872 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static250.aClass18_18 != null && Static96.aClass18_7 != null) {
			local88 = (local11 - Static96.aClass18_7.method4563() * 2) / Static250.aClass18_18.method4563();
			for (local90 = 0; local90 < local88; local90++) {
				Static250.aClass18_18.method4558(local7 + Static96.aClass18_7.method4563() + Static250.aClass18_18.method4563() * local90, local9);
			}
			Static96.aClass18_7.method4558(local7, local9);
			Static46.aClass18_4.method4558(local7 + local11 - Static46.aClass18_4.method4563(), local9);
		}
		Static340.aClass9_4.method5052(Static115.anInt2458 | 0xFF000000, local9 + 14, Static190.aClass32_48.method701(Static107.anInt2498), -1, local7 + 3);
		arg0.method1982(local7, local9 + 20, local11, local15 - 20, Static381.anInt6500 | -Static144.anInt2872 + 255 << 24, 1);
		local88 = Static311.aClass129_1.method2997();
		local90 = Static311.aClass129_1.method2989();
		@Pc(175) int local175 = 0;
		@Pc(197) int local197;
		for (@Pc(180) Class2_Sub26 local180 = (Class2_Sub26) Static195.aClass30_28.method694(); local180 != null; local180 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			local197 = (Static285.anInt4946 - local175 - 1) * 16 + local9 + 20 + 13;
			if (local88 > local7 && local11 + local7 > local88 && local197 - 13 < local90 && local90 < local197 + 4 && local180.aBoolean272) {
				arg0.method1982(local7, local197 - 12, local11, 16, Static28.anInt605 | 255 - Static131.anInt2702 << 24, 1);
			}
			local175++;
		}
		if ((Static379.aClass18_28 == null || Static343.aClass18_25 == null || Static45.aClass18_3 == null) && Static263.aClass171_64.method3739(Static92.anInt1739) && Static263.aClass171_64.method3739(Static177.anInt3401) && Static263.aClass171_64.method3739(Static325.anInt5591)) {
			@Pc(273) Class86 local273 = Static397.method2330(Static263.aClass171_64, Static177.anInt3401, 0);
			Static343.aClass18_25 = arg0.method2000(local273);
			local273.method2341();
			Static392.aClass18_29 = arg0.method2000(local273);
			Static379.aClass18_28 = arg0.method2000(Static397.method2330(Static263.aClass171_64, Static92.anInt1739, 0));
			@Pc(298) Class86 local298 = Static397.method2330(Static263.aClass171_64, Static325.anInt5591, 0);
			Static45.aClass18_3 = arg0.method2000(local298);
			local298.method2341();
			Static238.aClass18_17 = arg0.method2000(local298);
		}
		@Pc(368) int local368;
		@Pc(329) int local329;
		if (Static379.aClass18_28 != null && Static343.aClass18_25 != null && Static45.aClass18_3 != null) {
			local197 = (local11 - Static45.aClass18_3.method4563() * 2) / Static379.aClass18_28.method4563();
			for (local329 = 0; local329 < local197; local329++) {
				Static379.aClass18_28.method4558(Static45.aClass18_3.method4563() + local7 + local329 * Static379.aClass18_28.method4563(), local15 + local9 + -Static379.aClass18_28.method4571());
			}
			local368 = (local15 - Static45.aClass18_3.method4571() - 20) / Static343.aClass18_25.method4571();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static343.aClass18_25.method4558(local7, local9 + Static343.aClass18_25.method4571() * local370 + 20);
				Static392.aClass18_29.method4558(local7 + local11 - Static392.aClass18_29.method4563(), local9 - -20 + local370 * Static343.aClass18_25.method4571());
			}
			Static45.aClass18_3.method4558(local7, local15 + local9 - Static45.aClass18_3.method4571());
			Static238.aClass18_17.method4558(local11 + local7 - Static45.aClass18_3.method4563(), local15 + (local9 - Static45.aClass18_3.method4571()));
		}
		local175 = 0;
		for (@Pc(442) Class2_Sub26 local442 = (Class2_Sub26) Static195.aClass30_28.method694(); local442 != null; local442 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			local329 = (Static285.anInt4946 - local175 - 1) * 16 + local9 + 13 + 20;
			local368 = Static115.anInt2458 | 0xFF000000;
			if (local7 < local88 && local11 + local7 > local88 && local90 > local329 - 13 && local329 + 4 > local90 && local442.aBoolean272) {
				local368 = Static94.anInt1921 | 0xFF000000;
			}
			@Pc(489) int[] local489 = null;
			if (Static37.method674(local442.anInt3594)) {
				local489 = Static15.aClass81_1.method2175((int) local442.aLong127).anIntArray853;
			} else if (local442.anInt3593 != -1) {
				local489 = Static15.aClass81_1.method2175(local442.anInt3593).anIntArray853;
			} else if (Static17.method319(local442.anInt3594)) {
				@Pc(555) Class1_Sub5_Sub1_Sub2 local555 = Static299.aClass1_Sub5_Sub1_Sub2Array1[(int) local442.aLong127];
				if (local555 != null) {
					@Pc(560) Class133 local560 = local555.aClass133_1;
					if (local560.anIntArray653 != null) {
						local560 = local560.method3094(Static321.aClass211_1);
					}
					if (local560 != null) {
						local489 = local560.anIntArray651;
					}
				}
			} else if (Static249.method5593(local442.anInt3594)) {
				@Pc(527) Class172 local527;
				if (local442.anInt3594 == 1001) {
					local527 = Static221.aClass118_6.method2858((int) local442.aLong127);
				} else {
					local527 = Static221.aClass118_6.method2858((int) (local442.aLong127 >>> 32 & 0x7FFFFFFFL));
				}
				if (local527.anIntArray801 != null) {
					local527 = local527.method3775(Static321.aClass211_1);
				}
				if (local527 != null) {
					local489 = local527.anIntArray802;
				}
			}
			@Pc(594) String local594 = Static308.method4502(local442);
			if (local489 != null) {
				local594 = local594 + Static245.method3916(local489);
			}
			Static340.aClass9_4.method5060(local594, local329, Static44.anIntArray183, Static382.aClass18Array14, local7 + 3, local368);
			if (local442.aBoolean273) {
				Static120.aClass18_12.method4558(Static238.aClass136_7.method3125(local594) + local7 + 5, local329 + -12);
			}
			local175++;
		}
		Static230.method3733(Static108.anInt5290, Static255.anInt4503, Static320.anInt5473, Static236.anInt2045);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIB)V")
	public static void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static243.anInt4326 <= arg0 - arg1 && Static235.anInt4193 >= arg1 + arg0 && arg2 - arg1 >= Static138.anInt932 && Static40.anInt818 >= arg2 + arg1) {
			Static289.method4381(arg0, arg2, arg1, arg3);
		} else {
			Static242.method4239(arg1, arg3, arg0, arg2);
		}
	}
}
