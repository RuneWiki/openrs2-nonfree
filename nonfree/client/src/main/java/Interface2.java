import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface Interface2 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)Z")
	boolean method1675(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	int method1676(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Z")
	boolean method1677(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
	int[] method1678(@OriginalArg(0) int arg0);
}
