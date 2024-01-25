import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface9 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method1554();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFZIIB)[I")
	int[] method1555(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIFZI)[F")
	float[] method1556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method1557(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!gd;")
	Class130 method1558(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIIF)[I")
	int[] method1559(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);
}
