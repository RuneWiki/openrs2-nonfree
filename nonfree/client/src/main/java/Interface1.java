import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public interface Interface1 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	int method381(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Z")
	boolean method382(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Z")
	boolean method383(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Z")
	boolean method384(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
	int[] method385(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(FII)[I")
	int[] method386(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(II)Z")
	boolean method387(@OriginalArg(0) int arg0);
}
