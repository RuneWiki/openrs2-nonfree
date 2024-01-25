import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public interface Interface11 extends Interface20 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(FI)F")
	float method7636(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[IIIIII)V")
	void method7637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
	int method7638();

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZZB)V")
	void method7639(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IF)F")
	float method7640(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII[BLclient!wu;I)V")
	void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class366 arg4);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I")
	int method7642();

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
	boolean method7643();
}
