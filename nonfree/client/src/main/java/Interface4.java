import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface Interface4 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(FII)[I")
	int[] method2505(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
	int[] method2506(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Z")
	boolean method2507(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
	int method2508(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Z")
	boolean method2509(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Z")
	boolean method2510(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Z")
	boolean method2511(@OriginalArg(1) int arg0);
}
