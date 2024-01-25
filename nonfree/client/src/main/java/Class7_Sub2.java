import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub2(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.aClass6_Sub44_34.method7083() != Static517.aClass121_8) {
			super.anInt10186 = 1;
		} else if (super.aClass6_Sub44_34.method7076()) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 != 0 && super.anInt10186 != 1) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I")
	public int method236() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub44_34.method7083() != Static517.aClass121_8) {
			return 3;
		} else if (super.aClass6_Sub44_34.method7076()) {
			return 3;
		} else if (arg0 == 0 || super.aClass6_Sub44_34.aClass7_Sub20_1.method6876() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "(I)Z")
	public boolean method238() {
		if (super.aClass6_Sub44_34.method7083() == Static517.aClass121_8) {
			return !super.aClass6_Sub44_34.method7076();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 1;
	}
}
