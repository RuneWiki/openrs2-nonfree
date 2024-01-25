import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public interface Interface21 extends Interface15 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(FI)F")
	float method9032(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZZB)V")
	void method9033(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)I")
	int method9034();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIBI[III)V")
	void method9035(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIBI[III)V")
	void method9036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(FI)F")
	float method9037(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)I")
	int method9038();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILclient!vea;IIII[BI)V")
	void method9039(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)Z")
	boolean method9040();
}
