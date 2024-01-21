import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public interface Interface3 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
	boolean method1812(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
	int method1813(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z")
	boolean method1814(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)[I")
	int[] method1815(@OriginalArg(1) int arg0);
}
