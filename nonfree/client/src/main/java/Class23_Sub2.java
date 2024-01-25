import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class23_Sub2(@OriginalArg(0) Class59_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
		this.aClass59_Sub1_41.method4296(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		this.aClass59_Sub1_41.method4291(true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		this.aClass59_Sub1_41.method4291(false);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
	}
}
