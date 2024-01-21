import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fd", name = "Yb", descriptor = "I")
	public static int anInt864;

	@OriginalMember(owner = "client!fd", name = "ec", descriptor = "I")
	public static int anInt865;

	@OriginalMember(owner = "client!fd", name = "gc", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!fd", name = "Ib", descriptor = "Lclient!fd;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_1 = new Class2_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!fd", name = "Qb", descriptor = "[I")
	public static int[] anIntArray85 = new int[1];

	@OriginalMember(owner = "client!fd", name = "Sb", descriptor = "Lclient!fd;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_2 = new Class2_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!fd", name = "Vb", descriptor = "[I")
	public static int[] anIntArray88 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "Wb", descriptor = "[I")
	public static int[] anIntArray89 = new int[2000];

	@OriginalMember(owner = "client!fd", name = "Xb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[4096];

	@OriginalMember(owner = "client!fd", name = "Zb", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[4096];

	@OriginalMember(owner = "client!fd", name = "ac", descriptor = "[I")
	public static int[] anIntArray90 = new int[1600];

	@OriginalMember(owner = "client!fd", name = "bc", descriptor = "[I")
	public static int[] anIntArray91 = new int[10];

	@OriginalMember(owner = "client!fd", name = "dc", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[1600][512];

	@OriginalMember(owner = "client!fd", name = "fc", descriptor = "[I")
	public static int[] anIntArray93 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "hc", descriptor = "[I")
	public static int[] anIntArray94 = new int[10];

	@OriginalMember(owner = "client!fd", name = "jc", descriptor = "[I")
	public static int[] anIntArray96 = Class2_Sub1_Sub1_Sub4.anIntArray261;

	@OriginalMember(owner = "client!fd", name = "kc", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!fd", name = "lc", descriptor = "[I")
	public static int[] anIntArray97 = Class2_Sub1_Sub1_Sub4.anIntArray262;

	@OriginalMember(owner = "client!fd", name = "mc", descriptor = "[I")
	public static int[] anIntArray98 = new int[1000];

	@OriginalMember(owner = "client!fd", name = "oc", descriptor = "[I")
	public static int[] anIntArray100 = new int[12];

	@OriginalMember(owner = "client!fd", name = "pc", descriptor = "[I")
	public static int[] anIntArray101 = Static87.anIntArray264;

	@OriginalMember(owner = "client!fd", name = "qc", descriptor = "[I")
	public static int[] anIntArray102 = new int[12];

	@OriginalMember(owner = "client!fd", name = "rc", descriptor = "[I")
	public static int[] anIntArray103 = new int[1];

	@OriginalMember(owner = "client!fd", name = "sc", descriptor = "[I")
	public static int[] anIntArray104 = new int[2000];

	@OriginalMember(owner = "client!fd", name = "tc", descriptor = "[I")
	public static int[] anIntArray105 = Class2_Sub1_Sub1_Sub4.anIntArray265;

	@OriginalMember(owner = "client!fd", name = "uc", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!fd", name = "wc", descriptor = "[I")
	public static int[] anIntArray107 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "xc", descriptor = "[I")
	public static int[] anIntArray108 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "zc", descriptor = "[I")
	public static int[] anIntArray109 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "Ac", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!fd", name = "Bc", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!fd", name = "Cc", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[12][2000];

	@OriginalMember(owner = "client!fd", name = "Dc", descriptor = "[I")
	public static int[] anIntArray110 = new int[10];

	@OriginalMember(owner = "client!fd", name = "Ec", descriptor = "[I")
	public static int[] anIntArray111 = new int[4096];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ac;II)Lclient!fd;")
	public static Class2_Sub1_Sub4_Sub1 method669(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method928(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub4_Sub1(local5);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(III)I")
	public static int method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class2_Sub1_Sub4_Sub1.anIntArray95[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "()V")
	public static void method680() {
		aClass2_Sub1_Sub4_Sub1_1 = null;
		anIntArray85 = null;
		aClass2_Sub1_Sub4_Sub1_2 = null;
		anIntArray103 = null;
		aBooleanArray4 = null;
		aBooleanArray3 = null;
		anIntArray108 = null;
		anIntArray107 = null;
		anIntArray111 = null;
		anIntArray88 = null;
		anIntArray93 = null;
		anIntArray109 = null;
		anIntArray90 = null;
		anIntArrayArray11 = null;
		anIntArray100 = null;
		anIntArrayArray12 = null;
		anIntArray89 = null;
		anIntArray104 = null;
		anIntArray102 = null;
		anIntArray94 = null;
		anIntArray110 = null;
		anIntArray91 = null;
		anIntArray98 = null;
		anIntArray105 = null;
		anIntArray96 = null;
		anIntArray101 = null;
		anIntArray97 = null;
		Class2_Sub1_Sub4_Sub1.anIntArray95 = null;
	}
}
