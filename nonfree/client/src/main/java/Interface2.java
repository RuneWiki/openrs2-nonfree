import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface2 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FZIIII)[F")
	float[] method6022(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFIIZI)[I")
	int[] method6023(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIFI)[I")
	int[] method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method6025();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
	boolean method6026(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Lclient!pga;")
	Class271 method6027(@OriginalArg(0) int arg0);
}
