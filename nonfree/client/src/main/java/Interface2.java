import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface Interface2 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)I")
	int method1844(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Z")
	boolean method1845(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
	int[] method1846(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Z")
	boolean method1847(@OriginalArg(1) int arg0);
}
