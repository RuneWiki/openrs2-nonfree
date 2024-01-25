import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class14_Sub11 extends Class14 {

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub11(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I")
	public int method4676() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 0;
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)Z")
	public boolean method4678() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (this.method4684()) {
			if (super.aClass2_Sub13_31.aClass14_Sub5_2.method2946() && !Static402.method6560(super.aClass2_Sub13_31.aClass14_Sub5_2.method2945())) {
				super.anInt10835 = 1;
			}
			if (super.aClass2_Sub13_31.aClass14_Sub16_2.method5919() == 1) {
				super.anInt10835 = 1;
			}
		}
		if (super.anInt10835 == 3) {
			super.anInt10835 = 2;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 3) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		if (Static273.method4995(arg0)) {
			if (super.aClass2_Sub13_31.aClass14_Sub5_2.method2946() && !Static402.method6560(super.aClass2_Sub13_31.aClass14_Sub5_2.method2945())) {
				return 3;
			}
			if (super.aClass2_Sub13_31.aClass14_Sub16_2.method5919() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static273.method4995(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)Z")
	public boolean method4684() {
		return Static273.method4995(super.anInt10835);
	}
}
