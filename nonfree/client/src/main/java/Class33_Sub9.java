import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class33_Sub9 extends Class33 {

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!oi;")
	private Class261 aClass261_6;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!go;")
	private final Class130 aClass130_6;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!pu;")
	private final Class66_Sub3 aClass66_Sub3_1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!qfa;Lclient!go;)V")
	public Class33_Sub9(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class130 arg1) {
		super(arg0);
		this.aClass130_6 = arg1;
		this.method8857();
		this.aClass66_Sub3_1 = new Class66_Sub3(super.aClass137_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass66_Sub3_1.method6831();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		if (super.aClass137_Sub3_42.anInt8587 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass137_Sub3_42.anInt8587;
			super.aClass137_Sub3_42.method7095(1);
			Static577.aFloatArray82[1] = 0.0F;
			Static577.aFloatArray82[0] = 0.0F;
			Static577.aFloatArray82[3] = super.aClass137_Sub3_42.aFloat203 * local10 + 0.25F;
			Static577.aFloatArray82[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static577.aFloatArray82, 0);
			OpenGL.glPopMatrix();
			super.aClass137_Sub3_42.method7064((float) super.aClass137_Sub3_42.anInt8587, 0.5F);
			super.aClass137_Sub3_42.method7090(this.aClass66_Sub3_1);
			super.aClass137_Sub3_42.method7095(0);
		}
		this.aClass261_6.method6285('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
	private void method8857() {
		this.aClass261_6 = new Class261(super.aClass137_Sub3_42, 2);
		this.aClass261_6.method6286(0);
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7084(260, 7681);
		super.aClass137_Sub3_42.method7071(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass137_Sub3_42.method7095(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass130_6.aBoolean273) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass261_6.method6287();
		this.aClass261_6.method6286(1);
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7084(8448, 8448);
		super.aClass137_Sub3_42.method7071(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass137_Sub3_42.method7095(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass130_6.aBoolean273) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass261_6.method6287();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		this.aClass261_6.method6285('\u0001');
		if (super.aClass137_Sub3_42.anInt8587 > 0) {
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090((Class66) null);
			super.aClass137_Sub3_42.method7064(0.0F, 1.0F);
			super.aClass137_Sub3_42.method7095(0);
		}
		super.aClass137_Sub3_42.method7084(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass130_6.aBoolean273) {
				super.aClass137_Sub3_42.method7090(this.aClass130_6.aClass66_Sub2_1);
				Static577.aFloatArray82[2] = 0.0F;
				Static577.aFloatArray82[0] = 0.0F;
				Static577.aFloatArray82[3] = (float) (super.aClass137_Sub3_42.anInt8544 % 4000) / 4000.0F;
				Static577.aFloatArray82[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static577.aFloatArray82, 0);
			} else {
				@Pc(109) int local109 = super.aClass137_Sub3_42.anInt8544 % 4000 * 16 / 4000;
				super.aClass137_Sub3_42.method7090(this.aClass130_6.aClass66_Sub1Array3[local109]);
			}
		} else if (this.aClass130_6.aBoolean273) {
			super.aClass137_Sub3_42.method7090(this.aClass130_6.aClass66_Sub2_1);
			Static577.aFloatArray82[1] = 0.0F;
			Static577.aFloatArray82[3] = 0.0F;
			Static577.aFloatArray82[2] = 0.0F;
			Static577.aFloatArray82[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static577.aFloatArray82, 0);
		} else {
			super.aClass137_Sub3_42.method7090(this.aClass130_6.aClass66_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub3_42.method7084(8448, 260);
	}
}
