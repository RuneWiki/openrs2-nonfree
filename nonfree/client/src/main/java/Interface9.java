import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public interface Interface9 extends Interface12 {

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZZB)V")
	void method3270(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIII[II)V")
	void method3271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	int method3272();

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
	int method3273();

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIILclient!kp;[BIBII)V")
	void method3274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZF)F")
	float method3275(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
	boolean method3276();

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IF)F")
	float method3277(@OriginalArg(1) float arg0);
}
