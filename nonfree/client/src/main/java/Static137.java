import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
	public static int anInt2789;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
	public static int anInt2790;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
	public static int anInt2791;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!ob;")
	public static final Class8_Sub5_Sub1 aClass8_Sub5_Sub1_1 = new Class8_Sub5_Sub1();

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "Lclient!ob;")
	public static final Class8_Sub5_Sub1 aClass8_Sub5_Sub1_2 = new Class8_Sub5_Sub1();

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "[B")
	public static byte[] aByteArray40 = new byte[1];

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "[I")
	public static final int[] anIntArray237 = new int[10];

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "[I")
	public static final int[] anIntArray238 = new int[1600];

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "[I")
	public static final int[] anIntArray239 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
	public static final int[] anIntArray240 = new int[10];

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "[I")
	public static final int[] anIntArray241 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[4096];

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "[I")
	public static final int[] anIntArray242 = new int[10];

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "[I")
	public static final int[] anIntArray243 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "[B")
	public static byte[] aByteArray41 = new byte[1];

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "[I")
	public static final int[] anIntArray244 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "[I")
	public static final int[] anIntArray245 = new int[12];

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "[I")
	public static final int[] anIntArray246 = new int[12];

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "[I")
	public static final int[] anIntArray247 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "[I")
	public static final int[] anIntArray248 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "[I")
	public static final int[] anIntArray249 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "rb", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[12][4096];

	@OriginalMember(owner = "client!ob", name = "sb", descriptor = "[I")
	public static final int[] anIntArray250 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "tb", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[1600][512];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	public static int method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
	public static int method2062(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
