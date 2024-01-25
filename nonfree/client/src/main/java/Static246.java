import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt4386;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
	public static final int[] anIntArray352 = new int[13];

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray124 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public static int anInt4394 = -1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BI)I")
	public static int method3618(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static341.method4805(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ut;Lclient!ut;I)V")
	public static void method3620(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_58 != null) {
			arg1.method5883();
		}
		arg1.aClass1_Sub2_58 = arg0;
		arg1.aClass1_Sub2_57 = arg0.aClass1_Sub2_57;
		arg1.aClass1_Sub2_58.aClass1_Sub2_57 = arg1;
		arg1.aClass1_Sub2_57.aClass1_Sub2_58 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(III)B")
	public static byte method3621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
