import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_129 = new Class15("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt7132 = 0;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ob;IBI)V")
	public static void method5726(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static41.aClass244_2.aClass4_227 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4614;
		@Pc(18) int local18 = arg0.anInt4617;
		@Pc(21) int local21 = arg0.anInt4615;
		@Pc(25) int local25 = (int) arg0.aLong136;
		@Pc(28) long local28 = arg0.aLong136;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 59) {
			Static74.anInt1518 = arg1;
			Static253.anInt4186 = 2;
			Static47.anInt739 = arg2;
			Static99.anInt1829 = 0;
			Static448.method5935(Static217.aClass146_103);
			Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5055((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static247.aClass4_Sub9_Sub2_2.method5053(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5053(local18 + Static366.anInt6052);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 3) {
			Static74.anInt1518 = arg1;
			Static47.anInt739 = arg2;
			Static253.anInt4186 = 2;
			Static99.anInt1829 = 0;
			Static448.method5935(Static320.aClass146_71);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static365.anInt6047 + local15);
			Static247.aClass4_Sub9_Sub2_2.method5053((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5029(local18 + Static366.anInt6052);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 17) {
			if (Static270.anInt4509 > 0 && Static180.aClass107_1.method2003(82) && Static180.aClass107_1.method2003(81)) {
				Static113.method1678(Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, Static366.anInt6052 + local18, Static365.anInt6047 - -local15);
			} else {
				Static253.anInt4186 = 1;
				Static74.anInt1518 = arg1;
				Static99.anInt1829 = 0;
				Static47.anInt739 = arg2;
				Static448.method5935(Static2.aClass146_1);
				Static247.aClass4_Sub9_Sub2_2.method5053(local15 + Static365.anInt6047);
				Static247.aClass4_Sub9_Sub2_2.method5018(Static366.anInt6052 + local18);
			}
		}
		if (local21 == 18) {
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static253.anInt4186 = 2;
			Static47.anInt739 = arg2;
			Static448.method5935(Static408.aClass146_96);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static366.anInt6052 + local18);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5018(local25);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static365.anInt6047 + local15);
			Static333.method4402(local15, local18);
		}
		if (local21 == 60) {
			Static253.anInt4186 = 1;
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static47.anInt739 = arg2;
			Static448.method5935(Static407.aClass146_95);
			Static247.aClass4_Sub9_Sub2_2.method5017(Static259.anInt4347);
			Static247.aClass4_Sub9_Sub2_2.method5055(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5055(Static366.anInt6052 + local18);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static270.anInt4512);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static81.anInt1601);
			Static344.method4581(-4, true, local15, 1, local18, 0, 1, 0);
		}
		if (local21 == 30) {
			Static74.anInt1518 = arg1;
			Static47.anInt739 = arg2;
			Static253.anInt4186 = 2;
			Static99.anInt1829 = 0;
			Static448.method5935(Static221.aClass146_56);
			Static247.aClass4_Sub9_Sub2_2.method5048(Static259.anInt4347);
			Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static81.anInt1601);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static270.anInt4512);
			Static247.aClass4_Sub9_Sub2_2.method5018(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7391);
		}
		@Pc(372) Class8_Sub3_Sub1_Sub1 local372;
		if (local21 == 21) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static253.anInt4186 = 2;
				Static47.anInt739 = arg2;
				Static99.anInt1829 = 0;
				Static74.anInt1518 = arg1;
				Static448.method5935(Static287.aClass146_63);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 23) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static99.anInt1829 = 0;
				Static47.anInt739 = arg2;
				Static74.anInt1518 = arg1;
				Static253.anInt4186 = 2;
				Static448.method5935(Static68.aClass146_27);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 1002) {
			Static47.anInt739 = arg2;
			Static99.anInt1829 = 0;
			Static253.anInt4186 = 2;
			Static74.anInt1518 = arg1;
			Static448.method5935(Static418.aClass146_101);
			Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5053(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5018(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static247.aClass4_Sub9_Sub2_2.method5018(Static366.anInt6052 + local18);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 4 && Static246.aClass110_11 == null) {
			Static407.method5524(local15, local18);
			Static246.aClass110_11 = Static220.method2992(local18, local15);
			Static118.method1693(Static246.aClass110_11);
		}
		if (local21 == 47 || local21 == 1012) {
			Static364.method4849(local18, arg0.aString39, local15, local25);
		}
		if (local21 == 20) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static47.anInt739 = arg2;
				Static253.anInt4186 = 2;
				Static74.anInt1518 = arg1;
				Static99.anInt1829 = 0;
				Static448.method5935(Static237.aClass146_83);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 50) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static99.anInt1829 = 0;
				Static74.anInt1518 = arg1;
				Static47.anInt739 = arg2;
				Static253.anInt4186 = 2;
				Static448.method5935(Static117.aClass146_36);
				Static247.aClass4_Sub9_Sub2_2.method5055(local25);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 15) {
			if (Static270.anInt4509 > 0 && Static180.aClass107_1.method2003(82) && Static180.aClass107_1.method2003(81)) {
				Static113.method1678(Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, Static366.anInt6052 + local18, Static365.anInt6047 - -local15);
			} else {
				Static56.method782(local15, local25, local18);
				if (local25 == 1) {
					Static247.aClass4_Sub9_Sub2_2.method4999(-1);
					Static247.aClass4_Sub9_Sub2_2.method4999(-1);
					Static247.aClass4_Sub9_Sub2_2.method5029((int) Static109.aFloat75);
					Static247.aClass4_Sub9_Sub2_2.method4999(57);
					Static247.aClass4_Sub9_Sub2_2.method4999(Static35.anInt575);
					Static247.aClass4_Sub9_Sub2_2.method4999(Static380.anInt6188);
					Static247.aClass4_Sub9_Sub2_2.method4999(89);
					Static247.aClass4_Sub9_Sub2_2.method5029(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339);
					Static247.aClass4_Sub9_Sub2_2.method5029(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343);
					Static247.aClass4_Sub9_Sub2_2.method4999(63);
				} else {
					Static99.anInt1829 = 0;
					Static47.anInt739 = arg2;
					Static253.anInt4186 = 1;
					Static74.anInt1518 = arg1;
				}
				Static344.method4581(-4, true, local15, 1, local18, 0, 1, 0);
			}
		}
		if (local21 == 46) {
			Static99.anInt1829 = 0;
			Static47.anInt739 = arg2;
			Static253.anInt4186 = 2;
			Static74.anInt1518 = arg1;
			Static448.method5935(Static356.aClass146_81);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static365.anInt6047 + local15);
			Static247.aClass4_Sub9_Sub2_2.method5029(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static247.aClass4_Sub9_Sub2_2.method5055(local18 + Static366.anInt6052);
			Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 6) {
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static47.anInt739 = arg2;
			Static253.anInt4186 = 2;
			Static448.method5935(Static365.aClass146_85);
			Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5018(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5055(Static366.anInt6052 + local18);
			Static247.aClass4_Sub9_Sub2_2.method5053((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 10) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static74.anInt1518 = arg1;
				Static253.anInt4186 = 2;
				Static99.anInt1829 = 0;
				Static47.anInt739 = arg2;
				Static448.method5935(Static297.aClass146_67);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static247.aClass4_Sub9_Sub2_2.method5035(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		@Pc(1005) Class8_Sub3_Sub1_Sub2 local1005;
		if (local21 == 8) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static47.anInt739 = arg2;
				Static74.anInt1518 = arg1;
				Static253.anInt4186 = 2;
				Static99.anInt1829 = 0;
				Static448.method5935(Static129.aClass146_40);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 16) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static99.anInt1829 = 0;
				Static74.anInt1518 = arg1;
				Static253.anInt4186 = 2;
				Static47.anInt739 = arg2;
				Static448.method5935(Static412.aClass146_99);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static247.aClass4_Sub9_Sub2_2.method5018(Static81.anInt1601);
				Static247.aClass4_Sub9_Sub2_2.method5055(Static270.anInt4512);
				Static247.aClass4_Sub9_Sub2_2.method5017(Static259.anInt4347);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 1008) {
			Static74.anInt1518 = arg1;
			Static47.anInt739 = arg2;
			Static99.anInt1829 = 0;
			Static253.anInt4186 = 2;
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				@Pc(1160) Class78 local1160 = local1005.aClass78_1;
				if (local1160.anIntArray145 != null) {
					local1160 = local1160.method1547(Static52.aClass81_1);
				}
				if (local1160 != null) {
					Static448.method5935(Static96.aClass146_32);
					Static247.aClass4_Sub9_Sub2_2.method5029(local1160.anInt1899);
				}
			}
		}
		if (local21 == 2) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static99.anInt1829 = 0;
				Static74.anInt1518 = arg1;
				Static253.anInt4186 = 2;
				Static47.anInt739 = arg2;
				Static448.method5935(Static16.aClass146_11);
				Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 57) {
			Static47.anInt739 = arg2;
			Static74.anInt1518 = arg1;
			Static253.anInt4186 = 2;
			Static99.anInt1829 = 0;
			Static448.method5935(Static295.aClass146_66);
			Static247.aClass4_Sub9_Sub2_2.method5053(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5029(local18 + Static366.anInt6052);
			Static247.aClass4_Sub9_Sub2_2.method5029(local25);
			Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static333.method4402(local15, local18);
		}
		@Pc(1306) Class110 local1306;
		if (local21 == 12) {
			local1306 = Static220.method2992(local18, local15);
			if (local1306 != null) {
				Static4.method74();
				@Pc(1313) Class4_Sub20 local1313 = Static55.method752(local1306);
				Static247.method3255(local1306, local1313.anInt3510, local1313.method2796());
				Static304.aString54 = Static106.method1587(local1306);
				if (Static304.aString54 == null) {
					Static304.aString54 = "Null";
				}
				Static368.aString66 = local1306.aString18 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 5) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static253.anInt4186 = 2;
				Static74.anInt1518 = arg1;
				Static99.anInt1829 = 0;
				Static47.anInt739 = arg2;
				Static448.method5935(Static221.aClass146_56);
				Static247.aClass4_Sub9_Sub2_2.method5048(Static259.anInt4347);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static247.aClass4_Sub9_Sub2_2.method5053(Static81.anInt1601);
				Static247.aClass4_Sub9_Sub2_2.method5053(Static270.anInt4512);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 49) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static74.anInt1518 = arg1;
				Static99.anInt1829 = 0;
				Static253.anInt4186 = 2;
				Static47.anInt739 = arg2;
				Static448.method5935(Static325.aClass146_72);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 51) {
			Static253.anInt4186 = 2;
			Static74.anInt1518 = arg1;
			Static47.anInt739 = arg2;
			Static99.anInt1829 = 0;
			Static448.method5935(Static401.aClass146_92);
			Static247.aClass4_Sub9_Sub2_2.method5018(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5053(local25);
			Static247.aClass4_Sub9_Sub2_2.method5035(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5055(Static366.anInt6052 + local18);
			Static333.method4402(local15, local18);
		}
		if (local21 == 11) {
			local372 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local25];
			if (local372 != null) {
				Static253.anInt4186 = 2;
				Static74.anInt1518 = arg1;
				Static47.anInt739 = arg2;
				Static99.anInt1829 = 0;
				Static448.method5935(Static329.aClass146_73);
				Static247.aClass4_Sub9_Sub2_2.method5053(local25);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local372.anIntArray560[0], local372.method5894(), local372.anIntArray559[0], 0, local372.method5894(), 0);
			}
		}
		if (local21 == 19) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static74.anInt1518 = arg1;
				Static47.anInt739 = arg2;
				Static99.anInt1829 = 0;
				Static253.anInt4186 = 2;
				Static448.method5935(Static208.aClass146_94);
				Static247.aClass4_Sub9_Sub2_2.method5055(local25);
				Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 48) {
			Static253.anInt4186 = 2;
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static47.anInt739 = arg2;
			Static448.method5935(Static200.aClass146_54);
			Static247.aClass4_Sub9_Sub2_2.method5018(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5018(local25);
			Static247.aClass4_Sub9_Sub2_2.method5023(Static259.anInt4347);
			Static247.aClass4_Sub9_Sub2_2.method5018(local18 + Static366.anInt6052);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5018(Static270.anInt4512);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static81.anInt1601);
			Static333.method4402(local15, local18);
		}
		if (local21 == 13) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static253.anInt4186 = 2;
				Static99.anInt1829 = 0;
				Static47.anInt739 = arg2;
				Static74.anInt1518 = arg1;
				Static448.method5935(Static389.aClass146_91);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 1007 || local21 == 1006 || local21 == 1011 || local21 == 1010 || local21 == 1009) {
			Static270.method3594(local25, local21, local15);
		}
		if (local21 == 9) {
			Static99.anInt1829 = 0;
			Static253.anInt4186 = 2;
			Static74.anInt1518 = arg1;
			Static47.anInt739 = arg2;
			Static448.method5935(Static387.aClass146_90);
			Static247.aClass4_Sub9_Sub2_2.method5029(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5053(local25);
			Static247.aClass4_Sub9_Sub2_2.method5029(Static366.anInt6052 + local18);
			Static333.method4402(local15, local18);
		}
		if (local21 == 58) {
			local1306 = Static220.method2992(local18, local15);
			if (local1306 != null) {
				Static354.method4682(local1306);
			}
		}
		if (local21 == 25) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static99.anInt1829 = 0;
				Static253.anInt4186 = 2;
				Static47.anInt739 = arg2;
				Static74.anInt1518 = arg1;
				Static448.method5935(Static47.aClass146_17);
				Static247.aClass4_Sub9_Sub2_2.method5029(local25);
				Static247.aClass4_Sub9_Sub2_2.method5058(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 44) {
			Static253.anInt4186 = 2;
			Static47.anInt739 = arg2;
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static448.method5935(Static153.aClass146_44);
			Static247.aClass4_Sub9_Sub2_2.method5018((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5055(Static270.anInt4512);
			Static247.aClass4_Sub9_Sub2_2.method5055(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5029(local18 + Static366.anInt6052);
			Static247.aClass4_Sub9_Sub2_2.method5053(Static81.anInt1601);
			Static247.aClass4_Sub9_Sub2_2.method5023(Static259.anInt4347);
			Static58.method819(local28, local18, local15);
		}
		if (local21 == 1001) {
			Static99.anInt1829 = 0;
			Static74.anInt1518 = arg1;
			Static253.anInt4186 = 2;
			Static47.anInt739 = arg2;
			Static448.method5935(Static179.aClass146_50);
			Static247.aClass4_Sub9_Sub2_2.method5029(local25);
		}
		if (local21 == 45) {
			Static74.anInt1518 = arg1;
			Static253.anInt4186 = 2;
			Static99.anInt1829 = 0;
			Static47.anInt739 = arg2;
			Static448.method5935(Static110.aClass146_35);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static180.aClass107_1.method2003(82) ? 1 : 0);
			Static247.aClass4_Sub9_Sub2_2.method5055(local25);
			Static247.aClass4_Sub9_Sub2_2.method5029(local15 + Static365.anInt6047);
			Static247.aClass4_Sub9_Sub2_2.method5055(Static366.anInt6052 + local18);
			Static333.method4402(local15, local18);
		}
		if (local21 == 22) {
			local1005 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local25];
			if (local1005 != null) {
				Static99.anInt1829 = 0;
				Static253.anInt4186 = 2;
				Static74.anInt1518 = arg1;
				Static47.anInt739 = arg2;
				Static448.method5935(Static209.aClass146_55);
				Static247.aClass4_Sub9_Sub2_2.method5018(local25);
				Static247.aClass4_Sub9_Sub2_2.method4996(Static180.aClass107_1.method2003(82) ? 1 : 0);
				Static344.method4581(-2, true, local1005.anIntArray560[0], local1005.method5894(), local1005.anIntArray559[0], 0, local1005.method5894(), 0);
			}
		}
		if (local21 == 1004) {
			Static253.anInt4186 = 2;
			Static47.anInt739 = arg2;
			Static74.anInt1518 = arg1;
			Static99.anInt1829 = 0;
			Static448.method5935(Static59.aClass146_15);
			Static247.aClass4_Sub9_Sub2_2.method5029(local25);
		}
		if (Static70.aBoolean94) {
			Static4.method74();
		}
		if (Static129.aClass110_7 != null && Static183.anInt3357 == 0) {
			Static118.method1693(Static129.aClass110_7);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIB)I")
	public static int method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 / arg2;
		@Pc(21) int local21 = arg0 & arg2 - 1;
		@Pc(25) int local25 = arg1 / arg2;
		@Pc(31) int local31 = arg1 & arg2 - 1;
		@Pc(36) int local36 = Static113.method1670(local15, local25);
		@Pc(43) int local43 = Static113.method1670(local15 + 1, local25);
		@Pc(50) int local50 = Static113.method1670(local15, local25 + 1);
		@Pc(59) int local59 = Static113.method1670(local15 + 1, local25 - -1);
		@Pc(66) int local66 = Static324.method4283(local43, local21, local36, arg2);
		@Pc(73) int local73 = Static324.method4283(local59, local21, local50, arg2);
		return Static324.method4283(local73, local31, local66, arg2);
	}
}
