import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class120_Sub9 extends Class120 {

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class120_Sub9(@OriginalArg(0) Class5_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
		super.aClass5_Sub3_20.method6309(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
	}
}
