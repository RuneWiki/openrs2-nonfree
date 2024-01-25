import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface8 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZFIII)[I")
	int[] method6555(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFZII)[I")
	int[] method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I")
	int method6557();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIFZ)[F")
	float[] method6558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method6559(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lclient!nca;")
	Class224 method6560(@OriginalArg(0) int arg0);
}
