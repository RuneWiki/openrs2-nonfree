import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class57_Sub4 extends Class57 {

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "Z")
	private boolean aBoolean423;

	@OriginalMember(owner = "client!iea", name = "v", descriptor = "[Lclient!td;")
	private Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class57_Sub4(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean381) {
			this.aBoolean423 = arg0.anInt4880 < 3;
			@Pc(28) int local28 = this.aBoolean423 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
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
							local172 = (int) (Math.pow((double) local103, 12.0D) * (double) local28);
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
			this.anInterface24Array1 = new Interface24[3];
			this.anInterface24Array1[0] = super.aClass5_Sub2_23.method3937(false, local36, 64);
			this.anInterface24Array1[1] = super.aClass5_Sub2_23.method3937(false, local40, 64);
			this.anInterface24Array1[2] = super.aClass5_Sub2_23.method3937(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		if (this.anInterface24Array1 == null || !arg0) {
			super.aClass5_Sub2_23.method3956(Static512.aClass80_3, 0);
			return;
		}
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method3967(Static609.aClass52_141);
		@Pc(36) Class115_Sub3 local36 = super.aClass5_Sub2_23.method3960();
		local36.method6297(1024);
		super.aClass5_Sub2_23.method4011(Static281.aClass272_4);
		if (this.aBoolean423) {
			super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static3.aClass144_1);
			super.aClass5_Sub2_23.method4029(0, true, Static522.aClass80_4, false);
			super.aClass5_Sub2_23.method3956(Static512.aClass80_3, 0);
		} else {
			super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static503.aClass144_4);
			super.aClass5_Sub2_23.method4054(0, Static115.aClass80_1);
			super.aClass5_Sub2_23.method3954(2);
			super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static3.aClass144_1);
			super.aClass5_Sub2_23.method4054(0, Static115.aClass80_1);
			super.aClass5_Sub2_23.method4029(1, true, Static115.aClass80_1, false);
			super.aClass5_Sub2_23.method3956(Static512.aClass80_3, 0);
			super.aClass5_Sub2_23.method4008(super.aClass5_Sub2_23.anInterface4_3);
		}
		super.aClass5_Sub2_23.method3954(0);
		this.aBoolean424 = true;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static438.aClass144_3);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		super.aClass5_Sub2_23.method4008(arg1);
		super.aClass5_Sub2_23.method4018(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (this.aBoolean424) {
			super.aClass5_Sub2_23.method3954(1);
			super.aClass5_Sub2_23.method4008((Interface4) null);
			super.aClass5_Sub2_23.method3967(Static190.aClass52_67);
			super.aClass5_Sub2_23.method3988();
			if (this.aBoolean423) {
				super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
				super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
				super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
			} else {
				super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
				super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
				super.aClass5_Sub2_23.method3954(2);
				super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
				super.aClass5_Sub2_23.method4054(0, Static522.aClass80_4);
				super.aClass5_Sub2_23.method4054(1, Static115.aClass80_1);
				super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
				super.aClass5_Sub2_23.method4008((Interface4) null);
			}
			super.aClass5_Sub2_23.method3954(0);
			this.aBoolean424 = false;
		} else {
			super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
		}
		super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean424) {
			super.aClass5_Sub2_23.method3954(1);
			super.aClass5_Sub2_23.method4008(this.anInterface24Array1[arg0 - 1]);
			super.aClass5_Sub2_23.method3954(0);
		}
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return true;
	}
}
