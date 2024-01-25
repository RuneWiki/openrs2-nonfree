import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!wl;")
	public static Class221 aClass221_102;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	public static int anInt3012;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
	public static final int[] anIntArray243 = new int[32];

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIZI)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static289.anInt4725 == 1) {
			Static10.aClass46Array1[Static172.anInt3886 / 100].method5016(Static125.anInt2668 - 8, Static362.anInt6987 + -8);
		}
		if (Static289.anInt4725 == 2) {
			Static10.aClass46Array1[Static172.anInt3886 / 100 + 4].method5016(Static125.anInt2668 - 8, Static362.anInt6987 + -8);
		}
		Static247.method4395();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!iq;Lclient!iq;I)V")
	public static void method2700(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1) {
		Static19.aClass104_15 = arg1;
		Static20.aClass104_16 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method2701(@OriginalArg(1) Class143 arg0) {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (Static112.aClass143_6 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 + (local16 >> 4 & 0x7);
			local32 = Static333.anInt6460 + (local16 & 0x7);
			local36 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local44 = Static273.aClass2_Sub12_Sub2_3.method3104();
			if (Static198.aClass41_24 != null && local25 >= 0 && local32 >= 0 && Static66.anInt1177 > local25 && local32 < Static12.anInt213) {
				@Pc(85) Class2_Sub20 local85 = (Class2_Sub20) Static198.aClass41_24.method902((long) (local25 | Static189.anInt4142 << 28 | local32 << 14));
				if (local85 != null) {
					for (@Pc(93) Class2_Sub27 local93 = (Class2_Sub27) local85.aClass180_16.method4919(); local93 != null; local93 = (Class2_Sub27) local85.aClass180_16.method4916()) {
						if (local93.anInt4717 == (local36 & 0x7FFF) && local93.anInt4715 == local40) {
							local93.method5723();
							local93.anInt4715 = local44;
							Static44.method5703(local25, local93, Static189.anInt4142, local32);
							break;
						}
					}
					Static364.method5815(local25, local32, Static189.anInt4142);
				}
			}
			return;
		}
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(182) int local182;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (Static272.aClass143_14 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3103();
			local25 = Static273.aClass2_Sub12_Sub2_3.method3099();
			local32 = Static273.aClass2_Sub12_Sub2_3.method3116();
			@Pc(152) byte local152 = Static273.aClass2_Sub12_Sub2_3.method3157();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3146();
			local44 = (local40 >> 4 & 0x7) + Static217.anInt4817;
			local170 = Static333.anInt6460 + (local40 & 0x7);
			@Pc(174) byte local174 = Static273.aClass2_Sub12_Sub2_3.method3145();
			local178 = Static273.aClass2_Sub12_Sub2_3.method3140();
			local182 = local178 >> 2;
			local186 = local178 & 0x3;
			@Pc(190) byte local190 = Static273.aClass2_Sub12_Sub2_3.method3157();
			local194 = Static273.aClass2_Sub12_Sub2_3.method3109();
			@Pc(198) byte local198 = Static273.aClass2_Sub12_Sub2_3.method3157();
			if (!Static51.aClass37_1.method3738()) {
				Static312.method5214(local198, local16, local190, local174, Static189.anInt4142, local194, local25, local152, local32, local182, local170, local44, local186);
			}
			return;
		}
		@Pc(279) int local279;
		if (arg0 == Static308.aClass143_18) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = (local16 >> 4 & 0x7) + Static217.anInt4817;
			local32 = (local16 & 0x7) + Static333.anInt6460;
			local36 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local44 = Static273.aClass2_Sub12_Sub2_3.method3104();
			if (local25 >= 0 && local32 >= 0 && local25 < Static66.anInt1177 && local32 < Static12.anInt213) {
				local170 = local25 * 128 + 64;
				local279 = local32 * 128 + 64;
				@Pc(301) Class1_Sub2_Sub6 local301 = new Class1_Sub2_Sub6(local36, local44, Static6.anInt91, Static189.anInt4142, local170, Static97.method1899(Static189.anInt4142, local279, local170) - local40, local279, local25, local25, local32, local32);
				Static30.aClass180_3.method4909(new Class2_Sub9_Sub9(local301));
			}
			return;
		}
		@Pc(379) int local379;
		@Pc(481) Class1_Sub2_Sub5 local481;
		if (Static317.aClass143_21 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 * 2 + (local16 >> 4 & 0xF);
			local32 = (local16 & 0xF) + Static333.anInt6460 * 2;
			local36 = local25 + Static273.aClass2_Sub12_Sub2_3.method3122();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3122() + local32;
			local44 = Static273.aClass2_Sub12_Sub2_3.method3108();
			local170 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local279 = Static273.aClass2_Sub12_Sub2_3.method3124() * 4;
			local178 = Static273.aClass2_Sub12_Sub2_3.method3124() * 4;
			local182 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local186 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local379 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if (local379 == 255) {
				local379 = -1;
			}
			local194 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if (local25 >= 0 && local32 >= 0 && local25 < Static66.anInt1177 * 2 && Static66.anInt1177 * 2 > local32 && local36 >= 0 && local40 >= 0 && Static12.anInt213 * 2 > local36 && Static12.anInt213 * 2 > local40 && local170 != 65535) {
				local25 *= 64;
				local36 = local36 * 64;
				local32 = local32 * 64;
				local40 *= 64;
				local481 = new Class1_Sub2_Sub5(local170, Static189.anInt4142, local25, local32, Static97.method1899(Static189.anInt4142, local32, local25) - local279, Static6.anInt91 + local182, Static6.anInt91 + local186, local379, local194, local44, local178);
				local481.method3962(local40, Static97.method1899(Static189.anInt4142, local40, local36) - local178, local36, local182 + Static6.anInt91);
				Static129.aClass180_22.method4909(new Class2_Sub9_Sub21(local481));
			}
		} else if (Static45.aClass143_2 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3116();
			if (local16 == 65535) {
				local16 = -1;
			}
			local25 = Static273.aClass2_Sub12_Sub2_3.method3132();
			local32 = (local25 >> 4 & 0x7) + Static217.anInt4817;
			local36 = (local25 & 0x7) + Static333.anInt6460;
			local40 = Static273.aClass2_Sub12_Sub2_3.method3146();
			local44 = local40 >> 2;
			local170 = local40 & 0x3;
			local279 = Static148.anIntArray254[local44];
			Static8.method143(local170, local16, local279, local36, Static189.anInt4142, local32, local44);
		} else if (arg0 == Static315.aClass143_19) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3140();
			local25 = local16 >> 2;
			local32 = local16 & 0x3;
			local36 = Static148.anIntArray254[local25];
			local40 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local44 = (local40 >> 4 & 0x7) + Static217.anInt4817;
			local170 = (local40 & 0x7) + Static333.anInt6460;
			if (local44 >= 0 && local170 >= 0 && Static66.anInt1177 > local44 && local170 < Static12.anInt213) {
				Static115.method2277(local44, local25, local170, local32, Static189.anInt4142, local36, -1);
			}
		} else if (arg0 == Static197.aClass143_11) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3140();
			local25 = local16 >> 2;
			local32 = local16 & 0x3;
			local36 = Static148.anIntArray254[local25];
			local40 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local44 = Static273.aClass2_Sub12_Sub2_3.method3140();
			local170 = (local44 >> 4 & 0x7) + Static217.anInt4817;
			local279 = Static333.anInt6460 + (local44 & 0x7);
			if (local170 >= 0 && local279 >= 0 && local170 < Static66.anInt1177 && local279 < Static12.anInt213) {
				Static115.method2277(local170, local25, local279, local32, Static189.anInt4142, local36, local40);
			}
		} else if (Static64.aClass143_3 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 * 2 + (local16 >> 4 & 0xF);
			local32 = Static333.anInt6460 * 2 + (local16 & 0xF);
			local36 = local25 + Static273.aClass2_Sub12_Sub2_3.method3122();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3122() + local32;
			local44 = Static273.aClass2_Sub12_Sub2_3.method3108();
			local170 = Static273.aClass2_Sub12_Sub2_3.method3108();
			local279 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local178 = Static273.aClass2_Sub12_Sub2_3.method3122();
			local182 = Static273.aClass2_Sub12_Sub2_3.method3124() * 4;
			local186 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local379 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local194 = Static273.aClass2_Sub12_Sub2_3.method3124();
			@Pc(768) int local768 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if (local194 == 255) {
				local194 = -1;
			}
			if (local25 >= 0 && local32 >= 0 && local25 < Static66.anInt1177 * 2 && local32 < Static66.anInt1177 * 2 && local36 >= 0 && local40 >= 0 && Static12.anInt213 * 2 > local36 && local40 < Static12.anInt213 * 2 && local279 != 65535) {
				local40 = local40 * 64;
				local36 = local36 * 64;
				local25 = local25 * 64;
				local32 = local32 * 64;
				if (local44 != 0) {
					@Pc(844) int local844;
					@Pc(852) Class1_Sub2_Sub3 local852;
					@Pc(838) int local838;
					@Pc(848) int local848;
					if (local44 >= 0) {
						local838 = local44 - 1;
						local844 = local838 >> 11 & 0xF;
						local848 = local838 & 0x7FF;
						local852 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local848];
					} else {
						local838 = -local44 - 1;
						local844 = local838 >> 11 & 0xF;
						local848 = local838 & 0x7FF;
						if (local848 == Static217.anInt4819) {
							local852 = Static177.aClass1_Sub2_Sub3_Sub1_1;
						} else {
							local852 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local848];
						}
					}
					if (local852 != null) {
						@Pc(886) Class142 local886 = local852.method5778();
						if (local886.anIntArrayArray43 != null && local886.anIntArrayArray43[local844] != null) {
							local848 = local886.anIntArrayArray43[local844][0];
							@Pc(908) int local908 = local886.anIntArrayArray43[local844][2];
							@Pc(913) int local913 = local852.aClass219_7.method5719();
							@Pc(917) int local917 = Class101.anIntArray234[local913];
							@Pc(921) int local921 = Class101.anIntArray235[local913];
							@Pc(931) int local931 = local908 * local917 + local921 * local848 >> 15;
							@Pc(941) int local941 = local921 * local908 - local917 * local848 >> 15;
							local25 += local931;
							local178 -= local886.anIntArrayArray43[local844][1];
							local32 += local941;
						}
					}
				}
				@Pc(986) Class1_Sub2_Sub5 local986 = new Class1_Sub2_Sub5(local279, Static189.anInt4142, local25, local32, Static97.method1899(Static189.anInt4142, local32, local25) - local178, Static6.anInt91 + local186, local379 + Static6.anInt91, local194, local768, local170, local182);
				local986.method3962(local40, Static97.method1899(Static189.anInt4142, local40, local36) - local182, local36, Static6.anInt91 + local186);
				Static129.aClass180_22.method4909(new Class2_Sub9_Sub21(local986));
			}
		} else if (arg0 == Static13.aClass143_1) {
			Static273.aClass2_Sub12_Sub2_3.method3124();
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 + (local16 >> 4 & 0x7);
			local32 = (local16 & 0x7) + Static333.anInt6460;
			local36 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local40 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local44 = Static273.aClass2_Sub12_Sub2_3.method3163();
			@Pc(1051) String local1051 = Static273.aClass2_Sub12_Sub2_3.method3113();
			Static132.method2563(local40, local25, local32, Static189.anInt4142, local1051, local44, local36);
		} else if (Static307.aClass143_17 == arg0) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 + (local16 >> 4 & 0x7);
			local32 = (local16 & 0x7) + Static333.anInt6460;
			local36 = Static273.aClass2_Sub12_Sub2_3.method3104();
			if (local36 == 65535) {
				local36 = -1;
			}
			local40 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local44 = local40 >> 4 & 0xF;
			local170 = local40 & 0x7;
			local279 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local178 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if (local25 >= 0 && local32 >= 0 && Static66.anInt1177 > local25 && local32 < Static12.anInt213) {
				local182 = local44 + 1;
				if (Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0] >= local25 - local182 && Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0] <= local25 + local182 && Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0] >= local32 - local182 && local182 + local32 >= Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0] && Static46.anInt752 != 0 && local170 > 0 && Static191.anInt4213 < 50 && local36 != -1) {
					Static300.anIntArray461[Static191.anInt4213] = local36;
					Static236.anIntArray88[Static191.anInt4213] = local170;
					Static186.anIntArray310[Static191.anInt4213] = local279;
					Static226.aClass135Array1[Static191.anInt4213] = null;
					Static312.anIntArray478[Static191.anInt4213] = local44 + (local25 << 16) + (Static189.anInt4142 << 24) + (local32 << 8);
					Static241.anIntArray398[Static191.anInt4213] = local178;
					Static191.anInt4213++;
				}
			}
		} else if (arg0 == Static272.aClass143_15) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3109();
			local25 = Static273.aClass2_Sub12_Sub2_3.method3116();
			local32 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local36 = Static273.aClass2_Sub12_Sub2_3.method3132();
			local40 = Static217.anInt4817 + (local36 >> 4 & 0x7);
			local44 = Static333.anInt6460 + (local36 & 0x7);
			if (local40 >= 0 && local44 >= 0 && local40 < Static66.anInt1177 && Static12.anInt213 > local44 && local32 != Static217.anInt4819) {
				Static44.method5703(local40, new Class2_Sub27(local16, local25), Static189.anInt4142, local44);
				Static364.method5815(local40, local44, Static189.anInt4142);
			}
		} else if (arg0 == Static143.aClass143_9) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3099();
			local25 = Static273.aClass2_Sub12_Sub2_3.method3099();
			local32 = Static273.aClass2_Sub12_Sub2_3.method3140();
			local36 = Static217.anInt4817 + (local32 >> 4 & 0x7);
			local40 = (local32 & 0x7) + Static333.anInt6460;
			if (local36 >= 0 && local40 >= 0 && Static66.anInt1177 > local36 && Static12.anInt213 > local40) {
				Static44.method5703(local36, new Class2_Sub27(local16, local25), Static189.anInt4142, local40);
				Static364.method5815(local36, local40, Static189.anInt4142);
			}
		} else if (arg0 == Static164.aClass143_10) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local25 = Static273.aClass2_Sub12_Sub2_3.method3124();
			Static228.method4210(local16).method2005(local25);
		} else if (arg0 == Static190.aClass143_20) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local25 = Static217.anInt4817 + (local16 >> 4 & 0x7);
			local32 = (local16 & 0x7) + Static333.anInt6460;
			local36 = Static273.aClass2_Sub12_Sub2_3.method3122() + local25;
			local40 = Static273.aClass2_Sub12_Sub2_3.method3122() + local32;
			local44 = Static273.aClass2_Sub12_Sub2_3.method3108();
			local170 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local279 = Static273.aClass2_Sub12_Sub2_3.method3124() * 4;
			local178 = Static273.aClass2_Sub12_Sub2_3.method3124() * 4;
			local182 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local186 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local379 = Static273.aClass2_Sub12_Sub2_3.method3124();
			local194 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if (local379 == 255) {
				local379 = -1;
			}
			if (local25 >= 0 && local32 >= 0 && local25 < Static66.anInt1177 && local32 < Static12.anInt213 && local36 >= 0 && local40 >= 0 && Static66.anInt1177 > local36 && local40 < Static12.anInt213 && local170 != 65535) {
				local40 = local40 * 128 + 64;
				local25 = local25 * 128 + 64;
				local32 = local32 * 128 + 64;
				local36 = local36 * 128 + 64;
				local481 = new Class1_Sub2_Sub5(local170, Static189.anInt4142, local25, local32, Static97.method1899(Static189.anInt4142, local32, local25) - local279, Static6.anInt91 + local182, Static6.anInt91 + local186, local379, local194, local44, local178);
				local481.method3962(local40, Static97.method1899(Static189.anInt4142, local40, local36) - local178, local36, local182 + Static6.anInt91);
				Static129.aClass180_22.method4909(new Class2_Sub9_Sub21(local481));
			}
		} else if (arg0 == Static247.aClass143_16) {
			local16 = Static273.aClass2_Sub12_Sub2_3.method3146();
			local25 = Static217.anInt4817 + (local16 >> 4 & 0x7);
			local32 = Static333.anInt6460 + (local16 & 0x7);
			local36 = Static273.aClass2_Sub12_Sub2_3.method3116();
			if (local25 >= 0 && local32 >= 0 && local25 < Static66.anInt1177 && Static12.anInt213 > local32) {
				@Pc(1649) Class2_Sub20 local1649 = (Class2_Sub20) Static198.aClass41_24.method902((long) (local25 | local32 << 14 | Static189.anInt4142 << 28));
				if (local1649 != null) {
					for (@Pc(1657) Class2_Sub27 local1657 = (Class2_Sub27) local1649.aClass180_16.method4919(); local1657 != null; local1657 = (Class2_Sub27) local1649.aClass180_16.method4916()) {
						if (local1657.anInt4717 == (local36 & 0x7FFF)) {
							local1657.method5723();
							break;
						}
					}
					if (local1649.aClass180_16.method4911()) {
						local1649.method5723();
					}
					Static364.method5815(local25, local32, Static189.anInt4142);
				}
			}
		} else {
			Static40.method506("T3 - " + arg0, null);
			Static348.method2469();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2702(@OriginalArg(0) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
	public static boolean method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class74 local7 = Static228.method4210(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local7.method2005(arg0);
	}
}
