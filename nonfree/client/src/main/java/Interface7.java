import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface7 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
	boolean method1168(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIBFII)[F")
	float[] method1169(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Lclient!vg;")
	Class257 method1170(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZFIIII)[I")
	int[] method1171(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FIZZII)[I")
	int[] method1172(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
