import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!gf", name = "Ub", descriptor = "I")
	public static int anInt1310;

	@OriginalMember(owner = "client!gf", name = "Zb", descriptor = "I")
	public static int anInt1311;

	@OriginalMember(owner = "client!gf", name = "ic", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!gf", name = "Ab", descriptor = "Lclient!gf;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 aClass2_Sub2_Sub3_Sub4_Sub1_1 = new Class2_Sub2_Sub3_Sub4_Sub1();

	@OriginalMember(owner = "client!gf", name = "Nb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[1];

	@OriginalMember(owner = "client!gf", name = "Ob", descriptor = "Lclient!gf;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 aClass2_Sub2_Sub3_Sub4_Sub1_2 = new Class2_Sub2_Sub3_Sub4_Sub1();

	@OriginalMember(owner = "client!gf", name = "Pb", descriptor = "[I")
	public static int[] anIntArray145 = new int[2000];

	@OriginalMember(owner = "client!gf", name = "Qb", descriptor = "[I")
	public static int[] anIntArray146 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "Rb", descriptor = "[I")
	public static int[] anIntArray147 = new int[12];

	@OriginalMember(owner = "client!gf", name = "Sb", descriptor = "[I")
	public static int[] anIntArray148 = new int[10];

	@OriginalMember(owner = "client!gf", name = "Tb", descriptor = "[I")
	public static int[] anIntArray149 = Static109.anIntArray216;

	@OriginalMember(owner = "client!gf", name = "Vb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[4096];

	@OriginalMember(owner = "client!gf", name = "Wb", descriptor = "[I")
	public static int[] anIntArray150 = Class2_Sub2_Sub2_Sub4.anIntArray219;

	@OriginalMember(owner = "client!gf", name = "Xb", descriptor = "[I")
	public static int[] anIntArray151 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "Yb", descriptor = "[I")
	public static int[] anIntArray152 = new int[1600];

	@OriginalMember(owner = "client!gf", name = "ac", descriptor = "[I")
	public static int[] anIntArray153 = new int[12];

	@OriginalMember(owner = "client!gf", name = "bc", descriptor = "[I")
	public static int[] anIntArray154 = Class2_Sub2_Sub2_Sub4.anIntArray218;

	@OriginalMember(owner = "client!gf", name = "cc", descriptor = "[I")
	public static int[] anIntArray155 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "dc", descriptor = "[I")
	public static int[] anIntArray156 = new int[10];

	@OriginalMember(owner = "client!gf", name = "ec", descriptor = "[I")
	public static int[] anIntArray157 = new int[10];

	@OriginalMember(owner = "client!gf", name = "fc", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[12][2000];

	@OriginalMember(owner = "client!gf", name = "gc", descriptor = "[B")
	public static byte[] aByteArray18 = new byte[1];

	@OriginalMember(owner = "client!gf", name = "hc", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[1600][512];

	@OriginalMember(owner = "client!gf", name = "jc", descriptor = "[I")
	public static int[] anIntArray158 = Class2_Sub2_Sub2_Sub4.anIntArray217;

	@OriginalMember(owner = "client!gf", name = "kc", descriptor = "[I")
	public static int[] anIntArray159 = new int[2000];

	@OriginalMember(owner = "client!gf", name = "lc", descriptor = "[I")
	public static int[] anIntArray160 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "mc", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[4096];

	@OriginalMember(owner = "client!gf", name = "nc", descriptor = "[I")
	public static int[] anIntArray161 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "oc", descriptor = "[I")
	public static int[] anIntArray162 = new int[4096];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
	public static int method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "()V")
	public static void method1059() {
		aClass2_Sub2_Sub3_Sub4_Sub1_1 = null;
		aByteArray17 = null;
		aClass2_Sub2_Sub3_Sub4_Sub1_2 = null;
		aByteArray18 = null;
		aBooleanArray8 = null;
		aBooleanArray7 = null;
		anIntArray162 = null;
		anIntArray151 = null;
		anIntArray160 = null;
		anIntArray161 = null;
		anIntArray155 = null;
		anIntArray146 = null;
		anIntArray152 = null;
		anIntArrayArray15 = null;
		anIntArray153 = null;
		anIntArrayArray14 = null;
		anIntArray145 = null;
		anIntArray159 = null;
		anIntArray147 = null;
		anIntArray157 = null;
		anIntArray156 = null;
		anIntArray148 = null;
		anIntArray158 = null;
		anIntArray154 = null;
		anIntArray149 = null;
		anIntArray150 = null;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)I")
	public static int method1067(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
