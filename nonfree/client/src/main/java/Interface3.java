import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public interface Interface3 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
	int method59(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
	int[] method60(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Z")
	boolean method61(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Z")
	boolean method62(@OriginalArg(0) int arg0);
}
