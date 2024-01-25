import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public interface Interface1 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)I")
	int method4251(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)I")
	int method4252(@OriginalArg(0) int arg0);
}
