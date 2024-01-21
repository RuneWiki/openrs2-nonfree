import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public interface Interface1 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	boolean method1418(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	int method1419(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
	int[] method1420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z")
	boolean method1421(@OriginalArg(1) int arg0);
}
