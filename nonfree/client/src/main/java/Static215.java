import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!wh", name = "cb", descriptor = "I")
	public static int anInt4494;

	@OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
	public static int anInt4495;

	@OriginalMember(owner = "client!wh", name = "qb", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "Lclient!wh;")
	public static final Class7_Sub7_Sub1 aClass7_Sub7_Sub1_1 = new Class7_Sub7_Sub1();

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "[B")
	public static byte[] aByteArray55 = new byte[1];

	@OriginalMember(owner = "client!wh", name = "ab", descriptor = "Lclient!wh;")
	public static final Class7_Sub7_Sub1 aClass7_Sub7_Sub1_2 = new Class7_Sub7_Sub1();

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[4096];

	@OriginalMember(owner = "client!wh", name = "db", descriptor = "[I")
	public static final int[] anIntArray414 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "eb", descriptor = "[I")
	public static final int[] anIntArray415 = new int[12];

	@OriginalMember(owner = "client!wh", name = "gb", descriptor = "[I")
	public static final int[] anIntArray416 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "[I")
	public static final int[] anIntArray417 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "[I")
	public static final int[] anIntArray418 = new int[10];

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[4096];

	@OriginalMember(owner = "client!wh", name = "kb", descriptor = "[I")
	public static final int[] anIntArray419 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "mb", descriptor = "[I")
	public static final int[] anIntArray421 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "nb", descriptor = "[I")
	public static final int[] anIntArray422 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "ob", descriptor = "[I")
	public static final int[] anIntArray423 = new int[1600];

	@OriginalMember(owner = "client!wh", name = "pb", descriptor = "[I")
	public static final int[] anIntArray424 = new int[12];

	@OriginalMember(owner = "client!wh", name = "rb", descriptor = "[I")
	public static final int[] anIntArray425 = new int[10];

	@OriginalMember(owner = "client!wh", name = "sb", descriptor = "[I")
	public static final int[] anIntArray426 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "tb", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[12][4096];

	@OriginalMember(owner = "client!wh", name = "ub", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[1600][512];

	@OriginalMember(owner = "client!wh", name = "vb", descriptor = "[I")
	public static final int[] anIntArray427 = new int[4096];

	@OriginalMember(owner = "client!wh", name = "wb", descriptor = "[B")
	public static byte[] aByteArray56 = new byte[1];

	@OriginalMember(owner = "client!wh", name = "xb", descriptor = "[I")
	public static final int[] anIntArray428 = new int[10];

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)I")
	public static int method3172(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public static int method3175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
