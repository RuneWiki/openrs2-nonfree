import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public interface Interface1 extends Interface10 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII[BLclient!vj;III)V")
	void method7747(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) Class333 arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IF)F")
	float method7748(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
	boolean method7749();

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
	int method7750();

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIB[I)V")
	void method7751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5);

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I")
	int method7752();

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZ)V")
	void method7753(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FI)F")
	float method7754(@OriginalArg(0) float arg0);
}
