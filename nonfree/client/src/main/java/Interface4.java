import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public interface Interface4 extends Interface1 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)Z")
	boolean method7371();

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
	int method7372();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIII[III)V")
	void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IF)F")
	float method7374(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZZ)V")
	void method7375(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)I")
	int method7376();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(FZ)F")
	float method7377(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([BIIIIIIILclient!jb;)V")
	void method7378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) Class161 arg4);
}
