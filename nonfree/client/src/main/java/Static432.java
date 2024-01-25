import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "(III)Z")
	public static boolean method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static414.method6550(arg1, arg0) || Static200.method3474(arg1, arg0);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIZIB)V")
	public static void method6767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(20) Class3_Sub32 local20 = (Class3_Sub32) Static334.aClass280_27.method7107(local14);
		if (local20 == null) {
			local20 = new Class3_Sub32();
			Static334.aClass280_27.method7109(local20, local14);
		}
		if (arg2 >= local20.anIntArray268.length) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray268.length; local48++) {
				local41[local48] = local20.anIntArray268[local48];
				local46[local48] = local20.anIntArray267[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray268.length; local74 < arg2; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray268 = local41;
			local20.anIntArray267 = local46;
		}
		local20.anIntArray268[arg2] = arg4;
		local20.anIntArray267[arg2] = arg1;
	}
}
