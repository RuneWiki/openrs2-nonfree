import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class38_Sub10 extends Class38 {

	@OriginalMember(owner = "client!st", name = "D", descriptor = "[I")
	public static final int[] anIntArray482 = new int[32];

	@OriginalMember(owner = "client!st", name = "o", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!st", name = "v", descriptor = "[Lclient!gi;")
	private Interface13[] anInterface13Array1;

	static {
		@Pc(147) int local147 = 2;
		for (@Pc(149) int local149 = 0; local149 < 32; local149++) {
			anIntArray482[local149] = local147 - 1;
			local147 += local147;
		}
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class38_Sub10(@OriginalArg(0) Class44_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean354) {
			this.aBoolean626 = arg0.anInt4961 < 3;
			@Pc(28) int local28 = this.aBoolean626 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local87;
						} else if (local93 == 1) {
							local103 = local87;
						} else if (local93 == 2) {
							local103 = local91;
						} else if (local93 == 3) {
							local103 = -local91;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local103 > 0.0F) {
							local154 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local163 = (int) (Math.pow((double) local103, 36.0D) * (double) local28);
							local172 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
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
			this.anInterface13Array1 = new Interface13[3];
			this.anInterface13Array1[0] = super.aClass44_Sub2_21.method4364(64, false, local36);
			this.anInterface13Array1[1] = super.aClass44_Sub2_21.method4364(64, false, local40);
			this.anInterface13Array1[2] = super.aClass44_Sub2_21.method4364(64, false, local32);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean625) {
			super.aClass44_Sub2_21.method4267(1);
			super.aClass44_Sub2_21.method4265(this.anInterface13Array1[arg0 - 1]);
			super.aClass44_Sub2_21.method4267(0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		super.aClass44_Sub2_21.method4265(arg1);
		super.aClass44_Sub2_21.method4335(arg0);
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		if (this.aBoolean625) {
			super.aClass44_Sub2_21.method4267(1);
			super.aClass44_Sub2_21.method4265(null);
			super.aClass44_Sub2_21.method4346(Static3.aClass54_1);
			super.aClass44_Sub2_21.method4247();
			if (this.aBoolean626) {
				super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
				super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
				super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
			} else {
				super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
				super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
				super.aClass44_Sub2_21.method4267(2);
				super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
				super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
				super.aClass44_Sub2_21.method4241(1, Static283.aClass328_5);
				super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
				super.aClass44_Sub2_21.method4265(null);
			}
			super.aClass44_Sub2_21.method4267(0);
			this.aBoolean625 = false;
		} else {
			super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		}
		super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static573.aClass117_9);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		if (this.anInterface13Array1 == null || !arg0) {
			super.aClass44_Sub2_21.method4312(0, Static233.aClass328_1);
			return;
		}
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4346(Static266.aClass54_5);
		@Pc(26) Class8_Sub3 local26 = super.aClass44_Sub2_21.method4353();
		local26.oa(1024);
		super.aClass44_Sub2_21.method4268(Static484.aClass340_7);
		if (this.aBoolean626) {
			super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static341.aClass117_4);
			super.aClass44_Sub2_21.method4258(true, 0, Static519.aClass328_4, false);
			super.aClass44_Sub2_21.method4312(0, Static233.aClass328_1);
		} else {
			super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static379.aClass117_7);
			super.aClass44_Sub2_21.method4241(0, Static283.aClass328_5);
			super.aClass44_Sub2_21.method4267(2);
			super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static341.aClass117_4);
			super.aClass44_Sub2_21.method4241(0, Static283.aClass328_5);
			super.aClass44_Sub2_21.method4258(true, 1, Static283.aClass328_5, false);
			super.aClass44_Sub2_21.method4312(0, Static233.aClass328_1);
			super.aClass44_Sub2_21.method4265(super.aClass44_Sub2_21.anInterface16_3);
		}
		super.aClass44_Sub2_21.method4267(0);
		this.aBoolean625 = true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return true;
	}
}
