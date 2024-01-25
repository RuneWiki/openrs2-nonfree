import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface5 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method912();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZFII)[F")
	float[] method913(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Z")
	boolean method914(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FIBZII)[I")
	int[] method915(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IFZIII)[I")
	int[] method916(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Lclient!vca;")
	Class343 method917(@OriginalArg(0) int arg0);
}
