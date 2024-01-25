import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public interface Interface16 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	int method1629(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
	int method1630(@OriginalArg(1) int arg0);
}
