import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class39_Sub5 extends Class39 {

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class39_Sub5(@OriginalArg(0) Class89_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		this.aClass89_Sub1_39.method2458(false);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		this.aClass89_Sub1_39.method2458(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		this.aClass89_Sub1_39.method2445(arg0);
	}
}
