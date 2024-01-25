import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[Lclient!jn;")
	private Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class3_Sub9(@OriginalArg(0) Class12_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean537) {
			this.aBoolean497 = arg0.anInt7533 < 3;
			@Pc(26) int local26 = this.aBoolean497 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(150) int local150;
						@Pc(149) int local149;
						@Pc(147) int local147;
						if (local98 > 0.0F) {
							local150 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local149 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local147 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local147 = 0;
							local149 = 0;
							local150 = 0;
						}
						local34[local91][local40] = local150 << 24;
						local38[local91][local40] = local149 << 24;
						local30[local91][local40] = local147 << 24;
					}
					local40++;
				}
			}
			this.anInterface12Array1 = new Interface12[3];
			this.anInterface12Array1[0] = super.aClass12_Sub2_23.method6248(64, false, local34);
			this.anInterface12Array1[1] = super.aClass12_Sub2_23.method6248(64, false, local38);
			this.anInterface12Array1[2] = super.aClass12_Sub2_23.method6248(64, false, local30);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static9.aClass108_2);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		if (this.anInterface12Array1 == null || !arg0) {
			super.aClass12_Sub2_23.method6234(0, Static328.aClass84_3);
			return;
		}
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6157(Static499.aClass74_4);
		@Pc(21) Class209_Sub2 local21 = super.aClass12_Sub2_23.method6270();
		local21.oa(1024);
		super.aClass12_Sub2_23.method6162(Static566.aClass296_6);
		if (this.aBoolean497) {
			super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static466.aClass108_4);
			super.aClass12_Sub2_23.method6280(0, Static587.aClass84_6, false, true);
			super.aClass12_Sub2_23.method6234(0, Static328.aClass84_3);
		} else {
			super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static240.aClass108_5);
			super.aClass12_Sub2_23.method6179(Static266.aClass84_5, 0);
			super.aClass12_Sub2_23.method6196(2);
			super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static466.aClass108_4);
			super.aClass12_Sub2_23.method6179(Static266.aClass84_5, 0);
			super.aClass12_Sub2_23.method6280(1, Static266.aClass84_5, false, true);
			super.aClass12_Sub2_23.method6234(0, Static328.aClass84_3);
			super.aClass12_Sub2_23.method6159(super.aClass12_Sub2_23.anInterface18_3);
		}
		super.aClass12_Sub2_23.method6196(0);
		this.aBoolean499 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6159(arg0);
		super.aClass12_Sub2_23.method6249(arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean499) {
			super.aClass12_Sub2_23.method6196(1);
			super.aClass12_Sub2_23.method6159(this.anInterface12Array1[arg0 - 1]);
			super.aClass12_Sub2_23.method6196(0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		if (this.aBoolean499) {
			super.aClass12_Sub2_23.method6196(1);
			super.aClass12_Sub2_23.method6159(null);
			super.aClass12_Sub2_23.method6157(Static26.aClass74_1);
			super.aClass12_Sub2_23.method6237();
			if (this.aBoolean497) {
				super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
				super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
				super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
			} else {
				super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
				super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
				super.aClass12_Sub2_23.method6196(2);
				super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
				super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
				super.aClass12_Sub2_23.method6179(Static266.aClass84_5, 1);
				super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
				super.aClass12_Sub2_23.method6159(null);
			}
			super.aClass12_Sub2_23.method6196(0);
			this.aBoolean499 = false;
		} else {
			super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		}
		super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
	}
}
