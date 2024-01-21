import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public interface Interface2 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[I")
	int[] method619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)I")
	int method620(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)Z")
	boolean method621(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
	boolean method622(@OriginalArg(1) int arg0);
}
