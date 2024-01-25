import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_93 = new Class6(67, 8);

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_86 = new Class186(78, 4);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!faa;)V")
	public static void method5098(@OriginalArg(1) Class47_Sub2_Sub3 arg0) {
		@Pc(14) int local14 = arg0.anInt5020 - Static416.anInt7252;
		@Pc(26) int local26 = arg0.anInt5031 * 128 + arg0.method4350() * 64;
		@Pc(37) int local37 = arg0.anInt5055 * 128 + arg0.method4350() * 64;
		arg0.anInt8191 += (local37 - arg0.anInt8191) / local14;
		arg0.anInt5081 = 0;
		arg0.anInt8189 += (local26 - arg0.anInt8189) / local14;
		if (arg0.anInt5067 == 0) {
			arg0.method4364(8192);
		}
		if (arg0.anInt5067 == 1) {
			arg0.method4364(12288);
		}
		if (arg0.anInt5067 == 2) {
			arg0.method4364(0);
		}
		if (arg0.anInt5067 == 3) {
			arg0.method4364(4096);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	public static void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass47_Sub5_1 != null) {
			local7.aClass47_Sub5_1 = null;
		}
		if (local7.aClass47_Sub5_2 != null) {
			local7.aClass47_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!bn;)V")
	public static void method5102(@OriginalArg(1) Class33 arg0) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (arg0 == Static281.aClass33_14) {
			local10 = Static255.aClass1_Sub13_Sub2_2.method3027();
			local14 = Static255.aClass1_Sub13_Sub2_2.method3072();
			local21 = Static280.anInt5513 + (local14 & 0x7);
			local25 = Static517.anInt8716 + local21;
			local34 = Static501.anInt8506 + (local14 >> 4 & 0x7);
			local38 = Static324.anInt6132 + local34;
			@Pc(53) Class1_Sub11 local53 = (Class1_Sub11) Static528.aClass174_40.method4422((long) (local38 | local25 << 14 | Static185.anInt3937 << 28));
			if (local53 != null) {
				for (@Pc(61) Class1_Sub2 local61 = (Class1_Sub2) local53.aClass38_21.method1419(); local61 != null; local61 = (Class1_Sub2) local53.aClass38_21.method1415()) {
					if (local61.anInt719 == (local10 & 0x7FFF)) {
						local61.method7983();
						break;
					}
				}
				if (local53.aClass38_21.method1414()) {
					local53.method7983();
				}
				if (local34 >= 0 && local21 >= 0 && Static542.anInt9387 > local34 && Static36.anInt1324 > local21) {
					Static218.method3888(Static185.anInt3937, local34, local21);
				}
			}
			return;
		}
		@Pc(145) int local145;
		@Pc(149) int local149;
		if (Static60.aClass33_3 == arg0) {
			local10 = Static255.aClass1_Sub13_Sub2_2.method3057();
			local14 = Static501.anInt8506 + (local10 >> 4 & 0x7);
			local21 = Static280.anInt5513 + (local10 & 0x7);
			local25 = Static255.aClass1_Sub13_Sub2_2.method3016();
			local34 = local25 >> 2;
			local38 = local25 & 0x3;
			local145 = Static438.anIntArray201[local34];
			local149 = Static255.aClass1_Sub13_Sub2_2.method3056();
			if (Static225.method3960(Static198.anInt4113) || local14 >= 0 && local21 >= 0 && Static542.anInt9387 > local14 && Static36.anInt1324 > local21) {
				Static382.method5788(local21, local149, local34, Static185.anInt3937, local14, local145, local38);
			}
			return;
		}
		@Pc(253) int local253;
		@Pc(251) int local251;
		if (Static103.aClass33_7 == arg0) {
			local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local14 = (local10 >> 4 & 0x7) + Static501.anInt8506;
			local21 = Static280.anInt5513 + (local10 & 0x7);
			local25 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local34 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local38 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local145 = Static255.aClass1_Sub13_Sub2_2.method3043();
			if (local14 >= 0 && local21 >= 0 && local14 < Static542.anInt9387 && Static36.anInt1324 > local21) {
				local149 = local14 * 128 + 64;
				local251 = local21 * 128 + 64;
				local253 = Static185.anInt3937;
				if (local253 < 3 && Static180.method3467(local14, local21)) {
					local253++;
				}
				@Pc(286) Class47_Sub2_Sub2 local286 = new Class47_Sub2_Sub2(local25, local38, Static416.anInt7252, Static185.anInt3937, local253, local149, Static74.method1954(Static185.anInt3937, local251, local149) - local34, local251, local14, local14, local21, local21, local145);
				Static35.aClass38_14.method1426(new Class1_Sub1_Sub6(local286));
			}
		} else if (Static110.aClass33_9 == arg0) {
			local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local14 = Static501.anInt8506 + (local10 >> 4 & 0x7);
			local21 = Static280.anInt5513 + (local10 & 0x7);
			local25 = Static255.aClass1_Sub13_Sub2_2.method3056();
			if (local25 == 65535) {
				local25 = -1;
			}
			local34 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local38 = local34 >> 4 & 0xF;
			local145 = local34 & 0x7;
			local149 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local251 = Static255.aClass1_Sub13_Sub2_2.method3043();
			if (local14 >= 0 && local21 >= 0 && Static542.anInt9387 > local14 && Static36.anInt1324 > local21) {
				local253 = local38 + 1;
				if (local14 - local253 <= Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] && local253 + local14 >= Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0] && local21 - local253 <= Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0] && Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0] <= local253 + local21) {
					Static111.method2439(local25, local251, local145, local149, (Static185.anInt3937 << 24) + (local14 << 16) + (local21 << 8) + local38);
				}
			}
		} else if (arg0 == Static430.aClass33_19) {
			Static255.aClass1_Sub13_Sub2_2.method3043();
			local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local14 = Static501.anInt8506 + (local10 >> 4 & 0x7);
			local21 = (local10 & 0x7) + Static280.anInt5513;
			local25 = Static255.aClass1_Sub13_Sub2_2.method3056();
			local34 = Static255.aClass1_Sub13_Sub2_2.method3043();
			local38 = Static255.aClass1_Sub13_Sub2_2.method3039();
			@Pc(477) String local477 = Static255.aClass1_Sub13_Sub2_2.method3034();
			Static394.method5921(local38, Static185.anInt3937, local14, local25, local21, local34, local477);
		} else {
			@Pc(556) int local556;
			@Pc(560) int local560;
			@Pc(568) int local568;
			@Pc(678) Class47_Sub2_Sub5 local678;
			@Pc(564) int local564;
			if (Static365.aClass33_24 == arg0) {
				local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
				@Pc(505) boolean local505 = (local10 & 0x80) != 0;
				local21 = (local10 >> 3 & 0x7) + Static501.anInt8506;
				local25 = Static280.anInt5513 + (local10 & 0x7);
				local34 = Static255.aClass1_Sub13_Sub2_2.method3073() + local21;
				local38 = Static255.aClass1_Sub13_Sub2_2.method3073() + local25;
				local145 = Static255.aClass1_Sub13_Sub2_2.method3058();
				local149 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local251 = Static255.aClass1_Sub13_Sub2_2.method3043() * 4;
				local253 = Static255.aClass1_Sub13_Sub2_2.method3043() * 4;
				local556 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local560 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local564 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local568 = Static255.aClass1_Sub13_Sub2_2.method3056();
				if (local564 == 255) {
					local564 = -1;
				}
				if (local21 >= 0 && local25 >= 0 && local21 < Static542.anInt9387 && local25 < Static36.anInt1324 && local34 >= 0 && local38 >= 0 && local34 < Static542.anInt9387 && Static36.anInt1324 > local38 && local149 != 65535) {
					local253 <<= 0x0;
					local38 = local38 * 128 + 64;
					local25 = local25 * 128 + 64;
					local21 = local21 * 128 + 64;
					local251 <<= 0x0;
					local34 = local34 * 128 + 64;
					local568 <<= 0x0;
					local678 = new Class47_Sub2_Sub5(local149, Static185.anInt3937, local21, local25, local251, local556 + Static416.anInt7252, Static416.anInt7252 + local560, local564, local568, local145, local253, local505);
					local678.method4775(local34, Static74.method1954(Static185.anInt3937, local38, local34) - local253, Static416.anInt7252 + local556, local38);
					Static228.aClass38_76.method1426(new Class1_Sub1_Sub7(local678));
				}
			} else if (arg0 == Static437.aClass33_20) {
				local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
				local14 = Static280.anInt5513 + (local10 & 0x7);
				local21 = local14 + Static517.anInt8716;
				local25 = Static501.anInt8506 + (local10 >> 4 & 0x7);
				local34 = local25 + Static324.anInt6132;
				local38 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local145 = Static255.aClass1_Sub13_Sub2_2.method3056();
				local149 = Static255.aClass1_Sub13_Sub2_2.method3056();
				if (Static528.aClass174_40 != null) {
					@Pc(763) Class1_Sub11 local763 = (Class1_Sub11) Static528.aClass174_40.method4422((long) (Static185.anInt3937 << 28 | local21 << 14 | local34));
					if (local763 != null) {
						for (@Pc(771) Class1_Sub2 local771 = (Class1_Sub2) local763.aClass38_21.method1419(); local771 != null; local771 = (Class1_Sub2) local763.aClass38_21.method1415()) {
							if ((local38 & 0x7FFF) == local771.anInt719 && local145 == local771.anInt716) {
								local771.method7983();
								local771.anInt716 = local149;
								Static266.method4408(local771, local21, Static185.anInt3937, local34);
								break;
							}
						}
						if (local25 >= 0 && local14 >= 0 && Static542.anInt9387 > local25 && local14 < Static36.anInt1324) {
							Static218.method3888(Static185.anInt3937, local25, local14);
						}
					}
				}
			} else {
				@Pc(859) boolean local859;
				if (arg0 == Static424.aClass33_18) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
					local14 = (local10 >> 4 & 0xF) + Static501.anInt8506 * 2;
					local21 = Static280.anInt5513 * 2 + (local10 & 0xF);
					local859 = Static255.aClass1_Sub13_Sub2_2.method3043() != 0;
					local34 = local14 + Static255.aClass1_Sub13_Sub2_2.method3073();
					local38 = Static255.aClass1_Sub13_Sub2_2.method3073() + local21;
					local145 = Static255.aClass1_Sub13_Sub2_2.method3058();
					local149 = Static255.aClass1_Sub13_Sub2_2.method3058();
					local251 = Static255.aClass1_Sub13_Sub2_2.method3056();
					@Pc(888) byte local888 = Static255.aClass1_Sub13_Sub2_2.method3073();
					local556 = Static255.aClass1_Sub13_Sub2_2.method3043() * 4;
					local560 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local564 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local568 = Static255.aClass1_Sub13_Sub2_2.method3043();
					@Pc(910) int local910 = Static255.aClass1_Sub13_Sub2_2.method3056();
					if (local568 == 255) {
						local568 = -1;
					}
					if (local14 >= 0 && local21 >= 0 && Static542.anInt9387 * 2 > local14 && local21 < Static542.anInt9387 * 2 && local34 >= 0 && local38 >= 0 && Static36.anInt1324 * 2 > local34 && Static36.anInt1324 * 2 > local38 && local251 != 65535) {
						local14 *= 64;
						local253 = local888 << 0;
						local38 *= 64;
						local910 <<= 0x0;
						local21 *= 64;
						local34 = local34 * 64;
						local556 <<= 0x0;
						if (local145 != 0) {
							@Pc(998) Class47_Sub2_Sub3 local998 = null;
							@Pc(1018) int local1018;
							@Pc(1008) int local1008;
							@Pc(1012) int local1012;
							if (local145 < 0) {
								local1008 = -local145 - 1;
								local1012 = local1008 & 0x7FF;
								local1018 = local1008 >> 11 & 0xF;
								if (Static150.anInt3353 == local1012) {
									local998 = Static16.aClass47_Sub2_Sub3_Sub2_1;
								} else {
									local998 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local1012];
								}
							} else {
								local1008 = local145 - 1;
								local1012 = local1008 & 0x7FF;
								local1018 = local1008 >> 11 & 0xF;
								@Pc(1054) Class1_Sub10 local1054 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local1012);
								if (local1054 != null) {
									local998 = local1054.aClass47_Sub2_Sub3_Sub1_2;
								}
							}
							if (local998 != null) {
								@Pc(1065) Class255 local1065 = local998.method4356();
								if (local1065.anIntArrayArray71 != null && local1065.anIntArrayArray71[local1018] != null) {
									local1012 = local1065.anIntArrayArray71[local1018][0];
									@Pc(1087) int local1087 = local1065.anIntArrayArray71[local1018][2];
									@Pc(1092) int local1092 = local998.aClass146_7.method3943();
									@Pc(1096) int local1096 = Class307.anIntArray744[local1092];
									@Pc(1100) int local1100 = Class307.anIntArray743[local1092];
									@Pc(1110) int local1110 = local1100 * local1012 + local1096 * local1087 >> 15;
									@Pc(1121) int local1121 = local1087 * local1100 - local1012 * local1096 >> 15;
									local14 += local1110;
									local21 += local1121;
									local253 -= local1065.anIntArrayArray71[local1018][1];
								}
							}
						}
						@Pc(1161) Class47_Sub2_Sub5 local1161 = new Class47_Sub2_Sub5(local251, Static185.anInt3937, local14, local21, local253, local560 + Static416.anInt7252, Static416.anInt7252 + local564, local568, local910, local149, local556, local859);
						local1161.method4775(local34, Static74.method1954(Static185.anInt3937, local38, local34) - local556, Static416.anInt7252 + local560, local38);
						Static228.aClass38_76.method1426(new Class1_Sub1_Sub7(local1161));
					}
				} else if (Static75.aClass33_4 == arg0) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3027();
					local14 = Static255.aClass1_Sub13_Sub2_2.method3016();
					local21 = (local14 & 0x7) + Static280.anInt5513;
					local25 = Static517.anInt8716 + local21;
					local34 = (local14 >> 4 & 0x7) + Static501.anInt8506;
					local38 = local34 + Static324.anInt6132;
					local145 = Static255.aClass1_Sub13_Sub2_2.method3027();
					@Pc(1238) boolean local1238 = local34 >= 0 && local21 >= 0 && local34 < Static542.anInt9387 && local21 < Static36.anInt1324;
					if (local1238 || Static225.method3960(Static198.anInt4113)) {
						Static266.method4408(new Class1_Sub2(local10, local145), local25, Static185.anInt3937, local38);
						if (local1238) {
							Static218.method3888(Static185.anInt3937, local34, local21);
						}
					}
				} else if (arg0 == Static253.aClass33_22) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
					local14 = Static501.anInt8506 + (local10 >> 4 & 0x7);
					local21 = Static280.anInt5513 + (local10 & 0x7);
					local25 = Static255.aClass1_Sub13_Sub2_2.method3053();
					if (local25 == 65535) {
						local25 = -1;
					}
					local34 = Static255.aClass1_Sub13_Sub2_2.method3016();
					local38 = local34 >> 2;
					local145 = local34 & 0x3;
					local149 = Static438.anIntArray201[local38];
					Static247.method4187(local25, local21, local149, Static185.anInt3937, local38, local145, local14);
				} else if (Static103.aClass33_8 == arg0) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local14 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local21 = Static255.aClass1_Sub13_Sub2_2.method3072();
					local25 = (local21 & 0x7) + Static280.anInt5513;
					local34 = local25 + Static517.anInt8716;
					local38 = (local21 >> 4 & 0x7) + Static501.anInt8506;
					local145 = Static324.anInt6132 + local38;
					local149 = Static255.aClass1_Sub13_Sub2_2.method3027();
					if (Static150.anInt3353 != local14) {
						@Pc(1388) boolean local1388 = local38 >= 0 && local25 >= 0 && local38 < Static542.anInt9387 && local25 < Static36.anInt1324;
						if (local1388 || Static225.method3960(Static198.anInt4113)) {
							Static266.method4408(new Class1_Sub2(local10, local149), local34, Static185.anInt3937, local145);
							if (local1388) {
								Static218.method3888(Static185.anInt3937, local38, local25);
							}
						}
					}
				} else if (arg0 == Static402.aClass33_25) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3043();
					local14 = (local10 >> 4 & 0xF) + Static501.anInt8506 * 2;
					local21 = (local10 & 0xF) + Static280.anInt5513 * 2;
					local859 = Static255.aClass1_Sub13_Sub2_2.method3043() != 0;
					local34 = local14 + Static255.aClass1_Sub13_Sub2_2.method3073();
					local38 = Static255.aClass1_Sub13_Sub2_2.method3073() + local21;
					local145 = Static255.aClass1_Sub13_Sub2_2.method3058();
					local149 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local251 = Static255.aClass1_Sub13_Sub2_2.method3043() * 4;
					local253 = Static255.aClass1_Sub13_Sub2_2.method3043() * 4;
					local556 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local560 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local564 = Static255.aClass1_Sub13_Sub2_2.method3043();
					local568 = Static255.aClass1_Sub13_Sub2_2.method3056();
					if (local564 == 255) {
						local564 = -1;
					}
					if (local14 >= 0 && local21 >= 0 && Static542.anInt9387 * 2 > local14 && Static542.anInt9387 * 2 > local21 && local34 >= 0 && local38 >= 0 && Static36.anInt1324 * 2 > local34 && Static36.anInt1324 * 2 > local38 && local149 != 65535) {
						local34 = local34 * 64;
						local251 <<= 0x0;
						local568 <<= 0x0;
						local21 *= 64;
						local14 *= 64;
						local38 = local38 * 64;
						local253 <<= 0x0;
						local678 = new Class47_Sub2_Sub5(local149, Static185.anInt3937, local14, local21, local251, local556 + Static416.anInt7252, Static416.anInt7252 + local560, local564, local568, local145, local253, local859);
						local678.method4775(local34, Static74.method1954(Static185.anInt3937, local38, local34) - local253, Static416.anInt7252 + local556, local38);
						Static228.aClass38_76.method1426(new Class1_Sub1_Sub7(local678));
					}
				} else if (Static114.aClass33_17 == arg0) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3056();
					local14 = Static255.aClass1_Sub13_Sub2_2.method3043();
					Static365.aClass194_6.method5084(local10).method7068(local14);
				} else if (arg0 == Static325.aClass33_15) {
					@Pc(1645) byte local1645 = Static255.aClass1_Sub13_Sub2_2.method3073();
					local14 = Static255.aClass1_Sub13_Sub2_2.method3053();
					local21 = Static255.aClass1_Sub13_Sub2_2.method3057();
					local25 = Static501.anInt8506 + (local21 >> 4 & 0x7);
					local34 = Static280.anInt5513 + (local21 & 0x7);
					local38 = Static255.aClass1_Sub13_Sub2_2.method3053();
					@Pc(1676) byte local1676 = Static255.aClass1_Sub13_Sub2_2.method3063();
					local149 = Static255.aClass1_Sub13_Sub2_2.method3059();
					@Pc(1684) byte local1684 = Static255.aClass1_Sub13_Sub2_2.method3079();
					local253 = Static255.aClass1_Sub13_Sub2_2.method3072();
					local556 = local253 >> 2;
					local560 = local253 & 0x3;
					@Pc(1700) byte local1700 = Static255.aClass1_Sub13_Sub2_2.method3079();
					local568 = Static255.aClass1_Sub13_Sub2_2.method3053();
					if (!Static478.aClass9_10.method7640()) {
						Static170.method3310(local149, local1684, local568, local25, local1700, Static185.anInt3937, local34, local1676, local556, local560, local38, local14, local1645);
					}
				} else if (arg0 == Static460.aClass33_21) {
					local10 = Static255.aClass1_Sub13_Sub2_2.method3016();
					local14 = local10 >> 2;
					local21 = local10 & 0x3;
					local25 = Static438.anIntArray201[local14];
					local34 = Static255.aClass1_Sub13_Sub2_2.method3016();
					local38 = (local34 >> 4 & 0x7) + Static501.anInt8506;
					local145 = (local34 & 0x7) + Static280.anInt5513;
					if (Static225.method3960(Static198.anInt4113) || local38 >= 0 && local145 >= 0 && local38 < Static542.anInt9387 && Static36.anInt1324 > local145) {
						Static382.method5788(local145, -1, local14, Static185.anInt3937, local38, local25, local21);
					}
				} else {
					Static41.method1359(null, "T3 - " + arg0);
					Static140.method2961(false);
				}
			}
		}
	}
}
