import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class36_Sub11 extends Class36 {

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub11(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		if (super.aClass8_Sub25_31.method3471()) {
			return 2;
		} else if (super.aClass8_Sub25_31.aClass36_Sub19_2.method6361() && Static510.method7351(super.aClass8_Sub25_31.aClass36_Sub19_2.method6358())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)Z")
	public boolean method4434() {
		return !super.aClass8_Sub25_31.method3471();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)I")
	public int method4435() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return super.aClass8_Sub25_31.method3471() ? 3 : 1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3471()) {
			super.anInt10496 = 2;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}
}
