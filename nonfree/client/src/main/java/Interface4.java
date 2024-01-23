import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public interface Interface4 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I")
	int[] method756(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FII)[I")
	int[] method757(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Z")
	boolean method758(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)I")
	int method759(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Z")
	boolean method760(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)Z")
	boolean method761(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)Z")
	boolean method762(@OriginalArg(1) int arg0);
}
