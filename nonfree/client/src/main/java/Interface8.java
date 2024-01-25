import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public interface Interface8 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Z")
	boolean method5562(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZFII)[I")
	int[] method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(FIZIBI)[I")
	int[] method5564(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIFII)[F")
	float[] method5565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)Lclient!op;")
	Class184 method5566(@OriginalArg(0) int arg0);
}
