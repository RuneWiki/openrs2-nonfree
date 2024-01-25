import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "Lclient!eaa;")
	private Class79 aClass79_2;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "Lclient!ud;")
	private final Class335 aClass335_3;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "Lclient!ffa;")
	private final Class24_Sub4 aClass24_Sub4_1;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!vj;Lclient!ud;)V")
	public Class46_Sub3(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class335 arg1) {
		super(arg0);
		this.aClass335_3 = arg1;
		this.method2947();
		this.aClass24_Sub4_1 = new Class24_Sub4(super.aClass45_Sub3_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass24_Sub4_1.method2807();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
	private void method2947() {
		this.aClass79_2 = new Class79(super.aClass45_Sub3_40, 2);
		this.aClass79_2.method1921(0);
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7491(7681, 260);
		super.aClass45_Sub3_40.method7507(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass45_Sub3_40.method7510(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass335_3.aBoolean649) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass79_2.method1925();
		this.aClass79_2.method1921(1);
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7491(8448, 8448);
		super.aClass45_Sub3_40.method7507(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass45_Sub3_40.method7510(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass335_3.aBoolean649) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass79_2.method1925();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
		super.aClass45_Sub3_40.method7491(260, 8448);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass335_3.aBoolean649) {
				super.aClass45_Sub3_40.method7475(this.aClass335_3.aClass24_Sub2_2);
				Static504.aFloatArray89[3] = (float) (super.aClass45_Sub3_40.anInt9042 % 4000) / 4000.0F;
				Static504.aFloatArray89[2] = 0.0F;
				Static504.aFloatArray89[1] = 0.0F;
				Static504.aFloatArray89[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static504.aFloatArray89, 0);
			} else {
				@Pc(75) int local75 = super.aClass45_Sub3_40.anInt9042 % 4000 * 16 / 4000;
				super.aClass45_Sub3_40.method7475(this.aClass335_3.aClass24_Sub1Array3[local75]);
			}
		} else if (this.aClass335_3.aBoolean649) {
			super.aClass45_Sub3_40.method7475(this.aClass335_3.aClass24_Sub2_2);
			Static504.aFloatArray89[1] = 0.0F;
			Static504.aFloatArray89[3] = 0.0F;
			Static504.aFloatArray89[2] = 0.0F;
			Static504.aFloatArray89[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static504.aFloatArray89, 0);
		} else {
			super.aClass45_Sub3_40.method7475(this.aClass335_3.aClass24_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		if (super.aClass45_Sub3_40.anInt9085 > 0) {
			@Pc(21) float local21 = -0.5F / (float) super.aClass45_Sub3_40.anInt9085;
			super.aClass45_Sub3_40.method7510(1);
			Static504.aFloatArray89[0] = 0.0F;
			Static504.aFloatArray89[1] = 0.0F;
			Static504.aFloatArray89[2] = local21;
			Static504.aFloatArray89[3] = local21 * super.aClass45_Sub3_40.aFloat188 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static504.aFloatArray89, 0);
			OpenGL.glPopMatrix();
			super.aClass45_Sub3_40.method7473((float) super.aClass45_Sub3_40.anInt9085, 0.5F);
			super.aClass45_Sub3_40.method7475(this.aClass24_Sub4_1);
			super.aClass45_Sub3_40.method7510(0);
		}
		this.aClass79_2.method1924('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		this.aClass79_2.method1924('\u0001');
		if (super.aClass45_Sub3_40.anInt9085 > 0) {
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(null);
			super.aClass45_Sub3_40.method7473(0.0F, 1.0F);
			super.aClass45_Sub3_40.method7510(0);
		}
		super.aClass45_Sub3_40.method7491(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
