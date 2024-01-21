import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
	public static int anInt841;

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
	public static int anInt842;

	@OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
	public static int anInt843;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "Lclient!dh;")
	public static final Class1_Sub1_Sub1 aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1();

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "Lclient!dh;")
	public static final Class1_Sub1_Sub1 aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1();

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "[B")
	public static byte[] aByteArray14 = new byte[1];

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[12][4096];

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "[I")
	public static final int[] anIntArray61 = new int[12];

	@OriginalMember(owner = "client!dh", name = "db", descriptor = "[I")
	public static final int[] anIntArray62 = new int[10];

	@OriginalMember(owner = "client!dh", name = "eb", descriptor = "[I")
	public static final int[] anIntArray63 = new int[1600];

	@OriginalMember(owner = "client!dh", name = "fb", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!dh", name = "gb", descriptor = "[I")
	public static final int[] anIntArray64 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "hb", descriptor = "[I")
	public static final int[] anIntArray65 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "jb", descriptor = "[I")
	public static final int[] anIntArray66 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "kb", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!dh", name = "lb", descriptor = "[I")
	public static final int[] anIntArray67 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "mb", descriptor = "[I")
	public static final int[] anIntArray68 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "nb", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[1600][512];

	@OriginalMember(owner = "client!dh", name = "ob", descriptor = "[I")
	public static final int[] anIntArray69 = new int[10];

	@OriginalMember(owner = "client!dh", name = "pb", descriptor = "[I")
	public static final int[] anIntArray70 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "qb", descriptor = "[I")
	public static final int[] anIntArray71 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "rb", descriptor = "[I")
	public static final int[] anIntArray72 = new int[10];

	@OriginalMember(owner = "client!dh", name = "sb", descriptor = "[I")
	public static final int[] anIntArray73 = new int[4096];

	@OriginalMember(owner = "client!dh", name = "tb", descriptor = "[I")
	public static final int[] anIntArray74 = new int[12];

	@OriginalMember(owner = "client!dh", name = "ub", descriptor = "[B")
	public static byte[] aByteArray15 = new byte[1];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public static int method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)I")
	public static int method682(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
