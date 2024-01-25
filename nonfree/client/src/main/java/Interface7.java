import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface7 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lclient!lu;")
	Class151 method4836(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z")
	boolean method4837(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZIFII)[F")
	float[] method4838(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIFIII)[I")
	int[] method4839(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZFIIII)[I")
	int[] method4840(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}
