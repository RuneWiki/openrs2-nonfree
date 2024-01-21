import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public interface Interface3 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	int method2592(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Z")
	boolean method2593(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
	boolean method2594(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIF)[I")
	int[] method2595(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)[I")
	int[] method2596(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
	boolean method2597(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Z")
	boolean method2598(@OriginalArg(0) int arg0);
}
