import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub26(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)I")
	public int method8525() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.aClass5_Sub36_31.method5351() == Static478.aClass174_6) {
			super.anInt10576 = 2;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 2) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 1;
	}
}
