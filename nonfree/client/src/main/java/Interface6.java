import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public interface Interface6 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZIIBF)[F")
	float[] method5612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIIZII)[I")
	int[] method5613(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lclient!b;")
	Class18 method5614(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
	boolean method5615(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIZF)[I")
	int[] method5616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4);
}
