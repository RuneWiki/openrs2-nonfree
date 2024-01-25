import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface7 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIFIIZ)[I")
	int[] method5206(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	boolean method5207(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZFIIII)[I")
	int[] method5208(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lclient!du;")
	Class76 method5209(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	int method5210();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZF)[F")
	float[] method5211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);
}
