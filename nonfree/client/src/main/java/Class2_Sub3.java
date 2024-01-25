import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub3(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub36_31.method5345()) {
			return 3;
		} else if (super.aClass5_Sub36_31.method5351() == Static137.aClass174_1) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
	public boolean method2010() {
		if (super.aClass5_Sub36_31.method5345()) {
			return false;
		} else {
			return super.aClass5_Sub36_31.method5351() == Static137.aClass174_1;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 1;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I")
	public int method2012() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.aClass5_Sub36_31.method5351() != Static137.aClass174_1) {
			super.anInt10576 = 1;
		} else if (super.aClass5_Sub36_31.method5345()) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 != 0 && super.anInt10576 != 1) {
			super.anInt10576 = this.method8764();
		}
	}
}
