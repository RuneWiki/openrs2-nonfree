import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class14_Sub18 extends Class14 {

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub18(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 0;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)Z")
	public boolean method6213() {
		return Static640.method8743(super.anInt10543);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (this.method6213()) {
			if (super.aClass6_Sub33_31.aClass14_Sub8_1.method2643() && !Static547.method478(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640())) {
				super.anInt10543 = 1;
			}
			if (super.aClass6_Sub33_31.aClass14_Sub27_2.method8282() == 1) {
				super.anInt10543 = 1;
			}
		}
		if (super.anInt10543 == 3) {
			super.anInt10543 = 2;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 3) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Z")
	public boolean method6214() {
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		if (Static640.method8743(arg0)) {
			if (super.aClass6_Sub33_31.aClass14_Sub8_1.method2643() && !Static547.method478(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640())) {
				return 3;
			}
			if (super.aClass6_Sub33_31.aClass14_Sub27_2.method8282() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static640.method8743(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)I")
	public int method6215() {
		return super.anInt10543;
	}
}
