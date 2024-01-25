import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lw", name = "D", descriptor = "Lclient!qj;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIZII)V")
	public static void method5477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) long local17 = (long) (arg3 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(23) Class6_Sub16 local23 = (Class6_Sub16) Static16.aClass128_2.method3560(local17);
		if (local23 == null) {
			local23 = new Class6_Sub16();
			Static16.aClass128_2.method3551(local17, local23);
		}
		if (arg0 >= local23.anIntArray171.length) {
			@Pc(44) int[] local44 = new int[arg0 + 1];
			@Pc(49) int[] local49 = new int[arg0 + 1];
			for (@Pc(51) int local51 = 0; local51 < local23.anIntArray171.length; local51++) {
				local44[local51] = local23.anIntArray171[local51];
				local49[local51] = local23.anIntArray173[local51];
			}
			for (@Pc(81) int local81 = local23.anIntArray171.length; local81 < arg0; local81++) {
				local44[local81] = -1;
				local49[local81] = 0;
			}
			local23.anIntArray173 = local49;
			local23.anIntArray171 = local44;
		}
		local23.anIntArray171[arg0] = arg4;
		local23.anIntArray173[arg0] = arg1;
	}
}
