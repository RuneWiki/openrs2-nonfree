import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public interface Interface1 extends Interface14 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Z")
	boolean method8623();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII[IBI)V")
	void method8624(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII[IIBI)V")
	void method8625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII[BILclient!pe;II)V")
	void method8626(@OriginalArg(4) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class276 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IF)F")
	float method8627(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I")
	int method8628();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZZB)V")
	void method8629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)I")
	int method8630();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BF)F")
	float method8631(@OriginalArg(1) float arg0);
}
