import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public interface Interface3 extends Interface1 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZBZ)V")
	void method7839(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
	int method7840();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	int method7841();

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII[II)V")
	void method7842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IIIIII)V")
	void method7843(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII[BLclient!pd;)V")
	void method7844(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class250 arg4);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FI)F")
	float method7845(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BF)F")
	float method7846(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)Z")
	boolean method7847();
}
