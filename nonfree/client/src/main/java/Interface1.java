import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface Interface1 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
	boolean method116(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)Z")
	boolean method117(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
	int[] method118(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
	int method119(@OriginalArg(0) int arg0);
}
