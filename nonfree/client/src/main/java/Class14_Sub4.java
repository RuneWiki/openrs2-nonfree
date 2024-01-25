import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "[Lclient!bv;")
	private Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class14_Sub4(@OriginalArg(0) Class143_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean534) {
			this.aBoolean470 = arg0.anInt7405 < 3;
			@Pc(26) int local26 = this.aBoolean470 ? 48 : 127;
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
						@Pc(98) float local98;
						if (local89 == 0) {
							local98 = -local87;
						} else if (local89 == 1) {
							local98 = local87;
						} else if (local89 == 2) {
							local98 = local83;
						} else if (local89 == 3) {
							local98 = -local83;
						} else if (local89 == 4) {
							local98 = local79;
						} else {
							local98 = -local79;
						}
						@Pc(141) int local141;
						@Pc(140) int local140;
						@Pc(138) int local138;
						if (local98 > 0.0F) {
							local141 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local140 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local138 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local138 = 0;
							local140 = 0;
							local141 = 0;
						}
						local34[local89][local40] = local141 << 24;
						local38[local89][local40] = local140 << 24;
						local30[local89][local40] = local138 << 24;
					}
					local40++;
				}
			}
			this.anInterface1Array1 = new Interface1[3];
			this.anInterface1Array1[0] = super.aClass143_Sub1_22.method6300(local34, false, 64);
			this.anInterface1Array1[1] = super.aClass143_Sub1_22.method6300(local38, false, 64);
			this.anInterface1Array1[2] = super.aClass143_Sub1_22.method6300(local30, false, 64);
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		if (this.aBoolean469) {
			super.aClass143_Sub1_22.method6374(1);
			super.aClass143_Sub1_22.method6338((Interface4) null);
			super.aClass143_Sub1_22.method6299(Static305.aClass271_15);
			super.aClass143_Sub1_22.method6282();
			if (this.aBoolean470) {
				super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
				super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
				super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
			} else {
				super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
				super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
				super.aClass143_Sub1_22.method6374(2);
				super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
				super.aClass143_Sub1_22.method6290(Static663.aClass90_4, 0);
				super.aClass143_Sub1_22.method6290(Static85.aClass90_2, 1);
				super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
				super.aClass143_Sub1_22.method6338((Interface4) null);
			}
			super.aClass143_Sub1_22.method6374(0);
			this.aBoolean469 = false;
		} else {
			super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
		}
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		if (this.anInterface1Array1 == null || !arg0) {
			super.aClass143_Sub1_22.method6391(0, Static619.aClass90_3);
			return;
		}
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6299(Static148.aClass271_8);
		@Pc(21) Class56_Sub2 local21 = super.aClass143_Sub1_22.method6277();
		local21.method8392(1024);
		super.aClass143_Sub1_22.method6307(Static357.aClass270_5);
		if (this.aBoolean470) {
			super.aClass143_Sub1_22.method6370(Static346.aClass6_1, Static371.aClass6_2);
			super.aClass143_Sub1_22.method6291(0, false, Static663.aClass90_4, true);
			super.aClass143_Sub1_22.method6391(0, Static619.aClass90_3);
		} else {
			super.aClass143_Sub1_22.method6370(Static371.aClass6_2, Static600.aClass6_4);
			super.aClass143_Sub1_22.method6290(Static85.aClass90_2, 0);
			super.aClass143_Sub1_22.method6374(2);
			super.aClass143_Sub1_22.method6370(Static346.aClass6_1, Static371.aClass6_2);
			super.aClass143_Sub1_22.method6290(Static85.aClass90_2, 0);
			super.aClass143_Sub1_22.method6291(1, false, Static85.aClass90_2, true);
			super.aClass143_Sub1_22.method6391(0, Static619.aClass90_3);
			super.aClass143_Sub1_22.method6338(super.aClass143_Sub1_22.anInterface4_3);
		}
		super.aClass143_Sub1_22.method6374(0);
		this.aBoolean469 = true;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		super.aClass143_Sub1_22.method6338(arg0);
		super.aClass143_Sub1_22.method6322(arg1);
	}

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return true;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean469) {
			super.aClass143_Sub1_22.method6374(1);
			super.aClass143_Sub1_22.method6338(this.anInterface1Array1[arg1 - 1]);
			super.aClass143_Sub1_22.method6374(0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static371.aClass6_2);
	}
}
