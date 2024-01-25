import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class34_Sub4 extends Class34 {

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "F")
	private float aFloat19 = 0.0F;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!uk;")
	private final Class331 aClass331_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!hea;Lclient!uk;)V")
	public Class34_Sub4(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class331 arg1) {
		super(arg0);
		this.aClass331_1 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6766(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass134_Sub1_21.method6788(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass134_Sub1_21.method6766(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass331_1.aBoolean694) {
				this.aFloat19 = (float) (super.aClass134_Sub1_21.anInt8444 % 4000) / 4000.0F;
				super.aClass134_Sub1_21.method6766(this.aClass331_1.anInterface11_2);
			} else {
				@Pc(60) int local60 = super.aClass134_Sub1_21.anInt8444 % 4000 * 16 / 4000;
				super.aClass134_Sub1_21.method6766(this.aClass331_1.anInterface14Array1[local60]);
			}
		} else if (this.aClass331_1.aBoolean694) {
			super.aClass134_Sub1_21.method6766(this.aClass331_1.anInterface11_2);
		} else {
			super.aClass134_Sub1_21.method6766(this.aClass331_1.anInterface14Array1[0]);
		}
		super.aClass134_Sub1_21.method6788(0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6770(Static59.aClass82_2, Static447.aClass82_5);
		super.aClass134_Sub1_21.method6791(true, Static430.aClass192_2, 0, false);
		super.aClass134_Sub1_21.method6816(0, Static493.aClass192_4);
		super.aClass134_Sub1_21.method6852(0);
		super.aClass134_Sub1_21.method6788(0);
		super.aClass134_Sub1_21.method6738(-16777216);
		super.aClass134_Sub1_21.method6816(0, Static308.aClass192_1);
		this.method7018();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		super.aClass134_Sub1_21.method6788(1);
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static292.aClass82_4);
		super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
		super.aClass134_Sub1_21.method6852(1);
		super.aClass134_Sub1_21.method6766(null);
		super.aClass134_Sub1_21.method6788(0);
		super.aClass134_Sub1_21.method6816(0, Static430.aClass192_2);
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aClass331_1.method7305();
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6770(Static292.aClass82_4, Static447.aClass82_5);
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
	@Override
	public void method7018() {
		if (super.aClass134_Sub1_21.method6754() != 0) {
			return;
		}
		@Pc(13) Class113_Sub3 local13 = super.aClass134_Sub1_21.method6787();
		super.aClass134_Sub1_21.method6788(1);
		@Pc(23) Class113_Sub3 local23 = super.aClass134_Sub1_21.method6748();
		local23.M(local13);
		local23.method6057(0.125F, 0.125F, 1.0F);
		local23.method6070(0.0F, this.aFloat19, 0.0F);
		super.aClass134_Sub1_21.method6808(Static130.aClass309_3);
		super.aClass134_Sub1_21.method6788(0);
	}
}
