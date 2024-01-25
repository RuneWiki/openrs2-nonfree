import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class22_Sub9 extends Class22 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
	private boolean aBoolean721 = false;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "Z")
	private boolean aBoolean722;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "[Lclient!qca;")
	private Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class22_Sub9(@OriginalArg(0) Class14_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean609) {
			this.aBoolean722 = arg0.anInt8600 < 3;
			@Pc(28) int local28 = this.aBoolean722 ? 48 : 127;
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
						@Pc(112) float local112;
						if (local93 == 0) {
							local112 = -local91;
						} else if (local93 == 1) {
							local112 = local91;
						} else if (local93 == 2) {
							local112 = local87;
						} else if (local93 == 3) {
							local112 = -local87;
						} else if (local93 == 4) {
							local112 = local83;
						} else {
							local112 = -local83;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local112 > 0.0F) {
							local154 = (int) (Math.pow((double) local112, 96.0D) * (double) local28);
							local163 = (int) ((double) local28 * Math.pow((double) local112, 36.0D));
							local172 = (int) (Math.pow((double) local112, 12.0D) * (double) local28);
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local36[local93][local42] = local154 << 24;
						local40[local93][local42] = local163 << 24;
						local32[local93][local42] = local172 << 24;
					}
					local42++;
				}
			}
			this.anInterface19Array1 = new Interface19[3];
			this.anInterface19Array1[0] = super.aClass14_Sub2_20.method6932(64, local36, false);
			this.anInterface19Array1[1] = super.aClass14_Sub2_20.method6932(64, local40, false);
			this.anInterface19Array1[2] = super.aClass14_Sub2_20.method6932(64, local32, false);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		if (this.anInterface19Array1 == null || !arg0) {
			super.aClass14_Sub2_20.method6968(Static89.aClass138_1, 0);
			return;
		}
		super.aClass14_Sub2_20.method6954(1);
		super.aClass14_Sub2_20.method6946(Static62.aClass215_2);
		@Pc(40) Class54_Sub3 local40 = super.aClass14_Sub2_20.method7020();
		local40.XA(1024);
		super.aClass14_Sub2_20.method7023(Static483.aClass280_8);
		if (this.aBoolean722) {
			super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static350.aClass228_12);
			super.aClass14_Sub2_20.method6996(true, Static185.aClass138_3, false, 0);
			super.aClass14_Sub2_20.method6968(Static89.aClass138_1, 0);
		} else {
			super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static568.aClass228_14);
			super.aClass14_Sub2_20.method6912(Static457.aClass138_4, 0);
			super.aClass14_Sub2_20.method6954(2);
			super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static350.aClass228_12);
			super.aClass14_Sub2_20.method6912(Static457.aClass138_4, 0);
			super.aClass14_Sub2_20.method6996(true, Static457.aClass138_4, false, 1);
			super.aClass14_Sub2_20.method6968(Static89.aClass138_1, 0);
			super.aClass14_Sub2_20.method7034(super.aClass14_Sub2_20.anInterface10_3);
		}
		super.aClass14_Sub2_20.method6954(0);
		this.aBoolean721 = true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static41.aClass228_10);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		if (this.aBoolean721) {
			super.aClass14_Sub2_20.method6954(1);
			super.aClass14_Sub2_20.method7034(null);
			super.aClass14_Sub2_20.method6946(Static458.aClass215_4);
			super.aClass14_Sub2_20.method7002();
			if (this.aBoolean722) {
				super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
				super.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
				super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
			} else {
				super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
				super.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
				super.aClass14_Sub2_20.method6954(2);
				super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
				super.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
				super.aClass14_Sub2_20.method6912(Static457.aClass138_4, 1);
				super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
				super.aClass14_Sub2_20.method7034(null);
			}
			super.aClass14_Sub2_20.method6954(0);
			this.aBoolean721 = false;
		} else {
			super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
		}
		super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass14_Sub2_20.method7034(arg1);
		super.aClass14_Sub2_20.method7011(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean721) {
			super.aClass14_Sub2_20.method6954(1);
			super.aClass14_Sub2_20.method7034(this.anInterface19Array1[arg1 - 1]);
			super.aClass14_Sub2_20.method6954(0);
		}
	}
}
