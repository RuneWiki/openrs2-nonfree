import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface2 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lclient!gaa;")
	Class115 method3085(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIFIIZ)[F")
	float[] method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZIF)[I")
	int[] method3087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIFIZI)[I")
	int[] method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Z")
	boolean method3089(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	int method3090();
}
