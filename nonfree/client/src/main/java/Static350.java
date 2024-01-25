import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt6599;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	public static int anInt6609;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array16;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	public static final int[] anIntArray838 = new int[13];

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString434 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public static final int anInt6606 = 52;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method5617(@OriginalArg(0) Class89 arg0) {
		if (Static240.anInt6396 < 0 || Static100.anInt2436 < 0 || Static28.anInt643 == 0 || Static76.anInt1893 == 0) {
			return;
		}
		arg0.method5416(Static253.anInt4924, Static338.anInt6374, Static28.anInt643, Static76.anInt1893);
		arg0.method5431(Static347.anInt6549, Static271.anInt5362, Static28.anInt643, Static76.anInt1893);
		@Pc(40) Class70 local40 = arg0.method5438();
		local40.method3717(Static16.anInt2948, Static134.anInt2896, Static33.anInt736, Static129.anInt2828, Static129.anInt2829, Static307.anInt5866);
		arg0.method5467(local40);
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (Static127.anInt2799 == 0 && Static136.aClass8Array3 != null) {
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(62) int local62 = arg0.method5440();
			local71 = (Static240.anInt6396 - Static253.anInt4924) * local62 / Static28.anInt643;
			local80 = local62 * (Static100.anInt2436 - Static338.anInt6374) / Static76.anInt1893;
			local83 = arg0.method5444();
			local91 = local83 * (Static240.anInt6396 - Static253.anInt4924) / Static28.anInt643;
			local100 = (Static100.anInt2436 - Static338.anInt6374) * local83 / Static76.anInt1893;
			@Pc(115) int[] local115 = new int[] { local71, local80, local62 };
			local40.method3714(local115);
			@Pc(133) int[] local133 = new int[] { local91, local100, local83 };
			local40.method3714(local133);
			@Pc(138) float local138 = 0.0F;
			@Pc(147) int local147 = local133[0] - local115[0];
			@Pc(156) int local156 = local133[1] - local115[1];
			@Pc(165) int local165 = local133[2] - local115[2];
			while (local138 < 1.0F) {
				@Pc(178) int local178 = (int) (local138 * (float) local147 + (float) local115[0]);
				@Pc(182) int local182 = local178 >> 7;
				@Pc(193) int local193 = (int) ((float) local165 * local138 + (float) local115[2]);
				@Pc(197) int local197 = local193 >> 7;
				if (local182 > 0 && local197 > 0 && Static15.anInt287 > local182 && Static325.anInt6173 > local197) {
					@Pc(220) int local220 = Static168.anInt3508;
					if (local220 < 3 && (Static92.aByteArrayArrayArray3[1][local182][local197] & 0x2) != 0) {
						local220++;
					}
					if ((float) Static136.aClass8Array3[local220].method4169(local178, local193) < local138 * (float) local156 + (float) local115[1]) {
						local57 = (Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() - 1) * 64 + local178 >> 7;
						local59 = (Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() - 1) * 64 + local193 >> 7;
						break;
					}
				}
				local138 = (float) ((double) local138 + 0.01D);
			}
			if (local57 != -1 && local59 != -1) {
				if (Static253.aBoolean361 && (Static72.anInt1772 & 0x40) != 0) {
					@Pc(309) Class26 local309 = Static23.method4815(Static256.anInt4950, Static269.anInt5313);
					if (local309 == null) {
						Static249.method1112();
					} else {
						Static198.method3544(local59, Static301.anInt5782, Static85.aString150, 0L, " ->", 6, local57);
					}
				} else {
					if (Static345.anInt6530 == 1) {
						Static198.method3544(local59, -1, Static240.aString421, 0L, "", 29, local57);
					}
					Static198.method3544(local59, -1, Static272.aString340, 0L, "", 51, local57);
				}
			}
		}
		@Pc(357) Class191 local357 = Static320.aClass191_7;
		for (@Pc(362) Class36_Sub1 local362 = (Class36_Sub1) local357.method4862(); local362 != null; local362 = (Class36_Sub1) local357.method4869()) {
			if (local362.method686(Static100.anInt2436, arg0, Static240.anInt6396) && local362.anInt732 == Static168.anInt3508) {
				@Pc(497) int local497;
				@Pc(509) int local509;
				if (local362.aClass22_1 instanceof Class22_Sub2_Sub1_Sub1) {
					@Pc(387) Class22_Sub2_Sub1_Sub1 local387 = (Class22_Sub2_Sub1_Sub1) local362.aClass22_1;
					local71 = local387.method4421();
					if ((local71 & 0x1) == 0 && (local387.anInt5973 & 0x7F) == 0 && (local387.anInt5967 & 0x7F) == 0 || (local71 & 0x1) == 1 && (local387.anInt5973 & 0x7F) == 64 && (local387.anInt5967 & 0x7F) == 64) {
						local80 = local387.anInt5973 - (local387.method4421() - 1) * 64;
						local83 = local387.anInt5967 + 64 - local387.method4421() * 64;
						for (local91 = 0; local91 < Static11.anInt3203; local91++) {
							@Pc(471) Class22_Sub2_Sub1_Sub2 local471 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local91]];
							if (local471 != null && Static212.anInt4234 != local471.anInt5084 && local471.aBoolean377) {
								local497 = local471.anInt5973 + 64 - local471.aClass174_1.anInt5191 * 64;
								local509 = local471.anInt5967 + 64 - local471.aClass174_1.anInt5191 * 64;
								if (local497 >= local80 && local471.aClass174_1.anInt5191 <= local387.method4421() - (local497 - local80 >> 7) && local509 >= local83 && local471.aClass174_1.anInt5191 <= local387.method4421() - (local509 - local83 >> 7)) {
									Static341.method5543(local471);
									local471.anInt5084 = Static212.anInt4234;
								}
							}
						}
						for (local100 = 0; local100 < Static223.anInt4466; local100++) {
							@Pc(585) Class22_Sub2_Sub1_Sub1 local585 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local100]];
							if (local585 != null && Static212.anInt4234 != local585.anInt5084 && local585 != local387 && local585.aBoolean377) {
								local509 = local585.anInt5973 + 64 - local585.method4421() * 64;
								@Pc(627) int local627 = local585.anInt5967 - (local585.method4421() - 1) * 64;
								if (local80 <= local509 && local585.method4421() <= local387.method4421() - (local509 - local80 >> 7) && local627 >= local83 && local585.method4421() <= local387.method4421() - (local627 - local83 >> 7)) {
									Static78.method5356(local585);
									local585.anInt5084 = Static212.anInt4234;
								}
							}
						}
					}
					if (local387.anInt5084 == Static212.anInt4234) {
						continue;
					}
					Static78.method5356(local387);
					local387.anInt5084 = Static212.anInt4234;
				}
				if (local362.aClass22_1 instanceof Class22_Sub2_Sub1_Sub2) {
					@Pc(702) Class22_Sub2_Sub1_Sub2 local702 = (Class22_Sub2_Sub1_Sub2) local362.aClass22_1;
					if (local702.aClass174_1 != null) {
						if ((local702.aClass174_1.anInt5191 & 0x1) == 0 && (local702.anInt5973 & 0x7F) == 0 && (local702.anInt5967 & 0x7F) == 0 || (local702.aClass174_1.anInt5191 & 0x1) == 1 && (local702.anInt5973 & 0x7F) == 64 && (local702.anInt5967 & 0x7F) == 64) {
							local71 = local702.anInt5973 - (local702.aClass174_1.anInt5191 - 1) * 64;
							local80 = local702.anInt5967 - (local702.aClass174_1.anInt5191 - 1) * 64;
							for (local83 = 0; local83 < Static11.anInt3203; local83++) {
								@Pc(779) Class22_Sub2_Sub1_Sub2 local779 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local83]];
								if (local779 != null && Static212.anInt4234 != local779.anInt5084 && local702 != local779 && local779.aBoolean377) {
									local100 = local779.anInt5973 - (local779.aClass174_1.anInt5191 - 1) * 64;
									local497 = local779.anInt5967 + 64 - local779.aClass174_1.anInt5191 * 64;
									if (local71 <= local100 && local779.aClass174_1.anInt5191 <= local702.aClass174_1.anInt5191 - (local100 - local71 >> 7) && local80 <= local497 && local779.aClass174_1.anInt5191 <= local702.aClass174_1.anInt5191 - (local497 - local80 >> 7)) {
										Static341.method5543(local779);
										local779.anInt5084 = Static212.anInt4234;
									}
								}
							}
							for (local91 = 0; local91 < Static223.anInt4466; local91++) {
								@Pc(885) Class22_Sub2_Sub1_Sub1 local885 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local91]];
								if (local885 != null && local885.anInt5084 != Static212.anInt4234 && local885.aBoolean377) {
									local497 = local885.anInt5973 - (local885.method4421() - 1) * 64;
									local509 = local885.anInt5967 - (local885.method4421() - 1) * 64;
									if (local497 >= local71 && local885.method4421() <= local702.aClass174_1.anInt5191 - (local497 - local71 >> 7) && local80 <= local509 && local885.method4421() <= local702.aClass174_1.anInt5191 - (local509 - local80 >> 7)) {
										Static78.method5356(local885);
										local885.anInt5084 = Static212.anInt4234;
									}
								}
							}
						}
						if (Static212.anInt4234 == local702.anInt5084) {
							continue;
						}
						Static341.method5543(local702);
						local702.anInt5084 = Static212.anInt4234;
					}
				}
				if (local362.aClass22_1 instanceof Class22_Sub3_Sub1) {
					@Pc(1015) Class7_Sub35 local1015 = (Class7_Sub35) Static185.aClass10_33.method163((long) (local362.anInt733 << 14 | local362.anInt732 << 28 | local362.anInt729));
					if (local1015 != null) {
						for (@Pc(1023) Class7_Sub5 local1023 = (Class7_Sub5) local1015.aClass74_35.method1805(); local1023 != null; local1023 = (Class7_Sub5) local1015.aClass74_35.method1796()) {
							@Pc(1032) Class138 local1032 = Static17.method4472(local1023.anInt1050);
							if (Static127.anInt2799 == 1) {
								Static198.method3544(local362.anInt733, Static232.anInt4617, Static256.aString313, (long) local1023.anInt1050, Static205.aString266 + " -> <col=ff9040>" + local1032.aString261, 26, local362.anInt729);
							} else if (Static253.aBoolean361) {
								@Pc(1048) Class7_Sub1_Sub2 local1048 = Static88.anInt3954 == -1 ? null : Static113.method2182(Static88.anInt3954);
								if ((Static72.anInt1772 & 0x1) != 0 && (local1048 == null || local1032.method3591(Static88.anInt3954, local1048.anInt267) != local1048.anInt267)) {
									Static198.method3544(local362.anInt733, Static301.anInt5782, Static85.aString150, (long) local1023.anInt1050, Static277.aString348 + " -> <col=ff9040>" + local1032.aString261, 47, local362.anInt729);
								}
							} else {
								@Pc(1099) String[] local1099 = local1032.aStringArray36;
								for (local91 = 4; local91 >= 0; local91--) {
									if (local1099 != null && local1099[local91] != null) {
										@Pc(1111) byte local1111 = 0;
										if (local91 == 0) {
											local1111 = 46;
										}
										local497 = Static56.anInt1465;
										if (local91 == 1) {
											local1111 = 8;
										}
										if (local91 == 2) {
											local1111 = 45;
										}
										if (local91 == 3) {
											local1111 = 44;
										}
										if (local91 == local1032.anInt3959) {
											local497 = local1032.anInt4005;
										}
										if (local91 == 4) {
											local1111 = 24;
										}
										if (local1032.anInt3963 == local91) {
											local497 = local1032.anInt3972;
										}
										Static198.method3544(local362.anInt733, local497, local1099[local91], (long) local1023.anInt1050, "<col=ff9040>" + local1032.aString261, local1111, local362.anInt729);
									}
								}
								Static198.method3544(local362.anInt733, Static227.anInt6306, Static98.aString90, (long) local1023.anInt1050, "<col=ff9040>" + local1032.aString261, 1004, local362.anInt729);
							}
						}
					}
				}
				if (local362.aClass22_1 instanceof Interface1) {
					@Pc(1260) Interface1 local1260 = (Interface1) local362.aClass22_1;
					@Pc(1266) Class122 local1266 = Static245.method4227(local1260.method5362());
					if (local1266.anIntArray481 != null) {
						local1266 = local1266.method3234();
					}
					if (local1266 != null) {
						if (Static127.anInt2799 == 1) {
							Static198.method3544(local362.anInt733, Static232.anInt4617, Static256.aString313, Static185.method3390(local1260, local362.anInt733, local362.anInt729), Static205.aString266 + " -> <col=00ffff>" + local1266.aString232, 28, local362.anInt729);
						} else if (Static253.aBoolean361) {
							@Pc(1453) Class7_Sub1_Sub2 local1453 = Static88.anInt3954 == -1 ? null : Static113.method2182(Static88.anInt3954);
							if ((Static72.anInt1772 & 0x4) != 0 && (local1453 == null || local1266.method3232(local1453.anInt267, Static88.anInt3954) != local1453.anInt267)) {
								Static198.method3544(local362.anInt733, Static301.anInt5782, Static85.aString150, Static185.method3390(local1260, local362.anInt733, local362.anInt729), Static277.aString348 + " -> <col=00ffff>" + local1266.aString232, 59, local362.anInt729);
							}
						} else {
							@Pc(1318) String[] local1318 = local1266.aStringArray33;
							if (local1318 != null) {
								for (local83 = 4; local83 >= 0; local83--) {
									if (local1318[local83] != null) {
										@Pc(1330) short local1330 = 0;
										if (local83 == 0) {
											local1330 = 38;
										}
										local100 = Static56.anInt1465;
										if (local83 == 1) {
											local1330 = 33;
										}
										if (local83 == 2) {
											local1330 = 2;
										}
										if (local83 == 3) {
											local1330 = 19;
										}
										if (local83 == 4) {
											local1330 = 1010;
										}
										if (local1266.anInt3542 == local83) {
											local100 = local1266.anInt3550;
										}
										if (local1266.anInt3566 == local83) {
											local100 = local1266.anInt3548;
										}
										Static198.method3544(local362.anInt733, local100, local1318[local83], Static185.method3390(local1260, local362.anInt733, local362.anInt729), "<col=00ffff>" + local1266.aString232, local1330, local362.anInt729);
									}
								}
							}
							Static198.method3544(local362.anInt733, Static227.anInt6306, Static98.aString90, (long) local1266.anInt3534, "<col=00ffff>" + local1266.aString232, 1009, local362.anInt729);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method5618(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static81.method1752(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(40) int local40 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local43 >= local40);
			return Static319.method5155(local43, arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIILclient!vj;ILclient!bi;Lclient!pe;I)V")
	public static void method5619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5, @OriginalArg(7) Class89 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Class155 local11 = Static84.method1785(arg4);
		if (local11 == null || !local11.aBoolean346 || !local11.method4084()) {
			return;
		}
		@Pc(30) int local30;
		if (local11.anIntArray625 != null) {
			@Pc(28) int[] local28 = new int[local11.anIntArray625.length];
			@Pc(41) int local41;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static118.anInt6324 == 4) {
					local41 = (int) Static351.aFloat80 & 0x3FFF;
				} else {
					local41 = (int) Static351.aFloat80 + Static218.anInt4347 & 0x3FFF;
				}
				@Pc(53) int local53 = Class147.anIntArray604[local41];
				@Pc(57) int local57 = Class147.anIntArray603[local41];
				if (Static118.anInt6324 != 4) {
					local57 = local57 * 256 / (Static49.anInt1359 + 256);
					local53 = local53 * 256 / (Static49.anInt1359 + 256);
				}
				local28[local30 * 2] = arg5.anInt523 / 2 + arg2 + (local53 * (local11.anIntArray625[local30 * 2 + 1] * 4 + arg7) - -(local57 * (local11.anIntArray625[local30 * 2] * 4 + arg1)) >> 15);
				local28[local30 * 2 + 1] = arg0 + arg5.anInt515 / 2 - ((local11.anIntArray625[local30 * 2 + 1] * 4 + arg7) * local57 - local53 * (arg1 + local11.anIntArray625[local30 * 2] * 4) >> 15);
			}
			Static167.method3187(arg6, local28, local11.anInt4674, arg5.anIntArray64, arg5.anIntArray66);
			for (local41 = 0; local41 < local28.length / 2 - 1; local41++) {
				arg6.method5391(local28[local41 * 2], local28[local41 * 2 + 1], local28[(local41 + 1) * 2], local28[local41 * 2 + 3], local11.anInt4669, arg3, arg2, arg0);
			}
			arg6.method5391(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local11.anInt4669, arg3, arg2, arg0);
		}
		@Pc(261) Class52 local261 = null;
		if (local11.anInt4673 != -1) {
			local261 = local11.method4080(arg6, false);
			if (local261 != null) {
				Static49.method1084(arg7, arg1, arg3, arg2, arg0, arg5, local261);
			}
		}
		if (local11.aString294 == null) {
			return;
		}
		local30 = 0;
		if (local261 != null) {
			local30 = local261.method4134();
		}
		@Pc(296) Class94 local296 = Static36.aClass94_9;
		@Pc(298) Class208 local298 = Static226.aClass208_6;
		if (local11.anInt4663 == 1) {
			local298 = Static326.aClass208_7;
			local296 = Static341.aClass94_32;
		}
		if (local11.anInt4663 == 2) {
			local296 = Static149.aClass94_19;
			local298 = Static175.aClass208_3;
		}
		Static132.method2663(arg2, arg3, arg1, arg7, local11.aString294, arg0, local296, local11.anInt4664, arg5, local30, local298);
		return;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I")
	public static int method5620(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
	public static void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg1; local8 <= arg2; local8++) {
			Static282.method4681(arg4, arg0, Static323.anIntArrayArray55[local8], arg3);
		}
	}
}
