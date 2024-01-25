import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class7_Sub29 extends Class7 {

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub29(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.method6768() != Static483.aClass133_14) {
			super.anInt10115 = 1;
		} else if (super.aClass3_Sub41_31.method6776()) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 != 0 && super.anInt10115 != 1) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z")
	public boolean method8578() {
		if (super.aClass3_Sub41_31.method6776()) {
			return false;
		} else {
			return super.aClass3_Sub41_31.method6768() == Static483.aClass133_14;
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I")
	public int method8579() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6776()) {
			return 3;
		} else if (super.aClass3_Sub41_31.method6768() == Static483.aClass133_14) {
			return 1;
		} else {
			return 3;
		}
	}
}
