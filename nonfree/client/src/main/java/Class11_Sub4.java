import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub4(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
		Static635.method8768(super.anInt10053);
	}

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
		Static635.method8768(super.anInt10053);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (super.aClass5_Sub46_30.method8195().method2908() < 96) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 < 0 || super.anInt10053 > 2) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)Z")
	public boolean method755() {
		return super.aClass5_Sub46_30.method8195().method2908() >= 96;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
		Static635.method8768(super.anInt10053);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return super.aClass5_Sub46_30.method8195().method2908() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(Z)I")
	public int method756() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		return super.aClass5_Sub46_30.method8195().method2908() < 96 ? 3 : 1;
	}
}
