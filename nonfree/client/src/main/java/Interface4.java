import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface4 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIIIFI)[I")
	int[] method5086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZFII)[F")
	float[] method5087(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIFZI)[I")
	int[] method5088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	boolean method5089(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lclient!bb;")
	Class25 method5090(@OriginalArg(0) int arg0);
}
