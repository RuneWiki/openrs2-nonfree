import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class21_Sub29 extends Class21 {

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub29(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.aClass21_Sub21_2.method7544() && !Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541())) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 1) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)I")
	public int method9295() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(I)Z")
	public boolean method9298() {
		return Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541());
	}
}
