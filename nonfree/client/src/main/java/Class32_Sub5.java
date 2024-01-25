import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class32_Sub5 extends Class32 {

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "[Lclient!fp;")
	private Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class32_Sub5(@OriginalArg(0) Class132_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean638) {
			this.aBoolean200 = arg0.anInt8996 < 3;
			@Pc(28) int local28 = this.aBoolean200 ? 48 : 127;
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
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local103 > 0.0F) {
							local149 = (int) ((double) local28 * Math.pow((double) local103, 96.0D));
							local148 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local146 = (int) (Math.pow((double) local103, 12.0D) * (double) local28);
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
			this.anInterface9Array1 = new Interface9[3];
			this.anInterface9Array1[0] = super.aClass132_Sub1_21.method7528(false, 64, local36);
			this.anInterface9Array1[1] = super.aClass132_Sub1_21.method7528(false, 64, local40);
			this.anInterface9Array1[2] = super.aClass132_Sub1_21.method7528(false, 64, local32);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static320.aClass322_5);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass132_Sub1_21.method7635(arg1);
		super.aClass132_Sub1_21.method7652(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean199) {
			super.aClass132_Sub1_21.method7616(1);
			super.aClass132_Sub1_21.method7635(this.anInterface9Array1[arg0 - 1]);
			super.aClass132_Sub1_21.method7616(0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		if (this.anInterface9Array1 == null || !arg0) {
			super.aClass132_Sub1_21.method7598(0, Static568.aClass378_2);
			return;
		}
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7577(Static534.aClass305_3);
		@Pc(26) Class207_Sub3 local26 = super.aClass132_Sub1_21.method7613();
		local26.method8202(1024);
		super.aClass132_Sub1_21.method7618(Static336.aClass257_5);
		if (this.aBoolean200) {
			super.aClass132_Sub1_21.method7637(Static116.aClass322_2, Static320.aClass322_5);
			super.aClass132_Sub1_21.method7612(false, 0, Static368.aClass378_1, true);
			super.aClass132_Sub1_21.method7598(0, Static568.aClass378_2);
		} else {
			super.aClass132_Sub1_21.method7637(Static320.aClass322_5, Static131.aClass322_3);
			super.aClass132_Sub1_21.method7552(Static648.aClass378_4, 0);
			super.aClass132_Sub1_21.method7616(2);
			super.aClass132_Sub1_21.method7637(Static116.aClass322_2, Static320.aClass322_5);
			super.aClass132_Sub1_21.method7552(Static648.aClass378_4, 0);
			super.aClass132_Sub1_21.method7612(false, 1, Static648.aClass378_4, true);
			super.aClass132_Sub1_21.method7598(0, Static568.aClass378_2);
			super.aClass132_Sub1_21.method7635(super.aClass132_Sub1_21.anInterface17_3);
		}
		super.aClass132_Sub1_21.method7616(0);
		this.aBoolean199 = true;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		if (this.aBoolean199) {
			super.aClass132_Sub1_21.method7616(1);
			super.aClass132_Sub1_21.method7635((Interface17) null);
			super.aClass132_Sub1_21.method7577(Static357.aClass305_1);
			super.aClass132_Sub1_21.method7520();
			if (this.aBoolean200) {
				super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
				super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
				super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
			} else {
				super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
				super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
				super.aClass132_Sub1_21.method7616(2);
				super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
				super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
				super.aClass132_Sub1_21.method7552(Static648.aClass378_4, 1);
				super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
				super.aClass132_Sub1_21.method7635((Interface17) null);
			}
			super.aClass132_Sub1_21.method7616(0);
			this.aBoolean199 = false;
		} else {
			super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
		}
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
	}
}
