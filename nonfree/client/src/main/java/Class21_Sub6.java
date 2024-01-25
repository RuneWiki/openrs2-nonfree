import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class21_Sub6 extends Class21 {

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub6(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (this.method1932()) {
			if (super.aClass14_Sub22_31.aClass21_Sub21_2.method7544() && !Static509.method7442(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541())) {
				super.anInt11183 = 1;
			}
			if (super.aClass14_Sub22_31.aClass21_Sub15_1.method5081() == 1) {
				super.anInt11183 = 1;
			}
		}
		if (super.anInt11183 == 3) {
			super.anInt11183 = 2;
		}
		if (super.anInt11183 < 0 || super.anInt11183 > 3) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		if (Static556.method7811(arg0)) {
			if (super.aClass14_Sub22_31.aClass21_Sub21_2.method7544() && !Static509.method7442(super.aClass14_Sub22_31.aClass21_Sub21_2.method7541())) {
				return 3;
			}
			if (super.aClass14_Sub22_31.aClass21_Sub15_1.method5081() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static556.method7811(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 0;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)Z")
	public boolean method1932() {
		return Static556.method7811(super.anInt11183);
	}

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I")
	public int method1933() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)Z")
	public boolean method1934() {
		return true;
	}
}
