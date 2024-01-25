import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface Interface10 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
	int method935(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)I")
	int method936(@OriginalArg(1) int arg0);
}
