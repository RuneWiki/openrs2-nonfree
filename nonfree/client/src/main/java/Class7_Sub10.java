import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class7_Sub10 extends Class7 {

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "[Lclient!pf;")
	private Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class7_Sub10(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean479) {
			this.aBoolean448 = arg0.anInt7157 < 3;
			@Pc(26) int local26 = this.aBoolean448 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(151) int local151;
						@Pc(160) int local160;
						@Pc(169) int local169;
						if (local98 > 0.0F) {
							local151 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local160 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local169 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local169 = 0;
							local160 = 0;
							local151 = 0;
						}
						local34[local91][local40] = local151 << 24;
						local38[local91][local40] = local160 << 24;
						local30[local91][local40] = local169 << 24;
					}
					local40++;
				}
			}
			this.anInterface19Array1 = new Interface19[3];
			this.anInterface19Array1[0] = super.aClass100_Sub1_22.method6163(local34, 64, false);
			this.anInterface19Array1[1] = super.aClass100_Sub1_22.method6163(local38, 64, false);
			this.anInterface19Array1[2] = super.aClass100_Sub1_22.method6163(local30, 64, false);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static266.aClass256_3);
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return true;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		if (this.anInterface19Array1 == null || !arg0) {
			super.aClass100_Sub1_22.method6146(0, Static200.aClass187_1);
			return;
		}
		super.aClass100_Sub1_22.method6114(1);
		super.aClass100_Sub1_22.method6087(Static380.aClass61_4);
		@Pc(28) Class154_Sub2 local28 = super.aClass100_Sub1_22.method6038();
		local28.method6558(1024);
		super.aClass100_Sub1_22.method6030(Static197.aClass377_12);
		if (this.aBoolean448) {
			super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static114.aClass256_1);
			super.aClass100_Sub1_22.method6079(Static622.aClass187_4, true, 0, false);
			super.aClass100_Sub1_22.method6146(0, Static200.aClass187_1);
		} else {
			super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static436.aClass256_4);
			super.aClass100_Sub1_22.method6068(0, Static506.aClass187_3);
			super.aClass100_Sub1_22.method6114(2);
			super.aClass100_Sub1_22.method6039(Static436.aClass256_4, Static114.aClass256_1);
			super.aClass100_Sub1_22.method6068(0, Static506.aClass187_3);
			super.aClass100_Sub1_22.method6079(Static506.aClass187_3, true, 1, false);
			super.aClass100_Sub1_22.method6146(0, Static200.aClass187_1);
			super.aClass100_Sub1_22.method6033(super.aClass100_Sub1_22.anInterface1_3);
		}
		super.aClass100_Sub1_22.method6114(0);
		this.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		if (this.aBoolean449) {
			super.aClass100_Sub1_22.method6114(1);
			super.aClass100_Sub1_22.method6033((Interface1) null);
			super.aClass100_Sub1_22.method6087(Static269.aClass61_6);
			super.aClass100_Sub1_22.method6149();
			if (this.aBoolean448) {
				super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
				super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
				super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
			} else {
				super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
				super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
				super.aClass100_Sub1_22.method6114(2);
				super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
				super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
				super.aClass100_Sub1_22.method6068(1, Static506.aClass187_3);
				super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
				super.aClass100_Sub1_22.method6033((Interface1) null);
			}
			super.aClass100_Sub1_22.method6114(0);
			this.aBoolean449 = false;
		} else {
			super.aClass100_Sub1_22.method6146(0, Static622.aClass187_4);
		}
		super.aClass100_Sub1_22.method6039(Static266.aClass256_3, Static266.aClass256_3);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean449) {
			super.aClass100_Sub1_22.method6114(1);
			super.aClass100_Sub1_22.method6033(this.anInterface19Array1[arg0 - 1]);
			super.aClass100_Sub1_22.method6114(0);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_22.method6033(arg0);
		super.aClass100_Sub1_22.method6092(arg1);
	}
}
