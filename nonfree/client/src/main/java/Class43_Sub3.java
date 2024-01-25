import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub3(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		if (super.aClass14_Sub26_32.method5276()) {
			return 2;
		} else if (super.aClass14_Sub26_32.aClass43_Sub1_1.method797() && Static86.method1437(super.aClass14_Sub26_32.aClass43_Sub1_1.method801())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)I")
	public int method1380() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return super.aClass14_Sub26_32.method5276() ? 3 : 1;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z")
	public boolean method1383() {
		return !super.aClass14_Sub26_32.method5276();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.aClass14_Sub26_32.method5276()) {
			super.anInt10397 = 2;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 2) {
			super.anInt10397 = this.method8889();
		}
	}
}
