import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface7 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFIIZ)[I")
	int[] method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method3870();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method3871(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIIFB)[I")
	int[] method3872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZFIII)[F")
	float[] method3873(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lclient!aba;")
	Class3 method3874(@OriginalArg(0) int arg0);
}
