import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public interface Interface20 extends Interface12 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZB)V")
	void method6623(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I")
	int method6624();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(FI)F")
	float method6625(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
	boolean method6626();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IF)F")
	float method6627(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[IIIIII)V")
	void method6628(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII[IIZI)V")
	void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)I")
	int method6630();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIB[BIIILclient!wd;I)V")
	void method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class366 arg4);
}
