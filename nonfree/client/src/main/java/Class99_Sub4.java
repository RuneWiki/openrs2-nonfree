import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class99_Sub4 extends Class99 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!bia;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!bb;")
	private final Class30 aClass30_2;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!u;")
	private final Class32_Sub4 aClass32_Sub4_1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!ffa;Lclient!bb;)V")
	public Class99_Sub4(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_2 = arg1;
		this.method5662();
		this.aClass32_Sub4_1 = new Class32_Sub4(super.aClass57_Sub2_38, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass32_Sub4_1.method8440();
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		this.aClass42_4.method758('\u0001');
		if (super.aClass57_Sub2_38.anInt2766 > 0) {
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362((Class32) null);
			super.aClass57_Sub2_38.method2304(1.0F, 0.0F);
			super.aClass57_Sub2_38.method2345(0);
		}
		super.aClass57_Sub2_38.method2313(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		if (super.aClass57_Sub2_38.anInt2766 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass57_Sub2_38.anInt2766;
			super.aClass57_Sub2_38.method2345(1);
			Static123.aFloatArray18[1] = 0.0F;
			Static123.aFloatArray18[0] = 0.0F;
			Static123.aFloatArray18[3] = local10 * super.aClass57_Sub2_38.aFloat51 + 0.25F;
			Static123.aFloatArray18[2] = local10;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static123.aFloatArray18, 0);
			OpenGL.glPopMatrix();
			super.aClass57_Sub2_38.method2304(0.5F, (float) super.aClass57_Sub2_38.anInt2766);
			super.aClass57_Sub2_38.method2362(this.aClass32_Sub4_1);
			super.aClass57_Sub2_38.method2345(0);
		}
		this.aClass42_4.method758('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, (float) 1);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
		super.aClass57_Sub2_38.method2313(8448, 260);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass30_2.aBoolean47) {
				super.aClass57_Sub2_38.method2362(this.aClass30_2.aClass32_Sub2_1);
				Static123.aFloatArray18[1] = 0.0F;
				Static123.aFloatArray18[2] = 0.0F;
				Static123.aFloatArray18[3] = (float) (super.aClass57_Sub2_38.anInt2750 % 4000) / 4000.0F;
				Static123.aFloatArray18[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static123.aFloatArray18, 0);
			} else {
				@Pc(71) int local71 = super.aClass57_Sub2_38.anInt2750 % 4000 * 16 / 4000;
				super.aClass57_Sub2_38.method2362(this.aClass30_2.aClass32_Sub1Array2[local71]);
			}
		} else if (this.aClass30_2.aBoolean47) {
			super.aClass57_Sub2_38.method2362(this.aClass30_2.aClass32_Sub2_1);
			Static123.aFloatArray18[1] = 0.0F;
			Static123.aFloatArray18[3] = 0.0F;
			Static123.aFloatArray18[0] = 0.0F;
			Static123.aFloatArray18[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static123.aFloatArray18, 0);
		} else {
			super.aClass57_Sub2_38.method2362(this.aClass30_2.aClass32_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	private void method5662() {
		this.aClass42_4 = new Class42(super.aClass57_Sub2_38, 2);
		this.aClass42_4.method759(0);
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2313(260, 7681);
		super.aClass57_Sub2_38.method2368(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass57_Sub2_38.method2345(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass30_2.aBoolean47) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass42_4.method760();
		this.aClass42_4.method759(1);
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2313(8448, 8448);
		super.aClass57_Sub2_38.method2368(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass57_Sub2_38.method2345(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass30_2.aBoolean47) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass42_4.method760();
	}
}
