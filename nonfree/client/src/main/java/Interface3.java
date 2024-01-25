import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface3 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIFI)[F")
	float[] method5484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
	boolean method5485(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Lclient!qr;")
	Class178 method5486(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIIIF)[I")
	int[] method5487(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIIFB)[I")
	int[] method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);
}
