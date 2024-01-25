import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "[Lclient!hea;")
	private Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class2_Sub3(@OriginalArg(0) Class78_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean639) {
			this.aBoolean205 = arg0.anInt8584 < 3;
			@Pc(28) int local28 = this.aBoolean205 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(100) float local100;
						if (local93 == 0) {
							local100 = -local91;
						} else if (local93 == 1) {
							local100 = local91;
						} else if (local93 == 2) {
							local100 = local87;
						} else if (local93 == 3) {
							local100 = -local87;
						} else if (local93 == 4) {
							local100 = local83;
						} else {
							local100 = -local83;
						}
						@Pc(149) int local149;
						@Pc(158) int local158;
						@Pc(167) int local167;
						if (local100 > 0.0F) {
							local149 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local158 = (int) ((double) local28 * Math.pow((double) local100, 36.0D));
							local167 = (int) (Math.pow((double) local100, 12.0D) * (double) local28);
						} else {
							local167 = 0;
							local158 = 0;
							local149 = 0;
						}
						local36[local93][local42] = local149 << 24;
						local40[local93][local42] = local158 << 24;
						local32[local93][local42] = local167 << 24;
					}
					local42++;
				}
			}
			this.anInterface11Array1 = new Interface11[3];
			this.anInterface11Array1[0] = super.aClass78_Sub1_23.method6935(false, local36, 64);
			this.anInterface11Array1[1] = super.aClass78_Sub1_23.method6935(false, local40, 64);
			this.anInterface11Array1[2] = super.aClass78_Sub1_23.method6935(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7894(@OriginalArg(0) boolean arg0) {
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static569.aClass118_4);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7902() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V")
	@Override
	public void method7899() {
		if (this.aBoolean204) {
			super.aClass78_Sub1_23.method6867(1);
			super.aClass78_Sub1_23.method6931(null);
			super.aClass78_Sub1_23.method6887(Static440.aClass260_4);
			super.aClass78_Sub1_23.method6920();
			if (this.aBoolean205) {
				super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
				super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
				super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
			} else {
				super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
				super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
				super.aClass78_Sub1_23.method6867(2);
				super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
				super.aClass78_Sub1_23.method6975(Static47.aClass148_1, 0);
				super.aClass78_Sub1_23.method6975(Static226.aClass148_3, 1);
				super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
				super.aClass78_Sub1_23.method6931(null);
			}
			super.aClass78_Sub1_23.method6867(0);
			this.aBoolean204 = false;
		} else {
			super.aClass78_Sub1_23.method6903(0, Static47.aClass148_1);
		}
		super.aClass78_Sub1_23.method6864(Static31.aClass118_1, Static31.aClass118_1);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!rga;I)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1) {
		super.aClass78_Sub1_23.method6931(arg1);
		super.aClass78_Sub1_23.method6943(arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean204) {
			super.aClass78_Sub1_23.method6867(1);
			super.aClass78_Sub1_23.method6931(this.anInterface11Array1[arg1 - 1]);
			super.aClass78_Sub1_23.method6867(0);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7901(@OriginalArg(0) boolean arg0) {
		if (this.anInterface11Array1 == null || !arg0) {
			super.aClass78_Sub1_23.method6903(0, Static155.aClass148_2);
			return;
		}
		super.aClass78_Sub1_23.method6867(1);
		super.aClass78_Sub1_23.method6887(Static104.aClass260_1);
		@Pc(23) Class34_Sub1 local23 = super.aClass78_Sub1_23.method6922();
		local23.oa(1024);
		super.aClass78_Sub1_23.method6909(Static34.aClass316_2);
		if (this.aBoolean205) {
			super.aClass78_Sub1_23.method6864(Static327.aClass118_2, Static569.aClass118_4);
			super.aClass78_Sub1_23.method6959(false, 0, true, Static47.aClass148_1);
			super.aClass78_Sub1_23.method6903(0, Static155.aClass148_2);
		} else {
			super.aClass78_Sub1_23.method6864(Static569.aClass118_4, Static31.aClass118_1);
			super.aClass78_Sub1_23.method6975(Static226.aClass148_3, 0);
			super.aClass78_Sub1_23.method6867(2);
			super.aClass78_Sub1_23.method6864(Static327.aClass118_2, Static569.aClass118_4);
			super.aClass78_Sub1_23.method6975(Static226.aClass148_3, 0);
			super.aClass78_Sub1_23.method6959(false, 1, true, Static226.aClass148_3);
			super.aClass78_Sub1_23.method6903(0, Static155.aClass148_2);
			super.aClass78_Sub1_23.method6931(super.aClass78_Sub1_23.anInterface20_3);
		}
		super.aClass78_Sub1_23.method6867(0);
		this.aBoolean204 = true;
	}
}
