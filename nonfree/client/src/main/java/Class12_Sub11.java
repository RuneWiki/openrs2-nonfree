import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class12_Sub11 extends Class12 {

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
	private boolean aBoolean633;

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "[Lclient!pu;")
	private Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class12_Sub11(@OriginalArg(0) Class43_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean356) {
			this.aBoolean633 = arg0.anInt4834 < 3;
			@Pc(28) int local28 = this.aBoolean633 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(100) float local100;
						if (local93 == 0) {
							local100 = -local91;
						} else if (local93 == 1) {
							local100 = local91;
						} else if (local93 == 2) {
							local100 = local87;
						} else if (local93 == 3) {
							local100 = -local87;
						} else if (local93 == 4) {
							local100 = local83;
						} else {
							local100 = -local83;
						}
						@Pc(151) int local151;
						@Pc(160) int local160;
						@Pc(169) int local169;
						if (local100 > 0.0F) {
							local151 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local160 = (int) ((double) local28 * Math.pow((double) local100, 36.0D));
							local169 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
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
			this.anInterface20Array1[0] = super.aClass43_Sub1_21.method4220(false, local36, 64);
			this.anInterface20Array1[1] = super.aClass43_Sub1_21.method4220(false, local40, 64);
			this.anInterface20Array1[2] = super.aClass43_Sub1_21.method4220(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		if (this.aBoolean632) {
			super.aClass43_Sub1_21.method4238(1);
			super.aClass43_Sub1_21.method4298(null);
			super.aClass43_Sub1_21.method4297(Static54.aClass307_2);
			super.aClass43_Sub1_21.method4235();
			if (this.aBoolean633) {
				super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
				super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
				super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
			} else {
				super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
				super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
				super.aClass43_Sub1_21.method4238(2);
				super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
				super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
				super.aClass43_Sub1_21.method4251(1, Static165.aClass252_3);
				super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
				super.aClass43_Sub1_21.method4298(null);
			}
			super.aClass43_Sub1_21.method4238(0);
			this.aBoolean632 = false;
		} else {
			super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		}
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static587.aClass37_5);
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean632) {
			super.aClass43_Sub1_21.method4238(1);
			super.aClass43_Sub1_21.method4298(this.anInterface20Array1[arg0 - 1]);
			super.aClass43_Sub1_21.method4238(0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass43_Sub1_21.method4241(0, Static525.aClass252_4);
			return;
		}
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4297(Static28.aClass307_1);
		@Pc(21) Class109_Sub3 local21 = super.aClass43_Sub1_21.method4264();
		local21.oa(1024);
		super.aClass43_Sub1_21.method4296(Static233.aClass174_24);
		if (this.aBoolean633) {
			super.aClass43_Sub1_21.method4253(Static581.aClass37_4, Static587.aClass37_5);
			super.aClass43_Sub1_21.method4268(Static74.aClass252_1, true, false, 0);
			super.aClass43_Sub1_21.method4241(0, Static525.aClass252_4);
		} else {
			super.aClass43_Sub1_21.method4253(Static587.aClass37_5, Static106.aClass37_2);
			super.aClass43_Sub1_21.method4251(0, Static165.aClass252_3);
			super.aClass43_Sub1_21.method4238(2);
			super.aClass43_Sub1_21.method4253(Static581.aClass37_4, Static587.aClass37_5);
			super.aClass43_Sub1_21.method4251(0, Static165.aClass252_3);
			super.aClass43_Sub1_21.method4268(Static165.aClass252_3, true, false, 1);
			super.aClass43_Sub1_21.method4241(0, Static525.aClass252_4);
			super.aClass43_Sub1_21.method4298(super.aClass43_Sub1_21.anInterface11_3);
		}
		super.aClass43_Sub1_21.method4238(0);
		this.aBoolean632 = true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
		super.aClass43_Sub1_21.method4183(arg0);
	}
}
