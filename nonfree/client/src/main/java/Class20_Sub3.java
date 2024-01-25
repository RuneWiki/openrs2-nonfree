import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "F")
	private float aFloat66 = 0.0F;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "Lclient!rfa;")
	private final Class312 aClass312_2;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!wg;Lclient!rfa;)V")
	public Class20_Sub3(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class312 arg1) {
		super(arg0);
		this.aClass312_2 = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static228.aClass91_2);
		super.aClass33_Sub2_21.method8182(Static41.aClass230_1, true, false, 0);
		super.aClass33_Sub2_21.method8258(Static238.aClass230_3, 0);
		super.aClass33_Sub2_21.method8230(0);
		super.aClass33_Sub2_21.method8235(0);
		super.aClass33_Sub2_21.method8208(-16777216);
		super.aClass33_Sub2_21.method8258(Static228.aClass230_2, 0);
		this.method7962();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
		super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
		super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
		super.aClass33_Sub2_21.method8230(1);
		super.aClass33_Sub2_21.method8159((Interface14) null);
		super.aClass33_Sub2_21.method8235(0);
		super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return this.aClass312_2.method6974();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub2_21.method8235(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass33_Sub2_21.method8159((Interface14) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass312_2.aBoolean629) {
				this.aFloat66 = (float) (super.aClass33_Sub2_21.anInt9643 % 4000) / 4000.0F;
				super.aClass33_Sub2_21.method8159(this.aClass312_2.anInterface7_2);
			} else {
				@Pc(39) int local39 = super.aClass33_Sub2_21.anInt9643 % 4000 * 16 / 4000;
				super.aClass33_Sub2_21.method8159(this.aClass312_2.anInterface1Array2[local39]);
			}
		} else if (this.aClass312_2.aBoolean629) {
			super.aClass33_Sub2_21.method8159(this.aClass312_2.anInterface7_2);
		} else {
			super.aClass33_Sub2_21.method8159(this.aClass312_2.anInterface1Array2[0]);
		}
		super.aClass33_Sub2_21.method8235(0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		super.aClass33_Sub2_21.method8159(arg1);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static435.aClass91_3);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public void method7962() {
		if (super.aClass33_Sub2_21.method8178() != 0) {
			return;
		}
		@Pc(9) Class92_Sub1 local9 = super.aClass33_Sub2_21.method8256();
		super.aClass33_Sub2_21.method8235(1);
		@Pc(19) Class92_Sub1 local19 = super.aClass33_Sub2_21.method8271();
		local19.method3865(local9);
		local19.method2315(0.125F, 0.125F, 1.0F);
		local19.method2311(0.0F, this.aFloat66, 0.0F);
		super.aClass33_Sub2_21.method8286(Static255.aClass331_2);
		super.aClass33_Sub2_21.method8235(0);
	}
}
