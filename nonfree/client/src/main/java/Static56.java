import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!gg", name = "Nb", descriptor = "I")
	public static int anInt1626;

	@OriginalMember(owner = "client!gg", name = "Zb", descriptor = "I")
	public static int anInt1627;

	@OriginalMember(owner = "client!gg", name = "jc", descriptor = "I")
	public static int anInt1628;

	@OriginalMember(owner = "client!gg", name = "yb", descriptor = "Lclient!gg;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_1 = new Class1_Sub1_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!gg", name = "Hb", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[1];

	@OriginalMember(owner = "client!gg", name = "Jb", descriptor = "Lclient!gg;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_2 = new Class1_Sub1_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!gg", name = "Mb", descriptor = "[I")
	public static int[] anIntArray206 = new int[10];

	@OriginalMember(owner = "client!gg", name = "Ob", descriptor = "[I")
	public static int[] anIntArray207 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "Pb", descriptor = "[I")
	public static int[] anIntArray208 = Class1_Sub1_Sub12_Sub2.anIntArray417;

	@OriginalMember(owner = "client!gg", name = "Qb", descriptor = "[I")
	public static int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "Rb", descriptor = "[I")
	public static int[] anIntArray210 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "Sb", descriptor = "[I")
	public static int[] anIntArray211 = new int[10];

	@OriginalMember(owner = "client!gg", name = "Tb", descriptor = "[I")
	public static int[] anIntArray212 = new int[2000];

	@OriginalMember(owner = "client!gg", name = "Ub", descriptor = "[I")
	public static int[] anIntArray213 = new int[1600];

	@OriginalMember(owner = "client!gg", name = "Vb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[4096];

	@OriginalMember(owner = "client!gg", name = "Wb", descriptor = "[B")
	public static byte[] aByteArray18 = new byte[1];

	@OriginalMember(owner = "client!gg", name = "Xb", descriptor = "[I")
	public static int[] anIntArray214 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "Yb", descriptor = "[I")
	public static int[] anIntArray215 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "ac", descriptor = "[I")
	public static int[] anIntArray216 = new int[2000];

	@OriginalMember(owner = "client!gg", name = "bc", descriptor = "[I")
	public static int[] anIntArray217 = new int[12];

	@OriginalMember(owner = "client!gg", name = "cc", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[4096];

	@OriginalMember(owner = "client!gg", name = "dc", descriptor = "[I")
	public static int[] anIntArray218 = new int[10];

	@OriginalMember(owner = "client!gg", name = "ec", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[1600][512];

	@OriginalMember(owner = "client!gg", name = "fc", descriptor = "[I")
	public static int[] anIntArray219 = new int[12];

	@OriginalMember(owner = "client!gg", name = "gc", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[12][2000];

	@OriginalMember(owner = "client!gg", name = "hc", descriptor = "[I")
	public static int[] anIntArray220 = Class1_Sub1_Sub12_Sub2.anIntArray416;

	@OriginalMember(owner = "client!gg", name = "ic", descriptor = "[I")
	public static int[] anIntArray221 = Static121.anIntArray421;

	@OriginalMember(owner = "client!gg", name = "kc", descriptor = "[I")
	public static int[] anIntArray222 = Class1_Sub1_Sub12_Sub2.anIntArray420;

	@OriginalMember(owner = "client!gg", name = "lc", descriptor = "[I")
	public static int[] anIntArray223 = new int[4096];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
	public static int method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "(I)I")
	public static int method1092(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "()V")
	public static void method1096() {
		aClass1_Sub1_Sub1_Sub2_Sub1_1 = null;
		aByteArray16 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_2 = null;
		aByteArray18 = null;
		aBooleanArray7 = null;
		aBooleanArray8 = null;
		anIntArray214 = null;
		anIntArray210 = null;
		anIntArray209 = null;
		anIntArray215 = null;
		anIntArray223 = null;
		anIntArray207 = null;
		anIntArray213 = null;
		anIntArrayArray17 = null;
		anIntArray217 = null;
		anIntArrayArray18 = null;
		anIntArray216 = null;
		anIntArray212 = null;
		anIntArray219 = null;
		anIntArray211 = null;
		anIntArray218 = null;
		anIntArray206 = null;
		anIntArray220 = null;
		anIntArray208 = null;
		anIntArray221 = null;
		anIntArray222 = null;
	}
}
