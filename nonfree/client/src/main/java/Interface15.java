import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public interface Interface15 extends Interface4 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII[BLclient!kt;I)V")
	void method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class178 arg4);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BF)F")
	float method8448(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)I")
	int method8449();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIBII[II)V")
	void method8450(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int[] arg2);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IF)F")
	float method8451(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZZI)V")
	void method8452(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)I")
	int method8453();

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
	boolean method8454();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III[IIIII)V")
	void method8455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
