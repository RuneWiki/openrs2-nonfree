import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jk", name = "Sc", descriptor = "[I")
	public static final int[] anIntArray216 = new int[14];

	@OriginalMember(owner = "client!jk", name = "Yc", descriptor = "I")
	public static int anInt3424 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([I[ILclient!ur;III)Lclient!jq;")
	public static Class104_Sub2 method2779(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class34_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(22) int local22 = arg4 * local12 + arg1[local12];
			for (@Pc(24) int local24 = 0; local24 < arg0[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class104_Sub2(arg2, arg4, arg3, local10);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ii;IIII)V")
	public static void method2788(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static1.method12(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static37.anInt666) {
			Static1.method12(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static1.method12(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static408.anInt6716) {
			Static1.method12(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static408.anInt6716) {
			Static1.method12(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static37.anInt666 && arg4 <= Static408.anInt6716) {
			Static1.method12(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static1.method12(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static37.anInt666 && arg4 > 0) {
			Static1.method12(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
