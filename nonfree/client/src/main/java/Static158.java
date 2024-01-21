import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!sg", name = "Ub", descriptor = "I")
	public static int anInt3753;

	@OriginalMember(owner = "client!sg", name = "Wb", descriptor = "I")
	public static int anInt3754;

	@OriginalMember(owner = "client!sg", name = "jc", descriptor = "I")
	public static int anInt3755;

	@OriginalMember(owner = "client!sg", name = "Ab", descriptor = "Lclient!sg;")
	public static Class1_Sub2_Sub2_Sub5_Sub1 aClass1_Sub2_Sub2_Sub5_Sub1_1 = new Class1_Sub2_Sub2_Sub5_Sub1();

	@OriginalMember(owner = "client!sg", name = "Jb", descriptor = "[B")
	public static byte[] aByteArray40 = new byte[1];

	@OriginalMember(owner = "client!sg", name = "Lb", descriptor = "Lclient!sg;")
	public static Class1_Sub2_Sub2_Sub5_Sub1 aClass1_Sub2_Sub2_Sub5_Sub1_2 = new Class1_Sub2_Sub2_Sub5_Sub1();

	@OriginalMember(owner = "client!sg", name = "Nb", descriptor = "[I")
	public static int[] anIntArray407 = new int[1600];

	@OriginalMember(owner = "client!sg", name = "Ob", descriptor = "[I")
	public static int[] anIntArray408 = Class1_Sub2_Sub1_Sub2.anIntArray41;

	@OriginalMember(owner = "client!sg", name = "Pb", descriptor = "[I")
	public static int[] anIntArray409 = new int[12];

	@OriginalMember(owner = "client!sg", name = "Qb", descriptor = "[I")
	public static int[] anIntArray410 = Class1_Sub2_Sub1_Sub2.anIntArray37;

	@OriginalMember(owner = "client!sg", name = "Rb", descriptor = "[I")
	public static int[] anIntArray411 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "Sb", descriptor = "[I")
	public static int[] anIntArray412 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "Tb", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[1600][512];

	@OriginalMember(owner = "client!sg", name = "Vb", descriptor = "[I")
	public static int[] anIntArray413 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "Xb", descriptor = "[I")
	public static int[] anIntArray414 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "Yb", descriptor = "[I")
	public static int[] anIntArray415 = new int[10];

	@OriginalMember(owner = "client!sg", name = "Zb", descriptor = "[I")
	public static int[] anIntArray416 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "ac", descriptor = "[B")
	public static byte[] aByteArray42 = new byte[1];

	@OriginalMember(owner = "client!sg", name = "bc", descriptor = "[I")
	public static int[] anIntArray417 = Static9.anIntArray39;

	@OriginalMember(owner = "client!sg", name = "cc", descriptor = "[I")
	public static int[] anIntArray418 = Class1_Sub2_Sub1_Sub2.anIntArray38;

	@OriginalMember(owner = "client!sg", name = "dc", descriptor = "[Z")
	public static boolean[] aBooleanArray49 = new boolean[4096];

	@OriginalMember(owner = "client!sg", name = "ec", descriptor = "[I")
	public static int[] anIntArray419 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "fc", descriptor = "[I")
	public static int[] anIntArray420 = new int[12];

	@OriginalMember(owner = "client!sg", name = "gc", descriptor = "[I")
	public static int[] anIntArray421 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "hc", descriptor = "[I")
	public static int[] anIntArray422 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "ic", descriptor = "[I")
	public static int[] anIntArray423 = new int[10];

	@OriginalMember(owner = "client!sg", name = "kc", descriptor = "[Z")
	public static boolean[] aBooleanArray50 = new boolean[4096];

	@OriginalMember(owner = "client!sg", name = "lc", descriptor = "[I")
	public static int[] anIntArray424 = new int[10];

	@OriginalMember(owner = "client!sg", name = "mc", descriptor = "[[I")
	public static int[][] anIntArrayArray35 = new int[12][4096];

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
	public static int method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "()V")
	public static void method2730() {
		aClass1_Sub2_Sub2_Sub5_Sub1_1 = null;
		aByteArray40 = null;
		aClass1_Sub2_Sub2_Sub5_Sub1_2 = null;
		aByteArray42 = null;
		aBooleanArray50 = null;
		aBooleanArray49 = null;
		anIntArray413 = null;
		anIntArray421 = null;
		anIntArray412 = null;
		anIntArray419 = null;
		anIntArray422 = null;
		anIntArray411 = null;
		anIntArray407 = null;
		anIntArrayArray34 = null;
		anIntArray409 = null;
		anIntArrayArray35 = null;
		anIntArray416 = null;
		anIntArray414 = null;
		anIntArray420 = null;
		anIntArray415 = null;
		anIntArray424 = null;
		anIntArray423 = null;
		anIntArray408 = null;
		anIntArray418 = null;
		anIntArray417 = null;
		anIntArray410 = null;
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)I")
	public static int method2734(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
