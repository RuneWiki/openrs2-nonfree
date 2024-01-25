import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public interface Interface8 extends Interface18 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BF)F")
	float method7325(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(FB)F")
	float method7326(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I")
	int method7327();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
	int method7328();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII[BLclient!sk;I)V")
	void method7329(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) Class297 arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[IIBII)V")
	void method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZBZ)V")
	void method7331(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Z")
	boolean method7332();
}
