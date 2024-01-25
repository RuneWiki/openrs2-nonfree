import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "B")
	public static byte aByte147;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "Lclient!fea;")
	public static final Class104 aClass104_9 = new Class104("LIVE", "", "", 0);

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "Lclient!vq;")
	public static final Class378 aClass378_4 = new Class378();

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "Lclient!daa;")
	public static final Class60 aClass60_6 = new Class60();

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!gga;I)Ljava/lang/String;")
	public static String method8827(@OriginalArg(0) Class6_Sub23 arg0) {
		return Static595.method8194(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIII)V")
	public static void method8828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class6_Sub35 local6 = (Class6_Sub35) Static130.aClass362_12.method8538(); local6 != null; local6 = (Class6_Sub35) Static130.aClass362_12.method8530()) {
			Static1.method6463(arg3, local6, arg1, arg2, arg0);
		}
		@Pc(196) boolean local196;
		for (@Pc(38) Class6_Sub35 local38 = (Class6_Sub35) Static247.aClass362_20.method8538(); local38 != null; local38 = (Class6_Sub35) Static247.aClass362_20.method8530()) {
			@Pc(42) byte local42 = 1;
			@Pc(47) Class389 local47 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.method4317();
			if (local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == -1 || local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.aBoolean331) {
				local42 = 0;
			} else if (local47.anInt10709 == local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 || local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == local47.anInt10722 || local47.anInt10714 == local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 || local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == local47.anInt10688) {
				local42 = 2;
			} else if (local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == local47.anInt10710 || local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == local47.anInt10697 || local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112 == local47.anInt10730 || local47.anInt10723 == local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt5112) {
				local42 = 3;
			}
			if (local38.anInt5737 != local42) {
				@Pc(140) int local140 = Static639.method8742(local38.aClass2_Sub1_Sub1_Sub3_Sub2_1);
				@Pc(144) Class91 local144 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass91_1;
				if (local144.anIntArray140 != null) {
					local144 = local144.method2036(Static659.aClass363_3);
				}
				if (local144 == null || local140 == -1) {
					local38.aBoolean375 = false;
					local38.anInt5737 = local42;
					local38.anInt5742 = -1;
				} else if (local140 == local38.anInt5742 && local38.aBoolean375 == local144.aBoolean148) {
					local38.anInt5737 = local42;
					local38.anInt5738 = local144.anInt2369;
				} else {
					local196 = false;
					if (local38.aClass6_Sub8_Sub5_2 == null) {
						local196 = true;
					} else {
						local38.anInt5738 -= 512;
						if (local38.anInt5738 <= 0) {
							Static106.aClass6_Sub8_Sub3_2.method4258(local38.aClass6_Sub8_Sub5_2);
							local38.aClass6_Sub8_Sub5_2 = null;
							local196 = true;
						}
					}
					if (local196) {
						local38.anInt5742 = local140;
						local38.anInt5737 = local42;
						local38.anInt5738 = local144.anInt2369;
						local38.aClass6_Sub21_Sub1_3 = null;
						local38.aBoolean375 = local144.aBoolean148;
						local38.aClass6_Sub46_1 = null;
					}
				}
			}
			local38.anInt5741 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt10006;
			local38.anInt5752 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt10006 + (local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.method4326() << 8);
			local38.anInt5740 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt10001;
			local38.anInt5751 = local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt10001 + (local38.aClass2_Sub1_Sub1_Sub3_Sub2_1.method4326() << 8);
			Static1.method6463(arg3, local38, arg1, arg2, arg0);
		}
		for (@Pc(301) Class6_Sub35 local301 = (Class6_Sub35) Static429.aClass209_52.method5037(); local301 != null; local301 = (Class6_Sub35) Static429.aClass209_52.method5036()) {
			@Pc(305) byte local305 = 1;
			@Pc(310) Class389 local310 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.method4317();
			if (local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 == -1 || local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.aBoolean331) {
				local305 = 0;
			} else if (local310.anInt10709 == local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 || local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 == local310.anInt10722 || local310.anInt10714 == local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 || local310.anInt10688 == local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112) {
				local305 = 2;
			} else if (local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 == local310.anInt10710 || local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 == local310.anInt10697 || local310.anInt10730 == local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112 || local310.anInt10723 == local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt5112) {
				local305 = 3;
			}
			if (local305 != local301.anInt5737) {
				@Pc(411) int local411 = Static120.method1886(local301.aClass2_Sub1_Sub1_Sub3_Sub1_1);
				if (local301.anInt5742 == local411 && local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.aBoolean256 == local301.aBoolean375) {
					local301.anInt5738 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt4174;
					local301.anInt5737 = local305;
				} else {
					local196 = false;
					if (local301.aClass6_Sub8_Sub5_2 == null) {
						local196 = true;
					} else {
						local301.anInt5738 -= 512;
						if (local301.anInt5738 <= 0) {
							Static106.aClass6_Sub8_Sub3_2.method4258(local301.aClass6_Sub8_Sub5_2);
							local196 = true;
							local301.aClass6_Sub8_Sub5_2 = null;
						}
					}
					if (local196) {
						local301.aBoolean375 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.aBoolean256;
						local301.anInt5737 = local305;
						local301.aClass6_Sub46_1 = null;
						local301.anInt5738 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt4174;
						local301.anInt5742 = local411;
						local301.aClass6_Sub21_Sub1_3 = null;
					}
				}
			}
			local301.anInt5741 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt10006;
			local301.anInt5752 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt10006 + (local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.method4326() << 8);
			local301.anInt5740 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt10001;
			local301.anInt5751 = local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt10001 + (local301.aClass2_Sub1_Sub1_Sub3_Sub1_1.method4326() << 8);
			Static1.method6463(arg3, local301, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)V")
	public static void method8830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static528.aFloat40 > Static528.aFloat39) {
			Static528.aFloat39 = (float) ((double) Static528.aFloat39 + (double) Static528.aFloat39 / 30.0D);
			if (Static528.aFloat39 > Static528.aFloat40) {
				Static528.aFloat39 = Static528.aFloat40;
			}
			Static524.method7853();
			Static528.anInt5356 = (int) Static528.aFloat39 >> 1;
			Static528.aByteArrayArrayArray6 = Static292.method4192(Static528.anInt5356);
		} else if (Static528.aFloat40 < Static528.aFloat39) {
			Static528.aFloat39 = (float) ((double) Static528.aFloat39 - (double) Static528.aFloat39 / 30.0D);
			if (Static528.aFloat39 < Static528.aFloat40) {
				Static528.aFloat39 = Static528.aFloat40;
			}
			Static524.method7853();
			Static528.anInt5356 = (int) Static528.aFloat39 >> 1;
			Static528.aByteArrayArrayArray6 = Static292.method4192(Static528.anInt5356);
		}
		if (Static428.anInt7352 != -1 && Static360.anInt9757 != -1) {
			@Pc(81) int local81 = Static428.anInt7352 - Static417.anInt7258;
			if (local81 < 2 || local81 > 2) {
				local81 /= 8;
			}
			@Pc(98) int local98 = Static360.anInt9757 - Static490.anInt8337;
			Static417.anInt7258 += local81;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			if (local81 == 0 && local98 == 0) {
				Static360.anInt9757 = -1;
				Static428.anInt7352 = -1;
			}
			Static490.anInt8337 -= -local98;
			Static524.method7853();
		}
		if (Static30.anInt677 <= 0) {
			Static645.anInt10427 = -1;
			Static64.anInt1190 = -1;
		} else {
			Static600.anInt9797--;
			if (Static600.anInt9797 == 0) {
				Static600.anInt9797 = 100;
				Static30.anInt677--;
			}
		}
		if (!Static154.aBoolean161 || Static473.aClass362_54 == null) {
			return;
		}
		for (@Pc(170) Class6_Sub13 local170 = (Class6_Sub13) Static473.aClass362_54.method8538(); local170 != null; local170 = (Class6_Sub13) Static473.aClass362_54.method8530()) {
			@Pc(179) Class318 local179 = Static528.aClass280_3.method6911(local170.aClass6_Sub24_1.anInt3909);
			if (local170.method1651(arg0, arg1)) {
				if (local179.aStringArray54 != null) {
					if (local179.aStringArray54[4] != null) {
						Static200.method2916((long) local170.aClass6_Sub24_1.anInt3909, local179.aStringArray54[4], 0, false, (long) local170.aClass6_Sub24_1.anInt3909, local179.aString121, 1006, -1, -1, true, local179.anInt8700, false);
					}
					if (local179.aStringArray54[3] != null) {
						Static200.method2916((long) local170.aClass6_Sub24_1.anInt3909, local179.aStringArray54[3], 0, false, (long) local170.aClass6_Sub24_1.anInt3909, local179.aString121, 1009, -1, -1, true, local179.anInt8700, false);
					}
					if (local179.aStringArray54[2] != null) {
						Static200.method2916((long) local170.aClass6_Sub24_1.anInt3909, local179.aStringArray54[2], 0, false, (long) local170.aClass6_Sub24_1.anInt3909, local179.aString121, 1007, -1, -1, true, local179.anInt8700, false);
					}
					if (local179.aStringArray54[1] != null) {
						Static200.method2916((long) local170.aClass6_Sub24_1.anInt3909, local179.aStringArray54[1], 0, false, (long) local170.aClass6_Sub24_1.anInt3909, local179.aString121, 1002, -1, -1, true, local179.anInt8700, false);
					}
					if (local179.aStringArray54[0] != null) {
						Static200.method2916((long) local170.aClass6_Sub24_1.anInt3909, local179.aStringArray54[0], 0, false, (long) local170.aClass6_Sub24_1.anInt3909, local179.aString121, 1012, -1, -1, true, local179.anInt8700, false);
					}
				}
				if (!local170.aClass6_Sub24_1.aBoolean235) {
					local170.aClass6_Sub24_1.aBoolean235 = true;
					Static295.method4225(Static2.aClass357_28, local170.aClass6_Sub24_1.anInt3909, local179.anInt8700);
				}
				if (local170.aClass6_Sub24_1.aBoolean235) {
					Static295.method4225(Static97.aClass357_7, local170.aClass6_Sub24_1.anInt3909, local179.anInt8700);
				}
			} else if (local170.aClass6_Sub24_1.aBoolean235) {
				local170.aClass6_Sub24_1.aBoolean235 = false;
				Static295.method4225(Static302.aClass357_19, local170.aClass6_Sub24_1.anInt3909, local179.anInt8700);
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(FFBF)F")
	public static float method8831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg1 - arg2) * arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8832(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local8 + local10);
		for (@Pc(50) int local50 = 0; local50 < local8; local50++) {
			@Pc(56) char local56 = arg0.charAt(local50);
			if (local56 == '<') {
				local43.append("<lt>");
			} else if (local56 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local56);
			}
		}
		return local43.toString();
	}
}
