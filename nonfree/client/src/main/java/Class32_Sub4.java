import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "[Lclient!pfa;")
	private Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class32_Sub4(@OriginalArg(0) Class31_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean612) {
			this.aBoolean445 = arg0.anInt9123 < 3;
			@Pc(28) int local28 = this.aBoolean445 ? 48 : 127;
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
						@Pc(102) float local102;
						if (local93 == 0) {
							local102 = -local91;
						} else if (local93 == 1) {
							local102 = local91;
						} else if (local93 == 2) {
							local102 = local87;
						} else if (local93 == 3) {
							local102 = -local87;
						} else if (local93 == 4) {
							local102 = local83;
						} else {
							local102 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local102 > 0.0F) {
							local148 = (int) (Math.pow((double) local102, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local102, 36.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local102, 12.0D));
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local36[local93][local42] = local148 << 24;
						local40[local93][local42] = local147 << 24;
						local32[local93][local42] = local145 << 24;
					}
					local42++;
				}
			}
			this.anInterface18Array1 = new Interface18[3];
			this.anInterface18Array1[0] = super.aClass31_Sub1_22.method7053(false, local36, 64);
			this.anInterface18Array1[1] = super.aClass31_Sub1_22.method7053(false, local40, 64);
			this.anInterface18Array1[2] = super.aClass31_Sub1_22.method7053(false, local32, 64);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		if (this.anInterface18Array1 == null || !arg0) {
			super.aClass31_Sub1_22.method7185(Static138.aClass179_11, 0);
			return;
		}
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7067(Static596.aClass273_4);
		@Pc(21) Class42_Sub3 local21 = super.aClass31_Sub1_22.method7146();
		local21.oa(1024);
		super.aClass31_Sub1_22.method7161(Static496.aClass51_17);
		if (this.aBoolean445) {
			super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static438.aClass266_2);
			super.aClass31_Sub1_22.method7083(Static402.aClass179_23, 0, false, true);
			super.aClass31_Sub1_22.method7185(Static138.aClass179_11, 0);
		} else {
			super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static514.aClass266_6);
			super.aClass31_Sub1_22.method7155(0, Static415.aClass179_24);
			super.aClass31_Sub1_22.method7092(2);
			super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static438.aClass266_2);
			super.aClass31_Sub1_22.method7155(0, Static415.aClass179_24);
			super.aClass31_Sub1_22.method7083(Static415.aClass179_24, 1, false, true);
			super.aClass31_Sub1_22.method7185(Static138.aClass179_11, 0);
			super.aClass31_Sub1_22.method7129(super.aClass31_Sub1_22.anInterface24_3);
		}
		super.aClass31_Sub1_22.method7092(0);
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		super.aClass31_Sub1_22.method7129(arg1);
		super.aClass31_Sub1_22.method7141(arg0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static486.aClass266_5);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return true;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean444) {
			super.aClass31_Sub1_22.method7092(1);
			super.aClass31_Sub1_22.method7129(this.anInterface18Array1[arg0 - 1]);
			super.aClass31_Sub1_22.method7092(0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		if (this.aBoolean444) {
			super.aClass31_Sub1_22.method7092(1);
			super.aClass31_Sub1_22.method7129(null);
			super.aClass31_Sub1_22.method7067(Static595.aClass273_3);
			super.aClass31_Sub1_22.method7120();
			if (this.aBoolean445) {
				super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
				super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
				super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
			} else {
				super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
				super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
				super.aClass31_Sub1_22.method7092(2);
				super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
				super.aClass31_Sub1_22.method7155(0, Static402.aClass179_23);
				super.aClass31_Sub1_22.method7155(1, Static415.aClass179_24);
				super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
				super.aClass31_Sub1_22.method7129(null);
			}
			super.aClass31_Sub1_22.method7092(0);
			this.aBoolean444 = false;
		} else {
			super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		}
		super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
	}
}
