import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class36_Sub6(@OriginalArg(0) Class26_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		super.aClass26_Sub1_43.method708(false);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		super.aClass26_Sub1_43.method673(arg0);
		super.aClass26_Sub1_43.method669(arg1);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		super.aClass26_Sub1_43.method708(true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}
}
