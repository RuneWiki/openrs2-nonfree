import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ir", name = "X", descriptor = "Lclient!tj;")
	public static Class122 aClass122_3;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "[I")
	public static final int[] anIntArray193 = new int[256];

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "Lclient!m;")
	public static final Class127 aClass127_15 = new Class127();

	@OriginalMember(owner = "client!ir", name = "V", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_23 = new Class198(64);

	@OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
	public static volatile int anInt2850 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method2287(@OriginalArg(1) Class122 arg0) {
		@Pc(11) int local11 = Static277.anInt5536;
		@Pc(13) int local13 = Static86.anInt4285;
		@Pc(15) int local15 = Static260.anInt5197;
		@Pc(19) int local19 = Static257.anInt5150 - 3;
		if (Static336.aClass57_26 == null || Static354.aClass57_27 == null) {
			if (Static317.aClass100_112.method2289(Static317.anInt5592) && Static317.aClass100_112.method2289(Static279.anInt5573)) {
				Static336.aClass57_26 = arg0.method4757(Static366.method3895(Static317.aClass100_112, Static317.anInt5592, 0));
				@Pc(65) Class149 local65 = Static366.method3895(Static317.aClass100_112, Static279.anInt5573, 0);
				Static354.aClass57_27 = arg0.method4757(local65);
				local65.method3896();
				Static132.aClass57_9 = arg0.method4757(local65);
			} else {
				arg0.method4732(local11, local13, local15, 20, Static285.anInt5663 | 255 - Static99.anInt2128 << 24, 1);
			}
		}
		@Pc(93) int local93;
		@Pc(91) int local91;
		if (Static336.aClass57_26 != null && Static354.aClass57_27 != null) {
			local91 = (local15 - Static354.aClass57_27.method5440() * 2) / Static336.aClass57_26.method5440();
			for (local93 = 0; local93 < local91; local93++) {
				Static336.aClass57_26.method5448(local11 + Static354.aClass57_27.method5440() + Static336.aClass57_26.method5440() * local93, local13);
			}
			Static354.aClass57_27.method5448(local11, local13);
			Static132.aClass57_9.method5448(local11 + local15 - Static132.aClass57_9.method5440(), local13);
		}
		Static243.aClass120_6.method5528(Static334.aString244, -1, local13 + 14, Static254.anInt5036 | 0xFF000000, local11 + 3);
		arg0.method4732(local11, local13 + 20, local15, local19 - 20, -Static99.anInt2128 + 255 << 24 | Static285.anInt5663, 1);
		local91 = Static192.anInt4000;
		local93 = Static221.anInt4562;
		@Pc(186) int local186;
		for (@Pc(169) int local169 = 0; local169 < Static170.anInt6279; local169++) {
			local186 = (Static170.anInt6279 - local169 - 1) * 16 + local13 + 20 + 13;
			if (local91 > local11 && local11 + local15 > local91 && local186 - 13 < local93 && local186 + 3 > local93) {
				arg0.method4732(local11, local186 - 12, local15, 16, Static168.anInt3473 | 255 - Static261.anInt5215 << 24, 1);
			}
		}
		if ((Static126.aClass57_14 == null || Static329.aClass57_24 == null || Static40.aClass57_25 == null) && Static317.aClass100_112.method2289(Static106.anInt2249) && Static317.aClass100_112.method2289(Static186.anInt3096) && Static317.aClass100_112.method2289(Static343.anInt6681)) {
			@Pc(251) Class149 local251 = Static366.method3895(Static317.aClass100_112, Static186.anInt3096, 0);
			Static329.aClass57_24 = arg0.method4757(local251);
			local251.method3896();
			Static34.aClass57_4 = arg0.method4757(local251);
			Static126.aClass57_14 = arg0.method4757(Static366.method3895(Static317.aClass100_112, Static106.anInt2249, 0));
			@Pc(276) Class149 local276 = Static366.method3895(Static317.aClass100_112, Static343.anInt6681, 0);
			Static40.aClass57_25 = arg0.method4757(local276);
			local276.method3896();
			Static248.aClass57_16 = arg0.method4757(local276);
		}
		@Pc(346) int local346;
		@Pc(348) int local348;
		if (Static126.aClass57_14 != null && Static329.aClass57_24 != null && Static40.aClass57_25 != null) {
			local186 = (local15 - Static40.aClass57_25.method5440() * 2) / Static126.aClass57_14.method5440();
			for (@Pc(306) int local306 = 0; local306 < local186; local306++) {
				Static126.aClass57_14.method5448(local11 + Static40.aClass57_25.method5440() + Static126.aClass57_14.method5440() * local306, local13 + local19 + -Static126.aClass57_14.method5447());
			}
			local346 = (local19 - Static40.aClass57_25.method5447() - 20) / Static329.aClass57_24.method5447();
			for (local348 = 0; local348 < local346; local348++) {
				Static329.aClass57_24.method5448(local11, Static329.aClass57_24.method5447() * local348 + local13 + 20);
				Static34.aClass57_4.method5448(local15 + local11 - Static34.aClass57_4.method5440(), local348 * Static329.aClass57_24.method5447() + local13 + 20);
			}
			Static40.aClass57_25.method5448(local11, local19 + local13 - Static40.aClass57_25.method5447());
			Static248.aClass57_16.method5448(local15 + local11 - Static40.aClass57_25.method5440(), -Static40.aClass57_25.method5447() + local13 - -local19);
		}
		local186 = 0;
		for (@Pc(415) Class3_Sub26 local415 = (Class3_Sub26) Static116.aClass127_12.method3402(); local415 != null; local415 = (Class3_Sub26) Static116.aClass127_12.method3400()) {
			local346 = (Static170.anInt6279 - local186 - 1) * 16 + local13 + 20 + 13;
			local348 = Static254.anInt5036 | 0xFF000000;
			if (local11 < local91 && local91 < local15 + local11 && local93 > local346 - 13 && local346 + 3 > local93) {
				local348 = Static344.anInt6693 | 0xFF000000;
			}
			@Pc(472) int[] local472 = null;
			if (Static128.method2209(local415.anInt2734)) {
				local472 = Static230.method5537((int) local415.aLong100).anIntArray79;
			} else if (Static72.method1116(local415.anInt2734)) {
				@Pc(488) Class5_Sub4_Sub4_Sub2 local488 = Static244.aClass5_Sub4_Sub4_Sub2Array1[(int) local415.aLong100];
				if (local488 != null) {
					local472 = local488.aClass119_1.anIntArray249;
				}
			} else if (Static85.method1379(local415.anInt2734)) {
				if (local415.anInt2734 == 1011) {
					local472 = Static268.method4553((int) local415.aLong100).anIntArray422;
				} else {
					local472 = Static268.method4553((int) (local415.aLong100 >>> 32 & 0x7FFFFFFFL)).anIntArray422;
				}
			}
			@Pc(535) String local535 = Static23.method436(local415);
			if (local472 != null) {
				local535 = local535 + Static48.method840(local472);
			}
			local186++;
			Static243.aClass120_6.method5524(local11 + 3, Static327.anIntArray527, 0, local348, Static274.aClass57Array22, local346, local535);
		}
		Static314.method5233(Static260.anInt5197, Static86.anInt4285, Static277.anInt5536, Static257.anInt5150);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!kg;BI)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub4_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4915 == arg2 && arg2 != -1) {
			@Pc(75) Class131 local75 = Static343.method5604(arg2);
			@Pc(78) int local78 = local75.anInt3986;
			if (local78 == 1) {
				arg1.anInt4903 = 0;
				arg1.anInt4927 = 1;
				arg1.anInt4912 = 0;
				arg1.anInt4937 = 0;
				arg1.anInt4918 = arg0;
				Static161.method2570(arg1.anInt4912, arg1 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg1.anInt5905, local75, arg1.anInt5901);
			}
			if (local78 == 2) {
				arg1.anInt4937 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt4915 == -1 || Static343.method5604(arg2).anInt3993 >= Static343.method5604(arg1.anInt4915).anInt3993) {
			arg1.anInt4954 = arg1.anInt4958;
			arg1.anInt4915 = arg2;
			arg1.anInt4918 = arg0;
			arg1.anInt4903 = 0;
			arg1.anInt4937 = 0;
			arg1.anInt4927 = 1;
			arg1.anInt4912 = 0;
			if (arg1.anInt4915 != -1) {
				Static161.method2570(arg1.anInt4912, arg1 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg1.anInt5905, Static343.method5604(arg1.anInt4915), arg1.anInt5901);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
	public static void method2296() {
		for (@Pc(8) int local8 = 0; local8 < Static186.anInt3102; local8++) {
			@Pc(14) int local14 = Static109.anIntArray136[local8]--;
			if (Static109.anIntArray136[local8] >= -10) {
				@Pc(89) Class143 local89 = Static334.aClass143Array1[local8];
				if (local89 == null) {
					local89 = Static365.method3605(Static3.aClass100_1, Static37.anIntArray538[local8], 0);
					if (local89 == null) {
						continue;
					}
					Static109.anIntArray136[local8] += local89.method3608();
					Static334.aClass143Array1[local8] = local89;
				}
				if (Static109.anIntArray136[local8] < 0) {
					@Pc(212) int local212;
					if (Static251.anIntArray406[local8] == 0) {
						local212 = Static224.anInt4582 * Static230.anIntArray548[local8] >> 8;
					} else {
						@Pc(130) int local130 = (Static251.anIntArray406[local8] & 0xFF) * 128;
						@Pc(138) int local138 = Static251.anIntArray406[local8] >> 16 & 0xFF;
						@Pc(147) int local147 = local138 * 128 + 64 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901;
						if (local147 < 0) {
							local147 = -local147;
						}
						@Pc(160) int local160 = Static251.anIntArray406[local8] >> 8 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(184) int local184 = local170 + local147 - 128;
						if (local184 > local130) {
							Static109.anIntArray136[local8] = -100;
							continue;
						}
						if (local184 < 0) {
							local184 = 0;
						}
						local212 = Static230.anIntArray548[local8] * (local130 - local184) * Static260.anInt5195 / local130 >> 8;
					}
					if (local212 > 0) {
						@Pc(232) Class3_Sub17_Sub1 local232 = local89.method3607().method2051(Static323.aClass132_1);
						@Pc(237) Class3_Sub2_Sub3 local237 = Static364.method2795(local232, local212);
						local237.method2811(Static244.anIntArray393[local8] - 1);
						Static273.aClass3_Sub2_Sub2_2.method1366(local237);
					}
					Static109.anIntArray136[local8] = -100;
				}
			} else {
				Static186.anInt3102--;
				for (@Pc(28) int local28 = local8; local28 < Static186.anInt3102; local28++) {
					Static37.anIntArray538[local28] = Static37.anIntArray538[local28 + 1];
					Static334.aClass143Array1[local28] = Static334.aClass143Array1[local28 + 1];
					Static244.anIntArray393[local28] = Static244.anIntArray393[local28 + 1];
					Static109.anIntArray136[local28] = Static109.anIntArray136[local28 + 1];
					Static251.anIntArray406[local28] = Static251.anIntArray406[local28 + 1];
					Static230.anIntArray548[local28] = Static230.anIntArray548[local28 + 1];
				}
				local8--;
			}
		}
		if (Static107.aBoolean119 && !Static48.method838()) {
			if (Static36.anInt809 != 0 && Static312.anInt6282 != -1) {
				Static228.method3979(Static36.anInt809, Static244.aClass100_98, Static312.anInt6282);
			}
			Static107.aBoolean119 = false;
		} else if (Static36.anInt809 != 0 && Static312.anInt6282 != -1 && !Static48.method838()) {
			Static291.aClass3_Sub4_Sub2_3.method3682(210);
			Static291.aClass3_Sub4_Sub2_3.method3650(Static312.anInt6282);
			Static312.anInt6282 = -1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZLclient!sj;)V")
	public static void method2299(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(16) int local16 = arg1.anInt5737 == 0 ? arg1.anInt5704 : arg1.anInt5737;
		@Pc(25) int local25 = arg1.anInt5724 == 0 ? arg1.anInt5721 : arg1.anInt5724;
		Static314.method5229(arg1.anInt5761, local25, local16, arg0, Static311.aClass181ArrayArray1[arg1.anInt5761 >> 16]);
		if (arg1.aClass181Array2 != null) {
			Static314.method5229(arg1.anInt5761, local25, local16, arg0, arg1.aClass181Array2);
		}
		@Pc(58) Class3_Sub32 local58 = (Class3_Sub32) Static188.aClass24_21.method609((long) arg1.anInt5761);
		if (local58 != null) {
			Static228.method3973(local58.anInt4348, local25, local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V")
	public static void method2301() {
		@Pc(1) Class198 local1 = aClass198_23;
		synchronized (aClass198_23) {
			aClass198_23.method5230();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;Lclient!de;II)Lclient!vc;")
	public static Class207 method2315(@OriginalArg(0) String arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method976(arg0);
		}
		@Pc(44) Class207 local44;
		if (arg2 == 1) {
			try {
				Static361.method2056(arg1.anApplet1, "openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() });
				local44 = new Class207();
				local44.anInt6346 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class207();
				local44.anInt6346 = 2;
				return local44;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local44 = new Class207();
				local44.anInt6346 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class207();
				local44.anInt6346 = 2;
				return local44;
			}
		} else if (arg2 == 3) {
			try {
				Static361.method2055("loggedout", arg1.anApplet1);
			} catch (@Pc(106) Throwable local106) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local44 = new Class207();
				local44.anInt6346 = 1;
				return local44;
			} catch (@Pc(128) Exception local128) {
				local44 = new Class207();
				local44.anInt6346 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method2321(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Static113.anInt6411 == 0 && Static350.anInt6800 < 2) {
			return;
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static276.aBoolean345 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static276.aBoolean345 = false;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static21.aClass65_2.method1456();
			}
			@Pc(44) int local44;
			@Pc(53) Runtime local53;
			@Pc(63) int local63;
			if (arg0.equalsIgnoreCase("gc")) {
				Static252.method4228();
				for (local44 = 0; local44 < 10; local44++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local63 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static104.method1768("mem=" + local63 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static252.method4228();
				for (local44 = 0; local44 < 10; local44++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local63 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static104.method1768("Memory before cleanup=" + local63 + "k");
				Static33.method632();
				Static252.method4228();
				for (@Pc(120) int local120 = 0; local120 < 10; local120++) {
					System.gc();
				}
				local63 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static104.method1768("Memory after cleanup=" + local63 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static104.method1768("Number of player models in cache:" + Static180.method3224());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static301.method5086();
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static10.aClass163_1.method4171();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static10.aClass163_1.method4169();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static353.aClass42_5.method975();
				Static76.aClass16_2.method395();
				Static10.aClass163_1.method4177();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static313.method5225();
				Static80.method1269();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static85.method1382(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static85.method1382(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static85.method1382(false, 3, 768, 1024);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static276.method4628(0);
				Static197.anInt4054 = 0;
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static276.method4628(1);
				Static197.anInt4054 = 1;
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static276.method4628(2);
				Static197.anInt4054 = 2;
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static276.method4628(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static5.aBoolean13 = !Static5.aBoolean13;
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
				Static313.method5225();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static250.aBoolean274 = !Static250.aBoolean274;
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
				Static313.method5225();
			}
			if (arg0.startsWith("shadows ")) {
				Static77.anInt1520 = Static261.method4403(arg0.substring(8));
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
				Static313.method5225();
			}
			if (arg0.startsWith("setba")) {
				Static226.anInt4626 = Static261.method4403(arg0.substring(6));
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static243.method4153(Static261.method4403(arg0.substring(13)));
				Static261.method4409(Static353.aClass42_5);
				Static137.aBoolean143 = false;
			}
			if (arg0.startsWith("fps ") && Static113.anInt6411 != 0) {
				Static121.method2143(Static261.method4403(arg0.substring(4)));
			}
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("rect_debug")) {
				Static350.anInt6810 = Static261.method4403(arg0.substring(10).trim());
				Static104.method1768("rect_debug=" + Static350.anInt6810);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static212.aBoolean98 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static172.aBoolean195 = !Static172.aBoolean195;
				Static104.method1768("clipcomponents=" + Static172.aBoolean195);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(439) boolean local439 = Static212.aClass122_2.method4774();
				if (!Static190.method3409(!local439)) {
					Static104.method1768("Failed to enable bloom");
				} else if (local439) {
					Static104.method1768("Bloom disabled");
				} else {
					Static104.method1768("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static151.aBoolean164) {
					Static151.aBoolean164 = false;
					Static104.method1768("Forced tweening disabled.");
				} else {
					Static151.aBoolean164 = true;
					Static104.method1768("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static309.aBoolean418) {
					Static104.method1768("Shift-click disabled.");
					Static309.aBoolean418 = false;
				} else {
					Static104.method1768("Shift-click ENABLED!");
					Static309.aBoolean418 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static104.method1768("x:" + (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7) + " z:" + (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static104.method1768("Height: " + Static69.aClass22Array1[Static163.anInt3184].method4672(Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static317.aClass100_112.method2313();
				Static317.aClass100_112.method2295();
				Static186.method2540();
				Static80.method1269();
			}
			if (arg0.startsWith("mc")) {
				if (Static212.aClass122_2.method4781()) {
					local44 = Integer.parseInt(arg0.substring(3));
					if (local44 < 1) {
						local44 = 1;
					} else if (local44 > 4) {
						local44 = 4;
					}
					Static189.anInt3970 = local44;
					Static212.aClass122_2.method4779(Static189.anInt3970);
					Static212.aClass122_2.method4787(0);
					Static104.method1768("Render cores now: " + Static189.anInt3970);
				} else {
					Static104.method1768("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static104.method1768("I(s): " + Static4.aClass198_2.method5234() + "/" + Static4.aClass198_2.method5241());
				Static104.method1768("I(m): " + Static264.aClass198_49.method5234() + "/" + Static264.aClass198_49.method5241());
				Static104.method1768("O(s): " + Static196.aClass214_1.method5660() + "/" + Static196.aClass214_1.method5653());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static104.method1768("Pos: " + Static163.anInt3184 + "," + (Static186.anInt3094 + (Static110.anInt2324 >> 7) >> 6) + "," + (Static296.anInt5889 + (Static210.anInt4317 >> 7) >> 6) + "," + (Static186.anInt3094 + (Static110.anInt2324 >> 7) & 0x3F) + "," + (Static296.anInt5889 + (Static210.anInt4317 >> 7) & 0x3F) + " Height: " + (Static286.method4919(Static110.anInt2324, Static210.anInt4317, Static163.anInt3184) - Static175.anInt3631));
				Static104.method1768("Look: " + Static163.anInt3184 + "," + (Static341.anInt6652 + Static186.anInt3094 >> 6) + "," + (Static296.anInt5889 + Static327.anInt6306 >> 6) + "," + (Static341.anInt6652 + Static186.anInt3094 & 0x3F) + "," + (Static327.anInt6306 + Static296.anInt5889 & 0x3F) + " Height: " + (Static286.method4919(Static341.anInt6652, Static327.anInt6306, Static163.anInt3184) - Static26.anInt694));
			}
			if (arg0.equals("showocc")) {
				Static85.aBoolean82 = !Static85.aBoolean82;
				Static313.method5225();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static109.aBoolean120 = !Static109.aBoolean120;
				Static212.aClass122_2.method4786(Static109.aBoolean120);
				Static346.method5643();
			}
			if (arg0.equals("nonpcs")) {
				Static175.aBoolean198 = !Static175.aBoolean198;
			}
			if (arg0.equals("autoworld")) {
				Static216.method3750();
			}
			if (arg0.equals("heap")) {
				Static104.method1768("Heap: " + Static26.anInt699 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static323.method5291();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local44 = 0; local44 < Static347.anIntArray563.length; local44++) {
					if (Static213.aBooleanArray22[local44]) {
						Static347.anIntArray563[local44] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static347.anIntArray563[local44] *= -1;
						}
					}
				}
				Static323.method5291();
			}
			if (arg0.equals("showcolmap")) {
				Static197.aBoolean231 = true;
				Static80.method1269();
			}
			if (arg0.equals("hidecolmap")) {
				Static197.aBoolean231 = false;
				Static80.method1269();
			}
			if (arg0.equals("resetcache")) {
				Static333.method5471();
			}
			if (arg0.equals("profilecpu")) {
				Static104.method1768(Static52.method896() + "ms");
			}
			if (Static266.anInt5370 == 30) {
				Static291.aClass3_Sub4_Sub2_3.method3682(3);
				Static291.aClass3_Sub4_Sub2_3.method3614(arg0.length() + 2);
				Static291.aClass3_Sub4_Sub2_3.method3614(arg1 ? 1 : 0);
				Static291.aClass3_Sub4_Sub2_3.method3624(arg0);
				return;
			}
		} catch (@Pc(954) Exception local954) {
			Static104.method1768("Whoops, something went wrong.");
			return;
		}
	}
}
