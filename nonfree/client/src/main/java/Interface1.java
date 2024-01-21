import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface1 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
	int[] method2069(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Z")
	boolean method2070(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Z")
	boolean method2071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)I")
	int method2072(@OriginalArg(1) int arg0);
}
