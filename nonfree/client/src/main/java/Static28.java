import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
	public static int anInt552;

	@OriginalMember(owner = "client!ce", name = "tb", descriptor = "I")
	public static int anInt553;

	@OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
	public static int anInt554;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Lclient!ce;")
	public static Class5_Sub3_Sub1 aClass5_Sub3_Sub1_1 = new Class5_Sub3_Sub1();

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "Lclient!ce;")
	public static Class5_Sub3_Sub1 aClass5_Sub3_Sub1_2 = new Class5_Sub3_Sub1();

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "[B")
	public static byte[] aByteArray20 = new byte[1];

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[4096];

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[4096];

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "[B")
	public static byte[] aByteArray21 = new byte[1];

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "[I")
	public static int[] anIntArray60 = new int[10];

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
	public static int[] anIntArray61 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "[I")
	public static int[] anIntArray62 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "[I")
	public static int[] anIntArray63 = new int[10];

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "[I")
	public static int[] anIntArray64 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "kb", descriptor = "[I")
	public static int[] anIntArray65 = new int[10];

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "[I")
	public static int[] anIntArray66 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "nb", descriptor = "[I")
	public static int[] anIntArray67 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "ob", descriptor = "[I")
	public static int[] anIntArray68 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "pb", descriptor = "[I")
	public static int[] anIntArray69 = new int[12];

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[1600][512];

	@OriginalMember(owner = "client!ce", name = "rb", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[12][4096];

	@OriginalMember(owner = "client!ce", name = "sb", descriptor = "[I")
	public static int[] anIntArray70 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "vb", descriptor = "[I")
	public static int[] anIntArray71 = new int[12];

	@OriginalMember(owner = "client!ce", name = "wb", descriptor = "[I")
	public static int[] anIntArray72 = new int[4096];

	@OriginalMember(owner = "client!ce", name = "xb", descriptor = "[I")
	public static int[] anIntArray73 = new int[1600];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public static int method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)I")
	public static int method562(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
