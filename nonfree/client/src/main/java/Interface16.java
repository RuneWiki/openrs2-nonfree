import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public interface Interface16 extends Interface21 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZIIII[III)V")
	void method8242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIILclient!sca;I[BI)V")
	void method8243(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class335 arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Z")
	boolean method8244();

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)I")
	int method8245();

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I")
	int method8246();

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(FI)F")
	float method8247(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZZ)V")
	void method8248(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[IIIIII)V")
	void method8249(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IF)F")
	float method8250(@OriginalArg(1) float arg0);
}
