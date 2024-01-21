import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public interface Interface4 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Z")
	boolean method394(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Z")
	boolean method395(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)I")
	int method396(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)[I")
	int[] method397(@OriginalArg(0) int arg0);
}
