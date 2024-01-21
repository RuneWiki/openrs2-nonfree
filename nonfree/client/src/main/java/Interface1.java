import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public interface Interface1 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	int[] method2486(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
	boolean method2487(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)Z")
	boolean method2488(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
	int method2489(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Z")
	boolean method2490(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IFI)[I")
	int[] method2491(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IZ)Z")
	boolean method2492(@OriginalArg(0) int arg0);
}
