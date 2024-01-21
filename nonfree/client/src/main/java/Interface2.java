import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public interface Interface2 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)I")
	int method1655(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z")
	boolean method1656(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIF)[I")
	int[] method1657(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Z")
	boolean method1658(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)Z")
	boolean method1659(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)[I")
	int[] method1660(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)Z")
	boolean method1661(@OriginalArg(0) int arg0);
}
