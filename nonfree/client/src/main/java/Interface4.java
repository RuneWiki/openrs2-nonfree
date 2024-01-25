import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface4 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FIIZII)[F")
	float[] method3085(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZFIIB)[I")
	int[] method3086(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)I")
	int method3087();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lclient!kc;")
	Class178 method3088(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIIFI)[I")
	int[] method3089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)Z")
	boolean method3090(@OriginalArg(1) int arg0);
}
