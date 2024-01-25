import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface10 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
	int method6991(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)I")
	int method6992(@OriginalArg(1) int arg0);
}
