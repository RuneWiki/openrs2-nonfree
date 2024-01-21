import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface Interface1 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
	boolean method1150(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Z")
	boolean method1151(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z")
	boolean method1152(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)I")
	int method1153(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)[I")
	int[] method1154(@OriginalArg(1) int arg0);
}
