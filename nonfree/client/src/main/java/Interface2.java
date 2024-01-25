import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public interface Interface2 extends Interface15 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZZ)V")
	void method6718(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBII[BLclient!hi;III)V")
	void method6719(@OriginalArg(0) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII[I)V")
	void method6720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z")
	boolean method6721();

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I")
	int method6722();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
	int method6723();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(FZ)F")
	float method6724(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IF)F")
	float method6725(@OriginalArg(1) float arg0);
}
