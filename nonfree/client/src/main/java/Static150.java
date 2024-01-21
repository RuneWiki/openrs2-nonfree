import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
	public static int anInt3498;

	@OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
	public static int anInt3499;

	@OriginalMember(owner = "client!sd", name = "Ob", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lclient!sd;")
	public static Class2_Sub3_Sub5_Sub7_Sub1 aClass2_Sub3_Sub5_Sub7_Sub1_1 = new Class2_Sub3_Sub5_Sub7_Sub1();

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "[B")
	public static byte[] aByteArray44 = new byte[1];

	@OriginalMember(owner = "client!sd", name = "yb", descriptor = "Lclient!sd;")
	public static Class2_Sub3_Sub5_Sub7_Sub1 aClass2_Sub3_Sub5_Sub7_Sub1_2 = new Class2_Sub3_Sub5_Sub7_Sub1();

	@OriginalMember(owner = "client!sd", name = "Ab", descriptor = "[I")
	public static int[] anIntArray329 = Class2_Sub3_Sub2_Sub2.anIntArray208;

	@OriginalMember(owner = "client!sd", name = "Bb", descriptor = "[I")
	public static int[] anIntArray330 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "Cb", descriptor = "[I")
	public static int[] anIntArray331 = new int[12];

	@OriginalMember(owner = "client!sd", name = "Db", descriptor = "[I")
	public static int[] anIntArray332 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "Eb", descriptor = "[I")
	public static int[] anIntArray333 = new int[1600];

	@OriginalMember(owner = "client!sd", name = "Fb", descriptor = "[I")
	public static int[] anIntArray334 = Static100.anIntArray209;

	@OriginalMember(owner = "client!sd", name = "Gb", descriptor = "[I")
	public static int[] anIntArray335 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "Hb", descriptor = "[I")
	public static int[] anIntArray336 = new int[10];

	@OriginalMember(owner = "client!sd", name = "Ib", descriptor = "[I")
	public static int[] anIntArray337 = new int[2000];

	@OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[I")
	public static int[] anIntArray338 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "Lb", descriptor = "[B")
	public static byte[] aByteArray45 = new byte[1];

	@OriginalMember(owner = "client!sd", name = "Mb", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[4096];

	@OriginalMember(owner = "client!sd", name = "Nb", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[4096];

	@OriginalMember(owner = "client!sd", name = "Pb", descriptor = "[I")
	public static int[] anIntArray339 = new int[12];

	@OriginalMember(owner = "client!sd", name = "Qb", descriptor = "[I")
	public static int[] anIntArray340 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "Rb", descriptor = "[[I")
	public static int[][] anIntArrayArray64 = new int[12][2000];

	@OriginalMember(owner = "client!sd", name = "Sb", descriptor = "[I")
	public static int[] anIntArray341 = new int[2000];

	@OriginalMember(owner = "client!sd", name = "Tb", descriptor = "[I")
	public static int[] anIntArray342 = new int[10];

	@OriginalMember(owner = "client!sd", name = "Ub", descriptor = "[I")
	public static int[] anIntArray343 = Class2_Sub3_Sub2_Sub2.anIntArray206;

	@OriginalMember(owner = "client!sd", name = "Vb", descriptor = "[I")
	public static int[] anIntArray344 = new int[10];

	@OriginalMember(owner = "client!sd", name = "Wb", descriptor = "[[I")
	public static int[][] anIntArrayArray65 = new int[1600][512];

	@OriginalMember(owner = "client!sd", name = "Xb", descriptor = "[I")
	public static int[] anIntArray345 = Class2_Sub3_Sub2_Sub2.anIntArray207;

	@OriginalMember(owner = "client!sd", name = "Yb", descriptor = "[I")
	public static int[] anIntArray346 = new int[4096];

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)I")
	public static int method2315(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "()V")
	public static void method2322() {
		aClass2_Sub3_Sub5_Sub7_Sub1_1 = null;
		aByteArray44 = null;
		aClass2_Sub3_Sub5_Sub7_Sub1_2 = null;
		aByteArray45 = null;
		aBooleanArray16 = null;
		aBooleanArray17 = null;
		anIntArray338 = null;
		anIntArray330 = null;
		anIntArray332 = null;
		anIntArray340 = null;
		anIntArray335 = null;
		anIntArray346 = null;
		anIntArray333 = null;
		anIntArrayArray65 = null;
		anIntArray331 = null;
		anIntArrayArray64 = null;
		anIntArray341 = null;
		anIntArray337 = null;
		anIntArray339 = null;
		anIntArray342 = null;
		anIntArray336 = null;
		anIntArray344 = null;
		anIntArray329 = null;
		anIntArray345 = null;
		anIntArray334 = null;
		anIntArray343 = null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
	public static int method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
