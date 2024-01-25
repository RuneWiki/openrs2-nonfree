import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface10 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FIZIZI)[I")
	int[] method4238(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIFI)[I")
	int[] method4239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZFI)[F")
	float[] method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lclient!ij;")
	Class118 method4241(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)Z")
	boolean method4242(@OriginalArg(1) int arg0);
}
