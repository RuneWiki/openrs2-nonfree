import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "F")
	private float aFloat243 = 0.0F;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!st;")
	private final Class315 aClass315_8;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!nv;Lclient!st;)V")
	public Class2_Sub10(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		super(arg0);
		this.aClass315_8 = arg1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return this.aClass315_8.method6724();
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
		super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
		super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		super.aClass78_Sub1_23.method6901(1);
		super.aClass78_Sub1_23.method6931(null);
		super.aClass78_Sub1_23.method6867(0);
		super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static569.aClass118_4);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6864(Static327.aClass118_2, Static569.aClass118_4);
		super.aClass78_Sub1_23.method6959(false, 0, true, Static47.aClass148_1);
		super.aClass78_Sub1_23.method6903(0, Static226.aClass148_3);
		super.aClass78_Sub1_23.method6901(0);
		super.aClass78_Sub1_23.method6867(0);
		super.aClass78_Sub1_23.method6917(-16777216);
		super.aClass78_Sub1_23.method6903(0, Static276.aClass148_4);
		this.method7890();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass78_Sub1_23.method6867(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass78_Sub1_23.method6931(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass315_8.aBoolean619) {
				this.aFloat243 = (float) (super.aClass78_Sub1_23.anInt8564 % 4000) / 4000.0F;
				super.aClass78_Sub1_23.method6931(this.aClass315_8.anInterface21_2);
			} else {
				@Pc(36) int local36 = super.aClass78_Sub1_23.anInt8564 % 4000 * 16 / 4000;
				super.aClass78_Sub1_23.method6931(this.aClass315_8.anInterface5Array1[local36]);
			}
		} else if (this.aClass315_8.aBoolean619) {
			super.aClass78_Sub1_23.method6931(this.aClass315_8.anInterface21_2);
		} else {
			super.aClass78_Sub1_23.method6931(this.aClass315_8.anInterface5Array1[0]);
		}
		super.aClass78_Sub1_23.method6867(0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	@Override
	public void method7890() {
		if (super.aClass78_Sub1_23.method6892() != 0) {
			return;
		}
		@Pc(20) Class34_Sub1 local20 = super.aClass78_Sub1_23.method6893();
		super.aClass78_Sub1_23.method6867(1);
		@Pc(30) Class34_Sub1 local30 = super.aClass78_Sub1_23.method6922();
		local30.M(local20);
		local30.method895(1.0F, 0.125F, 0.125F);
		local30.method907(0.0F, this.aFloat243, 0.0F);
		super.aClass78_Sub1_23.method6909(Static169.aClass316_3);
		super.aClass78_Sub1_23.method6867(0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		super.aClass78_Sub1_23.method6931(arg1);
	}
}
