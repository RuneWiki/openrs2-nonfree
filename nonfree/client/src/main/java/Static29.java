import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!ci", name = "bc", descriptor = "I")
	public static int anInt921;

	@OriginalMember(owner = "client!ci", name = "dc", descriptor = "I")
	public static int anInt922;

	@OriginalMember(owner = "client!ci", name = "fc", descriptor = "I")
	public static int anInt923;

	@OriginalMember(owner = "client!ci", name = "rb", descriptor = "Lclient!ci;")
	public static Class1_Sub1_Sub4_Sub1_Sub1 aClass1_Sub1_Sub4_Sub1_Sub1_1 = new Class1_Sub1_Sub4_Sub1_Sub1();

	@OriginalMember(owner = "client!ci", name = "Ab", descriptor = "Lclient!ci;")
	public static Class1_Sub1_Sub4_Sub1_Sub1 aClass1_Sub1_Sub4_Sub1_Sub1_2 = new Class1_Sub1_Sub4_Sub1_Sub1();

	@OriginalMember(owner = "client!ci", name = "Cb", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[1];

	@OriginalMember(owner = "client!ci", name = "Gb", descriptor = "[I")
	public static int[] anIntArray79 = Class1_Sub1_Sub1_Sub1.anIntArray11;

	@OriginalMember(owner = "client!ci", name = "Hb", descriptor = "[I")
	public static int[] anIntArray80 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "Ib", descriptor = "[I")
	public static int[] anIntArray81 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "Jb", descriptor = "[I")
	public static int[] anIntArray82 = new int[2000];

	@OriginalMember(owner = "client!ci", name = "Kb", descriptor = "[I")
	public static int[] anIntArray83 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "Lb", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[1600][512];

	@OriginalMember(owner = "client!ci", name = "Mb", descriptor = "[I")
	public static int[] anIntArray84 = Class1_Sub1_Sub1_Sub1.anIntArray8;

	@OriginalMember(owner = "client!ci", name = "Nb", descriptor = "[I")
	public static int[] anIntArray85 = Static1.anIntArray9;

	@OriginalMember(owner = "client!ci", name = "Ob", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[4096];

	@OriginalMember(owner = "client!ci", name = "Pb", descriptor = "[I")
	public static int[] anIntArray86 = new int[1600];

	@OriginalMember(owner = "client!ci", name = "Qb", descriptor = "[I")
	public static int[] anIntArray87 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "Rb", descriptor = "[I")
	public static int[] anIntArray88 = new int[12];

	@OriginalMember(owner = "client!ci", name = "Sb", descriptor = "[I")
	public static int[] anIntArray89 = new int[12];

	@OriginalMember(owner = "client!ci", name = "Ub", descriptor = "[I")
	public static int[] anIntArray90 = new int[10];

	@OriginalMember(owner = "client!ci", name = "Vb", descriptor = "[I")
	public static int[] anIntArray91 = new int[2000];

	@OriginalMember(owner = "client!ci", name = "Wb", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[12][2000];

	@OriginalMember(owner = "client!ci", name = "Yb", descriptor = "[I")
	public static int[] anIntArray93 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "Zb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[4096];

	@OriginalMember(owner = "client!ci", name = "ac", descriptor = "[I")
	public static int[] anIntArray94 = new int[4096];

	@OriginalMember(owner = "client!ci", name = "cc", descriptor = "[B")
	public static byte[] aByteArray12 = new byte[1];

	@OriginalMember(owner = "client!ci", name = "ec", descriptor = "[I")
	public static int[] anIntArray95 = new int[10];

	@OriginalMember(owner = "client!ci", name = "gc", descriptor = "[I")
	public static int[] anIntArray96 = new int[10];

	@OriginalMember(owner = "client!ci", name = "hc", descriptor = "[I")
	public static int[] anIntArray97 = Class1_Sub1_Sub1_Sub1.anIntArray6;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "()V")
	public static void method735() {
		aClass1_Sub1_Sub4_Sub1_Sub1_1 = null;
		aByteArray9 = null;
		aClass1_Sub1_Sub4_Sub1_Sub1_2 = null;
		aByteArray12 = null;
		aBooleanArray6 = null;
		aBooleanArray7 = null;
		anIntArray83 = null;
		anIntArray81 = null;
		anIntArray87 = null;
		anIntArray94 = null;
		anIntArray80 = null;
		anIntArray93 = null;
		anIntArray86 = null;
		anIntArrayArray8 = null;
		anIntArray88 = null;
		anIntArrayArray9 = null;
		anIntArray91 = null;
		anIntArray82 = null;
		anIntArray89 = null;
		anIntArray96 = null;
		anIntArray95 = null;
		anIntArray90 = null;
		anIntArray79 = null;
		anIntArray84 = null;
		anIntArray85 = null;
		anIntArray97 = null;
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)I")
	public static int method740(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I")
	public static int method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
