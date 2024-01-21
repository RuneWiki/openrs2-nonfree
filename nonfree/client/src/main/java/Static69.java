import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!he", name = "zb", descriptor = "I")
	public static int anInt2131;

	@OriginalMember(owner = "client!he", name = "Cb", descriptor = "I")
	public static int anInt2132;

	@OriginalMember(owner = "client!he", name = "Kb", descriptor = "I")
	public static int anInt2133;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Lclient!he;")
	public static final Class2_Sub1_Sub1_Sub4_Sub1 aClass2_Sub1_Sub1_Sub4_Sub1_1 = new Class2_Sub1_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!he", name = "vb", descriptor = "Lclient!he;")
	public static final Class2_Sub1_Sub1_Sub4_Sub1 aClass2_Sub1_Sub1_Sub4_Sub1_2 = new Class2_Sub1_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!he", name = "wb", descriptor = "[B")
	public static byte[] aByteArray26 = new byte[1];

	@OriginalMember(owner = "client!he", name = "xb", descriptor = "[I")
	public static final int[] anIntArray225 = new int[1600];

	@OriginalMember(owner = "client!he", name = "yb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[10];

	@OriginalMember(owner = "client!he", name = "Ab", descriptor = "[I")
	public static final int[] anIntArray227 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[1600][512];

	@OriginalMember(owner = "client!he", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray228 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray229 = new int[10];

	@OriginalMember(owner = "client!he", name = "Gb", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!he", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray230 = new int[12];

	@OriginalMember(owner = "client!he", name = "Ib", descriptor = "[I")
	public static final int[] anIntArray231 = new int[10];

	@OriginalMember(owner = "client!he", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray232 = new int[12];

	@OriginalMember(owner = "client!he", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray233 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Mb", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[12][4096];

	@OriginalMember(owner = "client!he", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray234 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Ob", descriptor = "[I")
	public static final int[] anIntArray235 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Pb", descriptor = "[B")
	public static byte[] aByteArray27 = new byte[1];

	@OriginalMember(owner = "client!he", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray236 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray237 = new int[4096];

	@OriginalMember(owner = "client!he", name = "Sb", descriptor = "[I")
	public static final int[] anIntArray238 = new int[4096];

	@OriginalMember(owner = "client!he", name = "i", descriptor = "(I)I")
	public static int method1628(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I")
	public static int method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
