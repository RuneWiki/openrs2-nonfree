import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface2 extends Interface19 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	int method3680();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(FZ)F")
	float method3681(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
	boolean method3682();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!ua;II[BII)V")
	void method3683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class358 arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[IIBII)V")
	void method3684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(FI)F")
	float method3685(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[IIIIII)V")
	void method3686(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIZ)V")
	void method3687(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
	int method3688();
}
