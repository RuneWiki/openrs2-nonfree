import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class17_Sub18 extends Class17 {

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub18(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		return 0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		if (Static463.method6552(arg0)) {
			if (super.aClass5_Sub19_31.aClass17_Sub24_2.method8103() && !Static65.method1085(super.aClass5_Sub19_31.aClass17_Sub24_2.method8102())) {
				return 3;
			}
			if (super.aClass5_Sub19_31.lb.method1610() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static463.method6552(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)I")
	public int method6359() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (this.method6361()) {
			if (super.aClass5_Sub19_31.aClass17_Sub24_2.method8103() && !Static65.method1085(super.aClass5_Sub19_31.aClass17_Sub24_2.method8102())) {
				super.anInt10866 = 1;
			}
			if (super.aClass5_Sub19_31.lb.method1610() == 1) {
				super.anInt10866 = 1;
			}
		}
		if (super.anInt10866 == 3) {
			super.anInt10866 = 2;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 3) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Z")
	public boolean method6361() {
		return Static463.method6552(super.anInt10866);
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)Z")
	public boolean method6362() {
		return true;
	}
}
