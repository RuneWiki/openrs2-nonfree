import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub9(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I")
	public int method2017() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	public boolean method2019() {
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (this.method2021()) {
			if (super.aClass6_Sub44_34.aClass7_Sub19_1.method6430() && !Static88.method1289(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431())) {
				super.anInt10186 = 1;
			}
			if (super.aClass6_Sub44_34.aClass7_Sub18_1.method6279() == 1) {
				super.anInt10186 = 1;
			}
		}
		if (super.anInt10186 == 3) {
			super.anInt10186 = 2;
		}
		if (super.anInt10186 < 0 || super.anInt10186 > 3) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
	public boolean method2021() {
		return Static324.method5085(super.anInt10186);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		if (Static324.method5085(arg0)) {
			if (super.aClass6_Sub44_34.aClass7_Sub19_1.method6430() && !Static88.method1289(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431())) {
				return 3;
			}
			if (super.aClass6_Sub44_34.aClass7_Sub18_1.method6279() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static324.method5085(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}
}
