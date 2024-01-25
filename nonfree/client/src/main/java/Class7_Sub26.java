import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class7_Sub26 extends Class7 {

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub26(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return Static522.method7585(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z")
	public boolean method8127() {
		return Static522.method7585(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181());
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)I")
	public int method8128() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.aClass7_Sub9_2.method4180() && !Static522.method7585(super.aClass3_Sub41_31.aClass7_Sub9_2.method4181())) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 2) {
			super.anInt10115 = this.method8572();
		}
	}
}
