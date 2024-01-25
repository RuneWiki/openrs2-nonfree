import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!oa;")
	public static Class65 aClass65_5;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIZIII)V")
	public static void method3654(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) long local16 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(22) Class3_Sub30 local22 = (Class3_Sub30) Static229.aClass127_24.method3246(local16);
		if (local22 == null) {
			local22 = new Class3_Sub30();
			Static229.aClass127_24.method3257(local16, local22);
		}
		if (local22.anIntArray360.length <= arg3) {
			@Pc(47) int[] local47 = new int[arg3 + 1];
			@Pc(52) int[] local52 = new int[arg3 + 1];
			for (@Pc(54) int local54 = 0; local54 < local22.anIntArray360.length; local54++) {
				local47[local54] = local22.anIntArray360[local54];
				local52[local54] = local22.anIntArray362[local54];
			}
			for (@Pc(79) int local79 = local22.anIntArray360.length; local79 < arg3; local79++) {
				local47[local79] = -1;
				local52[local79] = 0;
			}
			local22.anIntArray362 = local52;
			local22.anIntArray360 = local47;
		}
		local22.anIntArray360[arg3] = arg0;
		local22.anIntArray362[arg3] = arg2;
	}
}
