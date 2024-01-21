import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface1 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	boolean method661(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Z")
	boolean method662(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I")
	int[] method663(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)I")
	int method664(@OriginalArg(1) int arg0);
}
