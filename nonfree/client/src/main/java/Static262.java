import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	public static int anInt5254;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "I")
	public static int anInt5255;

	@OriginalMember(owner = "client!u", name = "Gb", descriptor = "I")
	public static int anInt5257;

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "Lclient!u;")
	public static Class36_Sub2_Sub2 aClass36_Sub2_Sub2_1 = new Class36_Sub2_Sub2();

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "[I")
	public static int[] anIntArray431 = new int[1];

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "[I")
	public static int[] anIntArray432 = new int[1];

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "[S")
	public static short[] aShortArray61 = new short[1];

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "[B")
	public static byte[] aByteArray55 = new byte[1];

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[I")
	public static int[] anIntArray433 = new int[1];

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "Lclient!u;")
	public static Class36_Sub2_Sub2 aClass36_Sub2_Sub2_2 = new Class36_Sub2_Sub2();

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "[I")
	public static int[] anIntArray434 = new int[1];

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "[B")
	public static byte[] aByteArray56 = new byte[1];

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "[I")
	public static int[] anIntArray435 = new int[1];

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "[S")
	public static short[] aShortArray62 = new short[1];

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "[I")
	public static int[] anIntArray436 = new int[1];

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "Lclient!u;")
	public static Class36_Sub2_Sub2 aClass36_Sub2_Sub2_3 = new Class36_Sub2_Sub2();

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[12][4096];

	@OriginalMember(owner = "client!u", name = "ob", descriptor = "[I")
	public static int[] anIntArray438 = new int[10];

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "[I")
	public static int[] anIntArray439 = new int[1];

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "[I")
	public static int[] anIntArray440 = new int[4096];

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "[B")
	public static byte[] aByteArray57 = new byte[1];

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "[I")
	public static int[] anIntArray441 = new int[4096];

	@OriginalMember(owner = "client!u", name = "xb", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[4096];

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "[I")
	public static int[] anIntArray442 = new int[12];

	@OriginalMember(owner = "client!u", name = "zb", descriptor = "[I")
	public static int[] anIntArray443 = new int[1];

	@OriginalMember(owner = "client!u", name = "Bb", descriptor = "[I")
	public static int[] anIntArray445 = new int[10];

	@OriginalMember(owner = "client!u", name = "Cb", descriptor = "[I")
	public static int[] anIntArray446 = new int[8192];

	@OriginalMember(owner = "client!u", name = "Db", descriptor = "[I")
	public static int[] anIntArray447 = new int[12];

	@OriginalMember(owner = "client!u", name = "Eb", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!u", name = "Fb", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[4096];

	@OriginalMember(owner = "client!u", name = "Hb", descriptor = "[I")
	public static int[] anIntArray448 = new int[4096];

	@OriginalMember(owner = "client!u", name = "Ib", descriptor = "[I")
	public static int[] anIntArray449 = new int[10];

	@OriginalMember(owner = "client!u", name = "Kb", descriptor = "[I")
	public static int[] anIntArray451 = new int[4096];

	@OriginalMember(owner = "client!u", name = "Lb", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!u", name = "Mb", descriptor = "[S")
	public static short[] aShortArray63 = new short[1];

	@OriginalMember(owner = "client!u", name = "Nb", descriptor = "[I")
	public static int[] anIntArray452 = new int[4096];

	@OriginalMember(owner = "client!u", name = "Ob", descriptor = "[I")
	public static int[] anIntArray453 = new int[4096];

	@OriginalMember(owner = "client!u", name = "Qb", descriptor = "[I")
	public static int[] anIntArray455 = new int[4096];

	@OriginalMember(owner = "client!u", name = "Rb", descriptor = "[I")
	public static int[] anIntArray456 = new int[1];

	@OriginalMember(owner = "client!u", name = "Sb", descriptor = "[I")
	public static int[] anIntArray457 = new int[4096];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	public static int method3966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	public static int method3969(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!u", name = "p", descriptor = "()V")
	public static void method3971() {
		aBoolean439 = true;
		Class36_Sub2_Sub2.anIntArray444 = new int[4096];
		Class36_Sub2_Sub2.anIntArray454 = new int[4096];
		Class36_Sub2_Sub2.anIntArray450 = null;
		Class36_Sub2_Sub2.anIntArrayArray40 = null;
		Class36_Sub2_Sub2.anIntArray437 = null;
		Class36_Sub2_Sub2.anIntArrayArray38 = null;
	}

	@OriginalMember(owner = "client!u", name = "q", descriptor = "()V")
	public static void method3974() {
		aBoolean439 = false;
		Class36_Sub2_Sub2.anIntArray444 = null;
		Class36_Sub2_Sub2.anIntArray454 = null;
		Class36_Sub2_Sub2.anIntArray450 = new int[1600];
		Class36_Sub2_Sub2.anIntArrayArray40 = new int[1600][64];
		Class36_Sub2_Sub2.anIntArray437 = new int[32];
		Class36_Sub2_Sub2.anIntArrayArray38 = new int[32][512];
	}
}
