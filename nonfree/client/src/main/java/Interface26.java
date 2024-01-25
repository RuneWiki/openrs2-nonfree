import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public interface Interface26 extends Interface22 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IF)F")
	float method4346(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
	int method4347();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIZ)V")
	void method4348(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I")
	int method4349();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([IIIIIII)V")
	void method4350(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([IIBIIIII)V")
	void method4351(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
	boolean method4352();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BF)F")
	float method4353(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[BIIIIILclient!eu;I)V")
	void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) Class114 arg4);
}
