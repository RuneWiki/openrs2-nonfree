import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!le", name = "pb", descriptor = "I")
	public static int anInt2634;

	@OriginalMember(owner = "client!le", name = "rb", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!le", name = "tb", descriptor = "I")
	public static int anInt2636;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "Lclient!le;")
	public static Class12_Sub2_Sub1 aClass12_Sub2_Sub1_1 = new Class12_Sub2_Sub1();

	@OriginalMember(owner = "client!le", name = "L", descriptor = "[B")
	public static byte[] aByteArray38 = new byte[1];

	@OriginalMember(owner = "client!le", name = "P", descriptor = "Lclient!le;")
	public static Class12_Sub2_Sub1 aClass12_Sub2_Sub1_2 = new Class12_Sub2_Sub1();

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "[I")
	public static int[] anIntArray279 = new int[4096];

	@OriginalMember(owner = "client!le", name = "Z", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[4096];

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "[I")
	public static int[] anIntArray280 = new int[4096];

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[12][4096];

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "[I")
	public static int[] anIntArray281 = new int[4096];

	@OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
	public static int[] anIntArray282 = new int[1600];

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "[I")
	public static int[] anIntArray283 = new int[4096];

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "[I")
	public static int[] anIntArray284 = new int[12];

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[1600][512];

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "[I")
	public static int[] anIntArray285 = new int[4096];

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "[I")
	public static int[] anIntArray286 = new int[10];

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "[I")
	public static int[] anIntArray287 = new int[4096];

	@OriginalMember(owner = "client!le", name = "kb", descriptor = "[I")
	public static int[] anIntArray288 = new int[12];

	@OriginalMember(owner = "client!le", name = "lb", descriptor = "[I")
	public static int[] anIntArray289 = new int[10];

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "[I")
	public static int[] anIntArray290 = new int[4096];

	@OriginalMember(owner = "client!le", name = "nb", descriptor = "[I")
	public static int[] anIntArray291 = new int[4096];

	@OriginalMember(owner = "client!le", name = "ob", descriptor = "[I")
	public static int[] anIntArray292 = new int[10];

	@OriginalMember(owner = "client!le", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[4096];

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "[B")
	public static byte[] aByteArray39 = new byte[1];

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(I)I")
	public static int method1872(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
	public static int method1873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
