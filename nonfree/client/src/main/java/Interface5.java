import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public interface Interface5 extends Interface20 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZILclient!pn;I[B)V")
	void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) Class271 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	boolean method7312();

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	int method7313();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZIZ)V")
	void method7314(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BF)F")
	float method7315(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(BF)F")
	float method7316(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
	int method7317();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[IIIII)V")
	void method7318(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
