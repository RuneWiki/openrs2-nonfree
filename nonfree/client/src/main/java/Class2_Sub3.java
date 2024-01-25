import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class2_Sub3(@OriginalArg(0) Class63_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		this.aClass63_Sub1_30.method3337(false);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
		this.aClass63_Sub1_30.method3355(arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub1_30.method3337(true);
	}
}
