import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public interface Interface4 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	int method1547(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Z")
	boolean method1548(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)[I")
	int[] method1549(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Z")
	boolean method1550(@OriginalArg(0) int arg0);
}
