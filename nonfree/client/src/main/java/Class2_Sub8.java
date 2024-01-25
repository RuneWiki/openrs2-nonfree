import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub8(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
	public boolean method3765() {
		return !super.aClass5_Sub36_31.method5345();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.aClass5_Sub36_31.method5345()) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 < 0 && super.anInt10576 > 2) {
			super.anInt10576 = this.method8764();
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)I")
	public int method3768() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub36_31.method5345()) {
			return 3;
		} else if (arg0 == 0 || super.aClass5_Sub36_31.aClass2_Sub4_1.method2242() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 1;
	}
}
