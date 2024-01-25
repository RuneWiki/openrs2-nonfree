import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public interface Interface2 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBIFIZ)[I")
	int[] method345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lclient!gf;")
	Class82 method346(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIFZZ)[I")
	int[] method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZIZFI)[F")
	float[] method348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)Z")
	boolean method349(@OriginalArg(1) int arg0);
}
