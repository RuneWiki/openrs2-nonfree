import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[Lclient!sq;")
	private Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class16_Sub2(@OriginalArg(0) Class33_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean179) {
			this.aBoolean328 = arg0.anInt2173 < 3;
			@Pc(26) int local26 = this.aBoolean328 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local89;
						} else if (local91 == 1) {
							local105 = local89;
						} else if (local91 == 2) {
							local105 = local85;
						} else if (local91 == 3) {
							local105 = -local85;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local105 > 0.0F) {
							local151 = (int) (Math.pow((double) local105, 96.0D) * (double) local26);
							local150 = (int) ((double) local26 * Math.pow((double) local105, 36.0D));
							local148 = (int) ((double) local26 * Math.pow((double) local105, 12.0D));
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local34[local91][local40] = local151 << 24;
						local38[local91][local40] = local150 << 24;
						local30[local91][local40] = local148 << 24;
					}
					local40++;
				}
			}
			this.anInterface24Array1 = new Interface24[3];
			this.anInterface24Array1[0] = super.aClass33_Sub1_23.method2035(64, local34, false);
			this.anInterface24Array1[1] = super.aClass33_Sub1_23.method2035(64, local38, false);
			this.anInterface24Array1[2] = super.aClass33_Sub1_23.method2035(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub1_23.method1987(arg0);
		super.aClass33_Sub1_23.method2105(arg1);
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean327) {
			super.aClass33_Sub1_23.method2010(1);
			super.aClass33_Sub1_23.method1987(this.anInterface24Array1[arg0 - 1]);
			super.aClass33_Sub1_23.method2010(0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static25.aClass363_1);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		if (this.aBoolean327) {
			super.aClass33_Sub1_23.method2010(1);
			super.aClass33_Sub1_23.method1987(null);
			super.aClass33_Sub1_23.method2087(Static513.aClass6_11);
			super.aClass33_Sub1_23.method2029();
			if (this.aBoolean328) {
				super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
				super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
				super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
			} else {
				super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
				super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
				super.aClass33_Sub1_23.method2010(2);
				super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
				super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
				super.aClass33_Sub1_23.method2098(1, Static25.aClass371_1);
				super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
				super.aClass33_Sub1_23.method1987(null);
			}
			super.aClass33_Sub1_23.method2010(0);
			this.aBoolean327 = false;
		} else {
			super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
		}
		super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		if (this.anInterface24Array1 == null || !arg0) {
			super.aClass33_Sub1_23.method1991(Static133.aClass371_2, 0);
			return;
		}
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method2087(Static48.aClass6_3);
		@Pc(38) Class47_Sub3 local38 = super.aClass33_Sub1_23.method2020();
		local38.method7866(1024);
		super.aClass33_Sub1_23.method2088(Static310.aClass180_7);
		if (this.aBoolean328) {
			super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static428.aClass363_4);
			super.aClass33_Sub1_23.method1988(false, 0, true, Static419.aClass371_4);
			super.aClass33_Sub1_23.method1991(Static133.aClass371_2, 0);
		} else {
			super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static64.aClass363_7);
			super.aClass33_Sub1_23.method2098(0, Static25.aClass371_1);
			super.aClass33_Sub1_23.method2010(2);
			super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static428.aClass363_4);
			super.aClass33_Sub1_23.method2098(0, Static25.aClass371_1);
			super.aClass33_Sub1_23.method1988(false, 1, true, Static25.aClass371_1);
			super.aClass33_Sub1_23.method1991(Static133.aClass371_2, 0);
			super.aClass33_Sub1_23.method1987(super.aClass33_Sub1_23.anInterface3_3);
		}
		super.aClass33_Sub1_23.method2010(0);
		this.aBoolean327 = true;
	}
}
