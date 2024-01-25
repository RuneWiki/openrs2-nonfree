import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class42_Sub6 extends Class42 {

	@OriginalMember(owner = "client!qaa", name = "n", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!qaa", name = "m", descriptor = "Z")
	private boolean aBoolean504;

	@OriginalMember(owner = "client!qaa", name = "o", descriptor = "[Lclient!mca;")
	private Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class42_Sub6(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean486) {
			this.aBoolean504 = arg0.anInt6699 < 3;
			@Pc(28) int local28 = this.aBoolean504 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
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
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local103 > 0.0F) {
							local151 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local150 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local148 = (int) (Math.pow((double) local103, 12.0D) * (double) local28);
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local36[local93][local42] = local151 << 24;
						local40[local93][local42] = local150 << 24;
						local32[local93][local42] = local148 << 24;
					}
					local42++;
				}
			}
			this.anInterface7Array1 = new Interface7[3];
			this.anInterface7Array1[0] = super.aClass122_Sub2_16.method5631(64, local36, false);
			this.anInterface7Array1[1] = super.aClass122_Sub2_16.method5631(64, local40, false);
			this.anInterface7Array1[2] = super.aClass122_Sub2_16.method5631(64, local32, false);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass122_Sub2_16.method5651(arg1);
		super.aClass122_Sub2_16.method5561(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		if (this.aBoolean505) {
			super.aClass122_Sub2_16.method5644(1);
			super.aClass122_Sub2_16.method5651(null);
			super.aClass122_Sub2_16.method5655(Static193.aClass79_11);
			super.aClass122_Sub2_16.method5614();
			if (this.aBoolean504) {
				super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
				super.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
				super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
			} else {
				super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
				super.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
				super.aClass122_Sub2_16.method5644(2);
				super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
				super.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
				super.aClass122_Sub2_16.method5575(1, Static295.aClass181_3);
				super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
				super.aClass122_Sub2_16.method5651(null);
			}
			super.aClass122_Sub2_16.method5644(0);
			this.aBoolean505 = false;
		} else {
			super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
		}
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean505) {
			super.aClass122_Sub2_16.method5644(1);
			super.aClass122_Sub2_16.method5651(this.anInterface7Array1[arg1 - 1]);
			super.aClass122_Sub2_16.method5644(0);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		if (this.anInterface7Array1 == null || !arg0) {
			super.aClass122_Sub2_16.method5585(Static30.aClass181_1, 0);
			return;
		}
		super.aClass122_Sub2_16.method5644(1);
		super.aClass122_Sub2_16.method5655(Static431.aClass79_12);
		@Pc(28) Class118_Sub3 local28 = super.aClass122_Sub2_16.method5574();
		local28.KA(1024);
		super.aClass122_Sub2_16.method5612(Static132.aClass110_3);
		if (this.aBoolean504) {
			super.aClass122_Sub2_16.method5605(Static39.aClass271_1, Static486.aClass271_5);
			super.aClass122_Sub2_16.method5678(Static162.aClass181_2, false, true, 0);
			super.aClass122_Sub2_16.method5585(Static30.aClass181_1, 0);
		} else {
			super.aClass122_Sub2_16.method5605(Static486.aClass271_5, Static449.aClass271_4);
			super.aClass122_Sub2_16.method5575(0, Static295.aClass181_3);
			super.aClass122_Sub2_16.method5644(2);
			super.aClass122_Sub2_16.method5605(Static39.aClass271_1, Static486.aClass271_5);
			super.aClass122_Sub2_16.method5575(0, Static295.aClass181_3);
			super.aClass122_Sub2_16.method5678(Static295.aClass181_3, false, true, 1);
			super.aClass122_Sub2_16.method5585(Static30.aClass181_1, 0);
			super.aClass122_Sub2_16.method5651(super.aClass122_Sub2_16.anInterface15_3);
		}
		super.aClass122_Sub2_16.method5644(0);
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static486.aClass271_5);
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return true;
	}
}
