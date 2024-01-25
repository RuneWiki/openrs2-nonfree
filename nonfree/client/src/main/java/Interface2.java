import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public interface Interface2 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBFZII)[I")
	int[] method2243(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Lclient!mp;")
	Class134 method2244(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZIIIIF)[F")
	float[] method2245(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
	boolean method2246(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method2247(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);
}
