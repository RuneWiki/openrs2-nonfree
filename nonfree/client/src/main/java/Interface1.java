import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public interface Interface1 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	int[] method1718(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Z")
	boolean method1719(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Z")
	boolean method1720(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFB)[I")
	int[] method1721(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z")
	boolean method1722(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BI)Z")
	boolean method1723(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
	int method1724(@OriginalArg(0) int arg0);
}
