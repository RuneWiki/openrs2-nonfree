import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class7_Sub10 extends Class7 {

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "Z")
	private boolean aBoolean704 = false;

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "Z")
	private boolean aBoolean705;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "[Lclient!uia;")
	private Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class7_Sub10(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean629) {
			this.aBoolean705 = arg0.anInt8371 < 3;
			@Pc(28) int local28 = this.aBoolean705 ? 48 : 127;
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
						@Pc(150) int local150;
						@Pc(149) int local149;
						@Pc(147) int local147;
						if (local100 > 0.0F) {
							local150 = (int) ((double) local28 * Math.pow((double) local100, 96.0D));
							local149 = (int) ((double) local28 * Math.pow((double) local100, 36.0D));
							local147 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
						} else {
							local147 = 0;
							local149 = 0;
							local150 = 0;
						}
						local36[local93][local42] = local150 << 24;
						local40[local93][local42] = local149 << 24;
						local32[local93][local42] = local147 << 24;
					}
					local42++;
				}
			}
			this.anInterface23Array1 = new Interface23[3];
			this.anInterface23Array1[0] = super.aClass95_Sub3_23.method7043(64, local36, false);
			this.anInterface23Array1[1] = super.aClass95_Sub3_23.method7043(64, local40, false);
			this.anInterface23Array1[2] = super.aClass95_Sub3_23.method7043(64, local32, false);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static483.aClass136_6);
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		if (this.anInterface23Array1 == null || !arg0) {
			super.aClass95_Sub3_23.method7095(0, Static113.aClass291_2);
			return;
		}
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7046(Static376.aClass266_3);
		@Pc(27) Class177_Sub1 local27 = super.aClass95_Sub3_23.method7017();
		local27.method7880(1024);
		super.aClass95_Sub3_23.method7099(Static55.aClass85_2);
		if (this.aBoolean705) {
			super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static248.aClass136_4);
			super.aClass95_Sub3_23.method7028(0, true, Static634.aClass291_4, false);
			super.aClass95_Sub3_23.method7095(0, Static113.aClass291_2);
		} else {
			super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static225.aClass136_3);
			super.aClass95_Sub3_23.method7139(0, Static10.aClass291_1);
			super.aClass95_Sub3_23.method7145(2);
			super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static248.aClass136_4);
			super.aClass95_Sub3_23.method7139(0, Static10.aClass291_1);
			super.aClass95_Sub3_23.method7028(1, true, Static10.aClass291_1, false);
			super.aClass95_Sub3_23.method7095(0, Static113.aClass291_2);
			super.aClass95_Sub3_23.method7112(super.aClass95_Sub3_23.anInterface17_3);
		}
		super.aClass95_Sub3_23.method7145(0);
		this.aBoolean704 = true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean704) {
			super.aClass95_Sub3_23.method7145(1);
			super.aClass95_Sub3_23.method7112(this.anInterface23Array1[arg0 - 1]);
			super.aClass95_Sub3_23.method7145(0);
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		if (this.aBoolean704) {
			super.aClass95_Sub3_23.method7145(1);
			super.aClass95_Sub3_23.method7112(null);
			super.aClass95_Sub3_23.method7046(Static160.aClass266_2);
			super.aClass95_Sub3_23.method7105();
			if (this.aBoolean705) {
				super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
				super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
				super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
			} else {
				super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
				super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
				super.aClass95_Sub3_23.method7145(2);
				super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
				super.aClass95_Sub3_23.method7139(0, Static634.aClass291_4);
				super.aClass95_Sub3_23.method7139(1, Static10.aClass291_1);
				super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
				super.aClass95_Sub3_23.method7112(null);
			}
			super.aClass95_Sub3_23.method7145(0);
			this.aBoolean704 = false;
		} else {
			super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
		}
		super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass95_Sub3_23.method7112(arg1);
		super.aClass95_Sub3_23.method7026(arg0);
	}
}
