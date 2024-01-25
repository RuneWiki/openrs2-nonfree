import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class16_Sub6 extends Class16 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!fo;")
	private Class107 aClass107_4;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[Lclient!hw;")
	private Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class16_Sub6(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean23) {
			this.aBoolean563 = arg0.anInt388 < 3;
			@Pc(28) int local28 = this.aBoolean563 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(109) float local109;
						if (local93 == 0) {
							local109 = -local87;
						} else if (local93 == 1) {
							local109 = local87;
						} else if (local93 == 2) {
							local109 = local91;
						} else if (local93 == 3) {
							local109 = -local91;
						} else if (local93 == 4) {
							local109 = local83;
						} else {
							local109 = -local83;
						}
						@Pc(153) int local153;
						@Pc(162) int local162;
						@Pc(171) int local171;
						if (local109 > 0.0F) {
							local153 = (int) (Math.pow((double) local109, 96.0D) * (double) local28);
							local162 = (int) ((double) local28 * Math.pow((double) local109, 36.0D));
							local171 = (int) ((double) local28 * Math.pow((double) local109, 12.0D));
						} else {
							local171 = 0;
							local162 = 0;
							local153 = 0;
						}
						local36[local93][local42] = (byte) local153;
						local40[local93][local42] = (byte) local162;
						local32[local93][local42] = (byte) local171;
					}
					local42++;
				}
			}
			this.aClass2_Sub2Array1 = new Class2_Sub2[3];
			this.aClass2_Sub2Array1[0] = new Class2_Sub2(super.aClass5_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass2_Sub2Array1[1] = new Class2_Sub2(super.aClass5_Sub1_42, 6406, 64, false, local40, 6406);
			this.aClass2_Sub2Array1[2] = new Class2_Sub2(super.aClass5_Sub1_42, 6406, 64, false, local32, 6406);
			this.method5911();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean562) {
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352(this.aClass2_Sub2Array1[arg0 - 1]);
			super.aClass5_Sub1_42.method334(0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		if (this.aClass107_4 == null || !arg0) {
			super.aClass5_Sub1_42.method375(0, 34168);
			return;
		}
		if (!this.aBoolean563) {
			super.aClass5_Sub1_42.method334(2);
			super.aClass5_Sub1_42.method352(super.aClass5_Sub1_42.aClass2_Sub1_1);
			super.aClass5_Sub1_42.method334(0);
		}
		this.aClass107_4.method3156('\u0000');
		this.aBoolean562 = true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (this.aBoolean562) {
			if (!this.aBoolean563) {
				super.aClass5_Sub1_42.method334(2);
				super.aClass5_Sub1_42.method352((Class2) null);
			}
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352((Class2) null);
			super.aClass5_Sub1_42.method334(0);
			this.aClass107_4.method3156('\u0001');
			this.aBoolean562 = false;
		} else {
			super.aClass5_Sub1_42.method375(0, 5890);
		}
		super.aClass5_Sub1_42.method388(8448, 8448);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_42.method352(arg0);
		super.aClass5_Sub1_42.method385(arg1);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	private void method5911() {
		this.aClass107_4 = new Class107(super.aClass5_Sub1_42, 2);
		this.aClass107_4.method3155(0);
		super.aClass5_Sub1_42.method334(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean563) {
			super.aClass5_Sub1_42.method388(7681, 260);
			super.aClass5_Sub1_42.method329(0, 770, 5890);
			super.aClass5_Sub1_42.method375(0, 34167);
		} else {
			super.aClass5_Sub1_42.method388(8448, 7681);
			super.aClass5_Sub1_42.method329(0, 768, 34168);
			super.aClass5_Sub1_42.method334(2);
			super.aClass5_Sub1_42.method388(7681, 260);
			super.aClass5_Sub1_42.method329(0, 768, 34168);
			super.aClass5_Sub1_42.method329(1, 770, 34168);
			super.aClass5_Sub1_42.method375(0, 34167);
		}
		super.aClass5_Sub1_42.method334(0);
		this.aClass107_4.method3154();
		this.aClass107_4.method3155(1);
		super.aClass5_Sub1_42.method334(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean563) {
			super.aClass5_Sub1_42.method388(8448, 8448);
			super.aClass5_Sub1_42.method329(0, 768, 5890);
			super.aClass5_Sub1_42.method375(0, 5890);
		} else {
			super.aClass5_Sub1_42.method388(8448, 8448);
			super.aClass5_Sub1_42.method329(0, 768, 5890);
			super.aClass5_Sub1_42.method334(2);
			super.aClass5_Sub1_42.method388(8448, 8448);
			super.aClass5_Sub1_42.method329(0, 768, 5890);
			super.aClass5_Sub1_42.method329(1, 768, 34168);
			super.aClass5_Sub1_42.method375(0, 5890);
		}
		super.aClass5_Sub1_42.method334(0);
		this.aClass107_4.method3154();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_42.method388(7681, 8448);
	}
}
