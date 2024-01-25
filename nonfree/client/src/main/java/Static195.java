import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!dp;")
	public static Class51 aClass51_23;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_165 = new Class211(22, 6);

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "[I")
	public static final int[] anIntArray750 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBI)I")
	public static int method5583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static306.anIntArray618[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
	public static void method5584(@OriginalArg(0) boolean arg0) {
		Static336.method4812(Static218.anInt3871, arg0, Static352.anInt5753, Static136.anInt6304);
	}
}
