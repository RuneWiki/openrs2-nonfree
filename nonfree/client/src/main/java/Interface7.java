import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface7 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!vm;")
	Class259 method4447(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BZIFII)[I")
	int[] method4448(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FBIIZI)[F")
	float[] method4449(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Z")
	boolean method4450(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZFI)[I")
	int[] method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);
}
