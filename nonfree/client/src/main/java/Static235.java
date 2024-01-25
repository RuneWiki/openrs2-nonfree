import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Lclient!u;")
	public static Class2_Sub39 aClass2_Sub39_2;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!g;")
	public static Class83 aClass83_84;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!g;")
	public static Class83 aClass83_85;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
	public static final int[] anIntArray388 = new int[32];

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!qo;IZ)V")
	public static void method4212(@OriginalArg(0) Class1_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static233.anInt4642 >= 400) {
			return;
		}
		@Pc(14) Class197 local14 = arg0.aClass197_1;
		if (local14.anIntArray468 != null) {
			local14 = local14.method4832(Static179.aClass115_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean407) {
			return;
		}
		@Pc(32) String local32 = local14.aString52;
		if (local14.anInt5495 != 0) {
			@Pc(51) String local51 = Static202.aClass38_2 == Static85.aClass38_1 ? Static88.aClass62_61.method1389(Static200.anInt4144) : Static350.aClass62_228.method1389(Static200.anInt4144);
			local32 = local32 + Static369.method5880(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956, local14.anInt5495) + " (" + local51 + local14.anInt5495 + ")";
		}
		if (!Static45.aBoolean446) {
			if (!arg1) {
				@Pc(145) String[] local145 = local14.aStringArray32;
				if (Static17.aBoolean43) {
					local145 = Static11.method103(local145);
				}
				@Pc(155) int local155;
				if (local145 != null) {
					for (local155 = 4; local155 >= 0; local155--) {
						if (local145[local155] != null && (Static255.aClass38_3 != Static85.aClass38_1 || !local145[local155].equalsIgnoreCase(Static370.aClass62_169.method1389(Static200.anInt4144)))) {
							@Pc(175) byte local175 = 0;
							if (local155 == 0) {
								local175 = 46;
							}
							@Pc(181) int local181 = Static134.anInt2940;
							if (local155 == 1) {
								local175 = 48;
							}
							if (local155 == 2) {
								local175 = 30;
							}
							if (local155 == 3) {
								local175 = 5;
							}
							if (local155 == 4) {
								local175 = 25;
							}
							if (local155 == local14.anInt5482) {
								local181 = local14.anInt5479;
							}
							if (local14.anInt5499 == local155) {
								local181 = local14.anInt5487;
							}
							Static51.method787((long) arg0.anInt5374, 0, local175, -1, local181, local145[local155], 0, false, "<col=ffff00>" + local32, true);
						}
					}
				}
				if (Static255.aClass38_3 == Static85.aClass38_1 && local145 != null) {
					for (local155 = 4; local155 >= 0; local155--) {
						if (local145[local155] != null && local145[local155].equalsIgnoreCase(Static370.aClass62_169.method1389(Static200.anInt4144))) {
							@Pc(277) short local277 = 0;
							if (local14.anInt5495 > Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956) {
								local277 = 2000;
							}
							@Pc(286) short local286 = 0;
							if (local155 == 0) {
								local286 = 46;
							}
							if (local155 == 1) {
								local286 = 48;
							}
							if (local155 == 2) {
								local286 = 30;
							}
							if (local155 == 3) {
								local286 = 5;
							}
							if (local155 == 4) {
								local286 = 25;
							}
							if (local286 != 0) {
								local286 += local277;
							}
							Static51.method787((long) arg0.anInt5374, 0, local286, -1, local14.anInt5481, local145[local155], 0, false, "<col=ffff00>" + local32, true);
						}
					}
				}
			}
			Static51.method787((long) arg0.anInt5374, 0, 1008, -1, Static27.anInt2840, Static319.aClass62_213.method1389(Static200.anInt4144), 0, arg1, "<col=ffff00>" + local32, true);
		} else if (!arg1) {
			@Pc(93) Class20 local93 = Static56.anInt5212 == -1 ? null : Static57.aClass79_1.method1851(Static56.anInt5212);
			if ((Static272.anInt5116 & 0x2) != 0) {
				if (local93 == null || local14.method4830(Static56.anInt5212, local93.anInt369) != local93.anInt369) {
					Static51.method787((long) arg0.anInt5374, 0, 6, -1, Static5.anInt136, Static207.aString34, 0, false, Static343.aString60 + " -> <col=ffff00>" + local32, true);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(JI)V")
	public static void method4214(@OriginalArg(0) long arg0) {
		if (Static45.aClass188ArrayArrayArray5 != null) {
			if (Static198.anInt4108 == 1 || Static198.anInt4108 == 5) {
				Static308.method5022(arg0);
			} else if (Static198.anInt4108 == 4) {
				Static50.method731(arg0);
			}
		}
		Static279.method4641(Static383.aClass48_9, (long) Static339.anInt6265);
		if (Static388.anInt7080 != -1) {
			Static311.method2432(Static388.anInt7080);
		}
		for (@Pc(39) int local39 = 0; local39 < Static198.anInt4111; local39++) {
			if (Static93.aBooleanArray10[local39]) {
				Static71.aBooleanArray8[local39] = true;
			}
			Static52.aBooleanArray13[local39] = Static93.aBooleanArray10[local39];
			Static93.aBooleanArray10[local39] = false;
		}
		Static301.anInt5605 = Static339.anInt6265;
		if (Static383.aClass48_9.method2453()) {
			Static383.aBoolean488 = true;
		}
		if (Static388.anInt7080 != -1) {
			Static198.anInt4111 = 0;
			Static182.method3402();
		}
		Static383.aClass48_9.method2505();
		Static313.method5076(Static383.aClass48_9);
		@Pc(94) int local94 = Static125.method2191();
		if (local94 == -1) {
			local94 = Static387.anInt7048;
		}
		Static145.method4761(local94);
		Static158.method2793(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, Static278.anInt5166, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800);
		Static278.anInt5166 = 0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)Z")
	public static boolean method4215(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub24 local12 = new Class2_Sub24(arg0);
		@Pc(16) int local16 = local12.method5732();
		if (local16 != 1) {
			return false;
		}
		@Pc(32) boolean local32 = local12.method5732() == 1;
		if (local32) {
			Static17.method377(local12);
		}
		Static284.method4938(local12);
		return true;
	}
}
