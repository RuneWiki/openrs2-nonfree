import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public interface Interface12 extends Interface4 {

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	int method7448();

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZBZ)V")
	void method7449(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IF)F")
	float method7450(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIZI[I)V")
	void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIILclient!ofa;[BIZI)V")
	void method7452(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class255 arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z")
	boolean method7453();

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([IZIIIII)V")
	void method7454(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IF)F")
	float method7455(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
	int method7456();
}
