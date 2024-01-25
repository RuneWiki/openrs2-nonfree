import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub24(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 1;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)I")
	public int method7984() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		return arg0 == 0 || super.aClass5_Sub36_31.aClass2_Sub4_1.method2242() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)Z")
	public boolean method7987() {
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.anInt10576 != 0 && super.aClass5_Sub36_31.aClass2_Sub4_1.method2242() != 1) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 1) {
			super.anInt10576 = this.method8764();
		}
	}
}
