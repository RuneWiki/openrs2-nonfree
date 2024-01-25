import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public interface Interface2 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FZIIIZ)[F")
	float[] method4240(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Z")
	boolean method4241(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIFIZ)[I")
	int[] method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIFIZ)[I")
	int[] method4243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lclient!oj;")
	Class154 method4244(@OriginalArg(0) int arg0);
}
