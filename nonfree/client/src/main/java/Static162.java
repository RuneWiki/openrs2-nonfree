import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Z")
	public static boolean aBoolean235;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "[I")
	public static int[] anIntArray274 = new int[100];

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[J")
	public static long[] aLongArray69 = new long[100];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([IZ)[I")
	public static int[] method2752(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) int[] local18 = new int[arg0.length];
			Static319.method513(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V")
	public static void method2753(@OriginalArg(1) boolean arg0) {
		Static58.anIntArrayArrayArray7 = null;
		Static191.anInt3924 = 0;
		Static58.aByteArrayArrayArray13 = null;
		Static58.anIntArrayArrayArray8 = null;
		Static234.aClass24_23 = null;
		Static58.aByteArrayArrayArray12 = null;
		Static58.aByteArrayArrayArray15 = null;
		Static58.aByteArrayArrayArray14 = null;
		Static58.aByteArrayArrayArray16 = null;
		Static58.anIntArray204 = null;
		if (arg0 && Static58.aClass1_Sub1_Sub8_2 != null) {
			Static246.anInt4882 = Static58.aClass1_Sub1_Sub8_2.anInt1060;
		} else {
			Static246.anInt4882 = -1;
		}
		Static106.aClass146_9 = null;
		Static58.aClass1_Sub1_Sub8_2 = null;
		Static58.aClass5_11.method55();
		Static136.aClass133_4 = null;
		Static280.anInt5336 = -1;
		Static140.anInt2753 = -1;
		Static145.aClass133_5 = null;
		Static58.aClass172_3 = null;
		Static263.aClass133_8 = null;
		Static176.aClass1_Sub1_Sub3_11 = null;
		Static7.aClass133_1 = null;
		Static61.aClass133_2 = null;
		Static117.aClass133_3 = null;
		Static144.aClass1_Sub1_Sub3_Sub2_1 = null;
		Static152.aClass133_6 = null;
		Static263.aClass133_7 = null;
		Static122.method1958();
		Static49.aClass156_3 = null;
		Static260.aClass48_1 = null;
		Static98.aClass156_8 = null;
		Static198.method3211(128, 64);
		Static233.method3683(64, 64);
		Static52.method963(64);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2754(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static137.aClass1_Sub14_Sub1_6.method2661(64);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0));
			Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
		}
	}
}
