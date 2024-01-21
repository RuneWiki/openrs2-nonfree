import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
	public static int anInt220;

	@OriginalMember(owner = "client!af", name = "ec", descriptor = "I")
	public static int anInt221;

	@OriginalMember(owner = "client!af", name = "fc", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "Lclient!af;")
	public static Class3_Sub2_Sub1_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_Sub1_1 = new Class3_Sub2_Sub1_Sub1_Sub1();

	@OriginalMember(owner = "client!af", name = "Gb", descriptor = "Lclient!af;")
	public static Class3_Sub2_Sub1_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_Sub1_2 = new Class3_Sub2_Sub1_Sub1_Sub1();

	@OriginalMember(owner = "client!af", name = "Hb", descriptor = "[B")
	public static byte[] aByteArray4 = new byte[1];

	@OriginalMember(owner = "client!af", name = "Ib", descriptor = "[I")
	public static int[] anIntArray66 = new int[10];

	@OriginalMember(owner = "client!af", name = "Jb", descriptor = "[I")
	public static int[] anIntArray67 = new int[10];

	@OriginalMember(owner = "client!af", name = "Kb", descriptor = "[I")
	public static int[] anIntArray68 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Lb", descriptor = "[I")
	public static int[] anIntArray69 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Mb", descriptor = "[I")
	public static int[] anIntArray70 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Nb", descriptor = "[I")
	public static int[] anIntArray71 = new int[2000];

	@OriginalMember(owner = "client!af", name = "Ob", descriptor = "[I")
	public static int[] anIntArray72 = Class3_Sub2_Sub2_Sub2.anIntArray127;

	@OriginalMember(owner = "client!af", name = "Pb", descriptor = "[I")
	public static int[] anIntArray73 = new int[1600];

	@OriginalMember(owner = "client!af", name = "Qb", descriptor = "[I")
	public static int[] anIntArray74 = Class3_Sub2_Sub2_Sub2.anIntArray131;

	@OriginalMember(owner = "client!af", name = "Rb", descriptor = "[I")
	public static int[] anIntArray75 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Sb", descriptor = "[I")
	public static int[] anIntArray76 = Static13.anIntArray128;

	@OriginalMember(owner = "client!af", name = "Tb", descriptor = "[I")
	public static int[] anIntArray77 = new int[2000];

	@OriginalMember(owner = "client!af", name = "Ub", descriptor = "[[I")
	public static int[][] anIntArrayArray6 = new int[12][2000];

	@OriginalMember(owner = "client!af", name = "Vb", descriptor = "[I")
	public static int[] anIntArray78 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Xb", descriptor = "[I")
	public static int[] anIntArray79 = new int[12];

	@OriginalMember(owner = "client!af", name = "Yb", descriptor = "[I")
	public static int[] anIntArray80 = new int[4096];

	@OriginalMember(owner = "client!af", name = "Zb", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[1600][512];

	@OriginalMember(owner = "client!af", name = "ac", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[4096];

	@OriginalMember(owner = "client!af", name = "bc", descriptor = "[I")
	public static int[] anIntArray81 = new int[10];

	@OriginalMember(owner = "client!af", name = "cc", descriptor = "[I")
	public static int[] anIntArray82 = Class3_Sub2_Sub2_Sub2.anIntArray129;

	@OriginalMember(owner = "client!af", name = "dc", descriptor = "[B")
	public static byte[] aByteArray5 = new byte[1];

	@OriginalMember(owner = "client!af", name = "gc", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[4096];

	@OriginalMember(owner = "client!af", name = "hc", descriptor = "[I")
	public static int[] anIntArray83 = new int[12];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	public static int method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!af", name = "j", descriptor = "(I)I")
	public static int method213(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "()V")
	public static void method214() {
		aClass3_Sub2_Sub1_Sub1_Sub1_1 = null;
		aByteArray4 = null;
		aClass3_Sub2_Sub1_Sub1_Sub1_2 = null;
		aByteArray5 = null;
		aBooleanArray1 = null;
		aBooleanArray2 = null;
		anIntArray69 = null;
		anIntArray68 = null;
		anIntArray70 = null;
		anIntArray78 = null;
		anIntArray75 = null;
		anIntArray80 = null;
		anIntArray73 = null;
		anIntArrayArray7 = null;
		anIntArray79 = null;
		anIntArrayArray6 = null;
		anIntArray77 = null;
		anIntArray71 = null;
		anIntArray83 = null;
		anIntArray81 = null;
		anIntArray66 = null;
		anIntArray67 = null;
		anIntArray72 = null;
		anIntArray82 = null;
		anIntArray76 = null;
		anIntArray74 = null;
	}
}
