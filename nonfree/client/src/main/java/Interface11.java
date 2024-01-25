import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public interface Interface11 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FZIIII)[F")
	float[] method2464(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IFZIII)[I")
	int[] method2465(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lclient!sh;")
	Class229 method2466(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZIFII)[I")
	int[] method2467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)Z")
	boolean method2468(@OriginalArg(0) int arg0);
}
