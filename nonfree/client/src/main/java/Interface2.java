import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public interface Interface2 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
	boolean method1824(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)I")
	int method1825(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Z")
	boolean method1826(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIF)[I")
	int[] method1827(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)[I")
	int[] method1828(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IZ)Z")
	boolean method1829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)Z")
	boolean method1830(@OriginalArg(1) int arg0);
}
