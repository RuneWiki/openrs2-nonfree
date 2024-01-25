import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!bia;")
	public static final Class36 aClass36_2 = new Class36(0);

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
	public static final int[] anIntArray335 = new int[2048];

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!ha;II)V")
	public static void method4623(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static91.anInt2242 == 0 || Static163.anInt3313 == 0) {
			return;
		}
		@Pc(45) Class51 local45;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(60) int local60;
		@Pc(58) int local58;
		if (Static148.aBoolean241) {
			Static472.method6681(false);
			local45 = arg0.method8119();
			@Pc(71) int[] local71 = arg0.Y();
			local30 = local71[2];
			local32 = local71[0];
			local36 = local71[1];
			local34 = local71[3];
			local60 = arg1 + Static200.method3448(false);
			local58 = arg2 + Static426.method6217(false);
		} else {
			arg0.DA(Static139.anInt2958, Static36.anInt787, Static91.anInt2242, Static163.anInt3313);
			local30 = Static91.anInt2242;
			local32 = Static139.anInt2958;
			local34 = Static163.anInt3313;
			local36 = Static36.anInt787;
			arg0.KA(Static484.anInt9952, Static200.anInt3977, Static91.anInt2242, Static163.anInt3313);
			local45 = arg0.method8137();
			local45.method6716(Static134.anInt9432, Static539.anInt8679, Static463.anInt7492, Static53.anInt1367, Static542.anInt8732, Static26.anInt533);
			arg0.method8138(local45);
			local58 = arg2;
			local60 = arg1;
		}
		if (local30 == 0) {
			local30 = 1;
		}
		if (local34 == 0) {
			local34 = 1;
		}
		Static560.method7863(true);
		@Pc(136) int local136;
		@Pc(148) int local148;
		@Pc(158) int local158;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(292) int local292;
		@Pc(303) int local303;
		@Pc(128) int local128;
		@Pc(353) int local353;
		if (Static124.aClass91Array1 != null && (!Static557.aBoolean660 || (Static613.anInt10082 & 0x40) != 0)) {
			local128 = -1;
			@Pc(130) int local130 = -1;
			@Pc(133) int local133 = arg0.i();
			local136 = arg0.XA();
			@Pc(159) int local159;
			@Pc(147) int local147;
			if (Static582.aBoolean678) {
				local148 = local147 = Static529.anInt8509 * (local60 - local32) / local30;
				local159 = local158 = (local58 - local36) * Static529.anInt8509 / local34;
			} else {
				local148 = (local60 - local32) * local133 / local30;
				local158 = (local58 - local36) * local136 / local34;
				local159 = (local58 - local36) * local133 / local34;
				local147 = local136 * (local60 - local32) / local30;
			}
			@Pc(211) int[] local211 = new int[] { local148, local159, local133 };
			local45.method6715(local211);
			@Pc(229) int[] local229 = new int[] { local147, local158, local136 };
			local45.method6715(local229);
			@Pc(260) float local260 = Static363.method5408((float) local211[1], (float) local229[1], (float) local229[2], (float) local229[0], (float) local211[2], 4, (float) local211[0]);
			if (local260 > 0.0F) {
				local273 = local229[0] - local211[0];
				local281 = local229[2] - local211[2];
				local292 = (int) ((float) local211[0] + (float) local273 * local260);
				local303 = (int) ((float) local281 * local260 + (float) local211[2]);
				local128 = local292 + (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() - 1 << 8) >> 9;
				local130 = local303 + (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() - 1 << 8) >> 9;
				@Pc(330) byte local330 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109;
				if (local330 < 3 && (Static372.aByteArrayArrayArray3[1][local292 >> 9][local303 >> 9] & 0x2) != 0) {
					local353 = local330 + 1;
				}
			}
			if (local128 != -1 && local130 != -1) {
				if (Static557.aBoolean660 && (Static613.anInt10082 & 0x40) != 0) {
					@Pc(371) Class303 local371 = Static71.method1631(Static252.anInt4804, Static454.anInt7419);
					if (local371 == null) {
						Static210.method8326();
					} else {
						Static244.method4145(0L, (long) (local130 | local128 << 0), false, true, " ->", -1, Static237.anInt4365, 45, local130, Static184.aString32, true, local128);
					}
				} else {
					if (Static11.aBoolean26) {
						Static244.method4145(0L, (long) (local128 << 0 | local130), false, true, "", -1, -1, 44, local130, Static573.aClass345_29.method7951(Static496.anInt7407), true, local128);
					}
					Static244.method4145(0L, (long) (local130 | local128 << 0), false, true, "", -1, Static621.anInt10148, 13, local130, Static298.aString48, true, local128);
				}
			}
		}
		if (Static148.aBoolean241) {
			Static300.method4737();
		}
		for (local128 = 0; (Static148.aBoolean241 ? 2 : 1) > local128; local128++) {
			@Pc(462) boolean local462 = local128 == 0;
			@Pc(468) Class25 local468 = local462 ? Static141.aClass25_2 : Static391.aClass25_3;
			local136 = arg1;
			local148 = arg2;
			if (Static148.aBoolean241) {
				Static472.method6681(local462);
				local136 = arg1 + Static200.method3448(local462);
				local148 = arg2 + Static426.method6217(local462);
			}
			@Pc(492) Class19 local492 = local468.aClass19_1;
			for (@Pc(497) Class16_Sub5 local497 = (Class16_Sub5) local492.method562(); local497 != null; local497 = (Class16_Sub5) local492.method558()) {
				if ((Static407.aBoolean497 || local497.aClass16_Sub1_16.aByte109 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) && local497.method4443(local136, local148, arg0)) {
					@Pc(532) int local532;
					if (local497.aClass16_Sub1_16 instanceof Class16_Sub1_Sub1) {
						local158 = ((Class16_Sub1_Sub1) local497.aClass16_Sub1_16).aShort103;
						local532 = ((Class16_Sub1_Sub1) local497.aClass16_Sub1_16).aShort106;
					} else {
						local532 = local497.aClass16_Sub1_16.anInt8034 >> 9;
						local158 = local497.aClass16_Sub1_16.anInt8037 >> 9;
					}
					@Pc(661) int local661;
					@Pc(673) int local673;
					@Pc(781) int local781;
					@Pc(562) int local562;
					if (local497.aClass16_Sub1_16 instanceof Class16_Sub1_Sub1_Sub3_Sub2) {
						@Pc(558) Class16_Sub1_Sub1_Sub3_Sub2 local558 = (Class16_Sub1_Sub1_Sub3_Sub2) local497.aClass16_Sub1_16;
						local562 = local558.method6999();
						if ((local562 & 0x1) == 0 && (local558.anInt8037 & 0x1FF) == 0 && (local558.anInt8034 & 0x1FF) == 0 || (local562 & 0x1) == 1 && (local558.anInt8037 & 0x1FF) == 256 && (local558.anInt8034 & 0x1FF) == 256) {
							local273 = local558.anInt8037 - (local558.method6999() - 1 << 8);
							local281 = local558.anInt8034 - (local558.method6999() - 1 << 8);
							for (local292 = 0; local292 < Static317.anInt5602; local292++) {
								@Pc(635) Class2_Sub32 local635 = (Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local292]);
								if (local635 != null) {
									@Pc(640) Class16_Sub1_Sub1_Sub3_Sub1 local640 = local635.aClass16_Sub1_Sub1_Sub3_Sub1_2;
									if (local640.anInt8116 != Static389.anInt6694 && local640.aBoolean587) {
										local661 = local640.anInt8037 - (local640.aClass113_1.anInt3238 - 1 << 8);
										local673 = local640.anInt8034 - (local640.aClass113_1.anInt3238 - 1 << 8);
										if (local661 >= local273 && local640.aClass113_1.anInt3238 <= local558.method6999() - (local661 - local273 >> 9) && local281 <= local673 && local640.aClass113_1.anInt3238 <= local558.method6999() - (local673 - local281 >> 9)) {
											Static443.method6363(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, local640);
											local640.anInt8116 = Static389.anInt6694;
										}
									}
								}
							}
							local303 = Static649.anInt10495;
							@Pc(746) int[] local746 = Static426.anIntArray476;
							for (local661 = 0; local661 < local303; local661++) {
								@Pc(756) Class16_Sub1_Sub1_Sub3_Sub2 local756 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local746[local661]];
								if (local756 != null && local756.anInt8116 != Static389.anInt6694 && local756 != local558 && local756.aBoolean587) {
									local781 = local756.anInt8037 - (local756.method6999() - 1 << 8);
									@Pc(793) int local793 = local756.anInt8034 - (local756.method6999() - 1 << 8);
									if (local781 >= local273 && local756.method6999() <= local558.method6999() - (local781 - local273 >> 9) && local281 <= local793 && local756.method6999() <= local558.method6999() - (local793 - local281 >> 9)) {
										Static196.method3385(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, local756);
										local756.anInt8116 = Static389.anInt6694;
									}
								}
							}
						}
						if (local558.anInt8116 == Static389.anInt6694) {
							continue;
						}
						Static196.method3385(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, local558);
						local558.anInt8116 = Static389.anInt6694;
					}
					if (local497.aClass16_Sub1_16 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
						@Pc(899) Class16_Sub1_Sub1_Sub3_Sub1 local899 = (Class16_Sub1_Sub1_Sub3_Sub1) local497.aClass16_Sub1_16;
						if (local899.aClass113_1 != null) {
							if ((local899.aClass113_1.anInt3238 & 0x1) == 0 && (local899.anInt8037 & 0x1FF) == 0 && (local899.anInt8034 & 0x1FF) == 0 || (local899.aClass113_1.anInt3238 & 0x1) == 1 && (local899.anInt8037 & 0x1FF) == 256 && (local899.anInt8034 & 0x1FF) == 256) {
								local562 = local899.anInt8037 - (local899.aClass113_1.anInt3238 - 1 << 8);
								local273 = local899.anInt8034 - (local899.aClass113_1.anInt3238 - 1 << 8);
								for (local281 = 0; local281 < Static317.anInt5602; local281++) {
									@Pc(982) Class2_Sub32 local982 = (Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local281]);
									if (local982 != null) {
										@Pc(987) Class16_Sub1_Sub1_Sub3_Sub1 local987 = local982.aClass16_Sub1_Sub1_Sub3_Sub1_2;
										if (Static389.anInt6694 != local987.anInt8116 && local899 != local987 && local987.aBoolean587) {
											local353 = local987.anInt8037 - (local987.aClass113_1.anInt3238 - 1 << 8);
											local661 = local987.anInt8034 - (local987.aClass113_1.anInt3238 - 1 << 8);
											if (local353 >= local562 && local899.aClass113_1.anInt3238 - (local353 - local562 >> 9) >= local987.aClass113_1.anInt3238 && local273 <= local661 && local899.aClass113_1.anInt3238 - (local661 - local273 >> 9) >= local987.aClass113_1.anInt3238) {
												Static443.method6363(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, local987);
												local987.anInt8116 = Static389.anInt6694;
											}
										}
									}
								}
								local292 = Static649.anInt10495;
								@Pc(1093) int[] local1093 = Static426.anIntArray476;
								for (local353 = 0; local353 < local292; local353++) {
									@Pc(1103) Class16_Sub1_Sub1_Sub3_Sub2 local1103 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local1093[local353]];
									if (local1103 != null && local1103.anInt8116 != Static389.anInt6694 && local1103.aBoolean587) {
										local673 = local1103.anInt8037 - (local1103.method6999() - 1 << 8);
										local781 = local1103.anInt8034 - (local1103.method6999() - 1 << 8);
										if (local562 <= local673 && local1103.method6999() <= local899.aClass113_1.anInt3238 - (local673 - local562 >> 9) && local273 <= local781 && local1103.method6999() <= local899.aClass113_1.anInt3238 - (local781 - local273 >> 9)) {
											Static196.method3385(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, local1103);
											local1103.anInt8116 = Static389.anInt6694;
										}
									}
								}
							}
							if (local899.anInt8116 == Static389.anInt6694) {
								continue;
							}
							Static443.method6363(local497.aClass16_Sub1_16.aByte109 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, local899);
							local899.anInt8116 = Static389.anInt6694;
						}
					}
					if (local497.aClass16_Sub1_16 instanceof Class16_Sub1_Sub5_Sub1) {
						@Pc(1239) int local1239 = Static406.anInt6899 + local158;
						local562 = local532 + Static338.anInt5885;
						@Pc(1261) Class2_Sub23 local1261 = (Class2_Sub23) Static263.aClass323_18.method7484((long) (local1239 | local562 << 14 | local497.aClass16_Sub1_16.aByte109 << 28));
						if (local1261 != null) {
							local281 = 0;
							for (@Pc(1271) Class2_Sub50 local1271 = (Class2_Sub50) local1261.aClass114_22.method2758(); local1271 != null; local1271 = (Class2_Sub50) local1261.aClass114_22.method2770()) {
								@Pc(1279) Class327 local1279 = Static470.aClass250_1.method5960(local1271.anInt10421);
								if (Static557.aBoolean660 && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 == local497.aClass16_Sub1_16.aByte109) {
									@Pc(1302) Class328 local1302 = Static404.anInt6894 == -1 ? null : Static106.aClass293_1.method6807(Static404.anInt6894);
									if ((Static613.anInt10082 & 0x1) != 0 && (local1302 == null || local1279.method7508(Static404.anInt6894, local1302.anInt8782) != local1302.anInt8782)) {
										Static244.method4145((long) local1271.anInt10421, (long) local281, false, true, Static80.aString17 + " -> <col=ff9040>" + local1279.aString86, -1, Static237.anInt4365, 15, local532, Static184.aString32, false, local158);
									}
								}
								if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 == local497.aClass16_Sub1_16.aByte109) {
									@Pc(1364) String[] local1364 = local1279.aStringArray49;
									for (local661 = 4; local661 >= 0; local661--) {
										if (local1364 != null && local1364[local661] != null) {
											@Pc(1376) byte local1376 = 0;
											local781 = Static565.anInt9269;
											if (local661 == 0) {
												local1376 = 46;
											}
											if (local661 == 1) {
												local1376 = 59;
											}
											if (local661 == 2) {
												local1376 = 9;
											}
											if (local661 == 3) {
												local1376 = 47;
											}
											if (local661 == 4) {
												local1376 = 8;
											}
											if (local1279.anInt8757 == local661) {
												local781 = local1279.anInt8704;
											}
											if (local1279.anInt8718 == local661) {
												local781 = local1279.anInt8703;
											}
											Static244.method4145((long) local1271.anInt10421, (long) local281, false, true, "<col=ff9040>" + local1279.aString86, -1, local781, local1376, local532, local1364[local661], false, local158);
										}
									}
								}
								Static244.method4145((long) local1271.anInt10421, (long) local281, local497.aClass16_Sub1_16.aByte109 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, true, "<col=ff9040>" + local1279.aString86, -1, Static36.anInt790, 1009, local532, Static573.aClass345_24.method7951(Static496.anInt7407), false, local158);
								local281++;
							}
						}
					}
					if (local497.aClass16_Sub1_16 instanceof Interface25) {
						@Pc(1522) Interface25 local1522 = (Interface25) local497.aClass16_Sub1_16;
						@Pc(1529) Class5 local1529 = Static79.aClass304_2.method6956(local1522.method6207());
						if (local1529.anIntArray9 != null) {
							local1529 = local1529.method77(Static382.aClass282_1);
						}
						if (local1529 != null) {
							if (Static557.aBoolean660 && local497.aClass16_Sub1_16.aByte109 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
								@Pc(1557) Class328 local1557 = Static404.anInt6894 == -1 ? null : Static106.aClass293_1.method6807(Static404.anInt6894);
								if ((Static613.anInt10082 & 0x4) != 0 && (local1557 == null || local1529.method89(local1557.anInt8782, Static404.anInt6894) != local1557.anInt8782)) {
									Static244.method4145(Static588.method8333(local532, local158, local1522), (long) local1522.hashCode(), false, true, Static80.aString17 + " -> <col=00ffff>" + local1529.aString2, -1, Static237.anInt4365, 10, local532, Static184.aString32, false, local158);
								}
							}
							if (local497.aClass16_Sub1_16.aByte109 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
								@Pc(1619) String[] local1619 = local1529.aStringArray1;
								if (local1619 != null) {
									for (local281 = 4; local281 >= 0; local281--) {
										if (local1619[local281] != null) {
											@Pc(1631) short local1631 = 0;
											if (local281 == 0) {
												local1631 = 50;
											}
											local303 = Static565.anInt9269;
											if (local281 == 1) {
												local1631 = 16;
											}
											if (local281 == 2) {
												local1631 = 5;
											}
											if (local281 == 3) {
												local1631 = 18;
											}
											if (local281 == local1529.anInt83) {
												local303 = local1529.anInt73;
											}
											if (local281 == 4) {
												local1631 = 1002;
											}
											if (local1529.anInt76 == local281) {
												local303 = local1529.anInt90;
											}
											Static244.method4145(Static588.method8333(local532, local158, local1522), (long) local1522.hashCode(), false, true, "<col=00ffff>" + local1529.aString2, -1, local303, local1631, local532, local1619[local281], false, local158);
										}
									}
								}
								Static244.method4145((long) local1529.anInt106, (long) local1522.hashCode(), Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != local497.aClass16_Sub1_16.aByte109, true, "<col=00ffff>" + local1529.aString2, -1, Static36.anInt790, 1003, local532, Static573.aClass345_24.method7951(Static496.anInt7407), false, local158);
							}
						}
					}
				}
			}
			if (Static148.aBoolean241) {
				Static300.method4737();
			}
		}
		Static560.method7863(false);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method4624(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static492.method6903(local6.width, local6.height);
		if (Static518.anInt8368 == 1) {
			Static613.aClass13_82.method8146(arg0, Static137.anInt2915, Static431.anInt7666);
		} else {
			Static613.aClass13_82.method8146(arg0, Static75.anInt8430, Static631.anInt10242);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!rl;BB)V")
	public static void method4625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16_Sub1_Sub1_Sub3_Sub2 arg2) {
		@Pc(8) int local8 = arg2.anIntArray595[0];
		@Pc(13) int local13 = arg2.anIntArray594[0];
		if (local8 < 0 || Static456.anInt7428 <= local8 || local13 < 0 || Static5.anInt112 <= local13 || (arg0 < 0 || Static456.anInt7428 <= arg0 || arg1 < 0 || Static5.anInt112 <= arg1)) {
			return;
		}
		@Pc(74) int local74 = Static79.method1729(Static591.anIntArray693, arg1, 0, 0, Static520.aClass175Array1[arg2.aByte109], Static390.anIntArray444, true, 0, 0, -4, local8, arg2.method6999(), arg0, local13);
		if (local74 >= 1 && local74 <= 3) {
			for (@Pc(84) int local84 = 0; local84 < local74 - 1; local84++) {
				arg2.method7014((byte) 2, Static591.anIntArray693[local84], Static390.anIntArray444[local84]);
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!sf;I)Lclient!pc;")
	public static Class2_Sub7_Sub13 method4626(@OriginalArg(0) int arg0, @OriginalArg(2) Class312 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg1.anInt8392;
		@Pc(19) Class2_Sub7_Sub13 local19 = (Class2_Sub7_Sub13) Static146.aClass280_2.method6424((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static222.aClass238_106.method5580(Static222.aClass238_106.method5594(local10));
		if (local31 == null) {
			local10 = arg1.anInt8392 | arg2 + 65536 << 10;
			local19 = (Class2_Sub7_Sub13) Static146.aClass280_2.method6424((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static222.aClass238_106.method5580(Static222.aClass238_106.method5594(local10));
			if (local31 == null) {
				local10 = arg1.anInt8392 | 0x3FFFC00;
				local19 = (Class2_Sub7_Sub13) Static146.aClass280_2.method6424((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static222.aClass238_106.method5580(Static222.aClass238_106.method5594(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static621.method8624(local31);
					} catch (@Pc(195) Exception local195) {
						throw new RuntimeException(local195.getMessage() + " S: " + local10);
					}
					local19.aClass312_7 = arg1;
					Static146.aClass280_2.method6428((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static621.method8624(local31);
				} catch (@Pc(127) Exception local127) {
					throw new RuntimeException(local127.getMessage() + " S: " + local10);
				}
				local19.aClass312_7 = arg1;
				Static146.aClass280_2.method6428((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static621.method8624(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass312_7 = arg1;
			Static146.aClass280_2.method6428((long) local10 << 16, local19);
			return local19;
		}
	}
}
