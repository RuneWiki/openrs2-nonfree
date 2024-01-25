import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub27(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (Static542.method7479(arg0)) {
			if (super.aClass2_Sub5_50.aClass6_Sub21_2.method7279() && !Static462.method6282(super.aClass2_Sub5_50.aClass6_Sub21_2.method7280())) {
				return 3;
			}
			if (super.aClass2_Sub5_50.aClass6_Sub28_2.method8437() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static542.method7479(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Z")
	public boolean method8297() {
		return Static542.method7479(super.anInt10283);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		if (this.method8297()) {
			if (super.aClass2_Sub5_50.aClass6_Sub21_2.method7279() && !Static462.method6282(super.aClass2_Sub5_50.aClass6_Sub21_2.method7280())) {
				super.anInt10283 = 1;
			}
			if (super.aClass2_Sub5_50.aClass6_Sub28_2.method8437() == 1) {
				super.anInt10283 = 1;
			}
		}
		if (super.anInt10283 == 3) {
			super.anInt10283 = 2;
		}
		if (super.anInt10283 < 0 || super.anInt10283 > 3) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 0;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)Z")
	public boolean method8299() {
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)I")
	public int method8300() {
		return super.anInt10283;
	}
}
