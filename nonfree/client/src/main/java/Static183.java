import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_61 = new Class70(50);

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
	public static int anInt3439 = 64;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "[I")
	public static final int[] anIntArray400 = new int[250];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
	public static void method3472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass44_Sub5_1 != null) {
			local7.aClass44_Sub5_1 = null;
		}
		if (local7.aClass44_Sub5_2 != null) {
			local7.aClass44_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V")
	public static void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static265.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}
}
