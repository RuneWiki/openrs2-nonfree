import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public interface Interface1 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
	int method4992(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)I")
	int method4993(@OriginalArg(1) int arg0);
}
