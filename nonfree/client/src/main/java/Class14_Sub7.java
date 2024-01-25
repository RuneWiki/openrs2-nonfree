import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class14_Sub7(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		super.aClass33_Sub3_43.method3069(false);
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub3_43.method3012(arg0);
		super.aClass33_Sub3_43.method3045(arg1);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_43.method3069(true);
	}
}
