import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ka", name = "Qc", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!ka", name = "Zc", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!ka", name = "dd", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!ka", name = "Mc", descriptor = "Lclient!ec;")
	private static Class22 aClass22_442 = Static60.method1113("Connecting to update server");

	@OriginalMember(owner = "client!ka", name = "Ec", descriptor = "Lclient!ec;")
	public static Class22 aClass22_441 = aClass22_442;

	@OriginalMember(owner = "client!ka", name = "Hc", descriptor = "I")
	public static int anInt1729 = 127;

	@OriginalMember(owner = "client!ka", name = "Ic", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!ka", name = "Lc", descriptor = "I")
	public static int anInt1731 = -1;

	@OriginalMember(owner = "client!ka", name = "Yc", descriptor = "I")
	public static int anInt1741 = 0;

	@OriginalMember(owner = "client!ka", name = "nd", descriptor = "Lclient!ec;")
	private static Class22 aClass22_445 = Static60.method1113("Close");

	@OriginalMember(owner = "client!ka", name = "id", descriptor = "Lclient!ec;")
	public static Class22 aClass22_443 = aClass22_445;

	@OriginalMember(owner = "client!ka", name = "kd", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I")
	public static int method1093(@OriginalArg(1) int arg0) {
		@Pc(3) Class4_Sub1_Sub1 local3 = Static66.method1161(arg0);
		@Pc(6) int local6 = local3.anInt79;
		@Pc(14) int local14 = local3.anInt76;
		@Pc(21) int local21 = local3.anInt81;
		@Pc(27) int local27 = Class60.anIntArray282[local21 - local14];
		return Static23.anIntArray61[local6] >> local14 & local27;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method1094() {
		anIntArray171 = null;
		Static61.anIntArray175 = null;
		Static124.aByteArrayArray9 = null;
		Static105.anIntArray297 = null;
		Static30.anIntArray77 = null;
		Static27.anIntArray75 = null;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1095() {
		aClass22_443 = null;
		aClass4_Sub1_Sub2_Sub2Array10 = null;
		aClass22_441 = null;
		anIntArray171 = null;
		anIntArrayArrayArray4 = null;
		aClass22_445 = null;
		aClass22_442 = null;
	}
}
