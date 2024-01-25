import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class72_Sub11 extends Class72 {

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "F")
	private float aFloat159 = 0.0F;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!tt;")
	private final Class331 aClass331_8;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!mj;Lclient!tt;)V")
	public Class72_Sub11(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class331 arg1) {
		super(arg0);
		this.aClass331_8 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass45_Sub2_22.method4961(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass45_Sub2_22.method4926(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass331_8.aBoolean638) {
				this.aFloat159 = (float) (super.aClass45_Sub2_22.anInt5856 % 4000) / 4000.0F;
				super.aClass45_Sub2_22.method4926(this.aClass331_8.anInterface14_2);
			} else {
				@Pc(70) int local70 = super.aClass45_Sub2_22.anInt5856 % 4000 * 16 / 4000;
				super.aClass45_Sub2_22.method4926(this.aClass331_8.anInterface17Array2[local70]);
			}
		} else if (this.aClass331_8.aBoolean638) {
			super.aClass45_Sub2_22.method4926(this.aClass331_8.anInterface14_2);
		} else {
			super.aClass45_Sub2_22.method4926(this.aClass331_8.anInterface17Array2[0]);
		}
		super.aClass45_Sub2_22.method4961(0);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
	@Override
	public void method7191() {
		if (super.aClass45_Sub2_22.method5006() != 0) {
			return;
		}
		@Pc(9) Class11_Sub1 local9 = super.aClass45_Sub2_22.method4970();
		super.aClass45_Sub2_22.method4961(1);
		@Pc(19) Class11_Sub1 local19 = super.aClass45_Sub2_22.method5007();
		local19.M(local9);
		local19.method166(0.125F, 1.0F, 0.125F);
		local19.method171(0.0F, this.aFloat159, 0.0F);
		super.aClass45_Sub2_22.method4932(Static586.aClass222_7);
		super.aClass45_Sub2_22.method4961(0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
		super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4944(1);
		super.aClass45_Sub2_22.method4926(null);
		super.aClass45_Sub2_22.method4961(0);
		super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aClass331_8.method6941();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static19.aClass307_1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static177.aClass307_2);
		super.aClass45_Sub2_22.method5010(0, false, true, Static164.aClass108_3);
		super.aClass45_Sub2_22.method4900(0, Static160.aClass108_2);
		super.aClass45_Sub2_22.method4944(0);
		super.aClass45_Sub2_22.method4961(0);
		super.aClass45_Sub2_22.method4912(-16777216);
		super.aClass45_Sub2_22.method4900(0, Static62.aClass108_1);
		this.method7191();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass45_Sub2_22.method4926(arg1);
	}
}
