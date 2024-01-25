import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface10 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)I")
	int method2525(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	int method2526(@OriginalArg(0) int arg0);
}
