import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
	public static final int[] anIntArray19 = new int[25];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method361() {
		Static228.aClass189_4.method4522();
		Static407.aClass360_5.method8299();
		Static522.aClass290_6.method6967();
		Static204.aClass139_8.method3313();
		Static237.aClass31_1.method482();
		Static521.aClass273_2.method6711();
		Static61.aClass48_1.method1011();
		Static569.aClass213_2.method5295();
		Static381.aClass2_4.method61();
		Static121.aClass141_1.method3339();
		Static462.aClass178_1.method4034();
		Static447.aClass237_3.method5793();
		Static182.aClass142_3.method3368();
		Static517.aClass144_1.method3374();
		Static484.aClass313_2.method7379();
		Static419.aClass28_1.method450();
		Static594.aClass170_1.method3844();
		Static565.aClass188_1.method4465();
		Static222.aClass243_2.method5944();
		Static278.aClass171_1.method3847();
		Static136.method2696();
		Static255.method4095();
		Static149.method2820();
		Static257.method4154();
		if (Static296.aClass145_5 != Static565.aClass145_11) {
			for (@Pc(84) int local84 = 0; local84 < Static582.aByteArrayArray25.length; local84++) {
				Static582.aByteArrayArray25[local84] = null;
			}
			Static590.anInt10187 = 0;
		}
		Static366.method7089();
		Static485.method7232();
		Static135.method2681();
		Static153.method2848();
		Static378.method5229();
		Static388.aClass223_52.method5398();
		Static440.aClass44_12.method4984();
		Static398.method6284();
		Static393.method6218();
		Static347.aClass176_87.method3979();
		Static557.aClass176_27.method3979();
		Static93.aClass176_31.method3979();
		Static231.aClass176_63.method3979();
		Static399.aClass176_103.method3979();
		Static261.aClass176_69.method3979();
		Static55.aClass176_104.method3979();
		Static309.aClass176_81.method3979();
		Static281.aClass176_74.method3979();
		Static67.aClass176_25.method3979();
		Static212.aClass176_60.method3979();
		Static518.aClass176_127.method3979();
		Static536.aClass176_128.method3979();
		Static500.aClass176_119.method3979();
		Static112.aClass176_35.method3979();
		Static176.aClass176_48.method3979();
		Static49.aClass176_18.method3979();
		Static79.aClass176_28.method3979();
		Static157.aClass176_43.method3979();
		Static467.aClass176_114.method3979();
		Static34.aClass176_11.method3979();
		Static586.aClass176_132.method3979();
		Static333.aClass176_97.method3979();
		Static12.aClass176_6.method3979();
		Static256.aClass176_67.method3979();
		Static194.aClass176_55.method3979();
		Static502.aClass176_121.method3979();
		Static266.aClass176_71.method3979();
		Static362.aClass176_94.method3979();
		Static137.aClass176_42.method3979();
		Static362.aClass176_93.method3979();
		Static224.aClass176_61.method3979();
		Static261.aClass223_34.method5398();
		Static175.aClass223_18.method5398();
		Static95.aClass223_14.method5398();
		Static148.aClass223_65.method5398();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILclient!rh;Lclient!rh;)V")
	public static void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4_Sub5 arg3, @OriginalArg(4) Class1_Sub4_Sub5 arg4) {
		@Pc(4) Class53 local4 = Static351.method7422(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass1_Sub4_Sub5_2 = arg3;
		local4.aClass1_Sub4_Sub5_1 = arg4;
		@Pc(19) int local19 = Static499.aClass83Array3 == Static183.aClass83Array6 ? 1 : 0;
		if (!arg3.method8118()) {
			Static27.aClass1_Sub4ArrayArray1[local19][Static2.anIntArray3[local19]++] = arg3;
		} else if (arg3.method8128()) {
			Static343.aClass1_Sub4ArrayArray3[local19][Static291.anIntArray291[local19]++] = arg3;
		} else {
			Static124.aClass1_Sub4ArrayArray4[local19][Static156.anIntArray148[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8118()) {
			if (arg4.method8128()) {
				Static343.aClass1_Sub4ArrayArray3[local19][Static291.anIntArray291[local19]++] = arg4;
				return;
			}
			Static124.aClass1_Sub4ArrayArray4[local19][Static156.anIntArray148[local19]++] = arg4;
			return;
		}
		Static27.aClass1_Sub4ArrayArray1[local19][Static2.anIntArray3[local19]++] = arg4;
	}
}
