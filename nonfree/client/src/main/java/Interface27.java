import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public interface Interface27 extends Interface7 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I[IIIIBI)V")
	void method8299(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZI)V")
	void method8300(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FI)F")
	float method8301(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II[IIIIII)V")
	void method8302(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)I")
	int method8303();

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIBIIII[BLclient!wq;)V")
	void method8304(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class375 arg4);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BF)F")
	float method8305(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I")
	int method8306();

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)Z")
	boolean method8307();
}
