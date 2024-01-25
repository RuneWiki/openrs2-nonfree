import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface Interface17 extends Interface11 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	int method6966();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII[IBII)V")
	void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
	int method6968();

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Z")
	boolean method6969();

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FI)F")
	float method6970(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[BIIIILclient!sq;I)V")
	void method6971(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class314 arg4);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FZ)F")
	float method6972(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIZ)V")
	void method6973(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);
}
