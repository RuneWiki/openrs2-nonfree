import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public interface Interface2 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)Z")
	boolean method2890(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(FZIIBI)[I")
	int[] method2891(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)Lclient!ek;")
	Class46 method2892(@OriginalArg(1) int arg0);
}
