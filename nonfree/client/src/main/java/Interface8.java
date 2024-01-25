import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public interface Interface8 extends Interface1 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IF)F")
	float method7065(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII[III)V")
	void method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(FZ)F")
	float method7067(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZZ)V")
	void method7068(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII[BLclient!g;IB)V")
	void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class122 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[IIIIII)V")
	void method7070(@OriginalArg(1) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)I")
	int method7071();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z")
	boolean method7072();

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
	int method7073();
}
