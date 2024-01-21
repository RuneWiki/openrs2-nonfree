import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public interface Interface2 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
	boolean method568(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Z")
	boolean method569(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
	int method570(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[I")
	int[] method571(@OriginalArg(0) int arg0);
}
