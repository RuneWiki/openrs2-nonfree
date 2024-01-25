import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class14_Sub18 extends Class14 {

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub18(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		Static115.method1732(super.anInt10805);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
		Static115.method1732(super.anInt10805);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
		Static115.method1732(super.anInt10805);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub41_31.method6699().method8234() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	public int method5807() {
		return super.anInt10805;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	public boolean method5808() {
		return super.aClass3_Sub41_31.method6699().method8234() >= 96;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.aClass3_Sub41_31.method6699().method8234() < 96) {
			super.anInt10805 = 0;
		}
		if (super.anInt10805 < 0 || super.anInt10805 > 2) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return super.aClass3_Sub41_31.method6699().method8234() < 96 ? 0 : 2;
	}
}
