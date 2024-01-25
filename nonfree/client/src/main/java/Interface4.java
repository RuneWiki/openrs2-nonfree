import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public interface Interface4 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I")
	int method4299(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)I")
	int method4300(@OriginalArg(1) int arg0);
}
