import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub2(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6776()) {
			return 3;
		} else if (super.aClass3_Sub41_31.aClass7_Sub28_1.method8245() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
	public boolean method982() {
		if (super.aClass3_Sub41_31.method6776()) {
			return false;
		} else {
			return super.aClass3_Sub41_31.aClass7_Sub28_1.method8245() != 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	public int method984() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 2;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.method6776()) {
			super.anInt10115 = 0;
		}
		if (super.aClass3_Sub41_31.aClass7_Sub28_1.method8245() == 0) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 2) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}
}
