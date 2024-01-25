import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ko", name = "Ab", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_92 = new Class209("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ko", name = "oc", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ko", name = "uc", descriptor = "[B")
	public static final byte[] aByteArray78 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	public static void method3299() {
		@Pc(3) Class112[] local3 = Class267.aClass112Array1;
		synchronized (Class267.aClass112Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class267.aClass112Array1.length; local7++) {
				Class267.aClass112Array1[local7] = new Class112();
				Static98.anIntArray184[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I")
	public static int method3302(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lclient!qm;")
	public static Class2_Sub5_Sub13 method3306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub5_Sub13 local15 = (Class2_Sub5_Sub13) Static227.aClass163_28.method3769((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class2_Sub5_Sub13(arg1, arg0);
			Static227.aClass163_28.method3764(local15.aLong227, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ya;IIB)V")
	public static void method3307(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static124.anInt6124 == 0 || Static12.anInt292 == 0) {
			return;
		}
		arg0.H(Static217.anInt4191, Static95.anInt2335, Static124.anInt6124, Static12.anInt292);
		arg0.OA(Static249.anInt4713, Static150.anInt4216, Static124.anInt6124, Static12.anInt292);
		@Pc(39) Class35 local39 = arg0.method4467();
		local39.s(Static64.anInt1451, Static454.anInt7447, Static291.anInt5226, Static289.anInt5203, Static233.anInt4503, Static373.anInt4899);
		arg0.ea(local39);
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static263.aClass64Array2 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			@Pc(59) int local59 = arg0.a();
			local68 = (arg1 - Static217.anInt4191) * local59 / Static124.anInt6124;
			local77 = (arg2 - Static95.anInt2335) * local59 / Static12.anInt292;
			local80 = arg0.YA();
			local88 = (arg1 - Static217.anInt4191) * local80 / Static124.anInt6124;
			local97 = local80 * (arg2 - Static95.anInt2335) / Static12.anInt292;
			local112 = new int[] { local68, local77, local59 };
			local39.m(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local80 };
			local39.m(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			@Pc(162) int local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local112[2] + (float) local162 * local135);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && Static229.anInt4427 > local179 && local194 < Static379.anInt6422) {
					@Pc(210) int local210 = Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89;
					if (local210 < 3 && (Static227.aByteArrayArrayArray8[1][local179][local194] & 0x2) != 0) {
						local210++;
					}
					if ((float) Static263.aClass64Array2[local210].a(local175, local190) < local135 * (float) local153 + (float) local112[1]) {
						local54 = local175 + (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() - 1 << 6) >> 7;
						local56 = local190 + (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() - 1 << 6) >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Static385.aBoolean441 && (Static201.anInt3539 & 0x40) != 0) {
					@Pc(337) Class68 local337 = Static259.method3899(Static154.anInt3161, Static142.anInt3047);
					if (local337 == null) {
						Static237.method3667();
					} else {
						Static172.method2802(51, Static323.anInt5618, true, 0L, Static118.aString34, local54, " ->", -1, false, local56);
					}
				} else {
					if (Static423.aClass10_43 == Static320.aClass10_28) {
						Static172.method2802(44, -1, true, 0L, Static13.aClass209_12.method4562(Static388.anInt6533), local54, "", -1, false, local56);
					}
					Static172.method2802(59, Static417.anInt7005, true, 0L, Static95.aString28, local54, "", -1, false, local56);
				}
			}
		}
		@Pc(357) Class112 local357 = Static222.aClass112_8;
		for (@Pc(362) Class8_Sub5 local362 = (Class8_Sub5) local357.method2553(); local362 != null; local362 = (Class8_Sub5) local357.method2550()) {
			if (Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local362.anInt4583 && local362.method3694(arg0, arg2, arg1)) {
				@Pc(483) int local483;
				if (local362.aClass3_1 instanceof Class3_Sub2_Sub1_Sub2) {
					@Pc(388) Class3_Sub2_Sub1_Sub2 local388 = (Class3_Sub2_Sub1_Sub2) local362.aClass3_1;
					local68 = local388.method4935();
					if ((local68 & 0x1) == 0 && (local388.anInt6119 & 0x7F) == 0 && (local388.anInt6121 & 0x7F) == 0 || (local68 & 0x1) == 1 && (local388.anInt6119 & 0x7F) == 64 && (local388.anInt6121 & 0x7F) == 64) {
						local77 = local388.anInt6119 - (local388.method4935() - 1 << 6);
						local80 = local388.anInt6121 - (local388.method4935() - 1 << 6);
						@Pc(495) int local495;
						for (local88 = 0; local88 < Static62.anInt1371; local88++) {
							@Pc(457) Class3_Sub2_Sub1_Sub1 local457 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local88]];
							if (local457 != null && Static131.anInt2821 != local457.anInt6196 && local457.aBoolean428) {
								local483 = local457.anInt6119 - (local457.aClass65_1.anInt2128 - 1 << 6);
								local495 = local457.anInt6121 - (local457.aClass65_1.anInt2128 - 1 << 6);
								if (local483 >= local77 && local457.aClass65_1.anInt2128 <= local388.method4935() - (local483 - local77 >> 7) && local80 <= local495 && local457.aClass65_1.anInt2128 <= local388.method4935() - (local495 - local80 >> 7)) {
									Static163.method5139(local457, local362.anInt4583 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89);
									local457.anInt6196 = Static131.anInt2821;
								}
							}
						}
						local97 = Static337.anInt5822;
						local112 = Static203.anIntArray384;
						for (local495 = 0; local495 < local97; local495++) {
							@Pc(572) Class3_Sub2_Sub1_Sub2 local572 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local112[local495]];
							if (local572 != null && Static131.anInt2821 != local572.anInt6196 && local572 != local388 && local572.aBoolean428) {
								local144 = local572.anInt6119 - (local572.method4935() - 1 << 6);
								local153 = local572.anInt6121 - (local572.method4935() - 1 << 6);
								if (local77 <= local144 && local572.method4935() <= local388.method4935() - (local144 - local77 >> 7) && local80 <= local153 && local572.method4935() <= local388.method4935() - (local153 - local80 >> 7)) {
									Static412.method5428(local572, local362.anInt4583 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89);
									local572.anInt6196 = Static131.anInt2821;
								}
							}
						}
					}
					if (local388.anInt6196 == Static131.anInt2821) {
						continue;
					}
					Static412.method5428(local388, local362.anInt4583 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89);
					local388.anInt6196 = Static131.anInt2821;
				}
				if (local362.aClass3_1 instanceof Class3_Sub2_Sub1_Sub1) {
					@Pc(707) Class3_Sub2_Sub1_Sub1 local707 = (Class3_Sub2_Sub1_Sub1) local362.aClass3_1;
					if (local707.aClass65_1 != null) {
						if ((local707.aClass65_1.anInt2128 & 0x1) == 0 && (local707.anInt6119 & 0x7F) == 0 && (local707.anInt6121 & 0x7F) == 0 || (local707.aClass65_1.anInt2128 & 0x1) == 1 && (local707.anInt6119 & 0x7F) == 64 && (local707.anInt6121 & 0x7F) == 64) {
							local68 = local707.anInt6119 - (local707.aClass65_1.anInt2128 - 1 << 6);
							local77 = local707.anInt6121 - (local707.aClass65_1.anInt2128 - 1 << 6);
							for (local80 = 0; local80 < Static62.anInt1371; local80++) {
								@Pc(788) Class3_Sub2_Sub1_Sub1 local788 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local80]];
								if (local788 != null && Static131.anInt2821 != local788.anInt6196 && local788 != local707 && local788.aBoolean428) {
									local97 = local788.anInt6119 - (local788.aClass65_1.anInt2128 - 1 << 6);
									local483 = local788.anInt6121 - (local788.aClass65_1.anInt2128 - 1 << 6);
									if (local97 >= local68 && local707.aClass65_1.anInt2128 - (local97 - local68 >> 7) >= local788.aClass65_1.anInt2128 && local77 <= local483 && local707.aClass65_1.anInt2128 - (local483 - local77 >> 7) >= local788.aClass65_1.anInt2128) {
										Static163.method5139(local788, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 != local362.anInt4583);
										local788.anInt6196 = Static131.anInt2821;
									}
								}
							}
							local88 = Static337.anInt5822;
							@Pc(896) int[] local896 = Static203.anIntArray384;
							for (local483 = 0; local483 < local88; local483++) {
								@Pc(906) Class3_Sub2_Sub1_Sub2 local906 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local896[local483]];
								if (local906 != null && Static131.anInt2821 != local906.anInt6196 && local906.aBoolean428) {
									@Pc(932) int local932 = local906.anInt6119 - (local906.method4935() - 1 << 6);
									local144 = local906.anInt6121 - (local906.method4935() - 1 << 6);
									if (local68 <= local932 && local906.method4935() <= local707.aClass65_1.anInt2128 - (local932 - local68 >> 7) && local77 <= local144 && local906.method4935() <= local707.aClass65_1.anInt2128 - (local144 - local77 >> 7)) {
										Static412.method5428(local906, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 != local362.anInt4583);
										local906.anInt6196 = Static131.anInt2821;
									}
								}
							}
						}
						if (local707.anInt6196 == Static131.anInt2821) {
							continue;
						}
						Static163.method5139(local707, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 != local362.anInt4583);
						local707.anInt6196 = Static131.anInt2821;
					}
				}
				if (local362.aClass3_1 instanceof Class3_Sub4_Sub1) {
					@Pc(1049) Class2_Sub14 local1049 = (Class2_Sub14) Static132.aClass163_13.method3769((long) (local362.anInt4585 | local362.anInt4583 << 28 | local362.anInt4587 << 14));
					if (local1049 != null) {
						for (@Pc(1057) Class2_Sub31 local1057 = (Class2_Sub31) local1049.aClass14_22.method302(); local1057 != null; local1057 = (Class2_Sub31) local1049.aClass14_22.method304()) {
							@Pc(1065) Class45 local1065 = Static318.aClass144_6.method3265(local1057.anInt5175);
							if (!Static385.aBoolean441) {
								if (Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local362.anInt4583) {
									@Pc(1079) String[] local1079 = local1065.aStringArray4;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1079 != null && local1079[local88] != null) {
											@Pc(1091) byte local1091 = 0;
											local483 = Static238.anInt4575;
											if (local88 == 0) {
												local1091 = 17;
											}
											if (local88 == 1) {
												local1091 = 23;
											}
											if (local88 == 2) {
												local1091 = 20;
											}
											if (local88 == 3) {
												local1091 = 3;
											}
											if (local88 == local1065.anInt1120) {
												local483 = local1065.anInt1114;
											}
											if (local88 == 4) {
												local1091 = 19;
											}
											if (local1065.anInt1074 == local88) {
												local483 = local1065.anInt1119;
											}
											Static172.method2802(local1091, local483, true, (long) local1057.anInt5175, local1079[local88], local362.anInt4585, "<col=ff9040>" + local1065.aString6, -1, false, local362.anInt4587);
										}
									}
								}
								Static172.method2802(1007, Static161.anInt6992, true, (long) local1057.anInt5175, Static84.aClass209_45.method4562(Static388.anInt6533), local362.anInt4585, "<col=ff9040>" + local1065.aString6, -1, local362.anInt4583 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, local362.anInt4587);
							} else if (local362.anInt4583 == Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89) {
								@Pc(1222) Class132 local1222 = Static404.anInt6738 == -1 ? null : Static186.aClass161_1.method3729(Static404.anInt6738);
								if ((Static201.anInt3539 & 0x1) != 0 && (local1222 == null || local1065.method873(Static404.anInt6738, local1222.anInt3608) != local1222.anInt3608)) {
									Static172.method2802(18, Static323.anInt5618, true, (long) local1057.anInt5175, Static118.aString34, local362.anInt4585, Static254.aString46 + " -> <col=ff9040>" + local1065.aString6, -1, false, local362.anInt4587);
								}
							}
						}
					}
				}
				if (local362.aClass3_1 instanceof Interface6) {
					@Pc(1283) Interface6 local1283 = (Interface6) local362.aClass3_1;
					@Pc(1290) Class134 local1290 = Static118.aClass165_2.method3799(local1283.method5153());
					if (local1290.anIntArray322 != null) {
						local1290 = local1290.method2969(Static344.aClass108_1);
					}
					if (local1290 != null) {
						if (!Static385.aBoolean441) {
							if (Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local362.anInt4583) {
								@Pc(1388) String[] local1388 = local1290.aStringArray25;
								if (local1388 != null) {
									for (local80 = 4; local80 >= 0; local80--) {
										if (local1388[local80] != null) {
											@Pc(1400) short local1400 = 0;
											if (local80 == 0) {
												local1400 = 6;
											}
											local97 = Static238.anInt4575;
											if (local80 == 1) {
												local1400 = 45;
											}
											if (local80 == 2) {
												local1400 = 58;
											}
											if (local80 == 3) {
												local1400 = 48;
											}
											if (local1290.anInt3638 == local80) {
												local97 = local1290.anInt3623;
											}
											if (local80 == 4) {
												local1400 = 1011;
											}
											if (local1290.anInt3627 == local80) {
												local97 = local1290.anInt3631;
											}
											Static172.method2802(local1400, local97, true, Static55.method919(local362.anInt4585, local1283, local362.anInt4587), local1388[local80], local362.anInt4585, "<col=00ffff>" + local1290.aString41, -1, false, local362.anInt4587);
										}
									}
								}
							}
							Static172.method2802(1006, Static161.anInt6992, true, (long) local1290.anInt3648, Static84.aClass209_45.method4562(Static388.anInt6533), local362.anInt4585, "<col=00ffff>" + local1290.aString41, -1, local362.anInt4583 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, local362.anInt4587);
						} else if (local362.anInt4583 == Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89) {
							@Pc(1322) Class132 local1322 = Static404.anInt6738 == -1 ? null : Static186.aClass161_1.method3729(Static404.anInt6738);
							if ((Static201.anInt3539 & 0x4) != 0 && (local1322 == null || local1290.method2980(local1322.anInt3608, Static404.anInt6738) != local1322.anInt3608)) {
								Static172.method2802(10, Static323.anInt5618, true, Static55.method919(local362.anInt4585, local1283, local362.anInt4587), Static118.aString34, local362.anInt4585, Static254.aString46 + " -> <col=00ffff>" + local1290.aString41, -1, false, local362.anInt4587);
							}
						}
					}
				}
			}
		}
	}
}
