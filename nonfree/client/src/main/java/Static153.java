import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
	public static final int[] anIntArray285 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBIZI)V")
	public static void method3026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(20) Class4_Sub44 local20 = (Class4_Sub44) Static107.aClass43_35.method1273(local14);
		if (local20 == null) {
			local20 = new Class4_Sub44();
			Static107.aClass43_35.method1276(local20, local14);
		}
		if (local20.anIntArray502.length <= arg4) {
			@Pc(49) int[] local49 = new int[arg4 + 1];
			@Pc(54) int[] local54 = new int[arg4 + 1];
			for (@Pc(56) int local56 = 0; local56 < local20.anIntArray502.length; local56++) {
				local49[local56] = local20.anIntArray502[local56];
				local54[local56] = local20.anIntArray503[local56];
			}
			for (@Pc(86) int local86 = local20.anIntArray502.length; local86 < arg4; local86++) {
				local49[local86] = -1;
				local54[local86] = 0;
			}
			local20.anIntArray502 = local49;
			local20.anIntArray503 = local54;
		}
		local20.anIntArray502[arg4] = arg0;
		local20.anIntArray503[arg4] = arg2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIBII)V")
	public static void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static188.anInt3932 = arg5;
		Static70.anInt1835 = arg2;
		Static217.anInt4439 = arg4;
		Static114.anInt2731 = arg0;
		Static250.anInt5089 = arg1;
		Static52.anInt1392 = arg3;
	}
}
