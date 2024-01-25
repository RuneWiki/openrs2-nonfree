import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lclient!pda;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class19_Sub1(@OriginalArg(0) Class82_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean412) {
			this.aBoolean17 = arg0.anInt5850 < 3;
			@Pc(26) int local26 = this.aBoolean17 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(100) float local100;
						if (local91 == 0) {
							local100 = -local85;
						} else if (local91 == 1) {
							local100 = local85;
						} else if (local91 == 2) {
							local100 = local89;
						} else if (local91 == 3) {
							local100 = -local89;
						} else if (local91 == 4) {
							local100 = local81;
						} else {
							local100 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local100 > 0.0F) {
							local147 = (int) (Math.pow((double) local100, 96.0D) * (double) local26);
							local156 = (int) ((double) local26 * Math.pow((double) local100, 36.0D));
							local165 = (int) ((double) local26 * Math.pow((double) local100, 12.0D));
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local34[local91][local40] = local147 << 24;
						local38[local91][local40] = local156 << 24;
						local30[local91][local40] = local165 << 24;
					}
					local40++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass82_Sub3_23.method5003(64, local34, false);
			this.anInterface18Array1[1] = super.aClass82_Sub3_23.method5003(64, local38, false);
			this.anInterface18Array1[2] = super.aClass82_Sub3_23.method5003(64, local30, false);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static131.aClass88_1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass82_Sub3_23.method4972(arg1);
		super.aClass82_Sub3_23.method5010(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean18) {
			super.aClass82_Sub3_23.method4946(1);
			super.aClass82_Sub3_23.method4972(this.anInterface18Array1[arg1 - 1]);
			super.aClass82_Sub3_23.method4946(0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass82_Sub3_23.method5028(Static309.aClass165_2, 0);
			return;
		}
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4963(Static637.aClass306_5);
		@Pc(30) Class31_Sub2 local30 = super.aClass82_Sub3_23.method4931();
		local30.method7935(1024);
		super.aClass82_Sub3_23.method4974(Static647.aClass193_9);
		if (this.aBoolean17) {
			super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static418.aClass88_2);
			super.aClass82_Sub3_23.method5034(0, true, Static527.aClass165_4, false);
			super.aClass82_Sub3_23.method5028(Static309.aClass165_2, 0);
		} else {
			super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static443.aClass88_3);
			super.aClass82_Sub3_23.method4928(0, Static430.aClass165_3);
			super.aClass82_Sub3_23.method4946(2);
			super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static418.aClass88_2);
			super.aClass82_Sub3_23.method4928(0, Static430.aClass165_3);
			super.aClass82_Sub3_23.method5034(1, true, Static430.aClass165_3, false);
			super.aClass82_Sub3_23.method5028(Static309.aClass165_2, 0);
			super.aClass82_Sub3_23.method4972(super.aClass82_Sub3_23.anInterface10_3);
		}
		super.aClass82_Sub3_23.method4946(0);
		this.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		if (this.aBoolean18) {
			super.aClass82_Sub3_23.method4946(1);
			super.aClass82_Sub3_23.method4972((Interface10) null);
			super.aClass82_Sub3_23.method4963(Static279.aClass306_2);
			super.aClass82_Sub3_23.method4973();
			if (this.aBoolean17) {
				super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
				super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
				super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
			} else {
				super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
				super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
				super.aClass82_Sub3_23.method4946(2);
				super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
				super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
				super.aClass82_Sub3_23.method4928(1, Static430.aClass165_3);
				super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
				super.aClass82_Sub3_23.method4972((Interface10) null);
			}
			super.aClass82_Sub3_23.method4946(0);
			this.aBoolean18 = false;
		} else {
			super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
		}
		super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
	}
}
