import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!da", name = "dc", descriptor = "I")
	public static int anInt864;

	@OriginalMember(owner = "client!da", name = "fc", descriptor = "I")
	public static int anInt865;

	@OriginalMember(owner = "client!da", name = "wc", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!da", name = "Jb", descriptor = "Lclient!da;")
	public static Class2_Sub2_Sub1_Sub2_Sub1 aClass2_Sub2_Sub1_Sub2_Sub1_1 = new Class2_Sub2_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!da", name = "Rb", descriptor = "[B")
	public static byte[] aByteArray5 = new byte[1];

	@OriginalMember(owner = "client!da", name = "Xb", descriptor = "Lclient!da;")
	public static Class2_Sub2_Sub1_Sub2_Sub1 aClass2_Sub2_Sub1_Sub2_Sub1_2 = new Class2_Sub2_Sub1_Sub2_Sub1();

	@OriginalMember(owner = "client!da", name = "Yb", descriptor = "[I")
	public static int[] anIntArray123 = new int[4096];

	@OriginalMember(owner = "client!da", name = "Zb", descriptor = "[I")
	public static int[] anIntArray124 = new int[12];

	@OriginalMember(owner = "client!da", name = "ac", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[4096];

	@OriginalMember(owner = "client!da", name = "bc", descriptor = "[I")
	public static int[] anIntArray125 = Class2_Sub2_Sub3_Sub1.anIntArray54;

	@OriginalMember(owner = "client!da", name = "cc", descriptor = "[I")
	public static int[] anIntArray126 = new int[10];

	@OriginalMember(owner = "client!da", name = "ec", descriptor = "[I")
	public static int[] anIntArray127 = Static12.anIntArray53;

	@OriginalMember(owner = "client!da", name = "gc", descriptor = "[I")
	public static int[] anIntArray128 = new int[10];

	@OriginalMember(owner = "client!da", name = "hc", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[1];

	@OriginalMember(owner = "client!da", name = "ic", descriptor = "[I")
	public static int[] anIntArray129 = new int[4096];

	@OriginalMember(owner = "client!da", name = "jc", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[4096];

	@OriginalMember(owner = "client!da", name = "kc", descriptor = "[I")
	public static int[] anIntArray130 = new int[4096];

	@OriginalMember(owner = "client!da", name = "lc", descriptor = "[I")
	public static int[] anIntArray131 = new int[1600];

	@OriginalMember(owner = "client!da", name = "mc", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[1600][512];

	@OriginalMember(owner = "client!da", name = "nc", descriptor = "[I")
	public static int[] anIntArray132 = Class2_Sub2_Sub3_Sub1.anIntArray50;

	@OriginalMember(owner = "client!da", name = "oc", descriptor = "[I")
	public static int[] anIntArray133 = new int[4096];

	@OriginalMember(owner = "client!da", name = "pc", descriptor = "[I")
	public static int[] anIntArray134 = new int[10];

	@OriginalMember(owner = "client!da", name = "qc", descriptor = "[I")
	public static int[] anIntArray135 = new int[4096];

	@OriginalMember(owner = "client!da", name = "rc", descriptor = "[I")
	public static int[] anIntArray136 = new int[2000];

	@OriginalMember(owner = "client!da", name = "sc", descriptor = "[I")
	public static int[] anIntArray137 = new int[2000];

	@OriginalMember(owner = "client!da", name = "tc", descriptor = "[I")
	public static int[] anIntArray138 = new int[12];

	@OriginalMember(owner = "client!da", name = "uc", descriptor = "[I")
	public static int[] anIntArray139 = new int[4096];

	@OriginalMember(owner = "client!da", name = "vc", descriptor = "[I")
	public static int[] anIntArray140 = Class2_Sub2_Sub3_Sub1.anIntArray52;

	@OriginalMember(owner = "client!da", name = "xc", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[12][2000];

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
	public static int method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
	public static void method602() {
		aClass2_Sub2_Sub1_Sub2_Sub1_1 = null;
		aByteArray5 = null;
		aClass2_Sub2_Sub1_Sub2_Sub1_2 = null;
		aByteArray7 = null;
		aBooleanArray3 = null;
		aBooleanArray2 = null;
		anIntArray135 = null;
		anIntArray133 = null;
		anIntArray123 = null;
		anIntArray130 = null;
		anIntArray139 = null;
		anIntArray129 = null;
		anIntArray131 = null;
		anIntArrayArray7 = null;
		anIntArray138 = null;
		anIntArrayArray8 = null;
		anIntArray137 = null;
		anIntArray136 = null;
		anIntArray124 = null;
		anIntArray128 = null;
		anIntArray134 = null;
		anIntArray126 = null;
		anIntArray132 = null;
		anIntArray140 = null;
		anIntArray127 = null;
		anIntArray125 = null;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(I)I")
	public static int method604(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
