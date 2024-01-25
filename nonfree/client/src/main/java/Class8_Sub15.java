import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class8_Sub15 extends Class8 {

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub15(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)Z")
	public boolean method6052() {
		return true;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (this.method6056()) {
			if (super.aClass4_Sub20_31.aClass8_Sub13_2.method5054() && !Static208.method3118(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052())) {
				super.anInt9788 = 1;
			}
			if (super.aClass4_Sub20_31.aClass8_Sub21_1.method7121() == 1) {
				super.anInt9788 = 1;
			}
		}
		if (super.anInt9788 == 3) {
			super.anInt9788 = 2;
		}
		if (super.anInt9788 < 0 || super.anInt9788 > 3) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I")
	public int method6055() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		if (Static676.method8964(arg0)) {
			if (super.aClass4_Sub20_31.aClass8_Sub13_2.method5054() && !Static208.method3118(super.aClass4_Sub20_31.aClass8_Sub13_2.method5052())) {
				return 3;
			}
			if (super.aClass4_Sub20_31.aClass8_Sub21_1.method7121() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static676.method8964(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	public boolean method6056() {
		return Static676.method8964(super.anInt9788);
	}
}
