import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface8 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FIIZII)[I")
	int[] method3832(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZIIFI)[F")
	float[] method3833(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(FZIIII)[I")
	int[] method3834(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z")
	boolean method3835(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lclient!oh;")
	Class178 method3836(@OriginalArg(1) int arg0);
}
