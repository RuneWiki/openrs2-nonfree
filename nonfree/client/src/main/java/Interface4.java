import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface Interface4 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)Z")
	boolean method666(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
	int method667(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[I")
	int[] method668(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)Z")
	boolean method669(@OriginalArg(0) int arg0);
}
