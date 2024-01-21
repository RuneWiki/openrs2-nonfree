import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public interface Interface3 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(FII)[I")
	int[] method1286(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	boolean method1287(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Z")
	boolean method1288(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)Z")
	boolean method1289(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)Z")
	boolean method1290(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(II)[I")
	int[] method1291(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(II)I")
	int method1292(@OriginalArg(1) int arg0);
}
