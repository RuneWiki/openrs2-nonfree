import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public interface Interface27 extends Interface6 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)F")
	float method7127(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	int method7128();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!et;III[BIII)V")
	void method7129(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	int method7130();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII[IIII)V")
	void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[IIIII)V")
	void method7132(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(FI)F")
	float method7133(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZZ)V")
	void method7134(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z")
	boolean method7135();
}
