import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface3 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZBFIII)[I")
	int[] method1938(@OriginalArg(0) boolean arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIZBII)[I")
	int[] method1939(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Z")
	boolean method1940(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!hba;")
	Class136 method1941(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBZIFI)[F")
	float[] method1942(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method1943();
}
