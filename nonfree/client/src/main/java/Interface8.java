import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface8 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FZIBII)[F")
	float[] method1372(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIIF)[I")
	int[] method1373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIFBI)[I")
	int[] method1374(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)Lclient!qg;")
	Class201 method1375(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
	boolean method1376(@OriginalArg(0) int arg0);
}
