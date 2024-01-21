import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt4461;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_28;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2043 = Static187.method3089("Fps:");

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_2044 = Static187.method3089("Mem:");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
	public static void method3380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub25 local16 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg2);
		if (local16 == null) {
			local16 = new Class1_Sub25();
			Static71.aClass97_7.method3374(local16, (long) arg2);
		}
		if (local16.anIntArray326.length <= arg1) {
			@Pc(42) int[] local42 = new int[arg1 + 1];
			@Pc(47) int[] local47 = new int[arg1 + 1];
			for (@Pc(49) int local49 = 0; local49 < local16.anIntArray326.length; local49++) {
				local42[local49] = local16.anIntArray326[local49];
				local47[local49] = local16.anIntArray325[local49];
			}
			for (@Pc(75) int local75 = local16.anIntArray326.length; local75 < arg1; local75++) {
				local42[local75] = -1;
				local47[local75] = 0;
			}
			local16.anIntArray325 = local47;
			local16.anIntArray326 = local42;
		}
		local16.anIntArray326[arg1] = arg3;
		local16.anIntArray325[arg1] = arg0;
	}
}
