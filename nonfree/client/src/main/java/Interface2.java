import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface2 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method8325();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZFIIII)[F")
	float[] method8326(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method8327(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method8328(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZIF)[I")
	int[] method8329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!nl;")
	Class250 method8330(@OriginalArg(0) int arg0);
}
