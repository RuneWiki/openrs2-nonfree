import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class34_Sub7 extends Class34 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Z")
	private boolean aBoolean564 = false;

	@OriginalMember(owner = "client!tj", name = "v", descriptor = "Z")
	private boolean aBoolean565;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "[Lclient!js;")
	private Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class34_Sub7(@OriginalArg(0) Class90_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean638) {
			this.aBoolean565 = arg0.anInt9580 < 3;
			@Pc(28) int local28 = this.aBoolean565 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(107) float local107;
						if (local93 == 0) {
							local107 = -local91;
						} else if (local93 == 1) {
							local107 = local91;
						} else if (local93 == 2) {
							local107 = local87;
						} else if (local93 == 3) {
							local107 = -local87;
						} else if (local93 == 4) {
							local107 = local83;
						} else {
							local107 = -local83;
						}
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local107 > 0.0F) {
							local149 = (int) (Math.pow((double) local107, 96.0D) * (double) local28);
							local148 = (int) ((double) local28 * Math.pow((double) local107, 36.0D));
							local146 = (int) (Math.pow((double) local107, 12.0D) * (double) local28);
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
			this.anInterface10Array1 = new Interface10[3];
			this.anInterface10Array1[0] = super.aClass90_Sub3_19.method7657(local36, false, 64);
			this.anInterface10Array1[1] = super.aClass90_Sub3_19.method7657(local40, false, 64);
			this.anInterface10Array1[2] = super.aClass90_Sub3_19.method7657(local32, false, 64);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean564) {
			super.aClass90_Sub3_19.method7609(1);
			super.aClass90_Sub3_19.method7624(this.anInterface10Array1[arg1 - 1]);
			super.aClass90_Sub3_19.method7609(0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		if (this.aBoolean564) {
			super.aClass90_Sub3_19.method7609(1);
			super.aClass90_Sub3_19.method7624(null);
			super.aClass90_Sub3_19.method7655(Static386.aClass168_3);
			super.aClass90_Sub3_19.method7576();
			if (this.aBoolean565) {
				super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
				super.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
				super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
			} else {
				super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
				super.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
				super.aClass90_Sub3_19.method7609(2);
				super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
				super.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
				super.aClass90_Sub3_19.method7540(1, Static422.aClass150_7);
				super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
				super.aClass90_Sub3_19.method7624(null);
			}
			super.aClass90_Sub3_19.method7609(0);
			this.aBoolean564 = false;
		} else {
			super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
		}
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static140.aClass214_2);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		if (this.anInterface10Array1 == null || !arg0) {
			super.aClass90_Sub3_19.method7630(Static412.aClass150_8, 0);
			return;
		}
		super.aClass90_Sub3_19.method7609(1);
		super.aClass90_Sub3_19.method7655(Static464.aClass168_4);
		@Pc(21) Class93_Sub3 local21 = super.aClass90_Sub3_19.method7585();
		local21.XA(1024);
		super.aClass90_Sub3_19.method7580(Static524.aClass172_8);
		if (this.aBoolean565) {
			super.aClass90_Sub3_19.method7570(Static74.aClass214_1, Static140.aClass214_2);
			super.aClass90_Sub3_19.method7557(false, Static393.aClass150_6, true, 0);
			super.aClass90_Sub3_19.method7630(Static412.aClass150_8, 0);
		} else {
			super.aClass90_Sub3_19.method7570(Static140.aClass214_2, Static547.aClass214_5);
			super.aClass90_Sub3_19.method7540(0, Static422.aClass150_7);
			super.aClass90_Sub3_19.method7609(2);
			super.aClass90_Sub3_19.method7570(Static74.aClass214_1, Static140.aClass214_2);
			super.aClass90_Sub3_19.method7540(0, Static422.aClass150_7);
			super.aClass90_Sub3_19.method7557(false, Static422.aClass150_7, true, 1);
			super.aClass90_Sub3_19.method7630(Static412.aClass150_8, 0);
			super.aClass90_Sub3_19.method7624(super.aClass90_Sub3_19.anInterface3_3);
		}
		super.aClass90_Sub3_19.method7609(0);
		this.aBoolean564 = true;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7624(arg0);
		super.aClass90_Sub3_19.method7620(arg1);
	}
}
