import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface Interface1 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Z")
	boolean method104(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)Z")
	boolean method105(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
	boolean method106(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(FIB)[I")
	int[] method107(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I")
	int[] method108(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I")
	int method109(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Z")
	boolean method110(@OriginalArg(1) int arg0);
}
