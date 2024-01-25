import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface5 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FBIIZI)[F")
	float[] method3919(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!js;")
	Class132 method3920(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BZIIIF)[I")
	int[] method3921(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Z")
	boolean method3922(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZFBII)[I")
	int[] method3923(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
