import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ne", name = "Rb", descriptor = "I")
	public static int anInt1746;

	@OriginalMember(owner = "client!ne", name = "ec", descriptor = "I")
	public static int anInt1749;

	@OriginalMember(owner = "client!ne", name = "tc", descriptor = "I")
	public static int anInt1751;

	@OriginalMember(owner = "client!ne", name = "Mb", descriptor = "Lclient!ne;")
	public static Class2_Sub2_Sub12_Sub4 aClass2_Sub2_Sub12_Sub4_2 = new Class2_Sub2_Sub12_Sub4();

	@OriginalMember(owner = "client!ne", name = "Ob", descriptor = "Lclient!ne;")
	public static Class2_Sub2_Sub12_Sub4 aClass2_Sub2_Sub12_Sub4_3 = new Class2_Sub2_Sub12_Sub4();

	@OriginalMember(owner = "client!ne", name = "Pb", descriptor = "[I")
	public static int[] anIntArray384 = new int[1];

	@OriginalMember(owner = "client!ne", name = "Qb", descriptor = "[I")
	public static int[] anIntArray385 = new int[12];

	@OriginalMember(owner = "client!ne", name = "Sb", descriptor = "I")
	public static int anInt1747 = 0;

	@OriginalMember(owner = "client!ne", name = "Tb", descriptor = "[I")
	public static int[] anIntArray386 = Class2_Sub2_Sub2_Sub1.anIntArray59;

	@OriginalMember(owner = "client!ne", name = "Ub", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!ne", name = "Vb", descriptor = "[I")
	public static int[] anIntArray387 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "Wb", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[4096];

	@OriginalMember(owner = "client!ne", name = "Xb", descriptor = "[I")
	public static int[] anIntArray388 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "Yb", descriptor = "[I")
	public static int[] anIntArray389 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "Zb", descriptor = "[I")
	public static int[] anIntArray390 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "ac", descriptor = "[I")
	public static int[] anIntArray391 = new int[1500];

	@OriginalMember(owner = "client!ne", name = "bc", descriptor = "[I")
	public static int[] anIntArray392 = Static6.anIntArray63;

	@OriginalMember(owner = "client!ne", name = "cc", descriptor = "[I")
	public static int[] anIntArray393 = new int[10];

	@OriginalMember(owner = "client!ne", name = "dc", descriptor = "[I")
	public static int[] anIntArray394 = new int[2000];

	@OriginalMember(owner = "client!ne", name = "fc", descriptor = "[I")
	public static int[] anIntArray395 = Class2_Sub2_Sub2_Sub1.anIntArray61;

	@OriginalMember(owner = "client!ne", name = "gc", descriptor = "[I")
	public static int[] anIntArray396 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "hc", descriptor = "[I")
	public static int[] anIntArray397 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "ic", descriptor = "[I")
	public static int[] anIntArray398 = new int[12];

	@OriginalMember(owner = "client!ne", name = "jc", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ne", name = "kc", descriptor = "[I")
	public static int[] anIntArray399 = new int[1];

	@OriginalMember(owner = "client!ne", name = "lc", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[12][2000];

	@OriginalMember(owner = "client!ne", name = "mc", descriptor = "[I")
	public static int[] anIntArray400 = new int[10];

	@OriginalMember(owner = "client!ne", name = "nc", descriptor = "[I")
	public static int[] anIntArray401 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "oc", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[1500][512];

	@OriginalMember(owner = "client!ne", name = "pc", descriptor = "[I")
	public static int[] anIntArray402 = Class2_Sub2_Sub2_Sub1.anIntArray58;

	@OriginalMember(owner = "client!ne", name = "qc", descriptor = "[Z")
	public static boolean[] aBooleanArray26 = new boolean[4096];

	@OriginalMember(owner = "client!ne", name = "rc", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!ne", name = "sc", descriptor = "[I")
	public static int[] anIntArray403 = new int[2000];

	@OriginalMember(owner = "client!ne", name = "uc", descriptor = "[I")
	public static int[] anIntArray404 = new int[10];

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
	public static int method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class2_Sub2_Sub12_Sub4.anIntArray405[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
	public static void method1150() {
		aClass2_Sub2_Sub12_Sub4_2 = null;
		anIntArray384 = null;
		aClass2_Sub2_Sub12_Sub4_3 = null;
		anIntArray399 = null;
		aBooleanArray26 = null;
		aBooleanArray25 = null;
		anIntArray389 = null;
		anIntArray388 = null;
		anIntArray401 = null;
		anIntArray396 = null;
		anIntArray397 = null;
		anIntArray390 = null;
		anIntArray391 = null;
		anIntArrayArray19 = null;
		anIntArray385 = null;
		anIntArrayArray18 = null;
		anIntArray394 = null;
		anIntArray403 = null;
		anIntArray398 = null;
		anIntArray393 = null;
		anIntArray400 = null;
		anIntArray404 = null;
		anIntArray387 = null;
		anIntArray386 = null;
		anIntArray402 = null;
		anIntArray392 = null;
		anIntArray395 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ud;II)Lclient!ne;")
	public static Class2_Sub2_Sub12_Sub4 method1163(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method68(0, arg1);
		return local5 == null ? null : new Class2_Sub2_Sub12_Sub4(local5);
	}
}
