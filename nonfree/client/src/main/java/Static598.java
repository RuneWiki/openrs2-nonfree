import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vha", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!vha", name = "C", descriptor = "I")
	public static int anInt10044;

	@OriginalMember(owner = "client!vha", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_155 = new Class337(114, 6);

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(III)V")
	public static void method8588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(1, arg1);
		local8.method8958();
		local8.anInt10530 = arg0;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!ha;IIILclient!raa;)V")
	public static void method8592(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class295 arg3) {
		@Pc(17) Class1 local17 = arg3.method6998(arg0);
		if (local17 == null) {
			return;
		}
		arg0.KA(arg1, arg2, arg1 + arg3.anInt7957, arg3.anInt7985 + arg2);
		if (Static606.anInt10177 == 2 || Static606.anInt10177 == 5 || Static409.aClass28_7 == null) {
			arg0.A(-16777216, local17, arg1, arg2);
			return;
		}
		@Pc(68) int local68;
		@Pc(71) int local71;
		@Pc(65) int local65;
		@Pc(77) int local77;
		if (Static254.anInt4612 == 4) {
			local71 = Static325.anInt5511;
			local77 = 4096;
			local68 = Static536.anInt9158;
			local65 = (int) -Static311.aFloat95 & 0x3FFF;
		} else {
			local65 = Static2.anInt7 + (int) -Static311.aFloat95 & 0x3FFF;
			local68 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231;
			local71 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229;
			local77 = 4096 - Static372.anInt6183 * 16;
		}
		@Pc(101) int local101 = local68 / 128 + 256 - Static326.anInt5541 * 2;
		@Pc(118) int local118 = Static448.anInt7637 * 4 + 208 + 48 - Static448.anInt7637 * 2 - local71 / 128;
		Static409.aClass28_7.method4041((float) arg3.anInt7957 / 2.0F + (float) arg1, (float) arg2 + (float) arg3.anInt7985 / 2.0F, (float) local101, (float) local118, local77, local65 << 2, local17, arg1, arg2);
		@Pc(168) int local168;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(200) int local200;
		for (@Pc(152) Class5_Sub41 local152 = (Class5_Sub41) Static283.aClass330_23.method7908(); local152 != null; local152 = (Class5_Sub41) Static283.aClass330_23.method7914()) {
			@Pc(157) int local157 = local152.anInt7600;
			local168 = (Static646.aClass378_6.anIntArray603[local157] >> 14 & 0x3FFF) - Static565.anInt9560;
			local178 = (Static646.aClass378_6.anIntArray603[local157] & 0x3FFF) - Static567.anInt9589;
			local189 = local168 * 4 + 2 - local68 / 128;
			local200 = local178 * 4 + 2 - local71 / 128;
			Static394.method5842(arg3, arg1, Static646.aClass378_6.anIntArray602[local157], local189, local17, arg2, arg0, local200);
		}
		for (local168 = 0; local168 < Static141.anInt2456; local168++) {
			local178 = Static182.anIntArray179[local168] * 4 + 2 - local68 / 128;
			local189 = Static602.anIntArray576[local168] * 4 + 2 - local71 / 128;
			@Pc(257) Class181 local257 = Static61.aClass246_7.method5497(Static474.anIntArray456[local168]);
			if (local257.anIntArray235 != null) {
				local257 = local257.method4279(Static301.aClass59_1);
				if (local257 == null || local257.anInt4766 == -1) {
					continue;
				}
			}
			Static394.method5842(arg3, arg1, local257.anInt4766, local178, local17, arg2, arg0, local189);
		}
		@Pc(340) int local340;
		@Pc(351) int local351;
		for (@Pc(297) Class5_Sub18 local297 = (Class5_Sub18) Static440.aClass273_28.method6577(); local297 != null; local297 = (Class5_Sub18) Static440.aClass273_28.method6589()) {
			local189 = (int) (local297.aLong278 >> 28 & 0x3L);
			if (Static310.anInt5363 == local189) {
				local200 = (int) (local297.aLong278 & 0x3FFFL) - Static565.anInt9560;
				@Pc(329) int local329 = (int) (local297.aLong278 >> 14 & 0x3FFFL) - Static567.anInt9589;
				local340 = local200 * 4 + 2 - local68 / 128;
				local351 = local329 * 4 + 2 - local71 / 128;
				Static517.method7655(local17, arg3, arg1, local340, Static556.aClass28Array19[0], arg2, local351);
			}
		}
		@Pc(436) int local436;
		for (local189 = 0; local189 < Static280.anInt4989; local189++) {
			@Pc(382) Class5_Sub3 local382 = (Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local189]);
			if (local382 != null) {
				@Pc(387) Class4_Sub2_Sub1_Sub1_Sub2 local387 = local382.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				if (local387.method1042() && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 == local387.aByte132) {
					@Pc(399) Class225 local399 = local387.aClass225_1;
					if (local399 != null && local399.anIntArray304 != null) {
						local399 = local399.method4990(Static301.aClass59_1);
					}
					if (local399 != null && local399.aBoolean407 && local399.aBoolean409) {
						local351 = local387.anInt10231 / 128 - local68 / 128;
						local436 = local387.anInt10229 / 128 - local71 / 128;
						if (local399.anInt5631 == -1) {
							Static517.method7655(local17, arg3, arg1, local351, Static556.aClass28Array19[1], arg2, local436);
						} else {
							Static394.method5842(arg3, arg1, local399.anInt5631, local351, local17, arg2, arg0, local436);
						}
					}
				}
			}
		}
		local200 = Static320.anInt5442;
		@Pc(473) int[] local473 = Static278.anIntArray264;
		@Pc(523) int local523;
		@Pc(527) int local527;
		@Pc(556) int local556;
		for (local340 = 0; local340 < local200; local340++) {
			@Pc(483) Class4_Sub2_Sub1_Sub1_Sub1 local483 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local473[local340]];
			if (local483 != null && local483.method738() && !local483.aBoolean49 && local483 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 && local483.aByte132 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) {
				local436 = local483.anInt10231 / 128 - local68 / 128;
				local523 = local483.anInt10229 / 128 - local71 / 128;
				@Pc(525) boolean local525 = false;
				for (local527 = 0; local527 < Static48.anInt995; local527++) {
					if (local483.aString17.equals(Static400.aStringArray55[local527]) && Static408.anIntArray379[local527] != 0) {
						local525 = true;
						break;
					}
				}
				@Pc(554) boolean local554 = false;
				for (local556 = 0; local556 < Static113.anInt2111; local556++) {
					if (local483.aString17.equals(Static199.aClass21Array1[local556].aString10)) {
						local554 = true;
						break;
					}
				}
				@Pc(576) boolean local576 = false;
				if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt889 != 0 && local483.anInt889 != 0 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt889 == local483.anInt889) {
					local576 = true;
				}
				if (local483.aBoolean48) {
					Static517.method7655(local17, arg3, arg1, local436, Static556.aClass28Array19[6], arg2, local523);
				} else if (local525) {
					Static517.method7655(local17, arg3, arg1, local436, Static556.aClass28Array19[3], arg2, local523);
				} else if (local554) {
					Static517.method7655(local17, arg3, arg1, local436, Static556.aClass28Array19[5], arg2, local523);
				} else if (local576) {
					Static517.method7655(local17, arg3, arg1, local436, Static556.aClass28Array19[4], arg2, local523);
				} else {
					Static517.method7655(local17, arg3, arg1, local436, Static556.aClass28Array19[2], arg2, local523);
				}
			}
		}
		@Pc(675) Class154[] local675 = Static82.aClass154Array1;
		@Pc(757) int local757;
		for (local436 = 0; local436 < local675.length; local436++) {
			@Pc(683) Class154 local683 = local675[local436];
			if (local683 != null && local683.anInt4132 != 0 && Static631.anInt10493 % 20 < 10) {
				@Pc(723) int local723;
				if (local683.anInt4132 == 1) {
					@Pc(708) Class5_Sub3 local708 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local683.anInt4129);
					if (local708 != null) {
						@Pc(713) Class4_Sub2_Sub1_Sub1_Sub2 local713 = local708.aClass4_Sub2_Sub1_Sub1_Sub2_1;
						local723 = local713.anInt10231 / 128 - local68 / 128;
						local556 = local713.anInt10229 / 128 - local71 / 128;
						Static9.method201(arg1, arg3, local723, local17, local556, local683.anInt4130, 360000L, arg2);
					}
				}
				if (local683.anInt4132 == 2) {
					local757 = local683.anInt4139 / 128 - local68 / 128;
					local527 = local683.anInt4135 / 128 - local71 / 128;
					@Pc(773) long local773 = (long) (local683.anInt4138 << 7);
					@Pc(777) long local777 = local773 * local773;
					Static9.method201(arg1, arg3, local757, local17, local527, local683.anInt4130, local777, arg2);
				}
				if (local683.anInt4132 == 10 && local683.anInt4129 >= 0 && local683.anInt4129 < Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12.length) {
					@Pc(807) Class4_Sub2_Sub1_Sub1_Sub1 local807 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local683.anInt4129];
					if (local807 != null) {
						local527 = local807.anInt10231 / 128 - local68 / 128;
						local723 = local807.anInt10229 / 128 - local71 / 128;
						Static9.method201(arg1, arg3, local527, local17, local723, local683.anInt4130, 360000L, arg2);
					}
				}
			}
		}
		if (Static254.anInt4612 == 4) {
			return;
		}
		if (Static511.anInt8845 != 0) {
			local523 = Static511.anInt8845 * 4 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() * 2 + 2 - local68 / 128 - 2;
			local757 = Static16.anInt249 * 4 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() * 2 + 2 - local71 / 128 - 2;
			Static517.method7655(local17, arg3, arg1, local523, Static273.aClass28Array13[Static302.aBoolean387 ? 1 : 0], arg2, local757);
		}
		if (!Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aBoolean49) {
			arg0.method7251(3, 3, -1, arg3.anInt7985 / 2 + arg2 - 1, arg3.anInt7957 / 2 + (arg1 - 1));
			return;
		}
	}
}
