import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface Interface7 extends Interface1 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hh;I[BIIIIII)V")
	void method8716(@OriginalArg(0) Class155 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII[IB)V")
	void method8717(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int[] arg2);

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)I")
	int method8718();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IF)F")
	float method8719(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZF)F")
	float method8720(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIBI[IIII)V")
	void method8721(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	boolean method8722();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZZ)V")
	void method8723(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)I")
	int method8724();
}
