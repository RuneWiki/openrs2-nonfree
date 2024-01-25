import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lclient!gk;")
	Class136 method358(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method359(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIIF)[I")
	int[] method360(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIZI)[F")
	float[] method361(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	int method362();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFZIB)[I")
	int[] method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);
}
