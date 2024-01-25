import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "J")
	public static long aLong166 = -1L;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_143 = new Class200(117, 6);

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!cha;B)V")
	public static void method5553(@OriginalArg(0) Class55 arg0) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		if (arg0 == Static77.aClass55_3) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = Static458.anInt4947 + (local12 & 0x7);
			local23 = local18 + Static338.anInt5885;
			local31 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local35 = Static406.anInt6899 + local31;
			local39 = Static327.aClass2_Sub17_Sub1_1.method2876();
			@Pc(54) Class2_Sub23 local54 = (Class2_Sub23) Static263.aClass323_18.method7484((long) (local35 | local23 << 14 | Static648.anInt10472 << 28));
			if (local54 != null) {
				for (@Pc(62) Class2_Sub50 local62 = (Class2_Sub50) local54.aClass114_22.method2772(); local62 != null; local62 = (Class2_Sub50) local54.aClass114_22.method2762()) {
					if ((local39 & 0x7FFF) == local62.anInt10421) {
						local62.method8920();
						break;
					}
				}
				if (local54.aClass114_22.method2767()) {
					local54.method8920();
				}
				if (local31 >= 0 && local18 >= 0 && local31 < Static456.anInt7428 && Static5.anInt112 > local18) {
					Static72.method1634(local18, Static648.anInt10472, local31);
				}
			}
			return;
		}
		@Pc(159) int local159;
		@Pc(163) int local163;
		@Pc(167) int local167;
		@Pc(171) int local171;
		@Pc(189) int local189;
		if (Static150.aClass55_4 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local23 = (local12 & 0x7) + Static458.anInt4947;
			local31 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local39 = local35 >> 4 & 0xF;
			local159 = local35 & 0x7;
			local163 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local167 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local171 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local18 >= 0 && local23 >= 0 && local18 < Static456.anInt7428 && Static5.anInt112 > local23) {
				local189 = local39 + 1;
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] >= local18 - local189 && local189 + local18 >= Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] >= local23 - local189 && local189 + local23 >= Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0]) {
					Static214.method3550(local31, local171, local167, local159, local39 + (Static648.anInt10472 << 24) + (local18 << 16) + (local23 << 8), local163);
				}
			}
			return;
		}
		@Pc(327) int local327;
		@Pc(331) int local331;
		@Pc(340) int local340;
		if (arg0 == Static197.aClass55_7) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			@Pc(265) boolean local265 = (local12 & 0x80) != 0;
			local23 = (local12 >> 3 & 0x7) + Static412.anInt6934;
			local31 = Static458.anInt4947 + (local12 & 0x7);
			local35 = Static327.aClass2_Sub17_Sub1_1.method2860() + local23;
			local39 = local31 + Static327.aClass2_Sub17_Sub1_1.method2860();
			local159 = Static327.aClass2_Sub17_Sub1_1.method2836();
			local163 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local167 = Static327.aClass2_Sub17_Sub1_1.method2859() * 4;
			local171 = Static327.aClass2_Sub17_Sub1_1.method2859() * 4;
			local189 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local327 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local331 = Static327.aClass2_Sub17_Sub1_1.method2859();
			if (local331 == 255) {
				local331 = -1;
			}
			local340 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local23 >= 0 && local31 >= 0 && Static456.anInt7428 > local23 && Static5.anInt112 > local31 && local35 >= 0 && local39 >= 0 && Static456.anInt7428 > local35 && Static5.anInt112 > local39 && local163 != 65535) {
				local167 <<= 0x2;
				local171 <<= 0x2;
				local23 = local23 * 512 + 256;
				local31 = local31 * 512 + 256;
				local35 = local35 * 512 + 256;
				local340 <<= 0x2;
				local39 = local39 * 512 + 256;
				@Pc(426) Class16_Sub1_Sub1_Sub5 local426 = new Class16_Sub1_Sub1_Sub5(local163, Static648.anInt10472, Static648.anInt10472, local23, local31, local167, Static389.anInt6694 + local189, Static389.anInt6694 + local327, local331, local340, 0, local159, local171, local265, -1);
				local426.method3796(local35, local39, Static389.anInt6694 + local189, -local171 + Static392.method5799(Static648.anInt10472, local35, local39));
				Static514.aClass114_40.method2771(new Class2_Sub7_Sub14(local426));
			}
			return;
		}
		@Pc(609) int local609;
		@Pc(636) int local636;
		if (arg0 == Static214.aClass55_8) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2876();
			@Pc(462) Class5 local462 = Static79.aClass304_2.method6956(local12);
			local23 = Static327.aClass2_Sub17_Sub1_1.method2888();
			local31 = Static327.aClass2_Sub17_Sub1_1.method2888();
			local35 = Static412.anInt6934 + (local31 >> 4 & 0x7);
			local39 = (local31 & 0x7) + Static458.anInt4947;
			local159 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local163 = local159 >> 2;
			local167 = Static567.anIntArray676[local163];
			if (local163 == 11) {
				local163 = 10;
			}
			local171 = 0;
			if (local462.aByteArray1 != null) {
				local189 = -1;
				for (local327 = 0; local327 < local462.aByteArray1.length; local327++) {
					if (local163 == local462.aByteArray1[local327]) {
						local189 = local327;
						break;
					}
				}
				local171 = local462.anIntArrayArray1[local189].length;
			}
			local189 = 0;
			if (local462.aShortArray1 != null) {
				local189 = local462.aShortArray1.length;
			}
			local327 = 0;
			if (local462.aShortArray4 != null) {
				local327 = local462.aShortArray4.length;
			}
			if ((local23 & 0x1) == 1) {
				Static606.method8736(local35, local167, (Class326) null, local39, Static648.anInt10472);
			} else {
				@Pc(569) int[] local569 = null;
				if ((local23 & 0x2) == 2) {
					local569 = new int[local171];
					for (local340 = 0; local340 < local171; local340++) {
						local569[local340] = Static327.aClass2_Sub17_Sub1_1.method2825();
					}
				}
				@Pc(599) short[] local599 = null;
				if ((local23 & 0x4) == 4) {
					local599 = new short[local189];
					for (local609 = 0; local609 < local189; local609++) {
						local599[local609] = (short) Static327.aClass2_Sub17_Sub1_1.method2825();
					}
				}
				@Pc(624) short[] local624 = null;
				if ((local23 & 0x8) == 8) {
					local624 = new short[local327];
					for (local636 = 0; local636 < local327; local636++) {
						local624[local636] = (short) Static327.aClass2_Sub17_Sub1_1.method2825();
					}
				}
				Static606.method8736(local35, local167, new Class326((long) Static66.aLong47++, local569, local599, local624), local39, Static648.anInt10472);
			}
		} else if (arg0 == Static433.aClass55_11) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = local12 >> 2;
			local23 = local12 & 0x3;
			local31 = Static567.anIntArray676[local18];
			local35 = Static327.aClass2_Sub17_Sub1_1.method2865();
			local39 = (local35 >> 4 & 0x7) + Static412.anInt6934;
			local159 = Static458.anInt4947 + (local35 & 0x7);
			if (Static625.method8671(Static376.anInt6481) || local39 >= 0 && local159 >= 0 && local39 < Static456.anInt7428 && local159 < Static5.anInt112) {
				Static575.method7996(-1, local23, local39, local159, local31, Static648.anInt10472, local18);
			}
		} else if (Static636.aClass55_14 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2888();
			local18 = local12 >> 2;
			local23 = local12 & 0x3;
			local31 = Static567.anIntArray676[local18];
			local35 = Static327.aClass2_Sub17_Sub1_1.method2876();
			local39 = Static327.aClass2_Sub17_Sub1_1.method2888();
			local159 = (local39 >> 4 & 0x7) + Static412.anInt6934;
			local163 = (local39 & 0x7) + Static458.anInt4947;
			if (Static625.method8671(Static376.anInt6481) || local159 >= 0 && local163 >= 0 && local159 < Static456.anInt7428 && local163 < Static5.anInt112) {
				Static575.method7996(local35, local23, local159, local163, local31, Static648.anInt10472, local18);
			}
		} else if (arg0 == Static49.aClass55_2) {
			Static327.aClass2_Sub17_Sub1_1.method2859();
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local23 = (local12 & 0x7) + Static458.anInt4947;
			local31 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local35 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local39 = Static327.aClass2_Sub17_Sub1_1.method2835();
			@Pc(842) String local842 = Static327.aClass2_Sub17_Sub1_1.method2833();
			Static243.method6206(local23, local39, local35, local31, local18, Static648.anInt10472, local842);
		} else if (Static582.aClass55_13 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local18 = Static327.aClass2_Sub17_Sub1_1.method2859();
			Static79.aClass304_2.method6956(local12).method90(local18);
		} else if (arg0 == Static460.aClass55_12) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local23 = Static458.anInt4947 + (local12 & 0x7);
			local31 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local39 = local35 >> 4 & 0xF;
			local159 = local35 & 0x7;
			local163 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local167 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local171 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local18 >= 0 && local23 >= 0 && local18 < Static456.anInt7428 && Static5.anInt112 > local23) {
				local189 = local39 + 1;
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] >= local18 - local189 && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] <= local18 + local189 && local23 - local189 <= Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] && local189 + local23 >= Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0]) {
					Static529.method7326(local171, local167, local163, local159, local31, (local23 << 8) + (local18 << 16) + (Static648.anInt10472 << 24) + local39);
				}
			}
		} else if (Static190.aClass55_6 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local23 = (local12 & 0x7) + Static458.anInt4947;
			local31 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static327.aClass2_Sub17_Sub1_1.method2888();
			local39 = local35 >> 2;
			local159 = local35 & 0x3;
			local163 = Static567.anIntArray676[local39];
			Static51.method722(local23, local159, local31, local163, Static648.anInt10472, local39, local18);
		} else if (arg0 == Static645.aClass55_15) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0xF) + Static412.anInt6934 * 2;
			local23 = Static458.anInt4947 * 2 + (local12 & 0xF);
			local31 = Static327.aClass2_Sub17_Sub1_1.method2859();
			@Pc(1115) boolean local1115 = (local31 & 0x1) != 0;
			@Pc(1123) boolean local1123 = (local31 & 0x2) != 0;
			local159 = local1123 ? local31 >> 2 : -1;
			local163 = Static327.aClass2_Sub17_Sub1_1.method2860() + local18;
			local167 = Static327.aClass2_Sub17_Sub1_1.method2860() + local23;
			local171 = Static327.aClass2_Sub17_Sub1_1.method2836();
			local189 = Static327.aClass2_Sub17_Sub1_1.method2836();
			local327 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local331 = Static327.aClass2_Sub17_Sub1_1.method2859();
			if (local1123) {
				local331 = (byte) local331;
			} else {
				local331 *= 4;
			}
			local340 = Static327.aClass2_Sub17_Sub1_1.method2859() * 4;
			local609 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local636 = Static327.aClass2_Sub17_Sub1_1.method2825();
			@Pc(1192) int local1192 = Static327.aClass2_Sub17_Sub1_1.method2859();
			@Pc(1196) int local1196 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (local1192 == 255) {
				local1192 = -1;
			}
			if (local18 >= 0 && local23 >= 0 && local18 < Static456.anInt7428 * 2 && local23 < Static456.anInt7428 * 2 && local163 >= 0 && local167 >= 0 && Static5.anInt112 * 2 > local163 && Static5.anInt112 * 2 > local167 && local327 != 65535) {
				local163 = local163 * 256;
				local331 <<= 0x2;
				local340 <<= 0x2;
				local1196 <<= 0x2;
				local23 = local23 * 256;
				local18 = local18 * 256;
				local167 *= 256;
				if (local171 != 0 && local159 != -1) {
					@Pc(1287) Class16_Sub1_Sub1_Sub3 local1287 = null;
					@Pc(1293) int local1293;
					if (local171 >= 0) {
						local1293 = local171 - 1;
						@Pc(1300) Class2_Sub32 local1300 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local1293);
						if (local1300 != null) {
							local1287 = local1300.aClass16_Sub1_Sub1_Sub3_Sub1_2;
						}
					} else {
						local1293 = -local171 - 1;
						if (Static608.anInt10056 == local1293) {
							local1287 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local1287 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local1293];
						}
					}
					if (local1287 != null) {
						@Pc(1331) Class291 local1331 = local1287.method7007();
						if (local1331.anIntArrayArray93 != null && local1331.anIntArrayArray93[local159] != null) {
							local331 -= local1331.anIntArrayArray93[local159][1];
						}
						if (local1331.anIntArrayArray92 != null && local1331.anIntArrayArray92[local159] != null) {
							local331 -= local1331.anIntArrayArray92[local159][1];
						}
					}
				}
				@Pc(1388) Class16_Sub1_Sub1_Sub5 local1388 = new Class16_Sub1_Sub1_Sub5(local327, Static648.anInt10472, Static648.anInt10472, local18, local23, local331, Static389.anInt6694 + local609, Static389.anInt6694 + local636, local1192, local1196, local171, local189, local340, local1115, local159);
				local1388.method3796(local163, local167, Static389.anInt6694 + local609, -local340 + Static392.method5799(Static648.anInt10472, local163, local167));
				Static514.aClass114_40.method2771(new Class2_Sub7_Sub14(local1388));
			}
		} else if (Static360.aClass55_10 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local23 = (local12 & 0x7) + Static458.anInt4947;
			local31 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local35 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local39 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local159 = Static327.aClass2_Sub17_Sub1_1.method2859();
			if (local18 >= 0 && local23 >= 0 && Static456.anInt7428 > local18 && Static5.anInt112 > local23) {
				local163 = local18 * 512 + 256;
				local167 = local23 * 512 + 256;
				local171 = Static648.anInt10472;
				if (local171 < 3 && Static481.method6813(local23, local18)) {
					local171++;
				}
				@Pc(1511) Class16_Sub1_Sub1_Sub2 local1511 = new Class16_Sub1_Sub1_Sub2(local31, local39, Static389.anInt6694, Static648.anInt10472, local171, local163, Static392.method5799(Static648.anInt10472, local163, local167) - local35, local167, local18, local18, local23, local23, local159);
				Static329.aClass114_28.method2771(new Class2_Sub7_Sub1(local1511));
			}
		} else if (Static308.aClass55_9 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local18 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local23 = Static458.anInt4947 + (local18 & 0x7);
			local31 = local23 + Static338.anInt5885;
			local35 = Static412.anInt6934 + (local18 >> 4 & 0x7);
			local39 = local35 + Static406.anInt6899;
			local159 = Static327.aClass2_Sub17_Sub1_1.method2854();
			@Pc(1577) boolean local1577 = local35 >= 0 && local23 >= 0 && Static456.anInt7428 > local35 && local23 < Static5.anInt112;
			if (local1577 || Static625.method8671(Static376.anInt6481)) {
				Static206.method3480(local39, Static648.anInt10472, new Class2_Sub50(local159, local12), local31);
				if (local1577) {
					Static72.method1634(local23, Static648.anInt10472, local35);
				}
			}
		} else if (Static185.aClass55_5 == arg0) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2859();
			local18 = (local12 & 0x7) + Static458.anInt4947;
			local23 = Static338.anInt5885 + local18;
			local31 = (local12 >> 4 & 0x7) + Static412.anInt6934;
			local35 = local31 + Static406.anInt6899;
			local39 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local159 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local163 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (Static263.aClass323_18 != null) {
				@Pc(1661) Class2_Sub23 local1661 = (Class2_Sub23) Static263.aClass323_18.method7484((long) (local35 | Static648.anInt10472 << 28 | local23 << 14));
				if (local1661 != null) {
					for (@Pc(1669) Class2_Sub50 local1669 = (Class2_Sub50) local1661.aClass114_22.method2772(); local1669 != null; local1669 = (Class2_Sub50) local1661.aClass114_22.method2762()) {
						if (local1669.anInt10421 == (local39 & 0x7FFF) && local159 == local1669.anInt10422) {
							local1669.method8920();
							local1669.anInt10422 = local163;
							Static206.method3480(local35, Static648.anInt10472, local1669, local23);
							break;
						}
					}
					if (local31 >= 0 && local18 >= 0 && local31 < Static456.anInt7428 && Static5.anInt112 > local18) {
						Static72.method1634(local18, Static648.anInt10472, local31);
					}
				}
			}
		} else if (arg0 == Static5.aClass55_1) {
			local12 = Static327.aClass2_Sub17_Sub1_1.method2876();
			local18 = Static327.aClass2_Sub17_Sub1_1.method2825();
			local23 = Static327.aClass2_Sub17_Sub1_1.method2865();
			local31 = (local23 & 0x7) + Static458.anInt4947;
			local35 = Static338.anInt5885 + local31;
			local39 = (local23 >> 4 & 0x7) + Static412.anInt6934;
			local159 = local39 + Static406.anInt6899;
			local163 = Static327.aClass2_Sub17_Sub1_1.method2825();
			if (Static608.anInt10056 != local163) {
				@Pc(1797) boolean local1797 = local39 >= 0 && local31 >= 0 && local39 < Static456.anInt7428 && local31 < Static5.anInt112;
				if (local1797 || Static625.method8671(Static376.anInt6481)) {
					Static206.method3480(local159, Static648.anInt10472, new Class2_Sub50(local18, local12), local35);
					if (local1797) {
						Static72.method1634(local31, Static648.anInt10472, local39);
					}
				}
			}
		} else {
			Static25.method7457((Throwable) null, "T3 - " + arg0);
			Static448.method6402(false);
		}
	}
}
