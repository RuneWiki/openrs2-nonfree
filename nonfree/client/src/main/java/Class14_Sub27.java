import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class14_Sub27 extends Class14 {

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub27(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6704()) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 && super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	public boolean method8409() {
		return !super.aClass3_Sub41_31.method6704();
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return 1;
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)I")
	public int method8410() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6704()) {
			return 3;
		} else if (arg0 == 0 || super.aClass3_Sub41_31.aClass14_Sub21_1.method6184() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}
}
