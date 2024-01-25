import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class14_Sub22 extends Class14 {

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
		Static373.method6256(super.anInt10835);
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub22(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
		Static373.method6256(super.anInt10835);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.aClass2_Sub13_31.method2606().method7486() < 96) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 2) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		return super.aClass2_Sub13_31.method2606().method7486() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
		Static373.method6256(super.anInt10835);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return super.aClass2_Sub13_31.method2606().method7486() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I")
	public int method6941() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)Z")
	public boolean method6943() {
		return super.aClass2_Sub13_31.method2606().method7486() >= 96;
	}
}
