import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public interface Interface4 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
	int method1332(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
	int method1333(@OriginalArg(1) int arg0);
}
