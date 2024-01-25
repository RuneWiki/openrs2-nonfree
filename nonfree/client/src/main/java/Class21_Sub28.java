import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class21_Sub28 extends Class21 {

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub28(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
	public int method9104() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)Z")
	public boolean method9106() {
		if (super.aClass14_Sub22_31.method3013() == Static174.aClass77_11) {
			return !super.aClass14_Sub22_31.method3008();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.method3013() != Static174.aClass77_11) {
			super.anInt11183 = 1;
		} else if (super.aClass14_Sub22_31.method3008()) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 != 0 && super.anInt11183 != 1) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		if (super.aClass14_Sub22_31.method3013() != Static174.aClass77_11) {
			return 3;
		} else if (super.aClass14_Sub22_31.method3008()) {
			return 3;
		} else if (arg0 == 0 || super.aClass14_Sub22_31.aClass21_Sub22_1.method7709() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
}
