import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public interface Interface3 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IFIBZI)[F")
	float[] method5438(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z")
	boolean method5439(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(FIIIIZ)[I")
	int[] method5440(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)Lclient!jb;")
	Class102 method5441(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZFIBI)[I")
	int[] method5442(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4);
}
