import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public interface Interface9 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)I")
	int method1459(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I")
	int method1460(@OriginalArg(0) int arg0);
}
