import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public interface Interface10 extends Interface11 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI[IIIII)V")
	void method6169(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(FI)F")
	float method6170(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIZ)V")
	void method6171(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	boolean method6172();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!fda;IIIII[BZI)V")
	void method6173(@OriginalArg(0) Class93 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
	int method6174();

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(FI)F")
	float method6175(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I")
	int method6176();
}
