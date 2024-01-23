import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public interface Interface1 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lclient!jn;")
	Class91 method4105(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
	boolean method4106(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FZIIII)[I")
	int[] method4107(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
