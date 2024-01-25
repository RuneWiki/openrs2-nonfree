import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public interface Interface12 extends Interface24 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IF)F")
	float method2988(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!os;II[BIIII)V")
	void method2989(@OriginalArg(1) Class245 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZB)V")
	void method2990(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I")
	int method2991();

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
	boolean method2992();

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)I")
	int method2993();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(FB)F")
	float method2994(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II[IIIIII)V")
	void method2995(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
