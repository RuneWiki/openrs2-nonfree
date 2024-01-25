import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
	public static int anInt4710;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "Lclient!pa;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method3744(@OriginalArg(1) Class295 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (Static303.aClass295_4 == arg0) {
			local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
			local20 = Static89.anInt1657 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static202.anInt3819;
			local30 = Static158.aClass1_Sub3_Sub1_2.method7945();
			local34 = Static158.aClass1_Sub3_Sub1_2.method7974();
			local38 = Static158.aClass1_Sub3_Sub1_2.method7945();
			local42 = Static158.aClass1_Sub3_Sub1_2.method7974();
			if (local20 >= 0 && local26 >= 0 && Static458.anInt9736 > local20 && Static378.anInt6747 > local26) {
				local69 = local20 * 512 + 256;
				local75 = local26 * 512 + 256;
				local77 = Static89.anInt1658;
				if (local77 < 3 && Static34.method641(local20, local26)) {
					local77++;
				}
				@Pc(112) Class11_Sub1_Sub1_Sub1 local112 = new Class11_Sub1_Sub1_Sub1(local30, local38, Static518.anInt9331, Static89.anInt1658, local77, local69, Static538.method6114(Static89.anInt1658, local75, local69) - local34, local75, local20, local20, local26, local26, local42);
				Static297.aClass111_25.method2552(new Class1_Sub8_Sub5(local112));
			}
		} else if (Static341.aClass295_6 == arg0) {
			local12 = Static158.aClass1_Sub3_Sub1_2.method7943();
			local20 = (local12 >> 4 & 0x7) + Static89.anInt1657;
			local26 = (local12 & 0x7) + Static202.anInt3819;
			local30 = Static158.aClass1_Sub3_Sub1_2.method7938();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local42 = Static17.anIntArray20[local34];
			local69 = Static158.aClass1_Sub3_Sub1_2.method7967();
			if (local69 == 65535) {
				local69 = -1;
			}
			Static432.method6173(local26, local34, local42, local38, Static89.anInt1658, local69, local20);
		} else {
			@Pc(249) int local249;
			@Pc(334) int local334;
			@Pc(261) int local261;
			@Pc(265) int local265;
			if (arg0 == Static431.aClass295_11) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local20 = (local12 >> 4 & 0xF) + Static89.anInt1657 * 2;
				local26 = (local12 & 0xF) + Static202.anInt3819 * 2;
				local30 = Static158.aClass1_Sub3_Sub1_2.method7974();
				@Pc(217) boolean local217 = (local30 & 0x1) != 0;
				local38 = local30 >> 1;
				local42 = local20 + Static158.aClass1_Sub3_Sub1_2.method7963();
				local69 = local26 + Static158.aClass1_Sub3_Sub1_2.method7963();
				local75 = Static158.aClass1_Sub3_Sub1_2.method7975();
				local77 = Static158.aClass1_Sub3_Sub1_2.method7975();
				local249 = Static158.aClass1_Sub3_Sub1_2.method7945();
				@Pc(255) byte local255 = Static158.aClass1_Sub3_Sub1_2.method7963();
				local261 = Static158.aClass1_Sub3_Sub1_2.method7974() * 4;
				local265 = Static158.aClass1_Sub3_Sub1_2.method7945();
				@Pc(271) int local271 = Static158.aClass1_Sub3_Sub1_2.method7945();
				@Pc(275) int local275 = Static158.aClass1_Sub3_Sub1_2.method7974();
				@Pc(279) int local279 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (local275 == 255) {
					local275 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && local20 < Static458.anInt9736 * 2 && Static458.anInt9736 * 2 > local26 && local42 >= 0 && local69 >= 0 && Static378.anInt6747 * 2 > local42 && local69 < Static378.anInt6747 * 2 && local249 != 65535) {
					local334 = local255 << 2;
					local261 <<= 0x2;
					local26 *= 256;
					local69 *= 256;
					local279 <<= 0x2;
					local42 *= 256;
					local20 *= 256;
					if (local75 != 0) {
						@Pc(362) Class11_Sub1_Sub1_Sub3 local362 = null;
						@Pc(372) int local372;
						if (local75 < 0) {
							local372 = -local75 - 1;
							if (local372 == Static310.anInt5693) {
								local362 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2;
							} else {
								local362 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local372];
							}
						} else {
							local372 = local75 - 1;
							@Pc(398) Class1_Sub33 local398 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local372);
							if (local398 != null) {
								local362 = local398.aClass11_Sub1_Sub1_Sub3_Sub2_2;
							}
						}
						if (local362 != null) {
							@Pc(409) Class114 local409 = local362.method6073();
							if (local409.anIntArrayArray10 != null && local409.anIntArrayArray10[local38] != null) {
								@Pc(424) int local424 = local409.anIntArrayArray10[local38][0];
								@Pc(431) int local431 = local409.anIntArrayArray10[local38][2];
								@Pc(436) int local436 = local362.aClass106_7.method2484();
								@Pc(440) int local440 = Class85_Sub8.anIntArray426[local436];
								@Pc(444) int local444 = Class85_Sub8.anIntArray427[local436];
								@Pc(454) int local454 = local444 * local424 + local440 * local431 >> 14;
								@Pc(465) int local465 = local431 * local444 - local424 * local440 >> 14;
								local26 += local465;
								local20 += local454;
								local334 -= local409.anIntArrayArray10[local38][1];
							}
						}
					}
					@Pc(507) Class11_Sub1_Sub1_Sub4 local507 = new Class11_Sub1_Sub1_Sub4(local249, Static89.anInt1658, Static89.anInt1658, local20, local26, local334, local265 + Static518.anInt9331, local271 - -Static518.anInt9331, local275, local279, local77, local261, local217);
					local507.method3586(Static538.method6114(Static89.anInt1658, local69, local42) - local261, local265 + Static518.anInt9331, local42, local69);
					Static241.aClass111_21.method2552(new Class1_Sub8_Sub8(local507));
				}
			} else if (arg0 == Static419.aClass295_9) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7945();
				local20 = Static158.aClass1_Sub3_Sub1_2.method7974();
				Static347.aClass122_4.method2770(local12).method3705(local20);
			} else if (Static509.aClass295_13 == arg0) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7945();
				local20 = Static158.aClass1_Sub3_Sub1_2.method7946();
				local26 = Static158.aClass1_Sub3_Sub1_2.method7938();
				local30 = (local26 & 0x7) + Static202.anInt3819;
				local34 = local30 + Static311.anInt5708;
				local38 = (local26 >> 4 & 0x7) + Static89.anInt1657;
				local42 = Static539.anInt9045 + local38;
				local69 = Static158.aClass1_Sub3_Sub1_2.method7916();
				if (local20 != Static310.anInt5693) {
					@Pc(625) boolean local625 = local38 >= 0 && local30 >= 0 && local38 < Static458.anInt9736 && local30 < Static378.anInt6747;
					if (local625 || Static85.method1364(Static339.anInt6245)) {
						Static583.method7813(local34, new Class1_Sub37(local69, local12), local42, Static89.anInt1658);
						if (local625) {
							Static198.method3089(local30, Static89.anInt1658, local38);
						}
					}
				}
			} else if (Static420.aClass295_10 == arg0) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7946();
				local20 = Static158.aClass1_Sub3_Sub1_2.method7967();
				local26 = Static158.aClass1_Sub3_Sub1_2.method7938();
				local30 = (local26 & 0x7) + Static202.anInt3819;
				local34 = local30 + Static311.anInt5708;
				local38 = Static89.anInt1657 + (local26 >> 4 & 0x7);
				local42 = Static539.anInt9045 + local38;
				@Pc(713) boolean local713 = local38 >= 0 && local30 >= 0 && local38 < Static458.anInt9736 && local30 < Static378.anInt6747;
				if (local713 || Static85.method1364(Static339.anInt6245)) {
					Static583.method7813(local34, new Class1_Sub37(local12, local20), local42, Static89.anInt1658);
					if (local713) {
						Static198.method3089(local30, Static89.anInt1658, local38);
					}
				}
			} else if (Static55.aClass295_1 == arg0) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local20 = Static89.anInt1657 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static202.anInt3819;
				local30 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local69 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local75 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local77 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (local20 >= 0 && local26 >= 0 && Static458.anInt9736 > local20 && local26 < Static378.anInt6747) {
					local249 = local38 + 1;
					if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] >= local20 - local249 && local249 + local20 >= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] && local26 - local249 <= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] && local249 + local26 >= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0]) {
						Static429.method6134(local69, local42, local75, local77, local30, (local20 << 16) + (Static89.anInt1658 << 24) + (local26 << 8) + local38);
					}
				}
			} else if (Static501.aClass295_12 == arg0) {
				local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local20 = (local12 >> 4 & 0x7) + Static89.anInt1657;
				local26 = (local12 & 0x7) + Static202.anInt3819;
				local30 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local69 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local75 = Static158.aClass1_Sub3_Sub1_2.method7974();
				local77 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (local20 >= 0 && local26 >= 0 && Static458.anInt9736 > local20 && Static378.anInt6747 > local26) {
					local249 = local38 + 1;
					if (local20 - local249 <= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] && local20 + local249 >= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] && local26 - local249 <= Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0] <= local249 + local26) {
						Static68.method1135(local77, local75, local38 + (Static89.anInt1658 << 24) - (-(local20 << 16) - (local26 << 8)), local30, local69, local42);
					}
				}
			} else {
				@Pc(1216) Class11_Sub1_Sub1_Sub4 local1216;
				if (Static149.aClass295_3 == arg0) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local20 = (local12 >> 4 & 0xF) + Static89.anInt1657 * 2;
					local26 = Static202.anInt3819 * 2 + (local12 & 0xF);
					@Pc(1060) boolean local1060 = Static158.aClass1_Sub3_Sub1_2.method7974() != 0;
					local34 = Static158.aClass1_Sub3_Sub1_2.method7963() + local20;
					local38 = Static158.aClass1_Sub3_Sub1_2.method7963() + local26;
					local42 = Static158.aClass1_Sub3_Sub1_2.method7975();
					local69 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local75 = Static158.aClass1_Sub3_Sub1_2.method7974() * 4;
					local77 = Static158.aClass1_Sub3_Sub1_2.method7974() * 4;
					local249 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local334 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local261 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local265 = Static158.aClass1_Sub3_Sub1_2.method7945();
					if (local261 == 255) {
						local261 = -1;
					}
					if (local20 >= 0 && local26 >= 0 && Static458.anInt9736 * 2 > local20 && Static458.anInt9736 * 2 > local26 && local34 >= 0 && local38 >= 0 && local34 < Static378.anInt6747 * 2 && local38 < Static378.anInt6747 * 2 && local69 != 65535) {
						local265 <<= 0x2;
						local77 <<= 0x2;
						local26 *= 256;
						local34 *= 256;
						local38 *= 256;
						local20 = local20 * 256;
						local75 <<= 0x2;
						local1216 = new Class11_Sub1_Sub1_Sub4(local69, Static89.anInt1658, Static89.anInt1658, local20, local26, local75, Static518.anInt9331 + local249, local334 - -Static518.anInt9331, local261, local265, local42, local77, local1060);
						local1216.method3586(Static538.method6114(Static89.anInt1658, local38, local34) - local77, local249 + Static518.anInt9331, local34, local38);
						Static241.aClass111_21.method2552(new Class1_Sub8_Sub8(local1216));
					}
				} else if (Static355.aClass295_7 == arg0) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
					@Pc(1258) boolean local1258 = (local12 & 0x80) != 0;
					local26 = (local12 >> 3 & 0x7) + Static89.anInt1657;
					local30 = (local12 & 0x7) + Static202.anInt3819;
					local34 = Static158.aClass1_Sub3_Sub1_2.method7963() + local26;
					local38 = local30 + Static158.aClass1_Sub3_Sub1_2.method7963();
					local42 = Static158.aClass1_Sub3_Sub1_2.method7975();
					local69 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local75 = Static158.aClass1_Sub3_Sub1_2.method7974() * 4;
					local77 = Static158.aClass1_Sub3_Sub1_2.method7974() * 4;
					local249 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local334 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local261 = Static158.aClass1_Sub3_Sub1_2.method7974();
					if (local261 == 255) {
						local261 = -1;
					}
					local265 = Static158.aClass1_Sub3_Sub1_2.method7945();
					if (local26 >= 0 && local30 >= 0 && Static458.anInt9736 > local26 && Static378.anInt6747 > local30 && local34 >= 0 && local38 >= 0 && local34 < Static458.anInt9736 && Static378.anInt6747 > local38 && local69 != 65535) {
						local265 <<= 0x2;
						local26 = local26 * 512 + 256;
						local38 = local38 * 512 + 256;
						local34 = local34 * 512 + 256;
						local75 <<= 0x2;
						local77 <<= 0x2;
						local30 = local30 * 512 + 256;
						local1216 = new Class11_Sub1_Sub1_Sub4(local69, Static89.anInt1658, Static89.anInt1658, local26, local30, local75, local249 + Static518.anInt9331, local334 - -Static518.anInt9331, local261, local265, local42, local77, local1258);
						local1216.method3586(Static538.method6114(Static89.anInt1658, local38, local34) - local77, local249 - -Static518.anInt9331, local34, local38);
						Static241.aClass111_21.method2552(new Class1_Sub8_Sub8(local1216));
					}
				} else if (arg0 == Static122.aClass295_2) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7916();
					local20 = Static158.aClass1_Sub3_Sub1_2.method7943();
					local26 = (local20 & 0x7) + Static202.anInt3819;
					local30 = local26 + Static311.anInt5708;
					local34 = (local20 >> 4 & 0x7) + Static89.anInt1657;
					local38 = local34 + Static539.anInt9045;
					@Pc(1496) Class1_Sub20 local1496 = (Class1_Sub20) Static365.aClass91_29.method2271((long) (local30 << 14 | Static89.anInt1658 << 28 | local38));
					if (local1496 != null) {
						for (@Pc(1506) Class1_Sub37 local1506 = (Class1_Sub37) local1496.aClass111_10.method2547(); local1506 != null; local1506 = (Class1_Sub37) local1496.aClass111_10.method2554()) {
							if ((local12 & 0x7FFF) == local1506.anInt6970) {
								local1506.method7908();
								break;
							}
						}
						if (local1496.aClass111_10.method2546()) {
							local1496.method7908();
						}
						if (local34 >= 0 && local26 >= 0 && Static458.anInt9736 > local34 && local26 < Static378.anInt6747) {
							Static198.method3089(local26, Static89.anInt1658, local34);
						}
					}
				} else if (arg0 == Static593.aClass295_15) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local20 = Static202.anInt3819 + (local12 & 0x7);
					local26 = local20 + Static311.anInt5708;
					local30 = (local12 >> 4 & 0x7) + Static89.anInt1657;
					local34 = local30 + Static539.anInt9045;
					local38 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local42 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local69 = Static158.aClass1_Sub3_Sub1_2.method7945();
					if (Static365.aClass91_29 != null) {
						@Pc(1614) Class1_Sub20 local1614 = (Class1_Sub20) Static365.aClass91_29.method2271((long) (local26 << 14 | Static89.anInt1658 << 28 | local34));
						if (local1614 != null) {
							for (@Pc(1622) Class1_Sub37 local1622 = (Class1_Sub37) local1614.aClass111_10.method2547(); local1622 != null; local1622 = (Class1_Sub37) local1614.aClass111_10.method2554()) {
								if ((local38 & 0x7FFF) == local1622.anInt6970 && local1622.anInt6969 == local42) {
									local1622.method7908();
									local1622.anInt6969 = local69;
									Static583.method7813(local26, local1622, local34, Static89.anInt1658);
									break;
								}
							}
							if (local30 >= 0 && local20 >= 0 && local30 < Static458.anInt9736 && Static378.anInt6747 > local20) {
								Static198.method3089(local20, Static89.anInt1658, local30);
							}
						}
					}
				} else if (arg0 == Static560.aClass295_14) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local20 = local12 >> 2;
					local26 = local12 & 0x3;
					local30 = Static17.anIntArray20[local20];
					local34 = Static158.aClass1_Sub3_Sub1_2.method7946();
					local38 = Static158.aClass1_Sub3_Sub1_2.method7931();
					local42 = (local38 >> 4 & 0x7) + Static89.anInt1657;
					local69 = (local38 & 0x7) + Static202.anInt3819;
					if (Static85.method1364(Static339.anInt6245) || local42 >= 0 && local69 >= 0 && Static458.anInt9736 > local42 && local69 < Static378.anInt6747) {
						Static207.method3174(local42, local30, local20, local69, local26, local34, Static89.anInt1658);
					}
				} else if (Static304.aClass295_5 == arg0) {
					Static158.aClass1_Sub3_Sub1_2.method7974();
					local12 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local20 = (local12 >> 4 & 0x7) + Static89.anInt1657;
					local26 = Static202.anInt3819 + (local12 & 0x7);
					local30 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local34 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local38 = Static158.aClass1_Sub3_Sub1_2.method7919();
					@Pc(1797) String local1797 = Static158.aClass1_Sub3_Sub1_2.method7951();
					Static112.method1546(local34, local38, local1797, local26, local30, local20, Static89.anInt1658);
				} else if (Static383.aClass295_8 == arg0) {
					local12 = Static158.aClass1_Sub3_Sub1_2.method7943();
					local20 = local12 >> 2;
					local26 = local12 & 0x3;
					local30 = Static17.anIntArray20[local20];
					local34 = Static158.aClass1_Sub3_Sub1_2.method7943();
					local38 = Static89.anInt1657 + (local34 >> 4 & 0x7);
					local42 = (local34 & 0x7) + Static202.anInt3819;
					if (Static85.method1364(Static339.anInt6245) || local38 >= 0 && local42 >= 0 && Static458.anInt9736 > local38 && Static378.anInt6747 > local42) {
						Static207.method3174(local38, local30, local20, local42, local26, -1, Static89.anInt1658);
					}
				} else {
					Static419.method5957("T3 - " + arg0, null);
					Static136.method2372(false);
				}
			}
		}
	}
}
