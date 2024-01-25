import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class12_Sub24 extends Class12 {

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub24(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Z")
	public boolean method6853() {
		return Static83.method1765(super.anInt10229);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (this.method6853()) {
			if (super.aClass5_Sub50_31.aClass12_Sub16_2.method3614() && !Static405.method7449(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616())) {
				super.anInt10229 = 1;
			}
			if (super.aClass5_Sub50_31.aClass12_Sub9_1.method2337() == 1) {
				super.anInt10229 = 1;
			}
		}
		if (super.anInt10229 == 3) {
			super.anInt10229 = 2;
		}
		if (super.anInt10229 < 0 || super.anInt10229 > 3) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		if (Static83.method1765(arg0)) {
			if (super.aClass5_Sub50_31.aClass12_Sub16_2.method3614() && !Static405.method7449(super.aClass5_Sub50_31.aClass12_Sub16_2.method3616())) {
				return 3;
			}
			if (super.aClass5_Sub50_31.aClass12_Sub9_1.method2337() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static83.method1765(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I")
	public int method6854() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Z")
	public boolean method6855() {
		return true;
	}
}
