import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class17_Sub21 extends Class17 {

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub21(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub15_31.method2432()) {
			return 3;
		} else if (super.aClass3_Sub15_31.aClass17_Sub12_1.method4577() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.aClass3_Sub15_31.method2432()) {
			super.anInt10323 = 0;
		}
		if (super.aClass3_Sub15_31.aClass17_Sub12_1.method4577() == 0) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 2) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Z")
	public boolean method6499() {
		if (super.aClass3_Sub15_31.method2432()) {
			return false;
		} else {
			return super.aClass3_Sub15_31.aClass17_Sub12_1.method4577() != 0;
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)I")
	public int method6502() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 2;
	}
}
