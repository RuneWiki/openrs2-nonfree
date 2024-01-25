import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class56_Sub8 extends Class56 {

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16384];

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "[Lclient!oq;")
	private Interface20[] anInterface20Array1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray57[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray56[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class56_Sub8(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean438) {
			this.aBoolean526 = arg0.anInt5775 < 3;
			@Pc(26) int local26 = this.aBoolean526 ? 48 : 127;
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
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local85;
						} else if (local91 == 1) {
							local101 = local85;
						} else if (local91 == 2) {
							local101 = local89;
						} else if (local91 == 3) {
							local101 = -local89;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local101 > 0.0F) {
							local154 = (int) (Math.pow((double) local101, 96.0D) * (double) local26);
							local163 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local172 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
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
			this.anInterface20Array1 = new Interface20[3];
			this.anInterface20Array1[0] = super.aClass100_Sub1_23.method4759(false, 64, local34);
			this.anInterface20Array1[1] = super.aClass100_Sub1_23.method4759(false, 64, local38);
			this.anInterface20Array1[2] = super.aClass100_Sub1_23.method4759(false, 64, local30);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass100_Sub1_23.method4816(0, Static113.aClass119_11);
			return;
		}
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4855(Static512.aClass280_4);
		@Pc(38) Class68_Sub2 local38 = super.aClass100_Sub1_23.method4818();
		local38.oa(1024);
		super.aClass100_Sub1_23.method4758(Static65.aClass190_2);
		if (this.aBoolean526) {
			super.aClass100_Sub1_23.method4797(Static202.aClass236_1, Static291.aClass236_2);
			super.aClass100_Sub1_23.method4875(false, Static325.aClass119_44, 0, true);
			super.aClass100_Sub1_23.method4816(0, Static113.aClass119_11);
		} else {
			super.aClass100_Sub1_23.method4797(Static291.aClass236_2, Static458.aClass236_4);
			super.aClass100_Sub1_23.method4883(0, Static48.aClass119_5);
			super.aClass100_Sub1_23.method4860(2);
			super.aClass100_Sub1_23.method4797(Static202.aClass236_1, Static291.aClass236_2);
			super.aClass100_Sub1_23.method4883(0, Static48.aClass119_5);
			super.aClass100_Sub1_23.method4875(false, Static48.aClass119_5, 1, true);
			super.aClass100_Sub1_23.method4816(0, Static113.aClass119_11);
			super.aClass100_Sub1_23.method4876(super.aClass100_Sub1_23.anInterface10_3);
		}
		super.aClass100_Sub1_23.method4860(0);
		this.aBoolean527 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static291.aClass236_2);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass100_Sub1_23.method4876(arg1);
		super.aClass100_Sub1_23.method4872(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		if (this.aBoolean527) {
			super.aClass100_Sub1_23.method4860(1);
			super.aClass100_Sub1_23.method4876(null);
			super.aClass100_Sub1_23.method4855(Static3.aClass280_1);
			super.aClass100_Sub1_23.method4804();
			if (this.aBoolean526) {
				super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
				super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
				super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
			} else {
				super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
				super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
				super.aClass100_Sub1_23.method4860(2);
				super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
				super.aClass100_Sub1_23.method4883(0, Static325.aClass119_44);
				super.aClass100_Sub1_23.method4883(1, Static48.aClass119_5);
				super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
				super.aClass100_Sub1_23.method4876(null);
			}
			super.aClass100_Sub1_23.method4860(0);
			this.aBoolean527 = false;
		} else {
			super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		}
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean527) {
			super.aClass100_Sub1_23.method4860(1);
			super.aClass100_Sub1_23.method4876(this.anInterface20Array1[arg0 - 1]);
			super.aClass100_Sub1_23.method4860(0);
		}
	}
}
