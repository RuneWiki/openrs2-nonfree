import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class19_Sub8 extends Class19 {

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
	private boolean aBoolean749 = false;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[Lclient!tda;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class19_Sub8(@OriginalArg(0) Class15_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean558) {
			this.aBoolean750 = arg0.anInt6518 < 3;
			@Pc(26) int local26 = this.aBoolean750 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local64 * local64 + local55 * local55 + 1.0F)));
					@Pc(83) float local83 = local64 * local79;
					@Pc(87) float local87 = local55 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(95) float local95;
						if (local89 == 0) {
							local95 = -local87;
						} else if (local89 == 1) {
							local95 = local87;
						} else if (local89 == 2) {
							local95 = local83;
						} else if (local89 == 3) {
							local95 = -local83;
						} else if (local89 == 4) {
							local95 = local79;
						} else {
							local95 = -local79;
						}
						@Pc(142) int local142;
						@Pc(141) int local141;
						@Pc(139) int local139;
						if (local95 > 0.0F) {
							local142 = (int) (Math.pow((double) local95, 96.0D) * (double) local26);
							local141 = (int) (Math.pow((double) local95, 36.0D) * (double) local26);
							local139 = (int) ((double) local26 * Math.pow((double) local95, 12.0D));
						} else {
							local139 = 0;
							local141 = 0;
							local142 = 0;
						}
						local34[local89][local40] = local142 << 24;
						local38[local89][local40] = local141 << 24;
						local30[local89][local40] = local139 << 24;
					}
					local40++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass15_Sub2_18.method5463(64, local34, false);
			this.anInterface18Array1[1] = super.aClass15_Sub2_18.method5463(64, local38, false);
			this.anInterface18Array1[2] = super.aClass15_Sub2_18.method5463(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean749) {
			super.aClass15_Sub2_18.method5410(1);
			super.aClass15_Sub2_18.method5414(this.anInterface18Array1[arg0 - 1]);
			super.aClass15_Sub2_18.method5410(0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
		super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static65.aClass120_1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass15_Sub2_18.method5488(Static454.aClass85_2, 0);
			return;
		}
		super.aClass15_Sub2_18.method5410(1);
		super.aClass15_Sub2_18.method5389(Static408.aClass245_3);
		@Pc(29) Class255_Sub3 local29 = super.aClass15_Sub2_18.method5465();
		local29.XA(1024);
		super.aClass15_Sub2_18.method5485(Static515.aClass359_14);
		if (this.aBoolean750) {
			super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static220.aClass120_4);
			super.aClass15_Sub2_18.method5404(false, Static159.aClass85_1, true, 0);
			super.aClass15_Sub2_18.method5488(Static454.aClass85_2, 0);
		} else {
			super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static490.aClass120_5);
			super.aClass15_Sub2_18.method5444(0, Static457.aClass85_4);
			super.aClass15_Sub2_18.method5410(2);
			super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static220.aClass120_4);
			super.aClass15_Sub2_18.method5444(0, Static457.aClass85_4);
			super.aClass15_Sub2_18.method5404(false, Static457.aClass85_4, true, 1);
			super.aClass15_Sub2_18.method5488(Static454.aClass85_2, 0);
			super.aClass15_Sub2_18.method5414(super.aClass15_Sub2_18.anInterface13_3);
		}
		super.aClass15_Sub2_18.method5410(0);
		this.aBoolean749 = true;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		if (this.aBoolean749) {
			super.aClass15_Sub2_18.method5410(1);
			super.aClass15_Sub2_18.method5414(null);
			super.aClass15_Sub2_18.method5389(Static533.aClass245_4);
			super.aClass15_Sub2_18.method5442();
			if (this.aBoolean750) {
				super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
				super.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
				super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
			} else {
				super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
				super.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
				super.aClass15_Sub2_18.method5410(2);
				super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
				super.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
				super.aClass15_Sub2_18.method5444(1, Static457.aClass85_4);
				super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
				super.aClass15_Sub2_18.method5414(null);
			}
			super.aClass15_Sub2_18.method5410(0);
			this.aBoolean749 = false;
		} else {
			super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
		}
		super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		super.aClass15_Sub2_18.method5414(arg0);
		super.aClass15_Sub2_18.method5372(arg1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return true;
	}
}
