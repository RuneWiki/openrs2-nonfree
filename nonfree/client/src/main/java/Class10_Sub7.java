import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "Lclient!bu;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Z")
	private boolean aBoolean429 = false;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "[Lclient!nn;")
	private Class65_Sub3[] aClass65_Sub3Array1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class10_Sub7(@OriginalArg(0) Class135_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean478) {
			this.aBoolean428 = arg0.anInt6801 < 3;
			@Pc(26) int local26 = this.aBoolean428 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local89;
						} else if (local91 == 1) {
							local98 = local89;
						} else if (local91 == 2) {
							local98 = local85;
						} else if (local91 == 3) {
							local98 = -local85;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(144) int local144;
						@Pc(143) int local143;
						@Pc(141) int local141;
						if (local98 > 0.0F) {
							local144 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local143 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local141 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local141 = 0;
							local143 = 0;
							local144 = 0;
						}
						local34[local91][local40] = (byte) local144;
						local38[local91][local40] = (byte) local143;
						local30[local91][local40] = (byte) local141;
					}
					local40++;
				}
			}
			this.aClass65_Sub3Array1 = new Class65_Sub3[3];
			this.aClass65_Sub3Array1[0] = new Class65_Sub3(super.aClass135_Sub2_41, 6406, 64, false, local34, 6406);
			this.aClass65_Sub3Array1[1] = new Class65_Sub3(super.aClass135_Sub2_41, 6406, 64, false, local38, 6406);
			this.aClass65_Sub3Array1[2] = new Class65_Sub3(super.aClass135_Sub2_41, 6406, 64, false, local30, 6406);
			this.method4909();
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
	private void method4909() {
		this.aClass32_4 = new Class32(super.aClass135_Sub2_41, 2);
		this.aClass32_4.method550(0);
		super.aClass135_Sub2_41.method5457(1);
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
		if (this.aBoolean428) {
			super.aClass135_Sub2_41.method5407(260, 7681);
			super.aClass135_Sub2_41.method5474(5890, 0, 770);
			super.aClass135_Sub2_41.method5425(0, 34167);
		} else {
			super.aClass135_Sub2_41.method5407(7681, 8448);
			super.aClass135_Sub2_41.method5474(34168, 0, 768);
			super.aClass135_Sub2_41.method5457(2);
			super.aClass135_Sub2_41.method5407(260, 7681);
			super.aClass135_Sub2_41.method5474(34168, 0, 768);
			super.aClass135_Sub2_41.method5474(34168, 1, 770);
			super.aClass135_Sub2_41.method5425(0, 34167);
		}
		super.aClass135_Sub2_41.method5457(0);
		this.aClass32_4.method548();
		this.aClass32_4.method550(1);
		super.aClass135_Sub2_41.method5457(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean428) {
			super.aClass135_Sub2_41.method5407(8448, 8448);
			super.aClass135_Sub2_41.method5474(5890, 0, 768);
			super.aClass135_Sub2_41.method5425(0, 5890);
		} else {
			super.aClass135_Sub2_41.method5407(8448, 8448);
			super.aClass135_Sub2_41.method5474(5890, 0, 768);
			super.aClass135_Sub2_41.method5457(2);
			super.aClass135_Sub2_41.method5407(8448, 8448);
			super.aClass135_Sub2_41.method5474(5890, 0, 768);
			super.aClass135_Sub2_41.method5474(34168, 1, 768);
			super.aClass135_Sub2_41.method5425(0, 5890);
		}
		super.aClass135_Sub2_41.method5457(0);
		this.aClass32_4.method548();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		if (this.aClass32_4 == null || !arg0) {
			super.aClass135_Sub2_41.method5425(0, 34168);
			return;
		}
		if (!this.aBoolean428) {
			super.aClass135_Sub2_41.method5457(2);
			super.aClass135_Sub2_41.method5458(super.aClass135_Sub2_41.aClass65_Sub2_5);
			super.aClass135_Sub2_41.method5457(0);
		}
		this.aClass32_4.method547('\u0000');
		this.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
		super.aClass135_Sub2_41.method5407(8448, 7681);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		if (this.aBoolean429) {
			if (!this.aBoolean428) {
				super.aClass135_Sub2_41.method5457(2);
				super.aClass135_Sub2_41.method5458(null);
			}
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(null);
			super.aClass135_Sub2_41.method5457(0);
			this.aClass32_4.method547('\u0001');
			this.aBoolean429 = false;
		} else {
			super.aClass135_Sub2_41.method5425(0, 5890);
		}
		super.aClass135_Sub2_41.method5407(8448, 8448);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean429) {
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(this.aClass65_Sub3Array1[arg0 - 1]);
			super.aClass135_Sub2_41.method5457(0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		super.aClass135_Sub2_41.method5458(arg0);
		super.aClass135_Sub2_41.method5441(arg1);
	}
}
