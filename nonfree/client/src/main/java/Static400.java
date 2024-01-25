import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZIIZ)V")
	public static void method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static313.aClass206ArrayArrayArray2 == null) {
			Static478.aClass9_10.method7632(arg3, -16777216, arg1, arg4, arg0);
		} else if (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >= 0 && Static542.anInt9387 * 128 > Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 && Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >= 0 && Static36.anInt1324 * 128 > Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191) {
			Static15.anInt833++;
			if (Static16.aClass47_Sub2_Sub3_Sub2_1 != null && Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 - (Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() - 1) * 64 >> 7 == Static540.anInt9357 && Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 + 64 - Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() * 64 >> 7 == Static417.anInt6093) {
				Static540.anInt9357 = -1;
				Static417.anInt6093 = -1;
				Static503.method7223();
			}
			Static501.method7184();
			if (!arg2) {
				Static409.method6131();
			}
			Static512.method7332();
			Static30.method1225(arg3, arg1, arg0, arg4, true);
			@Pc(106) int local106 = Static353.anInt6444;
			@Pc(108) int local108 = Static120.anInt2874;
			@Pc(110) int local110 = Static501.anInt8516;
			@Pc(112) int local112 = Static158.anInt3486;
			@Pc(120) int local120;
			@Pc(158) int local158;
			if (Static464.anInt8003 == 1) {
				local120 = (int) Static362.aFloat128;
				if (local120 < Static497.anInt8449 >> 8) {
					local120 = Static497.anInt8449 >> 8;
				}
				if (Static385.aBooleanArray27[4] && Static282.anIntArray398[4] + 128 > local120) {
					local120 = Static282.anIntArray398[4] + 128;
				}
				local158 = (int) Static443.aFloat151 + Static157.anInt3480 & 0x3FFF;
				Static490.method7169(local106, local120, Static126.anInt3030, local158, Static180.anInt3880, (local120 >> 3) * 3 + 600 << 0, Static74.method1954(Static245.anInt4747, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189) - 50);
			} else if (Static464.anInt8003 == 4) {
				local120 = (int) Static362.aFloat128;
				if (Static497.anInt8449 >> 8 > local120) {
					local120 = Static497.anInt8449 >> 8;
				}
				if (Static385.aBooleanArray27[4] && local120 < Static282.anIntArray398[4] + 128) {
					local120 = Static282.anIntArray398[4] + 128;
				}
				local158 = (int) Static443.aFloat151 & 0x3FFF;
				Static490.method7169(local106, local120, Static126.anInt3030, local158, Static180.anInt3880, (local120 >> 3) * 3 + 600 << 0, Static74.method1954(Static245.anInt4747, Static67.anInt1925, Static347.anInt6403) - 50);
			} else if (Static464.anInt8003 == 5) {
				Static58.method1893(local106);
			}
			local120 = Static308.anInt5918;
			local158 = Static520.anInt8842;
			@Pc(265) int local265 = Static347.anInt6404;
			@Pc(267) int local267 = Static411.anInt7178;
			@Pc(269) int local269 = Static339.anInt6337;
			@Pc(311) int local311;
			for (@Pc(271) int local271 = 0; local271 < 5; local271++) {
				if (Static385.aBooleanArray27[local271]) {
					local311 = (int) ((double) (Static294.anIntArray404[local271] * 2 + 1) * Math.random() - (double) Static294.anIntArray404[local271] + Math.sin((double) Static178.anIntArray292[local271] / 100.0D * (double) Static480.anIntArray637[local271]) * (double) Static282.anIntArray398[local271]);
					if (local271 == 2) {
						Static347.anInt6404 += local311 << 0;
					}
					if (local271 == 0) {
						Static308.anInt5918 += local311 << 0;
					}
					if (local271 == 3) {
						Static339.anInt6337 = Static339.anInt6337 + local311 & 0x3FFF;
					}
					if (local271 == 4) {
						Static411.anInt7178 += local311;
						if (Static411.anInt7178 < 1024) {
							Static411.anInt7178 = 1024;
						} else if (Static411.anInt7178 > 3072) {
							Static411.anInt7178 = 3072;
						}
					}
					if (local271 == 1) {
						Static520.anInt8842 += local311 << 0;
					}
				}
			}
			if (Static308.anInt5918 < 0) {
				Static308.anInt5918 = 0;
			}
			if ((Static488.anInt8353 << 7) - 1 < Static308.anInt5918) {
				Static308.anInt5918 = (Static488.anInt8353 << 7) - 1;
			}
			if (Static347.anInt6404 < 0) {
				Static347.anInt6404 = 0;
			}
			if ((Static60.anInt1677 << 7) - 1 < Static347.anInt6404) {
				Static347.anInt6404 = (Static60.anInt1677 << 7) - 1;
			}
			Static115.method2633();
			Static432.method6371();
			Static478.aClass9_10.N(local108, local112, local110 + local108, local112 - -local106);
			Static478.aClass9_10.method7623();
			local311 = Static55.anInt1551;
			if (Static446.aClass89_1 == null) {
				Static478.aClass9_10.Z(local311);
			} else {
				Static446.aClass89_1.method2908(local108, local112, Static478.aClass9_10, local311, local110, Static419.anInt7311 << 3, Static411.anInt7178, local106, Static339.anInt6337);
			}
			Static443.method6413();
			Static56.aClass22_5.B(Static308.anInt5918, Static520.anInt8842, Static347.anInt6404, -Static411.anInt7178 & 0x3FFF, -Static339.anInt6337 & 0x3FFF, -Static304.anInt5875 & 0x3FFF);
			Static478.aClass9_10.method7597(Static56.aClass22_5);
			Static478.aClass9_10.b(local108 + local110 / 2, local106 / 2 + local112, Static267.anInt5173 << 1, Static267.anInt5173 << 1);
			Static407.method6111(local110 / 2 + local108, local106 / 2 + local112, Static267.anInt5173 << 1, Static267.anInt5173 << 1);
			Static30.method1221(Static308.anInt5918, Static347.anInt6404, -Static411.anInt7178 & 0x3FFF, Static520.anInt8842, -Static304.anInt5875 & 0x3FFF, -Static339.anInt6337 & 0x3FFF);
			@Pc(547) byte local547 = Static89.aClass1_Sub28_Sub1_1.method4271(Static526.anInt8926) == 2 ? (byte) Static15.anInt833 : 1;
			Static246.method4151(Static478.aClass9_10, Static416.anInt7252, Static442.anInt7959, Static56.aClass22_5, Static308.anInt5918, Static520.anInt8842, Static347.anInt6404, Static388.aByteArrayArrayArray16, Static213.anIntArray327, Static298.anIntArray407, Static9.anIntArray16, Static55.anIntArray141, Static460.anIntArray621, Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 + 1, local547, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7, !Static89.aClass1_Sub28_Sub1_1.aBoolean318);
			Static443.method6413();
			if (Static51.anInt7926 == 9) {
				Static527.method7514(local110, local108, local112, local106);
				Static102.method2273(local108, local106, local112, local110);
				Static88.method2131(local112, local106, local108, local110);
				Static228.method7525(local106, local108, local112, local110);
			}
			Static448.method6439();
			Static339.anInt6337 = local269;
			Static308.anInt5918 = local120;
			Static347.anInt6404 = local265;
			Static411.anInt7178 = local267;
			Static520.anInt8842 = local158;
			if (Static208.aBoolean263 && Static181.aClass115_2.method3357() == 0) {
				Static208.aBoolean263 = false;
			}
			if (Static208.aBoolean263) {
				Static478.aClass9_10.method7632(local108, -16777216, local110, local106, local112);
				Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993), false, Static268.aClass27_4);
			}
		} else {
			Static478.aClass9_10.method7632(arg3, -16777216, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIZI)V")
	public static void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static89.aClass1_Sub28_Sub1_1.anInt4894 != 0 && arg0 != 0 && Static205.anInt4329 < 50 && arg2 != -1) {
			Static41.aClass67Array1[Static205.anInt4329++] = new Class67((byte) 2, arg2, arg0, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	public static void method6036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		if (Static236.anInt4609 != arg1) {
			Static201.anIntArray324 = new int[arg1];
			for (local11 = 0; local11 < arg1; local11++) {
				Static201.anIntArray324[local11] = (local11 << 12) / arg1;
			}
			Static36.anInt1319 = arg1 - 1;
			Static340.anInt6358 = arg1 * 32;
			Static236.anInt4609 = arg1;
		}
		if (Static95.anInt2365 == arg0) {
			return;
		}
		if (arg0 == Static236.anInt4609) {
			Static305.anIntArray416 = Static201.anIntArray324;
		} else {
			Static305.anIntArray416 = new int[arg0];
			for (local11 = 0; local11 < arg0; local11++) {
				Static305.anIntArray416[local11] = (local11 << 12) / arg0;
			}
		}
		Static226.anInt4534 = arg0 - 1;
		Static95.anInt2365 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)Z")
	public static boolean method6038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
	public static void method6046() {
		Static255.aClass1_Sub13_Sub2_2.method3086();
		@Pc(15) int local15 = Static255.aClass1_Sub13_Sub2_2.method3087(8);
		@Pc(20) int local20;
		if (local15 < Static457.anInt7857) {
			for (local20 = local15; local20 < Static457.anInt7857; local20++) {
				Static269.anIntArray369[Static159.anInt3491++] = Static386.anIntArray503[local20];
			}
		}
		if (local15 > Static457.anInt7857) {
			throw new RuntimeException("gnpov1");
		}
		Static457.anInt7857 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(56) int local56 = Static386.anIntArray503[local20];
			@Pc(64) Class47_Sub2_Sub3_Sub1 local64 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) local56)).aClass47_Sub2_Sub3_Sub1_2;
			@Pc(69) int local69 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
			if (local69 == 0) {
				Static386.anIntArray503[Static457.anInt7857++] = local56;
				local64.anInt5038 = Static416.anInt7252;
			} else {
				@Pc(91) int local91 = Static255.aClass1_Sub13_Sub2_2.method3087(2);
				if (local91 == 0) {
					Static386.anIntArray503[Static457.anInt7857++] = local56;
					local64.anInt5038 = Static416.anInt7252;
					Static50.anIntArray777[Static280.anInt5512++] = local56;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local91 == 1) {
						Static386.anIntArray503[Static457.anInt7857++] = local56;
						local64.anInt5038 = Static416.anInt7252;
						local137 = Static255.aClass1_Sub13_Sub2_2.method3087(3);
						local64.method3705(1, local137);
						local147 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
						if (local147 == 1) {
							Static50.anIntArray777[Static280.anInt5512++] = local56;
						}
					} else if (local91 == 2) {
						Static386.anIntArray503[Static457.anInt7857++] = local56;
						local64.anInt5038 = Static416.anInt7252;
						if (Static255.aClass1_Sub13_Sub2_2.method3087(1) == 1) {
							local137 = Static255.aClass1_Sub13_Sub2_2.method3087(3);
							local64.method3705(2, local137);
							local147 = Static255.aClass1_Sub13_Sub2_2.method3087(3);
							local64.method3705(2, local147);
						} else {
							local137 = Static255.aClass1_Sub13_Sub2_2.method3087(3);
							local64.method3705(0, local137);
						}
						local137 = Static255.aClass1_Sub13_Sub2_2.method3087(1);
						if (local137 == 1) {
							Static50.anIntArray777[Static280.anInt5512++] = local56;
						}
					} else if (local91 == 3) {
						Static269.anIntArray369[Static159.anInt3491++] = local56;
					}
				}
			}
		}
	}
}
