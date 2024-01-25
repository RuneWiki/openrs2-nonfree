import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface7 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZFBIII)[F")
	float[] method4459(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!de;")
	Class69 method4460(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method4461();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIBFI)[I")
	int[] method4462(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Z")
	boolean method4463(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIFI)[I")
	int[] method4464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);
}
