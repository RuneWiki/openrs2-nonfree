import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public interface Interface4 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)I")
	int method3211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	int method3212(@OriginalArg(1) int arg0);
}
