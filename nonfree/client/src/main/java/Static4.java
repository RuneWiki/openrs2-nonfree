import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt81;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_3 = new Class81(98, 9);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public static int anInt80 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method72() {
		Static172.aClass326_14.method7234();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V")
	public static void method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(28) Class1_Sub46 local28 = (Class1_Sub46) Static289.aClass356_25.method7796(local22);
		if (local28 == null) {
			local28 = new Class1_Sub46();
			Static289.aClass356_25.method7800(local22, local28);
		}
		if (arg4 >= local28.anIntArray577.length) {
			@Pc(49) int[] local49 = new int[arg4 + 1];
			@Pc(54) int[] local54 = new int[arg4 + 1];
			for (@Pc(56) int local56 = 0; local56 < local28.anIntArray577.length; local56++) {
				local49[local56] = local28.anIntArray577[local56];
				local54[local56] = local28.anIntArray576[local56];
			}
			for (@Pc(86) int local86 = local28.anIntArray577.length; local86 < arg4; local86++) {
				local49[local86] = -1;
				local54[local86] = 0;
			}
			local28.anIntArray576 = local54;
			local28.anIntArray577 = local49;
		}
		local28.anIntArray577[arg4] = arg3;
		local28.anIntArray576[arg4] = arg0;
	}
}
