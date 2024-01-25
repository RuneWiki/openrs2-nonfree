import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public interface Interface6 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)I")
	int method6852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	int method6853(@OriginalArg(0) int arg0);
}
