import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public interface Interface2 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
	int[] method1056(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
	boolean method1057(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I")
	int method1058(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Z")
	boolean method1059(@OriginalArg(1) int arg0);
}
