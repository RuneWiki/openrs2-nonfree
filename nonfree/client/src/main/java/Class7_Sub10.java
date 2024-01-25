import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class7_Sub10 extends Class7 {

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub10(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(I)I")
	public int method2536() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.aClass6_Sub44_34.method7076()) {
			super.anInt10186 = 2;
		}
		if (super.anInt10186 < 0 || super.anInt10186 > 2) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		return super.aClass6_Sub44_34.method7076() ? 3 : 1;
	}

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "(I)Z")
	public boolean method2538() {
		return !super.aClass6_Sub44_34.method7076();
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		if (super.aClass6_Sub44_34.method7076()) {
			return 2;
		} else if (super.aClass6_Sub44_34.aClass7_Sub19_1.method6430() && Static605.method8337(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431())) {
			return 1;
		} else {
			return 0;
		}
	}
}
