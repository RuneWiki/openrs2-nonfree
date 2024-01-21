import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface Interface3 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Z")
	boolean method1560(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)[I")
	int[] method1561(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)Z")
	boolean method1562(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	int method1563(@OriginalArg(0) int arg0);
}
