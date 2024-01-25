import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public static int anInt3798;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!gf;")
	public static Class1_Sub5_Sub1_Sub1 aClass1_Sub5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_64 = new Class11(7, 8);

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public static int anInt3801 = 0;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_54 = new Class32("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_29 = new Class30();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3478(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static136.method2646(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static376.anInt6317; local25++) {
			@Pc(31) String local31 = Static347.aStringArray149[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static136.method2646(local31);
			if (local31 != null && local31.equals(local20)) {
				Static376.anInt6317--;
				for (@Pc(57) int local57 = local25; local57 < Static376.anInt6317; local57++) {
					Static347.aStringArray149[local57] = Static347.aStringArray149[local57 + 1];
					Static290.aStringArray131[local57] = Static290.aStringArray131[local57 + 1];
					Static366.aStringArray157[local57] = Static366.aStringArray157[local57 + 1];
					Static61.aStringArray38[local57] = Static61.aStringArray38[local57 + 1];
					Static110.aBooleanArray15[local57] = Static110.aBooleanArray15[local57 + 1];
				}
				Static257.anInt4520 = Static102.anInt2133;
				Static216.method3597(Static100.aClass11_34);
				Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0));
				Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)[Lclient!ha;")
	public static Class89[] method3480() {
		return new Class89[] { Static260.aClass89_3, Static282.aClass89_4, Static311.aClass89_5 };
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method3485() {
		Static13.aClass5_1.method92();
		Static35.aClass47_1.method942();
		Static192.aClass196_1.method4166();
		Static221.aClass118_6.method2861();
		Static356.aClass48_2.method949();
		Static15.aClass81_1.method2183();
		Static36.aClass236_1.method5397();
		Static149.aClass173_5.method3797();
		Static341.aClass36_1.method794();
		Static215.aClass114_1.method2844();
		Static46.aClass139_1.method3163();
		Static304.aClass206_122.method4412();
		Static158.aClass226_1.method4907();
		Static27.aClass51_1.method1046();
		Static261.aClass125_2.method2921();
		Static341.aClass225_1.method4899();
		Static106.aClass98_1.method2526();
		Static363.aClass228_1.method4980();
		Static332.aClass210_1.method4438();
		Static170.aClass149_1.method3330();
		Static261.method4036();
		Static150.method2786();
		Static171.method3060();
		if (Static141.aClass117_7 != Static17.aClass117_1) {
			for (@Pc(83) int local83 = 0; local83 < Static168.aByteArrayArray6.length; local83++) {
				Static168.aByteArrayArray6[local83] = null;
			}
			Static30.anInt642 = 0;
		}
		Static103.method2172();
		Static385.method5630();
		Static167.method4640();
		Static387.method5634();
		Static100.method1947();
		Static256.aClass160_39.method3595();
		Static111.aClass63_3.method2021();
		Static364.aClass166_5.method3691();
		Static214.method3576();
		Static347.aClass171_93.method3763();
		Static137.aClass171_75.method3763();
		Static29.aClass171_10.method3763();
		Static86.aClass171_30.method3763();
		Static329.aClass171_85.method3763();
		Static200.aClass171_51.method3763();
		Static233.aClass171_53.method3763();
		Static237.aClass171_58.method3763();
		Static263.aClass171_64.method3763();
		Static357.aClass171_69.method3763();
		Static138.aClass171_15.method3763();
		Static165.aClass171_41.method3763();
		Static305.aClass171_80.method3763();
		Static120.aClass171_35.method3763();
		Static49.aClass171_17.method3763();
		Static187.aClass171_47.method3763();
		Static308.aClass171_81.method3763();
		Static135.aClass171_46.method3763();
		Static275.aClass171_74.method3763();
		Static81.aClass171_29.method3763();
		Static41.aClass171_13.method3763();
		Static201.aClass171_52.method3763();
		Static320.aClass171_82.method3763();
		Static67.aClass171_25.method3763();
		Static356.aClass171_94.method3763();
		Static93.aClass171_31.method3763();
		Static110.aClass171_34.method3763();
		Static246.aClass171_61.method3763();
		Static21.aClass171_6.method3763();
		Static293.aClass160_62.method3595();
		Static295.aClass160_45.method3595();
		Static167.aClass160_49.method3595();
		Static331.aClass160_52.method3595();
	}
}
