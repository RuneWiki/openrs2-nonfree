import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!jb", name = "Yb", descriptor = "I")
	public static int anInt1452;

	@OriginalMember(owner = "client!jb", name = "Ac", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!jb", name = "Bc", descriptor = "I")
	public static int anInt1457;

	@OriginalMember(owner = "client!jb", name = "Sb", descriptor = "Lclient!jb;")
	public static Class6_Sub2_Sub3_Sub3 aClass6_Sub2_Sub3_Sub3_2 = new Class6_Sub2_Sub3_Sub3();

	@OriginalMember(owner = "client!jb", name = "Vb", descriptor = "Lclient!jb;")
	public static Class6_Sub2_Sub3_Sub3 aClass6_Sub2_Sub3_Sub3_3 = new Class6_Sub2_Sub3_Sub3();

	@OriginalMember(owner = "client!jb", name = "Xb", descriptor = "[I")
	public static int[] anIntArray116 = new int[1];

	@OriginalMember(owner = "client!jb", name = "Zb", descriptor = "[I")
	public static int[] anIntArray117 = Class6_Sub2_Sub2_Sub3.anIntArray77;

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "[I")
	public static int[] anIntArray118 = new int[12];

	@OriginalMember(owner = "client!jb", name = "bc", descriptor = "[I")
	public static int[] anIntArray119 = new int[1000];

	@OriginalMember(owner = "client!jb", name = "cc", descriptor = "[I")
	public static int[] anIntArray120 = new int[10];

	@OriginalMember(owner = "client!jb", name = "dc", descriptor = "[I")
	public static int[] anIntArray121 = new int[1];

	@OriginalMember(owner = "client!jb", name = "ec", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[4096];

	@OriginalMember(owner = "client!jb", name = "fc", descriptor = "[I")
	public static int[] anIntArray122 = new int[10];

	@OriginalMember(owner = "client!jb", name = "gc", descriptor = "[I")
	public static int[] anIntArray123 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "hc", descriptor = "[I")
	public static int[] anIntArray124 = Class6_Sub2_Sub2_Sub3.anIntArray73;

	@OriginalMember(owner = "client!jb", name = "ic", descriptor = "[I")
	public static int[] anIntArray125 = Static30.anIntArray78;

	@OriginalMember(owner = "client!jb", name = "jc", descriptor = "[I")
	public static int[] anIntArray126 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "kc", descriptor = "I")
	public static int anInt1453 = 0;

	@OriginalMember(owner = "client!jb", name = "lc", descriptor = "[I")
	public static int[] anIntArray127 = new int[12];

	@OriginalMember(owner = "client!jb", name = "mc", descriptor = "[I")
	public static int[] anIntArray128 = Class6_Sub2_Sub2_Sub3.anIntArray74;

	@OriginalMember(owner = "client!jb", name = "nc", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[1600][512];

	@OriginalMember(owner = "client!jb", name = "pc", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!jb", name = "qc", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[4096];

	@OriginalMember(owner = "client!jb", name = "rc", descriptor = "[I")
	public static int[] anIntArray130 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "sc", descriptor = "[I")
	public static int[] anIntArray131 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "tc", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[12][2000];

	@OriginalMember(owner = "client!jb", name = "uc", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!jb", name = "vc", descriptor = "[I")
	public static int[] anIntArray132 = new int[2000];

	@OriginalMember(owner = "client!jb", name = "wc", descriptor = "[I")
	public static int[] anIntArray133 = new int[1600];

	@OriginalMember(owner = "client!jb", name = "xc", descriptor = "I")
	public static int anInt1455 = 0;

	@OriginalMember(owner = "client!jb", name = "yc", descriptor = "[I")
	public static int[] anIntArray134 = new int[10];

	@OriginalMember(owner = "client!jb", name = "zc", descriptor = "[I")
	public static int[] anIntArray135 = new int[2000];

	@OriginalMember(owner = "client!jb", name = "Cc", descriptor = "[I")
	public static int[] anIntArray136 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "Dc", descriptor = "[I")
	public static int[] anIntArray137 = new int[4096];

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)I")
	public static int method949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class6_Sub2_Sub3_Sub3.anIntArray129[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()V")
	public static void method962() {
		aClass6_Sub2_Sub3_Sub3_2 = null;
		anIntArray116 = null;
		aClass6_Sub2_Sub3_Sub3_3 = null;
		anIntArray121 = null;
		aBooleanArray5 = null;
		aBooleanArray4 = null;
		anIntArray123 = null;
		anIntArray137 = null;
		anIntArray126 = null;
		anIntArray136 = null;
		anIntArray130 = null;
		anIntArray131 = null;
		anIntArray133 = null;
		anIntArrayArray7 = null;
		anIntArray127 = null;
		anIntArrayArray8 = null;
		anIntArray135 = null;
		anIntArray132 = null;
		anIntArray118 = null;
		anIntArray134 = null;
		anIntArray122 = null;
		anIntArray120 = null;
		anIntArray119 = null;
		anIntArray117 = null;
		anIntArray124 = null;
		anIntArray125 = null;
		anIntArray128 = null;
		Class6_Sub2_Sub3_Sub3.anIntArray129 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!pb;II)Lclient!jb;")
	public static Class6_Sub2_Sub3_Sub3 method974(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1243(0, arg1);
		return local5 == null ? null : new Class6_Sub2_Sub3_Sub3(local5);
	}
}
