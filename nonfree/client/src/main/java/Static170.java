import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static170 {

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
	public static int anInt3823;

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
	public static int anInt3824;

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "Lclient!ra;")
	public static Class5_Sub2_Sub1 aClass5_Sub2_Sub1_1 = new Class5_Sub2_Sub1();

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "[B")
	public static byte[] aByteArray39 = new byte[1];

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!ra;")
	public static Class5_Sub2_Sub1 aClass5_Sub2_Sub1_2 = new Class5_Sub2_Sub1();

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "[I")
	public static int[] anIntArray260 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "[I")
	public static int[] anIntArray261 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[12][4096];

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "[I")
	public static int[] anIntArray262 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "[I")
	public static int[] anIntArray263 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "[I")
	public static int[] anIntArray264 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "[I")
	public static int[] anIntArray265 = new int[1600];

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "[I")
	public static int[] anIntArray266 = new int[10];

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "[I")
	public static int[] anIntArray267 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "[I")
	public static int[] anIntArray268 = new int[10];

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[1600][512];

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "[B")
	public static byte[] aByteArray40 = new byte[1];

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[4096];

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "[I")
	public static int[] anIntArray269 = new int[12];

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "[I")
	public static int[] anIntArray270 = new int[10];

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[4096];

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "[I")
	public static int[] anIntArray271 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "[I")
	public static int[] anIntArray272 = new int[4096];

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "[I")
	public static int[] anIntArray273 = new int[12];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	public static int method2936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)I")
	public static int method2942(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
