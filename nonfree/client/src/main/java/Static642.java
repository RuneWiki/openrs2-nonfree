import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public static int anInt10429 = 0;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_120 = new Class387(81, 3);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	public static int anInt10431 = 0;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V")
	public static void method8951() {
		if (Static390.anInt6669 == -1) {
			return;
		}
		@Pc(12) int local12 = Static205.aClass107_1.method4079();
		@Pc(21) int local21 = Static205.aClass107_1.method4072();
		@Pc(26) Class5_Sub6 local26 = (Class5_Sub6) Static536.aClass102_65.method1916();
		if (local26 != null) {
			local12 = local26.method5803();
			local21 = local26.method5804();
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static40.aBoolean61) {
			local38 = Static169.method2467();
			local40 = Static375.method5510();
		}
		Static583.method8400(local40, local40 + Static631.anInt10283, local38, local21, Static70.anInt1125 + local38, local12, local40 + local21, Static390.anInt6669, local38, local38 + local12, local40);
		if (Static93.aClass73_21 != null) {
			Static678.method9310(local12 + local38, local40 + local21);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
	public static void method8952() {
		for (@Pc(14) int local14 = 0; local14 < Static21.anInt322; local14++) {
			@Pc(20) Class50 local20 = Static377.aClass50Array1[local14];
			@Pc(22) boolean local22 = false;
			@Pc(178) int local178;
			if (local20.aClass5_Sub16_Sub3_1 == null) {
				local20.anInt847--;
				if (local20.anInt847 >= (local20.method807() ? -1500 : -10)) {
					if (local20.aByte16 == 1 && local20.aClass206_1 == null) {
						local20.aClass206_1 = Static685.method4947(Static274.aClass208_64, local20.anInt848, 0);
						if (local20.aClass206_1 == null) {
							continue;
						}
						local20.anInt847 += local20.aClass206_1.method4946();
					} else if (local20.method807() && (local20.aClass5_Sub37_1 == null || local20.aClass5_Sub24_Sub1_1 == null)) {
						if (local20.aClass5_Sub37_1 == null) {
							local20.aClass5_Sub37_1 = Static406.method5950(Static307.aClass208_70, local20.anInt848);
						}
						if (local20.aClass5_Sub37_1 == null) {
							continue;
						}
						if (local20.aClass5_Sub24_Sub1_1 == null) {
							local20.aClass5_Sub24_Sub1_1 = local20.aClass5_Sub37_1.method5949(new int[] { 22050 });
							if (local20.aClass5_Sub24_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local20.anInt847 < 0) {
						@Pc(153) int local153 = 8192;
						if (local20.anInt854 == 0) {
							local178 = local20.anInt846 * (local20.aByte16 == 3 ? Static637.aClass5_Sub20_31.aClass24_Sub12_5.method3413() : Static637.aClass5_Sub20_31.aClass24_Sub12_4.method3413()) >> 2;
						} else {
							@Pc(187) int local187 = local20.anInt854 >> 24 & 0x3;
							if (local187 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145) {
								@Pc(198) int local198 = (local20.anInt854 & 0xFF) << 9;
								@Pc(204) int local204 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() << 8;
								@Pc(211) int local211 = local20.anInt854 >> 16 & 0xFF;
								@Pc(222) int local222 = local204 + (local211 << 9) + 256 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
								@Pc(229) int local229 = local20.anInt854 >> 8 & 0xFF;
								@Pc(241) int local241 = (local229 << 9) + local204 + 256 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
								@Pc(249) int local249 = Math.abs(local222) + Math.abs(local241) - 512;
								if (local249 > local198) {
									local20.anInt847 = -99999;
									continue;
								}
								if (local249 < 0) {
									local249 = 0;
								}
								local178 = Static637.aClass5_Sub20_31.aClass24_Sub12_1.method3413() * (local198 - local249) * local20.anInt846 / local198 >> 2;
								if (local20.aClass8_Sub1_7 != null && local20.aClass8_Sub1_7 instanceof Class8_Sub1_Sub3) {
									@Pc(295) Class8_Sub1_Sub3 local295 = (Class8_Sub1_Sub3) local20.aClass8_Sub1_7;
									@Pc(298) short local298 = local295.aShort108;
									@Pc(301) short local301 = local295.aShort109;
								}
								if (local222 != 0 || local241 != 0) {
									@Pc(327) int local327 = -Static159.anInt2475 - (int) (Math.atan2((double) local222, (double) local241) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local327 > 8192) {
										local327 = 16384 - local327;
									}
									@Pc(341) int local341;
									if (local249 <= 0) {
										local341 = 8192;
									} else if (local249 >= 4096) {
										local341 = 16384;
									} else {
										local341 = (8192 - local249) / 4096 + 8192;
									}
									local153 = local341 * local327 / 8192 + (16384 - local341 >> 1);
								}
							} else {
								local178 = 0;
							}
						}
						if (local178 > 0) {
							@Pc(383) Class5_Sub24_Sub1 local383 = null;
							if (local20.aByte16 == 1) {
								local383 = local20.aClass206_1.method4949().method6765(Static90.aClass393_1);
							} else if (local20.method807()) {
								local383 = local20.aClass5_Sub24_Sub1_1;
							}
							@Pc(413) Class5_Sub16_Sub3 local413 = local20.aClass5_Sub16_Sub3_1 = Static688.method6163(local383, local20.anInt851, local178, local153);
							local413.method6140(local20.anInt853 - 1);
							Static91.aClass5_Sub16_Sub1_1.method2555(local413);
						}
					}
				} else {
					local22 = true;
				}
			} else if (!local20.aClass5_Sub16_Sub3_1.method9326()) {
				local22 = true;
			}
			if (local22) {
				Static21.anInt322--;
				for (local178 = local14; local178 < Static21.anInt322; local178++) {
					Static377.aClass50Array1[local178] = Static377.aClass50Array1[local178 + 1];
				}
				local14--;
			}
		}
		if (Static152.aBoolean200 && !Static41.method691(0)) {
			if (Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413() != 0 && Static252.anInt4340 != -1) {
				if (Static57.aClass5_Sub16_Sub4_2 == null) {
					Static335.method5111(Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413(), Static229.aClass208_57, Static252.anInt4340);
				} else {
					Static297.method4393(Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413(), Static57.aClass5_Sub16_Sub4_2, Static252.anInt4340, Static229.aClass208_57);
				}
			}
			Static152.aBoolean200 = false;
			Static57.aClass5_Sub16_Sub4_2 = null;
		} else if (Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413() != 0 && Static252.anInt4340 != -1 && !Static41.method691(0)) {
			@Pc(498) Class5_Sub50 local498 = Static457.method6722(Static427.aClass387_130, Static80.aClass313_1);
			local498.aClass5_Sub23_Sub2_2.method8486(Static252.anInt4340);
			Static494.method7120(local498);
			Static252.anInt4340 = -1;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;C)Ljava/lang/String;")
	public static String method8953(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg0.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local13 += local17;
				local24++;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local13);
		@Pc(48) int local48 = 0;
		while (true) {
			@Pc(60) int local60 = arg0.indexOf(13, local48);
			if (local60 < 0) {
				local46.append(arg0.substring(local48));
				return local46.toString();
			}
			local46.append(arg0.substring(local48, local60));
			local48 = local60 + 1;
			local46.append(arg1);
		}
	}
}
