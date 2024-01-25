import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "Lclient!bu;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "Lclient!pl;")
	private final Class198 aClass198_5;

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "Lclient!sf;")
	private final Class65_Sub4 aClass65_Sub4_1;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ug;Lclient!pl;)V")
	public Class10_Sub8(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_5 = arg1;
		this.method5244();
		this.aClass65_Sub4_1 = new Class65_Sub4(super.aClass135_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass65_Sub4_1.method4774();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		this.aClass32_5.method547('\u0001');
		if (super.aClass135_Sub2_41.anInt6807 > 0) {
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(null);
			super.aClass135_Sub2_41.method5468(1.0F, 0.0F);
			super.aClass135_Sub2_41.method5457(0);
		}
		super.aClass135_Sub2_41.method5407(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	private void method5244() {
		this.aClass32_5 = new Class32(super.aClass135_Sub2_41, 2);
		this.aClass32_5.method550(0);
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5407(7681, 260);
		super.aClass135_Sub2_41.method5474(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass135_Sub2_41.method5457(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass198_5.aBoolean363) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass32_5.method548();
		this.aClass32_5.method550(1);
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5407(8448, 8448);
		super.aClass135_Sub2_41.method5474(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass135_Sub2_41.method5457(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass198_5.aBoolean363) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass32_5.method548();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		if (super.aClass135_Sub2_41.anInt6807 > 0) {
			@Pc(17) float local17 = -0.5F / (float) super.aClass135_Sub2_41.anInt6807;
			super.aClass135_Sub2_41.method5457(1);
			Static295.aFloatArray15[2] = local17;
			Static295.aFloatArray15[3] = local17 * super.aClass135_Sub2_41.aFloat79 + 0.25F;
			Static295.aFloatArray15[1] = 0.0F;
			Static295.aFloatArray15[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static295.aFloatArray15, 0);
			OpenGL.glPopMatrix();
			super.aClass135_Sub2_41.method5468(0.5F, (float) super.aClass135_Sub2_41.anInt6807);
			super.aClass135_Sub2_41.method5458(this.aClass65_Sub4_1);
			super.aClass135_Sub2_41.method5457(0);
		}
		this.aClass32_5.method547('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass198_5.aBoolean363) {
				super.aClass135_Sub2_41.method5458(this.aClass198_5.aClass65_Sub1_3);
				Static295.aFloatArray15[0] = 0.0F;
				Static295.aFloatArray15[3] = (float) (super.aClass135_Sub2_41.anInt6779 % 4000) / 4000.0F;
				Static295.aFloatArray15[2] = 0.0F;
				Static295.aFloatArray15[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static295.aFloatArray15, 0);
			} else {
				@Pc(59) int local59 = super.aClass135_Sub2_41.anInt6779 % 4000 * 16 / 4000;
				super.aClass135_Sub2_41.method5458(this.aClass198_5.aClass65_Sub2Array1[local59]);
			}
		} else if (this.aClass198_5.aBoolean363) {
			super.aClass135_Sub2_41.method5458(this.aClass198_5.aClass65_Sub1_3);
			Static295.aFloatArray15[2] = 0.0F;
			Static295.aFloatArray15[1] = 0.0F;
			Static295.aFloatArray15[3] = 0.0F;
			Static295.aFloatArray15[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static295.aFloatArray15, 0);
		} else {
			super.aClass135_Sub2_41.method5458(this.aClass198_5.aClass65_Sub2Array1[0]);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
		super.aClass135_Sub2_41.method5407(260, 8448);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}
}
