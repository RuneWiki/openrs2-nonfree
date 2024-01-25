import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface2 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZZFI)[I")
	int[] method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lclient!nq;")
	Class154 method116(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)Z")
	boolean method117(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIFBZI)[F")
	float[] method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IFIZII)[I")
	int[] method119(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4);
}
