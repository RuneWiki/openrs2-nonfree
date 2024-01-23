import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public interface Interface1 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZFIIZI)[I")
	int[] method3485(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
	boolean method3486(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Lclient!ib;")
	Class75 method3487(@OriginalArg(1) int arg0);
}
