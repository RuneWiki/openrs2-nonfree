import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "Z")
	public static boolean aBoolean332;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_120 = new Class189("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!ck;)V")
	public static void method3083(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub1 arg1) {
		Static27.anInt2361 = 0;
		Static405.aBoolean580 = false;
		Static202.method3170(arg1);
		Static212.method3260(arg1);
		if (Static405.aBoolean580) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt3235 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt3235 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public static void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static269.aClass70_27.method1759(Static7.aClass189_5.method4262(Static53.anInt1454));
		@Pc(24) int local24;
		for (@Pc(18) Class3_Sub14 local18 = (Class3_Sub14) Static184.aClass243_21.method5208(); local18 != null; local18 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			local24 = Static177.method2819(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static158.anInt3162 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static333.anInt5712) {
			local54 = Static333.anInt5712 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(74) int local74 = arg1;
		if (Static123.anInt2625 < arg1 + local24) {
			local74 = Static123.anInt2625 - local24;
		}
		Static124.anInt7631 = local54;
		if (local74 < 0) {
			local74 = 0;
		}
		Static242.anInt4631 = Static158.anInt3162 * 16 + (Static378.aBoolean550 ? 26 : 22);
		Static438.aBoolean636 = true;
		Static442.anInt7488 = local74;
		Static126.anInt2657 = local13;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBIIIZ)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static263.aClass118ArrayArrayArray2 == null) {
			Static121.aClass172_3.method5507(-16777216, arg2, arg0, arg3, arg1);
		} else if (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >= 0 && Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 < Static40.anInt1089 * 128 && Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >= 0 && Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 < Static44.anInt7276 * 128) {
			Static52.anInt1374++;
			if (Static379.aClass7_Sub2_Sub3_Sub2_2 != null && Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 - (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() - 1) * 64 >> 7 == Static78.anInt1944 && Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 - (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() - 1) * 64 >> 7 == Static312.anInt5522) {
				Static78.anInt1944 = -1;
				Static312.anInt5522 = -1;
				Static39.method761();
			}
			Static225.method3378();
			if (!arg4) {
				Static116.method4222();
			}
			Static424.method5403();
			Static115.method1913(true, arg2, arg1, arg3, arg0);
			@Pc(112) int local112 = Static410.anInt6752;
			@Pc(114) int local114 = Static75.anInt1920;
			@Pc(116) int local116 = Static284.anInt5188;
			@Pc(118) int local118 = Static361.anInt6104;
			@Pc(124) int local124;
			@Pc(161) int local161;
			if (Static161.anInt3316 == 1) {
				local124 = (int) Static180.aFloat27;
				if (Static62.anInt1594 >> 8 > local124) {
					local124 = Static62.anInt1594 >> 8;
				}
				if (Static384.aBooleanArray20[4] && local124 < Static365.anIntArray398[4] + 128) {
					local124 = Static365.anIntArray398[4] + 128;
				}
				local161 = (int) Static252.aFloat47 + Static179.anInt5783 & 0x3FFF;
				Static157.method2539(local124, local161, (local124 >> 3) * 3 + 600 << 0, Static215.anInt4111, local118, Static35.anInt1000, Static231.method3482(Static6.anInt93, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321) - 50);
			} else if (Static161.anInt3316 == 4) {
				local124 = (int) Static180.aFloat27;
				if (Static62.anInt1594 >> 8 > local124) {
					local124 = Static62.anInt1594 >> 8;
				}
				if (Static384.aBooleanArray20[4] && Static365.anIntArray398[4] + 128 > local124) {
					local124 = Static365.anIntArray398[4] + 128;
				}
				local161 = (int) Static252.aFloat47 & 0x3FFF;
				Static157.method2539(local124, local161, (local124 >> 3) * 3 + 600 << 0, Static215.anInt4111, local118, Static35.anInt1000, Static231.method3482(Static6.anInt93, Static382.anInt1874, Static422.anInt6891) - 50);
			} else if (Static161.anInt3316 == 5) {
				Static247.method3712(local118);
			}
			local124 = Static276.anInt5105;
			local161 = Static439.anInt7400;
			@Pc(268) int local268 = Static265.anInt5008;
			@Pc(270) int local270 = Static298.anInt5734;
			@Pc(272) int local272 = Static445.anInt7532;
			@Pc(316) int local316;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static384.aBooleanArray20[local274]) {
					local316 = (int) ((double) -Static18.anIntArray220[local274] + Math.random() * (double) (Static18.anIntArray220[local274] * 2 + 1) + Math.sin((double) Static145.anIntArray395[local274] / 100.0D * (double) Static75.anIntArray109[local274]) * (double) Static365.anIntArray398[local274]);
					if (local274 == 0) {
						Static276.anInt5105 += local316;
					}
					if (local274 == 2) {
						Static265.anInt5008 += local316;
					}
					if (local274 == 3) {
						Static445.anInt7532 = local316 + Static445.anInt7532 & 0x3FFF;
					}
					if (local274 == 4) {
						Static298.anInt5734 += local316;
						if (Static298.anInt5734 < 1024) {
							Static298.anInt5734 = 1024;
						} else if (Static298.anInt5734 > 3072) {
							Static298.anInt5734 = 3072;
						}
					}
					if (local274 == 1) {
						Static439.anInt7400 += local316;
					}
				}
			}
			if (Static276.anInt5105 < 0) {
				Static276.anInt5105 = 0;
			}
			if (Static265.anInt5008 < 0) {
				Static265.anInt5008 = 0;
			}
			if (Static276.anInt5105 > (Static405.anInt6684 << 7) - 1) {
				Static276.anInt5105 = (Static405.anInt6684 << 7) - 1;
			}
			if (Static265.anInt5008 > (Static37.anInt1025 << 7) - 1) {
				Static265.anInt5008 = (Static37.anInt1025 << 7) - 1;
			}
			Static165.method2718();
			Static307.method4288();
			Static121.aClass172_3.pa(local114, local116, local114 + local112, local116 - -local118);
			Static121.aClass172_3.method5518();
			local316 = Static451.anInt7607;
			if (Static81.aClass108_4 == null) {
				Static121.aClass172_3.M(local316);
			} else {
				Static81.aClass108_4.method2711(local116, Static350.anInt3659 << 3, Static298.anInt5734, local118, local316, local112, Static121.aClass172_3, Static445.anInt7532, local114);
			}
			Static170.method2751();
			Static303.aClass107_4.Q(Static276.anInt5105, Static439.anInt7400, Static265.anInt5008, -Static298.anInt5734 & 0x3FFF, -Static445.anInt7532 & 0x3FFF, -Static445.anInt7524 & 0x3FFF);
			Static121.aClass172_3.m(Static303.aClass107_4);
			Static121.aClass172_3.GA(local114 + local112 / 2, local116 - -(local118 / 2), Static316.anInt5558 << 1, Static316.anInt5558 << 1);
			Static86.method1643(Static316.anInt5558 << 1, local116 + local118 / 2, Static316.anInt5558 << 1, local112 / 2 + local114);
			Static309.method4308(-Static298.anInt5734 & 0x3FFF, Static439.anInt7400, -Static445.anInt7532 & 0x3FFF, -Static445.anInt7524 & 0x3FFF, Static276.anInt5105, Static265.anInt5008);
			@Pc(556) byte local556 = Static374.aClass20_Sub1_1.method1810(Static105.anInt2382) == 2 ? (byte) Static52.anInt1374 : 1;
			Static446.method5886(Static121.aClass172_3, Static253.anInt4787, Static181.anInt3616, Static303.aClass107_4, Static276.anInt5105, Static439.anInt7400, Static265.anInt5008, Static229.aByteArrayArrayArray16, Static107.anIntArray141, Static91.anIntArray128, Static163.anIntArray403, Static433.anIntArray513, Static221.anIntArray277, Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 + 1, local556, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7, !Static374.aClass20_Sub1_1.aBoolean185);
			Static170.method2751();
			if (Static120.anInt2584 == 30) {
				Static125.method1985(local112, local118, local114, local116);
				Static66.method1318(local112, local114, local116, local118);
				Static322.method4382(local112, local114, local116, local118);
				Static68.method1326(local118, local116, local112, local114);
			}
			Static115.method1912();
			Static276.anInt5105 = local124;
			Static298.anInt5734 = local270;
			Static439.anInt7400 = local161;
			Static445.anInt7532 = local272;
			Static265.anInt5008 = local268;
			if (Static385.aBoolean554 && Static265.aClass257_2.method5396() == 0) {
				Static385.aBoolean554 = false;
			}
			if (Static385.aBoolean554) {
				Static121.aClass172_3.method5507(-16777216, local118, local114, local116, local112);
				Static53.method1120(false, Static21.aClass189_14.method4262(Static53.anInt1454), Static299.aClass59_3);
			}
		} else {
			Static121.aClass172_3.method5507(-16777216, arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method3090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		Static344.method4555(arg0, arg1, arg2, arg5, arg4, arg3, 0);
	}
}
