import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static271 {

	@OriginalMember(owner = "client!um", name = "tb", descriptor = "I")
	public static int anInt5295;

	@OriginalMember(owner = "client!um", name = "ub", descriptor = "I")
	public static int anInt5296;

	@OriginalMember(owner = "client!um", name = "zb", descriptor = "I")
	public static int anInt5297;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "Lclient!um;")
	public static Class14_Sub6_Sub2 aClass14_Sub6_Sub2_1 = new Class14_Sub6_Sub2();

	@OriginalMember(owner = "client!um", name = "ab", descriptor = "[B")
	public static byte[] aByteArray71 = new byte[1];

	@OriginalMember(owner = "client!um", name = "bb", descriptor = "[I")
	public static int[] anIntArray477 = new int[1];

	@OriginalMember(owner = "client!um", name = "cb", descriptor = "[I")
	public static int[] anIntArray478 = new int[1];

	@OriginalMember(owner = "client!um", name = "eb", descriptor = "Lclient!um;")
	public static Class14_Sub6_Sub2 aClass14_Sub6_Sub2_2 = new Class14_Sub6_Sub2();

	@OriginalMember(owner = "client!um", name = "fb", descriptor = "[S")
	public static short[] aShortArray85 = new short[1];

	@OriginalMember(owner = "client!um", name = "gb", descriptor = "[I")
	public static int[] anIntArray480 = new int[1];

	@OriginalMember(owner = "client!um", name = "hb", descriptor = "[I")
	public static int[] anIntArray481 = new int[1];

	@OriginalMember(owner = "client!um", name = "ib", descriptor = "Lclient!um;")
	public static Class14_Sub6_Sub2 aClass14_Sub6_Sub2_3 = new Class14_Sub6_Sub2();

	@OriginalMember(owner = "client!um", name = "jb", descriptor = "[S")
	public static short[] aShortArray86 = new short[1];

	@OriginalMember(owner = "client!um", name = "kb", descriptor = "[B")
	public static byte[] aByteArray72 = new byte[1];

	@OriginalMember(owner = "client!um", name = "lb", descriptor = "[I")
	public static int[] anIntArray482 = new int[1];

	@OriginalMember(owner = "client!um", name = "mb", descriptor = "[I")
	public static int[] anIntArray483 = new int[1];

	@OriginalMember(owner = "client!um", name = "nb", descriptor = "[S")
	public static short[] aShortArray87 = new short[1];

	@OriginalMember(owner = "client!um", name = "pb", descriptor = "[B")
	public static byte[] aByteArray73 = new byte[1];

	@OriginalMember(owner = "client!um", name = "qb", descriptor = "[I")
	public static int[] anIntArray484 = new int[4096];

	@OriginalMember(owner = "client!um", name = "rb", descriptor = "[I")
	public static int[] anIntArray485 = new int[10];

	@OriginalMember(owner = "client!um", name = "sb", descriptor = "[I")
	public static int[] anIntArray486 = new int[1];

	@OriginalMember(owner = "client!um", name = "vb", descriptor = "[I")
	public static int[] anIntArray487 = new int[4096];

	@OriginalMember(owner = "client!um", name = "xb", descriptor = "[I")
	public static int[] anIntArray489 = new int[4096];

	@OriginalMember(owner = "client!um", name = "yb", descriptor = "[I")
	public static int[] anIntArray490 = new int[1];

	@OriginalMember(owner = "client!um", name = "Bb", descriptor = "[I")
	public static int[] anIntArray492 = new int[12];

	@OriginalMember(owner = "client!um", name = "Cb", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[12][4096];

	@OriginalMember(owner = "client!um", name = "Db", descriptor = "I")
	public static int anInt5298 = 0;

	@OriginalMember(owner = "client!um", name = "Eb", descriptor = "[I")
	public static int[] anIntArray493 = new int[4096];

	@OriginalMember(owner = "client!um", name = "Gb", descriptor = "[I")
	public static int[] anIntArray494 = new int[4096];

	@OriginalMember(owner = "client!um", name = "Jb", descriptor = "[I")
	public static int[] anIntArray497 = new int[1];

	@OriginalMember(owner = "client!um", name = "Kb", descriptor = "[I")
	public static int[] anIntArray498 = new int[4096];

	@OriginalMember(owner = "client!um", name = "Lb", descriptor = "[I")
	public static int[] anIntArray499 = new int[10];

	@OriginalMember(owner = "client!um", name = "Mb", descriptor = "[I")
	public static int[] anIntArray500 = new int[4096];

	@OriginalMember(owner = "client!um", name = "Nb", descriptor = "[I")
	public static int[] anIntArray501 = new int[10];

	@OriginalMember(owner = "client!um", name = "Ob", descriptor = "[Z")
	public static boolean[] aBooleanArray48 = new boolean[4096];

	@OriginalMember(owner = "client!um", name = "Pb", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!um", name = "Qb", descriptor = "[I")
	public static int[] anIntArray502 = new int[12];

	@OriginalMember(owner = "client!um", name = "Rb", descriptor = "[Z")
	public static boolean[] aBooleanArray49 = new boolean[4096];

	@OriginalMember(owner = "client!um", name = "Sb", descriptor = "[I")
	public static int[] anIntArray503 = new int[4096];

	@OriginalMember(owner = "client!um", name = "Tb", descriptor = "[I")
	public static int[] anIntArray504 = new int[8192];

	@OriginalMember(owner = "client!um", name = "Ub", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(II)I")
	public static int method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "()V")
	public static void method4129() {
		aBoolean396 = true;
		Class14_Sub6_Sub2.anIntArray488 = new int[4096];
		Class14_Sub6_Sub2.anIntArray496 = new int[4096];
		Class14_Sub6_Sub2.anIntArray495 = null;
		Class14_Sub6_Sub2.anIntArrayArray40 = null;
		Class14_Sub6_Sub2.anIntArray491 = null;
		Class14_Sub6_Sub2.anIntArrayArray38 = null;
	}

	@OriginalMember(owner = "client!um", name = "o", descriptor = "()V")
	public static void method4134() {
		aBoolean396 = false;
		Class14_Sub6_Sub2.anIntArray488 = null;
		Class14_Sub6_Sub2.anIntArray496 = null;
		Class14_Sub6_Sub2.anIntArray495 = new int[1600];
		Class14_Sub6_Sub2.anIntArrayArray40 = new int[1600][64];
		Class14_Sub6_Sub2.anIntArray491 = new int[32];
		Class14_Sub6_Sub2.anIntArrayArray38 = new int[32][512];
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)I")
	public static int method4141(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
