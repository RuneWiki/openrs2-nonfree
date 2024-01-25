import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public interface Interface20 extends Interface8 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[IIIIIII)V")
	void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
	int method4636();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)I")
	int method4637();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!lw;IIIIII[B)V")
	void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZZ)V")
	void method4639(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IF)F")
	float method4640(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(IF)F")
	float method4641(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)Z")
	boolean method4642();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBII[III)V")
	void method4643(@OriginalArg(0) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2);
}
