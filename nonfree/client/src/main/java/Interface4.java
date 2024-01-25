import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public interface Interface4 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I")
	int method6529(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
	int method6530(@OriginalArg(1) int arg0);
}
