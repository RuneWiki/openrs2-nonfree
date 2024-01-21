import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public interface Interface1 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
	boolean method2881(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)Z")
	boolean method2882(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BFI)[I")
	int[] method2883(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)I")
	int method2884(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
	int[] method2885(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(II)Z")
	boolean method2886(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)Z")
	boolean method2887(@OriginalArg(1) int arg0);
}
