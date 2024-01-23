import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public interface Interface4 {

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "(II)Lclient!qi;")
	Class139 method2255(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
	boolean method2256(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IFBIZI)[I")
	int[] method2257(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}
