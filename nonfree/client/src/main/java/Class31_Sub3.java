import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "[Lclient!ks;")
	private Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class31_Sub3(@OriginalArg(0) Class137_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean682) {
			this.aBoolean248 = arg0.anInt9721 < 3;
			@Pc(26) int local26 = this.aBoolean248 ? 48 : 127;
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
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local101 > 0.0F) {
							local154 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local163 = (int) (Math.pow((double) local101, 36.0D) * (double) local26);
							local172 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local34[local91][local40] = local154 << 24;
						local38[local91][local40] = local163 << 24;
						local30[local91][local40] = local172 << 24;
					}
					local40++;
				}
			}
			this.anInterface16Array1 = new Interface16[3];
			this.anInterface16Array1[0] = super.aClass137_Sub1_22.method8023(false, 64, local34);
			this.anInterface16Array1[1] = super.aClass137_Sub1_22.method8023(false, 64, local38);
			this.anInterface16Array1[2] = super.aClass137_Sub1_22.method8023(false, 64, local30);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static461.aClass87_5);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		if (this.aBoolean249) {
			super.aClass137_Sub1_22.method8081(1);
			super.aClass137_Sub1_22.method8007((Interface15) null);
			super.aClass137_Sub1_22.method7970(Static470.aClass7_8);
			super.aClass137_Sub1_22.method8071();
			if (this.aBoolean248) {
				super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
				super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
				super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
			} else {
				super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
				super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
				super.aClass137_Sub1_22.method8081(2);
				super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
				super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
				super.aClass137_Sub1_22.method8069(1, Static567.aClass169_7);
				super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
				super.aClass137_Sub1_22.method8007((Interface15) null);
			}
			super.aClass137_Sub1_22.method8081(0);
			this.aBoolean249 = false;
		} else {
			super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
		}
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass137_Sub1_22.method8007(arg1);
		super.aClass137_Sub1_22.method8078(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean249) {
			super.aClass137_Sub1_22.method8081(1);
			super.aClass137_Sub1_22.method8007(this.anInterface16Array1[arg0 - 1]);
			super.aClass137_Sub1_22.method8081(0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		if (this.anInterface16Array1 == null || !arg0) {
			super.aClass137_Sub1_22.method7971(0, Static370.aClass169_8);
			return;
		}
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method7970(Static622.aClass7_9);
		@Pc(29) Class26_Sub1 local29 = super.aClass137_Sub1_22.method8050();
		local29.method6460(1024);
		super.aClass137_Sub1_22.method8041(Static639.aClass70_5);
		if (this.aBoolean248) {
			super.aClass137_Sub1_22.method7969(Static15.aClass87_1, Static461.aClass87_5);
			super.aClass137_Sub1_22.method8047(false, true, Static201.aClass169_3, 0);
			super.aClass137_Sub1_22.method7971(0, Static370.aClass169_8);
		} else {
			super.aClass137_Sub1_22.method7969(Static461.aClass87_5, Static575.aClass87_7);
			super.aClass137_Sub1_22.method8069(0, Static567.aClass169_7);
			super.aClass137_Sub1_22.method8081(2);
			super.aClass137_Sub1_22.method7969(Static15.aClass87_1, Static461.aClass87_5);
			super.aClass137_Sub1_22.method8069(0, Static567.aClass169_7);
			super.aClass137_Sub1_22.method8047(false, true, Static567.aClass169_7, 1);
			super.aClass137_Sub1_22.method7971(0, Static370.aClass169_8);
			super.aClass137_Sub1_22.method8007(super.aClass137_Sub1_22.anInterface15_3);
		}
		super.aClass137_Sub1_22.method8081(0);
		this.aBoolean249 = true;
	}
}
