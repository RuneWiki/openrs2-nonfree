import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class23_Sub3(@OriginalArg(0) Class75_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8166(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	@Override
	public void method8167() {
		super.aClass75_Sub1_22.method6838(false);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8164() {
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8161(@OriginalArg(1) boolean arg0) {
		super.aClass75_Sub1_22.method6838(true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLclient!ah;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		super.aClass75_Sub1_22.method6814(arg1);
		super.aClass75_Sub1_22.method6830(arg0);
	}
}
