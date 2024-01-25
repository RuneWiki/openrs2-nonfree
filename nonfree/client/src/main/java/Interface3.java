import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface3 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method4774(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIFIZ)[F")
	float[] method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lclient!co;")
	Class55 method4776(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIFII)[I")
	int[] method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method4778();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZFIII)[I")
	int[] method4779(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
