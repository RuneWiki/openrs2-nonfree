import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class7_Sub28 extends Class7 {

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub28(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.aClass6_Sub44_34.method7076()) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 < 0 && super.anInt10186 > 2) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)I")
	public int method8314() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		if (super.aClass6_Sub44_34.method7076()) {
			return 3;
		} else if (arg0 == 0 || super.aClass6_Sub44_34.aClass7_Sub20_1.method6876() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)Z")
	public boolean method8316() {
		return !super.aClass6_Sub44_34.method7076();
	}
}
