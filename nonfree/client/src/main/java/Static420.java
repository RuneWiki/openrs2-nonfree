import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt7596;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray128;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Lclient!ns;")
	public static Class166 aClass166_303;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_273 = new Class186(60, 6);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
	public static final int[] anIntArray672 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIILclient!qa;)V")
	public static void method5855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static150.anInt2846 == 0 || Static96.anInt2086 == 0) {
			return;
		}
		arg2.GA(Static144.anInt2716, Static130.anInt2604, Static150.anInt2846, Static96.anInt2086);
		arg2.pa(Static214.anInt4022, Static144.anInt2718, Static150.anInt2846, Static96.anInt2086);
		@Pc(40) Class116 local40 = arg2.method4632();
		local40.Q(Static120.anInt2494, Static233.anInt4249, Static152.anInt2879, Static75.anInt1777, Static145.anInt2733, Static403.anInt6869);
		arg2.m(local40);
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(90) int local90;
		@Pc(99) int local99;
		@Pc(114) int[] local114;
		@Pc(146) int local146;
		@Pc(155) int local155;
		if (Static422.aClass146Array3 != null) {
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			@Pc(60) int local60 = arg2.d();
			local69 = local60 * (arg0 - Static144.anInt2716) / Static150.anInt2846;
			local78 = local60 * (arg1 - Static130.anInt2604) / Static96.anInt2086;
			local81 = arg2.W();
			local90 = (arg0 - Static144.anInt2716) * local81 / Static150.anInt2846;
			local99 = (arg1 - Static130.anInt2604) * local81 / Static96.anInt2086;
			local114 = new int[] { local69, local78, local60 };
			local40.X(local114);
			@Pc(132) int[] local132 = new int[] { local90, local99, local81 };
			local40.X(local132);
			@Pc(137) float local137 = 0.0F;
			local146 = local132[0] - local114[0];
			local155 = local132[1] - local114[1];
			@Pc(164) int local164 = local132[2] - local114[2];
			while (local137 < 1.0F) {
				@Pc(177) int local177 = (int) ((float) local146 * local137 + (float) local114[0]);
				@Pc(181) int local181 = local177 >> 7;
				@Pc(192) int local192 = (int) (local137 * (float) local164 + (float) local114[2]);
				@Pc(196) int local196 = local192 >> 7;
				if (local181 > 0 && local196 > 0 && local181 < Static126.anInt2569 && local196 < Static190.anInt3697) {
					@Pc(209) int local209 = Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86;
					if (local209 < 3 && (Static327.aByteArrayArrayArray11[1][local181][local196] & 0x2) != 0) {
						local209++;
					}
					if ((float) Static422.aClass146Array3[local209].va(local177, local192) < (float) local114[1] + local137 * (float) local155) {
						local55 = (Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() - 1 << 6) + local177 >> 7;
						local57 = (Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() - 1 << 6) + local192 >> 7;
						break;
					}
				}
				local137 = (float) ((double) local137 + 0.01D);
			}
			if (local55 != -1 && local57 != -1) {
				if (Static222.aBoolean305 && (Static234.anInt4263 & 0x40) != 0) {
					@Pc(295) Class126 local295 = Static299.method4154(Static8.anInt336, Static14.anInt5474);
					if (local295 == null) {
						Static1.method29();
					} else {
						Static191.method2806(local55, 0L, false, Static195.anInt2838, true, Static279.aString50, " ->", local57, -1, 58);
					}
				} else {
					if (Static441.aClass95_5 == Static128.aClass95_1) {
						Static191.method2806(local55, 0L, false, -1, true, Static249.aClass242_62.method5320(Static139.anInt2670), "", local57, -1, 20);
					}
					Static191.method2806(local55, 0L, false, Static138.anInt2663, true, Static119.aString22, "", local57, -1, 48);
				}
			}
		}
		@Pc(351) Class27 local351 = Static43.aClass27_2;
		for (@Pc(356) Class41_Sub6 local356 = (Class41_Sub6) local351.method730(); local356 != null; local356 = (Class41_Sub6) local351.method735()) {
			if (local356.anInt5456 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 && local356.method4194(arg1, arg2, arg0)) {
				@Pc(487) int local487;
				if (local356.aClass6_1 instanceof Class6_Sub2_Sub1_Sub1) {
					@Pc(382) Class6_Sub2_Sub1_Sub1 local382 = (Class6_Sub2_Sub1_Sub1) local356.aClass6_1;
					local69 = local382.method4763();
					if ((local69 & 0x1) == 0 && (local382.anInt6062 & 0x7F) == 0 && (local382.anInt6061 & 0x7F) == 0 || (local69 & 0x1) == 1 && (local382.anInt6062 & 0x7F) == 64 && (local382.anInt6061 & 0x7F) == 64) {
						local78 = local382.anInt6062 - (local382.method4763() - 1 << 6);
						local81 = local382.anInt6061 - (local382.method4763() - 1 << 6);
						@Pc(498) int local498;
						for (local90 = 0; local90 < Static249.anInt4520; local90++) {
							@Pc(460) Class6_Sub2_Sub1_Sub2 local460 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local90]];
							if (local460 != null && local460.anInt6108 != Static175.anInt3261 && local460.aBoolean422) {
								local487 = local460.anInt6062 - (local460.aClass243_1.anInt6902 - 1 << 6);
								local498 = local460.anInt6061 - (local460.aClass243_1.anInt6902 - 1 << 6);
								if (local487 >= local78 && local460.aClass243_1.anInt6902 <= local382.method4763() - (local487 - local78 >> 7) && local81 <= local498 && local460.aClass243_1.anInt6902 <= local382.method4763() - (local498 - local81 >> 7)) {
									Static336.method4595(local356.anInt5456 != Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, local460);
									local460.anInt6108 = Static175.anInt3261;
								}
							}
						}
						local99 = Static58.anInt4352;
						local114 = Static144.anIntArray186;
						for (local498 = 0; local498 < local99; local498++) {
							@Pc(577) Class6_Sub2_Sub1_Sub1 local577 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local114[local498]];
							if (local577 != null && local577.anInt6108 != Static175.anInt3261 && local382 != local577 && local577.aBoolean422) {
								local146 = local577.anInt6062 - (local577.method4763() - 1 << 6);
								local155 = local577.anInt6061 - (local577.method4763() - 1 << 6);
								if (local78 <= local146 && local577.method4763() <= local382.method4763() - (local146 - local78 >> 7) && local155 >= local81 && local577.method4763() <= local382.method4763() - (local155 - local81 >> 7)) {
									Static363.method5032(local577, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local356.anInt5456);
									local577.anInt6108 = Static175.anInt3261;
								}
							}
						}
					}
					if (local382.anInt6108 == Static175.anInt3261) {
						continue;
					}
					Static363.method5032(local382, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local356.anInt5456);
					local382.anInt6108 = Static175.anInt3261;
				}
				if (local356.aClass6_1 instanceof Class6_Sub2_Sub1_Sub2) {
					@Pc(713) Class6_Sub2_Sub1_Sub2 local713 = (Class6_Sub2_Sub1_Sub2) local356.aClass6_1;
					if (local713.aClass243_1 != null) {
						if ((local713.aClass243_1.anInt6902 & 0x1) == 0 && (local713.anInt6062 & 0x7F) == 0 && (local713.anInt6061 & 0x7F) == 0 || (local713.aClass243_1.anInt6902 & 0x1) == 1 && (local713.anInt6062 & 0x7F) == 64 && (local713.anInt6061 & 0x7F) == 64) {
							local69 = local713.anInt6062 - (local713.aClass243_1.anInt6902 - 1 << 6);
							local78 = local713.anInt6061 - (local713.aClass243_1.anInt6902 - 1 << 6);
							for (local81 = 0; local81 < Static249.anInt4520; local81++) {
								@Pc(795) Class6_Sub2_Sub1_Sub2 local795 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local81]];
								if (local795 != null && local795.anInt6108 != Static175.anInt3261 && local795 != local713 && local795.aBoolean422) {
									local99 = local795.anInt6062 - (local795.aClass243_1.anInt6902 - 1 << 6);
									local487 = local795.anInt6061 - (local795.aClass243_1.anInt6902 - 1 << 6);
									if (local99 >= local69 && local795.aClass243_1.anInt6902 <= local713.aClass243_1.anInt6902 - (local99 - local69 >> 7) && local78 <= local487 && local713.aClass243_1.anInt6902 - (local487 - local78 >> 7) >= local795.aClass243_1.anInt6902) {
										Static336.method4595(local356.anInt5456 != Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, local795);
										local795.anInt6108 = Static175.anInt3261;
									}
								}
							}
							local90 = Static58.anInt4352;
							@Pc(903) int[] local903 = Static144.anIntArray186;
							for (local487 = 0; local487 < local90; local487++) {
								@Pc(913) Class6_Sub2_Sub1_Sub1 local913 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local903[local487]];
								if (local913 != null && Static175.anInt3261 != local913.anInt6108 && local913.aBoolean422) {
									@Pc(940) int local940 = local913.anInt6062 - (local913.method4763() - 1 << 6);
									local146 = local913.anInt6061 - (local913.method4763() - 1 << 6);
									if (local940 >= local69 && local913.method4763() <= local713.aClass243_1.anInt6902 - (local940 - local69 >> 7) && local146 >= local78 && local913.method4763() <= local713.aClass243_1.anInt6902 - (local146 - local78 >> 7)) {
										Static363.method5032(local913, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local356.anInt5456);
										local913.anInt6108 = Static175.anInt3261;
									}
								}
							}
						}
						if (local713.anInt6108 == Static175.anInt3261) {
							continue;
						}
						Static336.method4595(Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local356.anInt5456, local713);
						local713.anInt6108 = Static175.anInt3261;
					}
				}
				if (local356.aClass6_1 instanceof Class6_Sub5_Sub1) {
					@Pc(1065) Class4_Sub20 local1065 = (Class4_Sub20) Static437.aClass196_41.method4477((long) (local356.anInt5455 | local356.anInt5459 << 14 | local356.anInt5456 << 28));
					if (local1065 != null) {
						for (@Pc(1073) Class4_Sub41 local1073 = (Class4_Sub41) local1065.aClass258_25.method5536(); local1073 != null; local1073 = (Class4_Sub41) local1065.aClass258_25.method5532()) {
							@Pc(1081) Class127 local1081 = Static390.aClass204_2.method4629(local1073.anInt6970);
							if (!Static222.aBoolean305) {
								if (local356.anInt5456 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86) {
									@Pc(1095) String[] local1095 = local1081.aStringArray26;
									for (local90 = 4; local90 >= 0; local90--) {
										if (local1095 != null && local1095[local90] != null) {
											@Pc(1107) byte local1107 = 0;
											if (local90 == 0) {
												local1107 = 59;
											}
											local487 = Static214.anInt4012;
											if (local90 == 1) {
												local1107 = 49;
											}
											if (local90 == 2) {
												local1107 = 57;
											}
											if (local90 == 3) {
												local1107 = 5;
											}
											if (local90 == 4) {
												local1107 = 19;
											}
											if (local1081.anInt3565 == local90) {
												local487 = local1081.anInt3549;
											}
											if (local90 == local1081.anInt3553) {
												local487 = local1081.anInt3581;
											}
											Static191.method2806(local356.anInt5455, (long) local1073.anInt6970, false, local487, true, local1095[local90], "<col=ff9040>" + local1081.aString43, local356.anInt5459, -1, local1107);
										}
									}
								}
								Static191.method2806(local356.anInt5455, (long) local1073.anInt6970, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 != local356.anInt5456, Static104.anInt2227, true, Static209.aClass242_53.method5320(Static139.anInt2670), "<col=ff9040>" + local1081.aString43, local356.anInt5459, -1, 1004);
							} else if (local356.anInt5456 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86) {
								@Pc(1249) Class247 local1249 = Static114.anInt2420 == -1 ? null : Static110.aClass262_1.method5689(Static114.anInt2420);
								if ((Static234.anInt4263 & 0x1) != 0 && (local1249 == null || local1081.method2741(local1249.anInt7035, Static114.anInt2420) != local1249.anInt7035)) {
									Static191.method2806(local356.anInt5455, (long) local1073.anInt6970, false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> <col=ff9040>" + local1081.aString43, local356.anInt5459, -1, 18);
								}
							}
						}
					}
				}
				if (local356.aClass6_1 instanceof Interface11) {
					@Pc(1314) Interface11 local1314 = (Interface11) local356.aClass6_1;
					@Pc(1321) Class71 local1321 = Static2.aClass74_13.method1683(local1314.method5648());
					if (local1321.anIntArray138 != null) {
						local1321 = local1321.method1626(Static155.aClass149_1);
					}
					if (local1321 != null) {
						if (!Static222.aBoolean305) {
							if (local356.anInt5456 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86) {
								@Pc(1419) String[] local1419 = local1321.aStringArray13;
								if (local1419 != null) {
									for (local81 = 4; local81 >= 0; local81--) {
										if (local1419[local81] != null) {
											@Pc(1431) short local1431 = 0;
											local99 = Static214.anInt4012;
											if (local81 == 0) {
												local1431 = 11;
											}
											if (local81 == 1) {
												local1431 = 51;
											}
											if (local81 == 2) {
												local1431 = 6;
											}
											if (local81 == 3) {
												local1431 = 25;
											}
											if (local1321.anInt2187 == local81) {
												local99 = local1321.anInt2202;
											}
											if (local81 == 4) {
												local1431 = 1007;
											}
											if (local81 == local1321.anInt2171) {
												local99 = local1321.anInt2189;
											}
											Static191.method2806(local356.anInt5455, Static210.method2993(local356.anInt5455, local356.anInt5459, local1314), false, local99, true, local1419[local81], "<col=00ffff>" + local1321.aString20, local356.anInt5459, -1, local1431);
										}
									}
								}
							}
							Static191.method2806(local356.anInt5455, (long) local1321.anInt2158, local356.anInt5456 != Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, Static104.anInt2227, true, Static209.aClass242_53.method5320(Static139.anInt2670), "<col=00ffff>" + local1321.aString20, local356.anInt5459, -1, 1006);
						} else if (local356.anInt5456 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86) {
							@Pc(1353) Class247 local1353 = Static114.anInt2420 == -1 ? null : Static110.aClass262_1.method5689(Static114.anInt2420);
							if ((Static234.anInt4263 & 0x4) != 0 && (local1353 == null || local1321.method1621(local1353.anInt7035, Static114.anInt2420) != local1353.anInt7035)) {
								Static191.method2806(local356.anInt5455, Static210.method2993(local356.anInt5455, local356.anInt5459, local1314), false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> <col=00ffff>" + local1321.aString20, local356.anInt5459, -1, 4);
							}
						}
					}
				}
			}
		}
	}
}
