import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!es", name = "n", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[Lclient!vea;")
	private Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class92_Sub1(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean610) {
			this.aBoolean142 = arg0.anInt8922 < 3;
			@Pc(28) int local28 = this.aBoolean142 ? 48 : 127;
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
						@Pc(118) float local118;
						if (local93 == 0) {
							local118 = -local87;
						} else if (local93 == 1) {
							local118 = local87;
						} else if (local93 == 2) {
							local118 = local91;
						} else if (local93 == 3) {
							local118 = -local91;
						} else if (local93 == 4) {
							local118 = local83;
						} else {
							local118 = -local83;
						}
						@Pc(153) int local153;
						@Pc(152) int local152;
						@Pc(150) int local150;
						if (local118 > 0.0F) {
							local153 = (int) ((double) local28 * Math.pow((double) local118, 96.0D));
							local152 = (int) (Math.pow((double) local118, 36.0D) * (double) local28);
							local150 = (int) (Math.pow((double) local118, 12.0D) * (double) local28);
						} else {
							local150 = 0;
							local152 = 0;
							local153 = 0;
						}
						local36[local93][local42] = local153 << 24;
						local40[local93][local42] = local152 << 24;
						local32[local93][local42] = local150 << 24;
					}
					local42++;
				}
			}
			this.anInterface22Array1 = new Interface22[3];
			this.anInterface22Array1[0] = super.aClass121_Sub2_20.method7288(false, 64, local36);
			this.anInterface22Array1[1] = super.aClass121_Sub2_20.method7288(false, 64, local40);
			this.anInterface22Array1[2] = super.aClass121_Sub2_20.method7288(false, 64, local32);
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		if (this.anInterface22Array1 == null || !arg0) {
			super.aClass121_Sub2_20.method7195(Static121.aClass305_2, 0);
			return;
		}
		super.aClass121_Sub2_20.method7245(1);
		super.aClass121_Sub2_20.method7241(Static414.aClass186_3);
		@Pc(21) Class34_Sub3 local21 = super.aClass121_Sub2_20.method7261();
		local21.XA(1024);
		super.aClass121_Sub2_20.method7181(Static268.aClass168_3);
		if (this.aBoolean142) {
			super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static570.aClass59_5);
			super.aClass121_Sub2_20.method7282(true, 0, false, Static67.aClass305_1);
			super.aClass121_Sub2_20.method7195(Static121.aClass305_2, 0);
		} else {
			super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static526.aClass59_4);
			super.aClass121_Sub2_20.method7270(Static197.aClass305_3, 0);
			super.aClass121_Sub2_20.method7245(2);
			super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static570.aClass59_5);
			super.aClass121_Sub2_20.method7270(Static197.aClass305_3, 0);
			super.aClass121_Sub2_20.method7282(true, 1, false, Static197.aClass305_3);
			super.aClass121_Sub2_20.method7195(Static121.aClass305_2, 0);
			super.aClass121_Sub2_20.method7167(super.aClass121_Sub2_20.anInterface3_3);
		}
		super.aClass121_Sub2_20.method7245(0);
		this.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean141) {
			super.aClass121_Sub2_20.method7245(1);
			super.aClass121_Sub2_20.method7167(this.anInterface22Array1[arg0 - 1]);
			super.aClass121_Sub2_20.method7245(0);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		if (this.aBoolean141) {
			super.aClass121_Sub2_20.method7245(1);
			super.aClass121_Sub2_20.method7167(null);
			super.aClass121_Sub2_20.method7241(Static374.aClass186_2);
			super.aClass121_Sub2_20.method7209();
			if (this.aBoolean142) {
				super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
				super.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
				super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
			} else {
				super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
				super.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
				super.aClass121_Sub2_20.method7245(2);
				super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
				super.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
				super.aClass121_Sub2_20.method7270(Static197.aClass305_3, 1);
				super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
				super.aClass121_Sub2_20.method7167(null);
			}
			super.aClass121_Sub2_20.method7245(0);
			this.aBoolean141 = false;
		} else {
			super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
		}
		super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass121_Sub2_20.method7167(arg1);
		super.aClass121_Sub2_20.method7266(arg0);
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return true;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static241.aClass59_1);
	}
}
