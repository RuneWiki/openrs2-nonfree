import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public interface Interface1 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
	boolean method559(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBF)[I")
	int[] method560(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)I")
	int method561(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
	boolean method562(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Z")
	boolean method563(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
	boolean method564(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[I")
	int[] method565(@OriginalArg(1) int arg0);
}
