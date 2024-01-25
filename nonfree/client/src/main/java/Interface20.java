import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public interface Interface20 extends Interface3 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)I")
	int method6981();

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Z")
	boolean method6982();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIILclient!dk;IIIII)V")
	void method6983(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IF)F")
	float method6984(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I")
	int method6985();

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([IIIBIIII)V")
	void method6986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IF)F")
	float method6987(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZZI)V")
	void method6988(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);
}
