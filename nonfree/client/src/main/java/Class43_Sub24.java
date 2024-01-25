import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class43_Sub24 extends Class43 {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub24(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.aClass14_Sub26_32.method5271() != Static344.aClass80_7) {
			super.anInt10397 = 1;
		} else if (super.aClass14_Sub26_32.method5276()) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 != 0 && super.anInt10397 != 1) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		if (super.aClass14_Sub26_32.method5276()) {
			return 3;
		} else if (super.aClass14_Sub26_32.method5271() == Static344.aClass80_7) {
			if (arg0 == 0) {
				if (super.aClass14_Sub26_32.aClass43_Sub21_1.method5857() == 1) {
					return 2;
				}
				if (super.aClass14_Sub26_32.aClass43_Sub5_1.method1872() == 1) {
					return 2;
				}
				if (super.aClass14_Sub26_32.aClass43_Sub14_1.method4225() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	public int method7390() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	public boolean method7393() {
		if (super.aClass14_Sub26_32.method5276()) {
			return false;
		} else {
			return super.aClass14_Sub26_32.method5271() == Static344.aClass80_7;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 1;
	}
}
