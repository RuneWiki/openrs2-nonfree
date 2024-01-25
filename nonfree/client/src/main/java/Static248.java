import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mo", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
	public static int anInt4698;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array10;

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_35 = new Class14();

	@OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
	public static int anInt4700 = 0;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_94 = new Class265(26, -1);

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "J")
	public static volatile long aLong127 = 0L;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)V")
	public static void method3786() {
		Static31.aClass148_3.method3343();
		Static44.aClass47_2.method896();
		Static356.aClass259_2.method5677();
		Static118.aClass165_2.method3798();
		Static219.aClass76_2.method1885();
		Static318.aClass144_6.method3274();
		Static338.aClass12_2.method253();
		Static395.aClass247_2.method5408();
		Static166.aClass6_1.method200();
		Static191.aClass151_1.method3405();
		Static262.aClass51_3.method1146();
		Static357.aClass215_4.method4743();
		Static258.aClass120_4.method2659();
		Static186.aClass161_1.method3728();
		Static250.aClass78_1.method1967();
		Static154.aClass252_1.method5611();
		Static318.aClass131_5.method2950();
		Static418.aClass86_1.method2078();
		Static254.aClass263_1.method5705();
		Static40.aClass84_1.method2055();
		Static83.method1597();
		Static192.method3009();
		Static15.method312();
		Static397.method5234();
		Static34.aClass171_4.method3933(5);
		Static450.aClass171_63.method3933(5);
		Static228.aClass171_37.method3933(5);
		Static236.aClass171_38.method3933(5);
		Static168.aClass171_26.method3933(5);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZIBI)V")
	public static void method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static440.aClass106ArrayArrayArray3 == null) {
			Static33.aClass49_1.method4480(arg3, arg0, -16777216, arg1, arg4);
		} else if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >= 0 && Static229.anInt4427 * 128 > Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 && Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >= 0 && Static379.anInt6422 * 128 > Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121) {
			Static356.anInt6044++;
			if (Static375.aClass3_Sub2_Sub1_Sub2_7 != null && Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 - (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() - 1) * 64 >> 7 == Static66.anInt134 && Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 - (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() - 1) * 64 >> 7 == Static220.anInt4265) {
				Static220.anInt4265 = -1;
				Static66.anInt134 = -1;
				Static141.method2387();
			}
			Static1.method708();
			if (!arg2) {
				Static328.method4558();
			}
			Static361.method4903();
			Static105.method1940(arg0, arg1, arg3, arg4, true);
			@Pc(119) int local119 = Static26.anInt615;
			@Pc(121) int local121 = Static380.anInt6430;
			@Pc(123) int local123 = Static394.anInt6579;
			@Pc(125) int local125 = Static201.anInt3540;
			@Pc(133) int local133;
			@Pc(170) int local170;
			if (Static159.anInt3195 == 1) {
				local133 = (int) Static287.aFloat74;
				if (local133 < Static4.anInt120 >> 8) {
					local133 = Static4.anInt120 >> 8;
				}
				if (Static129.aBooleanArray15[4] && local133 < Static22.anIntArray48[4] + 128) {
					local133 = Static22.anIntArray48[4] + 128;
				}
				local170 = (int) Static202.aFloat62 + Static279.anInt5093 & 0x3FFF;
				Static1.method703((local133 >> 3) * 3 + 600 << 0, Static335.anInt941, Static85.method1695(Static383.anInt6436, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119) - 50, local133, local125, local170, Static290.anInt5208);
			} else if (Static159.anInt3195 == 4) {
				local133 = (int) Static287.aFloat74;
				if (Static4.anInt120 >> 8 > local133) {
					local133 = Static4.anInt120 >> 8;
				}
				if (Static129.aBooleanArray15[4] && Static22.anIntArray48[4] + 128 > local133) {
					local133 = Static22.anIntArray48[4] + 128;
				}
				local170 = (int) Static202.aFloat62 & 0x3FFF;
				Static1.method703((local133 >> 3) * 3 + 600 << 0, Static335.anInt941, Static85.method1695(Static383.anInt6436, Static186.anInt3613, Static405.anInt6749) - 50, local133, local125, local170, Static290.anInt5208);
			} else if (Static159.anInt3195 == 5) {
				Static306.method4340(local125);
			}
			local133 = Static364.anInt6270;
			local170 = Static355.anInt6031;
			@Pc(283) int local283 = Static23.anInt567;
			@Pc(285) int local285 = Static119.anInt2680;
			@Pc(287) int local287 = Static140.anInt2975;
			@Pc(330) int local330;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static129.aBooleanArray15[local289]) {
					local330 = (int) ((double) (Static182.anIntArray314[local289] * 2 + 1) * Math.random() - (double) Static182.anIntArray314[local289] + Math.sin((double) Static323.anIntArray461[local289] * ((double) Static417.anIntArray591[local289] / 100.0D)) * (double) Static22.anIntArray48[local289]);
					if (local289 == 0) {
						Static364.anInt6270 += local330;
					}
					if (local289 == 4) {
						Static119.anInt2680 += local330;
						if (Static119.anInt2680 < 1024) {
							Static119.anInt2680 = 1024;
						} else if (Static119.anInt2680 > 3072) {
							Static119.anInt2680 = 3072;
						}
					}
					if (local289 == 1) {
						Static355.anInt6031 += local330;
					}
					if (local289 == 2) {
						Static23.anInt567 += local330;
					}
					if (local289 == 3) {
						Static140.anInt2975 = Static140.anInt2975 + local330 & 0x3FFF;
					}
				}
			}
			if (Static364.anInt6270 < 0) {
				Static364.anInt6270 = 0;
			}
			if (Static364.anInt6270 > (Static42.anInt4340 << 7) - 1) {
				Static364.anInt6270 = (Static42.anInt4340 << 7) - 1;
			}
			if (Static23.anInt567 < 0) {
				Static23.anInt567 = 0;
			}
			if ((Static386.anInt6463 << 7) - 1 < Static23.anInt567) {
				Static23.anInt567 = (Static386.anInt6463 << 7) - 1;
			}
			Static130.method2226();
			Static415.method5521();
			Static33.aClass49_1.OA(local121, local123, local121 + local119, local125 + local123);
			Static33.aClass49_1.method4477();
			local330 = Static152.anInt3143;
			if (Static441.aClass242_2 == null) {
				Static33.aClass49_1.p(local330);
			} else {
				Static441.aClass242_2.method5223(local125, Static33.aClass49_1, local119, local123, Static383.anInt6435 << 3, local121, Static119.anInt2680, Static140.anInt2975, local330);
			}
			Static112.method2026();
			Static17.aClass35_4.s(Static364.anInt6270, Static355.anInt6031, Static23.anInt567, -Static119.anInt2680 & 0x3FFF, -Static140.anInt2975 & 0x3FFF, -Static130.anInt2796 & 0x3FFF);
			Static33.aClass49_1.ea(Static17.aClass35_4);
			Static33.aClass49_1.H(local121 + local119 / 2, local125 / 2 + local123, Static149.anInt3091 << 1, Static149.anInt3091 << 1);
			Static367.method4995(local119 / 2 + local121, Static149.anInt3091 << 1, Static149.anInt3091 << 1, local125 / 2 + local123);
			Static311.method4387(Static364.anInt6270, Static355.anInt6031, Static23.anInt567, -Static130.anInt2796 & 0x3FFF, -Static140.anInt2975 & 0x3FFF, -Static119.anInt2680 & 0x3FFF);
			@Pc(558) byte local558 = Static12.aClass79_Sub1_1.method3962(Static399.anInt6653) == 2 ? (byte) Static356.anInt6044 : 1;
			Static30.method537(Static33.aClass49_1, Static131.anInt2821, Static64.anInt1455, Static17.aClass35_4, Static364.anInt6270, Static355.anInt6031, Static23.anInt567, Static231.aByteArrayArrayArray9, Static195.anIntArray333, Static236.anIntArray382, Static245.anIntArray552, Static217.anIntArray358, Static434.anIntArray604, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 + 1, local558, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7, !Static12.aClass79_Sub1_1.aBoolean368);
			Static112.method2026();
			if (Static162.anInt3250 == 30) {
				Static23.method484(local121, local125, local123, local119);
				Static160.method3482(local123, local125, local119, local121);
				Static448.method5746(local119, local125, local123, local121);
				Static414.method5442(local121, local119, local123, local125);
			}
			Static421.method5586();
			Static140.anInt2975 = local287;
			Static355.anInt6031 = local170;
			Static364.anInt6270 = local133;
			Static23.anInt567 = local283;
			Static119.anInt2680 = local285;
			if (Static417.aBoolean463 && Static102.aClass243_2.method5229() == 0) {
				Static417.aBoolean463 = false;
			}
			if (Static417.aBoolean463) {
				Static33.aClass49_1.method4480(local121, local119, -16777216, local123, local125);
				Static452.method5851(Static368.aClass116_4, false, Static99.aClass209_54.method4562(Static388.anInt6533));
			}
		} else {
			Static33.aClass49_1.method4480(arg3, arg0, -16777216, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method3789(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static411.method5409(local18) : local18;
		} else if (arg0 instanceof Class13) {
			@Pc(32) Class13 local32 = (Class13) arg0;
			return local32.method265();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
