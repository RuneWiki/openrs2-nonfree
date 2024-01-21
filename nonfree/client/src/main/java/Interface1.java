import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public interface Interface1 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	boolean method1285(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[I")
	int[] method1286(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z")
	boolean method1287(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
	int method1288(@OriginalArg(0) int arg0);
}
