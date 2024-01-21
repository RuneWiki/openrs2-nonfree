import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!na", name = "Pb", descriptor = "I")
	public static int anInt2432;

	@OriginalMember(owner = "client!na", name = "Zb", descriptor = "I")
	public static int anInt2433;

	@OriginalMember(owner = "client!na", name = "mc", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!na", name = "Mb", descriptor = "Lclient!na;")
	public static Class3_Sub1_Sub4_Sub5_Sub1 aClass3_Sub1_Sub4_Sub5_Sub1_1 = new Class3_Sub1_Sub4_Sub5_Sub1();

	@OriginalMember(owner = "client!na", name = "Nb", descriptor = "Lclient!na;")
	public static Class3_Sub1_Sub4_Sub5_Sub1 aClass3_Sub1_Sub4_Sub5_Sub1_2 = new Class3_Sub1_Sub4_Sub5_Sub1();

	@OriginalMember(owner = "client!na", name = "Ob", descriptor = "[B")
	public static byte[] aByteArray31 = new byte[1];

	@OriginalMember(owner = "client!na", name = "Qb", descriptor = "[I")
	public static int[] anIntArray260 = new int[12];

	@OriginalMember(owner = "client!na", name = "Rb", descriptor = "[I")
	public static int[] anIntArray261 = new int[10];

	@OriginalMember(owner = "client!na", name = "Sb", descriptor = "[I")
	public static int[] anIntArray262 = new int[4096];

	@OriginalMember(owner = "client!na", name = "Tb", descriptor = "[I")
	public static int[] anIntArray263 = new int[4096];

	@OriginalMember(owner = "client!na", name = "Ub", descriptor = "[B")
	public static byte[] aByteArray32 = new byte[1];

	@OriginalMember(owner = "client!na", name = "Vb", descriptor = "[I")
	public static int[] anIntArray264 = new int[4096];

	@OriginalMember(owner = "client!na", name = "Wb", descriptor = "[I")
	public static int[] anIntArray265 = new int[2000];

	@OriginalMember(owner = "client!na", name = "Xb", descriptor = "[I")
	public static int[] anIntArray266 = Class3_Sub1_Sub3_Sub2.anIntArray83;

	@OriginalMember(owner = "client!na", name = "Yb", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[1600][512];

	@OriginalMember(owner = "client!na", name = "ac", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!na", name = "bc", descriptor = "[I")
	public static int[] anIntArray267 = new int[4096];

	@OriginalMember(owner = "client!na", name = "cc", descriptor = "[I")
	public static int[] anIntArray268 = new int[4096];

	@OriginalMember(owner = "client!na", name = "dc", descriptor = "[I")
	public static int[] anIntArray269 = new int[10];

	@OriginalMember(owner = "client!na", name = "ec", descriptor = "[I")
	public static int[] anIntArray270 = Class3_Sub1_Sub3_Sub2.anIntArray88;

	@OriginalMember(owner = "client!na", name = "fc", descriptor = "[I")
	public static int[] anIntArray271 = new int[10];

	@OriginalMember(owner = "client!na", name = "gc", descriptor = "[I")
	public static int[] anIntArray272 = Static36.anIntArray86;

	@OriginalMember(owner = "client!na", name = "hc", descriptor = "[I")
	public static int[] anIntArray273 = new int[2000];

	@OriginalMember(owner = "client!na", name = "ic", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[12][2000];

	@OriginalMember(owner = "client!na", name = "jc", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[4096];

	@OriginalMember(owner = "client!na", name = "kc", descriptor = "[I")
	public static int[] anIntArray274 = new int[1600];

	@OriginalMember(owner = "client!na", name = "lc", descriptor = "[I")
	public static int[] anIntArray275 = new int[4096];

	@OriginalMember(owner = "client!na", name = "nc", descriptor = "[I")
	public static int[] anIntArray276 = Class3_Sub1_Sub3_Sub2.anIntArray87;

	@OriginalMember(owner = "client!na", name = "oc", descriptor = "[I")
	public static int[] anIntArray277 = new int[12];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
	public static int method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	public static void method1901() {
		aClass3_Sub1_Sub4_Sub5_Sub1_1 = null;
		aByteArray31 = null;
		aClass3_Sub1_Sub4_Sub5_Sub1_2 = null;
		aByteArray32 = null;
		aBooleanArray11 = null;
		aBooleanArray12 = null;
		anIntArray275 = null;
		anIntArray262 = null;
		anIntArray267 = null;
		anIntArray264 = null;
		anIntArray268 = null;
		anIntArray263 = null;
		anIntArray274 = null;
		anIntArrayArray27 = null;
		anIntArray260 = null;
		anIntArrayArray28 = null;
		anIntArray265 = null;
		anIntArray273 = null;
		anIntArray277 = null;
		anIntArray261 = null;
		anIntArray271 = null;
		anIntArray269 = null;
		anIntArray276 = null;
		anIntArray270 = null;
		anIntArray272 = null;
		anIntArray266 = null;
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "(I)I")
	public static int method1902(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
