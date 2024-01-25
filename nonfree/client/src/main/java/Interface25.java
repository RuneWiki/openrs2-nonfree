import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public interface Interface25 extends Interface27 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I")
	int method7623();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IF)F")
	float method7624(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII[IIB)V")
	void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)I")
	int method7626();

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)Z")
	boolean method7627();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!qda;IBIIII[B)V")
	void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[IIIII)V")
	void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZZ)V")
	void method7630(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(FI)F")
	float method7631(@OriginalArg(0) float arg0);
}
