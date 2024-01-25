import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public static void method7239(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static242.aClass118_21.method2595((long) arg0);
		if (local10 != null) {
			local10.aBoolean287 = !local10.aBoolean287;
			local10.aClass209_Sub1_1.method4365(local10.aBoolean287);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIZI)V")
	public static void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub8 local20 = (Class2_Sub8) Static407.aClass118_46.method2595(local14);
		if (local20 == null) {
			local20 = new Class2_Sub8();
			Static407.aClass118_46.method2601(local20, local14);
		}
		if (arg2 >= local20.anIntArray123.length) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray123.length; local48++) {
				local41[local48] = local20.anIntArray123[local48];
				local46[local48] = local20.anIntArray122[local48];
			}
			for (@Pc(78) int local78 = local20.anIntArray123.length; local78 < arg2; local78++) {
				local41[local78] = -1;
				local46[local78] = 0;
			}
			local20.anIntArray123 = local41;
			local20.anIntArray122 = local46;
		}
		local20.anIntArray123[arg2] = arg0;
		local20.anIntArray122[arg2] = arg1;
	}
}
