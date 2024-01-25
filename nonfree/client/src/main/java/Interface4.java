import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public interface Interface4 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	int method2802(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)I")
	int method2803(@OriginalArg(1) int arg0);
}
