import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	public static int anInt8019;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "Lclient!vd;")
	public static Class353 aClass353_82;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	public static int method6913() {
		@Pc(15) int local15;
		if (Static348.aClass6_Sub22_19.aClass15_Sub12_1.method4190() == 0) {
			for (local15 = 0; local15 < Static519.anInt9082; local15++) {
				if (Static191.anInterface18Array1[local15].method4142() == 's' || Static191.anInterface18Array1[local15].method4142() == 'S') {
					Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub12_1);
					Static536.aBoolean632 = true;
					break;
				}
			}
		}
		@Pc(62) int local62;
		if (Static385.aClass228_3 == Static308.aClass228_2) {
			@Pc(52) Runtime local52 = Runtime.getRuntime();
			local62 = (int) ((local52.totalMemory() - local52.freeMemory()) / 1024L);
			@Pc(67) long local67 = Static32.method595();
			if (Static100.aLong265 == 0L) {
				Static100.aLong265 = local67;
			}
			if (local62 > 16384 && local67 - Static100.aLong265 < 5000L) {
				if (local67 - Static269.aLong137 > 1000L) {
					System.gc();
					Static269.aLong137 = local67;
				}
				return 0;
			}
		}
		if (Static385.aClass228_4 == Static308.aClass228_2) {
			if (Static4.aClass230_5 == null) {
				Static4.aClass230_5 = new Class230(Static34.aClass296_2, Static49.aClass130_1, Static179.aBigInteger1, Static432.aBigInteger5);
			}
			if (!Static4.aClass230_5.method6221()) {
				return 0;
			}
			Static95.method1539(0, true, (String) null);
			Static638.aBoolean725 = !Static643.method8973();
			Static571.aClass353_126 = Static74.method1296(false, 1, Static638.aBoolean725 ? 34 : 32);
			Static141.aClass353_122 = Static74.method1296(false, 1, 33);
			Static483.aClass353_89 = Static74.method1296(false, 1, 13);
		}
		@Pc(162) boolean local162;
		if (Static308.aClass228_2 == Static385.aClass228_5) {
			local162 = Static141.aClass353_122.method8413();
			local62 = Static241.aClass217_Sub1Array7[33].method5799();
			local62 += Static241.aClass217_Sub1Array7[Static638.aBoolean725 ? 34 : 32].method5799();
			local62 += Static241.aClass217_Sub1Array7[13].method5799();
			local62 += local162 ? 100 : Static141.aClass353_122.method8409();
			if (local62 != 400) {
				return local62 / 4;
			}
			Static287.anInt8664 = Static571.aClass353_126.method8395();
			Static200.anInt4040 = Static141.aClass353_122.method8395();
			Static435.method6755(Static571.aClass353_126);
			@Pc(225) int local225 = Static348.aClass6_Sub22_19.aClass15_Sub4_1.method1204();
			Static426.aClass36_1 = new Class36(Static630.aClass271_17, Static307.anInt5931, Static141.aClass353_122);
			@Pc(237) int[] local237 = Static426.aClass36_1.method847(local225);
			if (local237.length == 0) {
				local237 = Static426.aClass36_1.method847(0);
			}
			@Pc(256) Class364 local256 = new Class364(Static571.aClass353_126, Static483.aClass353_89);
			if (local237.length > 0) {
				Static262.anInterface6Array1 = new Interface6[local237.length];
				for (@Pc(265) int local265 = 0; local265 < Static262.anInterface6Array1.length; local265++) {
					Static262.anInterface6Array1[local265] = new Class106(Static426.aClass36_1.method851(local237[local265]), local256);
				}
			}
		}
		if (Static385.aClass228_6 == Static308.aClass228_2) {
			Static540.method7924(Static571.aClass353_126, Static472.method7145(), Static483.aClass353_89);
		}
		if (Static385.aClass228_7 == Static308.aClass228_2) {
			local15 = Static132.method2137();
			local62 = Static128.method2055();
			if (local62 > local15) {
				return local15 * 100 / local62;
			}
		}
		if (Static385.aClass228_8 == Static308.aClass228_2) {
			if (Static262.anInterface6Array1 != null && Static262.anInterface6Array1.length > 0) {
				if (Static262.anInterface6Array1[0].method7227() < 100) {
					return 0;
				}
				if (Static262.anInterface6Array1.length > 1 && Static426.aClass36_1.method846() && Static262.anInterface6Array1[1].method7227() < 100) {
					return 0;
				}
			}
			Static633.method8921(Static162.aClass100_7);
			Static549.method7969(Static162.aClass100_7);
			Static190.method3390(1);
		}
		if (Static385.aClass228_9 == Static308.aClass228_2) {
			for (local15 = 0; local15 < 4; local15++) {
				Static619.aClass319Array1[local15] = Static47.method853(Static284.anInt7916, Static442.anInt7975);
			}
		}
		if (Static308.aClass228_2 == Static385.aClass228_10) {
			Static540.aClass353_110 = Static74.method1296(false, 1, 8);
			Static485.aClass353_90 = Static74.method1296(false, 1, 0);
			Static646.aClass353_63 = Static74.method1296(false, 1, 1);
			Static648.aClass353_138 = Static74.method1296(false, 1, 2);
			Static619.aClass353_136 = Static74.method1296(false, 1, 3);
			Static323.aClass353_55 = Static74.method1296(false, 1, 4);
			Static503.aClass353_102 = Static74.method1296(true, 1, 5);
			Static364.aClass353_60 = Static74.method1296(true, 1, 6);
			Static70.aClass353_13 = Static74.method1296(false, 1, 7);
			Static194.aClass353_38 = Static74.method1296(false, 1, 9);
			Static399.aClass353_73 = Static74.method1296(false, 1, 10);
			Static292.aClass353_51 = Static74.method1296(false, 1, 11);
			Static98.aClass353_20 = Static74.method1296(false, 1, 12);
			Static237.aClass353_44 = Static74.method1296(false, 1, 14);
			Static517.aClass353_105 = Static74.method1296(false, 1, 15);
			Static390.aClass353_78 = Static74.method1296(false, 1, 16);
			Static335.aClass353_56 = Static74.method1296(false, 1, 17);
			Static496.aClass353_99 = Static74.method1296(false, 1, 18);
			Static428.aClass353_79 = Static74.method1296(false, 1, 19);
			Static278.aClass353_50 = Static74.method1296(false, 1, 20);
			Static608.aClass353_131 = Static74.method1296(false, 1, 21);
			Static583.aClass353_123 = Static74.method1296(false, 1, 22);
			aClass353_82 = Static74.method1296(true, 1, 23);
			Static554.aClass353_16 = Static74.method1296(false, 1, 24);
			Static264.aClass353_48 = Static74.method1296(false, 1, 25);
			Static40.aClass353_4 = Static74.method1296(true, 1, 26);
			Static139.aClass353_27 = Static74.method1296(false, 1, 27);
			Static493.aClass353_96 = Static74.method1296(true, 1, 28);
			Static396.aClass353_69 = Static74.method1296(false, 1, 29);
			Static336.aClass353_57 = Static74.method1296(true, 1, 30);
			Static383.aClass353_64 = Static74.method1296(true, 1, 31);
			Static114.aClass353_21 = Static74.method1296(true, 2, 36);
		}
		if (Static308.aClass228_2 == Static385.aClass228_11) {
			local15 = 0;
			for (local62 = 0; local62 < 37; local62++) {
				if (Static241.aClass217_Sub1Array7[local62] != null) {
					local15 += Static241.aClass217_Sub1Array7[local62].method5799() * Static627.anIntArray637[local62] / 100;
				}
			}
			if (local15 != 100) {
				if (Static210.anInt4130 < 0) {
					Static210.anInt4130 = local15;
				}
				return (local15 - Static210.anInt4130) * 100 / (100 - Static210.anInt4130);
			}
			Static154.method2414(Static540.aClass353_110);
			Static540.method7924(Static540.aClass353_110, Static472.method7145(), Static483.aClass353_89);
		}
		if (Static385.aClass228_12 == Static308.aClass228_2) {
			if (Static416.anInt7577 == -1) {
				Static416.anInt7577 = Static364.aClass353_60.method8410("scape main");
			}
			Static185.method3352();
			Static190.method3390(2);
		}
		if (Static308.aClass228_2 == Static385.aClass228_13) {
			Static344.method5575(Static336.aClass353_57, Static529.aClass112_6);
		}
		if (Static385.aClass228_14 == Static308.aClass228_2) {
			local15 = Static121.method1985();
			if (local15 < 100) {
				return local15;
			}
			Static108.method1763(Static493.aClass353_96.method8419(1));
			Static180.method3293(Static493.aClass353_96.method8419(3));
		}
		if (Static308.aClass228_2 == Static385.aClass228_15) {
			if (Static247.anInt4939 != -1 && !Static70.aClass353_13.method8407(0, Static247.anInt4939)) {
				return 99;
			}
			Static535.anInterface4_10 = new Class39(Static40.aClass353_4, Static194.aClass353_38, Static540.aClass353_110);
			Static26.aClass179_1 = new Class179(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static511.aClass34_1 = new Class34(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static131.aClass74_1 = new Class74(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138, Static540.aClass353_110);
			Static443.aClass59_1 = new Class59(Static630.aClass271_17, Static307.anInt5931, Static335.aClass353_56);
			Static587.aClass136_6 = new Class136(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static154.aClass321_2 = new Class321(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static504.aClass335_6 = new Class335(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138, Static540.aClass353_110);
			Static195.aClass58_1 = new Class58(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138, Static70.aClass353_13);
			Static485.aClass265_1 = new Class265(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static595.aClass92_1 = new Class92(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static283.aClass210_2 = new Class210(Static630.aClass271_17, Static307.anInt5931, true, Static390.aClass353_78, Static70.aClass353_13);
			Static184.aClass337_2 = new Class337(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138, Static540.aClass353_110);
			Static592.aClass304_4 = new Class304(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138, Static540.aClass353_110);
			Static563.aClass346_2 = new Class346(Static630.aClass271_17, Static307.anInt5931, true, Static496.aClass353_99, Static70.aClass353_13);
			Static266.aClass138_1 = new Class138(Static630.aClass271_17, Static307.anInt5931, true, Static26.aClass179_1, Static428.aClass353_79, Static70.aClass353_13);
			Static568.aClass37_1 = new Class37(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static294.aClass373_2 = new Class373(Static630.aClass271_17, Static307.anInt5931, Static278.aClass353_50, Static485.aClass353_90, Static646.aClass353_63);
			Static25.aClass355_1 = new Class355(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static22.aClass354_1 = new Class354(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static436.aClass292_2 = new Class292(Static630.aClass271_17, Static307.anInt5931, Static608.aClass353_131, Static70.aClass353_13);
			Static576.aClass324_2 = new Class324(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static449.aClass127_1 = new Class127(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static457.aClass116_1 = new Class116(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static230.aClass233_3 = new Class233(Static630.aClass271_17, Static307.anInt5931, Static583.aClass353_123);
			Static40.aClass245_1 = new Class245(Static630.aClass271_17, Static307.anInt5931, Static648.aClass353_138);
			Static635.method8389(Static483.aClass353_89, Static619.aClass353_136, Static70.aClass353_13, Static540.aClass353_110);
			Static581.method6716(Static396.aClass353_69);
			Static494.aClass118_1 = new Class118(Static307.anInt5931, Static554.aClass353_16, Static264.aClass353_48);
			Static337.aClass327_2 = new Class327(Static307.anInt5931, Static554.aClass353_16, Static264.aClass353_48, new Class315());
			Static264.method4688();
			Static283.aClass210_2.method5635(Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0);
			Static279.aClass294_1 = new Class294();
			Static499.method7443();
			Static355.method5680(Static139.aClass353_27);
			Static284.method6788(Static70.aClass353_13, Static535.anInterface4_10);
			@Pc(1005) Class169 local1005 = new Class169(Static399.aClass353_73.method8426("huffman", ""));
			Static644.method8982(local1005);
			try {
				jagmisc.init();
			} catch (@Pc(1014) Throwable local1014) {
			}
			Static125.aClass85_147 = Static144.method2334();
			Static428.aClass6_Sub28_1 = new Class6_Sub28(true, Static529.aClass112_6);
		}
		if (Static308.aClass228_2 == Static385.aClass228_17) {
			local15 = Static266.method4728(Static540.aClass353_110) + Static606.method7458(true);
			local62 = Static456.method7010() + Static128.method2055();
			if (local15 < local62) {
				return local15 * 100 / local62;
			}
		}
		if (Static308.aClass228_2 == Static385.aClass228_18) {
			Static487.method6424(aClass353_82, Static587.aClass136_6, Static154.aClass321_2, Static283.aClass210_2, Static184.aClass337_2, Static592.aClass304_4, Static279.aClass294_1);
		}
		if (Static308.aClass228_2 == Static385.aClass228_19) {
			Static522.anIntArray557 = new int[Static457.aClass116_1.anInt3785];
			Static211.aBooleanArray25 = new boolean[Static457.aClass116_1.anInt3785];
			Static101.aStringArray20 = new String[Static449.aClass127_1.anInt4061];
			for (local15 = 0; local15 < Static457.aClass116_1.anInt3785; local15++) {
				if (Static457.aClass116_1.method3353(local15).anInt279 == 0) {
					Static211.aBooleanArray25[local15] = true;
					Static420.anInt7697++;
				}
				Static522.anIntArray557[local15] = -1;
			}
			Static8.method158();
			Static583.anInt9673 = Static619.aClass353_136.method8410("loginscreen");
			Static15.anInt5890 = Static619.aClass353_136.method8410("lobbyscreen");
			Static503.aClass353_102.method8393(false);
			Static364.aClass353_60.method8393(true);
			Static540.aClass353_110.method8393(true);
			Static483.aClass353_89.method8393(true);
			Static399.aClass353_73.method8393(true);
			Static619.aClass353_136.method8393(true);
			Static648.aClass353_138.anInt9949 = 2;
			Static604.aBoolean684 = true;
			Static335.aClass353_56.anInt9949 = 2;
			Static390.aClass353_78.anInt9949 = 2;
			Static496.aClass353_99.anInt9949 = 2;
			Static428.aClass353_79.anInt9949 = 2;
			Static278.aClass353_50.anInt9949 = 2;
			Static608.aClass353_131.anInt9949 = 2;
		}
		if (Static385.aClass228_20 == Static308.aClass228_2) {
			if (!Static578.method5705(Static583.anInt9673)) {
				return 0;
			}
			local162 = true;
			for (local62 = 0; local62 < Static605.aClass302ArrayArray4[Static583.anInt9673].length; local62++) {
				@Pc(1192) Class302 local1192 = Static605.aClass302ArrayArray4[Static583.anInt9673][local62];
				if (local1192.anInt8816 == 5 && local1192.anInt8848 != -1 && !Static540.aClass353_110.method8407(0, local1192.anInt8848)) {
					local162 = false;
				}
			}
			if (!local162) {
				return 0;
			}
		}
		if (Static385.aClass228_21 == Static308.aClass228_2) {
			Static41.method797(true);
		}
		if (Static385.aClass228_22 == Static308.aClass228_2) {
			Static645.aClass121_1.method3462();
			try {
				Static493.aThread6.join();
			} catch (@Pc(1242) InterruptedException local1242) {
				return 0;
			}
			Static571.aClass353_126 = null;
			Static141.aClass353_122 = null;
			Static493.aThread6 = null;
			Static645.aClass121_1 = null;
			Static426.aClass36_1 = null;
			Static262.anInterface6Array1 = null;
			Static218.method3727();
			Static265.aBoolean261 = Static348.aClass6_Sub22_19.aClass15_Sub12_1.method4190() == 1;
			Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub12_1);
			if (Static265.aBoolean261) {
				Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
			} else if (Static348.aClass6_Sub22_19.aClass15_Sub22_1.aBoolean524 && Static428.aClass6_Sub28_1.anInt6061 < 512 && Static428.aClass6_Sub28_1.anInt6061 != 0) {
				Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
			}
			Static289.method5031();
			if (Static265.aBoolean261) {
				Static278.method4875(0, false);
			} else {
				Static278.method4875(Static348.aClass6_Sub22_19.aClass15_Sub22_1.method6681(), false);
			}
			Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
			Static633.method8921(Static162.aClass100_7);
			Static549.method7969(Static162.aClass100_7);
			Static569.method8136(Static162.aClass100_7, Static540.aClass353_110);
			Static429.method6724(Static553.aClass32Array19);
		}
		return Static143.method2299();
	}
}
