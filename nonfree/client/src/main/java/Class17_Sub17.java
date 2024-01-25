import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class17_Sub17 extends Class17 {

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub17(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.aClass3_Sub15_31.aClass17_Sub20_1.method6399() && !Static510.method7228(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402())) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 2) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		return Static510.method7228(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Z")
	public boolean method5806() {
		return Static510.method7228(super.aClass3_Sub15_31.aClass17_Sub20_1.method6402());
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
	public int method5808() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 0;
	}
}
