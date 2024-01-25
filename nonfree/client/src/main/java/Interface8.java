import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface8 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FIZIZI)[I")
	int[] method7232(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FIIIZI)[F")
	float[] method7233(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIFB)[I")
	int[] method7234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	int method7235();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	boolean method7236(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!sm;")
	Class271 method7237(@OriginalArg(1) int arg0);
}
