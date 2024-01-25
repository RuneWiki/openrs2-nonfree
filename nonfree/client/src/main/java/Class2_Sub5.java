import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub5(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 2;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)I")
	public int method3269() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)Z")
	public boolean method3270() {
		if (super.aClass5_Sub36_31.method5345()) {
			return false;
		} else {
			return super.aClass5_Sub36_31.aClass2_Sub10_1.method3819() != 0;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub36_31.method5345()) {
			return 3;
		} else if (super.aClass5_Sub36_31.aClass2_Sub10_1.method3819() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		if (super.aClass5_Sub36_31.method5345()) {
			super.anInt10576 = 0;
		}
		if (super.aClass5_Sub36_31.aClass2_Sub10_1.method3819() == 0) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 2) {
			super.anInt10576 = this.method8764();
		}
	}
}
