import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public interface Interface8 extends Interface11 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
	boolean method5774();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I")
	int method5775();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jt;I[BIIIII)V")
	void method5776(@OriginalArg(1) Class150 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IF)F")
	float method5777(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	int method5778();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[IIIII)V")
	void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIZ)V")
	void method5780(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IF)F")
	float method5781(@OriginalArg(1) float arg0);
}
