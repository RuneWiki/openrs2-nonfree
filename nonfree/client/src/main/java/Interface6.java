import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public interface Interface6 extends Interface16 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZI)V")
	void method8281(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IF)F")
	float method8282(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
	boolean method8283();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)I")
	int method8284();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(FI)F")
	float method8285(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIIIIIILclient!fca;[B)V")
	void method8286(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) Class97 arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII[IIII)V")
	void method8287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)I")
	int method8288();
}
