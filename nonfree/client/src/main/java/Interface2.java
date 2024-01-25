import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public interface Interface2 extends Interface3 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "([BIBIIILclient!em;II)V")
	void method6499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class82 arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III[IIIII)V")
	void method6500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
	int method6501();

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBIIII[I)V")
	void method6502(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int[] arg2);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(FI)F")
	float method6503(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(FZ)F")
	float method6504(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Z")
	boolean method6505();

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZIZ)V")
	void method6506(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)I")
	int method6507();
}
