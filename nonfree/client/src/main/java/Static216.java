import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
	public static int anInt4414 = 0;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIILclient!cg;)V")
	public static void method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub9 arg3) {
		arg3.aClass3_Sub7_Sub1_1.method6495(arg2);
		arg3.aClass3_Sub7_Sub1_1.method6528(arg1);
		arg3.aClass3_Sub7_Sub1_1.method6528(arg0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	public static void method3755() {
		Static35.aClass183_3.method4790();
		Static78.aClass183_6.method4790();
		@Pc(18) int local18;
		for (@Pc(14) Class3_Sub40 local14 = (Class3_Sub40) Static342.aClass183_44.method4795(); local14 != null; local14 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			local18 = local14.anInt7324;
			if (local18 < 1000) {
				local14.method8412();
				if (local18 == 19 || local18 == 60 || local18 == 22 || local18 == 21 || local18 == 6 || local18 == 17 || local18 == 50) {
					Static78.aClass183_6.method4792(local14);
				} else {
					Static35.aClass183_3.method4792(local14);
				}
			}
		}
		Static35.aClass183_3.method4789(Static342.aClass183_44);
		Static78.aClass183_6.method4789(Static342.aClass183_44);
		if (Static309.anInt6170 <= 1) {
			Static201.aClass3_Sub40_3 = null;
		} else if (Static42.aBoolean85 && Static212.aClass193_1.method6323(81) && Static309.anInt6170 > 2) {
			Static201.aClass3_Sub40_3 = (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287.aClass3_287;
		} else {
			Static201.aClass3_Sub40_3 = (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287;
		}
		local18 = -1;
		@Pc(123) Class3_Sub21 local123 = (Class3_Sub21) Static283.aClass183_38.method4795();
		if (local123 != null) {
			local18 = local123.method3914();
		}
		if (!Static256.aBoolean474) {
			if (local18 == 0 && (Static539.anInt9736 == 1 && Static309.anInt6170 > 2 || Static392.method6253())) {
				local18 = 2;
			}
			if (local18 == 2 && Static309.anInt6170 > 0 && local123 != null) {
				if (Static360.aClass305_3 == null && Static510.anInt9429 == 0) {
					Static129.method8417(local123.method3916(), local123.method3917());
				} else {
					Static470.anInt8805 = 2;
				}
			}
			if (local18 == 0 && Static309.anInt6170 > 0) {
				Static507.method7613();
			}
			if (Static360.aClass305_3 == null && Static510.anInt9429 == 0) {
				Static470.anInt8805 = 0;
				Static378.aClass3_Sub40_12 = null;
				return;
			}
			return;
		}
		@Pc(206) int local206;
		@Pc(210) int local210;
		if (local18 == -1) {
			local206 = Static258.aClass116_1.method8249();
			local210 = Static258.aClass116_1.method8250();
			if (local206 < Static386.anInt7409 - 10 || Static386.anInt7409 + Static277.anInt5863 + 10 < local206 || local210 < Static489.anInt9112 - 10 || local210 > Static489.anInt9112 + Static344.anInt6998 + 10) {
				Static564.method8126();
			}
		}
		if (local18 != 0) {
			return;
		}
		local206 = Static386.anInt7409;
		local210 = Static489.anInt9112;
		@Pc(257) int local257 = Static277.anInt5863;
		@Pc(261) int local261 = local123.method3917();
		@Pc(265) int local265 = local123.method3916();
		@Pc(267) int local267 = -1;
		@Pc(284) int local284;
		for (@Pc(269) int local269 = 0; local269 < Static309.anInt6170; local269++) {
			if (Static254.aBoolean661) {
				local284 = (Static309.anInt6170 - local269 - 1) * 16 + local210 + 33;
				if (local206 < local261 && local206 + local257 > local261 && local265 > local284 - 13 && local284 + 4 > local265) {
					local267 = local269;
				}
			} else {
				local284 = local210 + (Static309.anInt6170 + -1 + -local269) * 16 + 31;
				if (local261 > local206 && local206 + local257 > local261 && local265 > local284 - 13 && local284 + 3 > local265) {
					local267 = local269;
				}
			}
		}
		if (local267 != -1) {
			local284 = 0;
			@Pc(375) Class327 local375 = new Class327(Static342.aClass183_44);
			for (@Pc(382) Class3_Sub40 local382 = (Class3_Sub40) local375.method7867(); local382 != null; local382 = (Class3_Sub40) local375.method7864()) {
				if (local267 == local284) {
					Static237.method4128(local265, local261, local382);
				}
				local284++;
			}
		}
		Static564.method8126();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method3756(@OriginalArg(1) Class55_Sub6 arg0) {
		arg0.aClass2_1 = null;
		@Pc(10) int local10 = arg0.aClass55_Sub3Array1.length;
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			arg0.aClass55_Sub3Array1[local16].aBoolean304 = false;
		}
		@Pc(33) Class134[] local33 = Class2.aClass134Array24;
		synchronized (Class2.aClass134Array24) {
			if (Class2.aClass134Array24.length > local10 && Static380.anIntArray474[local10] < 200) {
				Class2.aClass134Array24[local10].method3236(arg0);
				@Pc(56) int local56 = Static380.anIntArray474[local10]++;
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)V")
	public static void method3757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub4_1 != null) {
			local7.aClass2_Sub4_1 = null;
		}
		if (local7.aClass2_Sub4_2 != null) {
			local7.aClass2_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "(I)I")
	public static int method3759() {
		if (Static578.aFrame2 == null) {
			return Static535.aBoolean812 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
