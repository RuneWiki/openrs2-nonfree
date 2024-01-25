import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface4 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZIF)[I")
	int[] method7226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	boolean method7227(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FZIBII)[I")
	int[] method7228(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lclient!kd;")
	Class172 method7229(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFIZZ)[F")
	float[] method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method7231();
}
