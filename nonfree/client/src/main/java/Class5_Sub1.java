import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Z")
	private boolean aBoolean16;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "[Lclient!df;")
	private Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class5_Sub1(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean546) {
			this.aBoolean16 = arg0.anInt7291 < 3;
			@Pc(28) int local28 = this.aBoolean16 ? 48 : 127;
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
						@Pc(153) int local153;
						@Pc(162) int local162;
						@Pc(171) int local171;
						if (local100 > 0.0F) {
							local153 = (int) (Math.pow((double) local100, 96.0D) * (double) local28);
							local162 = (int) ((double) local28 * Math.pow((double) local100, 36.0D));
							local171 = (int) ((double) local28 * Math.pow((double) local100, 12.0D));
						} else {
							local171 = 0;
							local162 = 0;
							local153 = 0;
						}
						local36[local93][local42] = local153 << 24;
						local40[local93][local42] = local162 << 24;
						local32[local93][local42] = local171 << 24;
					}
					local42++;
				}
			}
			this.anInterface4Array1 = new Interface4[3];
			this.anInterface4Array1[0] = super.aClass39_Sub2_20.method6147(64, false, local36);
			this.anInterface4Array1[1] = super.aClass39_Sub2_20.method6147(64, false, local40);
			this.anInterface4Array1[2] = super.aClass39_Sub2_20.method6147(64, false, local32);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static99.aClass165_2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass39_Sub2_20.method6179(arg1);
		super.aClass39_Sub2_20.method6164(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		if (this.anInterface4Array1 == null || !arg0) {
			super.aClass39_Sub2_20.method6085(Static463.aClass111_4, 0);
			return;
		}
		super.aClass39_Sub2_20.method6191(1);
		super.aClass39_Sub2_20.method6189(Static244.aClass316_2);
		@Pc(29) Class181_Sub2 local29 = super.aClass39_Sub2_20.method6133();
		local29.KA(1024);
		super.aClass39_Sub2_20.method6091(Static237.aClass224_3);
		if (this.aBoolean16) {
			super.aClass39_Sub2_20.method6093(Static420.aClass165_4, Static99.aClass165_2);
			super.aClass39_Sub2_20.method6119(Static132.aClass111_1, false, 0, true);
			super.aClass39_Sub2_20.method6085(Static463.aClass111_4, 0);
		} else {
			super.aClass39_Sub2_20.method6093(Static99.aClass165_2, Static389.aClass165_3);
			super.aClass39_Sub2_20.method6192(0, Static409.aClass111_3);
			super.aClass39_Sub2_20.method6191(2);
			super.aClass39_Sub2_20.method6093(Static420.aClass165_4, Static99.aClass165_2);
			super.aClass39_Sub2_20.method6192(0, Static409.aClass111_3);
			super.aClass39_Sub2_20.method6119(Static409.aClass111_3, false, 1, true);
			super.aClass39_Sub2_20.method6085(Static463.aClass111_4, 0);
			super.aClass39_Sub2_20.method6179(super.aClass39_Sub2_20.anInterface11_3);
		}
		super.aClass39_Sub2_20.method6191(0);
		this.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		if (this.aBoolean15) {
			super.aClass39_Sub2_20.method6191(1);
			super.aClass39_Sub2_20.method6179(null);
			super.aClass39_Sub2_20.method6189(Static139.aClass316_1);
			super.aClass39_Sub2_20.method6111();
			if (this.aBoolean16) {
				super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
				super.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
				super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
			} else {
				super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
				super.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
				super.aClass39_Sub2_20.method6191(2);
				super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
				super.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
				super.aClass39_Sub2_20.method6192(1, Static409.aClass111_3);
				super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
				super.aClass39_Sub2_20.method6179(null);
			}
			super.aClass39_Sub2_20.method6191(0);
			this.aBoolean15 = false;
		} else {
			super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
		}
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean15) {
			super.aClass39_Sub2_20.method6191(1);
			super.aClass39_Sub2_20.method6179(this.anInterface4Array1[arg1 - 1]);
			super.aClass39_Sub2_20.method6191(0);
		}
	}
}
