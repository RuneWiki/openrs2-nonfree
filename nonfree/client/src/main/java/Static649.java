import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public static int anInt10005;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_117 = new Class241(46, -1);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZIII)V")
	public static void method8701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static334.aClass243ArrayArrayArray2 == null) {
			Static202.aClass75_5.method6631(arg1, arg3, arg4, -16777216, arg0);
		} else if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >= 0 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 < Static29.anInt380 * 512 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >= 0 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 < Static327.anInt5650 * 512) {
			Static227.anInt4418++;
			if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 != null && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 - (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) - 1) * 256 >> 9 == Static97.anInt1434 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 - (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) - 1) * 256 >> 9 == Static208.anInt4167) {
				Static97.anInt1434 = -1;
				Static208.anInt4167 = -1;
				Static202.method3751();
			}
			Static437.method6613();
			if (!arg2) {
				Static608.method8380();
			}
			Static237.method4202();
			Static316.method5657(arg4, arg1, arg3, true, arg0);
			@Pc(129) int local129 = Static147.anInt3100;
			Static377.anInt6468 = Static377.anInt6464;
			@Pc(133) int local133 = Static221.anInt4359;
			@Pc(135) int local135 = Static391.anInt6746;
			@Pc(137) int local137 = Static348.anInt5924;
			@Pc(143) int local143;
			@Pc(186) int local186;
			if (Static526.anInt8626 == 1) {
				local143 = (int) Static135.aFloat51;
				if (Static97.anInt1438 >> 8 > local143) {
					local143 = Static97.anInt1438 >> 8;
				}
				if (Static153.aBooleanArray9[4] && Static449.anIntArray491[4] + 128 > local143) {
					local143 = Static449.anIntArray491[4] + 128;
				}
				local186 = Static28.anInt375 + (int) Static409.aFloat135 & 0x3FFF;
				Static419.method6417((local143 >> 3) * 3 + 600 << 2, Static170.anInt3533, local186, local143, local135, Static331.anInt8309, Static248.method4318(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057, Static504.anInt8428, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048) - 200);
			} else if (Static526.anInt8626 == 4) {
				local143 = (int) Static135.aFloat51;
				if (Static97.anInt1438 >> 8 > local143) {
					local143 = Static97.anInt1438 >> 8;
				}
				if (Static153.aBooleanArray9[4] && local143 < Static449.anIntArray491[4] + 128) {
					local143 = Static449.anIntArray491[4] + 128;
				}
				local186 = (int) Static409.aFloat135 & 0x3FFF;
				Static419.method6417((local143 >> 3) * 3 + 600 << 2, Static170.anInt3533, local186, local143, local135, Static331.anInt8309, Static248.method4318(Static553.anInt8968, Static504.anInt8428, Static492.anInt3485) - 200);
			} else if (Static526.anInt8626 == 5) {
				Static128.method2492(local135);
			}
			local143 = Static475.anInt8090;
			local186 = Static406.anInt7076;
			@Pc(307) int local307 = Static365.anInt6155;
			@Pc(316) int local316 = Static337.anInt5759;
			@Pc(318) int local318 = Static21.anInt279;
			@Pc(364) int local364;
			for (@Pc(320) int local320 = 0; local320 < 5; local320++) {
				if (Static153.aBooleanArray9[local320]) {
					local364 = (int) ((double) -Static566.anIntArray532[local320] + (double) (Static566.anIntArray532[local320] * 2 + 1) * Math.random() + Math.sin((double) Static237.anIntArray239[local320] * ((double) Static401.anIntArray429[local320] / 100.0D)) * (double) Static449.anIntArray491[local320]);
					if (local320 == 4) {
						Static337.anInt5759 += local364;
						if (Static337.anInt5759 < 1024) {
							Static337.anInt5759 = 1024;
						} else if (Static337.anInt5759 > 3072) {
							Static337.anInt5759 = 3072;
						}
					}
					if (local320 == 2) {
						Static365.anInt6155 += local364 << 2;
					}
					if (local320 == 1) {
						Static406.anInt7076 += local364 << 2;
					}
					if (local320 == 0) {
						Static475.anInt8090 += local364 << 2;
					}
					if (local320 == 3) {
						Static21.anInt279 = Static21.anInt279 + local364 & 0x3FFF;
					}
				}
			}
			if (Static475.anInt8090 < 0) {
				Static475.anInt8090 = 0;
			}
			if (Static365.anInt6155 < 0) {
				Static365.anInt6155 = 0;
			}
			if ((Static230.anInt4470 << 9) - 1 < Static475.anInt8090) {
				Static475.anInt8090 = (Static230.anInt4470 << 9) - 1;
			}
			if ((Static63.anInt777 << 9) - 1 < Static365.anInt6155) {
				Static365.anInt6155 = (Static63.anInt777 << 9) - 1;
			}
			Static404.method6215();
			Static202.aClass75_5.KA(local129, local133, local129 + local137, local135 + local133);
			Static220.method4009(true);
			local364 = Static15.anInt224;
			Static373.aClass109_5.method4601(Static475.anInt8090, Static406.anInt7076, Static365.anInt6155, -Static337.anInt5759 & 0x3FFF, -Static21.anInt279 & 0x3FFF, -Static200.anInt4059 & 0x3FFF);
			Static202.aClass75_5.method6695(Static373.aClass109_5);
			Static202.aClass75_5.DA(local137 / 2 + local129, local135 / 2 + local133, Static70.anInt935 << 1, Static70.anInt935 << 1);
			if (Static93.aBoolean113) {
				Static79.method1088(Static15.anInt224);
				if (Static377.anInt6468 != Static461.anInt7972) {
					Static429.aBoolean549 = true;
				}
				Static461.anInt7972 = Static377.anInt6468;
				Static202.aClass75_5.GA(local364);
				Static202.aClass75_5.ya();
			} else if (Static372.aClass277_7 == null) {
				Static202.aClass75_5.GA(local364);
				Static202.aClass75_5.ya();
			} else {
				Static202.aClass75_5.xa(1.0F);
				Static202.aClass75_5.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Static372.aClass277_7.method6943(local129, local135, Static202.aClass75_5, Static21.anInt279, local137, local133, local364, Static337.anInt5759, Static646.anInt8107 << 3, Static200.anInt4059);
			}
			Static302.method4850();
			Static637.method8604(Static70.anInt935 << 1, Static70.anInt935 << 1, local129 + local137 / 2, local133 - -(local135 / 2));
			Static20.method242(Static365.anInt6155, -Static200.anInt4059 & 0x3FFF, Static406.anInt7076, -Static21.anInt279 & 0x3FFF, Static475.anInt8090, -Static337.anInt5759 & 0x3FFF);
			Static550.method7787();
			@Pc(692) byte local692 = Static687.aClass6_Sub44_33.aClass7_Sub24_2.method7501() == 2 ? (byte) Static227.anInt4418 : 1;
			if (Static93.aBoolean113) {
				Static442.method6873(-Static21.anInt279 & 0x3FFF, -Static337.anInt5759 & 0x3FFF, -Static200.anInt4059 & 0x3FFF);
				Static531.method7618(Static475.anInt8090, Static687.aClass6_Sub44_33.aClass7_Sub29_1.method8614() == 0, Static377.anInt6468, Static141.anInt8737, Static224.anIntArray222, Static406.anInt7076, Static451.anIntArray492, local692, Static568.anIntArray660, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9, Static365.anInt6155, Static333.aByteArrayArrayArray15, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 + 1, Static39.anIntArray39, Static236.anIntArray235);
			} else {
				Static545.method7721(Static141.anInt8737, Static475.anInt8090, Static406.anInt7076, Static365.anInt6155, Static333.aByteArrayArrayArray15, Static451.anIntArray492, Static39.anIntArray39, Static568.anIntArray660, Static224.anIntArray222, Static236.anIntArray235, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 + 1, local692, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9, Static687.aClass6_Sub44_33.aClass7_Sub29_1.method8614() == 0, Static490.aBoolean634 ? Static377.anInt6468 : -1, 0, false);
			}
			Static302.method4850();
			if (Static37.anInt498 == 11) {
				Static326.method5115(local137, local135, local133, local129);
				Static199.method3722(local133, local135, local129, local137);
				Static131.method2543(local133, local135, local129, local137);
				Static541.method8076(local129, local137, local133, local135);
			}
			Static255.method4448();
			Static21.anInt279 = local318;
			Static406.anInt7076 = local186;
			Static475.anInt8090 = local143;
			Static365.anInt6155 = local307;
			Static337.anInt5759 = local316;
			if (Static508.aBoolean258 && Static116.aClass189_2.method4684() == 0) {
				Static508.aBoolean258 = false;
			}
			if (Static508.aBoolean258) {
				Static202.aClass75_5.method6631(local137, local129, local135, -16777216, local133);
				Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, false);
			}
			Static220.method4009(false);
		} else {
			Static202.aClass75_5.method6631(arg1, arg3, arg4, -16777216, arg0);
		}
	}
}
