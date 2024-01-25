import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
	public static int anInt5675 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIZIB)V")
	public static void method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(15) long local15 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(21) Class3_Sub38 local21 = (Class3_Sub38) Static537.aClass313_41.method7104(local15);
		if (local21 == null) {
			local21 = new Class3_Sub38();
			Static537.aClass313_41.method7107(local15, local21);
		}
		if (local21.anIntArray410.length <= arg2) {
			@Pc(54) int[] local54 = new int[arg2 + 1];
			@Pc(59) int[] local59 = new int[arg2 + 1];
			for (@Pc(61) int local61 = 0; local61 < local21.anIntArray410.length; local61++) {
				local54[local61] = local21.anIntArray410[local61];
				local59[local61] = local21.anIntArray411[local61];
			}
			for (@Pc(89) int local89 = local21.anIntArray410.length; local89 < arg2; local89++) {
				local54[local89] = -1;
				local59[local89] = 0;
			}
			local21.anIntArray411 = local59;
			local21.anIntArray410 = local54;
		}
		local21.anIntArray410[arg2] = arg0;
		local21.anIntArray411[arg2] = arg1;
	}
}
