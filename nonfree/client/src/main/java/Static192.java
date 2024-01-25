import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	public static final int[] anIntArray183 = new int[3];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!gga;)Lclient!om;")
	public static Class259 method2709(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(7) int local7 = arg0.method8374();
		@Pc(14) Class7 local14 = Static262.method5239()[arg0.method8374()];
		@Pc(21) Class249 local21 = Static119.method1848()[arg0.method8374()];
		@Pc(25) int local25 = arg0.method8395();
		@Pc(29) int local29 = arg0.method8395();
		@Pc(33) int local33 = arg0.method8363();
		@Pc(37) int local37 = arg0.method8363();
		@Pc(41) int local41 = arg0.method8369();
		@Pc(45) int local45 = arg0.method8369();
		@Pc(54) int local54 = arg0.method8369();
		@Pc(63) boolean local63 = arg0.method8374() == 1;
		return new Class259(local7, local14, local21, local25, local29, local33, local37, local41, local45, local54, local63);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIB)I")
	public static int method2712(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class6_Sub6 local10 = Static249.method3626(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray54.length; local24++) {
				if (local10.anIntArray55[local24] == arg0) {
					local22 += local10.anIntArray54[local24];
				}
			}
			return local22;
		}
	}
}
