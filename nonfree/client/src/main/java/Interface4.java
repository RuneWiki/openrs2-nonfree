import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface4 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIIFB)[I")
	int[] method5683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	boolean method5684(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Lclient!mk;")
	Class160 method5685(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BFZIII)[I")
	int[] method5686(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIFIZI)[F")
	float[] method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3);
}
