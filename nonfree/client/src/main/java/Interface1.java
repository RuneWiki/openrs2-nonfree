import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface Interface1 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	boolean method2846(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZFII)[F")
	float[] method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFIIBZ)[I")
	int[] method2848(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!pt;")
	Class182 method2849(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIFIII)[I")
	int[] method2850(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
