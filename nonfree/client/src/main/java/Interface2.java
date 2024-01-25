import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public interface Interface2 extends Interface17 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
	int method8896();

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII[III)V")
	void method8897(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(FI)F")
	float method8898(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II[BLclient!pb;IIIII)V")
	void method8899(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class265 arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(FZ)F")
	float method8900(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZZZ)V")
	void method8901(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)I")
	int method8902();

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[IIIIZII)V")
	void method8903(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
	boolean method8904();
}
