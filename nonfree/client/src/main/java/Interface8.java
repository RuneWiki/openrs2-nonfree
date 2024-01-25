import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public interface Interface8 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)I")
	int method455(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)I")
	int method456(@OriginalArg(0) int arg0);
}
