import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!am;")
	public static Class11 aClass11_10;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public static int anInt409;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)V")
	public static void method393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static103.anIntArray295[arg1] = arg0;
		@Pc(19) Class4_Sub32 local19 = (Class4_Sub32) Static264.aClass198_22.method5261((long) arg1);
		if (local19 == null) {
			local19 = new Class4_Sub32(Static274.method4763() + 500L);
			Static264.aClass198_22.method5267((long) arg1, local19);
		} else {
			local19.aLong165 = Static274.method4763() + 500L;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!vm;)Z")
	public static boolean method394(@OriginalArg(1) int arg0, @OriginalArg(2) Class92 arg1) {
		@Pc(11) int local11 = (Static92.anInt2048 - 104) / 2;
		@Pc(17) int local17 = (Static290.anInt5893 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static213.method3693(local25, local29, arg0, local21)) {
						local40 = local29;
						if (Static288.method4932(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static229.method3917(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static248.aClass60_22 = arg1.method4537(local84, 512, 512, 512);
		Static66.method1242();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 228 | 0xFF000000;
		@Pc(154) int local154 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(173) int local173 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(177) boolean[][] local177 = new boolean[Static108.anInt2386][Static108.anInt2386];
		@Pc(188) int local188;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(271) int local271;
		@Pc(277) int local277;
		@Pc(281) int local281;
		@Pc(300) int local300;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static108.anInt2386) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static108.anInt2386) {
				arg1.method4459(0, 0, Static108.anInt2386 * 4, Static108.anInt2386 * 4);
				arg1.method4529(-16777216);
				for (local205 = arg0; local205 <= 3; local205++) {
					for (local209 = 0; local209 < Static108.anInt2386; local209++) {
						for (local213 = 0; local213 < Static108.anInt2386; local213++) {
							local177[local209][local213] = Static213.method3693(local188 + local213, local205, arg0, local184 + local209);
						}
					}
					Static310.aClass26Array4[local205].method5004(local184, local188, Static108.anInt2386 + local184, local188 + Static108.anInt2386, local177);
					if (!Static191.aBoolean340) {
						for (local213 = -4; local213 < Static108.anInt2386; local213++) {
							for (local271 = -4; local271 < Static108.anInt2386; local271++) {
								local277 = local213 + local184;
								local281 = local188 + local271;
								if (local11 <= local277 && local17 <= local281 && Static213.method3693(local281, local205, arg0, local277)) {
									local300 = local205;
									if (Static288.method4932(local281, local277)) {
										local300 = local205 - 1;
									}
									if (local300 >= 0) {
										Static273.method4755(arg1, local300, local213 * 4, (Static108.anInt2386 - local271) * 4 - 4, local277, local40, local281, local154);
									}
								}
							}
						}
					}
				}
				if (Static191.aBoolean340) {
					@Pc(354) Class174 local354 = Static345.aClass174Array1[arg0];
					for (local213 = 0; local213 < Static108.anInt2386; local213++) {
						for (local271 = 0; local271 < Static108.anInt2386; local271++) {
							local277 = local213 + local184;
							local281 = local188 + local271;
							local300 = local354.anIntArrayArray53[local277 - local354.anInt5481][local281 - local354.anInt5486];
							if ((local300 & 0x40240000) != 0) {
								arg1.method4502((Static108.anInt2386 - local271) * 4 - 4, 4, local213 * 4, 4, -1713569622);
							} else if ((local300 & 0x800000) != 0) {
								arg1.method4481((Static108.anInt2386 - local271) * 4 - 4, -1713569622, 4, local213 * 4);
							} else if ((local300 & 0x2000000) != 0) {
								arg1.method4509((Static108.anInt2386 - local271) * 4 - 4, -1713569622, 4, local213 * 4 + 3);
							} else if ((local300 & 0x8000000) != 0) {
								arg1.method4481((Static108.anInt2386 - local271) * 4 + 3 - 4, -1713569622, 4, local213 * 4);
							} else if ((local300 & 0x20000000) != 0) {
								arg1.method4509((Static108.anInt2386 - local271) * 4 - 4, -1713569622, 4, local213 * 4);
							}
						}
					}
				}
				arg1.method4436(0, 0, Static108.anInt2386 * 4, Static108.anInt2386 * 4, local173, 2);
				Static248.aClass60_22.method5677((local184 - local11) * 4 + 48, -(Static108.anInt2386 * 4) + -((local188 - local17) * 4) + 464, Static108.anInt2386 * 4, Static108.anInt2386 * 4);
			}
		}
		arg1.method4467();
		arg1.method4529(-16777215);
		Static240.method4159();
		Static146.anInt3284 = 0;
		Static78.aClass130_28.method3514();
		if (!Static191.aBoolean340) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local205 = local17; local205 < local17 + 104; local205++) {
					for (local209 = arg0; local209 <= arg0 + 1 && local209 <= 3; local209++) {
						if (Static213.method3693(local205, local209, arg0, local188)) {
							@Pc(625) Interface5 local625 = (Interface5) Static5.method210(local209, local188, local205);
							if (local625 == null) {
								local625 = (Interface5) Static166.method3153(local209, local188, local205, io.class);
							}
							if (local625 == null) {
								local625 = (Interface5) Static122.method2458(local209, local188, local205);
							}
							if (local625 == null) {
								local625 = (Interface5) Static186.method4780(local209, local188, local205);
							}
							if (local625 != null) {
								@Pc(665) Class56 local665 = Static320.method5290(local625.method4729());
								if (!local665.aBoolean106 || Static197.aBoolean352) {
									local277 = local665.anInt1308;
									if (local665.anIntArray151 != null) {
										for (local281 = 0; local281 < local665.anIntArray151.length; local281++) {
											if (local665.anIntArray151[local281] != -1) {
												@Pc(693) Class56 local693 = Static320.method5290(local665.anIntArray151[local281]);
												if (local693.anInt1308 >= 0) {
													local277 = local693.anInt1308;
												}
											}
										}
									}
									if (local277 >= 0) {
										@Pc(715) boolean local715 = false;
										if (local277 >= 0) {
											@Pc(721) Class139 local721 = Static20.method377(local277);
											if (local721 != null && local721.aBoolean373) {
												local715 = true;
											}
										}
										local300 = local188;
										@Pc(732) int local732 = local205;
										if (local715) {
											@Pc(739) int[][] local739 = Static345.aClass174Array1[local209].anIntArrayArray53;
											@Pc(744) int local744 = Static345.aClass174Array1[local209].anInt5481;
											@Pc(749) int local749 = Static345.aClass174Array1[local209].anInt5486;
											for (@Pc(751) int local751 = 0; local751 < 10; local751++) {
												@Pc(758) int local758 = (int) (Math.random() * 4.0D);
												if (local758 == 0 && local300 > local11 && local188 - 3 < local300 && (local739[local300 - local744 - 1][local732 - local749] & 0x2C0108) == 0) {
													local300--;
												}
												if (local758 == 1 && local11 + 104 - 1 > local300 && local300 < local188 + 3 && (local739[local300 + 1 - local744][local732 - local749] & 0x2C0180) == 0) {
													local300++;
												}
												if (local758 == 2 && local732 > local17 && local732 > local205 - 3 && (local739[local300 - local744][local732 - local749 - 1] & 0x2C0102) == 0) {
													local732--;
												}
												if (local758 == 3 && local732 < local17 + 104 - 1 && local205 + 3 > local732 && (local739[local300 - local744][local732 + 1 - local749] & 0x2C0120) == 0) {
													local732++;
												}
											}
										}
										Static277.anIntArray457[Static146.anInt3284] = local665.anInt1346;
										Static71.anIntArray155[Static146.anInt3284] = local300;
										Static48.anIntArray121[Static146.anInt3284] = local732;
										Static146.anInt3284++;
									}
								}
							}
						}
					}
				}
			}
			if (Static200.aClass158_3 != null) {
				Static266.aClass11_113.anInt298 = 1;
				Static167.method3168(1024, 64);
				for (local205 = 0; local205 < Static200.aClass158_3.anInt5149; local205++) {
					local209 = Static200.aClass158_3.anIntArray422[local205];
					if (Static279.anInt5645 == local209 >> 28) {
						local213 = (local209 >> 14 & 0x3FFF) - Static10.anInt231;
						local271 = (local209 & 0x3FFF) - Static81.anInt1732;
						if (local213 >= 0 && Static92.anInt2048 > local213 && local271 >= 0 && local271 < Static290.anInt5893) {
							Static78.aClass130_28.method3510(new Class4_Sub36(local205));
						} else {
							@Pc(1008) Class139 local1008 = Static20.method377(Static200.aClass158_3.anIntArray423[local205]);
							if (local1008.anIntArray365 != null && local1008.anInt4371 + local213 >= 0 && local213 + local1008.anInt4373 < Static92.anInt2048 && local1008.anInt4362 + local271 >= 0 && Static290.anInt5893 > local1008.anInt4376 + local271) {
								Static78.aClass130_28.method3510(new Class4_Sub36(local205));
							}
						}
					}
				}
				Static167.method3168(128, 64);
				Static266.aClass11_113.anInt298 = 2;
				Static266.aClass11_113.method285();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!am;Lclient!am;Lclient!am;Lclient!s;B)Z")
	public static boolean method395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class4_Sub13_Sub3 arg3) {
		Static240.aClass11_102 = arg0;
		Static233.aClass11_96 = arg1;
		Static129.aClass4_Sub13_Sub3_1 = arg3;
		Static143.aClass11_66 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!uh;")
	public static Class201 method397(@OriginalArg(0) int arg0) {
		@Pc(5) Class154 local5 = Static319.aClass154_99;
		@Pc(14) Class201 local14;
		synchronized (Static319.aClass154_99) {
			local14 = (Class201) Static319.aClass154_99.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(35) byte[] local35 = Static102.aClass11_47.method288(arg0, 16);
		local14 = new Class201();
		if (local35 != null) {
			local14.method5316(new Class4_Sub7(local35));
		}
		@Pc(50) Class154 local50 = Static319.aClass154_99;
		synchronized (Static319.aClass154_99) {
			Static319.aClass154_99.method4221((long) arg0, local14);
			return local14;
		}
	}
}
