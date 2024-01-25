import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class13_Sub10 extends Class13 {

	@OriginalMember(owner = "client!sia", name = "r", descriptor = "F")
	private float aFloat182 = 0.0F;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "Lclient!cda;")
	private final Class61 aClass61_7;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!kd;Lclient!cda;)V")
	public Class13_Sub10(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class61 arg1) {
		super(arg0);
		this.aClass61_7 = arg1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass57_Sub3_21.method7795(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass57_Sub3_21.method7813((Interface22) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass61_7.aBoolean95) {
				this.aFloat182 = (float) (super.aClass57_Sub3_21.anInt9168 % 4000) / 4000.0F;
				super.aClass57_Sub3_21.method7813(this.aClass61_7.anInterface19_1);
			} else {
				@Pc(80) int local80 = super.aClass57_Sub3_21.anInt9168 % 4000 * 16 / 4000;
				super.aClass57_Sub3_21.method7813(this.aClass61_7.anInterface26Array2[local80]);
			}
		} else if (this.aClass61_7.aBoolean95) {
			super.aClass57_Sub3_21.method7813(this.aClass61_7.anInterface19_1);
		} else {
			super.aClass57_Sub3_21.method7813(this.aClass61_7.anInterface26Array2[0]);
		}
		super.aClass57_Sub3_21.method7795(0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
	@Override
	public void method8268() {
		if (super.aClass57_Sub3_21.method7769() != 0) {
			return;
		}
		@Pc(13) Class203_Sub1 local13 = super.aClass57_Sub3_21.method7761();
		super.aClass57_Sub3_21.method7795(1);
		@Pc(23) Class203_Sub1 local23 = super.aClass57_Sub3_21.method7829();
		local23.method8336(local13);
		local23.method4851(0.125F, 1.0F, 0.125F);
		local23.method4846(0.0F, this.aFloat182, 0.0F);
		super.aClass57_Sub3_21.method7822(Static310.aClass357_4);
		super.aClass57_Sub3_21.method7795(0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static11.aClass34_6);
		super.aClass57_Sub3_21.method7750(false, 0, true, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7781(0, Static79.aClass312_2);
		super.aClass57_Sub3_21.method7838(0);
		super.aClass57_Sub3_21.method7795(0);
		super.aClass57_Sub3_21.method7806(-16777216);
		super.aClass57_Sub3_21.method7781(0, Static291.aClass312_3);
		this.method8268();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static313.aClass34_88);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aClass61_7.method1092();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		super.aClass57_Sub3_21.method7813(arg1);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
		super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
		super.aClass57_Sub3_21.method7838(1);
		super.aClass57_Sub3_21.method7813((Interface22) null);
		super.aClass57_Sub3_21.method7795(0);
		super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
	}
}
