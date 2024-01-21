import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!sd;")
	public static Class29 aClass29_74;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!jd;")
	public static Class11 aClass11_124;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!ia;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_6;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "Lclient!i;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array9;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1270 = Static63.method1251("wave2:");

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1269 = aClass45_1270;

	@OriginalMember(owner = "client!uc", name = "gb", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[5];

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public static void method1982() {
		aClass11_124 = null;
		aClass5_Sub2_Sub6_Sub3Array9 = null;
		aByteArrayArray9 = null;
		aClass5_Sub2_Sub8_6 = null;
		aBooleanArray24 = null;
		anIntArray438 = null;
		aClass45_1269 = null;
		aClass29_74 = null;
		aClass34_1 = null;
		aClass45_1270 = null;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public static void method1983() {
		Static64.aClass5_Sub9_Sub1_2.method1466(148);
		if (Static72.anInt2162 != -1) {
			Static5.method79(Static72.anInt2162);
			Static72.anInt2162 = -1;
			Static72.aBoolean99 = true;
			Static119.anInt3089 = -1;
			Static78.aBoolean102 = true;
		}
		if (Static67.anInt1909 != -1) {
			Static5.method79(Static67.anInt1909);
			Static51.aBoolean81 = true;
			Static67.anInt1909 = -1;
			Static119.anInt3089 = -1;
		}
		if (Static101.anInt1036 != -1) {
			Static5.method79(Static101.anInt1036);
			Static101.anInt1036 = -1;
			Static39.method1422(30);
		}
		if (Static38.anInt1088 != -1) {
			Static5.method79(Static38.anInt1088);
			Static38.anInt1088 = -1;
		}
		if (Static63.anInt1837 != -1) {
			Static5.method79(Static63.anInt1837);
			Static63.anInt1837 = -1;
			Static119.anInt3089 = -1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sd;II)Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 method1984(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		return Static1.method5(arg1, arg0) ? Static54.method1130() : null;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)I")
	public static int method1985() {
		return 19;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public static void method1986() {
		Static2.anIntArray6 = new int[104];
		Static112.anIntArray449 = new int[104];
		Static32.anInt936 = 99;
		Static52.anIntArrayArray31 = new int[105][105];
		Static40.anIntArrayArrayArray1 = new int[4][105][105];
		Static88.aByteArrayArrayArray6 = new byte[4][104][104];
		Static51.aByteArrayArrayArray4 = new byte[4][105][105];
		Static98.anIntArray402 = new int[104];
		Static78.aByteArrayArrayArray5 = new byte[4][104][104];
		Static32.aByteArrayArrayArray2 = new byte[4][104][104];
		Static34.anIntArray159 = new int[104];
		Static112.aByteArrayArrayArray8 = new byte[4][104][104];
		Static73.anIntArray307 = new int[104];
	}
}
