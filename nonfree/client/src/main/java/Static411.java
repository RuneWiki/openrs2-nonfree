import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public static int anInt7201;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
	public static int anInt7202 = 0;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	public static int anInt7204 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)I")
	public static int method5973() {
		@Pc(6) int local6;
		if (!Static480.aClass6_Sub37_Sub1_1.aBoolean407) {
			for (local6 = 0; local6 < Static71.anInt1181; local6++) {
				if (Static142.anInterface16Array1[local6].method947() == 's' || Static142.anInterface16Array1[local6].method947() == 'S') {
					Static480.aClass6_Sub37_Sub1_1.aBoolean407 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static28.aClass161_1 == Static236.aClass161_2) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static137.method2058();
			if (Static121.aLong60 == 0L) {
				Static121.aLong60 = local59;
			}
			if (local56 > 16384 && local59 - Static121.aLong60 < 5000L) {
				if (local59 - Static182.aLong85 > 1000L) {
					System.gc();
					Static182.aLong85 = local59;
				}
				return 0;
			}
		}
		if (Static236.aClass161_3 == Static28.aClass161_1) {
			if (Static372.aClass181_3 == null) {
				Static372.aClass181_3 = new Class181(Static294.aClass175_3, Static34.aClass195_6, Static544.aBigInteger7, Static477.aBigInteger6);
			}
			if (!Static372.aClass181_3.method3998()) {
				return 0;
			}
			Static534.method7436(0, false);
			Static97.aClass251_29 = Static226.method3315(32, true, false);
			Static284.aClass251_83 = Static226.method3315(33, true, false);
			Static492.aClass251_136 = Static226.method3315(13, true, false);
		}
		if (Static236.aClass161_4 == Static28.aClass161_1) {
			Static284.aClass251_83.method5861();
			local6 = Static329.aClass98_Sub1Array2[33].method4076();
			local6 += Static329.aClass98_Sub1Array2[32].method4076();
			local6 += Static329.aClass98_Sub1Array2[13].method4076();
			local6 += Static284.aClass251_83.method5843();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static155.anInt2739 = Static97.aClass251_29.method5832();
			Static45.anInt742 = Static284.aClass251_83.method5832();
			Static242.method3512(Static97.aClass251_29);
			local56 = Static480.aClass6_Sub37_Sub1_1.anInt6062;
			Static459.aClass87_1 = new Class87(Static57.aClass314_1, Static470.anInt7957, Static284.aClass251_83);
			@Pc(203) int[] local203 = Static459.aClass87_1.method1801(local56);
			@Pc(208) Class99 local208 = new Class99(Static97.aClass251_29);
			if (local203.length > 0) {
				Static454.anInterface14Array1 = new Interface14[local203.length];
				for (@Pc(220) int local220 = 0; local220 < Static454.anInterface14Array1.length; local220++) {
					Static454.anInterface14Array1[local220] = new Class215(Static459.aClass87_1.method1804(local203[local220]), local208);
				}
			}
		}
		if (Static236.aClass161_5 == Static28.aClass161_1) {
			Static520.method7330(Static292.method4100(), Static492.aClass251_136, Static97.aClass251_29);
		}
		if (Static28.aClass161_1 == Static236.aClass161_6) {
			local6 = Static124.method1893();
			local56 = Static373.method5473();
			if (local56 > local6) {
				return local6 * 100 / local56;
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_7) {
			Static419.method7565(Static176.aClass121_5);
			Static169.method2643(Static176.aClass121_5);
			Static99.method1593(1);
		}
		if (Static28.aClass161_1 == Static236.aClass161_8) {
			for (local6 = 0; local6 < 4; local6++) {
				Static296.aClass295Array3[local6] = Static289.method4066(Static473.anInt7969, Static301.anInt4912);
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_9) {
			Static447.aClass251_141 = Static226.method3315(8, true, false);
			Static361.aClass251_104 = Static226.method3315(0, true, false);
			Static196.aClass251_67 = Static226.method3315(1, true, false);
			Static28.aClass251_7 = Static226.method3315(2, true, false);
			Static19.aClass251_62 = Static226.method3315(3, true, false);
			Static527.aClass251_147 = Static226.method3315(4, true, false);
			Static285.aClass251_84 = Static226.method3315(5, true, true);
			Static375.aClass251_107 = Static226.method3315(6, false, true);
			Static251.aClass251_88 = Static226.method3315(7, true, false);
			Static219.aClass251_71 = Static226.method3315(9, true, false);
			Static131.aClass251_46 = Static226.method3315(10, true, false);
			Static168.aClass251_60 = Static226.method3315(11, true, false);
			Static58.aClass251_21 = Static226.method3315(12, true, false);
			Static509.aClass251_142 = Static226.method3315(14, false, false);
			Static63.aClass251_23 = Static226.method3315(15, true, false);
			Static543.aClass251_151 = Static226.method3315(16, true, false);
			Static45.aClass251_17 = Static226.method3315(17, true, false);
			Static529.aClass251_148 = Static226.method3315(18, true, false);
			Static543.aClass251_150 = Static226.method3315(19, true, false);
			Static505.aClass251_138 = Static226.method3315(20, true, false);
			Static310.aClass251_94 = Static226.method3315(21, true, false);
			Static9.aClass251_1 = Static226.method3315(22, true, false);
			Static30.aClass251_82 = Static226.method3315(23, true, true);
			Static228.aClass251_74 = Static226.method3315(24, true, false);
			Static36.aClass251_12 = Static226.method3315(25, true, false);
			Static79.aClass251_26 = Static226.method3315(26, true, true);
			Static145.aClass251_50 = Static226.method3315(27, true, false);
			Static118.aClass251_40 = Static226.method3315(28, true, true);
			Static126.aClass251_44 = Static226.method3315(29, true, false);
			Static266.aClass251_77 = Static226.method3315(30, true, true);
			Static509.aClass251_143 = Static226.method3315(31, true, true);
		}
		if (Static28.aClass161_1 == Static236.aClass161_10) {
			local6 = 0;
			for (local56 = 0; local56 < 34; local56++) {
				local6 += Static329.aClass98_Sub1Array2[local56].method4076() * Static163.anIntArray327[local56] / 100;
			}
			if (local6 != 100) {
				return local6;
			}
			Static239.method4965(Static447.aClass251_141);
			Static520.method7330(Static292.method4100(), Static492.aClass251_136, Static447.aClass251_141);
		}
		if (Static28.aClass161_1 == Static236.aClass161_11) {
			Static31.method450();
			Static99.method1593(2);
		}
		if (Static28.aClass161_1 == Static236.aClass161_12) {
			Static300.method4183(Static266.aClass251_77, Static152.aClass57_4);
		}
		if (Static236.aClass161_13 == Static28.aClass161_1) {
			if (!Static118.aClass251_40.method5861()) {
				return Static118.aClass251_40.method5843();
			}
			Static355.method5299(Static118.aClass251_40.method5855(1));
			Static11.method181(Static118.aClass251_40.method5855(3));
			if (Static574.anInt6276 != -1 && !Static251.aClass251_88.method5854(Static574.anInt6276, 0)) {
				return 99;
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_14) {
			local6 = Static213.method392("jaggl");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_15) {
			local6 = Static213.method392("jagdx");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static236.aClass161_16 == Static28.aClass161_1) {
			local6 = Static213.method392("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
			if (local6 == 100) {
				Static153.aClient1.method842();
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_17) {
			local6 = Static213.method392("sw3d");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_18) {
			local6 = Static213.method392("jaclib");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
			if (local6 == 100) {
				Static153.aClient1.method852();
			}
		}
		if (Static28.aClass161_1 == Static236.aClass161_19) {
			local6 = Static213.method392("hw3d");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static236.aClass161_20 == Static28.aClass161_1 && !Static509.aClass251_143.method5861()) {
			return 0;
		}
		if (Static28.aClass161_1 == Static236.aClass161_21) {
			if (!Static79.aClass251_26.method5861()) {
				return Static79.aClass251_26.method5843();
			}
			Static499.anInterface7_13 = new Class219(Static79.aClass251_26, Static219.aClass251_71, Static447.aClass251_141);
		}
		if (Static28.aClass161_1 == Static236.aClass161_22) {
			Static28.aClass251_7.method5861();
			local6 = Static28.aClass251_7.method5843();
			Static543.aClass251_151.method5861();
			local6 += Static543.aClass251_151.method5843();
			Static45.aClass251_17.method5861();
			local6 += Static45.aClass251_17.method5843();
			Static529.aClass251_148.method5861();
			local6 += Static529.aClass251_148.method5843();
			Static543.aClass251_150.method5861();
			local6 += Static543.aClass251_150.method5843();
			Static505.aClass251_138.method5861();
			local6 += Static505.aClass251_138.method5843();
			Static310.aClass251_94.method5861();
			local6 += Static310.aClass251_94.method5843();
			Static9.aClass251_1.method5861();
			local6 += Static9.aClass251_1.method5843();
			Static228.aClass251_74.method5861();
			local6 += Static228.aClass251_74.method5843();
			Static36.aClass251_12.method5861();
			local6 += Static36.aClass251_12.method5843();
			Static145.aClass251_50.method5861();
			local6 += Static145.aClass251_50.method5843();
			Static126.aClass251_44.method5861();
			local6 += Static126.aClass251_44.method5843();
			if (local6 < 1200) {
				return local6 / 12;
			}
			Static112.aClass307_1 = new Class307(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static492.aClass189_1 = new Class189(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static247.aClass33_2 = new Class33(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7, Static447.aClass251_141);
			Static447.aClass338_3 = new Class338(Static57.aClass314_1, Static470.anInt7957, Static45.aClass251_17);
			Static451.aClass327_5 = new Class327(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static261.aClass318_1 = new Class318(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static78.aClass344_1 = new Class344(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7, Static251.aClass251_88);
			Static59.aClass42_2 = new Class42(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static266.aClass294_1 = new Class294(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static260.aClass100_1 = new Class100(Static57.aClass314_1, Static470.anInt7957, true, Static543.aClass251_151, Static251.aClass251_88);
			Static474.aClass276_4 = new Class276(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7, Static447.aClass251_141);
			Static32.aClass245_1 = new Class245(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7, Static447.aClass251_141);
			Static51.aClass202_1 = new Class202(Static57.aClass314_1, Static470.anInt7957, true, Static529.aClass251_148, Static251.aClass251_88);
			Static295.aClass256_2 = new Class256(Static57.aClass314_1, Static470.anInt7957, true, Static112.aClass307_1, Static543.aClass251_150, Static251.aClass251_88);
			Static322.aClass180_1 = new Class180(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static31.aClass345_1 = new Class345(Static57.aClass314_1, Static470.anInt7957, Static505.aClass251_138, Static361.aClass251_104, Static196.aClass251_67);
			Static316.aClass141_1 = new Class141(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static264.aClass124_1 = new Class124(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static448.aClass117_2 = new Class117(Static57.aClass314_1, Static470.anInt7957, Static310.aClass251_94, Static251.aClass251_88);
			Static442.aClass337_1 = new Class337(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static448.aClass247_1 = new Class247(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static279.aClass115_1 = new Class115(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static386.aClass91_1 = new Class91(Static57.aClass314_1, Static470.anInt7957, Static9.aClass251_1);
			Static333.aClass187_1 = new Class187(Static57.aClass314_1, Static470.anInt7957, Static28.aClass251_7);
			Static41.method571(Static447.aClass251_141, Static251.aClass251_88, Static19.aClass251_62, Static492.aClass251_136);
			Static467.method6538(Static126.aClass251_44);
			Static273.aClass288_1 = new Class288(Static470.anInt7957, Static228.aClass251_74, Static36.aClass251_12);
			Static283.aClass44_4 = new Class44(Static470.anInt7957, Static228.aClass251_74, Static36.aClass251_12, new Class244());
			Static218.method3200();
			Static260.aClass100_1.method2007(!Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503));
			Static505.aClass30_1 = new Class30();
			Static321.method4977();
			Static466.method6529(Static145.aClass251_50);
			Static298.method4141(Static251.aClass251_88, Static499.anInterface7_13);
		}
		if (Static28.aClass161_1 == Static236.aClass161_23) {
			local6 = Static430.method4854(Static447.aClass251_141) + Static528.method7591(true);
			local56 = Static45.method618() + Static373.method5473();
			if (local56 > local6) {
				return local6 * 100 / local56;
			}
		}
		if (Static236.aClass161_24 == Static28.aClass161_1) {
			if (!Static131.aClass251_46.method5839("huffman", "")) {
				return 0;
			}
			@Pc(1182) Class322 local1182 = new Class322(Static131.aClass251_46.method5836("huffman", ""));
			Static14.method219(local1182);
		}
		if (Static236.aClass161_25 == Static28.aClass161_1 && !Static19.aClass251_62.method5861()) {
			return Static19.aClass251_62.method5843();
		} else if (Static236.aClass161_26 == Static28.aClass161_1 && !Static58.aClass251_21.method5861()) {
			return Static58.aClass251_21.method5843();
		} else if (Static236.aClass161_27 == Static28.aClass161_1 && !Static492.aClass251_136.method5861()) {
			return Static492.aClass251_136.method5843();
		} else {
			if (Static28.aClass161_1 == Static236.aClass161_28) {
				if (!Static30.aClass251_82.method5856("details")) {
					return Static30.aClass251_82.method5846("details");
				}
				Static349.method6177(Static30.aClass251_82, Static451.aClass327_5, Static261.aClass318_1, Static260.aClass100_1, Static474.aClass276_4, Static32.aClass245_1, Static505.aClass30_1);
			}
			if (Static236.aClass161_29 == Static28.aClass161_1) {
				Static579.aStringArray38 = new String[Static448.aClass247_1.anInt6920];
				Static402.anIntArray568 = new int[Static279.aClass115_1.anInt2769];
				Static248.aBooleanArray25 = new boolean[Static279.aClass115_1.anInt2769];
				for (local6 = 0; local6 < Static279.aClass115_1.anInt2769; local6++) {
					if (Static279.aClass115_1.method2293(local6).anInt7057 == 0) {
						Static248.aBooleanArray25[local6] = true;
						Static247.anInt4097++;
					}
					Static402.anIntArray568[local6] = -1;
				}
				Static374.method5480();
				Static563.anInt9402 = Static19.aClass251_62.method5863("loginscreen");
				Static379.anInt6551 = Static19.aClass251_62.method5863("lobbyscreen");
				Static285.aClass251_84.method5845(false);
				Static375.aClass251_107.method5845(true);
				Static447.aClass251_141.method5845(true);
				Static492.aClass251_136.method5845(true);
				Static131.aClass251_46.method5845(true);
				Static19.aClass251_62.method5845(true);
				Static28.aClass251_7.anInt6998 = 2;
				Static217.aBoolean247 = true;
				Static45.aClass251_17.anInt6998 = 2;
				Static543.aClass251_151.anInt6998 = 2;
				Static529.aClass251_148.anInt6998 = 2;
				Static543.aClass251_150.anInt6998 = 2;
				Static505.aClass251_138.anInt6998 = 2;
				Static310.aClass251_94.anInt6998 = 2;
			}
			if (Static28.aClass161_1 == Static236.aClass161_31) {
				Static491.aBoolean558 = Static480.aClass6_Sub37_Sub1_1.aBoolean407;
				Static480.aClass6_Sub37_Sub1_1.aBoolean407 = true;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				if (Static491.aBoolean558) {
					Static360.method5340(0);
				} else {
					Static360.method5340(Static480.aClass6_Sub37_Sub1_1.anInt6046);
				}
				Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
				Static419.method7565(Static176.aClass121_5);
				Static169.method2643(Static176.aClass121_5);
				Static18.method281(Static176.aClass121_5, Static447.aClass251_141);
				Static60.method775(Static52.aClass4Array1);
				Static556.method7616(null);
				Static459.aClass87_1 = null;
				Static454.anInterface14Array1 = null;
				Static284.aClass251_83 = null;
				Static97.aClass251_29 = null;
			}
			return Static127.method3632();
		}
	}
}
