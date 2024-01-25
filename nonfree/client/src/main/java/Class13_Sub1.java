import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "Z")
	private boolean aBoolean31;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "[Lclient!rr;")
	private Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class13_Sub1(@OriginalArg(0) Class57_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean696) {
			this.aBoolean31 = arg0.anInt9163 < 3;
			@Pc(30) int local30 = this.aBoolean31 ? 48 : 127;
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(42) int[][] local42 = new int[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local70 * local85;
					@Pc(93) float local93 = local61 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(123) float local123;
						if (local95 == 0) {
							local123 = -local89;
						} else if (local95 == 1) {
							local123 = local89;
						} else if (local95 == 2) {
							local123 = local93;
						} else if (local95 == 3) {
							local123 = -local93;
						} else if (local95 == 4) {
							local123 = local85;
						} else {
							local123 = -local85;
						}
						@Pc(165) int local165;
						@Pc(174) int local174;
						@Pc(183) int local183;
						if (local123 > 0.0F) {
							local165 = (int) (Math.pow((double) local123, 96.0D) * (double) local30);
							local174 = (int) (Math.pow((double) local123, 36.0D) * (double) local30);
							local183 = (int) ((double) local30 * Math.pow((double) local123, 12.0D));
						} else {
							local183 = 0;
							local174 = 0;
							local165 = 0;
						}
						local38[local95][local44] = local165 << 24;
						local42[local95][local44] = local174 << 24;
						local34[local95][local44] = local183 << 24;
					}
					local44++;
				}
			}
			this.anInterface24Array1 = new Interface24[3];
			this.anInterface24Array1[0] = super.aClass57_Sub3_21.method7797(local38, false, 64);
			this.anInterface24Array1[1] = super.aClass57_Sub3_21.method7797(local42, false, 64);
			this.anInterface24Array1[2] = super.aClass57_Sub3_21.method7797(local34, false, 64);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean30) {
			super.aClass57_Sub3_21.method7795(1);
			super.aClass57_Sub3_21.method7813(this.anInterface24Array1[arg1 - 1]);
			super.aClass57_Sub3_21.method7795(0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		if (this.anInterface24Array1 == null || !arg0) {
			super.aClass57_Sub3_21.method7781(0, Static625.aClass312_4);
			return;
		}
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7778(Static506.aClass188_47);
		@Pc(40) Class203_Sub1 local40 = super.aClass57_Sub3_21.method7829();
		local40.method8322(1024);
		super.aClass57_Sub3_21.method7822(Static310.aClass357_4);
		if (this.aBoolean31) {
			super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static11.aClass34_6);
			super.aClass57_Sub3_21.method7750(false, 0, true, Static57.aClass312_1);
			super.aClass57_Sub3_21.method7781(0, Static625.aClass312_4);
		} else {
			super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static362.aClass34_172);
			super.aClass57_Sub3_21.method7866(0, Static79.aClass312_2);
			super.aClass57_Sub3_21.method7795(2);
			super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static11.aClass34_6);
			super.aClass57_Sub3_21.method7866(0, Static79.aClass312_2);
			super.aClass57_Sub3_21.method7750(false, 1, true, Static79.aClass312_2);
			super.aClass57_Sub3_21.method7781(0, Static625.aClass312_4);
			super.aClass57_Sub3_21.method7813(super.aClass57_Sub3_21.anInterface22_3);
		}
		super.aClass57_Sub3_21.method7795(0);
		this.aBoolean30 = true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		super.aClass57_Sub3_21.method7813(arg1);
		super.aClass57_Sub3_21.method7764(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static313.aClass34_88);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		if (this.aBoolean30) {
			super.aClass57_Sub3_21.method7795(1);
			super.aClass57_Sub3_21.method7813((Interface22) null);
			super.aClass57_Sub3_21.method7778(Static497.aClass188_46);
			super.aClass57_Sub3_21.method7850();
			if (this.aBoolean31) {
				super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
				super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
				super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
			} else {
				super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
				super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
				super.aClass57_Sub3_21.method7795(2);
				super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
				super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
				super.aClass57_Sub3_21.method7866(1, Static79.aClass312_2);
				super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
				super.aClass57_Sub3_21.method7813((Interface22) null);
			}
			super.aClass57_Sub3_21.method7795(0);
			this.aBoolean30 = false;
		} else {
			super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
		}
		super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return true;
	}
}
