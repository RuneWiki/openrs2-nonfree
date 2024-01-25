import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface5 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!fg;")
	Class76 method3918(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIFII)[I")
	int[] method3919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZZF)[I")
	int[] method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
	boolean method3921(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IFIZII)[F")
	float[] method3922(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
