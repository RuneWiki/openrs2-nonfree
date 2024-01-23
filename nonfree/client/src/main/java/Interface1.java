import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface1 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFI)[I")
	int[] method1244(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	boolean method1245(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
	boolean method1246(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I")
	int[] method1247(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Z")
	boolean method1248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Z")
	boolean method1249(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)I")
	int method1250(@OriginalArg(0) int arg0);
}
