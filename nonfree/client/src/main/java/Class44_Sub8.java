import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class44_Sub8 extends Class44 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!u;")
	private Class326 aClass326_6;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!hm;")
	private final Class145 aClass145_6;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!lm;")
	private final Class114_Sub4 aClass114_Sub4_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!no;Lclient!hm;)V")
	public Class44_Sub8(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class145 arg1) {
		super(arg0);
		this.aClass145_6 = arg1;
		this.method6178();
		this.aClass114_Sub4_1 = new Class114_Sub4(super.aClass66_Sub3_38, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass114_Sub4_1.method4704();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
	private void method6178() {
		this.aClass326_6 = new Class326(super.aClass66_Sub3_38, 2);
		this.aClass326_6.method7293(0);
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5396(260, 7681);
		super.aClass66_Sub3_38.method5361(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass66_Sub3_38.method5381(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass145_6.aBoolean315) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass326_6.method7295();
		this.aClass326_6.method7293(1);
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5396(8448, 8448);
		super.aClass66_Sub3_38.method5361(768, 0, 5890);
		OpenGL.glDisable(3168);
		super.aClass66_Sub3_38.method5381(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass145_6.aBoolean315) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass326_6.method7295();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass145_6.aBoolean315) {
				super.aClass66_Sub3_38.method5382(this.aClass145_6.aClass114_Sub2_2);
				Static527.aFloatArray64[2] = 0.0F;
				Static527.aFloatArray64[3] = (float) (super.aClass66_Sub3_38.anInt6442 % 4000) / 4000.0F;
				Static527.aFloatArray64[0] = 0.0F;
				Static527.aFloatArray64[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static527.aFloatArray64, 0);
			} else {
				@Pc(67) int local67 = super.aClass66_Sub3_38.anInt6442 % 4000 * 16 / 4000;
				super.aClass66_Sub3_38.method5382(this.aClass145_6.aClass114_Sub1Array2[local67]);
			}
		} else if (this.aClass145_6.aBoolean315) {
			super.aClass66_Sub3_38.method5382(this.aClass145_6.aClass114_Sub2_2);
			Static527.aFloatArray64[1] = 0.0F;
			Static527.aFloatArray64[0] = 0.0F;
			Static527.aFloatArray64[2] = 0.0F;
			Static527.aFloatArray64[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static527.aFloatArray64, 0);
		} else {
			super.aClass66_Sub3_38.method5382(this.aClass145_6.aClass114_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		this.aClass326_6.method7292('\u0001');
		if (super.aClass66_Sub3_38.anInt6486 > 0) {
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(null);
			super.aClass66_Sub3_38.method5390(0.0F, 1.0F);
			super.aClass66_Sub3_38.method5381(0);
		}
		super.aClass66_Sub3_38.method5396(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		if (super.aClass66_Sub3_38.anInt6486 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass66_Sub3_38.anInt6486;
			super.aClass66_Sub3_38.method5381(1);
			Static527.aFloatArray64[3] = super.aClass66_Sub3_38.aFloat118 * local14 + 0.25F;
			Static527.aFloatArray64[2] = local14;
			Static527.aFloatArray64[1] = 0.0F;
			Static527.aFloatArray64[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static527.aFloatArray64, 0);
			OpenGL.glPopMatrix();
			super.aClass66_Sub3_38.method5390((float) super.aClass66_Sub3_38.anInt6486, 0.5F);
			super.aClass66_Sub3_38.method5382(this.aClass114_Sub4_1);
			super.aClass66_Sub3_38.method5381(0);
		}
		this.aClass326_6.method7292('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub3_38.method5396(8448, 260);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
	}
}
