import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface3 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	boolean method7248(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lclient!pp;")
	Class271 method7249(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZIFI)[I")
	int[] method7250(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FIZIII)[I")
	int[] method7251(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	int method7252();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIFZB)[F")
	float[] method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3);
}
