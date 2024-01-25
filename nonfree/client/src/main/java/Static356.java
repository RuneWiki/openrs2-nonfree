import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!uu;")
	public static Class250 aClass250_100;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_193 = new Class136(42, 3);

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_181 = new Class163(76, -1);

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Z")
	public static boolean aBoolean488 = true;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public static boolean method5849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static420.method5754(arg1, arg0) || Static314.method4404(arg1, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method5850(@OriginalArg(0) String arg0) {
		return Static170.method2614(arg0, 16);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method5852(@OriginalArg(0) Class183 arg0) {
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(56) int local56;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(109) int local109;
		@Pc(49) boolean local49;
		@Pc(76) int local76;
		@Pc(82) int local82;
		@Pc(88) int local88;
		@Pc(206) Class1_Sub2_Sub1 local206;
		if (Static217.aClass183_7 == arg0) {
			local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
			local30 = (local20 >> 4 & 0xF) + Static343.anInt5784 * 2;
			local38 = (local20 & 0xF) + Static119.anInt2106 * 2;
			local49 = Static176.aClass3_Sub25_Sub1_1.method4096() != 0;
			local56 = local30 + Static176.aClass3_Sub25_Sub1_1.method4097();
			local62 = Static176.aClass3_Sub25_Sub1_1.method4097() + local38;
			local66 = Static176.aClass3_Sub25_Sub1_1.method4065();
			local70 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local76 = Static176.aClass3_Sub25_Sub1_1.method4096() * 4;
			local82 = Static176.aClass3_Sub25_Sub1_1.method4096() * 4;
			local88 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local92 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local96 = Static176.aClass3_Sub25_Sub1_1.method4096();
			if (local96 == 255) {
				local96 = -1;
			}
			local109 = Static176.aClass3_Sub25_Sub1_1.method4083();
			if (local30 >= 0 && local38 >= 0 && Static373.anInt6324 * 2 > local30 && Static373.anInt6324 * 2 > local38 && local56 >= 0 && local62 >= 0 && local56 < Static291.anInt5062 * 2 && local62 < Static291.anInt5062 * 2 && local70 != 65535) {
				local56 = local56 * 64;
				local82 <<= 0x0;
				local62 = local62 * 64;
				local38 *= 64;
				local109 <<= 0x0;
				local76 <<= 0x0;
				local30 *= 64;
				local206 = new Class1_Sub2_Sub1(local70, Static200.anInt3579, local30, local38, local76, local88 + Static172.anInt3107, local92 + Static172.anInt3107, local96, local109, local66, local82, local49);
				local206.method551(local62, Static181.method4212(Static200.anInt3579, local62, local56) - local82, Static172.anInt3107 + local88, local56);
				client.lb.method4527(new Class3_Sub3_Sub15(local206));
			}
			return;
		}
		@Pc(265) int local265;
		if (arg0 == Static364.aClass183_17) {
			local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
			@Pc(250) boolean local250 = (local20 & 0x80) != 0;
			local38 = (local20 >> 3 & 0x7) + Static343.anInt5784;
			local265 = Static119.anInt2106 + (local20 & 0x7);
			local56 = Static176.aClass3_Sub25_Sub1_1.method4097() + local38;
			local62 = local265 + Static176.aClass3_Sub25_Sub1_1.method4097();
			local66 = Static176.aClass3_Sub25_Sub1_1.method4065();
			local70 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local76 = Static176.aClass3_Sub25_Sub1_1.method4096() * 4;
			local82 = Static176.aClass3_Sub25_Sub1_1.method4096() * 4;
			local88 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local92 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local96 = Static176.aClass3_Sub25_Sub1_1.method4096();
			local109 = Static176.aClass3_Sub25_Sub1_1.method4083();
			if (local96 == 255) {
				local96 = -1;
			}
			if (local38 >= 0 && local265 >= 0 && Static373.anInt6324 > local38 && local265 < Static291.anInt5062 && local56 >= 0 && local62 >= 0 && local56 < Static373.anInt6324 && Static291.anInt5062 > local62 && local70 != 65535) {
				local56 = local56 * 128 + 64;
				local62 = local62 * 128 + 64;
				local82 <<= 0x0;
				local265 = local265 * 128 + 64;
				local76 <<= 0x0;
				local109 <<= 0x0;
				local38 = local38 * 128 + 64;
				local206 = new Class1_Sub2_Sub1(local70, Static200.anInt3579, local38, local265, local76, Static172.anInt3107 + local88, local92 - -Static172.anInt3107, local96, local109, local66, local82, local250);
				local206.method551(local62, Static181.method4212(Static200.anInt3579, local62, local56) - local82, Static172.anInt3107 + local88, local56);
				client.lb.method4527(new Class3_Sub3_Sub15(local206));
			}
		} else if (Static145.aClass183_10 == arg0) {
			local20 = Static176.aClass3_Sub25_Sub1_1.method4076();
			local30 = local20 >> 2;
			local38 = local20 & 0x3;
			local265 = Static289.anIntArray310[local30];
			local56 = Static176.aClass3_Sub25_Sub1_1.method4076();
			local62 = (local56 >> 4 & 0x7) + Static343.anInt5784;
			local66 = Static119.anInt2106 + (local56 & 0x7);
			if (Static166.method2552(Static337.anInt5635) || local62 >= 0 && local66 >= 0 && local62 < Static373.anInt6324 && local66 < Static291.anInt5062) {
				Static238.method3458(local62, -1, local66, local265, Static200.anInt3579, local30, local38);
			}
		} else if (Static149.aClass183_11 == arg0) {
			local20 = Static176.aClass3_Sub25_Sub1_1.method4109();
			local30 = Static176.aClass3_Sub25_Sub1_1.method4095();
			local38 = Static119.anInt2106 + (local30 & 0x7);
			local265 = local38 + Static49.anInt873;
			local56 = (local30 >> 4 & 0x7) + Static343.anInt5784;
			local62 = local56 + Static59.anInt1127;
			local66 = Static176.aClass3_Sub25_Sub1_1.method4083();
			@Pc(583) boolean local583 = local56 >= 0 && local38 >= 0 && Static373.anInt6324 > local56 && local38 < Static291.anInt5062;
			if (local583 || Static166.method2552(Static337.anInt5635)) {
				Static395.method5458(new Class3_Sub9(local20, local66), local265, Static200.anInt3579, local62);
				if (local583) {
					Static158.method2487(Static200.anInt3579, local56, local38);
				}
			}
		} else if (arg0 == Static217.aClass183_6) {
			local20 = Static176.aClass3_Sub25_Sub1_1.method4095();
			local30 = (local20 >> 4 & 0x7) + Static343.anInt5784;
			local38 = Static119.anInt2106 + (local20 & 0x7);
			local265 = Static176.aClass3_Sub25_Sub1_1.method4088();
			if (local265 == 65535) {
				local265 = -1;
			}
			local56 = Static176.aClass3_Sub25_Sub1_1.method4066();
			local62 = local56 >> 2;
			local66 = local56 & 0x3;
			local70 = Static289.anIntArray310[local62];
			Static47.method888(local70, local38, local30, Static200.anInt3579, local62, local265, local66);
		} else if (arg0 == Static248.aClass183_12) {
			Static176.aClass3_Sub25_Sub1_1.method4096();
			local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
			local30 = Static343.anInt5784 + (local20 >> 4 & 0x7);
			local38 = (local20 & 0x7) + Static119.anInt2106;
			local265 = Static176.aClass3_Sub25_Sub1_1.method4083();
			local56 = Static176.aClass3_Sub25_Sub1_1.method4096();
			local62 = Static176.aClass3_Sub25_Sub1_1.method4099();
			@Pc(711) String local711 = Static176.aClass3_Sub25_Sub1_1.method4073();
			Static10.method147(local38, local30, local711, local56, Static200.anInt3579, local265, local62);
		} else {
			@Pc(785) byte local785;
			if (Static379.aClass183_19 == arg0) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local30 = (local20 >> 4 & 0xF) + Static343.anInt5784 * 2;
				local38 = (local20 & 0xF) + Static119.anInt2106 * 2;
				local49 = Static176.aClass3_Sub25_Sub1_1.method4096() != 0;
				local56 = Static176.aClass3_Sub25_Sub1_1.method4097() + local30;
				local62 = Static176.aClass3_Sub25_Sub1_1.method4097() + local38;
				local66 = Static176.aClass3_Sub25_Sub1_1.method4065();
				local70 = Static176.aClass3_Sub25_Sub1_1.method4065();
				local76 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local785 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local88 = Static176.aClass3_Sub25_Sub1_1.method4096() * 4;
				local92 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local96 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local109 = Static176.aClass3_Sub25_Sub1_1.method4096();
				if (local109 == 255) {
					local109 = -1;
				}
				@Pc(814) int local814 = Static176.aClass3_Sub25_Sub1_1.method4083();
				if (local30 >= 0 && local38 >= 0 && Static373.anInt6324 * 2 > local30 && Static373.anInt6324 * 2 > local38 && local56 >= 0 && local62 >= 0 && local56 < Static291.anInt5062 * 2 && Static291.anInt5062 * 2 > local62 && local76 != 65535) {
					local814 <<= 0x0;
					local56 = local56 * 64;
					local38 *= 64;
					local62 *= 64;
					local30 *= 64;
					local82 = local785 << 0;
					local88 <<= 0x0;
					if (local66 != 0) {
						@Pc(889) Class1_Sub2_Sub6 local889 = null;
						@Pc(901) int local901;
						@Pc(895) int local895;
						@Pc(905) int local905;
						if (local66 >= 0) {
							local895 = local66 - 1;
							local901 = local895 >> 11 & 0xF;
							local905 = local895 & 0x7FF;
							@Pc(912) Class3_Sub40 local912 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local905);
							if (local912 != null) {
								local889 = local912.aClass1_Sub2_Sub6_Sub1_2;
							}
						} else {
							local895 = -local66 - 1;
							local901 = local895 >> 11 & 0xF;
							local905 = local895 & 0x7FF;
							if (Static317.anInt5364 == local905) {
								local889 = Static203.aClass1_Sub2_Sub6_Sub2_1;
							} else {
								local889 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local905];
							}
						}
						if (local889 != null) {
							@Pc(953) Class142 local953 = local889.method6189();
							if (local953.anIntArrayArray33 != null && local953.anIntArrayArray33[local901] != null) {
								local905 = local953.anIntArrayArray33[local901][0];
								@Pc(975) int local975 = local953.anIntArrayArray33[local901][2];
								@Pc(980) int local980 = local889.aClass234_7.method5422();
								@Pc(984) int local984 = Class65.anIntArray88[local980];
								@Pc(988) int local988 = Class65.anIntArray87[local980];
								@Pc(998) int local998 = local905 * local988 + local975 * local984 >> 15;
								@Pc(1009) int local1009 = local988 * local975 - local905 * local984 >> 15;
								local30 += local998;
								local82 -= local953.anIntArrayArray33[local901][1];
								local38 += local1009;
							}
						}
					}
					@Pc(1049) Class1_Sub2_Sub1 local1049 = new Class1_Sub2_Sub1(local76, Static200.anInt3579, local30, local38, local82, local92 + Static172.anInt3107, Static172.anInt3107 + local96, local109, local814, local70, local88, local49);
					local1049.method551(local62, Static181.method4212(Static200.anInt3579, local62, local56) - local88, Static172.anInt3107 + local92, local56);
					client.lb.method4527(new Class3_Sub3_Sub15(local1049));
				}
			} else if (arg0 == Static181.aClass183_13) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local30 = Static176.aClass3_Sub25_Sub1_1.method4096();
				Static9.aClass149_1.method3573(local20).method866(local30);
			} else if (Static84.aClass183_15 == arg0) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4088();
				local30 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local38 = (local30 & 0x7) + Static119.anInt2106;
				local265 = Static49.anInt873 + local38;
				local56 = (local30 >> 4 & 0x7) + Static343.anInt5784;
				local62 = Static59.anInt1127 + local56;
				@Pc(1145) Class3_Sub13 local1145 = (Class3_Sub13) Static242.aClass140_26.method3490((long) (Static200.anInt3579 << 28 | local265 << 14 | local62));
				if (local1145 != null) {
					for (@Pc(1153) Class3_Sub9 local1153 = (Class3_Sub9) local1145.aClass193_19.method4519(); local1153 != null; local1153 = (Class3_Sub9) local1145.aClass193_19.method4525()) {
						if ((local20 & 0x7FFF) == local1153.anInt627) {
							local1153.method6288();
							break;
						}
					}
					if (local1145.aClass193_19.method4529()) {
						local1145.method6288();
					}
					if (local56 >= 0 && local38 >= 0 && local56 < Static373.anInt6324 && local38 < Static291.anInt5062) {
						Static158.method2487(Static200.anInt3579, local56, local38);
					}
				}
			} else if (Static372.aClass183_18 == arg0) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local30 = Static343.anInt5784 + (local20 >> 4 & 0x7);
				local38 = Static119.anInt2106 + (local20 & 0x7);
				local265 = Static176.aClass3_Sub25_Sub1_1.method4083();
				if (local265 == 65535) {
					local265 = -1;
				}
				local56 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local62 = local56 >> 4 & 0xF;
				local66 = local56 & 0x7;
				local70 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local76 = Static176.aClass3_Sub25_Sub1_1.method4096();
				if (local30 >= 0 && local38 >= 0 && Static373.anInt6324 > local30 && local38 < Static291.anInt5062) {
					local82 = local62 + 1;
					if (local30 - local82 <= Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] && Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] <= local30 + local82 && Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] >= local38 - local82 && Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0] <= local82 + local38) {
						Static120.method1925(local265, local66, local76, local62 + (local38 << 8) + (Static200.anInt3579 << 24) + (local30 << 16), local70);
					}
				}
			} else if (arg0 == Static441.aClass183_21) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4076();
				local30 = local20 >> 2;
				local38 = local20 & 0x3;
				local265 = Static289.anIntArray310[local30];
				local56 = Static176.aClass3_Sub25_Sub1_1.method4067();
				local62 = Static176.aClass3_Sub25_Sub1_1.method4076();
				local66 = (local62 >> 4 & 0x7) + Static343.anInt5784;
				local70 = Static119.anInt2106 + (local62 & 0x7);
				if (Static166.method2552(Static337.anInt5635) || local66 >= 0 && local70 >= 0 && local66 < Static373.anInt6324 && Static291.anInt5062 > local70) {
					Static238.method3458(local66, local56, local70, local265, Static200.anInt3579, local30, local38);
				}
			} else if (arg0 == Static359.aClass183_16) {
				@Pc(1429) byte local1429 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local30 = Static176.aClass3_Sub25_Sub1_1.method4109();
				local38 = Static176.aClass3_Sub25_Sub1_1.method4083();
				@Pc(1441) byte local1441 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local56 = Static176.aClass3_Sub25_Sub1_1.method4076();
				local62 = local56 >> 2;
				local66 = local56 & 0x3;
				local70 = Static176.aClass3_Sub25_Sub1_1.method4088();
				@Pc(1461) byte local1461 = Static176.aClass3_Sub25_Sub1_1.method4097();
				local785 = Static176.aClass3_Sub25_Sub1_1.method4112();
				local88 = Static176.aClass3_Sub25_Sub1_1.method4065();
				local92 = Static176.aClass3_Sub25_Sub1_1.method4076();
				local96 = (local92 >> 4 & 0x7) + Static343.anInt5784;
				local109 = Static119.anInt2106 + (local92 & 0x7);
				if (!Static413.aClass167_11.method6024()) {
					Static283.method4054(local1461, local66, local70, local1429, local88, local785, local109, local62, local38, local30, Static200.anInt3579, local1441, local96);
				}
			} else if (arg0 == Static350.aClass183_14) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local30 = Static343.anInt5784 + (local20 >> 4 & 0x7);
				local38 = Static119.anInt2106 + (local20 & 0x7);
				local265 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local56 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local62 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local66 = Static176.aClass3_Sub25_Sub1_1.method4096();
				if (local30 >= 0 && local38 >= 0 && local30 < Static373.anInt6324 && Static291.anInt5062 > local38) {
					local70 = local30 * 128 + 64;
					local76 = local38 * 128 + 64;
					local82 = Static200.anInt3579;
					if (local82 < 3 && Static24.method2475(local30, local38)) {
						local82++;
					}
					@Pc(1611) Class1_Sub2_Sub5 local1611 = new Class1_Sub2_Sub5(local265, local62, Static172.anInt3107, Static200.anInt3579, local82, local70, Static181.method4212(Static200.anInt3579, local76, local70) - local56, local76, local30, local30, local38, local38, local66);
					Static236.aClass193_34.method4527(new Class3_Sub3_Sub1(local1611));
				}
			} else if (Static386.aClass183_20 == arg0) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local30 = Static176.aClass3_Sub25_Sub1_1.method4088();
				local38 = Static176.aClass3_Sub25_Sub1_1.method4088();
				local265 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local56 = Static119.anInt2106 + (local265 & 0x7);
				local62 = local56 + Static49.anInt873;
				local66 = (local265 >> 4 & 0x7) + Static343.anInt5784;
				local70 = Static59.anInt1127 + local66;
				if (local38 != Static317.anInt5364) {
					@Pc(1682) boolean local1682 = local66 >= 0 && local56 >= 0 && Static373.anInt6324 > local66 && Static291.anInt5062 > local56;
					if (local1682 || Static166.method2552(Static337.anInt5635)) {
						Static395.method5458(new Class3_Sub9(local20, local30), local62, Static200.anInt3579, local70);
						if (local1682) {
							Static158.method2487(Static200.anInt3579, local66, local56);
						}
					}
				}
			} else if (arg0 == Static10.aClass183_1) {
				local20 = Static176.aClass3_Sub25_Sub1_1.method4096();
				local30 = Static119.anInt2106 + (local20 & 0x7);
				local38 = local30 + Static49.anInt873;
				local265 = (local20 >> 4 & 0x7) + Static343.anInt5784;
				local56 = Static59.anInt1127 + local265;
				local62 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local66 = Static176.aClass3_Sub25_Sub1_1.method4083();
				local70 = Static176.aClass3_Sub25_Sub1_1.method4083();
				if (Static242.aClass140_26 != null) {
					@Pc(1768) Class3_Sub13 local1768 = (Class3_Sub13) Static242.aClass140_26.method3490((long) (local38 << 14 | Static200.anInt3579 << 28 | local56));
					if (local1768 != null) {
						for (@Pc(1776) Class3_Sub9 local1776 = (Class3_Sub9) local1768.aClass193_19.method4519(); local1776 != null; local1776 = (Class3_Sub9) local1768.aClass193_19.method4525()) {
							if ((local62 & 0x7FFF) == local1776.anInt627 && local66 == local1776.anInt625) {
								local1776.method6288();
								local1776.anInt625 = local70;
								Static395.method5458(local1776, local38, Static200.anInt3579, local56);
								break;
							}
						}
						if (local265 >= 0 && local30 >= 0 && local265 < Static373.anInt6324 && Static291.anInt5062 > local30) {
							Static158.method2487(Static200.anInt3579, local265, local30);
						}
					}
				}
			} else {
				Static120.method1926("T3 - " + arg0, null);
				Static168.method2583(false);
			}
		}
	}
}
