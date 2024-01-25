import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Z")
	private boolean aBoolean357 = true;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub9(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		this.aBoolean358 = false;
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	public boolean method4178() {
		return super.aClass3_Sub41_31.method6771().method7214();
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	public boolean method4180() {
		return this.aBoolean357;
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I")
	public int method4181() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub41_31.method6771().method7214()) {
			return arg0 == 3 && !Static570.method3079("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		this.aBoolean358 = true;
		return super.aClass3_Sub41_31.method6771().method7214() ? 2 : 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
	public void method4184(@OriginalArg(0) boolean arg0) {
		this.aBoolean357 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (!super.aClass3_Sub41_31.method6771().method7214()) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 5) {
			super.anInt10115 = this.method8572();
		}
	}
}
