import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public interface Interface19 extends Interface17 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIII[II)V")
	void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)Z")
	boolean method3131();

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIBII[II)V")
	void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int[] arg2);

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)I")
	int method3133();

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I")
	int method3134();

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([BILclient!kea;IIIIII)V")
	void method3135(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BF)F")
	float method3136(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IF)F")
	float method3137(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZBZ)V")
	void method3138(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);
}
