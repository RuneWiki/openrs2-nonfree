import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public interface Interface11 extends Interface3 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	int method8760();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZZI)V")
	void method8761(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FB)F")
	float method8762(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)Z")
	boolean method8763();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIIILclient!ul;IIII)V")
	void method8764(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class361 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)I")
	int method8765();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IF)F")
	float method8766(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZI[III)V")
	void method8767(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IIIIIIII)V")
	void method8768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
