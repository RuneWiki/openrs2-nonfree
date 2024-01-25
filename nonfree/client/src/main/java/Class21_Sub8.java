import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class21_Sub8 extends Class21 {

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub8(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)I")
	public int method2132() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "(I)Z")
	public boolean method2133() {
		return !super.aClass14_Sub22_31.method3008();
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.method3008()) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 < 0 && super.anInt11183 > 2) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		if (super.aClass14_Sub22_31.method3008()) {
			return 3;
		} else if (arg0 == 0 || super.aClass14_Sub22_31.aClass21_Sub22_1.method7709() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}
}
