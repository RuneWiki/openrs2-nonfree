import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public interface Interface3 extends Interface15 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
	int method7315();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	boolean method7316();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IF)F")
	float method7317(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZIZ)V")
	void method7318(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I")
	int method7319();

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BF)F")
	float method7320(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II[BIBLclient!uda;III)V")
	void method7321(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class292 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III[IIIII)V")
	void method7322(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);
}
