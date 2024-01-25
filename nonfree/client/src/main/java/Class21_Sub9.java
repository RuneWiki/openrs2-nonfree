import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class21_Sub9 extends Class21 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub9(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 0;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Z")
	public boolean method2371() {
		return Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541());
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)I")
	public int method2372() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.aClass21_Sub21_2.method7544() && !Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541())) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 2) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return Static120.method7602(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}
}
