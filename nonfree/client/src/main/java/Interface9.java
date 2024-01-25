import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public interface Interface9 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Lclient!kb;")
	Class132 method139(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZIIF)[F")
	float[] method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZFII)[I")
	int[] method141(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
	boolean method142(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZIF)[I")
	int[] method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) float arg4);
}
