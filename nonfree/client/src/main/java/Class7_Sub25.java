import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class7_Sub25 extends Class7 {

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub25(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)I")
	public int method7631() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
	public boolean method7632() {
		return Static7.method90(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431(), (byte) -120);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.aClass6_Sub44_34.aClass7_Sub19_1.method6430() && !Static7.method90(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431(), (byte) -128)) {
			super.anInt10186 = 0;
		}
		if (super.anInt10186 < 0 || super.anInt10186 > 2) {
			super.anInt10186 = this.method8782();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		return Static7.method90(super.aClass6_Sub44_34.aClass7_Sub19_1.method6431(), (byte) -118) ? 1 : 3;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}
}
