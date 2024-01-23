import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!c;")
	public static Class6_Sub2_Sub1 aClass6_Sub2_Sub1_1 = new Class6_Sub2_Sub1();

	@OriginalMember(owner = "client!c", name = "U", descriptor = "[I")
	public static int[] anIntArray80 = new int[1];

	@OriginalMember(owner = "client!c", name = "W", descriptor = "[I")
	public static int[] anIntArray82 = new int[1];

	@OriginalMember(owner = "client!c", name = "X", descriptor = "[I")
	public static int[] anIntArray83 = new int[1];

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "[S")
	public static short[] aShortArray11 = new short[1];

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "[B")
	public static byte[] aByteArray10 = new byte[1];

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "Lclient!c;")
	public static Class6_Sub2_Sub1 aClass6_Sub2_Sub1_2 = new Class6_Sub2_Sub1();

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "Lclient!c;")
	public static Class6_Sub2_Sub1 aClass6_Sub2_Sub1_3 = new Class6_Sub2_Sub1();

	@OriginalMember(owner = "client!c", name = "db", descriptor = "[I")
	public static int[] anIntArray84 = new int[1];

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "[I")
	public static int[] anIntArray85 = new int[1];

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "[S")
	public static short[] aShortArray13 = new short[1];

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[1];

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "[I")
	public static int[] anIntArray86 = new int[1];

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "[S")
	public static short[] aShortArray14 = new short[1];

	@OriginalMember(owner = "client!c", name = "mb", descriptor = "[I")
	public static int[] anIntArray87 = new int[4096];

	@OriginalMember(owner = "client!c", name = "nb", descriptor = "[I")
	public static int[] anIntArray88 = new int[4096];

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "[I")
	public static int[] anIntArray89 = new int[12];

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[12][4096];

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "[I")
	public static int[] anIntArray90 = new int[1];

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "[I")
	public static int[] anIntArray92 = new int[10];

	@OriginalMember(owner = "client!c", name = "vb", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!c", name = "wb", descriptor = "[I")
	public static int[] anIntArray94 = new int[1];

	@OriginalMember(owner = "client!c", name = "xb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[4096];

	@OriginalMember(owner = "client!c", name = "yb", descriptor = "[I")
	public static int[] anIntArray95 = new int[4096];

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "[I")
	public static int[] anIntArray96 = new int[8192];

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "[I")
	public static int[] anIntArray97 = new int[4096];

	@OriginalMember(owner = "client!c", name = "Bb", descriptor = "[I")
	public static int[] anIntArray98 = new int[10];

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "[B")
	public static byte[] aByteArray12 = new byte[1];

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "[I")
	public static int[] anIntArray100 = new int[4096];

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "[I")
	public static int[] anIntArray101 = new int[12];

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "[I")
	public static int[] anIntArray102 = new int[4096];

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
	public static int[] anIntArray103 = new int[4096];

	@OriginalMember(owner = "client!c", name = "Mb", descriptor = "[I")
	public static int[] anIntArray105 = new int[10];

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "[I")
	public static int[] anIntArray106 = new int[4096];

	@OriginalMember(owner = "client!c", name = "Ob", descriptor = "[I")
	public static int[] anIntArray107 = new int[1];

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[4096];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()V")
	public static void method592() {
		aBoolean69 = false;
		Class6_Sub2_Sub1.anIntArray93 = null;
		Class6_Sub2_Sub1.anIntArray104 = null;
		Class6_Sub2_Sub1.anIntArray91 = new int[1600];
		Class6_Sub2_Sub1.anIntArrayArray9 = new int[1600][64];
		Class6_Sub2_Sub1.anIntArray99 = new int[32];
		Class6_Sub2_Sub1.anIntArrayArray7 = new int[32][512];
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
	public static int method593(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!c", name = "r", descriptor = "()V")
	public static void method599() {
		aBoolean69 = true;
		Class6_Sub2_Sub1.anIntArray93 = new int[4096];
		Class6_Sub2_Sub1.anIntArray104 = new int[4096];
		Class6_Sub2_Sub1.anIntArray91 = null;
		Class6_Sub2_Sub1.anIntArrayArray9 = null;
		Class6_Sub2_Sub1.anIntArray99 = null;
		Class6_Sub2_Sub1.anIntArrayArray7 = null;
	}
}
