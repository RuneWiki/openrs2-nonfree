import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public interface Interface5 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	boolean method4075(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZIIIF)[F")
	float[] method4076(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IFIBZI)[I")
	int[] method4077(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIIFII)[I")
	int[] method4078(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!hi;")
	Class112 method4079(@OriginalArg(0) int arg0);
}
