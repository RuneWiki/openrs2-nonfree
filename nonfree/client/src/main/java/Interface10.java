import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public interface Interface10 extends Interface5 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III[IIII)V")
	void method9100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2);

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)I")
	int method9101();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IF)F")
	float method9102(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Z")
	boolean method9103();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(FI)F")
	float method9104(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)I")
	int method9105();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZLclient!nea;I[BIIII)V")
	void method9106(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZI)V")
	void method9107(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[IIIIII)V")
	void method9108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
