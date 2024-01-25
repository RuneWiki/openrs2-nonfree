import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "J")
	public static long aLong234;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "F")
	public static float aFloat114 = 1.0F;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "[I")
	public static final int[] anIntArray661 = new int[13];

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public static int anInt6817 = -1;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "[I")
	public static final int[] anIntArray662 = new int[14];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)V")
	public static void method5343() {
		Static35.aBoolean37 = false;
		Static457.method6059(Static226.anInt4217, Static279.anInt4882, Static361.anInt6151, Static270.anInt4755);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)I")
	public static int method5344(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(Z)J")
	public static long method5347() {
		return Static312.aClass51_2.method4763();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z")
	public static boolean method5348(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}
}
