import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class73_Sub3 extends Class73 {

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!fs", name = "A", descriptor = "[Lclient!lm;")
	private Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!bda;)V")
	public Class73_Sub3(@OriginalArg(0) Class4_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean605) {
			this.aBoolean238 = arg0.anInt8319 < 3;
			@Pc(26) int local26 = this.aBoolean238 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(100) float local100;
						if (local91 == 0) {
							local100 = -local89;
						} else if (local91 == 1) {
							local100 = local89;
						} else if (local91 == 2) {
							local100 = local85;
						} else if (local91 == 3) {
							local100 = -local85;
						} else if (local91 == 4) {
							local100 = local81;
						} else {
							local100 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local100 > 0.0F) {
							local147 = (int) ((double) local26 * Math.pow((double) local100, 96.0D));
							local156 = (int) (Math.pow((double) local100, 36.0D) * (double) local26);
							local165 = (int) ((double) local26 * Math.pow((double) local100, 12.0D));
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local34[local91][local40] = local147 << 24;
						local38[local91][local40] = local156 << 24;
						local30[local91][local40] = local165 << 24;
					}
					local40++;
				}
			}
			this.anInterface11Array1 = new Interface11[3];
			this.anInterface11Array1[0] = super.aClass4_Sub2_19.method7329(64, local34, false);
			this.anInterface11Array1[1] = super.aClass4_Sub2_19.method7329(64, local38, false);
			this.anInterface11Array1[2] = super.aClass4_Sub2_19.method7329(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super.aClass4_Sub2_19.method7316(arg1);
		super.aClass4_Sub2_19.method7279(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		if (this.anInterface11Array1 == null || !arg0) {
			super.aClass4_Sub2_19.method7330(Static503.aClass27_3, 0);
			return;
		}
		super.aClass4_Sub2_19.method7339(1);
		super.aClass4_Sub2_19.method7248(Static355.aClass31_5);
		@Pc(31) Class128_Sub3 local31 = super.aClass4_Sub2_19.method7349();
		local31.KA(1024);
		super.aClass4_Sub2_19.method7272(Static470.aClass107_7);
		if (this.aBoolean238) {
			super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static157.aClass246_1);
			super.aClass4_Sub2_19.method7351(true, false, 0, Static360.aClass27_5);
			super.aClass4_Sub2_19.method7330(Static503.aClass27_3, 0);
		} else {
			super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static428.aClass246_3);
			super.aClass4_Sub2_19.method7277(0, Static226.aClass27_1);
			super.aClass4_Sub2_19.method7339(2);
			super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static157.aClass246_1);
			super.aClass4_Sub2_19.method7277(0, Static226.aClass27_1);
			super.aClass4_Sub2_19.method7351(true, false, 1, Static226.aClass27_1);
			super.aClass4_Sub2_19.method7330(Static503.aClass27_3, 0);
			super.aClass4_Sub2_19.method7316(super.aClass4_Sub2_19.anInterface8_3);
		}
		super.aClass4_Sub2_19.method7339(0);
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return true;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		if (this.aBoolean239) {
			super.aClass4_Sub2_19.method7339(1);
			super.aClass4_Sub2_19.method7316(null);
			super.aClass4_Sub2_19.method7248(Static318.aClass31_4);
			super.aClass4_Sub2_19.method7290();
			if (this.aBoolean238) {
				super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
				super.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
				super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
			} else {
				super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
				super.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
				super.aClass4_Sub2_19.method7339(2);
				super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
				super.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
				super.aClass4_Sub2_19.method7277(1, Static226.aClass27_1);
				super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
				super.aClass4_Sub2_19.method7316(null);
			}
			super.aClass4_Sub2_19.method7339(0);
			this.aBoolean239 = false;
		} else {
			super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
		}
		super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean239) {
			super.aClass4_Sub2_19.method7339(1);
			super.aClass4_Sub2_19.method7316(this.anInterface11Array1[arg0 - 1]);
			super.aClass4_Sub2_19.method7339(0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static459.aClass246_5);
	}
}
