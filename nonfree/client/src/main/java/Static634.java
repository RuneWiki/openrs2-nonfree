import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static634 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public static int anInt10389;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
	public static int[] anIntArray558;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!qw;)V")
	public static void method8884(@OriginalArg(1) Class4_Sub7 arg0) {
		arg0.aClass4_Sub3_Sub3_Sub3_1 = null;
		if (Static203.anInt3516 < 20) {
			Static500.aClass283_11.method6802(arg0);
			Static203.anInt3516++;
		}
	}
}
