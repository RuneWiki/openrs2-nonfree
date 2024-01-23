import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface4 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	int method1632(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Z")
	boolean method1633(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Z")
	boolean method1634(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)Z")
	boolean method1635(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BIF)[I")
	int[] method1636(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)[I")
	int[] method1637(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(IB)Z")
	boolean method1638(@OriginalArg(0) int arg0);
}
