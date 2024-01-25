import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!rn;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[Lclient!gl;")
	private Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class17_Sub1(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean233) {
			this.aBoolean23 = arg0.anInt3799 < 3;
			@Pc(26) int local26 = this.aBoolean23 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local64 * local64 + local55 * local55 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(95) float local95;
						if (local89 == 0) {
							local95 = -local87;
						} else if (local89 == 1) {
							local95 = local87;
						} else if (local89 == 2) {
							local95 = local83;
						} else if (local89 == 3) {
							local95 = -local83;
						} else if (local89 == 4) {
							local95 = local79;
						} else {
							local95 = -local79;
						}
						@Pc(143) int local143;
						@Pc(152) int local152;
						@Pc(161) int local161;
						if (local95 > 0.0F) {
							local143 = (int) (Math.pow((double) local95, 96.0D) * (double) local26);
							local152 = (int) ((double) local26 * Math.pow((double) local95, 36.0D));
							local161 = (int) (Math.pow((double) local95, 12.0D) * (double) local26);
						} else {
							local161 = 0;
							local152 = 0;
							local143 = 0;
						}
						local34[local89][local40] = (byte) local143;
						local38[local89][local40] = (byte) local152;
						local30[local89][local40] = (byte) local161;
					}
					local40++;
				}
			}
			this.aClass3_Sub3Array1 = new Class3_Sub3[3];
			this.aClass3_Sub3Array1[0] = new Class3_Sub3(super.aClass39_Sub2_41, 6406, 64, false, local34, 6406);
			this.aClass3_Sub3Array1[1] = new Class3_Sub3(super.aClass39_Sub2_41, 6406, 64, false, local38, 6406);
			this.aClass3_Sub3Array1[2] = new Class3_Sub3(super.aClass39_Sub2_41, 6406, 64, false, local30, 6406);
			this.method545();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	private void method545() {
		this.aClass213_1 = new Class213(super.aClass39_Sub2_41, 2);
		this.aClass213_1.method4858(0);
		super.aClass39_Sub2_41.method3221(1);
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
		if (this.aBoolean23) {
			super.aClass39_Sub2_41.method3156(7681, 260);
			super.aClass39_Sub2_41.method3180(770, 0, 5890);
			super.aClass39_Sub2_41.method3210(34167, 0);
		} else {
			super.aClass39_Sub2_41.method3156(8448, 7681);
			super.aClass39_Sub2_41.method3180(768, 0, 34168);
			super.aClass39_Sub2_41.method3221(2);
			super.aClass39_Sub2_41.method3156(7681, 260);
			super.aClass39_Sub2_41.method3180(768, 0, 34168);
			super.aClass39_Sub2_41.method3180(770, 1, 34168);
			super.aClass39_Sub2_41.method3210(34167, 0);
		}
		super.aClass39_Sub2_41.method3221(0);
		this.aClass213_1.method4862();
		this.aClass213_1.method4858(1);
		super.aClass39_Sub2_41.method3221(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean23) {
			super.aClass39_Sub2_41.method3156(8448, 8448);
			super.aClass39_Sub2_41.method3180(768, 0, 5890);
			super.aClass39_Sub2_41.method3210(5890, 0);
		} else {
			super.aClass39_Sub2_41.method3156(8448, 8448);
			super.aClass39_Sub2_41.method3180(768, 0, 5890);
			super.aClass39_Sub2_41.method3221(2);
			super.aClass39_Sub2_41.method3156(8448, 8448);
			super.aClass39_Sub2_41.method3180(768, 0, 5890);
			super.aClass39_Sub2_41.method3180(768, 1, 34168);
			super.aClass39_Sub2_41.method3210(5890, 0);
		}
		super.aClass39_Sub2_41.method3221(0);
		this.aClass213_1.method4862();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub2_41.method3203(arg0);
		super.aClass39_Sub2_41.method3162(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		if (this.aBoolean24) {
			if (!this.aBoolean23) {
				super.aClass39_Sub2_41.method3221(2);
				super.aClass39_Sub2_41.method3203(null);
			}
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(null);
			super.aClass39_Sub2_41.method3221(0);
			this.aClass213_1.method4857('\u0001');
			this.aBoolean24 = false;
		} else {
			super.aClass39_Sub2_41.method3210(5890, 0);
		}
		super.aClass39_Sub2_41.method3156(8448, 8448);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_41.method3156(7681, 8448);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		if (this.aClass213_1 == null || !arg0) {
			super.aClass39_Sub2_41.method3210(34168, 0);
			return;
		}
		if (!this.aBoolean23) {
			super.aClass39_Sub2_41.method3221(2);
			super.aClass39_Sub2_41.method3203(super.aClass39_Sub2_41.bf);
			super.aClass39_Sub2_41.method3221(0);
		}
		this.aClass213_1.method4857('\u0000');
		this.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean24) {
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(this.aClass3_Sub3Array1[arg1 - 1]);
			super.aClass39_Sub2_41.method3221(0);
		}
	}
}
