import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public interface Interface3 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	int method1034(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[I")
	int[] method1035(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
	boolean method1036(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z")
	boolean method1037(@OriginalArg(0) int arg0);
}
