import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public interface Interface7 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
	int method2140(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
	int method2141(@OriginalArg(1) int arg0);
}
