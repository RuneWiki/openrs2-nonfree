import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt8280;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public static int anInt8281 = 0;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method7038(@OriginalArg(0) Class5_Sub16 arg0) {
		Static130.aClass124_20.method2574(arg0);
		arg0.anInt1726 = arg0.aClass5_Sub15_Sub2_1.anInt4144;
		arg0.aClass5_Sub15_Sub2_1.anInt4144 = 0;
		Static252.anInt4009 += arg0.anInt1726;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7039(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub16 local12 = Static455.method6717(Static377.aClass187_63, Static16.aClass332_8);
		local12.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0) + 1);
		local12.aClass5_Sub15_Sub2_1.method3636(arg1);
		local12.aClass5_Sub15_Sub2_1.method3680(arg0);
		method7038(local12);
	}
}
