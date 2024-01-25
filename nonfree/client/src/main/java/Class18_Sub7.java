import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class18_Sub7 extends Class18 {

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "[Lclient!lha;")
	private Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class18_Sub7(@OriginalArg(0) Class65_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean429) {
			this.aBoolean737 = arg0.anInt5257 < 3;
			@Pc(24) int local24 = this.aBoolean737 ? 48 : 127;
			@Pc(28) int[][] local28 = new int[6][4096];
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local62 * local62 + local53 * local53 + 1.0F)));
					@Pc(81) float local81 = local53 * local77;
					@Pc(85) float local85 = local62 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(93) float local93;
						if (local87 == 0) {
							local93 = -local85;
						} else if (local87 == 1) {
							local93 = local85;
						} else if (local87 == 2) {
							local93 = local81;
						} else if (local87 == 3) {
							local93 = -local81;
						} else if (local87 == 4) {
							local93 = local77;
						} else {
							local93 = -local77;
						}
						@Pc(134) int local134;
						@Pc(133) int local133;
						@Pc(131) int local131;
						if (local93 > 0.0F) {
							local134 = (int) ((double) local24 * Math.pow((double) local93, 96.0D));
							local133 = (int) (Math.pow((double) local93, 36.0D) * (double) local24);
							local131 = (int) (Math.pow((double) local93, 12.0D) * (double) local24);
						} else {
							local131 = 0;
							local133 = 0;
							local134 = 0;
						}
						local32[local87][local38] = local134 << 24;
						local36[local87][local38] = local133 << 24;
						local28[local87][local38] = local131 << 24;
					}
					local38++;
				}
			}
			this.anInterface14Array1 = new Interface14[3];
			this.anInterface14Array1[0] = super.aClass65_Sub2_23.method4387(local32, 64, false);
			this.anInterface14Array1[1] = super.aClass65_Sub2_23.method4387(local36, 64, false);
			this.anInterface14Array1[2] = super.aClass65_Sub2_23.method4387(local28, 64, false);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static138.aClass178_2);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		if (this.aBoolean736) {
			super.aClass65_Sub2_23.method4358(1);
			super.aClass65_Sub2_23.method4426((Interface25) null);
			super.aClass65_Sub2_23.method4347(Static407.aClass162_4);
			super.aClass65_Sub2_23.method4423();
			if (this.aBoolean737) {
				super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
				super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
				super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
			} else {
				super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
				super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
				super.aClass65_Sub2_23.method4358(2);
				super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
				super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
				super.aClass65_Sub2_23.method4400(Static169.aClass64_1, 1);
				super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
				super.aClass65_Sub2_23.method4426((Interface25) null);
			}
			super.aClass65_Sub2_23.method4358(0);
			this.aBoolean736 = false;
		} else {
			super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
		}
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		if (this.anInterface14Array1 == null || !arg0) {
			super.aClass65_Sub2_23.method4369(0, Static235.aClass64_2);
			return;
		}
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4347(Static287.aClass162_3);
		@Pc(37) Class254_Sub2 local37 = super.aClass65_Sub2_23.method4439();
		local37.method7354(1024);
		super.aClass65_Sub2_23.method4411(Static581.aClass198_5);
		if (this.aBoolean737) {
			super.aClass65_Sub2_23.method4432(Static654.aClass178_5, Static138.aClass178_2);
			super.aClass65_Sub2_23.method4388(0, Static536.aClass64_4, true, false);
			super.aClass65_Sub2_23.method4369(0, Static235.aClass64_2);
		} else {
			super.aClass65_Sub2_23.method4432(Static138.aClass178_2, Static606.aClass178_4);
			super.aClass65_Sub2_23.method4400(Static169.aClass64_1, 0);
			super.aClass65_Sub2_23.method4358(2);
			super.aClass65_Sub2_23.method4432(Static654.aClass178_5, Static138.aClass178_2);
			super.aClass65_Sub2_23.method4400(Static169.aClass64_1, 0);
			super.aClass65_Sub2_23.method4388(1, Static169.aClass64_1, true, false);
			super.aClass65_Sub2_23.method4369(0, Static235.aClass64_2);
			super.aClass65_Sub2_23.method4426(super.aClass65_Sub2_23.anInterface25_3);
		}
		super.aClass65_Sub2_23.method4358(0);
		this.aBoolean736 = true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean736) {
			super.aClass65_Sub2_23.method4358(1);
			super.aClass65_Sub2_23.method4426(this.anInterface14Array1[arg1 - 1]);
			super.aClass65_Sub2_23.method4358(0);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		super.aClass65_Sub2_23.method4426(arg1);
		super.aClass65_Sub2_23.method4405(arg0);
	}
}
