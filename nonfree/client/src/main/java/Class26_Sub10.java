import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class26_Sub10 extends Class26 {

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "Z")
	private boolean aBoolean721 = false;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "[Lclient!on;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class26_Sub10(@OriginalArg(0) Class145_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean958) {
			this.aBoolean720 = arg0.anInt11280 < 3;
			@Pc(30) int local30 = this.aBoolean720 ? 48 : 127;
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(42) int[][] local42 = new int[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local70 * local85;
					@Pc(93) float local93 = local61 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(104) float local104;
						if (local95 == 0) {
							local104 = -local93;
						} else if (local95 == 1) {
							local104 = local93;
						} else if (local95 == 2) {
							local104 = local89;
						} else if (local95 == 3) {
							local104 = -local89;
						} else if (local95 == 4) {
							local104 = local85;
						} else {
							local104 = -local85;
						}
						@Pc(156) int local156;
						@Pc(155) int local155;
						@Pc(153) int local153;
						if (local104 > 0.0F) {
							local156 = (int) (Math.pow((double) local104, 96.0D) * (double) local30);
							local155 = (int) ((double) local30 * Math.pow((double) local104, 36.0D));
							local153 = (int) ((double) local30 * Math.pow((double) local104, 12.0D));
						} else {
							local153 = 0;
							local155 = 0;
							local156 = 0;
						}
						local38[local95][local44] = local156 << 24;
						local42[local95][local44] = local155 << 24;
						local34[local95][local44] = local153 << 24;
					}
					local44++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass145_Sub1_21.method9740(false, local38, 64);
			this.anInterface18Array1[1] = super.aClass145_Sub1_21.method9740(false, local42, 64);
			this.anInterface18Array1[2] = super.aClass145_Sub1_21.method9740(false, local34, 64);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean721) {
			super.aClass145_Sub1_21.method9745(1);
			super.aClass145_Sub1_21.method9754(this.anInterface18Array1[arg1 - 1]);
			super.aClass145_Sub1_21.method9745(0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static162.aClass293_4);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		super.aClass145_Sub1_21.method9754(arg0);
		super.aClass145_Sub1_21.method9797(arg1);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		if (this.aBoolean721) {
			super.aClass145_Sub1_21.method9745(1);
			super.aClass145_Sub1_21.method9754((Interface9) null);
			super.aClass145_Sub1_21.method9736(Static153.aClass175_4);
			super.aClass145_Sub1_21.method9837();
			if (this.aBoolean720) {
				super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
				super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
				super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
			} else {
				super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
				super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
				super.aClass145_Sub1_21.method9745(2);
				super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
				super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
				super.aClass145_Sub1_21.method9813(Static240.aClass352_6, 1);
				super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
				super.aClass145_Sub1_21.method9754((Interface9) null);
			}
			super.aClass145_Sub1_21.method9745(0);
			this.aBoolean721 = false;
		} else {
			super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
		}
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass145_Sub1_21.method9795(0, Static150.aClass352_4);
			return;
		}
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9736(Static617.aClass175_6);
		@Pc(27) Class86_Sub2 local27 = super.aClass145_Sub1_21.method9821();
		local27.method7025(1024);
		super.aClass145_Sub1_21.method9750(Static576.aClass146_9);
		if (this.aBoolean720) {
			super.aClass145_Sub1_21.method9725(Static679.aClass293_5, Static162.aClass293_4);
			super.aClass145_Sub1_21.method9829(0, false, Static231.aClass352_5, true);
			super.aClass145_Sub1_21.method9795(0, Static150.aClass352_4);
		} else {
			super.aClass145_Sub1_21.method9725(Static162.aClass293_4, Static105.aClass293_3);
			super.aClass145_Sub1_21.method9813(Static240.aClass352_6, 0);
			super.aClass145_Sub1_21.method9745(2);
			super.aClass145_Sub1_21.method9725(Static679.aClass293_5, Static162.aClass293_4);
			super.aClass145_Sub1_21.method9813(Static240.aClass352_6, 0);
			super.aClass145_Sub1_21.method9829(1, false, Static240.aClass352_6, true);
			super.aClass145_Sub1_21.method9795(0, Static150.aClass352_4);
			super.aClass145_Sub1_21.method9754(super.aClass145_Sub1_21.anInterface9_3);
		}
		super.aClass145_Sub1_21.method9745(0);
		this.aBoolean721 = true;
	}
}
