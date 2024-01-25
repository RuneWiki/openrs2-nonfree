import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class35_Sub1(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	@Override
	public void method5198(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
	@Override
	public void method5200(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	@Override
	public void method5195(@OriginalArg(0) boolean arg0) {
		this.aClass4_Sub1_35.method548(true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()V")
	@Override
	public void method5197() {
		this.aClass4_Sub1_35.method548(false);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()Z")
	@Override
	public boolean method5199() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!lp;)V")
	@Override
	public void method5196(@OriginalArg(0) Class124 arg0) {
		this.aClass4_Sub1_35.method602(arg0);
	}
}
