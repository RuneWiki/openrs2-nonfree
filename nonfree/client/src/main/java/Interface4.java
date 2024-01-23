import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public interface Interface4 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lclient!qf;")
	Class112 method376(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(IB)Z")
	boolean method377(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(FZIIII)[I")
	int[] method378(@OriginalArg(0) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}
