import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "Lclient!fg;")
	public static final Class112 aClass112_4 = new Class112();

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient!eh;")
	public static final Class94 aClass94_3 = new Class94();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!mk;B)Ljava/lang/String;")
	public static String method6496(@OriginalArg(0) Class5_Sub1_Sub13 arg0) {
		if (arg0.aString73 == null || arg0.aString73.length() == 0) {
			return arg0.aString74 == null || arg0.aString74.length() <= 0 ? arg0.aString75 : arg0.aString75 + Static184.aClass131_33.method3168(Static375.anInt7800) + arg0.aString74;
		} else if (arg0.aString74 == null || arg0.aString74.length() <= 0) {
			return arg0.aString75 + Static184.aClass131_33.method3168(Static375.anInt7800) + arg0.aString73;
		} else {
			return arg0.aString75 + Static184.aClass131_33.method3168(Static375.anInt7800) + arg0.aString74 + Static184.aClass131_33.method3168(Static375.anInt7800) + arg0.aString73;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
	public static int method6497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;Z)V")
	public static void method6498(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static96.aHashtable19.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)I")
	public static int method6500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static177.aClass84Array2 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg0 >> 9;
		@Pc(16) int local16 = arg2 >> 9;
		if (local12 < 0 || local16 < 0 || Static271.anInt4910 - 1 < local12 || local16 > Static613.anInt9909 - 1) {
			return 0;
		}
		@Pc(47) int local47 = arg1;
		if (arg1 < 3 && (Static172.aByteArrayArrayArray23[1][local12][local16] & 0x2) != 0) {
			local47 = arg1 + 1;
		}
		return Static177.aClass84Array2[local47].method7625(arg0, arg2);
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	public static void method6501() {
		for (@Pc(3) int local3 = 0; local3 < Static65.anInt1087; local3++) {
			@Pc(9) Class248 local9 = Static24.aClass248Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(169) int local169;
			if (local9.aClass5_Sub4_Sub4_3 == null) {
				local9.anInt6530--;
				if (local9.anInt6530 < (local9.method5709() ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte88 == 1 && local9.aClass115_1 == null) {
						local9.aClass115_1 = Static685.method2837(Static543.aClass126_247, local9.anInt6529, 0);
						if (local9.aClass115_1 == null) {
							continue;
						}
						local9.anInt6530 += local9.aClass115_1.method2838();
					} else if (local9.method5709() && (local9.aClass5_Sub22_3 == null || local9.aClass5_Sub27_Sub1_3 == null)) {
						if (local9.aClass5_Sub22_3 == null) {
							local9.aClass5_Sub22_3 = Static182.method3149(Static612.aClass126_279, local9.anInt6529);
						}
						if (local9.aClass5_Sub22_3 == null) {
							continue;
						}
						if (local9.aClass5_Sub27_Sub1_3 == null) {
							local9.aClass5_Sub27_Sub1_3 = local9.aClass5_Sub22_3.method3147(new int[] { 22050 });
							if (local9.aClass5_Sub27_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local9.anInt6530 < 0) {
						@Pc(150) int local150 = 8192;
						if (local9.anInt6532 == 0) {
							local169 = local9.anInt6528 * (local9.aByte88 == 3 ? Static577.aClass5_Sub19_25.aClass17_Sub15_1.method5251() : Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251()) >> 2;
						} else {
							@Pc(163) int local163 = local9.anInt6532 >> 24 & 0x3;
							if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local163) {
								@Pc(178) int local178 = (local9.anInt6532 & 0xFF) << 9;
								@Pc(184) int local184 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() << 8;
								@Pc(191) int local191 = local9.anInt6532 >> 16 & 0xFF;
								@Pc(202) int local202 = (local191 << 9) + 256 - (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 - local184);
								@Pc(209) int local209 = local9.anInt6532 >> 8 & 0xFF;
								@Pc(221) int local221 = local184 + (local209 << 9) + 256 - Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
								@Pc(230) int local230 = Math.abs(local202) + Math.abs(local221) - 512;
								if (local230 > local178) {
									local9.anInt6530 = -99999;
									continue;
								}
								if (local230 < 0) {
									local230 = 0;
								}
								local169 = (local178 - local230) * Static577.aClass5_Sub19_25.aClass17_Sub15_3.method5251() * local9.anInt6528 / local178 >> 2;
								if (local9.aClass4_Sub1_16 != null && local9.aClass4_Sub1_16 instanceof Class4_Sub1_Sub1) {
									@Pc(275) Class4_Sub1_Sub1 local275 = (Class4_Sub1_Sub1) local9.aClass4_Sub1_16;
									@Pc(278) short local278 = local275.aShort105;
									@Pc(281) short local281 = local275.aShort104;
								}
								if (local202 != 0 || local221 != 0) {
									@Pc(306) int local306 = -Static542.anInt8612 - (int) (Math.atan2((double) local202, (double) local221) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local306 > 8192) {
										local306 = 16384 - local306;
									}
									@Pc(328) int local328;
									if (local230 <= 0) {
										local328 = 8192;
									} else if (local230 >= 4096) {
										local328 = 16384;
									} else {
										local328 = (8192 - local230) / 4096 + 8192;
									}
									local150 = (16384 - local328 >> 1) + local328 * local306 / 8192;
								}
							} else {
								local169 = 0;
							}
						}
						if (local169 > 0) {
							@Pc(384) Class5_Sub27_Sub1 local384 = null;
							if (local9.aByte88 == 1) {
								local384 = local9.aClass115_1.method2836().method4336(Static354.aClass355_1);
							} else if (local9.method5709()) {
								local384 = local9.aClass5_Sub27_Sub1_3;
							}
							@Pc(416) Class5_Sub4_Sub4 local416 = local9.aClass5_Sub4_Sub4_3 = Static688.method4172(local384, local9.anInt6536, local169, local150);
							local416.method4168(local9.anInt6537 - 1);
							Static265.aClass5_Sub4_Sub1_2.method334(local416);
						}
					}
				}
			} else if (!local9.aClass5_Sub4_Sub4_3.method9219()) {
				local11 = true;
			}
			if (local11) {
				Static65.anInt1087--;
				for (local169 = local3; local169 < Static65.anInt1087; local169++) {
					Static24.aClass248Array1[local169] = Static24.aClass248Array1[local169 + 1];
				}
				local3--;
			}
		}
		if (Static76.aBoolean115 && !Static471.method6667(0x5C6B ^ 0xFFFFA394)) {
			if (Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251() != 0 && Static603.anInt9717 != -1) {
				if (Static210.aClass5_Sub4_Sub2_4 == null) {
					Static420.method6160(Static336.aClass126_156, Static603.anInt9717, Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251());
				} else {
					Static364.method5303(Static210.aClass5_Sub4_Sub2_4, Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251(), Static603.anInt9717, Static336.aClass126_156);
				}
			}
			Static76.aBoolean115 = false;
			Static210.aClass5_Sub4_Sub2_4 = null;
		} else if (Static577.aClass5_Sub19_25.aClass17_Sub15_4.method5251() != 0 && Static603.anInt9717 != -1 && !Static471.method6667(-1)) {
			@Pc(565) Class5_Sub41 local565 = Static647.method8905(Static6.aClass381_3, Static4.aClass389_17.aClass393_2);
			local565.aClass5_Sub36_Sub2_1.method7287(Static603.anInt9717);
			Static4.aClass389_17.method9079(local565);
			Static603.anInt9717 = -1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public static void method6502() {
		Static240.aClass141_4.method3312();
		Static292.aClass152_4.method3420();
		Static239.aClass294_1.method6579();
		Static528.aClass243_3.method5550();
		Static378.aClass369_2.method8469();
		Static82.aClass134_1.method3185();
		Static315.aClass14_1.method225();
		Static463.aClass352_1.method8012();
		Static284.aClass305_1.method6905();
		Static628.aClass348_1.method7729();
		Static379.aClass39_1.method763();
		Static197.aClass9_1.method154();
		Static591.aClass148_2.method3406();
		Static583.aClass327_4.method7409();
		Static201.aClass97_3.method1930();
		Static612.aClass380_2.method8837();
		Static234.aClass101_1.method2563();
		Static635.aClass356_1.method8131();
		Static332.aClass161_1.method3633();
		Static433.aClass104_1.method2583();
		Static458.aClass233_1.method5214();
		Static280.aClass111_1.method2752();
		Static140.aClass312_1.method7049();
		Static587.method8101();
		Static142.method6601();
		Static117.method1745();
		Static148.method2747();
		Static474.method6692();
		Static95.aClass168_17.method3852(5);
		Static250.aClass168_43.method3852(5);
		Static651.aClass168_95.method3852(5);
		Static199.aClass168_33.method3852(5);
		Static247.aClass168_42.method3852(5);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)I")
	public static int method6503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >>> 31;
		return (arg1 + local16) / arg0 - local16;
	}
}
