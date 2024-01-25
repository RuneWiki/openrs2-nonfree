import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public interface Interface7 extends Interface3 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[IIIII)V")
	void method5801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
	boolean method5802();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	int method5803();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IF)F")
	float method5804(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZI)V")
	void method5805(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	int method5806();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!sw;IIII[BIII)V")
	void method5807(@OriginalArg(0) Class327 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IF)F")
	float method5808(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII[III)V")
	void method5809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2);
}
