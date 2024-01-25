import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class11_Sub7(@OriginalArg(0) Class132_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		super.aClass132_Sub3_43.method6759(arg1);
		super.aClass132_Sub3_43.method6803(arg0);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub3_43.method6776(true);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		super.aClass132_Sub3_43.method6776(false);
	}
}
