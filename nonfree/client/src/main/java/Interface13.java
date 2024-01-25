import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface13 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	int method5785();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(FIIZII)[I")
	int[] method5786(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIFIZI)[F")
	float[] method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z")
	boolean method5788(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!uk;")
	Class296 method5789(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZFIII)[I")
	int[] method5790(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
