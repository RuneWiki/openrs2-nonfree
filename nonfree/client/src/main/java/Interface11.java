import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface11 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Lclient!ah;")
	Class14 method7405(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIIIF)[I")
	int[] method7406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method7407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIBIF)[I")
	int[] method7408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIFII)[F")
	float[] method7409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
	int method7410();
}
