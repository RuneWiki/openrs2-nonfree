import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
	public static int anInt8870 = 0;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
	public static int anInt8877 = 0;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V")
	public static void method7067() {
		Static95.aBoolean114 = false;
		Static131.anInt2504 = 1;
		Static540.anInt8992 = 0;
		Static426.anInt7575 = -1;
		Static226.aClass248_33 = null;
		Static321.anInt6142 = 2;
		Static554.anInt9644 = -1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZBII)V")
	public static void method7068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class6_Sub46 local20 = (Class6_Sub46) Static73.aClass234_4.method5464(local14);
		if (local20 == null) {
			local20 = new Class6_Sub46();
			Static73.aClass234_4.method5466(local14, local20);
		}
		if (local20.anIntArray582.length <= arg1) {
			@Pc(49) int[] local49 = new int[arg1 + 1];
			@Pc(54) int[] local54 = new int[arg1 + 1];
			for (@Pc(56) int local56 = 0; local56 < local20.anIntArray582.length; local56++) {
				local49[local56] = local20.anIntArray582[local56];
				local54[local56] = local20.anIntArray583[local56];
			}
			for (@Pc(86) int local86 = local20.anIntArray582.length; local86 < arg1; local86++) {
				local49[local86] = -1;
				local54[local86] = 0;
			}
			local20.anIntArray582 = local49;
			local20.anIntArray583 = local54;
		}
		local20.anIntArray582[arg1] = arg0;
		local20.anIntArray583[arg1] = arg3;
	}
}
