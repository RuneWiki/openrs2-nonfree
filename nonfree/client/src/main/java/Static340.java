import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Z")
	public static boolean aBoolean542;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString260 = "Face here";

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!ke;")
	public static final Class122 aClass122_7 = new Class122();

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString261 = "Close";

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt6563 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method5639(@OriginalArg(0) Class163 arg0) {
		if (arg0.anInt4978 == Class1_Sub5_Sub19.lb) {
			Static19.aBooleanArray1[arg0.anInt4982] = true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method5640() {
		if (Static206.aString164.length() == 0) {
			return;
		}
		Static34.method594("--> " + Static206.aString164);
		Static311.method5345(Static206.aString164, false);
		Static176.anInt3719 = 0;
		Static355.anInt6792 = 0;
		Static206.aString164 = "";
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
	public static void method5641() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(50) int local50;
		@Pc(74) int local74;
		@Pc(85) int local85;
		@Pc(180) Class10_Sub1_Sub1 local180;
		if (Static74.anInt1559 == 69) {
			local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
			local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
			local30 = Static180.anInt3776 + (local14 & 0x7);
			local36 = local23 + Static142.aClass1_Sub21_Sub2_1.method5721();
			local42 = Static142.aClass1_Sub21_Sub2_1.method5721() + local30;
			local46 = Static142.aClass1_Sub21_Sub2_1.method5691();
			local50 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local56 = Static142.aClass1_Sub21_Sub2_1.method5720() * 4;
			local62 = Static142.aClass1_Sub21_Sub2_1.method5720() * 4;
			local66 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local70 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local74 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if (local74 == 255) {
				local74 = -1;
			}
			local85 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if (local23 >= 0 && local30 >= 0 && Static43.anInt1151 > local23 && Static260.anInt5348 > local30 && local36 >= 0 && local42 >= 0 && local36 < Static43.anInt1151 && local42 < Static260.anInt5348 && local50 != 65535) {
				local36 = local36 * 128 + 64;
				local30 = local30 * 128 + 64;
				local23 = local23 * 128 + 64;
				local42 = local42 * 128 + 64;
				local180 = new Class10_Sub1_Sub1(local50, Static127.anInt2487, local23, local30, Static352.method5834(local30, local23, Static127.anInt2487) - local56, Static282.anInt3516 + local66, local70 + Static282.anInt3516, local74, local85, local46, local62);
				local180.method168(local36, Static282.anInt3516 + local66, -local62 + Static352.method5834(local42, local36, Static127.anInt2487), local42);
				Static93.aClass14_7.method300(new Class1_Sub2_Sub1(local180));
			}
		} else if (Static74.anInt1559 == 207) {
			local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
			local23 = (local14 >> 4 & 0xF) + Static157.anInt3298 * 2;
			local30 = Static180.anInt3776 * 2 + (local14 & 0xF);
			local36 = Static142.aClass1_Sub21_Sub2_1.method5721() + local23;
			local42 = local30 + Static142.aClass1_Sub21_Sub2_1.method5721();
			local46 = Static142.aClass1_Sub21_Sub2_1.method5691();
			local50 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local56 = Static142.aClass1_Sub21_Sub2_1.method5720() * 4;
			local62 = Static142.aClass1_Sub21_Sub2_1.method5720() * 4;
			local66 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local70 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local74 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if (local74 == 255) {
				local74 = -1;
			}
			local85 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if (local23 >= 0 && local30 >= 0 && local23 < 208 && local30 < 208 && local36 >= 0 && local42 >= 0 && local36 < 208 && local42 < 208 && local50 != 65535) {
				local23 = local23 * 64;
				local36 = local36 * 64;
				local42 *= 64;
				local30 *= 64;
				local180 = new Class10_Sub1_Sub1(local50, Static127.anInt2487, local23, local30, Static352.method5834(local30, local23, Static127.anInt2487) - local56, local66 - -Static282.anInt3516, Static282.anInt3516 + local70, local74, local85, local46, local62);
				local180.method168(local36, Static282.anInt3516 + local66, Static352.method5834(local42, local36, Static127.anInt2487) + -local62, local42);
				Static93.aClass14_7.method300(new Class1_Sub2_Sub1(local180));
			}
		} else if (Static74.anInt1559 == 47) {
			local14 = Static142.aClass1_Sub21_Sub2_1.method5727();
			local23 = local14 >> 2;
			local30 = local14 & 0x3;
			local36 = Static151.anIntArray300[local23];
			local42 = Static142.aClass1_Sub21_Sub2_1.method5733();
			if (local42 == 65535) {
				local42 = -1;
			}
			local46 = Static142.aClass1_Sub21_Sub2_1.method5746();
			local50 = (local46 >> 4 & 0x7) + Static157.anInt3298;
			local56 = (local46 & 0x7) + Static180.anInt3776;
			Static239.method2414(local36, Static127.anInt2487, local42, local23, local30, local56, local50);
		} else {
			if (Static74.anInt1559 == 87) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5728();
				local23 = Static142.aClass1_Sub21_Sub2_1.method5714();
				local30 = Static142.aClass1_Sub21_Sub2_1.method5728();
				local36 = Static142.aClass1_Sub21_Sub2_1.method5746();
				local42 = local36 >> 2;
				local46 = local36 & 0x3;
				@Pc(476) byte local476 = Static142.aClass1_Sub21_Sub2_1.method5732();
				local56 = Static142.aClass1_Sub21_Sub2_1.method5727();
				local62 = (local56 >> 4 & 0x7) + Static157.anInt3298;
				local66 = (local56 & 0x7) + Static180.anInt3776;
				local70 = Static142.aClass1_Sub21_Sub2_1.method5712();
				@Pc(502) byte local502 = Static142.aClass1_Sub21_Sub2_1.method5721();
				@Pc(506) byte local506 = Static142.aClass1_Sub21_Sub2_1.method5721();
				@Pc(510) byte local510 = Static142.aClass1_Sub21_Sub2_1.method5708();
				if (!Static217.aClass105_5.method4259()) {
					Static281.method4980(local506, local510, local62, local46, local70, local502, local14, local23, local476, local66, local42, local30);
				}
			}
			if (Static74.anInt1559 == 147) {
				Static142.aClass1_Sub21_Sub2_1.method5720();
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
				local30 = (local14 & 0x7) + Static180.anInt3776;
				local36 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local42 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local46 = Static142.aClass1_Sub21_Sub2_1.method5705();
				@Pc(568) String local568 = Static142.aClass1_Sub21_Sub2_1.method5701();
				Static41.method887(local42, local46, local23, local36, local30, local568);
			} else if (Static74.anInt1559 == 75) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5712();
				local23 = Static142.aClass1_Sub21_Sub2_1.method5746();
				local30 = Static157.anInt3298 + (local23 >> 4 & 0x7);
				local36 = (local23 & 0x7) + Static180.anInt3776;
				local42 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (local30 >= 0 && local36 >= 0 && local30 < Static43.anInt1151 && local36 < Static260.anInt5348) {
					Static46.method934(local36, local30, Static127.anInt2487, new Class1_Sub16(local42, local14));
					Static281.method4985(local36, local30, Static127.anInt2487);
				}
			} else if (Static74.anInt1559 == 80) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
				local30 = Static180.anInt3776 + (local14 & 0x7);
				local36 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (local36 == 65535) {
					local36 = -1;
				}
				local42 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local46 = local42 >> 4 & 0xF;
				local50 = local42 & 0x7;
				local56 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local62 = Static142.aClass1_Sub21_Sub2_1.method5720();
				if (local23 >= 0 && local30 >= 0 && local23 < Static43.anInt1151 && local30 < Static260.anInt5348) {
					local66 = local46 + 1;
					if (Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] >= local23 - local66 && Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] <= local23 + local66 && Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] >= local30 - local66 && local30 + local66 >= Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] && Static142.anInt2788 != 0 && local50 > 0 && Static58.anInt1391 < 50 && local36 != -1) {
						Static128.anIntArray341[Static58.anInt1391] = local36;
						Static190.anIntArray377[Static58.anInt1391] = local50;
						Static353.anIntArray677[Static58.anInt1391] = local56;
						Static332.aClass110Array1[Static58.anInt1391] = null;
						Static293.anIntArray569[Static58.anInt1391] = local46 + (local23 << 16) + (local30 << 8);
						Static85.anIntArray126[Static58.anInt1391] = local62;
						Static58.anInt1391++;
					}
				}
			} else if (Static74.anInt1559 == 187) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
				local30 = Static180.anInt3776 + (local14 & 0x7);
				local36 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local42 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local46 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (local23 >= 0 && local30 >= 0 && local23 < Static43.anInt1151 && local30 < Static260.anInt5348) {
					local50 = local23 * 128 + 64;
					local56 = local30 * 128 + 64;
					@Pc(888) Class10_Sub1_Sub5 local888 = new Class10_Sub1_Sub5(local36, local46, Static282.anInt3516, Static127.anInt2487, local50, Static352.method5834(local56, local50, Static127.anInt2487) - local42, local56, local23, local23, local30, local30);
					Static35.aClass14_2.method300(new Class1_Sub2_Sub9(local888));
				}
			} else if (Static74.anInt1559 == 255) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local23 = Static142.aClass1_Sub21_Sub2_1.method5720();
				Static129.method2097(local14).method1556(local23);
			} else if (Static74.anInt1559 == 184) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5743();
				local23 = local14 >> 2;
				local30 = local14 & 0x3;
				local36 = Static151.anIntArray300[local23];
				local42 = Static142.aClass1_Sub21_Sub2_1.method5733();
				local46 = Static142.aClass1_Sub21_Sub2_1.method5746();
				local50 = Static157.anInt3298 + (local46 >> 4 & 0x7);
				local56 = (local46 & 0x7) + Static180.anInt3776;
				if (local50 >= 0 && local56 >= 0 && local50 < Static43.anInt1151 && local56 < Static260.anInt5348) {
					Static231.method4186(-1, local30, local23, 0, local42, local50, Static127.anInt2487, local36, local56);
				}
			} else if (Static74.anInt1559 == 90) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5733();
				local23 = Static142.aClass1_Sub21_Sub2_1.method5743();
				local30 = (local23 >> 4 & 0x7) + Static157.anInt3298;
				local36 = (local23 & 0x7) + Static180.anInt3776;
				local42 = Static142.aClass1_Sub21_Sub2_1.method5733();
				local46 = Static142.aClass1_Sub21_Sub2_1.method5733();
				if (local30 >= 0 && local36 >= 0 && local30 < Static43.anInt1151 && Static260.anInt5348 > local36 && local42 != Static301.anInt6030) {
					Static46.method934(local36, local30, Static127.anInt2487, new Class1_Sub16(local14, local46));
					Static281.method4985(local36, local30, Static127.anInt2487);
				}
			} else if (Static74.anInt1559 == 191) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
				local30 = Static180.anInt3776 + (local14 & 0x7);
				local36 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local42 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local46 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (Static98.aClass207_12 != null && local23 >= 0 && local30 >= 0 && local23 < Static43.anInt1151 && Static260.anInt5348 > local30) {
					@Pc(1125) Class1_Sub17 local1125 = (Class1_Sub17) Static98.aClass207_12.method5555((long) (local30 << 14 | Static127.anInt2487 << 28 | local23));
					if (local1125 != null) {
						for (@Pc(1133) Class1_Sub16 local1133 = (Class1_Sub16) local1125.aClass14_8.method302(); local1133 != null; local1133 = (Class1_Sub16) local1125.aClass14_8.method313()) {
							if ((local36 & 0x7FFF) == local1133.anInt1909 && local1133.anInt1908 == local42) {
								local1133.method5796();
								local1133.anInt1908 = local46;
								Static46.method934(local30, local23, Static127.anInt2487, local1133);
								break;
							}
						}
						Static281.method4985(local30, local23, Static127.anInt2487);
					}
				}
			} else if (Static74.anInt1559 == 159) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = (local14 >> 4 & 0xF) + Static157.anInt3298 * 2;
				local30 = (local14 & 0xF) + Static180.anInt3776 * 2;
				local36 = local23 + Static142.aClass1_Sub21_Sub2_1.method5721();
				local42 = Static142.aClass1_Sub21_Sub2_1.method5721() + local30;
				local46 = Static142.aClass1_Sub21_Sub2_1.method5691();
				local50 = Static142.aClass1_Sub21_Sub2_1.method5691();
				local56 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local62 = Static142.aClass1_Sub21_Sub2_1.method5721();
				local66 = Static142.aClass1_Sub21_Sub2_1.method5720() * 4;
				local70 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local74 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local85 = Static142.aClass1_Sub21_Sub2_1.method5720();
				if (local85 == 255) {
					local85 = -1;
				}
				@Pc(1258) int local1258 = Static142.aClass1_Sub21_Sub2_1.method5720();
				if (local23 >= 0 && local30 >= 0 && local23 < 208 && local30 < 208 && local36 >= 0 && local42 >= 0 && local36 < 208 && local42 < 208 && local56 != 65535) {
					local42 = local42 * 64;
					local23 *= 64;
					local36 *= 64;
					local30 = local30 * 64;
					if (local46 != 0) {
						@Pc(1325) int local1325;
						@Pc(1330) Class10_Sub1_Sub2 local1330;
						@Pc(1315) int local1315;
						@Pc(1319) int local1319;
						if (local46 < 0) {
							local1315 = -local46 - 1;
							local1319 = local1315 & 0x7FF;
							local1325 = local1315 >> 11 & 0xF;
							if (Static301.anInt6030 == local1319) {
								local1330 = Static127.aClass10_Sub1_Sub2_Sub2_1;
							} else {
								local1330 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local1319];
							}
						} else {
							local1315 = local46 - 1;
							local1325 = local1315 >> 11 & 0xF;
							local1319 = local1315 & 0x7FF;
							local1330 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local1319];
						}
						if (local1330 != null) {
							@Pc(1362) Class118 local1362 = local1330.method3408();
							if (local1362.anIntArrayArray26 != null && local1362.anIntArrayArray26[local1325] != null) {
								local1319 = local1362.anIntArrayArray26[local1325][0];
								@Pc(1384) int local1384 = local1362.anIntArrayArray26[local1325][2];
								@Pc(1389) int local1389 = local1330.aClass212_7.method5609();
								@Pc(1393) int local1393 = Class1_Sub5_Sub15.anIntArray335[local1389];
								@Pc(1397) int local1397 = Class1_Sub5_Sub15.anIntArray333[local1389];
								@Pc(1407) int local1407 = local1384 * local1393 + local1319 * local1397 >> 15;
								@Pc(1418) int local1418 = local1384 * local1397 - local1393 * local1319 >> 15;
								local62 -= local1362.anIntArrayArray26[local1325][1];
								local30 += local1418;
								local23 += local1407;
							}
						}
					}
					@Pc(1463) Class10_Sub1_Sub1 local1463 = new Class10_Sub1_Sub1(local56, Static127.anInt2487, local23, local30, Static352.method5834(local30, local23, Static127.anInt2487) - local62, local70 + Static282.anInt3516, local74 + Static282.anInt3516, local85, local1258, local50, local66);
					local1463.method168(local36, local70 + Static282.anInt3516, Static352.method5834(local42, local36, Static127.anInt2487) - local66, local42);
					Static93.aClass14_7.method300(new Class1_Sub2_Sub1(local1463));
				}
			} else if (Static74.anInt1559 == 132) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local23 = Static157.anInt3298 + (local14 >> 4 & 0x7);
				local30 = (local14 & 0x7) + Static180.anInt3776;
				local36 = Static142.aClass1_Sub21_Sub2_1.method5743();
				local42 = local36 >> 2;
				local46 = local36 & 0x3;
				local50 = Static151.anIntArray300[local42];
				if (local23 >= 0 && local30 >= 0 && local23 < Static43.anInt1151 && local30 < Static260.anInt5348) {
					Static231.method4186(-1, local46, local42, 0, -1, local23, Static127.anInt2487, local50, local30);
				}
			} else if (Static74.anInt1559 == 144) {
				local14 = Static142.aClass1_Sub21_Sub2_1.method5727();
				local23 = (local14 >> 4 & 0x7) + Static157.anInt3298;
				local30 = Static180.anInt3776 + (local14 & 0x7);
				local36 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (local23 >= 0 && local30 >= 0 && Static43.anInt1151 > local23 && local30 < Static260.anInt5348) {
					@Pc(1605) Class1_Sub17 local1605 = (Class1_Sub17) Static98.aClass207_12.method5555((long) (Static127.anInt2487 << 28 | local30 << 14 | local23));
					if (local1605 != null) {
						for (@Pc(1613) Class1_Sub16 local1613 = (Class1_Sub16) local1605.aClass14_8.method302(); local1613 != null; local1613 = (Class1_Sub16) local1605.aClass14_8.method313()) {
							if (local1613.anInt1909 == (local36 & 0x7FFF)) {
								local1613.method5796();
								break;
							}
						}
						if (local1605.aClass14_8.method308()) {
							local1605.method5796();
						}
						Static281.method4985(local30, local23, Static127.anInt2487);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	public static int method5642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && local15.anIntArray3.length > arg0) {
			return local15.anIntArray3[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public static void method5643() {
		Static211.aClass37_69.method920(5);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method5645() {
		if (Static318.aFloat77 < 1024.0F) {
			Static318.aFloat77 = 1024.0F;
		}
		while (Static143.aFloat21 >= 16384.0F) {
			Static143.aFloat21 -= 16384.0F;
		}
		if (Static318.aFloat77 > 3072.0F) {
			Static318.aFloat77 = 3072.0F;
		}
		while (Static143.aFloat21 < 0.0F) {
			Static143.aFloat21 += 16384.0F;
		}
		@Pc(41) int local41 = Static29.anInt545 >> 7;
		@Pc(45) int local45 = Static163.anInt3374 >> 7;
		@Pc(51) int local51 = Static352.method5834(Static163.anInt3374, Static29.anInt545, Static127.anInt2487);
		@Pc(53) int local53 = 0;
		@Pc(71) int local71;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local71 = local41 - 4; local71 <= local41 + 4; local71++) {
				for (@Pc(77) int local77 = local45 - 4; local77 <= local45 + 4; local77++) {
					@Pc(81) int local81 = Static127.anInt2487;
					if (local81 < 3 && Static141.method2321(local71, local77)) {
						local81++;
					}
					@Pc(92) int local92 = 0;
					if (Static223.aByteArrayArrayArray3 != null && Static223.aByteArrayArrayArray3[local81] != null) {
						local92 = (Static223.aByteArrayArrayArray3[local81][local71][local77] & 0xFF) * 8;
					}
					@Pc(122) int local122 = local51 + local92 - Static263.aClass12Array2[local81].method2704(local71, local77);
					if (local122 > local53) {
						local53 = local122;
					}
				}
			}
		}
		local71 = local53 * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (local71 > Static109.anInt2092) {
			Static109.anInt2092 += (local71 - Static109.anInt2092) / 24;
		} else if (local71 < Static109.anInt2092) {
			Static109.anInt2092 += (local71 - Static109.anInt2092) / 80;
		}
	}
}
