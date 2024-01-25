import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt9954;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_188 = new Class136(17, -1);

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_63 = new Class306();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!ee;)Lclient!nm;")
	public static Class96 method8453(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(10) Class204 local10 = Static194.method3068()[arg0.method8645()];
		@Pc(17) Class288 local17 = Static609.method8474()[arg0.method8645()];
		@Pc(21) int local21 = arg0.method8595();
		@Pc(25) int local25 = arg0.method8595();
		@Pc(29) int local29 = arg0.method8631();
		@Pc(33) int local33 = arg0.method8631();
		@Pc(37) int local37 = arg0.method8595();
		@Pc(41) int local41 = arg0.method8623();
		@Pc(50) int local50 = arg0.method8623();
		return new Class96(local10, local17, local21, local25, local29, local33, local37, local41, local50);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZIII)Z")
	public static boolean method8455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg2; local16++) {
				if (arg4 == Static56.anIntArrayArray5[local12][local16] && Static574.anIntArrayArray58[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
