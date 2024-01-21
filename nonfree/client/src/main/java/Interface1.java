import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public interface Interface1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	boolean method1007(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Z")
	boolean method1008(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
	int[] method1009(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
	int method1010(@OriginalArg(1) int arg0);
}
