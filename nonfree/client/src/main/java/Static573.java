import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!th", name = "N", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_123 = new Class100(10, 7);

	@OriginalMember(owner = "client!th", name = "O", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_124 = new Class100(19, 2);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
	public static void method8216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		Static679.method9323(Static274.anIntArrayArray34[arg2], arg0, arg4, arg3);
		@Pc(17) int local17 = arg1 - 1;
		Static679.method9323(Static274.anIntArrayArray34[arg1], arg0, arg4, arg3);
		for (@Pc(33) int local33 = local8; local33 <= local17; local33++) {
			@Pc(39) int[] local39 = Static274.anIntArrayArray34[local33];
			local39[arg0] = local39[arg3] = arg4;
		}
	}
}
