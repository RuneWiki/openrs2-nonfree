import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "[Lclient!jg;")
	private Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class21_Sub3(@OriginalArg(0) Class42_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean502) {
			this.aBoolean321 = arg0.anInt7129 < 3;
			@Pc(28) int local28 = this.aBoolean321 ? 48 : 127;
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
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local87;
						} else if (local93 == 1) {
							local105 = local87;
						} else if (local93 == 2) {
							local105 = local91;
						} else if (local93 == 3) {
							local105 = -local91;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local105 > 0.0F) {
							local152 = (int) (Math.pow((double) local105, 96.0D) * (double) local28);
							local161 = (int) ((double) local28 * Math.pow((double) local105, 36.0D));
							local170 = (int) (Math.pow((double) local105, 12.0D) * (double) local28);
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local36[local93][local42] = local152 << 24;
						local40[local93][local42] = local161 << 24;
						local32[local93][local42] = local170 << 24;
					}
					local42++;
				}
			}
			this.anInterface8Array1 = new Interface8[3];
			this.anInterface8Array1[0] = super.aClass42_Sub1_19.method5947(local36, 64, false);
			this.anInterface8Array1[1] = super.aClass42_Sub1_19.method5947(local40, 64, false);
			this.anInterface8Array1[2] = super.aClass42_Sub1_19.method5947(local32, 64, false);
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		if (this.aBoolean322) {
			super.aClass42_Sub1_19.method5915(1);
			super.aClass42_Sub1_19.method5868(null);
			super.aClass42_Sub1_19.method5972(Static166.aClass301_3);
			super.aClass42_Sub1_19.method5966();
			if (this.aBoolean321) {
				super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
				super.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
				super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
			} else {
				super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
				super.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
				super.aClass42_Sub1_19.method5915(2);
				super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
				super.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
				super.aClass42_Sub1_19.method5951(Static499.aClass302_4, 1);
				super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
				super.aClass42_Sub1_19.method5868(null);
			}
			super.aClass42_Sub1_19.method5915(0);
			this.aBoolean322 = false;
		} else {
			super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
		}
		super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		if (this.anInterface8Array1 == null || !arg0) {
			super.aClass42_Sub1_19.method5967(0, Static388.aClass302_3);
			return;
		}
		super.aClass42_Sub1_19.method5915(1);
		super.aClass42_Sub1_19.method5972(Static156.aClass301_2);
		@Pc(34) Class91_Sub2 local34 = super.aClass42_Sub1_19.method5903();
		local34.KA(1024);
		super.aClass42_Sub1_19.method5918(Static365.aClass299_4);
		if (this.aBoolean321) {
			super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static88.aClass129_1);
			super.aClass42_Sub1_19.method5983(true, false, 0, Static159.aClass302_1);
			super.aClass42_Sub1_19.method5967(0, Static388.aClass302_3);
		} else {
			super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static191.aClass129_3);
			super.aClass42_Sub1_19.method5951(Static499.aClass302_4, 0);
			super.aClass42_Sub1_19.method5915(2);
			super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static88.aClass129_1);
			super.aClass42_Sub1_19.method5951(Static499.aClass302_4, 0);
			super.aClass42_Sub1_19.method5983(true, false, 1, Static499.aClass302_4);
			super.aClass42_Sub1_19.method5967(0, Static388.aClass302_3);
			super.aClass42_Sub1_19.method5868(super.aClass42_Sub1_19.anInterface3_3);
		}
		super.aClass42_Sub1_19.method5915(0);
		this.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub1_19.method5868(arg0);
		super.aClass42_Sub1_19.method5979(arg1);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean322) {
			super.aClass42_Sub1_19.method5915(1);
			super.aClass42_Sub1_19.method5868(this.anInterface8Array1[arg1 - 1]);
			super.aClass42_Sub1_19.method5915(0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static506.aClass129_5);
	}
}
