import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class21_Sub27 extends Class21 {

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub27(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
	public int method8612() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)Z")
	public boolean method8613() {
		if (super.aClass14_Sub22_31.method3008()) {
			return false;
		} else {
			return super.aClass14_Sub22_31.method3013() == Static174.aClass77_11;
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		if (super.aClass14_Sub22_31.method3008()) {
			return 3;
		} else if (super.aClass14_Sub22_31.method3013() == Static174.aClass77_11) {
			return 1;
		} else {
			return 3;
		}
	}
}
