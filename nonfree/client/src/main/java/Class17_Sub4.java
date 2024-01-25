import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "[Lclient!wv;")
	private Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class17_Sub4(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean633) {
			this.aBoolean392 = arg0.anInt9203 < 3;
			@Pc(24) int local24 = this.aBoolean392 ? 48 : 127;
			@Pc(28) int[][] local28 = new int[6][4096];
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local62 * local62 + local53 * local53 + 1.0F)));
					@Pc(81) float local81 = local62 * local77;
					@Pc(85) float local85 = local53 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(96) float local96;
						if (local87 == 0) {
							local96 = -local81;
						} else if (local87 == 1) {
							local96 = local81;
						} else if (local87 == 2) {
							local96 = local85;
						} else if (local87 == 3) {
							local96 = -local85;
						} else if (local87 == 4) {
							local96 = local77;
						} else {
							local96 = -local77;
						}
						@Pc(144) int local144;
						@Pc(153) int local153;
						@Pc(162) int local162;
						if (local96 > 0.0F) {
							local144 = (int) ((double) local24 * Math.pow((double) local96, 96.0D));
							local153 = (int) ((double) local24 * Math.pow((double) local96, 36.0D));
							local162 = (int) (Math.pow((double) local96, 12.0D) * (double) local24);
						} else {
							local162 = 0;
							local153 = 0;
							local144 = 0;
						}
						local32[local87][local38] = local144 << 24;
						local36[local87][local38] = local153 << 24;
						local28[local87][local38] = local162 << 24;
					}
					local38++;
				}
			}
			this.anInterface20Array1 = new Interface20[3];
			this.anInterface20Array1[0] = super.aClass9_Sub1_19.method7770(64, false, local32);
			this.anInterface20Array1[1] = super.aClass9_Sub1_19.method7770(64, false, local36);
			this.anInterface20Array1[2] = super.aClass9_Sub1_19.method7770(64, false, local28);
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static74.aClass295_2);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		if (this.aBoolean393) {
			super.aClass9_Sub1_19.method7726(1);
			super.aClass9_Sub1_19.method7712(null);
			super.aClass9_Sub1_19.method7731(Static264.aClass74_4);
			super.aClass9_Sub1_19.method7744();
			if (this.aBoolean392) {
				super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
				super.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
				super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
			} else {
				super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
				super.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
				super.aClass9_Sub1_19.method7726(2);
				super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
				super.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
				super.aClass9_Sub1_19.method7678(Static426.aClass122_4, 1);
				super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
				super.aClass9_Sub1_19.method7712(null);
			}
			super.aClass9_Sub1_19.method7726(0);
			this.aBoolean393 = false;
		} else {
			super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
		}
		super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass9_Sub1_19.method7735(0, Static43.aClass122_1);
			return;
		}
		super.aClass9_Sub1_19.method7726(1);
		super.aClass9_Sub1_19.method7731(Static200.aClass74_3);
		@Pc(29) Class22_Sub3 local29 = super.aClass9_Sub1_19.method7733();
		local29.KA(1024);
		super.aClass9_Sub1_19.method7703(Static218.aClass171_5);
		if (this.aBoolean392) {
			super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static361.aClass295_4);
			super.aClass9_Sub1_19.method7692(true, 0, false, Static197.aClass122_2);
			super.aClass9_Sub1_19.method7735(0, Static43.aClass122_1);
		} else {
			super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static453.aClass295_5);
			super.aClass9_Sub1_19.method7678(Static426.aClass122_4, 0);
			super.aClass9_Sub1_19.method7726(2);
			super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static361.aClass295_4);
			super.aClass9_Sub1_19.method7678(Static426.aClass122_4, 0);
			super.aClass9_Sub1_19.method7692(true, 1, false, Static426.aClass122_4);
			super.aClass9_Sub1_19.method7735(0, Static43.aClass122_1);
			super.aClass9_Sub1_19.method7712(super.aClass9_Sub1_19.anInterface14_3);
		}
		super.aClass9_Sub1_19.method7726(0);
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean393) {
			super.aClass9_Sub1_19.method7726(1);
			super.aClass9_Sub1_19.method7712(this.anInterface20Array1[arg0 - 1]);
			super.aClass9_Sub1_19.method7726(0);
		}
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		super.aClass9_Sub1_19.method7712(arg0);
		super.aClass9_Sub1_19.method7778(arg1);
	}
}
