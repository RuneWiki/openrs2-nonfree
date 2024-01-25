import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public interface Interface7 extends Interface3 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
	int method7046();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZIZ)V")
	void method7047(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII[III)V")
	void method7048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	int method7049();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([BIIILclient!kf;ZIII)V")
	void method7050(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)Z")
	boolean method7051();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(FI)F")
	float method7052(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(FB)F")
	float method7053(@OriginalArg(0) float arg0);
}
