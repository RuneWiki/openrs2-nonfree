import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface8 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBZIFI)[I")
	int[] method876(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIZF)[F")
	float[] method877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)Lclient!oo;")
	Class220 method878(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	boolean method879(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIIZF)[I")
	int[] method880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	int method881();
}
