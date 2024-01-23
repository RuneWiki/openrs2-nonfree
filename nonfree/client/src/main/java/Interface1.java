import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public interface Interface1 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	boolean method1131(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(FIZ)[I")
	int[] method1132(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Z")
	boolean method1133(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)Z")
	boolean method1134(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
	int method1135(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(IB)Z")
	boolean method1136(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)[I")
	int[] method1137(@OriginalArg(0) int arg0);
}
