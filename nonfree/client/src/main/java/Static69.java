import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!h", name = "Pb", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!h", name = "Qb", descriptor = "I")
	public static int anInt1726;

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "Lclient!h;")
	public static final Class6_Sub3_Sub1 aClass6_Sub3_Sub1_1 = new Class6_Sub3_Sub1();

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "[B")
	public static byte[] aByteArray23 = new byte[1];

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lclient!h;")
	public static final Class6_Sub3_Sub1 aClass6_Sub3_Sub1_2 = new Class6_Sub3_Sub1();

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray177 = new int[10];

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "[I")
	public static final int[] anIntArray178 = new int[4096];

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray179 = new int[1600];

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "[I")
	public static final int[] anIntArray180 = new int[12];

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray181 = new int[4096];

	@OriginalMember(owner = "client!h", name = "Rb", descriptor = "[B")
	public static byte[] aByteArray24 = new byte[1];

	@OriginalMember(owner = "client!h", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray183 = new int[4096];

	@OriginalMember(owner = "client!h", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray184 = new int[4096];

	@OriginalMember(owner = "client!h", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray185 = new int[4096];

	@OriginalMember(owner = "client!h", name = "Wb", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[1600][512];

	@OriginalMember(owner = "client!h", name = "Xb", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[12][4096];

	@OriginalMember(owner = "client!h", name = "Yb", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!h", name = "Zb", descriptor = "[I")
	public static final int[] anIntArray186 = new int[10];

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "[I")
	public static final int[] anIntArray187 = new int[4096];

	@OriginalMember(owner = "client!h", name = "cc", descriptor = "[I")
	public static final int[] anIntArray188 = new int[4096];

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "[I")
	public static final int[] anIntArray189 = new int[4096];

	@OriginalMember(owner = "client!h", name = "ec", descriptor = "[I")
	public static final int[] anIntArray190 = new int[10];

	@OriginalMember(owner = "client!h", name = "fc", descriptor = "[I")
	public static final int[] anIntArray191 = new int[12];

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
	public static int method1188(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
	public static int method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
