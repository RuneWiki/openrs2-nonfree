import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class21_Sub16 extends Class21 {

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
		Static523.method7517(super.anInt11183);
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub16(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
		Static523.method7517(super.anInt11183);
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)Z")
	public boolean method5191() {
		return super.aClass14_Sub22_31.method3015().method8441() >= 96;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.method3015().method8441() < 96) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 2) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return super.aClass14_Sub22_31.method3015().method8441() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)I")
	public int method5194() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return super.aClass14_Sub22_31.method3015().method8441() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
		Static523.method7517(super.anInt11183);
	}
}
