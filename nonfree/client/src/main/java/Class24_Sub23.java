import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class24_Sub23 extends Class24 {

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub23(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		if (Static380.method5562(arg0)) {
			if (super.aClass5_Sub20_30.aClass24_Sub10_1.method3155() && !Static507.method7442(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153())) {
				return 3;
			}
			if (super.aClass5_Sub20_30.aClass24_Sub7_1.method2574() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static380.method5562(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z")
	public boolean method7043() {
		return Static380.method5562(super.anInt10335);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 0;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
	public boolean method7044() {
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (this.method7043()) {
			if (super.aClass5_Sub20_30.aClass24_Sub10_1.method3155() && !Static507.method7442(super.aClass5_Sub20_30.aClass24_Sub10_1.method3153())) {
				super.anInt10335 = 1;
			}
			if (super.aClass5_Sub20_30.aClass24_Sub7_1.method2574() == 1) {
				super.anInt10335 = 1;
			}
		}
		if (super.anInt10335 == 3) {
			super.anInt10335 = 2;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 3) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(Z)I")
	public int method7045() {
		return super.anInt10335;
	}
}
