import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public interface Interface9 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIF)[I")
	int[] method2392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZFII)[F")
	float[] method2393(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)Z")
	boolean method2394(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIIFI)[I")
	int[] method2395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!ra;")
	Class171 method2396(@OriginalArg(0) int arg0);
}
