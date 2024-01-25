import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class72_Sub3 extends Class72 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "Z")
	private boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "Z")
	private boolean aBoolean290;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "[Lclient!ica;")
	private Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class72_Sub3(@OriginalArg(0) Class45_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean428) {
			this.aBoolean290 = arg0.anInt5869 < 3;
			@Pc(28) int local28 = this.aBoolean290 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local91;
						} else if (local93 == 1) {
							local103 = local91;
						} else if (local93 == 2) {
							local103 = local87;
						} else if (local93 == 3) {
							local103 = -local87;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local103 > 0.0F) {
							local151 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local150 = (int) (Math.pow((double) local103, 36.0D) * (double) local28);
							local148 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local36[local93][local42] = local151 << 24;
						local40[local93][local42] = local150 << 24;
						local32[local93][local42] = local148 << 24;
					}
					local42++;
				}
			}
			this.anInterface6Array1 = new Interface6[3];
			this.anInterface6Array1[0] = super.aClass45_Sub2_22.method4991(64, false, local36);
			this.anInterface6Array1[1] = super.aClass45_Sub2_22.method4991(64, false, local40);
			this.anInterface6Array1[2] = super.aClass45_Sub2_22.method4991(64, false, local32);
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static19.aClass307_1);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		if (this.aBoolean288) {
			super.aClass45_Sub2_22.method4961(1);
			super.aClass45_Sub2_22.method4926(null);
			super.aClass45_Sub2_22.method4919(Static109.aClass17_2);
			super.aClass45_Sub2_22.method4950();
			if (this.aBoolean290) {
				super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
				super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
				super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
			} else {
				super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
				super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
				super.aClass45_Sub2_22.method4961(2);
				super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
				super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
				super.aClass45_Sub2_22.method4953(1, Static160.aClass108_2);
				super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
				super.aClass45_Sub2_22.method4926(null);
			}
			super.aClass45_Sub2_22.method4961(0);
			this.aBoolean288 = false;
		} else {
			super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		}
		super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		if (this.anInterface6Array1 == null || !arg0) {
			super.aClass45_Sub2_22.method4900(0, Static425.aClass108_4);
			return;
		}
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4919(Static326.aClass17_3);
		@Pc(27) Class11_Sub1 local27 = super.aClass45_Sub2_22.method5007();
		local27.oa(1024);
		super.aClass45_Sub2_22.method4932(Static334.aClass222_9);
		if (this.aBoolean290) {
			super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static177.aClass307_2);
			super.aClass45_Sub2_22.method5010(0, false, true, Static164.aClass108_3);
			super.aClass45_Sub2_22.method4900(0, Static425.aClass108_4);
		} else {
			super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static534.aClass307_7);
			super.aClass45_Sub2_22.method4953(0, Static160.aClass108_2);
			super.aClass45_Sub2_22.method4961(2);
			super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static177.aClass307_2);
			super.aClass45_Sub2_22.method4953(0, Static160.aClass108_2);
			super.aClass45_Sub2_22.method5010(1, false, true, Static160.aClass108_2);
			super.aClass45_Sub2_22.method4900(0, Static425.aClass108_4);
			super.aClass45_Sub2_22.method4926(super.aClass45_Sub2_22.anInterface11_3);
		}
		super.aClass45_Sub2_22.method4961(0);
		this.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass45_Sub2_22.method4926(arg1);
		super.aClass45_Sub2_22.method4939(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean288) {
			super.aClass45_Sub2_22.method4961(1);
			super.aClass45_Sub2_22.method4926(this.anInterface6Array1[arg0 - 1]);
			super.aClass45_Sub2_22.method4961(0);
		}
	}
}
