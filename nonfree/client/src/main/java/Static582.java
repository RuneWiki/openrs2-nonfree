import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
	public static int anInt9621 = -1;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLjava/lang/String;Lclient!jc;)I")
	public static int method8305(@OriginalArg(1) String arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		@Pc(6) int local6 = arg1.anInt8936;
		@Pc(10) byte[] local10 = Static359.method5455(arg0);
		arg1.method7698(local10.length);
		arg1.anInt8936 += Static234.aClass296_1.method7356(arg1.aByteArray99, local10.length, arg1.anInt8936, local10, 0);
		return arg1.anInt8936 - local6;
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(Z)V")
	public static void method8307() {
		@Pc(8) Class14_Sub21_Sub2 local8 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		for (@Pc(10) int local10 = 0; local10 < Static185.anInt3047; local10++) {
			@Pc(25) int local25 = Static551.anIntArray477[local10];
			@Pc(33) Class4_Sub3_Sub3_Sub3_Sub1 local33 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) local25)).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			@Pc(37) int local37 = local8.method7695(120);
			if ((local37 & 0x40) != 0) {
				local37 += local8.method7695(107) << 8;
			}
			if ((local37 & 0x400) != 0) {
				local37 += local8.method7695(121) << 16;
			}
			if ((local37 & 0x1000) != 0) {
				local33.anInt3292 = local8.method7734();
				local33.anInt3294 = local8.method7736();
				local33.anInt3293 = local8.method7688();
				local33.anInt3291 = local8.method7734();
				local33.anInt3287 = local8.method7754() + Static530.anInt9105;
				local33.anInt3286 = local8.method7754() + Static530.anInt9105;
				local33.anInt3290 = local8.method7749(-16669);
				local33.anInt3291 += local33.anIntArray201[0];
				local33.anInt3294 += local33.anIntArray201[0];
				local33.anInt3298 = 1;
				local33.anInt3293 += local33.anIntArray200[0];
				local33.anInt3292 += local33.anIntArray200[0];
				local33.anInt3297 = 0;
			}
			if ((local37 & 0x2000) != 0) {
				local33.aByte74 = local8.method7736();
				local33.aByte73 = local8.method7688();
				local33.aByte72 = local8.method7688();
				local33.aByte75 = (byte) local8.method7749(-16669);
				local33.anInt3288 = Static530.anInt9105 + local8.method7708();
				local33.anInt3284 = Static530.anInt9105 + local8.method7717(-1978450544);
			}
			if ((local37 & 0x20) != 0) {
				local33.anInt3256 = local8.method7754();
				if (local33.anInt3256 == 65535) {
					local33.anInt3256 = -1;
				}
			}
			@Pc(232) int local232;
			@Pc(235) int[] local235;
			@Pc(238) int[] local238;
			@Pc(240) int local240;
			@Pc(246) int local246;
			@Pc(255) int local255;
			if ((local37 & 0x8000) != 0) {
				local232 = local8.method7714();
				local235 = new int[local232];
				local238 = new int[local232];
				for (local240 = 0; local240 < local232; local240++) {
					local246 = local8.method7712();
					if ((local246 & 0xC000) == 49152) {
						local255 = local8.method7717(-1978450544);
						local235[local240] = local246 << 16 | local255;
					} else {
						local235[local240] = local246;
					}
					local238[local240] = local8.method7717(-1978450544);
				}
				local33.method2871(local235, local238);
			}
			@Pc(300) int local300;
			@Pc(311) int local311;
			@Pc(340) boolean local340;
			if ((local37 & 0x100000) != 0) {
				local232 = local8.method7708();
				local300 = local8.method7689();
				if (local232 == 65535) {
					local232 = -1;
				}
				local311 = local8.method7738(1275460792);
				local240 = local311 & 0x7;
				local246 = local311 >> 3 & 0xF;
				if (local246 == 15) {
					local246 = -1;
				}
				local340 = (local311 >> 7 & 0x1) == 1;
				local33.method2863(local300, local340, 2, local232, local240, local246);
			}
			if ((local37 & 0x200) != 0) {
				local232 = local8.method7738(1275460792);
				local235 = new int[local232];
				local238 = new int[local232];
				@Pc(366) int[] local366 = new int[local232];
				for (local246 = 0; local246 < local232; local246++) {
					local255 = local8.method7754();
					if (local255 == 65535) {
						local255 = -1;
					}
					local235[local246] = local255;
					local238[local246] = local8.method7714();
					local366[local246] = local8.method7712();
				}
				Static166.method2390(local238, local33, local235, local366);
			}
			if ((local37 & 0x2) != 0) {
				local33.method2568(local8.method7703(0));
			}
			if ((local37 & 0x1) != 0) {
				@Pc(440) int[] local440 = new int[4];
				for (local300 = 0; local300 < 4; local300++) {
					local440[local300] = local8.method7712();
					if (local440[local300] == 65535) {
						local440[local300] = -1;
					}
				}
				local311 = local8.method7714();
				Static167.method2423(local440, local33, local311, true);
			}
			@Pc(550) int local550;
			@Pc(554) int local554;
			if ((local37 & 0x10) != 0) {
				local232 = local8.method7714();
				if (local232 > 0) {
					for (local300 = 0; local300 < local232; local300++) {
						local240 = -1;
						local246 = -1;
						local255 = -1;
						local311 = local8.method7728(-129);
						if (local311 == 32767) {
							local311 = local8.method7728(-129);
							local246 = local8.method7728(-129);
							local240 = local8.method7728(-129);
							local255 = local8.method7728(-129);
						} else if (local311 == 32766) {
							local311 = -1;
						} else {
							local246 = local8.method7728(-129);
						}
						local550 = local8.method7728(-129);
						local554 = local8.method7738(1275460792);
						local33.method2880(local554, local550, local240, local255, Static530.anInt9105, local311, local246);
					}
				}
			}
			if ((local37 & 0x40000) != 0) {
				local232 = local8.method7717(-1978450544);
				local300 = local8.method7731();
				if (local232 == 65535) {
					local232 = -1;
				}
				local311 = local8.method7749(-16669);
				local240 = local311 & 0x7;
				local246 = local311 >> 3 & 0xF;
				if (local246 == 15) {
					local246 = -1;
				}
				local340 = (local311 >> 7 & 0x1) == 1;
				local33.method2863(local300, local340, 3, local232, local240, local246);
			}
			if ((local37 & 0x20000) != 0) {
				local33.aString34 = local8.method7703(0);
				if ("".equals(local33.aString34) || local33.aString34.equals(local33.aClass362_1.aString115)) {
					local33.aString34 = local33.aClass362_1.aString115;
				}
			}
			if ((local37 & 0x4) != 0) {
				local33.anInt2829 = local8.method7712();
				local33.anInt2814 = local8.method7754();
			}
			if ((local37 & 0x80000) != 0) {
				local33.anInt2817 = local8.method7712();
				if (local33.anInt2817 == 65535) {
					local33.anInt2817 = local33.aClass362_1.anInt10104;
				}
			}
			if ((local37 & 0x8) != 0) {
				if (local33.aClass362_1.method8644()) {
					Static55.method995(local33);
				}
				local33.method2572(Static152.aClass61_1.method1230(local8.method7708()));
				local33.method2882(local33.aClass362_1.anInt10069);
				local33.anInt3295 = local33.aClass362_1.anInt10063 << 3;
				if (local33.aClass362_1.method8644()) {
					Static399.method6096(local33.anIntArray200[0], local33.aByte146, 0, (Class4_Sub3_Sub3_Sub3_Sub2) null, local33, (Class128) null, local33.anIntArray201[0]);
				}
			}
			if ((local37 & 0x800) != 0) {
				local232 = local8.method7712();
				local33.anInt3252 = local8.method7738(1275460792);
				local33.anInt3264 = local8.method7714();
				local33.anInt3274 = local232 & 0x7FFF;
				local33.aBoolean237 = (local232 & 0x8000) != 0;
				local33.anInt3271 = Static530.anInt9105 + local33.anInt3274 + local33.anInt3252;
			}
			if ((local37 & 0x80) != 0) {
				local232 = local8.method7708();
				local300 = local8.method7726();
				if (local232 == 65535) {
					local232 = -1;
				}
				local311 = local8.method7749(-16669);
				local240 = local311 & 0x7;
				local246 = local311 >> 3 & 0xF;
				if (local246 == 15) {
					local246 = -1;
				}
				local340 = (local311 >> 7 & 0x1) == 1;
				local33.method2863(local300, local340, 0, local232, local240, local246);
			}
			@Pc(991) short[] local991;
			@Pc(1036) long local1036;
			@Pc(962) short[] local962;
			@Pc(936) int[] local936;
			if ((local37 & 0x4000) != 0) {
				local232 = local33.aClass362_1.anIntArray551.length;
				local300 = 0;
				if (local33.aClass362_1.aShortArray143 != null) {
					local300 = local33.aClass362_1.aShortArray143.length;
				}
				local311 = 0;
				if (local33.aClass362_1.aShortArray141 != null) {
					local311 = local33.aClass362_1.aShortArray141.length;
				}
				local240 = local8.method7749(-16669);
				if ((local240 & 0x1) == 1) {
					local33.aClass194_1 = null;
				} else {
					local936 = null;
					if ((local240 & 0x2) == 2) {
						local936 = new int[local232];
						for (local255 = 0; local255 < local232; local255++) {
							local936[local255] = local8.method7708();
						}
					}
					local962 = null;
					if ((local240 & 0x4) == 4) {
						local962 = new short[local300];
						for (local550 = 0; local550 < local300; local550++) {
							local962[local550] = (short) local8.method7708();
						}
					}
					local991 = null;
					if ((local240 & 0x8) == 8) {
						local991 = new short[local311];
						for (local554 = 0; local554 < local311; local554++) {
							local991[local554] = (short) local8.method7708();
						}
					}
					local1036 = (long) local33.anInt2811++ << 32 | (long) local25;
					local33.aClass194_1 = new Class194(local1036, local936, local962, local991);
				}
			}
			if ((local37 & 0x10000) != 0) {
				local232 = local33.aClass362_1.anIntArray549.length;
				local300 = 0;
				if (local33.aClass362_1.aShortArray143 != null) {
					local300 = local33.aClass362_1.aShortArray143.length;
				}
				if (local33.aClass362_1.aShortArray141 != null) {
					local300 = local33.aClass362_1.aShortArray141.length;
				}
				local240 = local8.method7749(-16669);
				if ((local240 & 0x1) != 1) {
					local936 = null;
					if ((local240 & 0x2) == 2) {
						local936 = new int[local232];
						for (local255 = 0; local255 < local232; local255++) {
							local936[local255] = local8.method7717(-1978450544);
						}
					}
					local962 = null;
					if ((local240 & 0x4) == 4) {
						local962 = new short[local300];
						for (local550 = 0; local550 < local300; local550++) {
							local962[local550] = (short) local8.method7754();
						}
					}
					local991 = null;
					if ((local240 & 0x8) == 8) {
						local991 = new short[0];
						for (local554 = 0; local554 < 0; local554++) {
							local991[local554] = (short) local8.method7717(-1978450544);
						}
					}
					local1036 = (long) local33.anInt2819++ << 32 | (long) local25;
					new Class194(local1036, local936, local962, local991);
				}
			}
			if ((local37 & 0x100) != 0) {
				local232 = local8.method7754();
				if (local232 == 65535) {
					local232 = -1;
				}
				local300 = local8.method7726();
				local311 = local8.method7738(1275460792);
				local240 = local311 & 0x7;
				local246 = local311 >> 3 & 0xF;
				if (local246 == 15) {
					local246 = -1;
				}
				local340 = (local311 >> 7 & 0x1) == 1;
				local33.method2863(local300, local340, 1, local232, local240, local246);
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!fr;BZ)V")
	public static void method8309(@OriginalArg(0) Class4_Sub3_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static638.anInt10454 >= 400) {
			return;
		}
		@Pc(11) Class362 local11 = arg0.aClass362_1;
		@Pc(21) String local21 = arg0.aString34;
		if (local11.lb != null) {
			local11 = local11.method8641(Static188.aClass238_1);
			if (local11 == null) {
				return;
			}
			local21 = local11.aString115;
		}
		if (!local11.aBoolean698) {
			return;
		}
		if (arg0.anInt2817 != 0) {
			@Pc(60) String local60 = Static161.aClass80_6 == Static480.aClass80_10 ? Static21.aClass21_29.method324(Static26.anInt352) : Static21.aClass21_27.method324(Static26.anInt352);
			local21 = local21 + Static153.method2229(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338, arg0.anInt2817) + " (" + local60 + arg0.anInt2817 + ")";
		}
		if (Static546.aBoolean727 && !arg1) {
			@Pc(104) Class108 local104 = Static365.anInt6221 == -1 ? null : Static653.aClass104_2.method2173(Static365.anInt6221);
			if ((Static655.anInt10731 & 0x2) != 0 && (local104 == null || local11.method8636(Static365.anInt6221, local104.anInt2348) != local104.anInt2348)) {
				Static258.method4326(Static621.aString117 + " -> <col=ffff00>" + local21, Static529.aString102, false, Static217.anInt4240, (long) arg0.anInt3238, 0, false, true, 60, -1, 0, (long) arg0.anInt3238);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(166) String[] local166 = local11.aStringArray44;
		if (Static289.aBoolean390) {
			local166 = Static487.method7354(local166);
		}
		if (local166 == null) {
			return;
		}
		for (@Pc(179) int local179 = local166.length - 1; local179 >= 0; local179--) {
			if (local166[local179] != null && (local11.aByte123 == 0 || !local166[local179].equalsIgnoreCase(Static21.aClass21_22.method324(Static26.anInt352)) && !local166[local179].equalsIgnoreCase(Static21.aClass21_21.method324(Static26.anInt352)))) {
				@Pc(216) short local216 = 0;
				@Pc(218) int local218 = Static179.anInt2917;
				if (local179 == 0) {
					local216 = 45;
				}
				if (local179 == 1) {
					local216 = 52;
				}
				if (local179 == 2) {
					local216 = 21;
				}
				if (local179 == 3) {
					local216 = 25;
				}
				if (local179 == 4) {
					local216 = 57;
				}
				if (local11.anInt10071 == local179) {
					local218 = local11.anInt10062;
				}
				if (local179 == 5) {
					local216 = 1003;
				}
				if (local179 == local11.anInt10095) {
					local218 = local11.anInt10077;
				}
				Static258.method4326("<col=ffff00>" + local21, local166[local179], false, local166[local179].equalsIgnoreCase(Static21.aClass21_22.method324(Static26.anInt352)) ? local11.anInt10102 : local218, (long) arg0.anInt3238, 0, false, true, local216, -1, 0, (long) arg0.anInt3238);
			}
		}
		if (local11.aByte123 != 1) {
			return;
		}
		for (@Pc(323) int local323 = 0; local323 < local166.length; local323++) {
			if (local166[local323] != null && (local166[local323].equalsIgnoreCase(Static21.aClass21_22.method324(Static26.anInt352)) || local166[local323].equalsIgnoreCase(Static21.aClass21_21.method324(Static26.anInt352)))) {
				@Pc(352) short local352 = 0;
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338 < arg0.anInt2817) {
					local352 = 2000;
				}
				@Pc(365) short local365 = 0;
				@Pc(367) int local367 = Static179.anInt2917;
				if (local323 == 0) {
					local365 = 45;
				}
				if (local323 == 1) {
					local365 = 52;
				}
				if (local323 == 2) {
					local365 = 21;
				}
				if (local323 == 3) {
					local365 = 25;
				}
				if (local323 == 4) {
					local365 = 57;
				}
				if (local323 == 5) {
					local365 = 1003;
				}
				if (local365 != 0) {
					local365 += local352;
				}
				if (local323 == local11.anInt10071) {
					local367 = local11.anInt10062;
				}
				if (local323 == local11.anInt10095) {
					local367 = local11.anInt10077;
				}
				Static258.method4326("<col=ffff00>" + local21, local166[local323], false, local166[local323].equalsIgnoreCase(Static21.aClass21_22.method324(Static26.anInt352)) ? local11.anInt10102 : local367, (long) arg0.anInt3238, 0, false, true, local365, -1, 0, (long) arg0.anInt3238);
			}
		}
		return;
	}
}
