import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class37_Sub6 extends Class37 {

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "[Lclient!vfa;")
	private Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class37_Sub6(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean491) {
			this.aBoolean524 = arg0.anInt6541 < 3;
			@Pc(26) int local26 = this.aBoolean524 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(102) float local102;
						if (local91 == 0) {
							local102 = -local89;
						} else if (local91 == 1) {
							local102 = local89;
						} else if (local91 == 2) {
							local102 = local85;
						} else if (local91 == 3) {
							local102 = -local85;
						} else if (local91 == 4) {
							local102 = local81;
						} else {
							local102 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local102 > 0.0F) {
							local146 = (int) ((double) local26 * Math.pow((double) local102, 96.0D));
							local145 = (int) (Math.pow((double) local102, 36.0D) * (double) local26);
							local143 = (int) ((double) local26 * Math.pow((double) local102, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = local146 << 24;
						local38[local91][local40] = local145 << 24;
						local30[local91][local40] = local143 << 24;
					}
					local40++;
				}
			}
			this.anInterface22Array1 = new Interface22[3];
			this.anInterface22Array1[0] = super.aClass9_Sub3_19.method5476(false, local34, 64);
			this.anInterface22Array1[1] = super.aClass9_Sub3_19.method5476(false, local38, 64);
			this.anInterface22Array1[2] = super.aClass9_Sub3_19.method5476(false, local30, 64);
		}
	}

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		if (this.aBoolean523) {
			super.aClass9_Sub3_19.method5482(1);
			super.aClass9_Sub3_19.method5494(null);
			super.aClass9_Sub3_19.method5483(Static506.aClass71_4);
			super.aClass9_Sub3_19.method5498();
			if (this.aBoolean524) {
				super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
				super.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
				super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
			} else {
				super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
				super.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
				super.aClass9_Sub3_19.method5482(2);
				super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
				super.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
				super.aClass9_Sub3_19.method5596(Static49.aClass50_1, 1);
				super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
				super.aClass9_Sub3_19.method5494(null);
			}
			super.aClass9_Sub3_19.method5482(0);
			this.aBoolean523 = false;
		} else {
			super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
		}
		super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static477.aClass238_4);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
		super.aClass9_Sub3_19.method5545(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean523) {
			super.aClass9_Sub3_19.method5482(1);
			super.aClass9_Sub3_19.method5494(this.anInterface22Array1[arg0 - 1]);
			super.aClass9_Sub3_19.method5482(0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		if (this.anInterface22Array1 == null || !arg0) {
			super.aClass9_Sub3_19.method5543(Static237.aClass50_3, 0);
			return;
		}
		super.aClass9_Sub3_19.method5482(1);
		super.aClass9_Sub3_19.method5483(Static88.aClass71_1);
		@Pc(38) Class8_Sub3 local38 = super.aClass9_Sub3_19.method5553();
		local38.XA(1024);
		super.aClass9_Sub3_19.method5481(Static204.aClass340_7);
		if (this.aBoolean524) {
			super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static167.aClass238_2);
			super.aClass9_Sub3_19.method5491(false, true, Static503.aClass50_4, 0);
			super.aClass9_Sub3_19.method5543(Static237.aClass50_3, 0);
		} else {
			super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static410.aClass238_3);
			super.aClass9_Sub3_19.method5596(Static49.aClass50_1, 0);
			super.aClass9_Sub3_19.method5482(2);
			super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static167.aClass238_2);
			super.aClass9_Sub3_19.method5596(Static49.aClass50_1, 0);
			super.aClass9_Sub3_19.method5491(false, true, Static49.aClass50_1, 1);
			super.aClass9_Sub3_19.method5543(Static237.aClass50_3, 0);
			super.aClass9_Sub3_19.method5494(super.aClass9_Sub3_19.anInterface10_3);
		}
		super.aClass9_Sub3_19.method5482(0);
		this.aBoolean523 = true;
	}
}
