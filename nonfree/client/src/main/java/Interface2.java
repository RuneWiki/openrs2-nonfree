import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public interface Interface2 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
	boolean method959(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)I")
	int method960(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I")
	int[] method961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Z")
	boolean method962(@OriginalArg(0) int arg0);
}
