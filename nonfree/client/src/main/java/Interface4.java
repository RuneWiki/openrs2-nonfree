import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public interface Interface4 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I")
	int[] method262(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	int method263(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Z")
	boolean method264(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)Z")
	boolean method265(@OriginalArg(0) int arg0);
}
