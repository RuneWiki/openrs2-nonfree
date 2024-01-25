import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface7 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIIFB)[I")
	int[] method4416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Lclient!ib;")
	Class105 method4417(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZIF)[I")
	int[] method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IFIZIB)[F")
	float[] method4419(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(BI)Z")
	boolean method4420(@OriginalArg(1) int arg0);
}
