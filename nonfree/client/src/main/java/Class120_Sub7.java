import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class120_Sub7 extends Class120 {

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "Z")
	private boolean aBoolean559 = false;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "[Lclient!wn;")
	private Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class120_Sub7(@OriginalArg(0) Class5_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean541) {
			this.aBoolean560 = arg0.anInt7760 < 3;
			@Pc(28) int local28 = this.aBoolean560 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(107) float local107;
						if (local93 == 0) {
							local107 = -local87;
						} else if (local93 == 1) {
							local107 = local87;
						} else if (local93 == 2) {
							local107 = local91;
						} else if (local93 == 3) {
							local107 = -local91;
						} else if (local93 == 4) {
							local107 = local83;
						} else {
							local107 = -local83;
						}
						@Pc(151) int local151;
						@Pc(160) int local160;
						@Pc(169) int local169;
						if (local107 > 0.0F) {
							local151 = (int) ((double) local28 * Math.pow((double) local107, 96.0D));
							local160 = (int) (Math.pow((double) local107, 36.0D) * (double) local28);
							local169 = (int) ((double) local28 * Math.pow((double) local107, 12.0D));
						} else {
							local169 = 0;
							local160 = 0;
							local151 = 0;
						}
						local36[local93][local42] = local151 << 24;
						local40[local93][local42] = local160 << 24;
						local32[local93][local42] = local169 << 24;
					}
					local42++;
				}
			}
			this.anInterface20Array1 = new Interface20[3];
			this.anInterface20Array1[0] = super.aClass5_Sub3_20.method6379(false, 64, local36);
			this.anInterface20Array1[1] = super.aClass5_Sub3_20.method6379(false, 64, local40);
			this.anInterface20Array1[2] = super.aClass5_Sub3_20.method6379(false, 64, local32);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static130.aClass289_1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
		super.aClass5_Sub3_20.method6309(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		if (this.aBoolean559) {
			super.aClass5_Sub3_20.method6388(1);
			super.aClass5_Sub3_20.method6416(null);
			super.aClass5_Sub3_20.method6394(Static331.aClass177_3);
			super.aClass5_Sub3_20.method6376();
			if (this.aBoolean560) {
				super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
				super.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
				super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
			} else {
				super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
				super.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
				super.aClass5_Sub3_20.method6388(2);
				super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
				super.aClass5_Sub3_20.method6415(Static213.aClass166_3, 0);
				super.aClass5_Sub3_20.method6415(Static28.aClass166_1, 1);
				super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
				super.aClass5_Sub3_20.method6416(null);
			}
			super.aClass5_Sub3_20.method6388(0);
			this.aBoolean559 = false;
		} else {
			super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
		}
		super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean559) {
			super.aClass5_Sub3_20.method6388(1);
			super.aClass5_Sub3_20.method6416(this.anInterface20Array1[arg0 - 1]);
			super.aClass5_Sub3_20.method6388(0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass5_Sub3_20.method6314(Static501.aClass166_4, 0);
			return;
		}
		super.aClass5_Sub3_20.method6388(1);
		super.aClass5_Sub3_20.method6394(Static534.aClass177_4);
		@Pc(27) Class205_Sub1 local27 = super.aClass5_Sub3_20.method6348();
		local27.XA(1024);
		super.aClass5_Sub3_20.method6355(Static124.aClass243_14);
		if (this.aBoolean560) {
			super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static500.aClass289_4);
			super.aClass5_Sub3_20.method6358(true, 0, Static213.aClass166_3, false);
			super.aClass5_Sub3_20.method6314(Static501.aClass166_4, 0);
		} else {
			super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static526.aClass289_5);
			super.aClass5_Sub3_20.method6415(Static28.aClass166_1, 0);
			super.aClass5_Sub3_20.method6388(2);
			super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static500.aClass289_4);
			super.aClass5_Sub3_20.method6415(Static28.aClass166_1, 0);
			super.aClass5_Sub3_20.method6358(true, 1, Static28.aClass166_1, false);
			super.aClass5_Sub3_20.method6314(Static501.aClass166_4, 0);
			super.aClass5_Sub3_20.method6416(super.aClass5_Sub3_20.anInterface12_3);
		}
		super.aClass5_Sub3_20.method6388(0);
		this.aBoolean559 = true;
	}
}
