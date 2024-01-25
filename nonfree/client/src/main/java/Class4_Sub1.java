import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!afa", name = "m", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "[Lclient!fn;")
	private Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class4_Sub1(@OriginalArg(0) Class13_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean654) {
			this.aBoolean9 = arg0.anInt8620 < 3;
			@Pc(26) int local26 = this.aBoolean9 ? 48 : 127;
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
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local89;
						} else if (local91 == 1) {
							local105 = local89;
						} else if (local91 == 2) {
							local105 = local85;
						} else if (local91 == 3) {
							local105 = -local85;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local105 > 0.0F) {
							local154 = (int) ((double) local26 * Math.pow((double) local105, 96.0D));
							local163 = (int) (Math.pow((double) local105, 36.0D) * (double) local26);
							local172 = (int) (Math.pow((double) local105, 12.0D) * (double) local26);
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local34[local91][local40] = local154 << 24;
						local38[local91][local40] = local163 << 24;
						local30[local91][local40] = local172 << 24;
					}
					local40++;
				}
			}
			this.anInterface10Array1 = new Interface10[3];
			this.anInterface10Array1[0] = super.aClass13_Sub1_23.method7513(false, 64, local34);
			this.anInterface10Array1[1] = super.aClass13_Sub1_23.method7513(false, 64, local38);
			this.anInterface10Array1[2] = super.aClass13_Sub1_23.method7513(false, 64, local30);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean8) {
			super.aClass13_Sub1_23.method7461(1);
			super.aClass13_Sub1_23.method7530(this.anInterface10Array1[arg0 - 1]);
			super.aClass13_Sub1_23.method7461(0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static580.aClass203_4);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass13_Sub1_23.method7530(arg1);
		super.aClass13_Sub1_23.method7509(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		if (this.anInterface10Array1 == null || !arg0) {
			super.aClass13_Sub1_23.method7517(0, Static206.aClass326_3);
			return;
		}
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7408(Static263.aClass10_1);
		@Pc(29) Class239_Sub3 local29 = super.aClass13_Sub1_23.method7512();
		local29.method9250(1024);
		super.aClass13_Sub1_23.method7464(Static293.aClass94_6);
		if (this.aBoolean9) {
			super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static191.aClass203_2);
			super.aClass13_Sub1_23.method7498(true, false, 0, Static523.aClass326_5);
			super.aClass13_Sub1_23.method7517(0, Static206.aClass326_3);
		} else {
			super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static265.aClass203_3);
			super.aClass13_Sub1_23.method7522(Static348.aClass326_4, 0);
			super.aClass13_Sub1_23.method7461(2);
			super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static191.aClass203_2);
			super.aClass13_Sub1_23.method7522(Static348.aClass326_4, 0);
			super.aClass13_Sub1_23.method7498(true, false, 1, Static348.aClass326_4);
			super.aClass13_Sub1_23.method7517(0, Static206.aClass326_3);
			super.aClass13_Sub1_23.method7530(super.aClass13_Sub1_23.anInterface3_3);
		}
		super.aClass13_Sub1_23.method7461(0);
		this.aBoolean8 = true;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		if (this.aBoolean8) {
			super.aClass13_Sub1_23.method7461(1);
			super.aClass13_Sub1_23.method7530((Interface3) null);
			super.aClass13_Sub1_23.method7408(Static635.aClass10_3);
			super.aClass13_Sub1_23.method7510();
			if (this.aBoolean9) {
				super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
				super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
				super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
			} else {
				super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
				super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
				super.aClass13_Sub1_23.method7461(2);
				super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
				super.aClass13_Sub1_23.method7522(Static523.aClass326_5, 0);
				super.aClass13_Sub1_23.method7522(Static348.aClass326_4, 1);
				super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
				super.aClass13_Sub1_23.method7530((Interface3) null);
			}
			super.aClass13_Sub1_23.method7461(0);
			this.aBoolean8 = false;
		} else {
			super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
		}
		super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
	}
}
