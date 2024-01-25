import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface5 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!cea;")
	Class45 method4043(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIFII)[F")
	float[] method4044(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Z")
	boolean method4045(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method4046();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIZIFI)[I")
	int[] method4047(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIZFI)[I")
	int[] method4048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);
}
