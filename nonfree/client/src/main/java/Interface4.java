import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public interface Interface4 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lclient!qg;")
	Class203 method3138(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZFIIII)[I")
	int[] method3139(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
	boolean method3140(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIFIZI)[F")
	float[] method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIFII)[I")
	int[] method3142(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
