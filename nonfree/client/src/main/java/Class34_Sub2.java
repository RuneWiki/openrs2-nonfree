import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!es", name = "q", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "Z")
	private boolean aBoolean148;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "[Lclient!ap;")
	private Interface3[] anInterface3Array1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class34_Sub2(@OriginalArg(0) Class162_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean341) {
			this.aBoolean148 = arg0.anInt4587 < 3;
			@Pc(26) int local26 = this.aBoolean148 ? 48 : 127;
			@Pc(30) int[][] local30 = new int[6][4096];
			@Pc(34) int[][] local34 = new int[6][4096];
			@Pc(38) int[][] local38 = new int[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(102) float local102;
						if (local91 == 0) {
							local102 = -local89;
						} else if (local91 == 1) {
							local102 = local89;
						} else if (local91 == 2) {
							local102 = local85;
						} else if (local91 == 3) {
							local102 = -local85;
						} else if (local91 == 4) {
							local102 = local81;
						} else {
							local102 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local102 > 0.0F) {
							local146 = (int) ((double) local26 * Math.pow((double) local102, 96.0D));
							local145 = (int) (Math.pow((double) local102, 36.0D) * (double) local26);
							local143 = (int) (Math.pow((double) local102, 12.0D) * (double) local26);
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = local146 << 24;
						local38[local91][local40] = local145 << 24;
						local30[local91][local40] = local143 << 24;
					}
					local40++;
				}
			}
			this.anInterface3Array1 = new Interface3[3];
			this.anInterface3Array1[0] = super.aClass162_Sub1_23.method3890(false, local34, 64);
			this.anInterface3Array1[1] = super.aClass162_Sub1_23.method3890(false, local38, 64);
			this.anInterface3Array1[2] = super.aClass162_Sub1_23.method3890(false, local30, 64);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
		super.aClass162_Sub1_23.method3906(arg1);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean147) {
			super.aClass162_Sub1_23.method3926(1);
			super.aClass162_Sub1_23.method3865(this.anInterface3Array1[arg0 - 1]);
			super.aClass162_Sub1_23.method3926(0);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		if (this.anInterface3Array1 == null || !arg0) {
			super.aClass162_Sub1_23.method3877(0, Static491.aClass263_3);
			return;
		}
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3845(Static530.aClass297_3);
		@Pc(33) Class25_Sub2 local33 = super.aClass162_Sub1_23.method3899();
		local33.oa(1024);
		super.aClass162_Sub1_23.method3919(Static79.aClass348_8);
		if (this.aBoolean148) {
			super.aClass162_Sub1_23.method3867(Static449.aClass247_3, Static317.aClass247_2);
			super.aClass162_Sub1_23.method3828(true, false, Static191.aClass263_2, 0);
			super.aClass162_Sub1_23.method3877(0, Static491.aClass263_3);
		} else {
			super.aClass162_Sub1_23.method3867(Static317.aClass247_2, Static460.aClass247_4);
			super.aClass162_Sub1_23.method3885(Static64.aClass263_1, 0);
			super.aClass162_Sub1_23.method3926(2);
			super.aClass162_Sub1_23.method3867(Static449.aClass247_3, Static317.aClass247_2);
			super.aClass162_Sub1_23.method3885(Static64.aClass263_1, 0);
			super.aClass162_Sub1_23.method3828(true, false, Static64.aClass263_1, 1);
			super.aClass162_Sub1_23.method3877(0, Static491.aClass263_3);
			super.aClass162_Sub1_23.method3865(super.aClass162_Sub1_23.anInterface20_3);
		}
		super.aClass162_Sub1_23.method3926(0);
		this.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		if (this.aBoolean147) {
			super.aClass162_Sub1_23.method3926(1);
			super.aClass162_Sub1_23.method3865(null);
			super.aClass162_Sub1_23.method3845(Static592.aClass297_4);
			super.aClass162_Sub1_23.method3855();
			if (this.aBoolean148) {
				super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
				super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
				super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
			} else {
				super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
				super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
				super.aClass162_Sub1_23.method3926(2);
				super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
				super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
				super.aClass162_Sub1_23.method3885(Static64.aClass263_1, 1);
				super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
				super.aClass162_Sub1_23.method3865(null);
			}
			super.aClass162_Sub1_23.method3926(0);
			this.aBoolean147 = false;
		} else {
			super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		}
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return true;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static317.aClass247_2);
	}
}
