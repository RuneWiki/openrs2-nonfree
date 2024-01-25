import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public interface Interface8 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Z")
	boolean method4123(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZIF)[I")
	int[] method4124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!oc;")
	Class178 method4125(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZF)[I")
	int[] method4126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(FIZBII)[F")
	float[] method4127(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
