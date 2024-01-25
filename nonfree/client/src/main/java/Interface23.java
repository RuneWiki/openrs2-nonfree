import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public interface Interface23 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)I")
	int method1213(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
	int method1214(@OriginalArg(0) int arg0);
}
