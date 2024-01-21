import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface Interface3 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Z")
	boolean method2294(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)Z")
	boolean method2295(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(FII)[I")
	int[] method2296(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IB)Z")
	boolean method2297(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IB)I")
	int method2298(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
	int[] method2299(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
	boolean method2300(@OriginalArg(1) int arg0);
}
