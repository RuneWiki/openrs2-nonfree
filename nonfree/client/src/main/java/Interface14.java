import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public interface Interface14 extends Interface3 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(FI)F")
	float method2128(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)Z")
	boolean method2129();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZZ)V")
	void method2130(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!lca;IIZIIII[B)V")
	void method2131(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)I")
	int method2132();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZF)F")
	float method2133(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBIII[III)V")
	void method2134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
	int method2135();
}
