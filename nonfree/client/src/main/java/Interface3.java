import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface3 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)Z")
	boolean method2852(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBFIIZ)[I")
	int[] method2853(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIZF)[I")
	int[] method2854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIZI)[F")
	float[] method2855(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method2856();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Lclient!afa;")
	Class8 method2857(@OriginalArg(0) int arg0);
}
