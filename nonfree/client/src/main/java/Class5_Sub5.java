import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Z")
	private boolean aBoolean392 = false;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "[Lclient!sba;")
	private Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class5_Sub5(@OriginalArg(0) Class144_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean440) {
			this.aBoolean391 = arg0.anInt6497 < 3;
			@Pc(28) int local28 = this.aBoolean391 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(47) int local47 = 0; local47 < 64; local47++) {
					@Pc(57) float local57 = (float) local47 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local101 > 0.0F) {
							local147 = (int) (Math.pow((double) local101, 96.0D) * (double) local28);
							local156 = (int) (Math.pow((double) local101, 36.0D) * (double) local28);
							local165 = (int) ((double) local28 * Math.pow((double) local101, 12.0D));
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local36[local91][local42] = local147 << 24;
						local40[local91][local42] = local156 << 24;
						local32[local91][local42] = local165 << 24;
					}
					local42++;
				}
			}
			this.anInterface20Array1 = new Interface20[3];
			this.anInterface20Array1[0] = super.aClass144_Sub1_20.method5741(local36, 64, false);
			this.anInterface20Array1[1] = super.aClass144_Sub1_20.method5741(local40, 64, false);
			this.anInterface20Array1[2] = super.aClass144_Sub1_20.method5741(local32, 64, false);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean392) {
			super.aClass144_Sub1_20.method5706(1);
			super.aClass144_Sub1_20.method5643(this.anInterface20Array1[arg0 - 1]);
			super.aClass144_Sub1_20.method5706(0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static345.aClass287_2);
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		if (this.aBoolean392) {
			super.aClass144_Sub1_20.method5706(1);
			super.aClass144_Sub1_20.method5643((Interface25) null);
			super.aClass144_Sub1_20.method5772(Static20.aClass170_1);
			super.aClass144_Sub1_20.method5778();
			if (this.aBoolean391) {
				super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
				super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
				super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
			} else {
				super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
				super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
				super.aClass144_Sub1_20.method5706(2);
				super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
				super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
				super.aClass144_Sub1_20.method5740(Static225.aClass138_3, 1);
				super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
				super.aClass144_Sub1_20.method5643((Interface25) null);
			}
			super.aClass144_Sub1_20.method5706(0);
			this.aBoolean392 = false;
		} else {
			super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
		}
		super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		super.aClass144_Sub1_20.method5643(arg1);
		super.aClass144_Sub1_20.method5723(arg0);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass144_Sub1_20.method5779(0, Static627.aClass138_6);
			return;
		}
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5772(Static298.aClass170_4);
		@Pc(33) Class263_Sub2 local33 = super.aClass144_Sub1_20.method5724();
		local33.method8436(1024);
		super.aClass144_Sub1_20.method5750(Static323.aClass199_7);
		if (this.aBoolean391) {
			super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static408.aClass287_3);
			super.aClass144_Sub1_20.method5775(0, Static308.aClass138_4, true, false);
			super.aClass144_Sub1_20.method5779(0, Static627.aClass138_6);
		} else {
			super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static284.aClass287_1);
			super.aClass144_Sub1_20.method5740(Static225.aClass138_3, 0);
			super.aClass144_Sub1_20.method5706(2);
			super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static408.aClass287_3);
			super.aClass144_Sub1_20.method5740(Static225.aClass138_3, 0);
			super.aClass144_Sub1_20.method5775(1, Static225.aClass138_3, true, false);
			super.aClass144_Sub1_20.method5779(0, Static627.aClass138_6);
			super.aClass144_Sub1_20.method5643(super.aClass144_Sub1_20.anInterface25_3);
		}
		super.aClass144_Sub1_20.method5706(0);
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return true;
	}
}
