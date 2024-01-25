import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2_Sub11(@OriginalArg(0) Class5_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)I")
	@Override
	public int method8763(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = super.aClass5_Sub36_31.method5346().method8630();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
	public int method5016() {
		return super.anInt10576;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)Z")
	public boolean method5017() {
		@Pc(10) int local10 = super.aClass5_Sub36_31.method5346().method8630();
		return local10 >= 96;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(BI)V")
	@Override
	protected void method8769(@OriginalArg(1) int arg0) {
		super.anInt10576 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)I")
	@Override
	protected int method8764() {
		return 0;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	@Override
	public void method8765() {
		@Pc(10) int local10 = super.aClass5_Sub36_31.method5346().method8630();
		if (local10 < 96) {
			super.anInt10576 = 0;
		}
		if (super.anInt10576 > 1 && local10 < 128) {
			super.anInt10576 = 1;
		}
		if (super.anInt10576 > 2 && local10 < 192) {
			super.anInt10576 = 2;
		}
		if (super.anInt10576 < 0 || super.anInt10576 > 3) {
			super.anInt10576 = this.method8764();
		}
	}
}
