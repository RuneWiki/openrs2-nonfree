import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public interface Interface6 extends Interface10 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Z")
	boolean method8499();

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	int method8500();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
	int method8501();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(FI)F")
	float method8502(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IF)F")
	float method8503(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[IIII)V")
	void method8504(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!iv;[BIIZI)V")
	void method8505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZI)V")
	void method8506(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[IIIIII)V")
	void method8507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
