import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public interface Interface9 extends Interface25 {

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ZIIII[II)V")
	void method4768(@OriginalArg(4) int arg0, @OriginalArg(5) int[] arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)Z")
	boolean method4769();

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(FI)F")
	float method4770(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(II[IIIIZI)V")
	void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(FB)F")
	float method4772(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ZZZ)V")
	void method4773(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(B)I")
	int method4774();

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)I")
	int method4775();

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!o;IIIIZI[B)V")
	void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) byte[] arg4);
}
