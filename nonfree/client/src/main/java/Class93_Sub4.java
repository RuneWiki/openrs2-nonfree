import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class93_Sub4 extends Class93 {

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "[Lclient!ul;")
	private Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class93_Sub4(@OriginalArg(0) Class66_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean576) {
			this.aBoolean499 = arg0.anInt8426 < 3;
			@Pc(26) int local26 = this.aBoolean499 ? 48 : 127;
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
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local89;
						} else if (local91 == 1) {
							local98 = local89;
						} else if (local91 == 2) {
							local98 = local85;
						} else if (local91 == 3) {
							local98 = -local85;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(144) int local144;
						@Pc(143) int local143;
						@Pc(141) int local141;
						if (local98 > 0.0F) {
							local144 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local143 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local141 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local141 = 0;
							local143 = 0;
							local144 = 0;
						}
						local34[local91][local40] = local144 << 24;
						local38[local91][local40] = local143 << 24;
						local30[local91][local40] = local141 << 24;
					}
					local40++;
				}
			}
			this.anInterface22Array1 = new Interface22[3];
			this.anInterface22Array1[0] = super.aClass66_Sub1_19.method6922(false, 64, local34);
			this.anInterface22Array1[1] = super.aClass66_Sub1_19.method6922(false, 64, local38);
			this.anInterface22Array1[2] = super.aClass66_Sub1_19.method6922(false, 64, local30);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static174.aClass240_2);
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.aBoolean500) {
			super.aClass66_Sub1_19.method6895(1);
			super.aClass66_Sub1_19.method6979(null);
			super.aClass66_Sub1_19.method6990(Static342.aClass221_4);
			super.aClass66_Sub1_19.method6888();
			if (this.aBoolean499) {
				super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
				super.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
				super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
			} else {
				super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
				super.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
				super.aClass66_Sub1_19.method6895(2);
				super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
				super.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
				super.aClass66_Sub1_19.method6923(Static232.aClass120_4, 1);
				super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
				super.aClass66_Sub1_19.method6979(null);
			}
			super.aClass66_Sub1_19.method6895(0);
			this.aBoolean500 = false;
		} else {
			super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
		}
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass66_Sub1_19.method6979(arg1);
		super.aClass66_Sub1_19.method6920(arg0);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return true;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean500) {
			super.aClass66_Sub1_19.method6895(1);
			super.aClass66_Sub1_19.method6979(this.anInterface22Array1[arg1 - 1]);
			super.aClass66_Sub1_19.method6895(0);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		if (this.anInterface22Array1 == null || !arg0) {
			super.aClass66_Sub1_19.method6866(Static184.aClass120_3, 0);
			return;
		}
		super.aClass66_Sub1_19.method6895(1);
		super.aClass66_Sub1_19.method6990(Static486.aClass221_5);
		@Pc(26) Class134_Sub1 local26 = super.aClass66_Sub1_19.method6953();
		local26.XA(1024);
		super.aClass66_Sub1_19.method6933(Static209.aClass81_8);
		if (this.aBoolean499) {
			super.aClass66_Sub1_19.method6997(Static598.aClass240_5, Static174.aClass240_2);
			super.aClass66_Sub1_19.method6959(0, true, false, Static22.aClass120_2);
			super.aClass66_Sub1_19.method6866(Static184.aClass120_3, 0);
		} else {
			super.aClass66_Sub1_19.method6997(Static174.aClass240_2, Static152.aClass240_1);
			super.aClass66_Sub1_19.method6923(Static232.aClass120_4, 0);
			super.aClass66_Sub1_19.method6895(2);
			super.aClass66_Sub1_19.method6997(Static598.aClass240_5, Static174.aClass240_2);
			super.aClass66_Sub1_19.method6923(Static232.aClass120_4, 0);
			super.aClass66_Sub1_19.method6959(1, true, false, Static232.aClass120_4);
			super.aClass66_Sub1_19.method6866(Static184.aClass120_3, 0);
			super.aClass66_Sub1_19.method6979(super.aClass66_Sub1_19.anInterface15_3);
		}
		super.aClass66_Sub1_19.method6895(0);
		this.aBoolean500 = true;
	}
}
