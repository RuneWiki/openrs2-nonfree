import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public interface Interface7 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BI)I")
	int method3687(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(BI)I")
	int method3688(@OriginalArg(1) int arg0);
}
