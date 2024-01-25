import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
	private boolean aBoolean680 = true;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
	public boolean aBoolean681 = false;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub23(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Z")
	public boolean method7835() {
		return super.aClass5_Sub36_31.method5346().method8632();
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)I")
	public int method7836() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		this.aBoolean681 = false;
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		this.aBoolean681 = true;
		return super.aClass5_Sub36_31.method5346().method8632() ? 2 : 0;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Z")
	public boolean method7837() {
		return this.aBoolean680;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub36_31.method5346().method8632()) {
			return arg0 == 3 && !Static343.method5201("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (!super.aClass5_Sub36_31.method5346().method8632()) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 5) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
	public void method7840(@OriginalArg(1) boolean arg0) {
		this.aBoolean680 = arg0;
	}
}
