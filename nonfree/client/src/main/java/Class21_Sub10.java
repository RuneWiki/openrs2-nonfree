import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class21_Sub10 extends Class21 {

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub10(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.aClass14_Sub22_31.method3008()) {
			super.anInt11183 = 0;
		}
		if (super.anInt11183 != 1 && super.anInt11183 != 0) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)Z")
	public boolean method2382() {
		return !super.aClass14_Sub22_31.method3008();
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return super.aClass14_Sub22_31.method3008() ? 3 : 1;
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)I")
	public int method2383() {
		return super.anInt11183;
	}
}
