import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public interface Interface12 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	int method1303(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)I")
	int method1304(@OriginalArg(0) int arg0);
}
