import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!an;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array13;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
	public static boolean method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static309.anInt5902; local1++) {
			@Pc(6) Class142 local6 = Static77.aClass142Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4255 == 1) {
				local15 = local6.anInt4249 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4253 + (local6.anInt4240 * local15 >> 8);
					local37 = local6.anInt4263 + (local6.anInt4258 * local15 >> 8);
					local47 = local6.anInt4254 + (local6.anInt4261 * local15 >> 8);
					local57 = local6.anInt4242 + (local6.anInt4260 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4255 == 2) {
				local15 = arg0 - local6.anInt4249;
				if (local15 > 0) {
					local27 = local6.anInt4253 + (local6.anInt4240 * local15 >> 8);
					local37 = local6.anInt4263 + (local6.anInt4258 * local15 >> 8);
					local47 = local6.anInt4254 + (local6.anInt4261 * local15 >> 8);
					local57 = local6.anInt4242 + (local6.anInt4260 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4255 == 3) {
				local15 = local6.anInt4253 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4249 + (local6.anInt4256 * local15 >> 8);
					local37 = local6.anInt4262 + (local6.anInt4257 * local15 >> 8);
					local47 = local6.anInt4254 + (local6.anInt4261 * local15 >> 8);
					local57 = local6.anInt4242 + (local6.anInt4260 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4255 == 4) {
				local15 = arg2 - local6.anInt4253;
				if (local15 > 0) {
					local27 = local6.anInt4249 + (local6.anInt4256 * local15 >> 8);
					local37 = local6.anInt4262 + (local6.anInt4257 * local15 >> 8);
					local47 = local6.anInt4254 + (local6.anInt4261 * local15 >> 8);
					local57 = local6.anInt4242 + (local6.anInt4260 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4255 == 5) {
				local15 = arg1 - local6.anInt4254;
				if (local15 > 0) {
					local27 = local6.anInt4249 + (local6.anInt4256 * local15 >> 8);
					local37 = local6.anInt4262 + (local6.anInt4257 * local15 >> 8);
					local47 = local6.anInt4253 + (local6.anInt4240 * local15 >> 8);
					local57 = local6.anInt4263 + (local6.anInt4258 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!bi;B)V")
	public static void method4226(@OriginalArg(0) Class26 arg0) {
		if (Static286.anInt5635 == arg0.anInt549) {
			Static276.aBooleanArray27[arg0.anInt571] = true;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)Lclient!kk;")
	public static Class122 method4227(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static266.aClass103_54;
		@Pc(14) Class122 local14;
		synchronized (Static266.aClass103_54) {
			local14 = (Class122) Static266.aClass103_54.method2682((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static221.aClass180_56.method4560(Static48.method4684(arg0), Static50.method1092(arg0));
		local14 = new Class122();
		local14.anInt3534 = arg0;
		if (local34 != null) {
			local14.method3238(new Class7_Sub3(local34));
		}
		local14.method3224();
		if (local14.aBoolean266) {
			local14.anInt3570 = 0;
			local14.aBoolean270 = false;
		}
		if (!Static256.aBoolean362 && local14.aBoolean273) {
			local14.anIntArray480 = null;
			local14.aStringArray33 = null;
		}
		@Pc(80) Class103 local80 = Static266.aClass103_54;
		synchronized (Static266.aClass103_54) {
			Static266.aClass103_54.method2687(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method4229() {
		Static126.method2605();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static327.aClass149Array1[local11].method3954();
		}
		Static168.method3213();
		Static143.method3641();
		System.gc();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!pe;)V")
	public static void method4230(@OriginalArg(1) Class89 arg0) {
		@Pc(7) int local7 = Static279.anInt6648;
		@Pc(9) int local9 = Static263.anInt5172;
		@Pc(11) int local11 = Static220.anInt4389;
		@Pc(15) int local15 = Static343.anInt6507 - 3;
		if (Static121.aClass52_11 == null || Static252.aClass52_28 == null) {
			if (Static312.aClass180_89.method4562(Static171.anInt3574) && Static312.aClass180_89.method4562(Static182.anInt3706)) {
				Static121.aClass52_11 = arg0.method5411(Static358.method1307(Static312.aClass180_89, Static171.anInt3574, 0));
				@Pc(44) Class56 local44 = Static358.method1307(Static312.aClass180_89, Static182.anInt3706, 0);
				Static252.aClass52_28 = arg0.method5411(local44);
				local44.method1317();
				Static203.aClass52_21 = arg0.method5411(local44);
			} else {
				arg0.method5439(local7, local9, local11, 20, 255 - Static256.anInt4945 << 24 | Static243.anInt4806, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static121.aClass52_11 != null && Static252.aClass52_28 != null) {
			local88 = (local11 - Static252.aClass52_28.method4124() * 2) / Static121.aClass52_11.method4124();
			for (local90 = 0; local90 < local88; local90++) {
				Static121.aClass52_11.method4123(local7 + Static252.aClass52_28.method4124() + Static121.aClass52_11.method4124() * local90, local9);
			}
			Static252.aClass52_28.method4123(local7, local9);
			Static203.aClass52_21.method4123(local7 + local11 - Static203.aClass52_21.method4124(), local9);
		}
		Static149.aClass94_19.method5692(local7 + 3, Static256.anInt4948 | 0xFF000000, Static254.aString312, local9 + 14, -1);
		arg0.method5439(local7, local9 + 20, local11, local15 - 20, 255 - Static256.anInt4945 << 24 | Static243.anInt4806, 1);
		local88 = Static240.anInt6396;
		local90 = Static100.anInt2436;
		@Pc(180) int local180;
		for (@Pc(163) int local163 = 0; local163 < Static33.anInt735; local163++) {
			local180 = local9 + (Static33.anInt735 + -1 + -local163) * 16 + 20 + 13;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local180 - 13 && local180 + 3 > local90) {
				arg0.method5439(local7, local180 - 12, local11, 16, Static282.anInt5545 | 255 - Static171.anInt3564 << 24, 1);
			}
		}
		if ((Static229.aClass52_25 == null || Static352.aClass52_31 == null || Static144.aClass52_13 == null) && Static312.aClass180_89.method4562(Static205.anInt4084) && Static312.aClass180_89.method4562(Static247.anInt4895) && Static312.aClass180_89.method4562(Static315.anInt6039)) {
			@Pc(262) Class56 local262 = Static358.method1307(Static312.aClass180_89, Static247.anInt4895, 0);
			Static352.aClass52_31 = arg0.method5411(local262);
			local262.method1317();
			Static180.aClass52_19 = arg0.method5411(local262);
			Static229.aClass52_25 = arg0.method5411(Static358.method1307(Static312.aClass180_89, Static205.anInt4084, 0));
			@Pc(287) Class56 local287 = Static358.method1307(Static312.aClass180_89, Static315.anInt6039, 0);
			Static144.aClass52_13 = arg0.method5411(local287);
			local287.method1317();
			Static143.aClass52_23 = arg0.method5411(local287);
		}
		@Pc(355) int local355;
		@Pc(357) int local357;
		if (Static229.aClass52_25 != null && Static352.aClass52_31 != null && Static144.aClass52_13 != null) {
			local180 = (local11 - Static144.aClass52_13.method4124() * 2) / Static229.aClass52_25.method4124();
			for (@Pc(318) int local318 = 0; local318 < local180; local318++) {
				Static229.aClass52_25.method4123(Static144.aClass52_13.method4124() + local7 + Static229.aClass52_25.method4124() * local318, local9 - -local15 - Static229.aClass52_25.method4134());
			}
			local355 = (local15 - Static144.aClass52_13.method4134() - 20) / Static352.aClass52_31.method4134();
			for (local357 = 0; local357 < local355; local357++) {
				Static352.aClass52_31.method4123(local7, local357 * Static352.aClass52_31.method4134() + local9 + 20);
				Static180.aClass52_19.method4123(local11 + local7 - Static180.aClass52_19.method4124(), local357 * Static352.aClass52_31.method4134() + local9 - -20);
			}
			Static144.aClass52_13.method4123(local7, local15 + local9 - Static144.aClass52_13.method4134());
			Static143.aClass52_23.method4123(local11 + local7 - Static144.aClass52_13.method4124(), -Static144.aClass52_13.method4134() + local9 + local15);
		}
		local180 = 0;
		for (@Pc(428) Class7_Sub32 local428 = (Class7_Sub32) Static76.aClass74_8.method1793(); local428 != null; local428 = (Class7_Sub32) Static76.aClass74_8.method1798()) {
			local355 = (Static33.anInt735 - local180 - 1) * 16 + local9 + 13 + 20;
			local357 = Static256.anInt4948 | 0xFF000000;
			if (local7 < local88 && local88 < local7 + local11 && local90 > local355 - 13 && local355 + 3 > local90) {
				local357 = Static130.anInt2840 | 0xFF000000;
			}
			@Pc(489) int[] local489 = null;
			if (Static342.method5546(local428.anInt5229)) {
				local489 = Static17.method4472((int) local428.aLong169).anIntArray552;
			} else if (Static259.method4349(local428.anInt5229)) {
				@Pc(515) Class22_Sub2_Sub1_Sub2 local515 = Static69.aClass22_Sub2_Sub1_Sub2Array1[(int) local428.aLong169];
				if (local515 != null) {
					local489 = local515.aClass174_1.anIntArray669;
				}
			} else if (Static43.method933(local428.anInt5229)) {
				if (local428.anInt5229 == 1009) {
					local489 = method4227((int) local428.aLong169).anIntArray480;
				} else {
					local489 = method4227((int) (local428.aLong169 >>> 32 & 0x7FFFFFFFL)).anIntArray480;
				}
			}
			@Pc(554) String local554 = Static24.method422(local428);
			if (local489 != null) {
				local554 = local554 + Static132.method2666(local489);
			}
			Static149.aClass94_19.method5689(Static214.aClass52Array12, local554, local357, local355, local7 + 3, Static130.anIntArray376, 0);
			local180++;
		}
		Static262.method4381(Static343.anInt6507, Static220.anInt4389, Static279.anInt6648, Static263.anInt5172);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lclient!bi;")
	public static Class26 method4231(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static298.aClass26ArrayArray1[local7] == null || Static298.aClass26ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static264.method4436(local7);
			if (!local25) {
				return null;
			}
		}
		return Static298.aClass26ArrayArray1[local7][local11];
	}
}
