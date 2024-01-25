import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface9 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Lclient!mj;")
	Class158 method1769(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIFBZI)[I")
	int[] method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZIIF)[F")
	float[] method1771(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZFIIZ)[I")
	int[] method1772(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	boolean method1773(@OriginalArg(0) int arg0);
}
