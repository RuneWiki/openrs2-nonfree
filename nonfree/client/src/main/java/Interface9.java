import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public interface Interface9 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)I")
	int method958(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	int method959(@OriginalArg(0) int arg0);
}
