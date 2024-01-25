import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lclient!nn;")
	private Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class18_Sub4(@OriginalArg(0) Class13_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean686) {
			this.aBoolean302 = arg0.anInt9722 < 3;
			@Pc(26) int local26 = this.aBoolean302 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local64 * local64 + local55 * local55 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(98) float local98;
						if (local89 == 0) {
							local98 = -local83;
						} else if (local89 == 1) {
							local98 = local83;
						} else if (local89 == 2) {
							local98 = local87;
						} else if (local89 == 3) {
							local98 = -local87;
						} else if (local89 == 4) {
							local98 = local79;
						} else {
							local98 = -local79;
						}
						@Pc(142) int local142;
						@Pc(151) int local151;
						@Pc(160) int local160;
						if (local98 > 0.0F) {
							local142 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local151 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local160 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local160 = 0;
							local151 = 0;
							local142 = 0;
						}
						local34[local89][local40] = local142 << 24;
						local38[local89][local40] = local151 << 24;
						local30[local89][local40] = local160 << 24;
					}
					local40++;
				}
			}
			this.anInterface19Array1 = new Interface19[3];
			this.anInterface19Array1[0] = super.aClass13_Sub3_23.method8305(64, false, local34);
			this.anInterface19Array1[1] = super.aClass13_Sub3_23.method8305(64, false, local38);
			this.anInterface19Array1[2] = super.aClass13_Sub3_23.method8305(64, false, local30);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		if (this.anInterface19Array1 == null || !arg0) {
			super.aClass13_Sub3_23.method8279(Static23.aClass43_1, 0);
			return;
		}
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8206(Static314.aClass222_2);
		@Pc(25) Class51_Sub2 local25 = super.aClass13_Sub3_23.method8181();
		local25.method6708(1024);
		super.aClass13_Sub3_23.method8217(Static377.aClass100_3);
		if (this.aBoolean302) {
			super.aClass13_Sub3_23.method8235(Static26.aClass269_1, Static408.aClass269_3);
			super.aClass13_Sub3_23.method8277(false, true, Static338.aClass43_3, 0);
			super.aClass13_Sub3_23.method8279(Static23.aClass43_1, 0);
		} else {
			super.aClass13_Sub3_23.method8235(Static408.aClass269_3, Static259.aClass269_4);
			super.aClass13_Sub3_23.method8231(Static287.aClass43_8, 0);
			super.aClass13_Sub3_23.method8230(2);
			super.aClass13_Sub3_23.method8235(Static26.aClass269_1, Static408.aClass269_3);
			super.aClass13_Sub3_23.method8231(Static287.aClass43_8, 0);
			super.aClass13_Sub3_23.method8277(false, true, Static287.aClass43_8, 1);
			super.aClass13_Sub3_23.method8279(Static23.aClass43_1, 0);
			super.aClass13_Sub3_23.method8234(super.aClass13_Sub3_23.anInterface6_3);
		}
		super.aClass13_Sub3_23.method8230(0);
		this.aBoolean301 = true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static408.aClass269_3);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		super.aClass13_Sub3_23.method8234(arg1);
		super.aClass13_Sub3_23.method8204(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		if (this.aBoolean301) {
			super.aClass13_Sub3_23.method8230(1);
			super.aClass13_Sub3_23.method8234((Interface6) null);
			super.aClass13_Sub3_23.method8206(Static562.aClass222_5);
			super.aClass13_Sub3_23.method8270();
			if (this.aBoolean302) {
				super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
				super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
				super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
			} else {
				super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
				super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
				super.aClass13_Sub3_23.method8230(2);
				super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
				super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
				super.aClass13_Sub3_23.method8231(Static287.aClass43_8, 1);
				super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
				super.aClass13_Sub3_23.method8234((Interface6) null);
			}
			super.aClass13_Sub3_23.method8230(0);
			this.aBoolean301 = false;
		} else {
			super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
		}
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean301) {
			super.aClass13_Sub3_23.method8230(1);
			super.aClass13_Sub3_23.method8234(this.anInterface19Array1[arg0 - 1]);
			super.aClass13_Sub3_23.method8230(0);
		}
	}
}
