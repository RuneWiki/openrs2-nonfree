import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface7 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method8113();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZFIIB)[F")
	float[] method8114(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
	boolean method8115(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIIF)[I")
	int[] method8116(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZFIZI)[I")
	int[] method8117(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!kv;")
	Class195 method8118(@OriginalArg(0) int arg0);
}
