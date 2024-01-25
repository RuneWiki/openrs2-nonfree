import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BLclient!cb;II)Lclient!ot;")
	public static Class5_Sub2_Sub18 method7527(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class5_Sub15 local17 = new Class5_Sub15(arg0.method916(arg1, arg2));
		@Pc(50) Class5_Sub2_Sub18 local50 = new Class5_Sub2_Sub18(arg1, local17.method3661(), local17.method3661(), local17.method3671(), local17.method3671(), local17.method3642() == 1, local17.method3642(), local17.method3642());
		@Pc(54) int local54 = local17.method3642();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass124_81.method2574(new Class5_Sub22(local17.method3642(), local17.method3698(), local17.method3698(), local17.method3698(), local17.method3698(), local17.method3698(), local17.method3698(), local17.method3698(), local17.method3698()));
		}
		local50.method6515();
		return local50;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!ft;I)I")
	public static int method7529(@OriginalArg(0) Class5_Sub2_Sub5 arg0) {
		@Pc(11) String local11 = Static565.method7759(arg0);
		return Static358.aClass198_7.method4083(Static113.aClass59Array2, local11);
	}
}
