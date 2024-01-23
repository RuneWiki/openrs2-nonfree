import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt3040;

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "Lclient!nk;")
	public static Class121 aClass121_75;

	@OriginalMember(owner = "client!ld", name = "qb", descriptor = "I")
	public static int anInt3076;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt3037 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[F")
	public static float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "[S")
	public static short[] aShortArray53 = new short[] { 41, 58, 21, 5, 59, 14, 42, 9 };

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "[I")
	public static int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)I")
	public static int method2649(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
	public static int method2650() {
		return Static255.anInt4623;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static53.aClass187_33 = new Class187(arg1);
		Static182.aClass187_93 = new Class187(arg0);
	}
}
