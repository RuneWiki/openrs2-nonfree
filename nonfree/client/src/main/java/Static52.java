import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!j", name = "Gc", descriptor = "Lclient!od;")
	private static Class60 aClass60_514 = Static41.method597("Loading title screen )2 ");

	@OriginalMember(owner = "client!j", name = "zc", descriptor = "Lclient!od;")
	public static Class60 aClass60_511 = aClass60_514;

	@OriginalMember(owner = "client!j", name = "Ac", descriptor = "Lclient!od;")
	private static Class60 aClass60_512 = Static41.method597("Invalid username or password)3");

	@OriginalMember(owner = "client!j", name = "Cc", descriptor = "Lclient!od;")
	public static Class60 aClass60_513 = aClass60_512;

	@OriginalMember(owner = "client!j", name = "Ec", descriptor = "I")
	public static int anInt1452 = -1;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(I)V")
	public static void method860() {
		@Pc(12) int local12;
		if (Static56.anInt1514 > 0) {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static56.anInt1514 > 768) {
					Static12.anIntArray328[local12] = Static27.method461(Static49.anIntArray123[local12], Static84.anIntArray229[local12], 1024 - Static56.anInt1514);
				} else if (Static56.anInt1514 <= 256) {
					Static12.anIntArray328[local12] = Static27.method461(Static84.anIntArray229[local12], Static49.anIntArray123[local12], 256 - Static56.anInt1514);
				} else {
					Static12.anIntArray328[local12] = Static84.anIntArray229[local12];
				}
			}
		} else if (Static96.anInt2277 <= 0) {
			for (local12 = 0; local12 < 256; local12++) {
				Static12.anIntArray328[local12] = Static49.anIntArray123[local12];
			}
		} else {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static96.anInt2277 > 768) {
					Static12.anIntArray328[local12] = Static27.method461(Static49.anIntArray123[local12], Static75.anIntArray127[local12], 1024 - Static96.anInt2277);
				} else if (Static96.anInt2277 <= 256) {
					Static12.anIntArray328[local12] = Static27.method461(Static75.anIntArray127[local12], Static49.anIntArray123[local12], 256 - Static96.anInt2277);
				} else {
					Static12.anIntArray328[local12] = Static75.anIntArray127[local12];
				}
			}
		}
		Static34.method1652(0, 9, 128, 263);
		Static97.aClass4_Sub3_Sub6_Sub3_4.method1629(0, 0);
		local12 = 0;
		Static34.method1662();
		@Pc(167) int local167 = 6885;
		@Pc(182) int local182;
		@Pc(186) int local186;
		@Pc(199) int local199;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(220) int local220;
		@Pc(215) int local215;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local182 = (256 - local169) * Static107.anIntArray323[local169] / 256;
			local186 = local182 + 22;
			if (local186 < 0) {
				local186 = 0;
			}
			local12 += local186;
			for (local199 = local186; local199 < 128; local199++) {
				local206 = Static80.anIntArray222[local12++];
				if (local206 == 0) {
					local167++;
				} else {
					local210 = local206;
					local215 = Static86.aClass14_1.anIntArray124[local167];
					local220 = 256 - local206;
					local206 = Static12.anIntArray328[local206];
					Static86.aClass14_1.anIntArray124[local167++] = ((local206 & 0xFF00FF) * local210 + (local215 & 0xFF00FF) * local220 & 0xFF00FF00) + ((local215 & 0xFF00) * local220 + local210 * (local206 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local167 += local186 + 765 - 128;
		}
		Static34.method1652(637, 9, 765, 263);
		local167 = 7546;
		Static131.aClass4_Sub3_Sub6_Sub3_6.method1629(382, 0);
		Static34.method1662();
		local12 = 0;
		for (local182 = 1; local182 < 255; local182++) {
			local186 = (256 - local182) * Static107.anIntArray323[local182] / 256;
			local167 += local186;
			local199 = 103 - local186;
			for (local206 = 0; local206 < local199; local206++) {
				local210 = Static80.anIntArray222[local12++];
				if (local210 == 0) {
					local167++;
				} else {
					local220 = local210;
					local215 = 256 - local210;
					@Pc(351) int local351 = Static86.aClass14_1.anIntArray124[local167];
					local210 = Static12.anIntArray328[local210];
					Static86.aClass14_1.anIntArray124[local167++] = ((local351 & 0xFF00FF) * local215 + (local210 & 0xFF00FF) * local220 & 0xFF00FF00) + ((local351 & 0xFF00) * local215 + local220 * (local210 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local167 += 765 - local186 - local199;
			local12 += 128 - local199;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!nf;I[B)V")
	public static void method861(@OriginalArg(1) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class4_Sub12 local3 = new Class4_Sub12();
		local3.anInt1660 = 0;
		local3.aLong100 = arg1;
		local3.aByteArray15 = arg2;
		local3.aClass56_31 = arg0;
		@Pc(22) Class45 local22 = Static37.aClass45_7;
		synchronized (Static37.aClass45_7) {
			Static37.aClass45_7.method988(local3);
		}
		Static22.method421();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!tf;Lclient!ve;I)V")
	public static void method862(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub5 local9 = new Class4_Sub5();
		local9.anInt864 = arg0.method773();
		local9.anInt863 = arg0.method780();
		local9.aClass43Array1 = new Class43[local9.anInt864];
		local9.anIntArray88 = new int[local9.anInt864];
		local9.anIntArray90 = new int[local9.anInt864];
		local9.aClass43Array2 = new Class43[local9.anInt864];
		local9.aByteArrayArrayArray2 = new byte[local9.anInt864][][];
		local9.anIntArray89 = new int[local9.anInt864];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt864; local55++) {
			try {
				@Pc(61) int local61 = arg0.method773();
				@Pc(85) String local85;
				@Pc(94) String local94;
				@Pc(76) int local76;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local76 = 0;
					local85 = new String(arg0.method776().method1320());
					local94 = new String(arg0.method776().method1320());
					if (local61 == 1) {
						local76 = arg0.method780();
					}
					local9.anIntArray89[local55] = local61;
					local9.anIntArray88[local55] = local76;
					local9.aClass43Array2[local55] = arg1.method1936(Static131.method1979(local85), local94);
				} else if (local61 == 3 || local61 == 4) {
					local85 = new String(arg0.method776().method1320());
					local94 = new String(arg0.method776().method1320());
					local76 = arg0.method773();
					@Pc(161) String[] local161 = new String[local76];
					for (@Pc(163) int local163 = 0; local163 < local76; local163++) {
						local161[local163] = new String(arg0.method776().method1320());
					}
					@Pc(183) byte[][] local183 = new byte[local76][];
					@Pc(194) int local194;
					if (local61 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local76; local188++) {
							local194 = arg0.method780();
							local183[local188] = new byte[local194];
							arg0.method794(local194, local183[local188]);
						}
					}
					@Pc(214) Class[] local214 = new Class[local76];
					local9.anIntArray89[local55] = local61;
					for (local194 = 0; local194 < local76; local194++) {
						local214[local194] = Static131.method1979(local161[local194]);
					}
					local9.aClass43Array1[local55] = arg1.method1935(local94, Static131.method1979(local85), local214);
					local9.aByteArrayArrayArray2[local55] = local183;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local9.anIntArray90[local55] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local9.anIntArray90[local55] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local9.anIntArray90[local55] = -3;
			} catch (@Pc(279) Exception local279) {
				local9.anIntArray90[local55] = -4;
			} catch (@Pc(286) Throwable local286) {
				local9.anIntArray90[local55] = -5;
			}
		}
		Static32.aClass45_6.method988(local9);
	}

	@OriginalMember(owner = "client!j", name = "n", descriptor = "(I)V")
	public static void method863() {
		aClass60_513 = null;
		aClass60_511 = null;
		aClass60_514 = null;
		aClass60_512 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!od;)V")
	public static void method864(@OriginalArg(1) Class60 arg0) {
		if (Static117.anInt2726 >= 2) {
			if (arg0.method1318(Static36.aClass60_365)) {
				System.gc();
			}
			if (arg0.method1318(Static94.aClass60_903)) {
				Static116.method1880();
			}
			if (arg0.method1318(Static79.aClass60_789)) {
				Static133.aBoolean129 = true;
			}
			if (arg0.method1318(Static49.aClass60_458)) {
				Static133.aBoolean129 = false;
			}
			if (arg0.method1318(Static70.aClass60_699)) {
				for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
					for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
						for (@Pc(54) int local54 = 1; local54 < 103; local54++) {
							Static50.aClass28Array3[local46].anIntArrayArray28[local50][local54] = 0;
						}
					}
				}
			}
			if (arg0.method1318(Static115.aClass60_1043) && Static116.anInt2705 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1321(Static28.aClass60_830)) {
				Static111.anInt2633 = arg0.method1315(12).method1334().method1324();
				Static90.method1469(0, null, Static12.method1761(new Class60[] { Static56.aClass60_548, Static65.method1051(Static111.anInt2633) }));
			}
			if (arg0.method1318(Static132.aClass60_1140)) {
				Static62.aBoolean54 = true;
			}
		}
		Static14.aClass4_Sub9_Sub1_1.method826(141);
		Static14.aClass4_Sub9_Sub1_1.method819(arg0.method1345() - 1);
		Static14.aClass4_Sub9_Sub1_1.method788(arg0.method1315(2));
	}
}
