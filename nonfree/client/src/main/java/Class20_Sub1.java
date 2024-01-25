import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "[Lclient!mia;")
	private Interface17[] anInterface17Array1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class20_Sub1(@OriginalArg(0) Class33_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean738) {
			this.aBoolean39 = arg0.anInt9664 < 3;
			@Pc(28) int local28 = this.aBoolean39 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local87;
						} else if (local93 == 1) {
							local105 = local87;
						} else if (local93 == 2) {
							local105 = local91;
						} else if (local93 == 3) {
							local105 = -local91;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local105 > 0.0F) {
							local152 = (int) ((double) local28 * Math.pow((double) local105, 96.0D));
							local161 = (int) ((double) local28 * Math.pow((double) local105, 36.0D));
							local170 = (int) (Math.pow((double) local105, 12.0D) * (double) local28);
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local36[local93][local42] = local152 << 24;
						local40[local93][local42] = local161 << 24;
						local32[local93][local42] = local170 << 24;
					}
					local42++;
				}
			}
			this.anInterface17Array1 = new Interface17[3];
			this.anInterface17Array1[0] = super.aClass33_Sub2_21.method8251(false, local36, 64);
			this.anInterface17Array1[1] = super.aClass33_Sub2_21.method8251(false, local40, 64);
			this.anInterface17Array1[2] = super.aClass33_Sub2_21.method8251(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean38) {
			super.aClass33_Sub2_21.method8235(1);
			super.aClass33_Sub2_21.method8159(this.anInterface17Array1[arg0 - 1]);
			super.aClass33_Sub2_21.method8235(0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static435.aClass91_3);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		if (this.anInterface17Array1 == null || !arg0) {
			super.aClass33_Sub2_21.method8258(Static621.aClass230_4, 0);
			return;
		}
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8249(Static117.aClass134_1);
		@Pc(31) Class92_Sub1 local31 = super.aClass33_Sub2_21.method8271();
		local31.method3852(1024);
		super.aClass33_Sub2_21.method8286(Static255.aClass331_2);
		if (this.aBoolean39) {
			super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static228.aClass91_2);
			super.aClass33_Sub2_21.method8182(Static41.aClass230_1, true, false, 0);
			super.aClass33_Sub2_21.method8258(Static621.aClass230_4, 0);
		} else {
			super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static489.aClass91_4);
			super.aClass33_Sub2_21.method8239(0, Static238.aClass230_3);
			super.aClass33_Sub2_21.method8235(2);
			super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static228.aClass91_2);
			super.aClass33_Sub2_21.method8239(0, Static238.aClass230_3);
			super.aClass33_Sub2_21.method8182(Static238.aClass230_3, true, false, 1);
			super.aClass33_Sub2_21.method8258(Static621.aClass230_4, 0);
			super.aClass33_Sub2_21.method8159(super.aClass33_Sub2_21.anInterface14_3);
		}
		super.aClass33_Sub2_21.method8235(0);
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		if (this.aBoolean38) {
			super.aClass33_Sub2_21.method8235(1);
			super.aClass33_Sub2_21.method8159((Interface14) null);
			super.aClass33_Sub2_21.method8249(Static315.aClass134_3);
			super.aClass33_Sub2_21.method8201();
			if (this.aBoolean39) {
				super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
				super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
				super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
			} else {
				super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
				super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
				super.aClass33_Sub2_21.method8235(2);
				super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
				super.aClass33_Sub2_21.method8239(0, Static41.aClass230_1);
				super.aClass33_Sub2_21.method8239(1, Static238.aClass230_3);
				super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
				super.aClass33_Sub2_21.method8159((Interface14) null);
			}
			super.aClass33_Sub2_21.method8235(0);
			this.aBoolean38 = false;
		} else {
			super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
		}
		super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		super.aClass33_Sub2_21.method8159(arg1);
		super.aClass33_Sub2_21.method8167(arg0);
	}
}
