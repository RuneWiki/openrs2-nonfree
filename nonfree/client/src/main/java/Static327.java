import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "D")
	public static double aDouble8 = -1.0D;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	public static void method4636(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static39.anInt1015 = arg2;
		Static165.anInt3454 = 2;
		Static24.method500(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!za;IILclient!ec;I)V")
	public static void method4637(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class24 local10 = arg2.method1579(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ba(arg1, arg3, arg2.anInt2107 + arg1, arg2.anInt2149 + arg3);
		if (Static336.anInt6157 == 2 || Static336.anInt6157 == 5 || Static25.aClass137_1 == null) {
			arg0.ra(-16777216, local10, arg1, arg3);
			return;
		}
		@Pc(59) int local59;
		@Pc(56) int local56;
		@Pc(67) int local67;
		@Pc(53) int local53;
		if (Static21.anInt6762 == 4) {
			local56 = Static459.anInt7963;
			local53 = 4096;
			local67 = (int) -Static267.aFloat83 & 0x3FFF;
			local59 = Static224.anInt7016;
		} else {
			local53 = 4096 - Static135.anInt3022 * 16;
			local56 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
			local59 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490;
			local67 = (int) -Static267.aFloat83 + Static217.anInt4366 & 0x3FFF;
		}
		@Pc(94) int local94 = local59 / 32 + 208 + 48 - Static209.anInt4283 * 2;
		@Pc(111) int local111 = Static211.anInt4295 * 4 + 48 - local56 / 32 - (Static211.anInt4295 - 104) * 2;
		Static25.aClass137_1.method5706((float) arg1 + (float) arg2.anInt2107 / 2.0F, (float) arg3 + (float) arg2.anInt2149 / 2.0F, (float) local94, (float) local111, local53, local67 << 2, local10, arg1, arg3);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class1_Sub33 local145 = (Class1_Sub33) Static381.aClass203_50.method4548(); local145 != null; local145 = (Class1_Sub33) Static381.aClass203_50.method4545()) {
			@Pc(150) int local150 = local145.anInt5633;
			local162 = (Static90.aClass121_1.anIntArray378[local150] >> 14 & 0x3FFF) - Static278.anInt5374;
			local172 = (Static90.aClass121_1.anIntArray378[local150] & 0x3FFF) - Static380.anInt6896;
			local183 = local162 * 4 + 2 - local59 / 32;
			local194 = local172 * 4 + 2 - local56 / 32;
			Static344.method4862(local194, arg3, arg1, arg0, local183, arg2, local10, Static90.aClass121_1.anIntArray379[local150]);
		}
		for (local162 = 0; local162 < Static60.anInt1602; local162++) {
			local172 = Static372.anIntArray628[local162] * 4 + 2 - local59 / 32;
			local183 = Static388.anIntArray675[local162] * 4 + 2 - local56 / 32;
			@Pc(249) Class192 local249 = Static455.aClass161_4.method3628(Static61.anIntArray145[local162]);
			if (local249.anIntArray532 != null) {
				local249 = local249.method4369(Static366.aClass190_1);
				if (local249 == null || local249.anInt5687 == -1) {
					continue;
				}
			}
			Static344.method4862(local183, arg3, arg1, arg0, local172, arg2, local10, local249.anInt5687);
		}
		@Pc(332) int local332;
		@Pc(342) int local342;
		for (@Pc(286) Class1_Sub14 local286 = (Class1_Sub14) Static156.aClass38_16.method767(); local286 != null; local286 = (Class1_Sub14) Static156.aClass38_16.method773()) {
			local183 = (int) (local286.aLong228 >> 28 & 0x3L);
			if (local183 == Static348.anInt6432) {
				local194 = (int) (local286.aLong228 & 0x3FFFL) - Static278.anInt5374;
				@Pc(322) int local322 = (int) (local286.aLong228 >> 14 & 0x3FFFL) - Static380.anInt6896;
				local332 = local194 * 4 + 2 - local59 / 32;
				local342 = local322 * 4 + 2 - local56 / 32;
				Static16.method313(arg1, local332, arg3, Static73.aClass137Array4[0], local10, local342, arg2);
			}
		}
		@Pc(432) int local432;
		for (local183 = 0; local183 < Static197.anInt4078; local183++) {
			@Pc(373) Class1_Sub27 local373 = (Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local183]);
			if (local373 != null) {
				@Pc(378) Class30_Sub1_Sub1_Sub1 local378 = local373.aClass30_Sub1_Sub1_Sub1_2;
				if (local378.method673() && Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local378.aByte102) {
					@Pc(394) Class11 local394 = local378.aClass11_1;
					if (local394 != null && local394.anIntArray12 != null) {
						local394 = local394.method136(Static366.aClass190_1);
					}
					if (local394 != null && local394.aBoolean13 && local394.aBoolean11) {
						local342 = local378.anInt7490 / 32 - local59 / 32;
						local432 = local378.anInt7488 / 32 - local56 / 32;
						if (local394.anInt169 == -1) {
							Static16.method313(arg1, local342, arg3, Static73.aClass137Array4[1], local10, local432, arg2);
						} else {
							Static344.method4862(local432, arg3, arg1, arg0, local342, arg2, local10, local394.anInt169);
						}
					}
				}
			}
		}
		local194 = Static180.anInt3908;
		@Pc(468) int[] local468 = Static274.anIntArray500;
		@Pc(512) int local512;
		@Pc(516) int local516;
		@Pc(541) int local541;
		for (local332 = 0; local332 < local194; local332++) {
			@Pc(478) Class30_Sub1_Sub1_Sub2 local478 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local468[local332]];
			if (local478 != null && local478.method961() && Static429.aClass30_Sub1_Sub1_Sub2_2 != local478 && local478.aByte102 == Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) {
				local432 = local478.anInt7490 / 32 - local59 / 32;
				local512 = local478.anInt7488 / 32 - local56 / 32;
				@Pc(514) boolean local514 = false;
				for (local516 = 0; local516 < Static323.anInt5975; local516++) {
					if (local478.aString9.equals(Static169.aStringArray24[local516]) && Static30.anIntArray50[local516] != 0) {
						local514 = true;
						break;
					}
				}
				@Pc(539) boolean local539 = false;
				for (local541 = 0; local541 < Static84.anInt2030; local541++) {
					if (local478.aString9.equals(Static216.aClass186Array1[local541].aString46)) {
						local539 = true;
						break;
					}
				}
				@Pc(561) boolean local561 = false;
				if (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1330 != 0 && local478.anInt1330 != 0 && Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1330 == local478.anInt1330) {
					local561 = true;
				}
				if (local478.aBoolean85) {
					Static16.method313(arg1, local432, arg3, Static73.aClass137Array4[6], local10, local512, arg2);
				} else if (local514) {
					Static16.method313(arg1, local432, arg3, Static73.aClass137Array4[3], local10, local512, arg2);
				} else if (local539) {
					Static16.method313(arg1, local432, arg3, Static73.aClass137Array4[5], local10, local512, arg2);
				} else if (local561) {
					Static16.method313(arg1, local432, arg3, Static73.aClass137Array4[4], local10, local512, arg2);
				} else {
					Static16.method313(arg1, local432, arg3, Static73.aClass137Array4[2], local10, local512, arg2);
				}
			}
		}
		@Pc(659) Class178[] local659 = Static393.aClass178Array1;
		@Pc(741) int local741;
		for (local432 = 0; local432 < local659.length; local432++) {
			@Pc(667) Class178 local667 = local659[local432];
			if (local667 != null && local667.anInt5270 != 0 && Static187.anInt3975 % 20 < 10) {
				@Pc(707) int local707;
				if (local667.anInt5270 == 1) {
					@Pc(692) Class1_Sub27 local692 = (Class1_Sub27) Static24.aClass38_3.method765((long) local667.anInt5275);
					if (local692 != null) {
						@Pc(697) Class30_Sub1_Sub1_Sub1 local697 = local692.aClass30_Sub1_Sub1_Sub1_2;
						local707 = local697.anInt7490 / 32 - local59 / 32;
						local541 = local697.anInt7488 / 32 - local56 / 32;
						Static382.method5277(arg2, arg1, arg3, 360000L, local10, local667.anInt5268, local541, local707);
					}
				}
				if (local667.anInt5270 == 2) {
					local741 = local667.anInt5272 / 32 - local59 / 32;
					local516 = local667.anInt5273 / 32 - local56 / 32;
					@Pc(757) long local757 = (long) (local667.anInt5267 << 5);
					@Pc(761) long local761 = local757 * local757;
					Static382.method5277(arg2, arg1, arg3, local761, local10, local667.anInt5268, local516, local741);
				}
				if (local667.anInt5270 == 10 && local667.anInt5275 >= 0 && Static135.aClass30_Sub1_Sub1_Sub2Array1.length > local667.anInt5275) {
					@Pc(791) Class30_Sub1_Sub1_Sub2 local791 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local667.anInt5275];
					if (local791 != null) {
						local516 = local791.anInt7490 / 32 - local59 / 32;
						local707 = local791.anInt7488 / 32 - local56 / 32;
						Static382.method5277(arg2, arg1, arg3, 360000L, local10, local667.anInt5268, local707, local516);
					}
				}
			}
		}
		if (Static21.anInt6762 == 4) {
			return;
		}
		if (Static270.anInt5251 != 0) {
			local512 = Static270.anInt5251 * 4 + Static429.aClass30_Sub1_Sub1_Sub2_2.method944() * 2 + 2 - local59 / 32 - 2;
			local741 = Static57.anInt1519 * 4 + Static429.aClass30_Sub1_Sub1_Sub2_2.method944() * 2 + 2 - local56 / 32 - 2;
			Static16.method313(arg1, local512, arg3, Static44.aClass137Array13[Static110.aBoolean473 ? 1 : 0], local10, local741, arg2);
		}
		arg0.method5941(arg2.anInt2149 / 2 + arg3 - 1, 3, arg2.anInt2107 / 2 + arg1 - 1, 3, -1);
	}
}
