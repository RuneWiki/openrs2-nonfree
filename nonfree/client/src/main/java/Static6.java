import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public static int anInt161;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
	public static int anInt163;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Lclient!ae;")
	public static final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1();

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "[B")
	public static byte[] aByteArray4 = new byte[1];

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "Lclient!ae;")
	public static final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_2 = new Class5_Sub1_Sub1();

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
	public static final int[] anIntArray18 = new int[10];

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "[I")
	public static final int[] anIntArray19 = new int[10];

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[I")
	public static final int[] anIntArray20 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "[I")
	public static final int[] anIntArray21 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "[I")
	public static final int[] anIntArray22 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "[I")
	public static final int[] anIntArray23 = new int[10];

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "[I")
	public static final int[] anIntArray24 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "[I")
	public static final int[] anIntArray25 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	public static final int[] anIntArray26 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "[I")
	public static final int[] anIntArray27 = new int[1600];

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "[I")
	public static final int[] anIntArray28 = new int[12];

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[4096];

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "[B")
	public static byte[] aByteArray5 = new byte[1];

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "[I")
	public static final int[] anIntArray29 = new int[12];

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	public static final int[] anIntArray30 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[12][4096];

	@OriginalMember(owner = "client!ae", name = "nb", descriptor = "[I")
	public static final int[] anIntArray31 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "ob", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[1600][512];

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[4096];

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)I")
	public static int method174(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
