import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public interface Interface2 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	int[] method1317(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z")
	boolean method1318(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Z")
	boolean method1319(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
	int method1320(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FBI)[I")
	int[] method1321(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)Z")
	boolean method1322(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(IB)Z")
	boolean method1323(@OriginalArg(0) int arg0);
}
