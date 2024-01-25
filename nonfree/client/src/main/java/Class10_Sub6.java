import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "[Lclient!c;")
	private Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class10_Sub6(@OriginalArg(0) Class22_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean693) {
			this.aBoolean433 = arg0.anInt10459 < 3;
			@Pc(30) int local30 = this.aBoolean433 ? 48 : 127;
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(42) int[][] local42 = new int[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local61 * local85;
					@Pc(93) float local93 = local70 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(108) float local108;
						if (local95 == 0) {
							local108 = -local93;
						} else if (local95 == 1) {
							local108 = local93;
						} else if (local95 == 2) {
							local108 = local89;
						} else if (local95 == 3) {
							local108 = -local89;
						} else if (local95 == 4) {
							local108 = local85;
						} else {
							local108 = -local85;
						}
						@Pc(163) int local163;
						@Pc(172) int local172;
						@Pc(181) int local181;
						if (local108 > 0.0F) {
							local163 = (int) ((double) local30 * Math.pow((double) local108, 96.0D));
							local172 = (int) ((double) local30 * Math.pow((double) local108, 36.0D));
							local181 = (int) (Math.pow((double) local108, 12.0D) * (double) local30);
						} else {
							local181 = 0;
							local172 = 0;
							local163 = 0;
						}
						local38[local95][local44] = local163 << 24;
						local42[local95][local44] = local172 << 24;
						local34[local95][local44] = local181 << 24;
					}
					local44++;
				}
			}
			this.anInterface1Array1 = new Interface1[3];
			this.anInterface1Array1[0] = super.aClass22_Sub2_23.method8881(local38, 64, false);
			this.anInterface1Array1[1] = super.aClass22_Sub2_23.method8881(local42, 64, false);
			this.anInterface1Array1[2] = super.aClass22_Sub2_23.method8881(local34, 64, false);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub2_23.method8976(arg0);
		super.aClass22_Sub2_23.method8853(arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		if (this.anInterface1Array1 == null || !arg0) {
			super.aClass22_Sub2_23.method8897(Static407.aClass392_2, 0);
			return;
		}
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8883(Static526.aClass37_3);
		@Pc(38) Class58_Sub2 local38 = super.aClass22_Sub2_23.method8922();
		local38.method9510(1024);
		super.aClass22_Sub2_23.method8924(Static508.aClass222_5);
		if (this.aBoolean433) {
			super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static666.aClass372_7);
			super.aClass22_Sub2_23.method8954(0, false, true, Static358.aClass392_1);
			super.aClass22_Sub2_23.method8897(Static407.aClass392_2, 0);
		} else {
			super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static468.aClass372_3);
			super.aClass22_Sub2_23.method8962(Static671.aClass392_4, 0);
			super.aClass22_Sub2_23.method8896(2);
			super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static666.aClass372_7);
			super.aClass22_Sub2_23.method8962(Static671.aClass392_4, 0);
			super.aClass22_Sub2_23.method8954(1, false, true, Static671.aClass392_4);
			super.aClass22_Sub2_23.method8897(Static407.aClass392_2, 0);
			super.aClass22_Sub2_23.method8976(super.aClass22_Sub2_23.anInterface21_3);
		}
		super.aClass22_Sub2_23.method8896(0);
		this.aBoolean432 = true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static503.aClass372_4);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		if (this.aBoolean432) {
			super.aClass22_Sub2_23.method8896(1);
			super.aClass22_Sub2_23.method8976((Interface21) null);
			super.aClass22_Sub2_23.method8883(Static586.aClass37_4);
			super.aClass22_Sub2_23.method8873();
			if (this.aBoolean433) {
				super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
				super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
				super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
			} else {
				super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
				super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
				super.aClass22_Sub2_23.method8896(2);
				super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
				super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
				super.aClass22_Sub2_23.method8962(Static671.aClass392_4, 1);
				super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
				super.aClass22_Sub2_23.method8976((Interface21) null);
			}
			super.aClass22_Sub2_23.method8896(0);
			this.aBoolean432 = false;
		} else {
			super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
		}
		super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean432) {
			super.aClass22_Sub2_23.method8896(1);
			super.aClass22_Sub2_23.method8976(this.anInterface1Array1[arg0 - 1]);
			super.aClass22_Sub2_23.method8896(0);
		}
	}
}
