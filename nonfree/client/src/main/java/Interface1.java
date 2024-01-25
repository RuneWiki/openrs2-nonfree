import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public interface Interface1 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Z")
	boolean method2003(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZBIFI)[F")
	float[] method2004(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IB)Lclient!hl;")
	Class84 method2005(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZIFI)[I")
	int[] method2006(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIFIIZ)[I")
	int[] method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4);
}
