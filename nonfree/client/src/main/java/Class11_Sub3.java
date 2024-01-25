import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[Lclient!vq;")
	private Interface25[] anInterface25Array1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class11_Sub3(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean357) {
			this.aBoolean267 = arg0.anInt4897 < 3;
			@Pc(28) int local28 = this.aBoolean267 ? 48 : 127;
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
						@Pc(107) float local107;
						if (local93 == 0) {
							local107 = -local91;
						} else if (local93 == 1) {
							local107 = local91;
						} else if (local93 == 2) {
							local107 = local87;
						} else if (local93 == 3) {
							local107 = -local87;
						} else if (local93 == 4) {
							local107 = local83;
						} else {
							local107 = -local83;
						}
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local107 > 0.0F) {
							local149 = (int) ((double) local28 * Math.pow((double) local107, 96.0D));
							local148 = (int) (Math.pow((double) local107, 36.0D) * (double) local28);
							local146 = (int) ((double) local28 * Math.pow((double) local107, 12.0D));
						} else {
							local146 = 0;
							local148 = 0;
							local149 = 0;
						}
						local36[local93][local42] = local149 << 24;
						local40[local93][local42] = local148 << 24;
						local32[local93][local42] = local146 << 24;
					}
					local42++;
				}
			}
			this.anInterface25Array1 = new Interface25[3];
			this.anInterface25Array1[0] = super.aClass16_Sub1_21.method3898(64, false, local36);
			this.anInterface25Array1[1] = super.aClass16_Sub1_21.method3898(64, false, local40);
			this.anInterface25Array1[2] = super.aClass16_Sub1_21.method3898(64, false, local32);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_21.method3889(arg0);
		super.aClass16_Sub1_21.method3937(arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean268) {
			super.aClass16_Sub1_21.method3899(1);
			super.aClass16_Sub1_21.method3889(this.anInterface25Array1[arg0 - 1]);
			super.aClass16_Sub1_21.method3899(0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static402.aClass34_4);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		if (this.aBoolean268) {
			super.aClass16_Sub1_21.method3899(1);
			super.aClass16_Sub1_21.method3889(null);
			super.aClass16_Sub1_21.method3893(Static297.aClass100_21);
			super.aClass16_Sub1_21.method3930();
			if (this.aBoolean267) {
				super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
				super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
				super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
			} else {
				super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
				super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
				super.aClass16_Sub1_21.method3899(2);
				super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
				super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
				super.aClass16_Sub1_21.method3946(1, Static613.aClass265_9);
				super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
				super.aClass16_Sub1_21.method3889(null);
			}
			super.aClass16_Sub1_21.method3899(0);
			this.aBoolean268 = false;
		} else {
			super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
		}
		super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		if (this.anInterface25Array1 == null || !arg0) {
			super.aClass16_Sub1_21.method3950(0, Static303.aClass265_5);
			return;
		}
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3893(Static622.aClass100_36);
		@Pc(34) Class54_Sub3 local34 = super.aClass16_Sub1_21.method3906();
		local34.method5131(1024);
		super.aClass16_Sub1_21.method3908(Static222.aClass207_5);
		if (this.aBoolean267) {
			super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static125.aClass34_3);
			super.aClass16_Sub1_21.method4000(false, true, 0, Static625.aClass265_10);
			super.aClass16_Sub1_21.method3950(0, Static303.aClass265_5);
		} else {
			super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static428.aClass34_5);
			super.aClass16_Sub1_21.method3946(0, Static613.aClass265_9);
			super.aClass16_Sub1_21.method3899(2);
			super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static125.aClass34_3);
			super.aClass16_Sub1_21.method3946(0, Static613.aClass265_9);
			super.aClass16_Sub1_21.method4000(false, true, 1, Static613.aClass265_9);
			super.aClass16_Sub1_21.method3950(0, Static303.aClass265_5);
			super.aClass16_Sub1_21.method3889(super.aClass16_Sub1_21.anInterface12_3);
		}
		super.aClass16_Sub1_21.method3899(0);
		this.aBoolean268 = true;
	}
}
