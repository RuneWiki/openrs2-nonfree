import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public interface Interface4 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)Lclient!oh;")
	Class183 method2450(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIFBZ)[I")
	int[] method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIIF)[I")
	int[] method2452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZFIII)[F")
	float[] method2453(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Z")
	boolean method2454(@OriginalArg(0) int arg0);
}
