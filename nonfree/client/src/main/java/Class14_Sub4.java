import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub4(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6698() == Static499.aClass203_8) {
			super.anInt10805 = 2;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 1;
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(I)I")
	public int method1810() {
		return super.anInt10805;
	}
}
