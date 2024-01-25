import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface Interface6 extends Interface12 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(FI)F")
	float method9269(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III[BBLclient!hd;III)V")
	void method9270(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(5) Class145 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I")
	int method9271();

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	boolean method9272();

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[IIIIIII)V")
	void method9273(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIII[I)V")
	void method9274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int[] arg2);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZBZ)V")
	void method9275(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(FB)F")
	float method9276(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
	int method9277();
}
