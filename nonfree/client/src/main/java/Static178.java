import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
	public static int anInt3634;

	@OriginalMember(owner = "client!si", name = "pb", descriptor = "I")
	public static int anInt3635;

	@OriginalMember(owner = "client!si", name = "qb", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "Lclient!si;")
	public static final Class24_Sub3_Sub1 aClass24_Sub3_Sub1_1 = new Class24_Sub3_Sub1();

	@OriginalMember(owner = "client!si", name = "V", descriptor = "Lclient!si;")
	public static final Class24_Sub3_Sub1 aClass24_Sub3_Sub1_2 = new Class24_Sub3_Sub1();

	@OriginalMember(owner = "client!si", name = "W", descriptor = "[B")
	public static byte[] aByteArray43 = new byte[1];

	@OriginalMember(owner = "client!si", name = "X", descriptor = "[I")
	public static final int[] anIntArray341 = new int[4096];

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "[I")
	public static final int[] anIntArray342 = new int[4096];

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[4096];

	@OriginalMember(owner = "client!si", name = "bb", descriptor = "[I")
	public static final int[] anIntArray343 = new int[4096];

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[12][4096];

	@OriginalMember(owner = "client!si", name = "db", descriptor = "[I")
	public static final int[] anIntArray344 = new int[4096];

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "[I")
	public static final int[] anIntArray345 = new int[4096];

	@OriginalMember(owner = "client!si", name = "fb", descriptor = "[I")
	public static final int[] anIntArray346 = new int[10];

	@OriginalMember(owner = "client!si", name = "gb", descriptor = "[I")
	public static final int[] anIntArray347 = new int[10];

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[1600][512];

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "[I")
	public static final int[] anIntArray348 = new int[10];

	@OriginalMember(owner = "client!si", name = "jb", descriptor = "[I")
	public static final int[] anIntArray349 = new int[12];

	@OriginalMember(owner = "client!si", name = "kb", descriptor = "[I")
	public static final int[] anIntArray350 = new int[4096];

	@OriginalMember(owner = "client!si", name = "lb", descriptor = "[I")
	public static final int[] anIntArray351 = new int[12];

	@OriginalMember(owner = "client!si", name = "mb", descriptor = "[I")
	public static final int[] anIntArray352 = new int[1600];

	@OriginalMember(owner = "client!si", name = "nb", descriptor = "[I")
	public static final int[] anIntArray353 = new int[4096];

	@OriginalMember(owner = "client!si", name = "ob", descriptor = "[B")
	public static byte[] aByteArray44 = new byte[1];

	@OriginalMember(owner = "client!si", name = "rb", descriptor = "[I")
	public static final int[] anIntArray354 = new int[4096];

	@OriginalMember(owner = "client!si", name = "sb", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[4096];

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)I")
	public static int method2748(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	public static int method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
