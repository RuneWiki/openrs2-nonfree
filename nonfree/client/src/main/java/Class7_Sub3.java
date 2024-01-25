import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
		Static497.method5001(super.anInt10115);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub3(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		Static497.method5001(super.anInt10115);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub41_31.method6771().method7216() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		if (super.aClass3_Sub41_31.method6771().method7216() < 96) {
			super.anInt10115 = 0;
		}
		if (super.anInt10115 < 0 || super.anInt10115 > 2) {
			super.anInt10115 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	public int method1268() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
		Static497.method5001(super.anInt10115);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return super.aClass3_Sub41_31.method6771().method7216() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)Z")
	public boolean method1271() {
		return super.aClass3_Sub41_31.method6771().method7216() >= 96;
	}
}
