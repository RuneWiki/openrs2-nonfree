import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class93_Sub7 extends Class93 {

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "F")
	private float aFloat197 = 0.0F;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "Lclient!mca;")
	private final Class217 aClass217_6;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!ej;Lclient!mca;)V")
	public Class93_Sub7(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class217 arg1) {
		super(arg0);
		this.aClass217_6 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		super.aClass66_Sub1_19.method6895(1);
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
		super.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
		super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
		super.aClass66_Sub1_19.method6885(1);
		super.aClass66_Sub1_19.method6979(null);
		super.aClass66_Sub1_19.method6895(0);
		super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass66_Sub1_19.method6979(arg1);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return this.aClass217_6.method4879();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method7994() {
		if (super.aClass66_Sub1_19.method6966() != 0) {
			return;
		}
		@Pc(9) Class134_Sub1 local9 = super.aClass66_Sub1_19.method6869();
		super.aClass66_Sub1_19.method6895(1);
		@Pc(19) Class134_Sub1 local19 = super.aClass66_Sub1_19.method6953();
		local19.la(local9);
		local19.method3399(1.0F, 0.125F, 0.125F);
		local19.method3408(this.aFloat197, 0.0F, 0.0F);
		super.aClass66_Sub1_19.method6933(Static482.aClass81_7);
		super.aClass66_Sub1_19.method6895(0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass66_Sub1_19.method6895(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass66_Sub1_19.method6979(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass217_6.aBoolean428) {
				this.aFloat197 = (float) (super.aClass66_Sub1_19.anInt8419 % 4000) / 4000.0F;
				super.aClass66_Sub1_19.method6979(this.aClass217_6.anInterface12_1);
			} else {
				@Pc(66) int local66 = super.aClass66_Sub1_19.anInt8419 % 4000 * 16 / 4000;
				super.aClass66_Sub1_19.method6979(this.aClass217_6.anInterface2Array2[local66]);
			}
		} else if (this.aClass217_6.aBoolean428) {
			super.aClass66_Sub1_19.method6979(this.aClass217_6.anInterface12_1);
		} else {
			super.aClass66_Sub1_19.method6979(this.aClass217_6.anInterface2Array2[0]);
		}
		super.aClass66_Sub1_19.method6895(0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6895(1);
		super.aClass66_Sub1_19.method6997(Static598.aClass240_5, Static174.aClass240_2);
		super.aClass66_Sub1_19.method6959(0, true, false, Static22.aClass120_2);
		super.aClass66_Sub1_19.method6866(Static232.aClass120_4, 0);
		super.aClass66_Sub1_19.method6885(0);
		super.aClass66_Sub1_19.method6895(0);
		super.aClass66_Sub1_19.method6932(-16777216);
		super.aClass66_Sub1_19.method6866(Static19.aClass120_1, 0);
		this.method7994();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static174.aClass240_2);
	}
}
