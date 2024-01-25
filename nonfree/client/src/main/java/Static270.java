import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jea", name = "L", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_6 = new Class352(0, 2, 2, 1);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZII)V")
	public static void method3947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class14_Sub50 local20 = (Class14_Sub50) Static602.aClass187_78.method4078(local14);
		if (local20 == null) {
			local20 = new Class14_Sub50();
			Static602.aClass187_78.method4077(local14, local20);
		}
		if (arg0 >= local20.anIntArray699.length) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local20.anIntArray699.length; local57++) {
				local50[local57] = local20.anIntArray699[local57];
				local55[local57] = local20.anIntArray698[local57];
			}
			for (@Pc(83) int local83 = local20.anIntArray699.length; local83 < arg0; local83++) {
				local50[local83] = -1;
				local55[local83] = 0;
			}
			local20.anIntArray698 = local55;
			local20.anIntArray699 = local50;
		}
		local20.anIntArray699[arg0] = arg1;
		local20.anIntArray698[arg0] = arg2;
	}
}
