import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public interface Interface1 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIFI)[I")
	int[] method5633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Lclient!ne;")
	Class135 method5634(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IFZIIB)[F")
	float[] method5635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(FIZIII)[I")
	int[] method5636(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(IB)Z")
	boolean method5637(@OriginalArg(0) int arg0);
}
