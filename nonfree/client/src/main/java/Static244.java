import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
	public static void method2568() {
		Static119.anIntArray169 = Static417.method5356(0.4F);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2569(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg1, 2);
		local8.method2604();
		local8.aString32 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I")
	public static int method2570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static15.anIntArray12[arg1 & 0x3] : Static386.anIntArray262[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method2572(@OriginalArg(1) Class21 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (Static435.aClass21_17 == arg0) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local16 = Static146.aClass4_Sub12_Sub1_3.method2490();
			Static267.aClass262_2.method5560(local12).method4590(local16);
			return;
		}
		@Pc(40) int local40;
		@Pc(49) int local49;
		@Pc(55) int local55;
		if (Static133.aClass21_8 == arg0) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2538();
			local16 = Static146.aClass4_Sub12_Sub1_3.method2548();
			local40 = Static146.aClass4_Sub12_Sub1_3.method2490();
			local49 = Static154.anInt813 + (local40 >> 4 & 0x7);
			local55 = Static385.anInt6487 + (local40 & 0x7);
			if (local49 >= 0 && local55 >= 0 && local49 < Static326.anInt5666 && Static283.anInt5187 > local55) {
				Static28.method528(new Class4_Sub45(local16, local12), local49, local55, Static113.anInt2426);
				Static443.method5595(Static113.anInt2426, local49, local55);
			}
			return;
		}
		@Pc(126) int local126;
		if (arg0 == Static179.aClass21_10) {
			Static146.aClass4_Sub12_Sub1_3.method2490();
			local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
			local16 = Static154.anInt813 + (local12 >> 4 & 0x7);
			local40 = (local12 & 0x7) + Static385.anInt6487;
			local49 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local55 = Static146.aClass4_Sub12_Sub1_3.method2490();
			local126 = Static146.aClass4_Sub12_Sub1_3.method2493();
			@Pc(130) String local130 = Static146.aClass4_Sub12_Sub1_3.method2537();
			Static212.method3207(local126, local49, Static113.anInt2426, local16, local40, local55, local130);
			return;
		}
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(223) int local223;
		@Pc(309) Class16_Sub1_Sub3 local309;
		if (Static294.aClass21_4 == arg0) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
			@Pc(155) boolean local155 = (local12 & 0x80) != 0;
			local40 = (local12 >> 3 & 0x7) + Static154.anInt813;
			local49 = (local12 & 0x7) + Static385.anInt6487;
			local55 = Static146.aClass4_Sub12_Sub1_3.method2542() + local40;
			local126 = local49 + Static146.aClass4_Sub12_Sub1_3.method2542();
			local186 = Static146.aClass4_Sub12_Sub1_3.method2512();
			local190 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local196 = Static146.aClass4_Sub12_Sub1_3.method2490() * 4;
			local202 = Static146.aClass4_Sub12_Sub1_3.method2490() * 4;
			local206 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local210 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local214 = Static146.aClass4_Sub12_Sub1_3.method2490();
			if (local214 == 255) {
				local214 = -1;
			}
			local223 = Static146.aClass4_Sub12_Sub1_3.method2490();
			if (local40 >= 0 && local49 >= 0 && Static326.anInt5666 > local40 && Static283.anInt5187 > local49 && local55 >= 0 && local126 >= 0 && Static326.anInt5666 > local55 && local126 < Static283.anInt5187 && local190 != 65535) {
				local40 = local40 * 128 + 64;
				local126 = local126 * 128 + 64;
				local196 <<= 0x0;
				local49 = local49 * 128 + 64;
				local55 = local55 * 128 + 64;
				local202 <<= 0x0;
				local309 = new Class16_Sub1_Sub3(local190, Static113.anInt2426, local40, local49, local196, local206 + Static24.anInt5323, local210 + Static24.anInt5323, local214, local223, local186, local202, local155);
				local309.method2197(Static24.anInt5323 + local206, local55, Static13.method135(local55, Static113.anInt2426, local126) - local202, local126);
				Static27.aClass183_2.method4137(new Class4_Sub1_Sub7(local309));
			}
		} else if (Static420.aClass21_16 == arg0) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2515();
			local16 = Static146.aClass4_Sub12_Sub1_3.method2523();
			local40 = (local16 >> 4 & 0x7) + Static154.anInt813;
			local49 = Static385.anInt6487 + (local16 & 0x7);
			if (local40 >= 0 && local49 >= 0 && Static326.anInt5666 > local40 && local49 < Static283.anInt5187) {
				@Pc(395) Class4_Sub18 local395 = (Class4_Sub18) Static440.aClass102_40.method2700((long) (Static113.anInt2426 << 28 | local49 << 14 | local40));
				if (local395 != null) {
					for (@Pc(403) Class4_Sub45 local403 = (Class4_Sub45) local395.aClass183_14.method4140(); local403 != null; local403 = (Class4_Sub45) local395.aClass183_14.method4144()) {
						if (local403.anInt7355 == (local12 & 0x7FFF)) {
							local403.method5684();
							break;
						}
					}
					if (local395.aClass183_14.method4147()) {
						local395.method5684();
					}
					Static443.method5595(Static113.anInt2426, local40, local49);
				}
			}
		} else if (arg0 == Static183.aClass21_11) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2548();
			@Pc(453) byte local453 = Static146.aClass4_Sub12_Sub1_3.method2507();
			local40 = Static146.aClass4_Sub12_Sub1_3.method2523();
			local49 = local40 >> 2;
			local55 = local40 & 0x3;
			local126 = Static146.aClass4_Sub12_Sub1_3.method2520();
			local186 = Static154.anInt813 + (local126 >> 4 & 0x7);
			local190 = (local126 & 0x7) + Static385.anInt6487;
			@Pc(488) byte local488 = Static146.aClass4_Sub12_Sub1_3.method2549();
			local202 = Static146.aClass4_Sub12_Sub1_3.method2503();
			@Pc(496) byte local496 = Static146.aClass4_Sub12_Sub1_3.method2507();
			local210 = Static146.aClass4_Sub12_Sub1_3.method2515();
			local214 = Static146.aClass4_Sub12_Sub1_3.method2515();
			@Pc(508) byte local508 = Static146.aClass4_Sub12_Sub1_3.method2507();
			if (!Static122.aClass19_16.method4243()) {
				Static208.method2249(local186, local12, local55, local496, local453, local202, local508, Static113.anInt2426, local488, local190, local214, local210, local49);
			}
		} else if (arg0 == Static405.aClass21_14) {
			local12 = Static146.aClass4_Sub12_Sub1_3.method2520();
			local16 = local12 >> 2;
			local40 = local12 & 0x3;
			local49 = Static201.anIntArray410[local16];
			local55 = Static146.aClass4_Sub12_Sub1_3.method2489();
			local126 = Static154.anInt813 + (local55 >> 4 & 0x7);
			local186 = (local55 & 0x7) + Static385.anInt6487;
			if (Static178.method2845(Static448.anInt7307) || local126 >= 0 && local186 >= 0 && Static326.anInt5666 > local126 && local186 < Static283.anInt5187) {
				Static145.method2449(local126, local16, -1, local49, local186, Static113.anInt2426, local40);
			}
		} else {
			@Pc(635) boolean local635;
			if (arg0 == Static38.aClass21_6) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local16 = Static154.anInt813 * 2 + (local12 >> 4 & 0xF);
				local40 = Static385.anInt6487 * 2 + (local12 & 0xF);
				local635 = Static146.aClass4_Sub12_Sub1_3.method2490() != 0;
				local55 = Static146.aClass4_Sub12_Sub1_3.method2542() + local16;
				local126 = local40 + Static146.aClass4_Sub12_Sub1_3.method2542();
				local186 = Static146.aClass4_Sub12_Sub1_3.method2512();
				local190 = Static146.aClass4_Sub12_Sub1_3.method2512();
				local196 = Static146.aClass4_Sub12_Sub1_3.method2536();
				@Pc(664) byte local664 = Static146.aClass4_Sub12_Sub1_3.method2542();
				local206 = Static146.aClass4_Sub12_Sub1_3.method2490() * 4;
				local210 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local214 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local223 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local223 == 255) {
					local223 = -1;
				}
				@Pc(693) int local693 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local16 >= 0 && local40 >= 0 && local16 < Static326.anInt5666 * 2 && Static326.anInt5666 * 2 > local40 && local55 >= 0 && local126 >= 0 && local55 < Static283.anInt5187 * 2 && Static283.anInt5187 * 2 > local126 && local196 != 65535) {
					local55 = local55 * 64;
					local40 = local40 * 64;
					local126 = local126 * 64;
					local202 = local664 << 0;
					local206 <<= 0x0;
					local16 *= 64;
					if (local186 != 0) {
						@Pc(782) int local782;
						@Pc(793) Class16_Sub1_Sub5 local793;
						@Pc(772) int local772;
						@Pc(776) int local776;
						if (local186 < 0) {
							local772 = -local186 - 1;
							local776 = local772 & 0x7FF;
							local782 = local772 >> 11 & 0xF;
							if (Static207.anInt5452 == local776) {
								local793 = Static1.aClass16_Sub1_Sub5_Sub1_1;
							} else {
								local793 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local776];
							}
						} else {
							local772 = local186 - 1;
							local782 = local772 >> 11 & 0xF;
							local776 = local772 & 0x7FF;
							local793 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local776];
						}
						if (local793 != null) {
							@Pc(823) Class151 local823 = local793.method4757();
							if (local823.anIntArrayArray38 != null && local823.anIntArrayArray38[local782] != null) {
								local776 = local823.anIntArrayArray38[local782][0];
								@Pc(845) int local845 = local823.anIntArrayArray38[local782][2];
								@Pc(850) int local850 = local793.aClass35_7.method811();
								@Pc(854) int local854 = Class50_Sub1.anIntArray225[local850];
								@Pc(858) int local858 = Class50_Sub1.anIntArray224[local850];
								@Pc(868) int local868 = local845 * local854 + local776 * local858 >> 15;
								@Pc(878) int local878 = local845 * local858 - local854 * local776 >> 15;
								local16 += local868;
								local202 -= local823.anIntArrayArray38[local782][1];
								local40 += local878;
							}
						}
					}
					@Pc(918) Class16_Sub1_Sub3 local918 = new Class16_Sub1_Sub3(local196, Static113.anInt2426, local16, local40, local202, Static24.anInt5323 + local210, local214 - -Static24.anInt5323, local223, local693, local190, local206, local635);
					local918.method2197(local210 + Static24.anInt5323, local55, Static13.method135(local55, Static113.anInt2426, local126) - local206, local126);
					Static27.aClass183_2.method4137(new Class4_Sub1_Sub7(local918));
				}
			} else if (arg0 == Static152.aClass21_9) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local16 = (local12 >> 4 & 0x7) + Static154.anInt813;
				local40 = Static385.anInt6487 + (local12 & 0x7);
				local49 = Static146.aClass4_Sub12_Sub1_3.method2536();
				if (local49 == 65535) {
					local49 = -1;
				}
				local55 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local126 = local55 >> 4 & 0xF;
				local186 = local55 & 0x7;
				local190 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local196 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local16 >= 0 && local40 >= 0 && local16 < Static326.anInt5666 && Static283.anInt5187 > local40) {
					local202 = local126 + 1;
					if (Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] >= local16 - local202 && local202 + local16 >= Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] && local40 - local202 <= Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0] && local40 + local202 >= Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0]) {
						Static412.method5292(local196, local49, local190, local186, local126 + (local16 << 16) + (Static113.anInt2426 << 24) + (local40 << 8));
					}
				}
			} else if (arg0 == Static183.aClass21_12) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local16 = (local12 >> 4 & 0x7) + Static154.anInt813;
				local40 = (local12 & 0x7) + Static385.anInt6487;
				local49 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local55 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local126 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local186 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local16 >= 0 && local40 >= 0 && Static326.anInt5666 > local16 && Static283.anInt5187 > local40) {
					local190 = local16 * 128 + 64;
					local196 = local40 * 128 + 64;
					local202 = Static113.anInt2426;
					if (local202 < 3 && Static378.method3229(local16, local40)) {
						local202++;
					}
					@Pc(1186) Class16_Sub1_Sub2 local1186 = new Class16_Sub1_Sub2(local49, local126, Static24.anInt5323, Static113.anInt2426, local202, local190, Static13.method135(local190, Static113.anInt2426, local196) - local55, local196, local16, local16, local40, local40, local186);
					Static292.aClass183_36.method4137(new Class4_Sub1_Sub10(local1186));
				}
			} else if (Static106.aClass21_7 == arg0) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local16 = (local12 >> 4 & 0x7) + Static154.anInt813;
				local40 = Static385.anInt6487 + (local12 & 0x7);
				local49 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local55 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local126 = Static146.aClass4_Sub12_Sub1_3.method2536();
				if (Static440.aClass102_40 != null && local16 >= 0 && local40 >= 0 && Static326.anInt5666 > local16 && local40 < Static283.anInt5187) {
					@Pc(1265) Class4_Sub18 local1265 = (Class4_Sub18) Static440.aClass102_40.method2700((long) (local16 | local40 << 14 | Static113.anInt2426 << 28));
					if (local1265 != null) {
						for (@Pc(1273) Class4_Sub45 local1273 = (Class4_Sub45) local1265.aClass183_14.method4140(); local1273 != null; local1273 = (Class4_Sub45) local1265.aClass183_14.method4144()) {
							if (local1273.anInt7355 == (local49 & 0x7FFF) && local55 == local1273.anInt7356) {
								local1273.method5684();
								local1273.anInt7356 = local126;
								Static28.method528(local1273, local16, local40, Static113.anInt2426);
								break;
							}
						}
						Static443.method5595(Static113.anInt2426, local16, local40);
					}
				}
			} else if (Static146.aClass21_2 == arg0) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2489();
				local16 = local12 >> 2;
				local40 = local12 & 0x3;
				local49 = Static201.anIntArray410[local16];
				local55 = Static146.aClass4_Sub12_Sub1_3.method2548();
				local126 = Static146.aClass4_Sub12_Sub1_3.method2520();
				local186 = (local126 >> 4 & 0x7) + Static154.anInt813;
				local190 = Static385.anInt6487 + (local126 & 0x7);
				if (Static178.method2845(Static448.anInt7307) || local186 >= 0 && local190 >= 0 && Static326.anInt5666 > local186 && local190 < Static283.anInt5187) {
					Static145.method2449(local186, local16, local55, local49, local190, Static113.anInt2426, local40);
				}
			} else if (arg0 == Static35.aClass21_5) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2536();
				if (local12 == 65535) {
					local12 = -1;
				}
				local16 = Static146.aClass4_Sub12_Sub1_3.method2523();
				local40 = (local16 >> 4 & 0x7) + Static154.anInt813;
				local49 = Static385.anInt6487 + (local16 & 0x7);
				local55 = Static146.aClass4_Sub12_Sub1_3.method2523();
				local126 = local55 >> 2;
				local186 = local55 & 0x3;
				local190 = Static201.anIntArray410[local126];
				Static297.method4071(Static113.anInt2426, local186, local12, local190, local126, local40, local49);
			} else if (Static410.aClass21_15 == arg0) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local16 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local40 = Static146.aClass4_Sub12_Sub1_3.method2489();
				local49 = Static154.anInt813 + (local40 >> 4 & 0x7);
				local55 = (local40 & 0x7) + Static385.anInt6487;
				local126 = Static146.aClass4_Sub12_Sub1_3.method2538();
				if (local49 >= 0 && local55 >= 0 && Static326.anInt5666 > local49 && Static283.anInt5187 > local55 && local16 != Static207.anInt5452) {
					Static28.method528(new Class4_Sub45(local12, local126), local49, local55, Static113.anInt2426);
					Static443.method5595(Static113.anInt2426, local49, local55);
				}
			} else if (Static309.aClass21_13 == arg0) {
				local12 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local16 = (local12 >> 4 & 0xF) + Static154.anInt813 * 2;
				local40 = (local12 & 0xF) + Static385.anInt6487 * 2;
				local635 = Static146.aClass4_Sub12_Sub1_3.method2490() != 0;
				local55 = Static146.aClass4_Sub12_Sub1_3.method2542() + local16;
				local126 = Static146.aClass4_Sub12_Sub1_3.method2542() + local40;
				local186 = Static146.aClass4_Sub12_Sub1_3.method2512();
				local190 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local196 = Static146.aClass4_Sub12_Sub1_3.method2490() * 4;
				local202 = Static146.aClass4_Sub12_Sub1_3.method2490() * 4;
				local206 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local210 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local214 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local214 == 255) {
					local214 = -1;
				}
				local223 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local16 >= 0 && local40 >= 0 && local16 < Static326.anInt5666 * 2 && local40 < Static326.anInt5666 * 2 && local55 >= 0 && local126 >= 0 && local55 < Static283.anInt5187 * 2 && local126 < Static283.anInt5187 * 2 && local190 != 65535) {
					local126 *= 64;
					local202 <<= 0x0;
					local40 = local40 * 64;
					local16 *= 64;
					local55 *= 64;
					local196 <<= 0x0;
					local309 = new Class16_Sub1_Sub3(local190, Static113.anInt2426, local16, local40, local196, Static24.anInt5323 + local206, local210 - -Static24.anInt5323, local214, local223, local186, local202, local635);
					local309.method2197(local206 + Static24.anInt5323, local55, Static13.method135(local55, Static113.anInt2426, local126) - local202, local126);
					Static27.aClass183_2.method4137(new Class4_Sub1_Sub7(local309));
				}
			} else {
				Static94.method1654(null, "T3 - " + arg0);
				Static251.method3639();
			}
		}
	}
}
