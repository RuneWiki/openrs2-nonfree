import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class108_Sub6 extends Class108 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[Lclient!np;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class108_Sub6(@OriginalArg(0) Class126_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean522) {
			this.aBoolean493 = arg0.anInt6284 < 3;
			@Pc(28) int local28 = this.aBoolean493 ? 48 : 127;
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
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local103 > 0.0F) {
							local154 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local163 = (int) (Math.pow((double) local103, 36.0D) * (double) local28);
							local172 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local36[local93][local42] = local154 << 24;
						local40[local93][local42] = local163 << 24;
						local32[local93][local42] = local172 << 24;
					}
					local42++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass126_Sub2_23.method5458(false, local36, 64);
			this.anInterface18Array1[1] = super.aClass126_Sub2_23.method5458(false, local40, 64);
			this.anInterface18Array1[2] = super.aClass126_Sub2_23.method5458(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean491) {
			super.aClass126_Sub2_23.method5560(1);
			super.aClass126_Sub2_23.method5449(this.anInterface18Array1[arg0 - 1]);
			super.aClass126_Sub2_23.method5560(0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass126_Sub2_23.method5471(Static18.aClass294_1, 0);
			return;
		}
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5519(Static424.aClass199_4);
		@Pc(25) Class117_Sub2 local25 = super.aClass126_Sub2_23.method5542();
		local25.method7246(1024);
		super.aClass126_Sub2_23.method5504(Static530.aClass52_5);
		if (this.aBoolean493) {
			super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static140.aClass10_3);
			super.aClass126_Sub2_23.method5537(0, Static256.aClass294_4, false, true);
			super.aClass126_Sub2_23.method5471(Static18.aClass294_1, 0);
		} else {
			super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static247.aClass10_4);
			super.aClass126_Sub2_23.method5466(0, Static131.aClass294_2);
			super.aClass126_Sub2_23.method5560(2);
			super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static140.aClass10_3);
			super.aClass126_Sub2_23.method5466(0, Static131.aClass294_2);
			super.aClass126_Sub2_23.method5537(1, Static131.aClass294_2, false, true);
			super.aClass126_Sub2_23.method5471(Static18.aClass294_1, 0);
			super.aClass126_Sub2_23.method5449(super.aClass126_Sub2_23.anInterface27_3);
		}
		super.aClass126_Sub2_23.method5560(0);
		this.aBoolean491 = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static101.aClass10_2);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		if (this.aBoolean491) {
			super.aClass126_Sub2_23.method5560(1);
			super.aClass126_Sub2_23.method5449((Interface27) null);
			super.aClass126_Sub2_23.method5519(Static372.aClass199_3);
			super.aClass126_Sub2_23.method5445();
			if (this.aBoolean493) {
				super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
				super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
				super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
			} else {
				super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
				super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
				super.aClass126_Sub2_23.method5560(2);
				super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
				super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
				super.aClass126_Sub2_23.method5466(1, Static131.aClass294_2);
				super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
				super.aClass126_Sub2_23.method5449((Interface27) null);
			}
			super.aClass126_Sub2_23.method5560(0);
			this.aBoolean491 = false;
		} else {
			super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
		}
		super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		super.aClass126_Sub2_23.method5449(arg0);
		super.aClass126_Sub2_23.method5513(arg1);
	}
}
