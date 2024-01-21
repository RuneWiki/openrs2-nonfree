import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface4 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	boolean method458(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[I")
	int[] method459(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z")
	boolean method460(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)I")
	int method461(@OriginalArg(0) int arg0);
}
