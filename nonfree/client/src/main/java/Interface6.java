import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public interface Interface6 extends Interface10 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
	int method7599();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)F")
	float method7600(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Z")
	boolean method7601();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZIILclient!nh;I[B)V")
	void method7602(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class219 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([IIIIIIII)V")
	void method7603(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BF)F")
	float method7604(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
	int method7605();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZI)V")
	void method7606(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);
}
