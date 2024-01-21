import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public interface Interface2 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
	int method3416(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Z")
	boolean method3417(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIF)[I")
	int[] method3418(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(BI)Z")
	boolean method3419(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)Z")
	boolean method3420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(BI)[I")
	int[] method3421(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)Z")
	boolean method3422(@OriginalArg(0) int arg0);
}
