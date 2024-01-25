import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public interface Interface20 extends Interface3 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII[IIII)V")
	void method7529(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	int method7530();

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZBZ)V")
	void method7531(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nl;IB[BIIIII)V")
	void method7532(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(FI)F")
	float method7533(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IF)F")
	float method7534(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z")
	boolean method7535();

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)I")
	int method7536();
}
