import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public interface Interface7 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	boolean method2392(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIIFII)[I")
	int[] method2393(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIIZII)[F")
	float[] method2394(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIZFII)[I")
	int[] method2395(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!vf;")
	Class251 method2396(@OriginalArg(1) int arg0);
}
