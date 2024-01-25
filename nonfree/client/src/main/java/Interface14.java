import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public interface Interface14 extends Interface10 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	int method7063();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)Z")
	boolean method7064();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(FB)F")
	float method7065(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BLclient!ec;IIIIII)V")
	void method7066(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZZ)V")
	void method7067(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
	int method7068();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI[IIIII)V")
	void method7069(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZF)F")
	float method7070(@OriginalArg(1) float arg0);
}
