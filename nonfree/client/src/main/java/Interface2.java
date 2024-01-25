import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public interface Interface2 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
	boolean method4740(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!ha;")
	Class98 method4741(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIFZ)[I")
	int[] method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZFIII)[I")
	int[] method4743(@OriginalArg(2) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IFZIII)[F")
	float[] method4744(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
