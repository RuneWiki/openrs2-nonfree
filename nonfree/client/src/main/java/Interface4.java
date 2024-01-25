import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public interface Interface4 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZIIIF)[I")
	int[] method6707(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	boolean method6708(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZIFI)[F")
	float[] method6709(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)I")
	int method6710();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IFIIIZ)[I")
	int[] method6711(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lclient!pw;")
	Class238 method6712(@OriginalArg(1) int arg0);
}
