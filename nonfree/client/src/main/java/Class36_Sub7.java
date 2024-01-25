import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!iq;")
	private Class120 aClass120_5;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!ri;")
	private final Class212 aClass212_5;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!pa;")
	private final Class65_Sub4 aClass65_Sub4_1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!bo;Lclient!ri;)V")
	public Class36_Sub7(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class212 arg1) {
		super(arg0);
		this.aClass212_5 = arg1;
		this.method5661();
		this.aClass65_Sub4_1 = new Class65_Sub4(super.aClass26_Sub1_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass65_Sub4_1.method4268();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
		super.aClass26_Sub1_43.method695(260, 8448);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	private void method5661() {
		this.aClass120_5 = new Class120(super.aClass26_Sub1_43, 2);
		this.aClass120_5.method2784(0);
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method695(7681, 260);
		super.aClass26_Sub1_43.method646(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass26_Sub1_43.method696(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass212_5.aBoolean527) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass120_5.method2781();
		this.aClass120_5.method2784(1);
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method695(8448, 8448);
		super.aClass26_Sub1_43.method646(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass26_Sub1_43.method696(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass212_5.aBoolean527) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass120_5.method2781();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		if (super.aClass26_Sub1_43.anInt965 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass26_Sub1_43.anInt965;
			super.aClass26_Sub1_43.method696(1);
			Static108.aFloatArray17[0] = 0.0F;
			Static108.aFloatArray17[1] = 0.0F;
			Static108.aFloatArray17[3] = super.aClass26_Sub1_43.aFloat21 * local13 + 0.25F;
			Static108.aFloatArray17[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static108.aFloatArray17, 0);
			OpenGL.glPopMatrix();
			super.aClass26_Sub1_43.method636((float) super.aClass26_Sub1_43.anInt965, 0.5F);
			super.aClass26_Sub1_43.method673(this.aClass65_Sub4_1);
			super.aClass26_Sub1_43.method696(0);
		}
		this.aClass120_5.method2782('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass212_5.aBoolean527) {
				super.aClass26_Sub1_43.method673(this.aClass212_5.aClass65_Sub2_3);
				Static108.aFloatArray17[0] = 0.0F;
				Static108.aFloatArray17[2] = 0.0F;
				Static108.aFloatArray17[1] = 0.0F;
				Static108.aFloatArray17[3] = (float) (super.aClass26_Sub1_43.anInt925 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static108.aFloatArray17, 0);
			} else {
				@Pc(59) int local59 = super.aClass26_Sub1_43.anInt925 % 4000 * 16 / 4000;
				super.aClass26_Sub1_43.method673(this.aClass212_5.aClass65_Sub3Array2[local59]);
			}
		} else if (this.aClass212_5.aBoolean527) {
			super.aClass26_Sub1_43.method673(this.aClass212_5.aClass65_Sub2_3);
			Static108.aFloatArray17[0] = 0.0F;
			Static108.aFloatArray17[2] = 0.0F;
			Static108.aFloatArray17[3] = 0.0F;
			Static108.aFloatArray17[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static108.aFloatArray17, 0);
		} else {
			super.aClass26_Sub1_43.method673(this.aClass212_5.aClass65_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		this.aClass120_5.method2782('\u0001');
		if (super.aClass26_Sub1_43.anInt965 > 0) {
			super.aClass26_Sub1_43.method696(1);
			super.aClass26_Sub1_43.method673(null);
			super.aClass26_Sub1_43.method636(0.0F, 1.0F);
			super.aClass26_Sub1_43.method696(0);
		}
		super.aClass26_Sub1_43.method695(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
	}
}
