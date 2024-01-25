import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "Lclient!hea;")
	private Class131 aClass131_1;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "[Lclient!cn;")
	private Class35_Sub2[] aClass35_Sub2Array1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class52_Sub2(@OriginalArg(0) Class121_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean456) {
			this.aBoolean173 = arg0.anInt6813 < 3;
			@Pc(28) int local28 = this.aBoolean173 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local91;
						} else if (local93 == 1) {
							local103 = local91;
						} else if (local93 == 2) {
							local103 = local87;
						} else if (local93 == 3) {
							local103 = -local87;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local103 > 0.0F) {
							local151 = (int) ((double) local28 * Math.pow((double) local103, 96.0D));
							local150 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local148 = (int) (Math.pow((double) local103, 12.0D) * (double) local28);
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local36[local93][local42] = (byte) local151;
						local40[local93][local42] = (byte) local150;
						local32[local93][local42] = (byte) local148;
					}
					local42++;
				}
			}
			this.aClass35_Sub2Array1 = new Class35_Sub2[3];
			this.aClass35_Sub2Array1[0] = new Class35_Sub2(super.aClass121_Sub3_43, 6406, 64, false, local36, 6406);
			this.aClass35_Sub2Array1[1] = new Class35_Sub2(super.aClass121_Sub3_43, 6406, 64, false, local40, 6406);
			this.aClass35_Sub2Array1[2] = new Class35_Sub2(super.aClass121_Sub3_43, 6406, 64, false, local32, 6406);
			this.method2177();
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	private void method2177() {
		this.aClass131_1 = new Class131(super.aClass121_Sub3_43, 2);
		this.aClass131_1.method2755(0);
		super.aClass121_Sub3_43.method5648(1);
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
		if (this.aBoolean173) {
			super.aClass121_Sub3_43.method5659(7681, 260);
			super.aClass121_Sub3_43.method5685(770, 5890, 0);
			super.aClass121_Sub3_43.method5717(0, 34167);
		} else {
			super.aClass121_Sub3_43.method5659(8448, 7681);
			super.aClass121_Sub3_43.method5685(768, 34168, 0);
			super.aClass121_Sub3_43.method5648(2);
			super.aClass121_Sub3_43.method5659(7681, 260);
			super.aClass121_Sub3_43.method5685(768, 34168, 0);
			super.aClass121_Sub3_43.method5685(770, 34168, 1);
			super.aClass121_Sub3_43.method5717(0, 34167);
		}
		super.aClass121_Sub3_43.method5648(0);
		this.aClass131_1.method2754();
		this.aClass131_1.method2755(1);
		super.aClass121_Sub3_43.method5648(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean173) {
			super.aClass121_Sub3_43.method5659(8448, 8448);
			super.aClass121_Sub3_43.method5685(768, 5890, 0);
			super.aClass121_Sub3_43.method5717(0, 5890);
		} else {
			super.aClass121_Sub3_43.method5659(8448, 8448);
			super.aClass121_Sub3_43.method5685(768, 5890, 0);
			super.aClass121_Sub3_43.method5648(2);
			super.aClass121_Sub3_43.method5659(8448, 8448);
			super.aClass121_Sub3_43.method5685(768, 5890, 0);
			super.aClass121_Sub3_43.method5685(768, 34168, 1);
			super.aClass121_Sub3_43.method5717(0, 5890);
		}
		super.aClass121_Sub3_43.method5648(0);
		this.aClass131_1.method2754();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub3_43.method5659(7681, 8448);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub3_43.method5713(arg0);
		super.aClass121_Sub3_43.method5684(arg1);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean174) {
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(this.aClass35_Sub2Array1[arg0 - 1]);
			super.aClass121_Sub3_43.method5648(0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		if (this.aClass131_1 == null || !arg0) {
			super.aClass121_Sub3_43.method5717(0, 34168);
			return;
		}
		if (!this.aBoolean173) {
			super.aClass121_Sub3_43.method5648(2);
			super.aClass121_Sub3_43.method5713(super.aClass121_Sub3_43.aClass35_Sub3_4);
			super.aClass121_Sub3_43.method5648(0);
		}
		this.aClass131_1.method2752('\u0000');
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		if (this.aBoolean174) {
			if (!this.aBoolean173) {
				super.aClass121_Sub3_43.method5648(2);
				super.aClass121_Sub3_43.method5713(null);
			}
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(null);
			super.aClass121_Sub3_43.method5648(0);
			this.aClass131_1.method2752('\u0001');
			this.aBoolean174 = false;
		} else {
			super.aClass121_Sub3_43.method5717(0, 5890);
		}
		super.aClass121_Sub3_43.method5659(8448, 8448);
	}
}
