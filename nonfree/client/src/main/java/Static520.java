import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!pea;")
	public static Class251 aClass251_10;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_123 = new Class71(68, -2);

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_6 = new Class138(1, 2);

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_124 = new Class71(6, 6);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7417(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static342.method5462(Static57.method1618(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)Z")
	public static boolean method7418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!tp;ILclient!ha;II)V")
	public static void method7421(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1 local10 = arg0.method7750(arg2);
		if (local10 == null) {
			return;
		}
		arg2.KA(arg1, arg3, arg0.anInt9553 + arg1, arg0.anInt9505 + arg3);
		if (Static266.anInt5673 == 2 || Static266.anInt5673 == 5 || Static405.aClass21_27 == null) {
			arg2.A(-16777216, local10, arg1, arg3);
			return;
		}
		@Pc(69) int local69;
		@Pc(72) int local72;
		@Pc(59) int local59;
		@Pc(66) int local66;
		if (Static427.anInt8005 == 4) {
			local69 = Static4.anInt24;
			local72 = Static93.anInt2585;
			local59 = (int) -Static499.aFloat185 & 0x3FFF;
			local66 = 4096;
		} else {
			local59 = (int) -Static499.aFloat185 + Static642.anInt10689 & 0x3FFF;
			local66 = 4096 - Static423.anInt7961 * 16;
			local69 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
			local72 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
		}
		@Pc(100) int local100 = local69 / 128 + 208 + 48 - Static372.anInt7082 * 2;
		@Pc(117) int local117 = Static218.anInt5023 * 4 + 48 - local72 / 128 - (Static218.anInt5023 + -104) * 2;
		Static405.aClass21_27.method5795((float) arg1 + (float) arg0.anInt9553 / 2.0F, (float) arg0.anInt9505 / 2.0F + (float) arg3, (float) local100, (float) local117, local66, local59 << 2, local10, arg1, arg3);
		@Pc(167) int local167;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(198) int local198;
		for (@Pc(151) Class8_Sub17 local151 = (Class8_Sub17) Static444.aClass43_52.method1422(); local151 != null; local151 = (Class8_Sub17) Static444.aClass43_52.method1426()) {
			@Pc(156) int local156 = local151.anInt2919;
			local167 = (Static246.aClass14_2.anIntArray12[local156] >> 14 & 0x3FFF) - Static628.anInt10493;
			local177 = (Static246.aClass14_2.anIntArray12[local156] & 0x3FFF) - Static594.anInt10160;
			local188 = local167 * 4 + 2 - local69 / 128;
			local198 = local177 * 4 + 2 - local72 / 128;
			Static427.method6637(local188, arg2, Static246.aClass14_2.anIntArray11[local156], arg1, arg0, local198, arg3, local10);
		}
		for (local167 = 0; local167 < Static518.anInt9044; local167++) {
			local177 = Static340.anIntArray376[local167] * 4 + 2 - local69 / 128;
			local188 = Static125.anIntArray372[local167] * 4 + 2 - local72 / 128;
			@Pc(255) Class352 local255 = Static437.aClass199_3.method5342(Static499.anIntArray493[local167]);
			if (local255.anIntArray591 != null) {
				local255 = local255.method8164(Static420.aClass77_1);
				if (local255 == null || local255.anInt10101 == -1) {
					continue;
				}
			}
			Static427.method6637(local177, arg2, local255.anInt10101, arg1, arg0, local188, arg3, local10);
		}
		@Pc(335) int local335;
		@Pc(346) int local346;
		for (@Pc(291) Class8_Sub26 local291 = (Class8_Sub26) Static567.aClass253_38.method6593(); local291 != null; local291 = (Class8_Sub26) Static567.aClass253_38.method6595()) {
			local188 = (int) (local291.aLong285 >> 28 & 0x3L);
			if (local188 == Static599.anInt10218) {
				local198 = (int) (local291.aLong285 & 0x3FFFL) - Static628.anInt10493;
				@Pc(324) int local324 = (int) (local291.aLong285 >> 14 & 0x3FFFL) - Static594.anInt10160;
				local335 = local198 * 4 + 2 - local69 / 128;
				local346 = local324 * 4 + 2 - local72 / 128;
				Static605.method7726(local335, arg0, arg3, arg1, local346, local10, Static584.aClass21Array20[0]);
			}
		}
		@Pc(432) int local432;
		for (local188 = 0; local188 < Static59.anInt1906; local188++) {
			@Pc(377) Class8_Sub50 local377 = (Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local188]);
			if (local377 != null) {
				@Pc(382) Class15_Sub1_Sub2_Sub2_Sub2 local382 = local377.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				if (local382.method6703() && local382.aByte124 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) {
					@Pc(394) Class300 local394 = local382.aClass300_1;
					if (local394 != null && local394.anIntArray498 != null) {
						local394 = local394.method7306(Static420.aClass77_1);
					}
					if (local394 != null && local394.aBoolean634 && local394.aBoolean627) {
						local346 = local382.anInt10301 / 128 - local69 / 128;
						local432 = local382.anInt10298 / 128 - local72 / 128;
						if (local394.anInt8901 == -1) {
							Static605.method7726(local346, arg0, arg3, arg1, local432, local10, Static584.aClass21Array20[1]);
						} else {
							Static427.method6637(local346, arg2, local394.anInt8901, arg1, arg0, local432, arg3, local10);
						}
					}
				}
			}
		}
		local198 = Static315.anInt9128;
		@Pc(468) int[] local468 = Static533.anIntArray506;
		@Pc(515) int local515;
		@Pc(519) int local519;
		@Pc(544) int local544;
		for (local335 = 0; local335 < local198; local335++) {
			@Pc(478) Class15_Sub1_Sub2_Sub2_Sub1 local478 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local468[local335]];
			if (local478 != null && local478.method2766() && !local478.aBoolean251 && local478 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 == local478.aByte124) {
				local432 = local478.anInt10301 / 128 - local69 / 128;
				local515 = local478.anInt10298 / 128 - local72 / 128;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static530.anInt9157; local519++) {
					if (local478.aString35.equals(Static54.aStringArray6[local519]) && Static620.anIntArray608[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(542) boolean local542 = false;
				for (local544 = 0; local544 < Static198.anInt4608; local544++) {
					if (local478.aString35.equals(Static29.aClass249Array1[local544].aString79)) {
						local542 = true;
						break;
					}
				}
				@Pc(564) boolean local564 = false;
				if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3293 != 0 && local478.anInt3293 != 0 && local478.anInt3293 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3293) {
					local564 = true;
				}
				if (local478.aBoolean249) {
					Static605.method7726(local432, arg0, arg3, arg1, local515, local10, Static584.aClass21Array20[6]);
				} else if (local517) {
					Static605.method7726(local432, arg0, arg3, arg1, local515, local10, Static584.aClass21Array20[3]);
				} else if (local542) {
					Static605.method7726(local432, arg0, arg3, arg1, local515, local10, Static584.aClass21Array20[5]);
				} else if (local564) {
					Static605.method7726(local432, arg0, arg3, arg1, local515, local10, Static584.aClass21Array20[4]);
				} else {
					Static605.method7726(local432, arg0, arg3, arg1, local515, local10, Static584.aClass21Array20[2]);
				}
			}
		}
		@Pc(665) Class319[] local665 = Static447.aClass319Array3;
		@Pc(750) int local750;
		for (local432 = 0; local432 < local665.length; local432++) {
			@Pc(673) Class319 local673 = local665[local432];
			if (local673 != null && local673.anInt9116 != 0 && Static435.anInt8192 % 20 < 10) {
				@Pc(715) int local715;
				if (local673.anInt9116 == 1) {
					@Pc(700) Class8_Sub50 local700 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local673.anInt9124);
					if (local700 != null) {
						@Pc(705) Class15_Sub1_Sub2_Sub2_Sub2 local705 = local700.aClass15_Sub1_Sub2_Sub2_Sub2_2;
						local715 = local705.anInt10301 / 128 - local69 / 128;
						local544 = local705.anInt10298 / 128 - local72 / 128;
						Static569.method7906(local673.anInt9123, arg1, local10, 360000L, arg0, local544, arg3, local715);
					}
				}
				if (local673.anInt9116 == 2) {
					local750 = local673.anInt9115 / 128 - local69 / 128;
					local519 = local673.anInt9122 / 128 - local72 / 128;
					@Pc(765) long local765 = (long) (local673.anInt9117 << 7);
					@Pc(769) long local769 = local765 * local765;
					Static569.method7906(local673.anInt9123, arg1, local10, local769, arg0, local519, arg3, local750);
				}
				if (local673.anInt9116 == 10 && local673.anInt9124 >= 0 && Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1.length > local673.anInt9124) {
					@Pc(800) Class15_Sub1_Sub2_Sub2_Sub1 local800 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local673.anInt9124];
					if (local800 != null) {
						local519 = local800.anInt10301 / 128 - local69 / 128;
						local715 = local800.anInt10298 / 128 - local72 / 128;
						Static569.method7906(local673.anInt9123, arg1, local10, 360000L, arg0, local715, arg3, local519);
					}
				}
			}
		}
		if (Static427.anInt8005 == 4) {
			return;
		}
		if (Static370.anInt7031 != 0) {
			local515 = Static370.anInt7031 * 4 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() * 2 + 2 - local69 / 128 - 2;
			local750 = Static29.anInt1137 * 4 + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() - 1) * 2 + 2 - local72 / 128;
			Static605.method7726(local515, arg0, arg3, arg1, local750, local10, Static95.aClass21Array4[Static447.aBoolean310 ? 1 : 0]);
		}
		if (!Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aBoolean251) {
			arg2.method6114(-1, arg1 + arg0.anInt9553 / 2 - 1, 3, arg0.anInt9505 / 2 + arg3 - 1, 3);
			return;
		}
	}
}
