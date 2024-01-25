import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public interface Interface12 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	int method1570(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
	int method1571(@OriginalArg(0) int arg0);
}
