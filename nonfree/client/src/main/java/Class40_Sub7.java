import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class40_Sub7 extends Class40 {

	static {
		new Class231("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class40_Sub7(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_41.method3800(true);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		super.aClass75_Sub2_41.method3844(arg1);
		super.aClass75_Sub2_41.method3798(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		super.aClass75_Sub2_41.method3800(false);
	}
}
