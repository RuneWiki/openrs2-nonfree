import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!dia", name = "u", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "[Lclient!saa;")
	private Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class74_Sub1(@OriginalArg(0) Class87_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean453) {
			this.aBoolean161 = arg0.anInt6151 < 3;
			@Pc(24) int local24 = this.aBoolean161 ? 48 : 127;
			@Pc(28) int[][] local28 = new int[6][4096];
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local62 * local62 + 1.0F)));
					@Pc(81) float local81 = local62 * local77;
					@Pc(85) float local85 = local53 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(93) float local93;
						if (local87 == 0) {
							local93 = -local81;
						} else if (local87 == 1) {
							local93 = local81;
						} else if (local87 == 2) {
							local93 = local85;
						} else if (local87 == 3) {
							local93 = -local85;
						} else if (local87 == 4) {
							local93 = local77;
						} else {
							local93 = -local77;
						}
						@Pc(136) int local136;
						@Pc(135) int local135;
						@Pc(133) int local133;
						if (local93 > 0.0F) {
							local136 = (int) ((double) local24 * Math.pow((double) local93, 96.0D));
							local135 = (int) (Math.pow((double) local93, 36.0D) * (double) local24);
							local133 = (int) ((double) local24 * Math.pow((double) local93, 12.0D));
						} else {
							local133 = 0;
							local135 = 0;
							local136 = 0;
						}
						local32[local87][local38] = local136 << 24;
						local36[local87][local38] = local135 << 24;
						local28[local87][local38] = local133 << 24;
					}
					local38++;
				}
			}
			this.anInterface22Array1 = new Interface22[3];
			this.anInterface22Array1[0] = super.aClass87_Sub1_22.method5150(false, 64, local32);
			this.anInterface22Array1[1] = super.aClass87_Sub1_22.method5150(false, 64, local36);
			this.anInterface22Array1[2] = super.aClass87_Sub1_22.method5150(false, 64, local28);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		if (this.aBoolean159) {
			super.aClass87_Sub1_22.method5116(1);
			super.aClass87_Sub1_22.method5079(null);
			super.aClass87_Sub1_22.method5021(Static269.aClass62_2);
			super.aClass87_Sub1_22.method5127();
			if (this.aBoolean161) {
				super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
				super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
				super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
			} else {
				super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
				super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
				super.aClass87_Sub1_22.method5116(2);
				super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
				super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
				super.aClass87_Sub1_22.method5131(1, Static508.aClass315_2);
				super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
				super.aClass87_Sub1_22.method5079(null);
			}
			super.aClass87_Sub1_22.method5116(0);
			this.aBoolean159 = false;
		} else {
			super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
		}
		super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub1_22.method5079(arg0);
		super.aClass87_Sub1_22.method5062(arg1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		if (this.anInterface22Array1 == null || !arg0) {
			super.aClass87_Sub1_22.method5118(0, Static572.aClass315_4);
			return;
		}
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5021(Static577.aClass62_4);
		@Pc(34) Class6_Sub2 local34 = super.aClass87_Sub1_22.method5141();
		local34.method6699(1024);
		super.aClass87_Sub1_22.method5023(Static552.aClass108_24);
		if (this.aBoolean161) {
			super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static591.aClass300_5);
			super.aClass87_Sub1_22.method5052(false, true, 0, Static516.aClass315_3);
			super.aClass87_Sub1_22.method5118(0, Static572.aClass315_4);
		} else {
			super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static148.aClass300_3);
			super.aClass87_Sub1_22.method5131(0, Static508.aClass315_2);
			super.aClass87_Sub1_22.method5116(2);
			super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static591.aClass300_5);
			super.aClass87_Sub1_22.method5131(0, Static508.aClass315_2);
			super.aClass87_Sub1_22.method5052(false, true, 1, Static508.aClass315_2);
			super.aClass87_Sub1_22.method5118(0, Static572.aClass315_4);
			super.aClass87_Sub1_22.method5079(super.aClass87_Sub1_22.anInterface7_3);
		}
		super.aClass87_Sub1_22.method5116(0);
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static40.aClass300_1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean159) {
			super.aClass87_Sub1_22.method5116(1);
			super.aClass87_Sub1_22.method5079(this.anInterface22Array1[arg0 - 1]);
			super.aClass87_Sub1_22.method5116(0);
		}
	}
}
