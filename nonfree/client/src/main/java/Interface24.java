import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public interface Interface24 extends Interface10 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIZ)V")
	void method7475(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BF)F")
	float method7476(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIBIII)V")
	void method7477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
	int method7478();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIIII)V")
	void method7479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!kca;[BIIIIIII)V")
	void method7480(@OriginalArg(0) Class182 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Z")
	boolean method7481();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(FI)F")
	float method7482(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	int method7483();
}
