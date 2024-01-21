import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
	public static int anInt3728;

	@OriginalMember(owner = "client!uc", name = "Sb", descriptor = "I")
	public static int anInt3729;

	@OriginalMember(owner = "client!uc", name = "Ub", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!uc", name = "zb", descriptor = "Lclient!uc;")
	public static final Class4_Sub1_Sub1_Sub4_Sub1 aClass4_Sub1_Sub1_Sub4_Sub1_1 = new Class4_Sub1_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!uc", name = "Ab", descriptor = "Lclient!uc;")
	public static final Class4_Sub1_Sub1_Sub4_Sub1 aClass4_Sub1_Sub1_Sub4_Sub1_2 = new Class4_Sub1_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!uc", name = "Bb", descriptor = "[B")
	public static byte[] aByteArray46 = new byte[1];

	@OriginalMember(owner = "client!uc", name = "Cb", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[12][4096];

	@OriginalMember(owner = "client!uc", name = "Db", descriptor = "[I")
	public static final int[] anIntArray384 = new int[10];

	@OriginalMember(owner = "client!uc", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray385 = new int[12];

	@OriginalMember(owner = "client!uc", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray386 = Class4_Sub1_Sub7_Sub4.anIntArray416;

	@OriginalMember(owner = "client!uc", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray387 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray388 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Jb", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[4096];

	@OriginalMember(owner = "client!uc", name = "Kb", descriptor = "[I")
	public static final int[] anIntArray390 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray391 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Mb", descriptor = "[B")
	public static byte[] aByteArray47 = new byte[1];

	@OriginalMember(owner = "client!uc", name = "Nb", descriptor = "[I")
	public static final int[] anIntArray392 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Ob", descriptor = "[I")
	public static final int[] anIntArray393 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray394 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray395 = new int[4096];

	@OriginalMember(owner = "client!uc", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray396 = new int[10];

	@OriginalMember(owner = "client!uc", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray397 = new int[10];

	@OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[I")
	public static final int[] anIntArray398 = new int[12];

	@OriginalMember(owner = "client!uc", name = "Xb", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[1600][512];

	@OriginalMember(owner = "client!uc", name = "Yb", descriptor = "[I")
	public static final int[] anIntArray399 = Class4_Sub1_Sub7_Sub4.anIntArray415;

	@OriginalMember(owner = "client!uc", name = "Zb", descriptor = "[I")
	public static final int[] anIntArray400 = Class4_Sub1_Sub7_Sub4.anIntArray412;

	@OriginalMember(owner = "client!uc", name = "ac", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[4096];

	@OriginalMember(owner = "client!uc", name = "bc", descriptor = "[I")
	public static final int[] anIntArray401 = new int[1600];

	@OriginalMember(owner = "client!uc", name = "cc", descriptor = "[I")
	public static final int[] anIntArray402 = Static171.anIntArray413;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
	public static int method2844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)I")
	public static int method2846(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
