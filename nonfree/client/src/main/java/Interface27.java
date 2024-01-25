import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public interface Interface27 extends Interface25 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IF)F")
	float method5617(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZI)V")
	void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)I")
	int method5619();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z[IIIIIII)V")
	void method5620(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!tn;IIBI[BII)V")
	void method5621(@OriginalArg(1) Class339 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZF)F")
	float method5622(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIIIII)V")
	void method5623(@OriginalArg(0) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
	boolean method5624();

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
	int method5625();
}
