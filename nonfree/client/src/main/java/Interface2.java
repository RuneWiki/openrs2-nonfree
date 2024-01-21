import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public interface Interface2 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
	int method2659(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Z")
	boolean method2660(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
	boolean method2661(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(FII)[I")
	int[] method2662(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)Z")
	boolean method2663(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IB)Z")
	boolean method2664(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(IB)[I")
	int[] method2665(@OriginalArg(0) int arg0);
}
