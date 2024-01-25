import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "F")
	private float aFloat141 = 0.0F;

	@OriginalMember(owner = "client!tda", name = "l", descriptor = "Lclient!ic;")
	private final Class172 aClass172_4;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!jca;Lclient!ic;)V")
	public Class10_Sub7(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class172 arg1) {
		super(arg0);
		this.aClass172_4 = arg1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static503.aClass372_4);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static666.aClass372_7);
		super.aClass22_Sub2_23.method8954(0, false, true, Static358.aClass392_1);
		super.aClass22_Sub2_23.method8897(Static671.aClass392_4, 0);
		super.aClass22_Sub2_23.method8972(0);
		super.aClass22_Sub2_23.method8896(0);
		super.aClass22_Sub2_23.method8930(-16777216);
		super.aClass22_Sub2_23.method8897(Static547.aClass392_3, 0);
		this.method9548();
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub2_23.method8896(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass22_Sub2_23.method8976((Interface21) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass172_4.aBoolean278) {
				this.aFloat141 = (float) (super.aClass22_Sub2_23.anInt10466 % 4000) / 4000.0F;
				super.aClass22_Sub2_23.method8976(this.aClass172_4.anInterface19_1);
			} else {
				@Pc(75) int local75 = super.aClass22_Sub2_23.anInt10466 % 4000 * 16 / 4000;
				super.aClass22_Sub2_23.method8976(this.aClass172_4.anInterface16Array2[local75]);
			}
		} else if (this.aClass172_4.aBoolean278) {
			super.aClass22_Sub2_23.method8976(this.aClass172_4.anInterface19_1);
		} else {
			super.aClass22_Sub2_23.method8976(this.aClass172_4.anInterface16Array2[0]);
		}
		super.aClass22_Sub2_23.method8896(0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub2_23.method8976(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aClass172_4.method3804();
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V")
	@Override
	public void method9548() {
		if (super.aClass22_Sub2_23.method8925() != 0) {
			return;
		}
		@Pc(9) Class58_Sub2 local9 = super.aClass22_Sub2_23.method8921();
		super.aClass22_Sub2_23.method8896(1);
		@Pc(19) Class58_Sub2 local19 = super.aClass22_Sub2_23.method8922();
		local19.method9516(local9);
		local19.method6102(0.125F, 0.125F, 1.0F);
		local19.method6094(0.0F, 0.0F, this.aFloat141);
		super.aClass22_Sub2_23.method8924(Static508.aClass222_5);
		super.aClass22_Sub2_23.method8896(0);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
		super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
		super.aClass22_Sub2_23.method8972(1);
		super.aClass22_Sub2_23.method8976((Interface21) null);
		super.aClass22_Sub2_23.method8896(0);
		super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
	}
}
