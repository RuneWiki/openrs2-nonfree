import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ps", name = "Hc", descriptor = "[Lclient!na;")
	public static Class70[] aClass70Array3;

	@OriginalMember(owner = "client!ps", name = "Dd", descriptor = "I")
	public static int anInt5463;

	@OriginalMember(owner = "client!ps", name = "Gd", descriptor = "B")
	public static byte aByte81;

	@OriginalMember(owner = "client!ps", name = "Qc", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ps", name = "Fd", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_109 = new Class254(30, -1);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!qa;Lclient!m;)V")
	public static void method4332(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Interface5 arg1) {
		if (Static350.aClass1_Sub1_Sub6_2 == null) {
			return;
		}
		if (Static346.anInt6354 < 10) {
			if (!Static350.aClass109_82.method2342(Static350.aClass1_Sub1_Sub6_2.aString22)) {
				Static346.anInt6354 = Static44.aClass109_20.method2323(Static350.aClass1_Sub1_Sub6_2.aString22) / 10;
				return;
			}
			Static39.method520();
			Static346.anInt6354 = 10;
		}
		if (Static346.anInt6354 == 10) {
			Static350.anInt6636 = Static350.aClass1_Sub1_Sub6_2.anInt1093 >> 6 << 6;
			Static350.anInt6639 = Static350.aClass1_Sub1_Sub6_2.anInt1092 >> 6 << 6;
			Static350.anInt6633 = (Static350.aClass1_Sub1_Sub6_2.anInt1091 >> 6 << 6) + 64 - Static350.anInt6636;
			Static350.anInt6635 = (Static350.aClass1_Sub1_Sub6_2.anInt1090 >> 6 << 6) + 64 - Static350.anInt6639;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static350.aClass1_Sub1_Sub6_2.method914(Static331.anInt6034 + (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7), (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7) + Static190.anInt3507, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local76)) {
				local78 = local76[1] - Static350.anInt6639;
				local80 = local76[2] - Static350.anInt6636;
			}
			if (!Static442.aBoolean651 && local78 >= 0 && Static350.anInt6635 > local78 && local80 >= 0 && local80 < Static350.anInt6633) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static39.anInt620 = local80;
				Static347.anInt6358 = local78;
			} else if (Static335.anInt6109 == -1 || Static12.anInt258 == -1) {
				Static350.aClass1_Sub1_Sub6_2.method915(Static350.aClass1_Sub1_Sub6_2.anInt1082 & 0x3FFF, local76, Static350.aClass1_Sub1_Sub6_2.anInt1082 >> 14 & 0x3FFF);
				Static39.anInt620 = local76[2] - Static350.anInt6636;
				Static347.anInt6358 = local76[1] - Static350.anInt6639;
			} else {
				Static350.aClass1_Sub1_Sub6_2.method915(Static12.anInt258, local76, Static335.anInt6109);
				Static442.aBoolean651 = false;
				if (local76 != null) {
					Static347.anInt6358 = local76[1] - Static350.anInt6639;
					Static39.anInt620 = local76[2] - Static350.anInt6636;
				}
				Static12.anInt258 = -1;
				Static335.anInt6109 = -1;
			}
			if (Static350.aClass1_Sub1_Sub6_2.anInt1085 == 37) {
				Static350.aFloat113 = 3.0F;
				Static350.aFloat112 = 3.0F;
			} else if (Static350.aClass1_Sub1_Sub6_2.anInt1085 == 50) {
				Static350.aFloat113 = 4.0F;
				Static350.aFloat112 = 4.0F;
			} else if (Static350.aClass1_Sub1_Sub6_2.anInt1085 == 75) {
				Static350.aFloat113 = 6.0F;
				Static350.aFloat112 = 6.0F;
			} else if (Static350.aClass1_Sub1_Sub6_2.anInt1085 == 100) {
				Static350.aFloat113 = 8.0F;
				Static350.aFloat112 = 8.0F;
			} else if (Static350.aClass1_Sub1_Sub6_2.anInt1085 == 200) {
				Static350.aFloat113 = 16.0F;
				Static350.aFloat112 = 16.0F;
			} else {
				Static350.aFloat113 = 8.0F;
				Static350.aFloat112 = 8.0F;
			}
			Static350.anInt6631 = (int) Static350.aFloat113 >> 1;
			Static350.aByteArrayArrayArray17 = Static172.method2743(Static350.anInt6631);
			Static250.method3591();
			Static350.method5178();
			Static115.aClass142_15 = new Class142();
			Static350.anInt6629 += (int) (Math.random() * 5.0D) - 2;
			if (Static350.anInt6629 < -8) {
				Static350.anInt6629 = -8;
			}
			Static350.anInt6630 += (int) (Math.random() * 5.0D) - 2;
			if (Static350.anInt6629 > 8) {
				Static350.anInt6629 = 8;
			}
			if (Static350.anInt6630 < -16) {
				Static350.anInt6630 = -16;
			}
			if (Static350.anInt6630 > 16) {
				Static350.anInt6630 = 16;
			}
			Static350.method5185(arg1, Static350.anInt6629 >> 2 << 10, Static350.anInt6630 >> 1);
			Static350.aClass103_4.method2054(1024, 256);
			Static350.aClass177_4.method3801(256, 256);
			Static350.aClass207_4.method4984(4096);
			Static82.aClass260_1.method5909(256);
			Static346.anInt6354 = 20;
		} else if (Static346.anInt6354 == 20) {
			Static5.method5254(true);
			Static350.method5200(arg0, Static350.anInt6629, Static350.anInt6630);
			Static346.anInt6354 = 60;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 60) {
			if (Static350.aClass109_82.method2334(Static350.aClass1_Sub1_Sub6_2.aString22 + "_staticelements")) {
				if (!Static350.aClass109_82.method2342(Static350.aClass1_Sub1_Sub6_2.aString22 + "_staticelements")) {
					return;
				}
				Static350.aClass84_3 = Static244.method5752(Static175.aBoolean433, Static350.aClass1_Sub1_Sub6_2.aString22 + "_staticelements", Static350.aClass109_82);
			} else {
				Static350.aClass84_3 = new Class84(0);
			}
			Static350.method5183();
			Static346.anInt6354 = 70;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 70) {
			Static78.aClass251_4 = new Class251(arg0, 11, true, Static159.aCanvas3);
			Static346.anInt6354 = 73;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 73) {
			Static42.aClass251_9 = new Class251(arg0, 12, true, Static159.aCanvas3);
			Static346.anInt6354 = 76;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 76) {
			Static251.aClass251_7 = new Class251(arg0, 14, true, Static159.aCanvas3);
			Static346.anInt6354 = 79;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 79) {
			Static212.aClass251_6 = new Class251(arg0, 17, true, Static159.aCanvas3);
			Static346.anInt6354 = 82;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 82) {
			Static2.aClass251_1 = new Class251(arg0, 19, true, Static159.aCanvas3);
			Static346.anInt6354 = 85;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 85) {
			Static311.aClass251_12 = new Class251(arg0, 22, true, Static159.aCanvas3);
			Static346.anInt6354 = 88;
			Static5.method5254(true);
			Static346.method4985();
		} else if (Static346.anInt6354 == 88) {
			Static352.aClass251_11 = new Class251(arg0, 26, true, Static159.aCanvas3);
			Static346.anInt6354 = 91;
			Static5.method5254(true);
			Static346.method4985();
		} else {
			Static43.aClass251_3 = new Class251(arg0, 30, true, Static159.aCanvas3);
			Static346.anInt6354 = 100;
			Static5.method5254(true);
			Static346.method4985();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(II)V")
	public static void method4333(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class1 local11 = Static402.aClass51_37.method928(); local11 != null; local11 = Static402.aClass51_37.method926()) {
			if ((local11.aLong237 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method5965();
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ps;Z)V")
	public static void method4335(@OriginalArg(0) Class47_Sub1_Sub5_Sub2 arg0) {
		@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) Static254.aClass51_14.method930((long) arg0.anInt5358);
		if (local16 == null) {
			Static174.method2767(arg0.aByte97, null, arg0.anIntArray407[0], null, 0, arg0, arg0.anIntArray408[0]);
		} else {
			local16.method3052();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method4338(@OriginalArg(0) Class47_Sub1_Sub5_Sub1 arg0) {
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) Static427.aClass142_49.method3199(); local15 != null; local15 = (Class1_Sub25) Static427.aClass142_49.method3198()) {
			if (arg0 == local15.aClass47_Sub1_Sub5_Sub1_1) {
				if (local15.aClass1_Sub5_Sub2_3 != null) {
					Static292.aClass1_Sub5_Sub1_2.method423(local15.aClass1_Sub5_Sub2_3);
					local15.aClass1_Sub5_Sub2_3 = null;
				}
				local15.method5965();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(II)V")
	public static void method4344(@OriginalArg(1) int arg0) {
		Static290.anInt4872 = 1000 / arg0;
	}
}
