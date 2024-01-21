import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface Interface1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFB)[I")
	int[] method2647(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
	boolean method2648(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
	int[] method2649(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	int method2650(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Z")
	boolean method2651(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)Z")
	boolean method2652(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IZ)Z")
	boolean method2653(@OriginalArg(0) int arg0);
}
