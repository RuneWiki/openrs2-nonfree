import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Z")
	public boolean aBoolean606 = false;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
	private boolean aBoolean607 = true;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub21(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILclient!fca;)V")
	public Class6_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
	public void method6966(@OriginalArg(0) boolean arg0) {
		this.aBoolean607 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
	@Override
	public int method8960(@OriginalArg(0) int arg0) {
		if (super.aClass3_Sub22_31.method2838().method189()) {
			return arg0 == 3 && !Static337.method5081("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z")
	public boolean method6967() {
		return super.aClass3_Sub22_31.method2838().method189();
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Z")
	public boolean method6968() {
		return this.aBoolean607;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	@Override
	protected int method8962() {
		this.aBoolean606 = true;
		return super.aClass3_Sub22_31.method2838().method189() ? 2 : 0;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int method6970() {
		return super.anInt10233;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IB)V")
	@Override
	protected void method8961(@OriginalArg(0) int arg0) {
		super.anInt10233 = arg0;
		this.aBoolean606 = false;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	@Override
	public void method8964() {
		if (!super.aClass3_Sub22_31.method2838().method189()) {
			super.anInt10233 = 0;
		}
		if (super.anInt10233 < 0 || super.anInt10233 > 5) {
			super.anInt10233 = this.method8962();
		}
	}
}
