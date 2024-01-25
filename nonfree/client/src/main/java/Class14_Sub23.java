import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class14_Sub23 extends Class14 {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub23(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Z")
	public boolean method6424() {
		if (super.aClass3_Sub41_31.method6704()) {
			return false;
		} else {
			return super.aClass3_Sub41_31.method6698() == Static342.aClass203_6;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6704()) {
			return 3;
		} else if (super.aClass3_Sub41_31.method6698() == Static342.aClass203_6) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6698() != Static342.aClass203_6) {
			super.anInt10805 = 1;
		} else if (super.aClass3_Sub41_31.method6704()) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 != 0 && super.anInt10805 != 1) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
	public int method6428() {
		return super.anInt10805;
	}
}
