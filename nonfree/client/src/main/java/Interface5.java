import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public interface Interface5 extends Interface14 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZZ)V")
	void method7967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[IIIIZ)V")
	void method7968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Z")
	boolean method7969();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FI)F")
	float method7970(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
	int method7971();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FB)F")
	float method7972(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BIIILclient!aq;IB)V")
	void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	int method7974();
}
