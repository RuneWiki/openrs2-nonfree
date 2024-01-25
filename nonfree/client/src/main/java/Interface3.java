import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface3 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIBZ)[I")
	int[] method4653(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method4654(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	int method4655();

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!hia;")
	Class145 method4656(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZFIII)[F")
	float[] method4657(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZFIBII)[I")
	int[] method4658(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
