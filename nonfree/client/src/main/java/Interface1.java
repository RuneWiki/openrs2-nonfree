import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public interface Interface1 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
	boolean method1712(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FII)[I")
	int[] method1713(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I")
	int[] method1714(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)Z")
	boolean method1715(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)I")
	int method1716(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(ZI)Z")
	boolean method1717(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
	boolean method1718(@OriginalArg(0) int arg0);
}
