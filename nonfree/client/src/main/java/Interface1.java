import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public interface Interface1 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
	int[] method1719(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
	boolean method1720(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Z")
	boolean method1721(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)I")
	int method1722(@OriginalArg(0) int arg0);
}
