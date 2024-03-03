import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	public static boolean aBoolean93;

	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!r;")
	public static Class197 aClass197_9;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!cc;")
	public static Class32 aClass32_5;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
	private static boolean aBoolean97;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	private static int anInt1181;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
	private static boolean aBoolean98;

	@OriginalMember(owner = "client!un", name = "providesignlink", descriptor = "(Lclient!ml;)V", line = 3)
	private static void method1380(@OriginalArg(0) Class152 arg0) {
		Static305.aClass152_5 = arg0;
		Static366.aClass152_6 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V", line = 88)
	public static void method1383(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static299.anInt6017 = 7;
		Class11_Sub5_Sub3.anInt4707 = 0x1 << Static299.anInt6017;
		Static233.anInt4684 = Class11_Sub5_Sub3.anInt4707 >> 1;
		Static290.anInt5864 = (int) Math.sqrt((double) (Static233.anInt4684 * Static233.anInt4684 + Static233.anInt4684 * Static233.anInt4684));
		Static68.anInt1682 = arg0;
		Static196.anInt3769 = arg1;
		Static198.anInt3784 = arg2;
		Static364.aClass67ArrayArrayArray5 = new Class67[4][Static68.anInt1682][Static196.anInt3769];
		Static307.aClass6Array3 = new Class6[4];
		if (arg3) {
			Static78.anIntArrayArray16 = new int[Static68.anInt1682][Static196.anInt3769];
			Static291.aByteArrayArray17 = new byte[Static68.anInt1682][Static196.anInt3769];
			Static31.aByteArrayArray4 = new byte[Static68.anInt1682][Static196.anInt3769];
			Static84.aClass67ArrayArrayArray4 = new Class67[1][Static68.anInt1682][Static196.anInt3769];
			Static174.aClass6Array2 = new Class6[1];
		} else {
			Static78.anIntArrayArray16 = null;
			Static291.aByteArrayArray17 = null;
			Static31.aByteArrayArray4 = null;
			Static84.aClass67ArrayArrayArray4 = null;
			Static174.aClass6Array2 = null;
		}
		if (arg4) {
			Static48.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static283.aClass2_Sub26_Sub1Array2 = new Class2_Sub26_Sub1[65535];
			Static326.aBooleanArray57 = new boolean[65535];
			Static154.anInt3135 = 0;
		} else {
			Static48.aLongArrayArrayArray1 = null;
			Static283.aClass2_Sub26_Sub1Array2 = null;
			Static326.aBooleanArray57 = null;
			Static154.anInt3135 = 0;
		}
		Static318.method5768(false);
		Static227.aClass58Array3 = new Class58[500];
		Static245.anInt4891 = 0;
		Static171.aClass58Array2 = new Class58[500];
		Class2_Sub3_Sub9.anInt1620 = 0;
		Static155.anIntArrayArrayArray9 = new int[4][Static68.anInt1682 + 1][Static196.anInt3769 + 1];
		Static91.aClass11_Sub5Array1 = new Class11_Sub5[5000];
		Class245.anInt7064 = 0;
		Static6.aBooleanArrayArray1 = new boolean[Static198.anInt3784 + Static198.anInt3784 + 1][Static198.anInt3784 + Static198.anInt3784 + 1];
		Static339.aBooleanArrayArray5 = new boolean[Static198.anInt3784 + Static198.anInt3784 + 2][Static198.anInt3784 + Static198.anInt3784 + 2];
		Static153.aClass15_1 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLclient!bt;)Lclient!oq;", line = 455)
	public static Class173_Sub1 method1395(@OriginalArg(1) Class2_Sub4 arg0) {
		return new Class173_Sub1(arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4834(), arg0.method4816());
	}
}
