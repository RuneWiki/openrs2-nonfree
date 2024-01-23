import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface Interface3 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(IB)Lclient!qc;")
	Class128 method4404(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "(II)Z")
	boolean method4405(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZBFII)[I")
	int[] method4406(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
