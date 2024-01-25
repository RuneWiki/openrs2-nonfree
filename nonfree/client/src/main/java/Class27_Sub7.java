import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class27_Sub7 extends Class27 {

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "Z")
	private boolean aBoolean556 = false;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "[Lclient!qn;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class27_Sub7(@OriginalArg(0) Class133_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean478) {
			this.aBoolean555 = arg0.anInt6988 < 3;
			@Pc(28) int local28 = this.aBoolean555 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
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
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local100 > 0.0F) {
							local148 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local100, 36.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local36[local93][local42] = local148 << 24;
						local40[local93][local42] = local147 << 24;
						local32[local93][local42] = local145 << 24;
					}
					local42++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass133_Sub1_23.method6237(local36, 64, false);
			this.anInterface18Array1[1] = super.aClass133_Sub1_23.method6237(local40, 64, false);
			this.anInterface18Array1[2] = super.aClass133_Sub1_23.method6237(local32, 64, false);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return true;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass133_Sub1_23.method6159(0, Static273.aClass236_3);
			return;
		}
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6218(Static399.aClass286_6);
		@Pc(23) Class113_Sub1 local23 = super.aClass133_Sub1_23.method6183();
		local23.method8457(1024);
		super.aClass133_Sub1_23.method6225(Static573.aClass373_2);
		if (this.aBoolean555) {
			super.aClass133_Sub1_23.method6239(Static81.aClass151_2, Static481.aClass151_8);
			super.aClass133_Sub1_23.method6222(0, Static626.aClass236_6, false, true);
			super.aClass133_Sub1_23.method6159(0, Static273.aClass236_3);
		} else {
			super.aClass133_Sub1_23.method6239(Static481.aClass151_8, Static524.aClass151_11);
			super.aClass133_Sub1_23.method6211(Static229.aClass236_2, 0);
			super.aClass133_Sub1_23.method6271(2);
			super.aClass133_Sub1_23.method6239(Static81.aClass151_2, Static481.aClass151_8);
			super.aClass133_Sub1_23.method6211(Static229.aClass236_2, 0);
			super.aClass133_Sub1_23.method6222(1, Static229.aClass236_2, false, true);
			super.aClass133_Sub1_23.method6159(0, Static273.aClass236_3);
			super.aClass133_Sub1_23.method6153(super.aClass133_Sub1_23.anInterface8_3);
		}
		super.aClass133_Sub1_23.method6271(0);
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		super.aClass133_Sub1_23.method6153(arg1);
		super.aClass133_Sub1_23.method6268(arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static481.aClass151_8);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean556) {
			super.aClass133_Sub1_23.method6271(1);
			super.aClass133_Sub1_23.method6153(this.anInterface18Array1[arg0 - 1]);
			super.aClass133_Sub1_23.method6271(0);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		if (this.aBoolean556) {
			super.aClass133_Sub1_23.method6271(1);
			super.aClass133_Sub1_23.method6153(null);
			super.aClass133_Sub1_23.method6218(Static528.aClass286_10);
			super.aClass133_Sub1_23.method6172();
			if (this.aBoolean555) {
				super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
				super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
				super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
			} else {
				super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
				super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
				super.aClass133_Sub1_23.method6271(2);
				super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
				super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
				super.aClass133_Sub1_23.method6211(Static229.aClass236_2, 1);
				super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
				super.aClass133_Sub1_23.method6153(null);
			}
			super.aClass133_Sub1_23.method6271(0);
			this.aBoolean556 = false;
		} else {
			super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
		}
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
	}
}
