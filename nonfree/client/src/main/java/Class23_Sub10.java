import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class23_Sub10 extends Class23 {

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub10(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)I")
	public int method3567() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (this.method3572()) {
			if (super.aClass3_Sub48_31.aClass23_Sub18_2.method5154() && !Static34.method622(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152())) {
				super.anInt10359 = 1;
			}
			if (super.aClass3_Sub48_31.aClass23_Sub9_1.method3448() == 1) {
				super.anInt10359 = 1;
			}
		}
		if (super.anInt10359 == 3) {
			super.anInt10359 = 2;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 3) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		if (Static223.method4291(arg0)) {
			if (super.aClass3_Sub48_31.aClass23_Sub18_2.method5154() && !Static34.method622(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152())) {
				return 3;
			}
			if (super.aClass3_Sub48_31.aClass23_Sub9_1.method3448() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static223.method4291(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)Z")
	public boolean method3569() {
		return true;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 0;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(B)Z")
	public boolean method3572() {
		return Static223.method4291(super.anInt10359);
	}
}
