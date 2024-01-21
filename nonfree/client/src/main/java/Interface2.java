import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public interface Interface2 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	int[] method1697(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Z")
	boolean method1698(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
	int method1699(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
	boolean method1700(@OriginalArg(1) int arg0);
}
