import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class43_Sub13 extends Class43 {

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub13(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z")
	public boolean method4211() {
		return true;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		if (Static83.method1422(arg0)) {
			if (super.aClass14_Sub26_32.aClass43_Sub1_1.method797() && !Static407.method2864(super.aClass14_Sub26_32.aClass43_Sub1_1.method801())) {
				return 3;
			}
			if (super.aClass14_Sub26_32.aClass43_Sub15_2.method4526() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static83.method1422(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (this.method4216()) {
			if (super.aClass14_Sub26_32.aClass43_Sub1_1.method797() && !Static407.method2864(super.aClass14_Sub26_32.aClass43_Sub1_1.method801())) {
				super.anInt10397 = 1;
			}
			if (super.aClass14_Sub26_32.aClass43_Sub15_2.method4526() == 1) {
				super.anInt10397 = 1;
			}
		}
		if (super.anInt10397 == 3) {
			super.anInt10397 = 2;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 3) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)I")
	public int method4215() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z")
	public boolean method4216() {
		return Static83.method1422(super.anInt10397);
	}
}
