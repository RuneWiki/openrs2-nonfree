import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class76_Sub8 extends Class76 {

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "Lclient!hg;")
	private Class136 aClass136_6;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!sda;")
	private final Class303 aClass303_5;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!bu;")
	private final Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ok;Lclient!sda;)V")
	public Class76_Sub8(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class303 arg1) {
		super(arg0);
		this.aClass303_5 = arg1;
		this.method7372();
		this.aClass40_Sub1_1 = new Class40_Sub1(super.aClass134_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass40_Sub1_1.method742();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass303_5.aBoolean616) {
				super.aClass134_Sub2_43.method5202(this.aClass303_5.aClass40_Sub2_2);
				Static414.aFloatArray43[2] = 0.0F;
				Static414.aFloatArray43[3] = (float) (super.aClass134_Sub2_43.anInt6551 % 4000) / 4000.0F;
				Static414.aFloatArray43[0] = 0.0F;
				Static414.aFloatArray43[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static414.aFloatArray43, 0);
			} else {
				@Pc(108) int local108 = super.aClass134_Sub2_43.anInt6551 % 4000 * 16 / 4000;
				super.aClass134_Sub2_43.method5202(this.aClass303_5.aClass40_Sub3Array3[local108]);
			}
		} else if (this.aClass303_5.aBoolean616) {
			super.aClass134_Sub2_43.method5202(this.aClass303_5.aClass40_Sub2_2);
			Static414.aFloatArray43[3] = 0.0F;
			Static414.aFloatArray43[2] = 0.0F;
			Static414.aFloatArray43[0] = 0.0F;
			Static414.aFloatArray43[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static414.aFloatArray43, 0);
		} else {
			super.aClass134_Sub2_43.method5202(this.aClass303_5.aClass40_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub2_43.method5224(260, 8448);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		this.aClass136_6.method2915('\u0001');
		if (super.aClass134_Sub2_43.anInt6562 > 0) {
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(null);
			super.aClass134_Sub2_43.method5257(1.0F, 0.0F);
			super.aClass134_Sub2_43.method5197(0);
		}
		super.aClass134_Sub2_43.method5224(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	private void method7372() {
		this.aClass136_6 = new Class136(super.aClass134_Sub2_43, 2);
		this.aClass136_6.method2920(0);
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5224(7681, 260);
		super.aClass134_Sub2_43.method5200(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass134_Sub2_43.method5197(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass303_5.aBoolean616) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass136_6.method2918();
		this.aClass136_6.method2920(1);
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5224(8448, 8448);
		super.aClass134_Sub2_43.method5200(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass134_Sub2_43.method5197(0);
		OpenGL.glTexEnvf(8960, 34163, (float) 1);
		if (this.aClass303_5.aBoolean616) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass136_6.method2918();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		if (super.aClass134_Sub2_43.anInt6562 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass134_Sub2_43.anInt6562;
			super.aClass134_Sub2_43.method5197(1);
			Static414.aFloatArray43[1] = 0.0F;
			Static414.aFloatArray43[3] = local13 * super.aClass134_Sub2_43.aFloat148 + 0.25F;
			Static414.aFloatArray43[0] = 0.0F;
			Static414.aFloatArray43[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static414.aFloatArray43, 0);
			OpenGL.glPopMatrix();
			super.aClass134_Sub2_43.method5257(0.5F, (float) super.aClass134_Sub2_43.anInt6562);
			super.aClass134_Sub2_43.method5202(this.aClass40_Sub1_1);
			super.aClass134_Sub2_43.method5197(0);
		}
		this.aClass136_6.method2915('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
	}
}
