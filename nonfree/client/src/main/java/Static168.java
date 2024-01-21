import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
	public static int anInt3423;

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
	public static int anInt3424;

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "Lclient!rh;")
	public static final Class26_Sub6_Sub1 aClass26_Sub6_Sub1_1 = new Class26_Sub6_Sub1();

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "[B")
	public static byte[] aByteArray41 = new byte[1];

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "Lclient!rh;")
	public static final Class26_Sub6_Sub1 aClass26_Sub6_Sub1_2 = new Class26_Sub6_Sub1();

	@OriginalMember(owner = "client!rh", name = "W", descriptor = "[I")
	public static final int[] anIntArray268 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "[I")
	public static final int[] anIntArray269 = new int[10];

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "[B")
	public static byte[] aByteArray43 = new byte[1];

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[12][4096];

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
	public static final int[] anIntArray270 = new int[12];

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[4096];

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "[I")
	public static final int[] anIntArray271 = new int[10];

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "[I")
	public static final int[] anIntArray272 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "ib", descriptor = "[I")
	public static final int[] anIntArray273 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "[I")
	public static final int[] anIntArray274 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "kb", descriptor = "[I")
	public static final int[] anIntArray275 = new int[1600];

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[1600][512];

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "[I")
	public static final int[] anIntArray276 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "[I")
	public static final int[] anIntArray277 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "ob", descriptor = "[I")
	public static final int[] anIntArray278 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "[I")
	public static final int[] anIntArray279 = new int[12];

	@OriginalMember(owner = "client!rh", name = "qb", descriptor = "[I")
	public static final int[] anIntArray280 = new int[10];

	@OriginalMember(owner = "client!rh", name = "rb", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[4096];

	@OriginalMember(owner = "client!rh", name = "sb", descriptor = "[I")
	public static final int[] anIntArray281 = new int[4096];

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)I")
	public static int method2544(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	public static int method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
