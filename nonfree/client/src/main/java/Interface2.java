import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public interface Interface2 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	boolean method1097(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
	int method1098(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
	int[] method1099(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Z")
	boolean method1100(@OriginalArg(1) int arg0);
}
