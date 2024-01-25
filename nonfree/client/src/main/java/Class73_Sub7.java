import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class73_Sub7 extends Class73 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "F")
	private float aFloat149 = 0.0F;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!lba;")
	private final Class173 aClass173_5;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!bda;Lclient!lba;)V")
	public Class73_Sub7(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class173 arg1) {
		super(arg0);
		this.aClass173_5 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super.aClass4_Sub2_19.method7316(arg1);
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	@Override
	public void method7573() {
		if (super.aClass4_Sub2_19.method7287() != 0) {
			return;
		}
		@Pc(17) Class128_Sub3 local17 = super.aClass4_Sub2_19.method7331();
		super.aClass4_Sub2_19.method7339(1);
		@Pc(27) Class128_Sub3 local27 = super.aClass4_Sub2_19.method7349();
		local27.EA(local17);
		local27.method6906(1.0F, 0.125F, 0.125F);
		local27.method6898(0.0F, this.aFloat149, 0.0F);
		super.aClass4_Sub2_19.method7272(Static159.aClass107_2);
		super.aClass4_Sub2_19.method7339(0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		super.aClass4_Sub2_19.method7339(1);
		super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
		super.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
		super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
		super.aClass4_Sub2_19.method7231(1);
		super.aClass4_Sub2_19.method7316(null);
		super.aClass4_Sub2_19.method7339(0);
		super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static459.aClass246_5);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return this.aClass173_5.method4735();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7339(1);
		super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static157.aClass246_1);
		super.aClass4_Sub2_19.method7351(true, false, 0, Static360.aClass27_5);
		super.aClass4_Sub2_19.method7330(Static226.aClass27_1, 0);
		super.aClass4_Sub2_19.method7231(0);
		super.aClass4_Sub2_19.method7339(0);
		super.aClass4_Sub2_19.method7275(-16777216);
		super.aClass4_Sub2_19.method7330(Static319.aClass27_4, 0);
		this.method7573();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass4_Sub2_19.method7339(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass4_Sub2_19.method7316(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass173_5.aBoolean380) {
				this.aFloat149 = (float) (super.aClass4_Sub2_19.anInt8322 % 4000) / 4000.0F;
				super.aClass4_Sub2_19.method7316(this.aClass173_5.anInterface3_1);
			} else {
				@Pc(34) int local34 = super.aClass4_Sub2_19.anInt8322 % 4000 * 16 / 4000;
				super.aClass4_Sub2_19.method7316(this.aClass173_5.anInterface5Array2[local34]);
			}
		} else if (this.aClass173_5.aBoolean380) {
			super.aClass4_Sub2_19.method7316(this.aClass173_5.anInterface3_1);
		} else {
			super.aClass4_Sub2_19.method7316(this.aClass173_5.anInterface5Array2[0]);
		}
		super.aClass4_Sub2_19.method7339(0);
	}
}
