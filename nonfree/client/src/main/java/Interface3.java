import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public interface Interface3 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	int[] method1023(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(FII)[I")
	int[] method1024(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Z")
	boolean method1025(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z")
	boolean method1026(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
	int method1027(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)Z")
	boolean method1028(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(II)Z")
	boolean method1029(@OriginalArg(1) int arg0);
}
