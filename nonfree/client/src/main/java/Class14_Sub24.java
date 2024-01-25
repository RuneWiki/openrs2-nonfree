import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class14_Sub24 extends Class14 {

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub24(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Z")
	public boolean method6454() {
		return Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899());
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.aClass14_Sub7_2.method2902() && !Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899())) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 1) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
	public int method6457() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return Static376.method4978(super.aClass3_Sub41_31.aClass14_Sub7_2.method2899()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 0;
	}
}
