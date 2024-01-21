import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static109 {

	@OriginalMember(owner = "client!ng", name = "Fb", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!ng", name = "Mb", descriptor = "I")
	public static int anInt2609;

	@OriginalMember(owner = "client!ng", name = "Ub", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!ng", name = "zb", descriptor = "Lclient!ng;")
	public static Class3_Sub2_Sub1_Sub2_Sub1 aClass3_Sub2_Sub1_Sub2_Sub1_1 = new Class3_Sub2_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!ng", name = "Ab", descriptor = "Lclient!ng;")
	public static Class3_Sub2_Sub1_Sub2_Sub1 aClass3_Sub2_Sub1_Sub2_Sub1_2 = new Class3_Sub2_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!ng", name = "Bb", descriptor = "[B")
	public static byte[] aByteArray24 = new byte[1];

	@OriginalMember(owner = "client!ng", name = "Cb", descriptor = "[I")
	public static int[] anIntArray270 = Static132.anIntArray348;

	@OriginalMember(owner = "client!ng", name = "Db", descriptor = "[I")
	public static int[] anIntArray271 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Eb", descriptor = "[B")
	public static byte[] aByteArray25 = new byte[1];

	@OriginalMember(owner = "client!ng", name = "Gb", descriptor = "[I")
	public static int[] anIntArray272 = new int[10];

	@OriginalMember(owner = "client!ng", name = "Hb", descriptor = "[I")
	public static int[] anIntArray273 = new int[10];

	@OriginalMember(owner = "client!ng", name = "Ib", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[12][2000];

	@OriginalMember(owner = "client!ng", name = "Jb", descriptor = "[I")
	public static int[] anIntArray274 = new int[10];

	@OriginalMember(owner = "client!ng", name = "Kb", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[4096];

	@OriginalMember(owner = "client!ng", name = "Lb", descriptor = "[I")
	public static int[] anIntArray275 = new int[12];

	@OriginalMember(owner = "client!ng", name = "Nb", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[4096];

	@OriginalMember(owner = "client!ng", name = "Ob", descriptor = "[I")
	public static int[] anIntArray276 = Class3_Sub2_Sub3_Sub4.anIntArray350;

	@OriginalMember(owner = "client!ng", name = "Pb", descriptor = "[I")
	public static int[] anIntArray277 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Qb", descriptor = "[I")
	public static int[] anIntArray278 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Rb", descriptor = "[I")
	public static int[] anIntArray279 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Sb", descriptor = "[I")
	public static int[] anIntArray280 = new int[2000];

	@OriginalMember(owner = "client!ng", name = "Tb", descriptor = "[I")
	public static int[] anIntArray281 = Class3_Sub2_Sub3_Sub4.anIntArray347;

	@OriginalMember(owner = "client!ng", name = "Vb", descriptor = "[I")
	public static int[] anIntArray282 = new int[2000];

	@OriginalMember(owner = "client!ng", name = "Wb", descriptor = "[I")
	public static int[] anIntArray283 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Xb", descriptor = "[I")
	public static int[] anIntArray284 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "Yb", descriptor = "[I")
	public static int[] anIntArray285 = new int[12];

	@OriginalMember(owner = "client!ng", name = "Zb", descriptor = "[I")
	public static int[] anIntArray286 = Class3_Sub2_Sub3_Sub4.anIntArray346;

	@OriginalMember(owner = "client!ng", name = "ac", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[1600][512];

	@OriginalMember(owner = "client!ng", name = "bc", descriptor = "[I")
	public static int[] anIntArray287 = new int[1600];

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "()V")
	public static void method1806() {
		aClass3_Sub2_Sub1_Sub2_Sub1_1 = null;
		aByteArray24 = null;
		aClass3_Sub2_Sub1_Sub2_Sub1_2 = null;
		aByteArray25 = null;
		aBooleanArray15 = null;
		aBooleanArray14 = null;
		anIntArray277 = null;
		anIntArray283 = null;
		anIntArray271 = null;
		anIntArray278 = null;
		anIntArray279 = null;
		anIntArray284 = null;
		anIntArray287 = null;
		anIntArrayArray27 = null;
		anIntArray285 = null;
		anIntArrayArray26 = null;
		anIntArray280 = null;
		anIntArray282 = null;
		anIntArray275 = null;
		anIntArray272 = null;
		anIntArray274 = null;
		anIntArray273 = null;
		anIntArray281 = null;
		anIntArray286 = null;
		anIntArray270 = null;
		anIntArray276 = null;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I")
	public static int method1807(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public static int method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
