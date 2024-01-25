import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public interface Interface7 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(FIIBZI)[I")
	int[] method2786(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIFZII)[F")
	float[] method2787(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)Lclient!w;")
	Class215 method2788(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)Z")
	boolean method2789(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IFIZII)[I")
	int[] method2790(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);
}
