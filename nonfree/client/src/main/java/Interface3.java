import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public interface Interface3 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	int method1552(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[I")
	int[] method1553(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Z")
	boolean method1554(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Z")
	boolean method1555(@OriginalArg(1) int arg0);
}
