import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public interface Interface14 extends Interface13 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I")
	int method8235();

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)I")
	int method8236();

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([IIBIIIII)V")
	void method8237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZZI)V")
	void method8238(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IF)F")
	float method8239(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)Z")
	boolean method8240();

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!pw;I[BIIIII)V")
	void method8241(@OriginalArg(0) int arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FB)F")
	float method8242(@OriginalArg(0) float arg0);
}
