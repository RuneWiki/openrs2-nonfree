import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "[[S")
	private static final short[][] aShortArrayArray16 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "[[S")
	private static final short[][] aShortArrayArray17 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "[Lclient!fba;")
	public static final Class97[] aClass97Array2 = new Class97[14];

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "[[S")
	private static final short[][] aShortArrayArray18 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vba", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString106 = null;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[4];

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray4 = new short[][][] { aShortArrayArray16, aShortArrayArray18, aShortArrayArray17 };

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8154(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static530.anInt9157 >= 200 && !Static420.aBoolean573 || Static530.anInt9157 >= 200) {
			Static353.method5583(Static121.aClass84_10.method2710(Static372.anInt7083));
			local30 = Static121.aClass84_11.method2710(Static372.anInt7083);
			if (local30 != null) {
				Static353.method5583(local30);
			}
			return;
		}
		local30 = Static456.method6912(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(90) String local90;
		for (@Pc(51) int local51 = 0; local51 < Static530.anInt9157; local51++) {
			@Pc(59) String local59 = Static456.method6912(Static54.aStringArray6[local51]);
			if (local59 != null && local59.equals(local30)) {
				Static353.method5583(arg0 + Static121.aClass84_38.method2710(Static372.anInt7083));
				return;
			}
			if (Static582.aStringArray36[local51] != null) {
				local90 = Static456.method6912(Static582.aStringArray36[local51]);
				if (local90 != null && local90.equals(local30)) {
					Static353.method5583(arg0 + Static121.aClass84_38.method2710(Static372.anInt7083));
					return;
				}
			}
		}
		for (@Pc(121) int local121 = 0; local121 < Static554.anInt9637; local121++) {
			local90 = Static456.method6912(Static525.aStringArray32[local121]);
			if (local90 != null && local90.equals(local30)) {
				Static353.method5583(Static121.aClass84_43.method2710(Static372.anInt7083) + arg0 + Static121.aClass84_44.method2710(Static372.anInt7083));
				return;
			}
			if (Static304.aStringArray18[local121] != null) {
				@Pc(165) String local165 = Static456.method6912(Static304.aStringArray18[local121]);
				if (local165 != null && local165.equals(local30)) {
					Static353.method5583(Static121.aClass84_43.method2710(Static372.anInt7083) + arg0 + Static121.aClass84_44.method2710(Static372.anInt7083));
					return;
				}
			}
		}
		if (Static456.method6912(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35).equals(local30)) {
			Static353.method5583(Static121.aClass84_41.method2710(Static372.anInt7083));
		} else {
			@Pc(223) Class8_Sub31 local223 = Static51.method1418(Static466.aClass257_90, Static608.aClass336_1);
			local223.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0));
			local223.aClass8_Sub8_Sub2_1.method8582(arg0);
			Static262.method4604(local223);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZ)V")
	public static void method8155(@OriginalArg(0) int arg0) {
		if (Static475.anInt8512 == 1) {
			Static177.anInt3823 = arg0;
		} else if (Static475.anInt8512 == 2) {
			Static128.anInt3420 = arg0;
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(IZ)V")
	public static void method8160(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static110.aClass8_Sub5_Sub4_3 != null) {
			Static401.anInt7696 = Static110.aClass8_Sub5_Sub4_3.anInt2512;
		} else {
			Static401.anInt7696 = -1;
		}
		Static110.aClass8_Sub5_Sub4_3 = null;
		Static261.aClass331_8 = null;
		Static489.anInt8687 = 0;
		Static52.aClass43_15 = null;
		Static110.method6401();
		Static110.aClass43_49.method1431();
		Static202.aClass21_7 = null;
		Static82.aClass285_5 = null;
		Static110.aClass14_3 = null;
		Static78.aClass285_4 = null;
		Static356.aClass285_10 = null;
		Static63.aClass285_3 = null;
		Static307.aClass285_7 = null;
		Static18.anInt872 = -1;
		Static123.aClass285_6 = null;
		Static148.aClass285_9 = null;
		Static312.aClass285_8 = null;
		Static329.anInt6567 = -1;
		if (Static110.aClass12_3 != null) {
			Static110.aClass12_3.method137();
			Static110.aClass12_3.method138(64, 128);
		}
		if (Static110.aClass67_4 != null) {
			Static110.aClass67_4.method2159(64, 64);
		}
		if (Static110.aClass199_2 != null) {
			Static110.aClass199_2.method5347(64);
		}
		Static418.aClass293_1.method7165(64);
	}
}
