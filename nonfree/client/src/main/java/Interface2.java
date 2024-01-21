import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface2 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
	int method2090(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[I")
	int[] method2091(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z")
	boolean method2092(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z")
	boolean method2093(@OriginalArg(0) int arg0);
}
