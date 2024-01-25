import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface1 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Z")
	boolean method2860(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIIF)[I")
	int[] method2861(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIZFII)[I")
	int[] method2862(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lclient!mf;")
	Class233 method2863(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method2864();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIFII)[F")
	float[] method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);
}
