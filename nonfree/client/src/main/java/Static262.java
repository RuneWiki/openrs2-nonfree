import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_81 = new Class90(22, 3);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I")
	public static int method4137(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public static void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class21_Sub6 local7 = new Class21_Sub6();
		local7.aString90 = arg4;
		local7.anInt4416 = arg0;
		local7.anInt4419 = arg1;
		local7.anInt4418 = arg3;
		local7.anInt4417 = Static306.anInt6122 + arg5;
		local7.anInt4420 = arg6;
		local7.anInt4423 = arg2;
		Static573.aClass158_20.method3720(local7);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method4142() {
		while (true) {
			if (Static549.aClass4_Sub13_Sub2_2.method7057(Static488.anInt9250) >= 15) {
				@Pc(23) int local23 = Static549.aClass4_Sub13_Sub2_2.method7065(15);
				if (local23 != 32767) {
					@Pc(30) boolean local30 = false;
					@Pc(37) Class4_Sub29 local37 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local23);
					@Pc(43) Class21_Sub1_Sub1_Sub1_Sub1 local43;
					if (local37 == null) {
						local43 = new Class21_Sub1_Sub1_Sub1_Sub1();
						local43.anInt4256 = local23;
						local37 = new Class4_Sub29(local43);
						Static144.aClass221_6.method5073(local37, (long) local23);
						Static590.aClass4_Sub29Array1[Static222.anInt4653++] = local37;
						local30 = true;
					}
					local43 = local37.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					Static24.anIntArray24[Static137.anInt3042++] = local23;
					local43.anInt4260 = Static306.anInt6122;
					if (local43.aClass51_1 != null && local43.aClass51_1.method1374()) {
						Static408.method6171(local43);
					}
					local43.method1714(Class21_Sub1_Sub2_Sub1.lb.method4992(Static549.aClass4_Sub13_Sub2_2.method7065(14)));
					@Pc(111) int local111 = Static549.aClass4_Sub13_Sub2_2.method7065(2);
					@Pc(116) int local116 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
					if (local116 == 1) {
						Static470.anIntArray519[Static407.anInt7865++] = local23;
					}
					@Pc(134) int local134 = Static549.aClass4_Sub13_Sub2_2.method7065(5);
					if (local134 > 15) {
						local134 -= 32;
					}
					@Pc(143) int local143 = Static549.aClass4_Sub13_Sub2_2.method7065(5);
					if (local143 > 15) {
						local143 -= 32;
					}
					@Pc(152) int local152 = Static549.aClass4_Sub13_Sub2_2.method7065(1);
					@Pc(163) int local163 = Static549.aClass4_Sub13_Sub2_2.method7065(3) + 4 << 11 & 0x3B4E;
					local43.method3334(local43.aClass51_1.anInt1581);
					local43.anInt4255 = local43.aClass51_1.anInt1608 << 3;
					if (local30) {
						local43.method3340(true, local163);
					}
					local43.method1713(local43.method3339(), local152 == 1, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] + local134, local111, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] + local143);
					if (local43.aClass51_1.method1374()) {
						Static394.method6038(local43, null, local43.aByte127, local43.anIntArray207[0], local43.anIntArray206[0], 0, null);
					}
					continue;
				}
			}
			Static549.aClass4_Sub13_Sub2_2.method7062();
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!r;BLclient!pi;I)V")
	public static void method4144(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class262 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		if (Static247.anIntArray278 != null && arg2 <= arg1.aByte113) {
			for (local13 = 0; local13 < Static247.anIntArray278.length; local13++) {
				if (Static247.anIntArray278[local13] != -1000000 && (Static247.anIntArray278[local13] >= arg1.anIntArray417[0] || arg1.anIntArray417[1] <= Static247.anIntArray278[local13] || Static247.anIntArray278[local13] >= arg1.anIntArray417[2] || Static247.anIntArray278[local13] >= arg1.anIntArray417[3]) && (Static83.anIntArray108[local13] >= arg1.anIntArray419[0] || arg1.anIntArray419[1] <= Static83.anIntArray108[local13] || Static83.anIntArray108[local13] >= arg1.anIntArray419[2] || arg1.anIntArray419[3] <= Static83.anIntArray108[local13]) && (Static380.anIntArray406[local13] <= arg1.anIntArray419[0] || arg1.anIntArray419[1] >= Static380.anIntArray406[local13] || arg1.anIntArray419[2] >= Static380.anIntArray406[local13] || Static380.anIntArray406[local13] <= arg1.anIntArray419[3]) && (Static123.anIntArray530[local13] >= arg1.anIntArray418[0] || arg1.anIntArray418[1] <= Static123.anIntArray530[local13] || arg1.anIntArray418[2] <= Static123.anIntArray530[local13] || Static123.anIntArray530[local13] >= arg1.anIntArray418[3]) && (Static358.anIntArray388[local13] <= arg1.anIntArray418[0] || Static358.anIntArray388[local13] <= arg1.anIntArray418[1] || arg1.anIntArray418[2] >= Static358.anIntArray388[local13] || Static358.anIntArray388[local13] <= arg1.anIntArray418[3])) {
					return;
				}
			}
		}
		@Pc(261) int local261;
		@Pc(280) int local280;
		@Pc(294) boolean local294;
		@Pc(322) float local322;
		if (arg1.aByte112 == 1) {
			local13 = Static30.anInt1124 + arg1.aShort90 - Static465.anInt8858;
			if (local13 >= 0 && Static30.anInt1124 + Static30.anInt1124 >= local13) {
				local261 = arg1.aShort91 + Static30.anInt1124 - Static78.anInt1933;
				if (local261 < 0) {
					local261 = 0;
				} else if (local261 > Static30.anInt1124 + Static30.anInt1124) {
					return;
				}
				local280 = arg1.aShort89 + Static30.anInt1124 - Static78.anInt1933;
				if (Static30.anInt1124 + Static30.anInt1124 < local280) {
					local280 = Static30.anInt1124 + Static30.anInt1124;
				} else if (local280 < 0) {
					return;
				}
				local294 = false;
				while (local261 <= local280) {
					if (Static339.aBooleanArrayArray8[local13][local261++]) {
						local294 = true;
						break;
					}
				}
				if (local294) {
					local322 = Static184.anInt3856 - arg1.anIntArray419[0];
					if (local322 < 0.0F) {
						local322 *= -1.0F;
					}
					if (!(float) Static590.anInt10586 > local322 && (Static112.method2048(arg1, 0) && (Static112.method2048(arg1, 1) && (Static112.method2048(arg1, 2) && Static112.method2048(arg1, 3))))) {
						Static218.aClass262Array1[Static407.anInt7866++] = arg1;
					}
				}
			}
		} else if (arg1.aByte112 == 2) {
			local13 = arg1.aShort91 + Static30.anInt1124 - Static78.anInt1933;
			if (local13 >= 0 && Static30.anInt1124 + Static30.anInt1124 >= local13) {
				local261 = arg1.aShort90 + Static30.anInt1124 - Static465.anInt8858;
				if (local261 < 0) {
					local261 = 0;
				} else if (local261 > Static30.anInt1124 + Static30.anInt1124) {
					return;
				}
				local280 = Static30.anInt1124 + arg1.aShort88 - Static465.anInt8858;
				if (local280 > Static30.anInt1124 + Static30.anInt1124) {
					local280 = Static30.anInt1124 + Static30.anInt1124;
				} else if (local280 < 0) {
					return;
				}
				local294 = false;
				while (local261 <= local280) {
					if (Static339.aBooleanArrayArray8[local261++][local13]) {
						local294 = true;
						break;
					}
				}
				if (local294) {
					local322 = Static515.anInt4127 - arg1.anIntArray418[0];
					if (local322 < 0.0F) {
						local322 *= -1.0F;
					}
					if (!(local322 < (float) Static590.anInt10586) && (Static112.method2048(arg1, 0) && (Static112.method2048(arg1, 1) && (Static112.method2048(arg1, 2) && Static112.method2048(arg1, 3))))) {
						Static218.aClass262Array1[Static407.anInt7866++] = arg1;
					}
				}
			}
		} else if (arg1.aByte112 == 16 || arg1.aByte112 == 8) {
			local13 = Static30.anInt1124 + arg1.aShort90 - Static465.anInt8858;
			if (local13 >= 0 && Static30.anInt1124 + Static30.anInt1124 >= local13) {
				local261 = Static30.anInt1124 + arg1.aShort91 - Static78.anInt1933;
				if (local261 >= 0 && local261 <= Static30.anInt1124 + Static30.anInt1124 && Static339.aBooleanArrayArray8[local13][local261]) {
					@Pc(587) float local587 = (float) (Static184.anInt3856 - arg1.anIntArray419[0]);
					if (local587 < 0.0F) {
						local587 *= -1.0F;
					}
					@Pc(604) float local604 = (float) (Static515.anInt4127 - arg1.anIntArray418[0]);
					if (local604 < 0.0F) {
						local604 *= -1.0F;
					}
					if ((!((float) Static590.anInt10586 > local587) || !((float) Static590.anInt10586 > local604)) && (Static112.method2048(arg1, 0) && (Static112.method2048(arg1, 1) && (Static112.method2048(arg1, 2) && Static112.method2048(arg1, 3))))) {
						Static218.aClass262Array1[Static407.anInt7866++] = arg1;
					}
				}
			}
		} else if (arg1.aByte112 == 4) {
			@Pc(671) float local671 = (float) (arg1.anIntArray417[0] - Static80.anInt2175);
			if (!(local671 <= (float) Static477.anInt9047)) {
				local261 = arg1.aShort91 + Static30.anInt1124 - Static78.anInt1933;
				if (local261 < 0) {
					local261 = 0;
				} else if (Static30.anInt1124 + Static30.anInt1124 < local261) {
					return;
				}
				local280 = Static30.anInt1124 + arg1.aShort89 - Static78.anInt1933;
				if (local280 > Static30.anInt1124 + Static30.anInt1124) {
					local280 = Static30.anInt1124 + Static30.anInt1124;
				} else if (local280 < 0) {
					return;
				}
				@Pc(727) int local727 = Static30.anInt1124 + arg1.aShort90 - Static465.anInt8858;
				if (local727 < 0) {
					local727 = 0;
				} else if (local727 > Static30.anInt1124 + Static30.anInt1124) {
					return;
				}
				@Pc(752) int local752 = arg1.aShort88 + Static30.anInt1124 - Static465.anInt8858;
				if (local752 > Static30.anInt1124 + Static30.anInt1124) {
					local752 = Static30.anInt1124 + Static30.anInt1124;
				} else if (local752 < 0) {
					return;
				}
				@Pc(768) boolean local768 = false;
				label283: for (@Pc(770) int local770 = local727; local770 <= local752; local770++) {
					for (@Pc(774) int local774 = local261; local774 <= local280; local774++) {
						if (Static339.aBooleanArrayArray8[local770][local774]) {
							local768 = true;
							break label283;
						}
					}
				}
				if (local768 && (Static112.method2048(arg1, 0) && (Static112.method2048(arg1, 1) && (Static112.method2048(arg1, 2) && Static112.method2048(arg1, 3))))) {
					Static218.aClass262Array1[Static407.anInt7866++] = arg1;
				}
			}
		}
	}
}
