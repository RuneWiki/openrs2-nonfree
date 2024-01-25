import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class60_Sub8 extends Class60 {

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
	private boolean aBoolean658;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "[Lclient!pj;")
	private Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class60_Sub8(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean563) {
			this.aBoolean658 = arg0.anInt7465 < 3;
			@Pc(28) int local28 = this.aBoolean658 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local91;
						} else if (local93 == 1) {
							local105 = local91;
						} else if (local93 == 2) {
							local105 = local87;
						} else if (local93 == 3) {
							local105 = -local87;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local105 > 0.0F) {
							local146 = (int) (Math.pow((double) local105, 96.0D) * (double) local28);
							local145 = (int) (Math.pow((double) local105, 36.0D) * (double) local28);
							local143 = (int) ((double) local28 * Math.pow((double) local105, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local36[local93][local42] = local146 << 24;
						local40[local93][local42] = local145 << 24;
						local32[local93][local42] = local143 << 24;
					}
					local42++;
				}
			}
			this.anInterface20Array1 = new Interface20[3];
			this.anInterface20Array1[0] = super.aClass16_Sub1_23.method6258(64, false, local36);
			this.anInterface20Array1[1] = super.aClass16_Sub1_23.method6258(64, false, local40);
			this.anInterface20Array1[2] = super.aClass16_Sub1_23.method6258(64, false, local32);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_23.method6197(arg0);
		super.aClass16_Sub1_23.method6233(arg1);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean659) {
			super.aClass16_Sub1_23.method6234(1);
			super.aClass16_Sub1_23.method6197(this.anInterface20Array1[arg0 - 1]);
			super.aClass16_Sub1_23.method6234(0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static458.aClass11_4);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		if (this.anInterface20Array1 == null || !arg0) {
			super.aClass16_Sub1_23.method6326(0, Static317.aClass188_3);
			return;
		}
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6282(Static95.aClass41_1);
		@Pc(27) Class25_Sub3 local27 = super.aClass16_Sub1_23.method6255();
		local27.method4285(1024);
		super.aClass16_Sub1_23.method6212(Static6.aClass20_1);
		if (this.aBoolean658) {
			super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static333.aClass11_3);
			super.aClass16_Sub1_23.method6277(Static70.aClass188_1, true, 0, false);
			super.aClass16_Sub1_23.method6326(0, Static317.aClass188_3);
		} else {
			super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static19.aClass11_1);
			super.aClass16_Sub1_23.method6284(Static622.aClass188_4, 0);
			super.aClass16_Sub1_23.method6234(2);
			super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static333.aClass11_3);
			super.aClass16_Sub1_23.method6284(Static622.aClass188_4, 0);
			super.aClass16_Sub1_23.method6277(Static622.aClass188_4, true, 1, false);
			super.aClass16_Sub1_23.method6326(0, Static317.aClass188_3);
			super.aClass16_Sub1_23.method6197(super.aClass16_Sub1_23.anInterface3_3);
		}
		super.aClass16_Sub1_23.method6234(0);
		this.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		if (this.aBoolean659) {
			super.aClass16_Sub1_23.method6234(1);
			super.aClass16_Sub1_23.method6197((Interface3) null);
			super.aClass16_Sub1_23.method6282(Static129.aClass41_2);
			super.aClass16_Sub1_23.method6226();
			if (this.aBoolean658) {
				super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
				super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
				super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
			} else {
				super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
				super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
				super.aClass16_Sub1_23.method6234(2);
				super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
				super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
				super.aClass16_Sub1_23.method6284(Static622.aClass188_4, 1);
				super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
				super.aClass16_Sub1_23.method6197((Interface3) null);
			}
			super.aClass16_Sub1_23.method6234(0);
			this.aBoolean659 = false;
		} else {
			super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
		}
		super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
	}
}
