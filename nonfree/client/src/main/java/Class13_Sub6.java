import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class13_Sub6(@OriginalArg(0) Class122_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		super.aClass122_Sub3_40.method6850(arg0);
		super.aClass122_Sub3_40.method6875(arg1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub3_40.method6931(true);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		super.aClass122_Sub3_40.method6931(false);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
